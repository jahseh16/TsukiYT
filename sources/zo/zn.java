package zo;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.gi;
import ft.im;
import ft.xq;
import java.io.IOException;
import java.util.List;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public interface zn {

    public static final class n3 {
        public final SparseArray<y> n3;
        public final v0.wz y;

        public n3(v0.wz wzVar, SparseArray<y> sparseArray) {
            this.y = wzVar;
            SparseArray<y> sparseArray2 = new SparseArray<>(wzVar.gv());
            for (int i = 0; i < wzVar.gv(); i++) {
                int iZn = wzVar.zn(i);
                sparseArray2.append(iZn, (y) v0.y.v(sparseArray.get(iZn)));
            }
            this.n3 = sparseArray2;
        }

        public int gv() {
            return this.y.gv();
        }

        public int n3(int i) {
            return this.y.zn(i);
        }

        public boolean y(int i) {
            return this.y.y(i);
        }

        public y zn(int i) {
            return (y) v0.y.v(this.n3.get(i));
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xq f9571a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final long f9572c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f9573fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public final mg.n3 f9574gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final long f9575i9;
        public final xq n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public final mg.n3 f9576s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f9577v;
        public final long y;
        public final int zn;

        public y(long j, xq xqVar, int i, @Nullable mg.n3 n3Var, long j4, xq xqVar2, int i5, @Nullable mg.n3 n3Var2, long j7, long j8) {
            this.y = j;
            this.n3 = xqVar;
            this.zn = i;
            this.f9574gv = n3Var;
            this.f9577v = j4;
            this.f9571a = xqVar2;
            this.f9573fb = i5;
            this.f9576s = n3Var2;
            this.f9572c5 = j7;
            this.f9575i9 = j8;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || y.class != obj.getClass()) {
                return false;
            }
            y yVar = (y) obj;
            return this.y == yVar.y && this.zn == yVar.zn && this.f9577v == yVar.f9577v && this.f9573fb == yVar.f9573fb && this.f9572c5 == yVar.f9572c5 && this.f9575i9 == yVar.f9575i9 && g4.f.y(this.n3, yVar.n3) && g4.f.y(this.f9574gv, yVar.f9574gv) && g4.f.y(this.f9571a, yVar.f9571a) && g4.f.y(this.f9576s, yVar.f9576s);
        }

        public int hashCode() {
            return g4.f.n3(Long.valueOf(this.y), this.n3, Integer.valueOf(this.zn), this.f9574gv, Long.valueOf(this.f9577v), this.f9571a, Integer.valueOf(this.f9573fb), this.f9576s, Long.valueOf(this.f9572c5), Long.valueOf(this.f9575i9));
        }
    }

    @Deprecated
    void a(y yVar, String str, long j);

    void a8(y yVar, ft.g gVar, @Nullable di.c5 c5Var);

    void ap(y yVar, boolean z, int i);

    void b(y yVar, b0.a aVar);

    @Deprecated
    void bk(y yVar, int i, String str, long j);

    void c5(y yVar, im.n3 n3Var);

    @Deprecated
    void co(y yVar, ft.g gVar);

    void ct(y yVar, ft.uo uoVar);

    void d(y yVar);

    @Deprecated
    void d0(y yVar, int i, di.v vVar);

    void e(y yVar, boolean z);

    void eb(y yVar, int i, long j, long j4);

    void ej(y yVar, Exception exc);

    void en(y yVar, ur.i4 i4Var, ur.c cVar);

    void f(y yVar, di.v vVar);

    @Deprecated
    void f3(y yVar, String str, long j);

    void f7(y yVar);

    void fb(y yVar, ur.c cVar);

    void fh(y yVar, int i, long j, long j4);

    @Deprecated
    void g(y yVar, ft.g gVar);

    void g3(y yVar, String str);

    void gv(y yVar, ft.qj qjVar);

    void hw(y yVar, Metadata metadata);

    void i9(y yVar, int i);

    void j(y yVar, ur.c cVar);

    void j5(y yVar, di.v vVar);

    void jz(y yVar, gi giVar);

    void k(y yVar, ft.bv bvVar);

    void k5(y yVar, di.v vVar);

    @Deprecated
    void kp(y yVar, boolean z);

    void lc(y yVar, Exception exc);

    void m(y yVar, di.v vVar);

    void mg(y yVar, w0.mg mgVar);

    void mt(y yVar, im.v vVar, im.v vVar2, int i);

    void n(y yVar, String str, long j, long j4);

    void n3(y yVar, int i);

    void nf(y yVar, boolean z);

    void o(y yVar, long j);

    void o4(y yVar, int i, long j);

    @Deprecated
    void oz(y yVar, int i, di.v vVar);

    void p(y yVar, ft.xc xcVar);

    void q9(ft.im imVar, n3 n3Var);

    void qn(y yVar, @Nullable ft.xb xbVar, int i);

    void r(y yVar, ur.i4 i4Var, ur.c cVar);

    void ra(y yVar, int i, int i5);

    void rb(y yVar);

    void rs(y yVar, String str);

    @Deprecated
    void rz(y yVar, int i);

    @Deprecated
    void s(y yVar);

    void s8(y yVar, Exception exc);

    void ta(y yVar, n0.z6 z6Var);

    void tg(y yVar, int i, boolean z);

    void tl(y yVar, ur.i4 i4Var, ur.c cVar);

    @Deprecated
    void u(y yVar);

    void u0(y yVar, String str, long j, long j4);

    void ud(y yVar, ur.i4 i4Var, ur.c cVar, IOException iOException, boolean z);

    void ut(y yVar, ft.g gVar, @Nullable di.c5 c5Var);

    @Deprecated
    void v(y yVar, boolean z, int i);

    void vl(y yVar, Object obj, long j);

    void w(y yVar, @Nullable ft.bv bvVar);

    @Deprecated
    void wz(y yVar, int i, int i5, int i8, float f3);

    void x(y yVar);

    void x4(y yVar, boolean z);

    void xc(y yVar, long j, int i);

    void xg(y yVar, boolean z);

    void y(y yVar);

    void y4(y yVar, int i);

    @Deprecated
    void y5(y yVar);

    void yc(y yVar, Exception exc);

    void yg(y yVar, int i);

    void yt(y yVar, int i);

    @Deprecated
    void z(y yVar, List<b0.n3> list);

    @Deprecated
    void z6(y yVar, int i, ft.g gVar);

    void zn(y yVar, float f3);
}
