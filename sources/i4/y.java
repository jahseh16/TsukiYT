package i4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import s4.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class y<V> implements a<V> {
    static final n3 ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;

    @Nullable
    volatile v listeners;

    @Nullable
    volatile Object value;

    @Nullable
    volatile c5 waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(y.class.getName());

    static {
        a sVar;
        try {
            sVar = new a(AtomicReferenceFieldUpdater.newUpdater(c5.class, Thread.class, "y"), AtomicReferenceFieldUpdater.newUpdater(c5.class, c5.class, "n3"), AtomicReferenceFieldUpdater.newUpdater(y.class, c5.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(y.class, v.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            sVar = new s();
        }
        ATOMIC_HELPER = sVar;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    private void addDoneString(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(userObjectToString(uninterruptibly));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    private static CancellationException cancellationExceptionWithCause(@Nullable String str, @Nullable Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t3) {
        t3.getClass();
        return t3;
    }

    private v clearListeners(v vVar) {
        v vVar2;
        do {
            vVar2 = this.listeners;
        } while (!ATOMIC_HELPER.y(this, vVar2, v.gv));
        v vVar3 = vVar;
        v vVar4 = vVar2;
        while (vVar4 != null) {
            v vVar5 = vVar4.zn;
            vVar4.zn = vVar3;
            vVar3 = vVar4;
            vVar4 = vVar5;
        }
        return vVar3;
    }

    public static void complete(y<?> yVar) {
        v vVar = null;
        while (true) {
            yVar.releaseWaiters();
            yVar.afterDone();
            v vVarClearListeners = yVar.clearListeners(vVar);
            while (vVarClearListeners != null) {
                vVar = vVarClearListeners.zn;
                fb fbVar = vVarClearListeners.y;
                if (fbVar instanceof fb) {
                    fb fbVar2 = fbVar;
                    yVar = fbVar2.y;
                    if (yVar.value == fbVar2) {
                        if (ATOMIC_HELPER.n3(yVar, fbVar2, getFutureValue(fbVar2.v))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(fbVar, vVarClearListeners.n3);
                }
                vVarClearListeners = vVar;
            }
            return;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof zn) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((zn) obj).n3);
        }
        if (obj instanceof gv) {
            throw new ExecutionException(((gv) obj).y);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static Object getFutureValue(a<?> aVar) {
        if (aVar instanceof y) {
            Object obj = ((y) aVar).value;
            if (!(obj instanceof zn)) {
                return obj;
            }
            zn znVar = (zn) obj;
            return znVar.y ? znVar.n3 != null ? new zn(false, znVar.n3) : zn.gv : obj;
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            return zn.gv;
        }
        try {
            Object uninterruptibly = getUninterruptibly(aVar);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e4) {
            if (zIsCancelled) {
                return new zn(false, e4);
            }
            return new gv(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e4));
        } catch (ExecutionException e5) {
            return new gv(e5.getCause());
        } catch (Throwable th) {
            return new gv(th);
        }
    }

    public static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v6;
        boolean z = false;
        while (true) {
            try {
                v6 = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v6;
    }

    private void releaseWaiters() {
        c5 c5Var;
        do {
            c5Var = this.waiters;
        } while (!ATOMIC_HELPER.zn(this, c5Var, c5.zn));
        while (c5Var != null) {
            c5Var.n3();
            c5Var = c5Var.n3;
        }
    }

    private void removeWaiter(c5 c5Var) {
        c5Var.y = null;
        while (true) {
            c5 c5Var2 = this.waiters;
            if (c5Var2 == c5.zn) {
                return;
            }
            c5 c5Var3 = null;
            while (c5Var2 != null) {
                c5 c5Var4 = c5Var2.n3;
                if (c5Var2.y != null) {
                    c5Var3 = c5Var2;
                } else if (c5Var3 != null) {
                    c5Var3.n3 = c5Var4;
                    if (c5Var3.y == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.zn(this, c5Var2, c5Var4)) {
                    break;
                }
                c5Var2 = c5Var4;
            }
            return;
        }
    }

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // s4.a
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        v vVar = this.listeners;
        if (vVar != v.gv) {
            v vVar2 = new v(runnable, executor);
            do {
                vVar2.zn = vVar;
                if (ATOMIC_HELPER.y(this, vVar, vVar2)) {
                    return;
                } else {
                    vVar = this.listeners;
                }
            } while (vVar != v.gv);
        }
        executeListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof fb)) {
            return false;
        }
        zn znVar = GENERATE_CANCELLATION_CAUSES ? new zn(z, new CancellationException("Future.cancel() was called.")) : z ? zn.zn : zn.gv;
        boolean z5 = false;
        y<V> yVar = this;
        while (true) {
            if (ATOMIC_HELPER.n3(yVar, obj, znVar)) {
                if (z) {
                    yVar.interruptTask();
                }
                complete(yVar);
                if (!(obj instanceof fb)) {
                    return true;
                }
                a aVar = ((fb) obj).v;
                if (!(aVar instanceof y)) {
                    aVar.cancel(z);
                    return true;
                }
                yVar = (y) aVar;
                obj = yVar.value;
                if (!(obj == null) && !(obj instanceof fb)) {
                    return true;
                }
                z5 = true;
            } else {
                obj = yVar.value;
                if (!(obj instanceof fb)) {
                    return z5;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof fb))) {
            return getDoneValue(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= SPIN_THRESHOLD_NANOS) {
            c5 c5Var = this.waiters;
            if (c5Var != c5.zn) {
                c5 c5Var2 = new c5();
                do {
                    c5Var2.y(c5Var);
                    if (ATOMIC_HELPER.zn(this, c5Var, c5Var2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                removeWaiter(c5Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof fb))) {
                                return getDoneValue(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= SPIN_THRESHOLD_NANOS);
                        removeWaiter(c5Var2);
                    } else {
                        c5Var = this.waiters;
                    }
                } while (c5Var != c5.zn);
            }
            return getDoneValue(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof fb))) {
                return getDoneValue(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + SPIN_THRESHOLD_NANOS < 0) {
            String str2 = str + " (plus ";
            long j4 = -nanos;
            long jConvert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > SPIN_THRESHOLD_NANOS;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zn;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof fb)) & (this.value != null);
    }

    public final void maybePropagateCancellationTo(@Nullable Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof fb) {
            return "setFuture=[" + userObjectToString(((fb) obj).v) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(@Nullable V v6) {
        if (v6 == null) {
            v6 = (V) NULL;
        }
        if (!ATOMIC_HELPER.n3(this, (Object) null, v6)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.n3(this, (Object) null, new gv((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setFuture(a<? extends V> aVar) {
        gv gvVar;
        checkNotNull(aVar);
        Object obj = this.value;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!ATOMIC_HELPER.n3(this, (Object) null, getFutureValue(aVar))) {
                    return false;
                }
                complete(this);
                return true;
            }
            fb fbVar = new fb(this, aVar);
            if (ATOMIC_HELPER.n3(this, (Object) null, fbVar)) {
                try {
                    aVar.addListener(fbVar, gv.y);
                } catch (Throwable th) {
                    try {
                        gvVar = new gv(th);
                    } catch (Throwable unused) {
                        gvVar = gv.n3;
                    }
                    ATOMIC_HELPER.n3(this, fbVar, gvVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zn) {
            aVar.cancel(((zn) obj).y);
        }
        return false;
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            try {
                strPendingToString = pendingToString();
            } catch (RuntimeException e4) {
                strPendingToString = "Exception thrown from implementation: " + e4.getClass();
            }
            if (strPendingToString != null && !strPendingToString.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strPendingToString);
                sb.append("]");
            } else if (isDone()) {
                addDoneString(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof zn) && ((zn) obj).y;
    }

    public void afterDone() {
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof fb))) {
                return getDoneValue(obj2);
            }
            c5 c5Var = this.waiters;
            if (c5Var != c5.zn) {
                c5 c5Var2 = new c5();
                do {
                    c5Var2.y(c5Var);
                    if (ATOMIC_HELPER.zn(this, c5Var, c5Var2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                removeWaiter(c5Var2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof fb))));
                        return getDoneValue(obj);
                    }
                    c5Var = this.waiters;
                } while (c5Var != c5.zn);
            }
            return getDoneValue(this.value);
        }
        throw new InterruptedException();
    }
}
