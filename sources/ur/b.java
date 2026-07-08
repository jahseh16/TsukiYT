package ur;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import ft.g;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public static class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final long f8477gv;

        @Nullable
        public final mg.n3 n3;
        public final int y;
        public final CopyOnWriteArrayList<C0184y> zn;

        /* JADX INFO: renamed from: ur.b$y$y, reason: collision with other inner class name */
        public static final class C0184y {
            public b n3;
            public Handler y;

            public C0184y(Handler handler, b bVar) {
                this.y = handler;
                this.n3 = bVar;
            }
        }

        public y() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public void c(i4 i4Var, int i) {
            d0(i4Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void c5(int i, @Nullable g gVar, int i5, @Nullable Object obj, long j) {
            i9(new c(1, i, gVar, i5, obj, s(j), -9223372036854775807L));
        }

        public void co(final i4 i4Var, final c cVar) {
            for (C0184y c0184y : this.zn) {
                final b bVar = c0184y.n3;
                v0.ut.oa(c0184y.y, new Runnable() { // from class: ur.ej
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.t(bVar, i4Var, cVar);
                    }
                });
            }
        }

        @CheckResult
        public y d(int i, @Nullable mg.n3 n3Var, long j) {
            return new y(this.zn, i, n3Var, j);
        }

        public void d0(i4 i4Var, int i, int i5, @Nullable g gVar, int i8, @Nullable Object obj, long j, long j4) {
            fh(i4Var, new c(i, i5, gVar, i8, obj, s(j), s(j4)));
        }

        public final /* synthetic */ void f(b bVar, c cVar) {
            bVar.en(this.y, this.n3, cVar);
        }

        public void f3(i4 i4Var, int i, IOException iOException, boolean z) {
            i4(i4Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        public void fb(Handler handler, b bVar) {
            v0.y.v(handler);
            v0.y.v(bVar);
            this.zn.add(new C0184y(handler, bVar));
        }

        public void fh(final i4 i4Var, final c cVar) {
            for (C0184y c0184y : this.zn) {
                final b bVar = c0184y.n3;
                v0.ut.oa(c0184y.y, new Runnable() { // from class: ur.ud
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.xc(bVar, i4Var, cVar);
                    }
                });
            }
        }

        public void i4(i4 i4Var, int i, int i5, @Nullable g gVar, int i8, @Nullable Object obj, long j, long j4, IOException iOException, boolean z) {
            n(i4Var, new c(i, i5, gVar, i8, obj, s(j), s(j4)), iOException, z);
        }

        public void i9(final c cVar) {
            for (C0184y c0184y : this.zn) {
                final b bVar = c0184y.n3;
                v0.ut.oa(c0184y.y, new Runnable() { // from class: ur.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.f(bVar, cVar);
                    }
                });
            }
        }

        public void mg(int i, long j, long j4) {
            ta(new c(1, i, null, 3, null, s(j), s(j4)));
        }

        public void mt(i4 i4Var, int i, int i5, @Nullable g gVar, int i8, @Nullable Object obj, long j, long j4) {
            co(i4Var, new c(i, i5, gVar, i8, obj, s(j), s(j4)));
        }

        public void n(final i4 i4Var, final c cVar, final IOException iOException, final boolean z) {
            for (C0184y c0184y : this.zn) {
                final b bVar = c0184y.n3;
                v0.ut.oa(c0184y.y, new Runnable() { // from class: ur.z6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.wz(bVar, i4Var, cVar, iOException, z);
                    }
                });
            }
        }

        public void p(i4 i4Var, int i) {
            mt(i4Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void r(i4 i4Var, int i, int i5, @Nullable g gVar, int i8, @Nullable Object obj, long j, long j4) {
            x4(i4Var, new c(i, i5, gVar, i8, obj, s(j), s(j4)));
        }

        public void rz(b bVar) {
            for (C0184y c0184y : this.zn) {
                if (c0184y.n3 == bVar) {
                    this.zn.remove(c0184y);
                }
            }
        }

        public final long s(long j) {
            long jGf = v0.ut.gf(j);
            if (jGf == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f8477gv + jGf;
        }

        public final /* synthetic */ void t(b bVar, i4 i4Var, c cVar) {
            bVar.jz(this.y, this.n3, i4Var, cVar);
        }

        public void ta(final c cVar) {
            final mg.n3 n3Var = (mg.n3) v0.y.v(this.n3);
            for (C0184y c0184y : this.zn) {
                final b bVar = c0184y.n3;
                v0.ut.oa(c0184y.y, new Runnable() { // from class: ur.a8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.w(bVar, n3Var, cVar);
                    }
                });
            }
        }

        public final /* synthetic */ void tl(b bVar, i4 i4Var, c cVar) {
            bVar.mg(this.y, this.n3, i4Var, cVar);
        }

        public final /* synthetic */ void w(b bVar, mg.n3 n3Var, c cVar) {
            bVar.a(this.y, n3Var, cVar);
        }

        public final /* synthetic */ void wz(b bVar, i4 i4Var, c cVar, IOException iOException, boolean z) {
            bVar.u(this.y, this.n3, i4Var, cVar, iOException, z);
        }

        public void x4(final i4 i4Var, final c cVar) {
            for (C0184y c0184y : this.zn) {
                final b bVar = c0184y.n3;
                v0.ut.oa(c0184y.y, new Runnable() { // from class: ur.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.tl(bVar, i4Var, cVar);
                    }
                });
            }
        }

        public final /* synthetic */ void xc(b bVar, i4 i4Var, c cVar) {
            bVar.yt(this.y, this.n3, i4Var, cVar);
        }

        public void z(i4 i4Var, int i) {
            r(i4Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public y(CopyOnWriteArrayList<C0184y> copyOnWriteArrayList, int i, @Nullable mg.n3 n3Var, long j) {
            this.zn = copyOnWriteArrayList;
            this.y = i;
            this.n3 = n3Var;
            this.f8477gv = j;
        }
    }

    void a(int i, mg.n3 n3Var, c cVar);

    void en(int i, @Nullable mg.n3 n3Var, c cVar);

    void jz(int i, @Nullable mg.n3 n3Var, i4 i4Var, c cVar);

    void mg(int i, @Nullable mg.n3 n3Var, i4 i4Var, c cVar);

    void u(int i, @Nullable mg.n3 n3Var, i4 i4Var, c cVar, IOException iOException, boolean z);

    void yt(int i, @Nullable mg.n3 n3Var, i4 i4Var, c cVar);
}
