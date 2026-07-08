package sj1;

import com.google.protobuf.Reader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xj1.v;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<v.y> f8044a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final ArrayDeque<xj1.v> f8045fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public ExecutorService f8046gv;
    public int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayDeque<v.y> f8047v;
    public int y;
    public Runnable zn;

    public w() {
        this.y = 64;
        this.n3 = 5;
        this.f8047v = new ArrayDeque<>();
        this.f8044a = new ArrayDeque<>();
        this.f8045fb = new ArrayDeque<>();
    }

    public final void a(v.y call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.zn().decrementAndGet();
        v(this.f8044a, call);
    }

    public final synchronized int c5() {
        return this.y;
    }

    public final boolean f() {
        int i;
        boolean z;
        if (tj1.gv.f8214s && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<v.y> it = this.f8047v.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    v.y asyncCall = it.next();
                    if (this.f8044a.size() >= c5()) {
                        break;
                    }
                    if (asyncCall.zn().get() < i9()) {
                        it.remove();
                        asyncCall.zn().incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f8044a.add(asyncCall);
                    }
                }
                z = t() > 0;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((v.y) arrayList.get(i)).y(zn());
        }
        return z;
    }

    public final void fb(xj1.v call) {
        Intrinsics.checkNotNullParameter(call, "call");
        v(this.f8045fb, call);
    }

    public final v.y gv(String str) {
        for (v.y yVar : this.f8044a) {
            if (Intrinsics.areEqual(yVar.gv(), str)) {
                return yVar;
            }
        }
        for (v.y yVar2 : this.f8047v) {
            if (Intrinsics.areEqual(yVar2.gv(), str)) {
                return yVar2;
            }
        }
        return null;
    }

    public final synchronized int i9() {
        return this.n3;
    }

    public final synchronized void n3(xj1.v call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f8045fb.add(call);
    }

    public final synchronized Runnable s() {
        return this.zn;
    }

    public final synchronized int t() {
        return this.f8044a.size() + this.f8045fb.size();
    }

    public final void tl(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("max < 1: ", Integer.valueOf(i)).toString());
        }
        synchronized (this) {
            this.y = i;
            Unit unit = Unit.INSTANCE;
        }
        f();
    }

    public final <T> void v(Deque<T> deque, T t3) {
        Runnable runnableS;
        synchronized (this) {
            if (!deque.remove(t3)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnableS = s();
            Unit unit = Unit.INSTANCE;
        }
        if (f() || runnableS == null) {
            return;
        }
        runnableS.run();
    }

    public final void y(v.y call) {
        v.y yVarGv;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.f8047v.add(call);
                if (!call.n3().xc() && (yVarGv = gv(call.gv())) != null) {
                    call.v(yVarGv);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
    }

    public final synchronized ExecutorService zn() {
        ExecutorService executorService;
        try {
            if (this.f8046gv == null) {
                this.f8046gv = new ThreadPoolExecutor(0, Reader.READ_DONE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), tj1.gv.vl(Intrinsics.stringPlus(tj1.gv.f8211c5, " Dispatcher"), false));
            }
            executorService = this.f8046gv;
            Intrinsics.checkNotNull(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(ExecutorService executorService) {
        this();
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f8046gv = executorService;
    }
}
