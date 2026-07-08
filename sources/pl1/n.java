package pl1;

import hk1.en;
import java.io.IOException;
import java.util.Objects;
import sj1.v;

/* JADX INFO: loaded from: classes.dex */
public final class n<T> implements gv<T> {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f7318co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f<sj1.mg, T> f7319f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Object[] f7320fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Throwable f7321p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v.y f7322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f7323t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f7324v;
    public sj1.v w;
    public final x y;

    public static final class n3 extends sj1.mg {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public IOException f7325fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final hk1.fb f7326v;
        public final sj1.mg y;

        public class y extends hk1.wz {
            public y(en enVar) {
                super(enVar);
            }

            public long read(hk1.v vVar, long j) throws IOException {
                try {
                    return super.read(vVar, j);
                } catch (IOException e4) {
                    n3.this.f7325fb = e4;
                    throw e4;
                }
            }
        }

        public n3(sj1.mg mgVar) {
            this.y = mgVar;
            this.f7326v = hk1.x.gv(new y(mgVar.source()));
        }

        @Override // sj1.mg, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.y.close();
        }

        @Override // sj1.mg
        public long contentLength() {
            return this.y.contentLength();
        }

        @Override // sj1.mg
        public sj1.i4 contentType() {
            return this.y.contentType();
        }

        @Override // sj1.mg
        public hk1.fb source() {
            return this.f7326v;
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.f7325fb;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public class y implements sj1.a {
        public final /* synthetic */ a y;

        public y(a aVar) {
            this.y = aVar;
        }

        @Override // sj1.a
        public void onFailure(sj1.v vVar, IOException iOException) {
            y(iOException);
        }

        @Override // sj1.a
        public void onResponse(sj1.v vVar, sj1.rz rzVar) {
            try {
                try {
                    this.y.y(n.this, n.this.v(rzVar));
                } catch (Throwable th) {
                    j5.z(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                j5.z(th2);
                y(th2);
            }
        }

        public final void y(Throwable th) {
            try {
                this.y.n3(n.this, th);
            } catch (Throwable th2) {
                j5.z(th2);
                th2.printStackTrace();
            }
        }
    }

    public static final class zn extends sj1.mg {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f7328v;
        public final sj1.i4 y;

        public zn(sj1.i4 i4Var, long j) {
            this.y = i4Var;
            this.f7328v = j;
        }

        @Override // sj1.mg
        public long contentLength() {
            return this.f7328v;
        }

        @Override // sj1.mg
        public sj1.i4 contentType() {
            return this.y;
        }

        @Override // sj1.mg
        public hk1.fb source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public n(x xVar, Object obj, Object[] objArr, v.y yVar, f<sj1.mg, T> fVar) {
        this.y = xVar;
        this.f7324v = obj;
        this.f7320fb = objArr;
        this.f7322s = yVar;
        this.f7319f = fVar;
    }

    @Override // pl1.gv
    public void a(a<T> aVar) {
        sj1.v vVar;
        Throwable th;
        Objects.requireNonNull(aVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f7318co) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f7318co = true;
                vVar = this.w;
                th = this.f7321p;
                if (vVar == null && th == null) {
                    try {
                        sj1.v vVarZn = zn();
                        this.w = vVarZn;
                        vVar = vVarZn;
                    } catch (Throwable th2) {
                        th = th2;
                        j5.z(th);
                        this.f7321p = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            aVar.n3(this, th);
            return;
        }
        if (this.f7323t) {
            vVar.cancel();
        }
        vVar.r(new y(aVar));
    }

    @Override // pl1.gv
    public void cancel() {
        sj1.v vVar;
        this.f7323t = true;
        synchronized (this) {
            vVar = this.w;
        }
        if (vVar != null) {
            vVar.cancel();
        }
    }

    @Override // pl1.gv
    public b<T> execute() throws IOException {
        sj1.v vVarGv;
        synchronized (this) {
            if (this.f7318co) {
                throw new IllegalStateException("Already executed.");
            }
            this.f7318co = true;
            vVarGv = gv();
        }
        if (this.f7323t) {
            vVarGv.cancel();
        }
        return v(vVarGv.execute());
    }

    public final sj1.v gv() throws IOException {
        sj1.v vVar = this.w;
        if (vVar != null) {
            return vVar;
        }
        Throwable th = this.f7321p;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            sj1.v vVarZn = zn();
            this.w = vVarZn;
            return vVarZn;
        } catch (IOException | Error | RuntimeException e4) {
            j5.z(e4);
            this.f7321p = e4;
            throw e4;
        }
    }

    @Override // pl1.gv
    public boolean isCanceled() {
        boolean z = true;
        if (this.f7323t) {
            return true;
        }
        synchronized (this) {
            try {
                sj1.v vVar = this.w;
                if (vVar == null || !vVar.isCanceled()) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // pl1.gv
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public n<T> clone() {
        return new n<>(this.y, this.f7324v, this.f7320fb, this.f7322s, this.f7319f);
    }

    public b<T> v(sj1.rz rzVar) throws IOException {
        sj1.mg mgVarY = rzVar.y();
        sj1.rz rzVarZn = rzVar.ej().n3(new zn(mgVarY.contentType(), mgVarY.contentLength())).zn();
        int iP = rzVarZn.p();
        if (iP < 200 || iP >= 300) {
            try {
                return b.zn(j5.y(mgVarY), rzVarZn);
            } finally {
                mgVarY.close();
            }
        }
        if (iP == 204 || iP == 205) {
            mgVarY.close();
            return b.a(null, rzVarZn);
        }
        n3 n3Var = new n3(mgVarY);
        try {
            return b.a(this.f7319f.convert(n3Var), rzVarZn);
        } catch (RuntimeException e4) {
            n3Var.throwIfCaught();
            throw e4;
        }
    }

    @Override // pl1.gv
    public synchronized sj1.d0 y() {
        try {
        } catch (IOException e4) {
            throw new RuntimeException("Unable to create request.", e4);
        }
        return gv().y();
    }

    public final sj1.v zn() throws IOException {
        sj1.v vVarN3 = this.f7322s.n3(this.y.y(this.f7324v, this.f7320fb));
        if (vVarN3 != null) {
            return vVarN3;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }
}
