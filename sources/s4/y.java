package s4;

import g4.i4;
import g4.xc;
import g4.z;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import o1.tl;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class y<V> extends t4.y implements s4.a<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f7772f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f7773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n3 f7774t;
    public static final Object w;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public volatile t f7775fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile v f7776v;
    public volatile Object y;

    public static final class a extends n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<y, v> f7777gv;
        public final AtomicReferenceFieldUpdater<t, t> n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<y, Object> f7778v;
        public final AtomicReferenceFieldUpdater<t, Thread> y;
        public final AtomicReferenceFieldUpdater<y, t> zn;

        public a(AtomicReferenceFieldUpdater<t, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<t, t> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<y, t> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<y, v> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<y, Object> atomicReferenceFieldUpdater5) {
            super();
            this.y = atomicReferenceFieldUpdater;
            this.n3 = atomicReferenceFieldUpdater2;
            this.zn = atomicReferenceFieldUpdater3;
            this.f7777gv = atomicReferenceFieldUpdater4;
            this.f7778v = atomicReferenceFieldUpdater5;
        }

        @Override // s4.y.n3
        public void gv(t tVar, t tVar2) {
            this.n3.lazySet(tVar, tVar2);
        }

        @Override // s4.y.n3
        public boolean n3(y<?> yVar, Object obj, Object obj2) {
            return i4.n3.y(this.f7778v, yVar, obj, obj2);
        }

        @Override // s4.y.n3
        public void v(t tVar, Thread thread) {
            this.y.lazySet(tVar, thread);
        }

        @Override // s4.y.n3
        public boolean y(y<?> yVar, v vVar, v vVar2) {
            return i4.n3.y(this.f7777gv, yVar, vVar, vVar2);
        }

        @Override // s4.y.n3
        public boolean zn(y<?> yVar, t tVar, t tVar2) {
            return i4.n3.y(this.zn, yVar, tVar, tVar2);
        }
    }

    public interface c5<V> extends s4.a<V> {
    }

    public static final class f extends n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final long f7779a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public static final long f7780gv;
        public static final long n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final long f7781v;
        public static final Unsafe y;
        public static final long zn;

        /* JADX INFO: renamed from: s4.y$f$y, reason: collision with other inner class name */
        public class C0158y implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e4) {
                    throw new RuntimeException("Could not initialize intrinsics", e4.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0158y());
            }
            try {
                zn = unsafe.objectFieldOffset(y.class.getDeclaredField("fb"));
                n3 = unsafe.objectFieldOffset(y.class.getDeclaredField("v"));
                f7780gv = unsafe.objectFieldOffset(y.class.getDeclaredField("y"));
                f7781v = unsafe.objectFieldOffset(t.class.getDeclaredField("y"));
                f7779a = unsafe.objectFieldOffset(t.class.getDeclaredField("n3"));
                y = unsafe;
            } catch (Exception e5) {
                i4.v(e5);
                throw new RuntimeException(e5);
            }
        }

        public f() {
            super();
        }

        @Override // s4.y.n3
        public void gv(t tVar, t tVar2) {
            y.putObject(tVar, f7779a, tVar2);
        }

        @Override // s4.y.n3
        public boolean n3(y<?> yVar, Object obj, Object obj2) {
            return tl.y(y, yVar, f7780gv, obj, obj2);
        }

        @Override // s4.y.n3
        public void v(t tVar, Thread thread) {
            y.putObject(tVar, f7781v, thread);
        }

        @Override // s4.y.n3
        public boolean y(y<?> yVar, v vVar, v vVar2) {
            return tl.y(y, yVar, n3, vVar, vVar2);
        }

        @Override // s4.y.n3
        public boolean zn(y<?> yVar, t tVar, t tVar2) {
            return tl.y(y, yVar, zn, tVar, tVar2);
        }
    }

    public static final class fb<V> implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final s4.a<? extends V> f7782v;
        public final y<V> y;

        @Override // java.lang.Runnable
        public void run() {
            if (this.y.y != this) {
                return;
            }
            if (y.f7774t.n3(this.y, this, y.x4(this.f7782v))) {
                y.co(this.y);
            }
        }
    }

    public static final class gv {
        public static final gv n3 = new gv(new C0159y("Failure occurred while trying to finish a future."));
        public final Throwable y;

        /* JADX INFO: renamed from: s4.y$gv$y, reason: collision with other inner class name */
        public class C0159y extends Throwable {
            public C0159y(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public gv(Throwable th) {
            this.y = (Throwable) xc.t(th);
        }
    }

    public static abstract class i9<V> extends y<V> implements c5<V> {
        @Override // s4.y, s4.a
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // s4.y, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // s4.y, java.util.concurrent.Future
        public V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // s4.y, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // s4.y, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // s4.y, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    public static abstract class n3 {
        public n3() {
        }

        public abstract void gv(t tVar, t tVar2);

        public abstract boolean n3(y<?> yVar, Object obj, Object obj2);

        public abstract void v(t tVar, Thread thread);

        public abstract boolean y(y<?> yVar, v vVar, v vVar2);

        public abstract boolean zn(y<?> yVar, t tVar, t tVar2);
    }

    public static final class s extends n3 {
        public s() {
            super();
        }

        @Override // s4.y.n3
        public void gv(t tVar, t tVar2) {
            tVar.n3 = tVar2;
        }

        @Override // s4.y.n3
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

        @Override // s4.y.n3
        public void v(t tVar, Thread thread) {
            tVar.y = thread;
        }

        @Override // s4.y.n3
        public boolean y(y<?> yVar, v vVar, v vVar2) {
            synchronized (yVar) {
                try {
                    if (yVar.f7776v != vVar) {
                        return false;
                    }
                    yVar.f7776v = vVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // s4.y.n3
        public boolean zn(y<?> yVar, t tVar, t tVar2) {
            synchronized (yVar) {
                try {
                    if (yVar.f7775fb != tVar) {
                        return false;
                    }
                    yVar.f7775fb = tVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class t {
        public static final t zn = new t(false);
        public volatile t n3;
        public volatile Thread y;

        public t(boolean z) {
        }

        public void n3() {
            Thread thread = this.y;
            if (thread != null) {
                this.y = null;
                LockSupport.unpark(thread);
            }
        }

        public void y(t tVar) {
            y.f7774t.gv(this, tVar);
        }

        public t() {
            y.f7774t.v(this, Thread.currentThread());
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public static final zn f7784gv;
        public static final zn zn;
        public final Throwable n3;
        public final boolean y;

        static {
            if (y.f7773s) {
                f7784gv = null;
                zn = null;
            } else {
                f7784gv = new zn(false, null);
                zn = new zn(true, null);
            }
        }

        public zn(boolean z, Throwable th) {
            this.y = z;
            this.n3 = th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r3v2, types: [s4.y$y] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        boolean z;
        n3 sVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f7773s = z;
        f7772f = Logger.getLogger(y.class.getName());
        ?? r3 = 0;
        r3 = 0;
        try {
            sVar = new f();
            th = null;
        } catch (Throwable th) {
            th = th;
            try {
                sVar = new a(AtomicReferenceFieldUpdater.newUpdater(t.class, Thread.class, "y"), AtomicReferenceFieldUpdater.newUpdater(t.class, t.class, "n3"), AtomicReferenceFieldUpdater.newUpdater(y.class, t.class, "fb"), AtomicReferenceFieldUpdater.newUpdater(y.class, v.class, "v"), AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "y"));
            } catch (Throwable th2) {
                sVar = new s();
                r3 = th2;
            }
        }
        f7774t = sVar;
        if (r3 != 0) {
            ?? r02 = f7772f;
            Level level = Level.SEVERE;
            r02.log(level, "UnsafeAtomicHelper is broken!", th);
            r02.log(level, "SafeAtomicHelper is broken!", r3);
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
    public static void co(y<?> yVar) {
        v vVar = null;
        while (true) {
            yVar.c();
            yVar.wz();
            v vVarMt = yVar.mt(vVar);
            while (vVarMt != null) {
                vVar = vVarMt.zn;
                Runnable runnable = vVarMt.y;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof fb) {
                    fb fbVar = (fb) runnable2;
                    yVar = fbVar.y;
                    if (yVar.y == fbVar) {
                        if (f7774t.n3(yVar, fbVar, x4(fbVar.f7782v))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = vVarMt.n3;
                    Objects.requireNonNull(executor);
                    z(runnable2, executor);
                }
                vVarMt = vVar;
            }
            return;
        }
    }

    private static <V> V i4(Future<V> future) throws ExecutionException {
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

    public static CancellationException p(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object x4(s4.a<?> aVar) {
        Throwable thY;
        if (aVar instanceof c5) {
            Object znVar = ((y) aVar).y;
            if (znVar instanceof zn) {
                zn znVar2 = (zn) znVar;
                if (znVar2.y) {
                    znVar = znVar2.n3 != null ? new zn(false, znVar2.n3) : zn.f7784gv;
                }
            }
            Objects.requireNonNull(znVar);
            return znVar;
        }
        if ((aVar instanceof t4.y) && (thY = t4.n3.y((t4.y) aVar)) != null) {
            return new gv(thY);
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!f7773s) && zIsCancelled) {
            zn znVar3 = zn.f7784gv;
            Objects.requireNonNull(znVar3);
            return znVar3;
        }
        try {
            Object objI4 = i4(aVar);
            if (!zIsCancelled) {
                return objI4 == null ? w : objI4;
            }
            String strValueOf = String.valueOf(aVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new zn(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e4) {
            if (zIsCancelled) {
                return new zn(false, e4);
            }
            String strValueOf2 = String.valueOf(aVar);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 77);
            sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb2.append(strValueOf2);
            return new gv(new IllegalArgumentException(sb2.toString(), e4));
        } catch (ExecutionException e5) {
            if (!zIsCancelled) {
                return new gv(e5.getCause());
            }
            String strValueOf3 = String.valueOf(aVar);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 84);
            sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb3.append(strValueOf3);
            return new zn(false, new IllegalArgumentException(sb3.toString(), e5));
        } catch (Throwable th) {
            return new gv(th);
        }
    }

    public static void z(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            Logger logger = f7772f;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.log(level, sb.toString(), (Throwable) e4);
        }
    }

    @Override // s4.a
    public void addListener(Runnable runnable, Executor executor) {
        v vVar;
        xc.tl(runnable, "Runnable was null.");
        xc.tl(executor, "Executor was null.");
        if (!isDone() && (vVar = this.f7776v) != v.f7783gv) {
            v vVar2 = new v(runnable, executor);
            do {
                vVar2.zn = vVar;
                if (f7774t.y(this, vVar, vVar2)) {
                    return;
                } else {
                    vVar = this.f7776v;
                }
            } while (vVar != v.f7783gv);
        }
        z(runnable, executor);
    }

    public final void c() {
        t tVar;
        do {
            tVar = this.f7775fb;
        } while (!f7774t.zn(this, tVar, t.zn));
        while (tVar != null) {
            tVar.n3();
            tVar = tVar.n3;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zn znVar;
        Object obj = this.y;
        if (!(obj == null) && !(obj instanceof fb)) {
            return false;
        }
        if (f7773s) {
            znVar = new zn(z, new CancellationException("Future.cancel() was called."));
        } else {
            znVar = z ? zn.zn : zn.f7784gv;
            Objects.requireNonNull(znVar);
        }
        boolean z5 = false;
        y<V> yVar = this;
        while (true) {
            if (f7774t.n3(yVar, obj, znVar)) {
                if (z) {
                    yVar.f3();
                }
                co(yVar);
                if (!(obj instanceof fb)) {
                    return true;
                }
                s4.a<? extends V> aVar = ((fb) obj).f7782v;
                if (!(aVar instanceof c5)) {
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

    public final void d0(t tVar) {
        tVar.y = null;
        while (true) {
            t tVar2 = this.f7775fb;
            if (tVar2 == t.zn) {
                return;
            }
            t tVar3 = null;
            while (tVar2 != null) {
                t tVar4 = tVar2.n3;
                if (tVar2.y != null) {
                    tVar3 = tVar2;
                } else if (tVar3 != null) {
                    tVar3.n3 = tVar4;
                    if (tVar3.y == null) {
                        break;
                    }
                } else if (!f7774t.zn(this, tVar2, tVar4)) {
                    break;
                }
                tVar2 = tVar4;
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
    public boolean fh(V v6) {
        if (v6 == null) {
            v6 = (V) w;
        }
        if (!f7774t.n3(this, null, v6)) {
            return false;
        }
        co(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.y;
        if ((obj != null) && (!(obj instanceof fb))) {
            return r(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            t tVar = this.f7775fb;
            if (tVar != t.zn) {
                t tVar2 = new t();
                do {
                    tVar2.y(tVar);
                    if (f7774t.zn(this, tVar, tVar2)) {
                        do {
                            s4.s.y(this, nanos);
                            if (Thread.interrupted()) {
                                d0(tVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.y;
                            if ((obj2 != null) && (!(obj2 instanceof fb))) {
                                return r(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        d0(tVar2);
                    } else {
                        tVar = this.f7775fb;
                    }
                } while (tVar != t.zn);
            }
            Object obj3 = this.y;
            Objects.requireNonNull(obj3);
            return r(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.y;
            if ((obj4 != null) && (!(obj4 instanceof fb))) {
                return r(obj4);
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
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = String.valueOf(string3).concat(" (plus ");
            long j4 = -nanos;
            long jConvert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strValueOf = String.valueOf(strConcat);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21 + String.valueOf(lowerCase).length());
                sb2.append(strValueOf);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z) {
                    string4 = String.valueOf(string4).concat(",");
                }
                strConcat = String.valueOf(string4).concat(" ");
            }
            if (z) {
                String strValueOf2 = String.valueOf(strConcat);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 33);
                sb3.append(strValueOf2);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = String.valueOf(strConcat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(string3).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(string3).length() + 5 + String.valueOf(string).length());
        sb4.append(string3);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.y instanceof zn;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof fb)) & (this.y != null);
    }

    public final v mt(v vVar) {
        v vVar2;
        do {
            vVar2 = this.f7776v;
        } while (!f7774t.y(this, vVar2, v.f7783gv));
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

    /* JADX WARN: Multi-variable type inference failed */
    public String n() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V r(Object obj) throws ExecutionException {
        if (obj instanceof zn) {
            throw p("Task was cancelled.", ((zn) obj).n3);
        }
        if (obj instanceof gv) {
            throw new ExecutionException(((gv) obj).y);
        }
        return obj == w ? (V) s4.fb.y() : obj;
    }

    public boolean rz(Throwable th) {
        if (!f7774t.n3(this, null, new gv((Throwable) xc.t(th)))) {
            return false;
        }
        co(this);
        return true;
    }

    public final void t(StringBuilder sb) {
        try {
            Object objI4 = i4(this);
            sb.append("SUCCESS, result=[");
            xc(sb, objI4);
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

    public final void tl(StringBuilder sb) {
        String string;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.y;
        if (obj instanceof fb) {
            sb.append(", setFuture=[");
            w(sb, ((fb) obj).f7782v);
            sb.append("]");
        } else {
            try {
                string = z.y(n());
            } catch (RuntimeException | StackOverflowError e4) {
                String strValueOf = String.valueOf(e4.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(strValueOf);
                string = sb2.toString();
            }
            if (string != null) {
                sb.append(", info=[");
                sb.append(string);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            t(sb);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            t(sb);
        } else {
            tl(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public final void w(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException e4) {
            e = e4;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e5) {
            e = e5;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    public final void xc(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // t4.y
    public final Throwable y() {
        if (!(this instanceof c5)) {
            return null;
        }
        Object obj = this.y;
        if (obj instanceof gv) {
            return ((gv) obj).y;
        }
        return null;
    }

    public static final class v {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public static final v f7783gv = new v();
        public final Executor n3;
        public final Runnable y;
        public v zn;

        public v(Runnable runnable, Executor executor) {
            this.y = runnable;
            this.n3 = executor;
        }

        public v() {
            this.y = null;
            this.n3 = null;
        }
    }

    public void f3() {
    }

    public void wz() {
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.y;
            if ((obj2 != null) & (!(obj2 instanceof fb))) {
                return r(obj2);
            }
            t tVar = this.f7775fb;
            if (tVar != t.zn) {
                t tVar2 = new t();
                do {
                    tVar2.y(tVar);
                    if (f7774t.zn(this, tVar, tVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.y;
                            } else {
                                d0(tVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof fb))));
                        return r(obj);
                    }
                    tVar = this.f7775fb;
                } while (tVar != t.zn);
            }
            Object obj3 = this.y;
            Objects.requireNonNull(obj3);
            return r(obj3);
        }
        throw new InterruptedException();
    }
}
