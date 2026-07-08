package fc;

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

/* JADX INFO: loaded from: classes.dex */
public abstract class y<V> implements s4.a<V> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n3 f3358t;
    public static final Object w;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public volatile c5 f3359fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public volatile v f3360v;

    @Nullable
    public volatile Object y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f3357s = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f3356f = Logger.getLogger(y.class.getName());

    public static final class a extends n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<y, v> f3361gv;
        public final AtomicReferenceFieldUpdater<c5, c5> n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<y, Object> f3362v;
        public final AtomicReferenceFieldUpdater<c5, Thread> y;
        public final AtomicReferenceFieldUpdater<y, c5> zn;

        public a(AtomicReferenceFieldUpdater<c5, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<c5, c5> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<y, c5> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<y, v> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<y, Object> atomicReferenceFieldUpdater5) {
            super();
            this.y = atomicReferenceFieldUpdater;
            this.n3 = atomicReferenceFieldUpdater2;
            this.zn = atomicReferenceFieldUpdater3;
            this.f3361gv = atomicReferenceFieldUpdater4;
            this.f3362v = atomicReferenceFieldUpdater5;
        }

        @Override // fc.y.n3
        public void gv(c5 c5Var, c5 c5Var2) {
            this.n3.lazySet(c5Var, c5Var2);
        }

        @Override // fc.y.n3
        public boolean n3(y<?> yVar, Object obj, Object obj2) {
            return i4.n3.y(this.f3362v, yVar, obj, obj2);
        }

        @Override // fc.y.n3
        public void v(c5 c5Var, Thread thread) {
            this.y.lazySet(c5Var, thread);
        }

        @Override // fc.y.n3
        public boolean y(y<?> yVar, v vVar, v vVar2) {
            return i4.n3.y(this.f3361gv, yVar, vVar, vVar2);
        }

        @Override // fc.y.n3
        public boolean zn(y<?> yVar, c5 c5Var, c5 c5Var2) {
            return i4.n3.y(this.zn, yVar, c5Var, c5Var2);
        }
    }

    public static final class c5 {
        public static final c5 zn = new c5(false);

        @Nullable
        public volatile c5 n3;

        @Nullable
        public volatile Thread y;

        public c5(boolean z) {
        }

        public void n3() {
            Thread thread = this.y;
            if (thread != null) {
                this.y = null;
                LockSupport.unpark(thread);
            }
        }

        public void y(c5 c5Var) {
            y.f3358t.gv(this, c5Var);
        }

        public c5() {
            y.f3358t.v(this, Thread.currentThread());
        }
    }

    public static final class fb<V> implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final s4.a<? extends V> f3363v;
        public final y<V> y;

        public fb(y<V> yVar, s4.a<? extends V> aVar) {
            this.y = yVar;
            this.f3363v = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.y.y != this) {
                return;
            }
            if (y.f3358t.n3(this.y, this, y.c5(this.f3363v))) {
                y.a(this.y);
            }
        }
    }

    public static final class gv {
        public static final gv n3 = new gv(new C0087y("Failure occurred while trying to finish a future."));
        public final Throwable y;

        /* JADX INFO: renamed from: fc.y$gv$y, reason: collision with other inner class name */
        public class C0087y extends Throwable {
            public C0087y(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public gv(Throwable th) {
            this.y = (Throwable) y.gv(th);
        }
    }

    public static abstract class n3 {
        public n3() {
        }

        public abstract void gv(c5 c5Var, c5 c5Var2);

        public abstract boolean n3(y<?> yVar, Object obj, Object obj2);

        public abstract void v(c5 c5Var, Thread thread);

        public abstract boolean y(y<?> yVar, v vVar, v vVar2);

        public abstract boolean zn(y<?> yVar, c5 c5Var, c5 c5Var2);
    }

    public static final class s extends n3 {
        public s() {
            super();
        }

        @Override // fc.y.n3
        public void gv(c5 c5Var, c5 c5Var2) {
            c5Var.n3 = c5Var2;
        }

        @Override // fc.y.n3
        public boolean n3(y<?> yVar, Object obj, Object obj2) {
            synchronized (yVar) {
                try {
                    if (yVar.y != obj) {
                        return false;
                    }
                    yVar.y = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // fc.y.n3
        public void v(c5 c5Var, Thread thread) {
            c5Var.y = thread;
        }

        @Override // fc.y.n3
        public boolean y(y<?> yVar, v vVar, v vVar2) {
            synchronized (yVar) {
                try {
                    if (yVar.f3360v != vVar) {
                        return false;
                    }
                    yVar.f3360v = vVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // fc.y.n3
        public boolean zn(y<?> yVar, c5 c5Var, c5 c5Var2) {
            synchronized (yVar) {
                try {
                    if (yVar.f3359fb != c5Var) {
                        return false;
                    }
                    yVar.f3359fb = c5Var2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class v {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public static final v f3364gv = new v(null, null);
        public final Executor n3;
        public final Runnable y;

        @Nullable
        public v zn;

        public v(Runnable runnable, Executor executor) {
            this.y = runnable;
            this.n3 = executor;
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public static final zn f3365gv;
        public static final zn zn;

        @Nullable
        public final Throwable n3;
        public final boolean y;

        static {
            if (y.f3357s) {
                f3365gv = null;
                zn = null;
            } else {
                f3365gv = new zn(false, null);
                zn = new zn(true, null);
            }
        }

        public zn(boolean z, @Nullable Throwable th) {
            this.y = z;
            this.n3 = th;
        }
    }

    static {
        n3 sVar;
        try {
            sVar = new a(AtomicReferenceFieldUpdater.newUpdater(c5.class, Thread.class, "y"), AtomicReferenceFieldUpdater.newUpdater(c5.class, c5.class, "n3"), AtomicReferenceFieldUpdater.newUpdater(y.class, c5.class, "fb"), AtomicReferenceFieldUpdater.newUpdater(y.class, v.class, "v"), AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "y"));
            th = null;
        } catch (Throwable th) {
            th = th;
            sVar = new s();
        }
        f3358t = sVar;
        if (th != null) {
            f3356f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        w = new Object();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void a(y<?> yVar) {
        v vVar = null;
        while (true) {
            yVar.tl();
            yVar.n3();
            v vVarV = yVar.v(vVar);
            while (vVarV != null) {
                vVar = vVarV.zn;
                Runnable runnable = vVarV.y;
                if (runnable instanceof fb) {
                    fb fbVar = (fb) runnable;
                    yVar = fbVar.y;
                    if (yVar.y == fbVar) {
                        if (f3358t.n3(yVar, fbVar, c5(fbVar.f3363v))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    fb(runnable, vVarV.n3);
                }
                vVarV = vVar;
            }
            return;
        }
    }

    public static Object c5(s4.a<?> aVar) {
        if (aVar instanceof y) {
            Object obj = ((y) aVar).y;
            if (!(obj instanceof zn)) {
                return obj;
            }
            zn znVar = (zn) obj;
            return znVar.y ? znVar.n3 != null ? new zn(false, znVar.n3) : zn.f3365gv : obj;
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!f3357s) && zIsCancelled) {
            return zn.f3365gv;
        }
        try {
            Object objI9 = i9(aVar);
            return objI9 == null ? w : objI9;
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

    private static void fb(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f3356f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    @NonNull
    public static <T> T gv(@Nullable T t3) {
        t3.getClass();
        return t3;
    }

    private static <V> V i9(Future<V> future) throws ExecutionException {
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

    /* JADX WARN: Multi-variable type inference failed */
    private V s(Object obj) throws ExecutionException {
        if (obj instanceof zn) {
            throw zn("Task was cancelled.", ((zn) obj).n3);
        }
        if (obj instanceof gv) {
            throw new ExecutionException(((gv) obj).y);
        }
        if (obj == w) {
            return null;
        }
        return obj;
    }

    private void tl() {
        c5 c5Var;
        do {
            c5Var = this.f3359fb;
        } while (!f3358t.zn(this, c5Var, c5.zn));
        while (c5Var != null) {
            c5Var.n3();
            c5Var = c5Var.n3;
        }
    }

    private void y(StringBuilder sb) {
        try {
            Object objI9 = i9(this);
            sb.append("SUCCESS, result=[");
            sb.append(mt(objI9));
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

    private static CancellationException zn(@Nullable String str, @Nullable Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @Override // s4.a
    public final void addListener(Runnable runnable, Executor executor) {
        gv(runnable);
        gv(executor);
        v vVar = this.f3360v;
        if (vVar != v.f3364gv) {
            v vVar2 = new v(runnable, executor);
            do {
                vVar2.zn = vVar;
                if (f3358t.y(this, vVar, vVar2)) {
                    return;
                } else {
                    vVar = this.f3360v;
                }
            } while (vVar != v.f3364gv);
        }
        fb(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.y;
        if (!(obj == null) && !(obj instanceof fb)) {
            return false;
        }
        zn znVar = f3357s ? new zn(z, new CancellationException("Future.cancel() was called.")) : z ? zn.zn : zn.f3365gv;
        boolean z5 = false;
        y<V> yVar = this;
        while (true) {
            if (f3358t.n3(yVar, obj, znVar)) {
                if (z) {
                    yVar.f();
                }
                a(yVar);
                if (!(obj instanceof fb)) {
                    return true;
                }
                s4.a<? extends V> aVar = ((fb) obj).f3363v;
                if (!(aVar instanceof y)) {
                    aVar.cancel(z);
                    return true;
                }
                yVar = (y) aVar;
                obj = yVar.y;
                if (!(obj == null) && !(obj instanceof fb)) {
                    return true;
                }
                z5 = true;
            } else {
                obj = yVar.y;
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
        Object obj = this.y;
        if ((obj != null) && (!(obj instanceof fb))) {
            return s(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            c5 c5Var = this.f3359fb;
            if (c5Var != c5.zn) {
                c5 c5Var2 = new c5();
                do {
                    c5Var2.y(c5Var);
                    if (f3358t.zn(this, c5Var, c5Var2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                wz(c5Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.y;
                            if ((obj2 != null) && (!(obj2 instanceof fb))) {
                                return s(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        wz(c5Var2);
                    } else {
                        c5Var = this.f3359fb;
                    }
                } while (c5Var != c5.zn);
            }
            return s(this.y);
        }
        while (nanos > 0) {
            Object obj3 = this.y;
            if ((obj3 != null) && (!(obj3 instanceof fb))) {
                return s(obj3);
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
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j4 = -nanos;
            long jConvert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
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
        return this.y instanceof zn;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof fb)) & (this.y != null);
    }

    public final String mt(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public boolean p(s4.a<? extends V> aVar) {
        gv gvVar;
        gv(aVar);
        Object obj = this.y;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f3358t.n3(this, null, c5(aVar))) {
                    return false;
                }
                a(this);
                return true;
            }
            fb fbVar = new fb(this, aVar);
            if (f3358t.n3(this, null, fbVar)) {
                try {
                    aVar.addListener(fbVar, fc.n3.INSTANCE);
                } catch (Throwable th) {
                    try {
                        gvVar = new gv(th);
                    } catch (Throwable unused) {
                        gvVar = gv.n3;
                    }
                    f3358t.n3(this, fbVar, gvVar);
                }
                return true;
            }
            obj = this.y;
        }
        if (obj instanceof zn) {
            aVar.cancel(((zn) obj).y);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public String t() {
        Object obj = this.y;
        if (obj instanceof fb) {
            return "setFuture=[" + mt(((fb) obj).f3363v) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String strT;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            y(sb);
        } else {
            try {
                strT = t();
            } catch (RuntimeException e4) {
                strT = "Exception thrown from implementation: " + e4.getClass();
            }
            if (strT != null && !strT.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strT);
                sb.append("]");
            } else if (isDone()) {
                y(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final v v(v vVar) {
        v vVar2;
        do {
            vVar2 = this.f3360v;
        } while (!f3358t.y(this, vVar2, v.f3364gv));
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

    public boolean w(Throwable th) {
        if (!f3358t.n3(this, null, new gv((Throwable) gv(th)))) {
            return false;
        }
        a(this);
        return true;
    }

    public final void wz(c5 c5Var) {
        c5Var.y = null;
        while (true) {
            c5 c5Var2 = this.f3359fb;
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
                } else if (!f3358t.zn(this, c5Var2, c5Var4)) {
                    break;
                }
                c5Var2 = c5Var4;
            }
            return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean xc(@Nullable V v6) {
        if (v6 == null) {
            v6 = (V) w;
        }
        if (!f3358t.n3(this, null, v6)) {
            return false;
        }
        a(this);
        return true;
    }

    public void f() {
    }

    public void n3() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.y;
            if ((obj2 != null) & (!(obj2 instanceof fb))) {
                return s(obj2);
            }
            c5 c5Var = this.f3359fb;
            if (c5Var != c5.zn) {
                c5 c5Var2 = new c5();
                do {
                    c5Var2.y(c5Var);
                    if (f3358t.zn(this, c5Var, c5Var2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.y;
                            } else {
                                wz(c5Var2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof fb))));
                        return s(obj);
                    }
                    c5Var = this.f3359fb;
                } while (c5Var != c5.zn);
            }
            return s(this.y);
        }
        throw new InterruptedException();
    }
}
