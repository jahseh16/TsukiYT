package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class ConfigCacheClient {
    static final long DISK_READ_TIMEOUT_IN_SECONDS = 5;

    @Nullable
    private Task<ConfigContainer> cachedContainerTask = null;
    private final Executor executor;
    private final ConfigStorageClient storageClient;
    private static final Map<String, ConfigCacheClient> clientInstances = new HashMap();
    private static final Executor DIRECT_EXECUTOR = new Executor() { // from class: cr.f
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    public static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        private final CountDownLatch latch;

        private AwaitListener() {
            this.latch = new CountDownLatch(1);
        }

        public void await() throws InterruptedException {
            this.latch.await();
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.latch.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@NonNull Exception exc) {
            this.latch.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.latch.countDown();
        }

        public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.latch.await(j, timeUnit);
        }
    }

    private ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.executor = executor;
        this.storageClient = configStorageClient;
    }

    private static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = DIRECT_EXECUTOR;
        task.addOnSuccessListener(executor, awaitListener);
        task.addOnFailureListener(executor, awaitListener);
        task.addOnCanceledListener(executor, awaitListener);
        if (!awaitListener.await(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized void clearInstancesForTest() {
        clientInstances.clear();
    }

    public static synchronized ConfigCacheClient getInstance(Executor executor, ConfigStorageClient configStorageClient) {
        String fileName;
        Map<String, ConfigCacheClient> map;
        try {
            fileName = configStorageClient.getFileName();
            map = clientInstances;
            if (!map.containsKey(fileName)) {
                map.put(fileName, new ConfigCacheClient(executor, configStorageClient));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(fileName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$put$0(ConfigContainer configContainer) throws Exception {
        return this.storageClient.write(configContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$put$1(boolean z, ConfigContainer configContainer, Void r3) throws Exception {
        if (z) {
            updateInMemoryConfigContainer(configContainer);
        }
        return Tasks.forResult(configContainer);
    }

    private synchronized void updateInMemoryConfigContainer(ConfigContainer configContainer) {
        this.cachedContainerTask = Tasks.forResult(configContainer);
    }

    public void clear() {
        synchronized (this) {
            this.cachedContainerTask = Tasks.forResult(null);
        }
        this.storageClient.clear();
    }

    public synchronized Task<ConfigContainer> get() {
        try {
            Task<ConfigContainer> task = this.cachedContainerTask;
            if (task == null || (task.isComplete() && !this.cachedContainerTask.isSuccessful())) {
                Executor executor = this.executor;
                final ConfigStorageClient configStorageClient = this.storageClient;
                Objects.requireNonNull(configStorageClient);
                this.cachedContainerTask = Tasks.call(executor, new Callable() { // from class: j6.gv
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return configStorageClient.read();
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.cachedContainerTask;
    }

    @Nullable
    public ConfigContainer getBlocking() {
        return getBlocking(DISK_READ_TIMEOUT_IN_SECONDS);
    }

    @Nullable
    public synchronized Task<ConfigContainer> getCachedContainerTask() {
        return this.cachedContainerTask;
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer) {
        return put(configContainer, true);
    }

    @Nullable
    public ConfigContainer getBlocking(long j) {
        synchronized (this) {
            try {
                Task<ConfigContainer> task = this.cachedContainerTask;
                if (task != null && task.isSuccessful()) {
                    return this.cachedContainerTask.getResult();
                }
                try {
                    return (ConfigContainer) await(get(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                    Log.d(FirebaseRemoteConfig.TAG, "Reading from storage file failed.", e4);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task<ConfigContainer> put(final ConfigContainer configContainer, final boolean z) {
        return Tasks.call(this.executor, new Callable() { // from class: j6.n3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.y.lambda$put$0(configContainer);
            }
        }).onSuccessTask(this.executor, new SuccessContinuation() { // from class: j6.zn
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.y.lambda$put$1(z, configContainer, (Void) obj);
            }
        });
    }
}
