package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class DelegatingScheduledExecutorService implements ScheduledExecutorService {
    private final ExecutorService delegate;
    private final ScheduledExecutorService scheduler;

    public DelegatingScheduledExecutorService(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.delegate = executorService;
        this.scheduler = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schedule$0(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
            completer.set(null);
        } catch (Exception e4) {
            completer.setException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$schedule$1(final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.s
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.lambda$schedule$0(runnable, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$schedule$2(final Runnable runnable, long j, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.schedule(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                this.y.lambda$schedule$1(runnable, completer);
            }
        }, j, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schedule$3(Callable callable, DelegatingScheduledFuture.Completer completer) {
        try {
            completer.set(callable.call());
        } catch (Exception e4) {
            completer.setException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Future lambda$schedule$4(final Callable callable, final DelegatingScheduledFuture.Completer completer) throws Exception {
        return this.delegate.submit(new Runnable() { // from class: com.google.firebase.concurrent.f
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.lambda$schedule$3(callable, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$schedule$5(final Callable callable, long j, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.schedule(new Callable() { // from class: com.google.firebase.concurrent.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.y.lambda$schedule$4(callable, completer);
            }
        }, j, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scheduleAtFixedRate$6(Runnable runnable, DelegatingScheduledFuture.Completer completer) throws Exception {
        try {
            runnable.run();
        } catch (Exception e4) {
            completer.setException(e4);
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleAtFixedRate$7(final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.tl
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(runnable, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$scheduleAtFixedRate$8(final Runnable runnable, long j, long j4, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.v
            @Override // java.lang.Runnable
            public final void run() {
                this.y.lambda$scheduleAtFixedRate$7(runnable, completer);
            }
        }, j, j4, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleWithFixedDelay$10(final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.zn
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(runnable, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$scheduleWithFixedDelay$11(final Runnable runnable, long j, long j4, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.gv
            @Override // java.lang.Runnable
            public final void run() {
                this.y.lambda$scheduleWithFixedDelay$10(runnable, completer);
            }
        }, j, j4, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scheduleWithFixedDelay$9(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e4) {
            completer.setException(e4);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.delegate.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.n3
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                return this.y.lambda$schedule$2(runnable, j, timeUnit, completer);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j4, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.fb
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                return this.y.lambda$scheduleAtFixedRate$8(runnable, j, j4, timeUnit, completer);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j4, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.c5
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                return this.y.lambda$scheduleWithFixedDelay$11(runnable, j, j4, timeUnit, completer);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.delegate.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.delegate.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.i9
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                return this.y.lambda$schedule$5(callable, j, timeUnit, completer);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t3) {
        return this.delegate.submit(runnable, t3);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.delegate.submit(runnable);
    }
}
