package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.s;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class xc<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private mt.n3<ap.fh<? super T>, xc<T>.gv> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public abstract class gv {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f872fb = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f874v;
        public final ap.fh<? super T> y;

        public gv(ap.fh<? super T> fhVar) {
            this.y = fhVar;
        }

        public abstract boolean gv();

        public void n3() {
        }

        public void y(boolean z) {
            if (z == this.f874v) {
                return;
            }
            this.f874v = z;
            xc.this.changeActiveCounter(z ? 1 : -1);
            if (this.f874v) {
                xc.this.dispatchingValue(this);
            }
        }

        public boolean zn(ap.mt mtVar) {
            return false;
        }
    }

    public class n3 extends xc<T>.gv {
        public n3(ap.fh<? super T> fhVar) {
            super(fhVar);
        }

        @Override // androidx.lifecycle.xc.gv
        public boolean gv() {
            return true;
        }
    }

    public class y implements Runnable {
        public y() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (xc.this.mDataLock) {
                obj = xc.this.mPendingData;
                xc.this.mPendingData = xc.NOT_SET;
            }
            xc.this.setValue(obj);
        }
    }

    public class zn extends xc<T>.gv implements t {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public final ap.mt f876f;

        public zn(@NonNull ap.mt mtVar, ap.fh<? super T> fhVar) {
            super(fhVar);
            this.f876f = mtVar;
        }

        @Override // androidx.lifecycle.xc.gv
        public boolean gv() {
            return this.f876f.getLifecycle().n3().n3(s.n3.STARTED);
        }

        @Override // androidx.lifecycle.xc.gv
        public void n3() {
            this.f876f.getLifecycle().gv(this);
        }

        @Override // androidx.lifecycle.t
        public void onStateChanged(@NonNull ap.mt mtVar, @NonNull s.y yVar) {
            s.n3 n3VarN3 = this.f876f.getLifecycle().n3();
            if (n3VarN3 == s.n3.DESTROYED) {
                xc.this.removeObserver(this.y);
                return;
            }
            s.n3 n3Var = null;
            while (n3Var != n3VarN3) {
                y(gv());
                n3Var = n3VarN3;
                n3VarN3 = this.f876f.getLifecycle().n3();
            }
        }

        @Override // androidx.lifecycle.xc.gv
        public boolean zn(ap.mt mtVar) {
            return this.f876f == mtVar;
        }
    }

    public xc(T t3) {
        this.mDataLock = new Object();
        this.mObservers = new mt.n3<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new y();
        this.mData = t3;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (p.zn.s().zn()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void considerNotify(xc<T>.gv gvVar) {
        if (gvVar.f874v) {
            if (!gvVar.gv()) {
                gvVar.y(false);
                return;
            }
            int i = gvVar.f872fb;
            int i5 = this.mVersion;
            if (i >= i5) {
                return;
            }
            gvVar.f872fb = i5;
            gvVar.y.onChanged((Object) this.mData);
        }
    }

    public void changeActiveCounter(int i) {
        int i5 = this.mActiveCount;
        this.mActiveCount = i + i5;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i8 = this.mActiveCount;
                if (i5 == i8) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z = i5 == 0 && i8 > 0;
                boolean z5 = i5 > 0 && i8 == 0;
                if (z) {
                    onActive();
                } else if (z5) {
                    onInactive();
                }
                i5 = i8;
            } catch (Throwable th) {
                this.mChangingActiveState = false;
                throw th;
            }
        }
    }

    public void dispatchingValue(@Nullable xc<T>.gv gvVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (gvVar != null) {
                considerNotify(gvVar);
                gvVar = null;
            } else {
                mt.n3<ap.fh<? super T>, xc<T>.gv>.gv gvVarZn = this.mObservers.zn();
                while (gvVarZn.hasNext()) {
                    considerNotify((gv) gvVarZn.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    @Nullable
    public T getValue() {
        T t3 = (T) this.mData;
        if (t3 != NOT_SET) {
            return t3;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(@NonNull ap.mt mtVar, @NonNull ap.fh<? super T> fhVar) {
        assertMainThread("observe");
        if (mtVar.getLifecycle().n3() == s.n3.DESTROYED) {
            return;
        }
        zn znVar = new zn(mtVar, fhVar);
        xc<T>.gv gvVarA = this.mObservers.a(fhVar, znVar);
        if (gvVarA != null && !gvVarA.zn(mtVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (gvVarA != null) {
            return;
        }
        mtVar.getLifecycle().y(znVar);
    }

    public void observeForever(@NonNull ap.fh<? super T> fhVar) {
        assertMainThread("observeForever");
        n3 n3Var = new n3(fhVar);
        xc<T>.gv gvVarA = this.mObservers.a(fhVar, n3Var);
        if (gvVarA instanceof zn) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (gvVarA != null) {
            return;
        }
        n3Var.y(true);
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t3) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = t3;
        }
        if (z) {
            p.zn.s().gv(this.mPostValueRunnable);
        }
    }

    public void removeObserver(@NonNull ap.fh<? super T> fhVar) {
        assertMainThread("removeObserver");
        xc<T>.gv gvVarFb = this.mObservers.fb(fhVar);
        if (gvVarFb == null) {
            return;
        }
        gvVarFb.n3();
        gvVarFb.y(false);
    }

    public void removeObservers(@NonNull ap.mt mtVar) {
        assertMainThread("removeObservers");
        for (Map.Entry<ap.fh<? super T>, xc<T>.gv> entry : this.mObservers) {
            if (entry.getValue().zn(mtVar)) {
                removeObserver(entry.getKey());
            }
        }
    }

    public void setValue(T t3) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t3;
        dispatchingValue(null);
    }

    public xc() {
        this.mDataLock = new Object();
        this.mObservers = new mt.n3<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new y();
        this.mData = obj;
        this.mVersion = -1;
    }
}
