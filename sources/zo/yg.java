package zo;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.hjq.permissions.XXPermissions;
import ft.gi;
import ft.im;
import ft.xq;
import java.io.IOException;
import java.util.List;
import k4.i4;
import ur.mg;
import v0.z;
import zo.zn;

/* JADX INFO: loaded from: classes.dex */
public class yg implements zo.y {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f9561co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray<zn.y> f9562f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final xq.gv f9563fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v0.p f9564p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f9565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public v0.z<zn> f9566t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final xq.n3 f9567v;
    public ft.im w;
    public final v0.v y;

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public mg.n3 f9568a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public mg.n3 f9569gv;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public mg.n3 f9570v;
        public final xq.n3 y;
        public k4.r<mg.n3> n3 = k4.r.yt();
        public k4.i4<mg.n3, xq> zn = k4.i4.f3();

        public y(xq.n3 n3Var) {
            this.y = n3Var;
        }

        public static boolean c5(mg.n3 n3Var, @Nullable Object obj, boolean z, int i, int i5, int i8) {
            if (n3Var.y.equals(obj)) {
                return (z && n3Var.n3 == i && n3Var.zn == i5) || (!z && n3Var.n3 == -1 && n3Var.f8550v == i8);
            }
            return false;
        }

        @Nullable
        public static mg.n3 zn(ft.im imVar, k4.r<mg.n3> rVar, @Nullable mg.n3 n3Var, xq.n3 n3Var2) {
            xq xqVarYt = imVar.yt();
            int iY5 = imVar.y5();
            Object objP = xqVarYt.r() ? null : xqVarYt.p(iY5);
            int iFb = (imVar.i9() || xqVarYt.r()) ? -1 : xqVarYt.i9(iY5, n3Var2).fb(v0.ut.xb(imVar.getCurrentPosition()) - n3Var2.p());
            for (int i = 0; i < rVar.size(); i++) {
                mg.n3 n3Var3 = rVar.get(i);
                if (c5(n3Var3, objP, imVar.i9(), imVar.z6(), imVar.rs(), iFb)) {
                    return n3Var3;
                }
            }
            if (rVar.isEmpty() && n3Var != null) {
                if (c5(n3Var, objP, imVar.i9(), imVar.z6(), imVar.rs(), iFb)) {
                    return n3Var;
                }
            }
            return null;
        }

        @Nullable
        public xq a(mg.n3 n3Var) {
            return this.zn.get(n3Var);
        }

        public void f(List<mg.n3> list, @Nullable mg.n3 n3Var, ft.im imVar) {
            this.n3 = k4.r.rz(list);
            if (!list.isEmpty()) {
                this.f9570v = list.get(0);
                this.f9568a = (mg.n3) v0.y.v(n3Var);
            }
            if (this.f9569gv == null) {
                this.f9569gv = zn(imVar, this.n3, this.f9570v, this.y);
            }
            tl(imVar.yt());
        }

        @Nullable
        public mg.n3 fb() {
            return this.f9570v;
        }

        @Nullable
        public mg.n3 gv() {
            return this.f9569gv;
        }

        public void i9(ft.im imVar) {
            this.f9569gv = zn(imVar, this.n3, this.f9570v, this.y);
        }

        public final void n3(i4.y<mg.n3, xq> yVar, @Nullable mg.n3 n3Var, xq xqVar) {
            if (n3Var == null) {
                return;
            }
            if (xqVar.a(n3Var.y) != -1) {
                yVar.gv(n3Var, xqVar);
                return;
            }
            xq xqVar2 = this.zn.get(n3Var);
            if (xqVar2 != null) {
                yVar.gv(n3Var, xqVar2);
            }
        }

        @Nullable
        public mg.n3 s() {
            return this.f9568a;
        }

        public void t(ft.im imVar) {
            this.f9569gv = zn(imVar, this.n3, this.f9570v, this.y);
            tl(imVar.yt());
        }

        public final void tl(xq xqVar) {
            i4.y<mg.n3, xq> yVarY = k4.i4.y();
            if (this.n3.isEmpty()) {
                n3(yVarY, this.f9570v, xqVar);
                if (!g4.f.y(this.f9568a, this.f9570v)) {
                    n3(yVarY, this.f9568a, xqVar);
                }
                if (!g4.f.y(this.f9569gv, this.f9570v) && !g4.f.y(this.f9569gv, this.f9568a)) {
                    n3(yVarY, this.f9569gv, xqVar);
                }
            } else {
                for (int i = 0; i < this.n3.size(); i++) {
                    n3(yVarY, this.n3.get(i), xqVar);
                }
                if (!this.n3.contains(this.f9569gv)) {
                    n3(yVarY, this.f9569gv, xqVar);
                }
            }
            this.zn = yVarY.n3();
        }

        @Nullable
        public mg.n3 v() {
            if (this.n3.isEmpty()) {
                return null;
            }
            return (mg.n3) k4.c.gv(this.n3);
        }
    }

    public yg(v0.v vVar) {
        this.y = (v0.v) v0.y.v(vVar);
        this.f9566t = new v0.z<>(v0.ut.j5(), vVar, new z.n3() { // from class: zo.rz
            @Override // v0.z.n3
            public final void y(Object obj, v0.wz wzVar) {
                yg.nd((zn) obj, wzVar);
            }
        });
        xq.n3 n3Var = new xq.n3();
        this.f9567v = n3Var;
        this.f9563fb = new xq.gv();
        this.f9565s = new y(n3Var);
        this.f9562f = new SparseArray<>();
    }

    public static /* synthetic */ void cx(zn.y yVar, boolean z, zn znVar) {
        znVar.kp(yVar, z);
        znVar.nf(yVar, z);
    }

    public static /* synthetic */ void e5(zn.y yVar, di.v vVar, zn znVar) {
        znVar.j5(yVar, vVar);
        znVar.d0(yVar, 2, vVar);
    }

    public static /* synthetic */ void fc(zn.y yVar, String str, long j, long j4, zn znVar) {
        znVar.a(yVar, str, j);
        znVar.u0(yVar, str, j4, j);
        znVar.bk(yVar, 1, str, j);
    }

    public static /* synthetic */ void fq(zn.y yVar, int i, im.v vVar, im.v vVar2, zn znVar) {
        znVar.rz(yVar, i);
        znVar.mt(yVar, vVar, vVar2, i);
    }

    public static /* synthetic */ void i(zn.y yVar, int i, zn znVar) {
        znVar.y5(yVar);
        znVar.yt(yVar, i);
    }

    public static /* synthetic */ void i1(zn.y yVar, w0.mg mgVar, zn znVar) {
        znVar.mg(yVar, mgVar);
        znVar.wz(yVar, mgVar.y, mgVar.f8904v, mgVar.f8902fb, mgVar.f8903s);
    }

    public static /* synthetic */ void im(zn.y yVar, di.v vVar, zn znVar) {
        znVar.f(yVar, vVar);
        znVar.d0(yVar, 1, vVar);
    }

    public static /* synthetic */ void l3(zn.y yVar, di.v vVar, zn znVar) {
        znVar.k5(yVar, vVar);
        znVar.oz(yVar, 2, vVar);
    }

    public static /* synthetic */ void mh(zn.y yVar, ft.g gVar, di.c5 c5Var, zn znVar) {
        znVar.g(yVar, gVar);
        znVar.a8(yVar, gVar, c5Var);
        znVar.z6(yVar, 1, gVar);
    }

    public static /* synthetic */ void nh(zn.y yVar, ft.g gVar, di.c5 c5Var, zn znVar) {
        znVar.co(yVar, gVar);
        znVar.ut(yVar, gVar, c5Var);
        znVar.z6(yVar, 2, gVar);
    }

    public static /* synthetic */ void ou(zn.y yVar, String str, long j, long j4, zn znVar) {
        znVar.f3(yVar, str, j);
        znVar.n(yVar, str, j4, j);
        znVar.bk(yVar, 2, str, j);
    }

    public static /* synthetic */ void uo(zn.y yVar, di.v vVar, zn znVar) {
        znVar.m(yVar, vVar);
        znVar.oz(yVar, 1, vVar);
    }

    @Override // ur.b
    public final void a(int i, @Nullable mg.n3 n3Var, final ur.c cVar) {
        final zn.y yVarJ3 = j3(i, n3Var);
        jm(yVarJ3, 1005, new z.y() { // from class: zo.qn
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).j(yVarJ3, cVar);
            }
        });
    }

    @Override // zo.y
    public void b(final ft.im imVar, Looper looper) {
        v0.y.fb(this.w == null || this.f9565s.n3.isEmpty());
        this.w = (ft.im) v0.y.v(imVar);
        this.f9564p = this.y.n3(looper, null);
        this.f9566t = this.f9566t.v(looper, new z.n3() { // from class: zo.wz
            @Override // v0.z.n3
            public final void y(Object obj, v0.wz wzVar) {
                this.y.z8(imVar, (zn) obj, wzVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.v
    public final void c(int i, @Nullable mg.n3 n3Var) {
        final zn.y yVarJ3 = j3(i, n3Var);
        jm(yVarJ3, 1026, new z.y() { // from class: zo.xg
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).f7(yVarJ3);
            }
        });
    }

    @Override // zo.y
    public final void c5(final di.v vVar) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1015, new z.y() { // from class: zo.n
            @Override // v0.z.y
            public final void invoke(Object obj) {
                yg.e5(yVarQ, vVar, (zn) obj);
            }
        });
    }

    @Override // zo.y
    public final void co(final ft.g gVar, @Nullable final di.c5 c5Var) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1009, new z.y() { // from class: zo.fb
            @Override // v0.z.y
            public final void invoke(Object obj) {
                yg.mh(yVarQ, gVar, c5Var, (zn) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.v
    public /* synthetic */ void d0(int i, mg.n3 n3Var) {
        v5.f.y(this, i, n3Var);
    }

    @Override // ur.b
    public final void en(int i, @Nullable mg.n3 n3Var, final ur.c cVar) {
        final zn.y yVarJ3 = j3(i, n3Var);
        jm(yVarJ3, 1004, new z.y() { // from class: zo.p
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).fb(yVarJ3, cVar);
            }
        });
    }

    @Override // zo.y
    public final void f(final long j) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1010, new z.y() { // from class: zo.ej
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).o(yVarQ, j);
            }
        });
    }

    @Override // zo.y
    public final void f3(final long j, final int i) {
        final zn.y yVarNe = ne();
        jm(yVarNe, 1021, new z.y() { // from class: zo.j5
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).xc(yVarNe, j, i);
            }
        });
    }

    @Override // zo.y
    public final void fb(final String str) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1012, new z.y() { // from class: zo.d
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).rs(yVarQ, str);
            }
        });
    }

    @Override // r0.a.y
    public final void fh(final int i, final long j, final long j4) {
        final zn.y yVarVn = vn();
        jm(yVarVn, 1006, new z.y() { // from class: zo.c
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).fh(yVarVn, i, j, j4);
            }
        });
    }

    @Override // zo.y
    public final void gv(final Exception exc) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1014, new z.y() { // from class: zo.hw
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).s8(yVarQ, exc);
            }
        });
    }

    public final zn.y i2(xq xqVar, int i, @Nullable mg.n3 n3Var) {
        mg.n3 n3Var2 = xqVar.r() ? null : n3Var;
        long jElapsedRealtime = this.y.elapsedRealtime();
        boolean z = xqVar.equals(this.w.yt()) && i == this.w.g3();
        long jGv = 0;
        if (n3Var2 == null || !n3Var2.n3()) {
            if (z) {
                jGv = this.w.ap();
            } else if (!xqVar.r()) {
                jGv = xqVar.mt(i, this.f9563fb).gv();
            }
        } else if (z && this.w.z6() == n3Var2.n3 && this.w.rs() == n3Var2.zn) {
            jGv = this.w.getCurrentPosition();
        }
        return new zn.y(jElapsedRealtime, xqVar, i, n3Var2, jGv, this.w.yt(), this.w.g3(), this.f9565s.gv(), this.w.getCurrentPosition(), this.w.t());
    }

    public final zn.y i3(@Nullable mg.n3 n3Var) {
        v0.y.v(this.w);
        xq xqVarA = n3Var == null ? null : this.f9565s.a(n3Var);
        if (n3Var != null && xqVarA != null) {
            return i2(xqVarA, xqVarA.t(n3Var.y, this.f9567v).f5172fb, n3Var);
        }
        int iG3 = this.w.g3();
        xq xqVarYt = this.w.yt();
        if (iG3 >= xqVarYt.z()) {
            xqVarYt = xq.y;
        }
        return i2(xqVarYt, iG3, null);
    }

    @Override // zo.y
    public final void i4(final int i, final long j, final long j4) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1011, new z.y() { // from class: zo.rs
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).eb(yVarQ, i, j, j4);
            }
        });
    }

    @Override // zo.y
    public final void i9(final di.v vVar) {
        final zn.y yVarNe = ne();
        jm(yVarNe, 1013, new z.y() { // from class: zo.ta
            @Override // v0.z.y
            public final void invoke(Object obj) {
                yg.uo(yVarNe, vVar, (zn) obj);
            }
        });
    }

    public final void ih() {
        final zn.y yVarYk = yk();
        jm(yVarYk, 1028, new z.y() { // from class: zo.eb
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).d(yVarYk);
            }
        });
        this.f9566t.i9();
    }

    public final zn.y j3(int i, @Nullable mg.n3 n3Var) {
        v0.y.v(this.w);
        if (n3Var != null) {
            return this.f9565s.a(n3Var) != null ? i3(n3Var) : i2(xq.y, i, n3Var);
        }
        xq xqVarYt = this.w.yt();
        if (i >= xqVarYt.z()) {
            xqVarYt = xq.y;
        }
        return i2(xqVarYt, i, null);
    }

    public final void jm(zn.y yVar, int i, z.y<zn> yVar2) {
        this.f9562f.put(i, yVar);
        this.f9566t.t(i, yVar2);
    }

    @Override // ur.b
    public final void jz(int i, @Nullable mg.n3 n3Var, final ur.i4 i4Var, final ur.c cVar) {
        final zn.y yVarJ3 = j3(i, n3Var);
        jm(yVarJ3, 1002, new z.y() { // from class: zo.ra
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).r(yVarJ3, i4Var, cVar);
            }
        });
    }

    @Override // ur.b
    public final void mg(int i, @Nullable mg.n3 n3Var, final ur.i4 i4Var, final ur.c cVar) {
        final zn.y yVarJ3 = j3(i, n3Var);
        jm(yVarJ3, 1001, new z.y() { // from class: zo.f
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).tl(yVarJ3, i4Var, cVar);
            }
        });
    }

    @Override // zo.y
    public final void mt(final Object obj, final long j) {
        final zn.y yVarQ = q();
        jm(yVarQ, 26, new z.y() { // from class: zo.ct
            @Override // v0.z.y
            public final void invoke(Object obj2) {
                ((zn) obj2).vl(yVarQ, obj, j);
            }
        });
    }

    @Override // zo.y
    public void n(zn znVar) {
        v0.y.v(znVar);
        this.f9566t.zn(znVar);
    }

    @Override // zo.y
    public final void n3(final String str) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1019, new z.y() { // from class: zo.y5
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).g3(yVarQ, str);
            }
        });
    }

    public final zn.y ne() {
        return i3(this.f9565s.fb());
    }

    @Override // ft.im.gv
    public void onAvailableCommandsChanged(final im.n3 n3Var) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 13, new z.y() { // from class: zo.i4
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).c5(yVarYk, n3Var);
            }
        });
    }

    @Override // ft.im.gv
    public void onCues(final List<b0.n3> list) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 27, new z.y() { // from class: zo.a8
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).z(yVarYk, list);
            }
        });
    }

    @Override // ft.im.gv
    public void onDeviceInfoChanged(final ft.xc xcVar) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 29, new z.y() { // from class: zo.en
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).p(yVarYk, xcVar);
            }
        });
    }

    @Override // ft.im.gv
    public void onDeviceVolumeChanged(final int i, final boolean z) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 30, new z.y() { // from class: zo.jz
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).tg(yVarYk, i, z);
            }
        });
    }

    @Override // ft.im.gv
    public final void onIsLoadingChanged(final boolean z) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 3, new z.y() { // from class: zo.o4
            @Override // v0.z.y
            public final void invoke(Object obj) {
                yg.cx(yVarYk, z, (zn) obj);
            }
        });
    }

    @Override // ft.im.gv
    public void onIsPlayingChanged(final boolean z) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 7, new z.y() { // from class: zo.s8
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).xg(yVarYk, z);
            }
        });
    }

    @Override // ft.im.gv
    public final void onMediaItemTransition(@Nullable final ft.xb xbVar, final int i) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 1, new z.y() { // from class: zo.r
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).qn(yVarYk, xbVar, i);
            }
        });
    }

    @Override // ft.im.gv
    public void onMediaMetadataChanged(final ft.qj qjVar) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 14, new z.y() { // from class: zo.s
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).gv(yVarYk, qjVar);
            }
        });
    }

    @Override // ft.im.gv
    public final void onMetadata(final Metadata metadata) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 28, new z.y() { // from class: zo.u
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).hw(yVarYk, metadata);
            }
        });
    }

    @Override // ft.im.gv
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 5, new z.y() { // from class: zo.xc
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).ap(yVarYk, z, i);
            }
        });
    }

    @Override // ft.im.gv
    public final void onPlaybackParametersChanged(final ft.uo uoVar) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 12, new z.y() { // from class: zo.i9
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).ct(yVarYk, uoVar);
            }
        });
    }

    @Override // ft.im.gv
    public final void onPlaybackStateChanged(final int i) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 4, new z.y() { // from class: zo.d0
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).yg(yVarYk, i);
            }
        });
    }

    @Override // ft.im.gv
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 6, new z.y() { // from class: zo.vl
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).y4(yVarYk, i);
            }
        });
    }

    @Override // ft.im.gv
    public final void onPlayerError(final ft.bv bvVar) {
        final zn.y yVarWm = wm(bvVar);
        jm(yVarWm, 10, new z.y() { // from class: zo.z
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).k(yVarWm, bvVar);
            }
        });
    }

    @Override // ft.im.gv
    public void onPlayerErrorChanged(@Nullable final ft.bv bvVar) {
        final zn.y yVarWm = wm(bvVar);
        jm(yVarWm, 10, new z.y() { // from class: zo.yt
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).w(yVarWm, bvVar);
            }
        });
    }

    @Override // ft.im.gv
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final zn.y yVarYk = yk();
        jm(yVarYk, -1, new z.y() { // from class: zo.t
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).v(yVarYk, z, i);
            }
        });
    }

    @Override // ft.im.gv
    public void onPositionDiscontinuity(int i) {
    }

    @Override // ft.im.gv
    public final void onRepeatModeChanged(final int i) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 8, new z.y() { // from class: zo.z6
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).n3(yVarYk, i);
            }
        });
    }

    @Override // ft.im.gv
    public final void onSeekProcessed() {
        final zn.y yVarYk = yk();
        jm(yVarYk, -1, new z.y() { // from class: zo.w
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).s(yVarYk);
            }
        });
    }

    @Override // ft.im.gv
    public final void onShuffleModeEnabledChanged(final boolean z) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 9, new z.y() { // from class: zo.a
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).e(yVarYk, z);
            }
        });
    }

    @Override // ft.im.gv
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        final zn.y yVarQ = q();
        jm(yVarQ, 23, new z.y() { // from class: zo.e
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).x4(yVarQ, z);
            }
        });
    }

    @Override // ft.im.gv
    public final void onSurfaceSizeChanged(final int i, final int i5) {
        final zn.y yVarQ = q();
        jm(yVarQ, 24, new z.y() { // from class: zo.mt
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).ra(yVarQ, i, i5);
            }
        });
    }

    @Override // ft.im.gv
    public final void onTimelineChanged(xq xqVar, final int i) {
        this.f9565s.t((ft.im) v0.y.v(this.w));
        final zn.y yVarYk = yk();
        jm(yVarYk, 0, new z.y() { // from class: zo.q9
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).i9(yVarYk, i);
            }
        });
    }

    @Override // ft.im.gv
    public void onTrackSelectionParametersChanged(final n0.z6 z6Var) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 19, new z.y() { // from class: zo.mg
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).ta(yVarYk, z6Var);
            }
        });
    }

    @Override // ft.im.gv
    public void onTracksChanged(final gi giVar) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 2, new z.y() { // from class: zo.b
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).jz(yVarYk, giVar);
            }
        });
    }

    @Override // ft.im.gv
    public final void onVideoSizeChanged(final w0.mg mgVar) {
        final zn.y yVarQ = q();
        jm(yVarQ, 25, new z.y() { // from class: zo.dm
            @Override // v0.z.y
            public final void invoke(Object obj) {
                yg.i1(yVarQ, mgVar, (zn) obj);
            }
        });
    }

    @Override // ft.im.gv
    public final void onVolumeChanged(final float f3) {
        final zn.y yVarQ = q();
        jm(yVarQ, 22, new z.y() { // from class: zo.f7
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).zn(yVarQ, f3);
            }
        });
    }

    @Override // zo.y
    public final void p(final int i, final long j) {
        final zn.y yVarNe = ne();
        jm(yVarNe, 1018, new z.y() { // from class: zo.k5
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).o4(yVarNe, i, j);
            }
        });
    }

    public final zn.y q() {
        return i3(this.f9565s.s());
    }

    @Override // zo.y
    public void qn(zn znVar) {
        this.f9566t.f(znVar);
    }

    @Override // zo.y
    public final void r(final Exception exc) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1029, new z.y() { // from class: zo.v
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).yc(yVarQ, exc);
            }
        });
    }

    @Override // zo.y
    public void release() {
        ((v0.p) v0.y.c5(this.f9564p)).c5(new Runnable() { // from class: zo.c5
            @Override // java.lang.Runnable
            public final void run() {
                this.y.ih();
            }
        });
    }

    @Override // zo.y
    public final void rz() {
        if (this.f9561co) {
            return;
        }
        final zn.y yVarYk = yk();
        this.f9561co = true;
        jm(yVarYk, -1, new z.y() { // from class: zo.tl
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).u(yVarYk);
            }
        });
    }

    @Override // zo.y
    public final void s(final String str, final long j, final long j4) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1008, new z.y() { // from class: zo.gv
            @Override // v0.z.y
            public final void invoke(Object obj) {
                yg.fc(yVarQ, str, j4, j, (zn) obj);
            }
        });
    }

    @Override // zo.y
    public final void t(final ft.g gVar, @Nullable final di.c5 c5Var) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1017, new z.y() { // from class: zo.f3
            @Override // v0.z.y
            public final void invoke(Object obj) {
                yg.nh(yVarQ, gVar, c5Var, (zn) obj);
            }
        });
    }

    @Override // zo.y
    public final void ta(List<mg.n3> list, @Nullable mg.n3 n3Var) {
        this.f9565s.f(list, n3Var, (ft.im) v0.y.v(this.w));
    }

    @Override // zo.y
    public final void tl(final Exception exc) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1030, new z.y() { // from class: zo.ap
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).lc(yVarQ, exc);
            }
        });
    }

    @Override // ur.b
    public final void u(int i, @Nullable mg.n3 n3Var, final ur.i4 i4Var, final ur.c cVar, final IOException iOException, final boolean z) {
        final zn.y yVarJ3 = j3(i, n3Var);
        jm(yVarJ3, 1003, new z.y() { // from class: zo.co
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).ud(yVarJ3, i4Var, cVar, iOException, z);
            }
        });
    }

    @Override // zo.y
    public final void v(final String str, final long j, final long j4) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1016, new z.y() { // from class: zo.fh
            @Override // v0.z.y
            public final void invoke(Object obj) {
                yg.ou(yVarQ, str, j4, j, (zn) obj);
            }
        });
    }

    public final zn.y vn() {
        return i3(this.f9565s.v());
    }

    @Override // com.google.android.exoplayer2.drm.v
    public final void w(int i, @Nullable mg.n3 n3Var, final Exception exc) {
        final zn.y yVarJ3 = j3(i, n3Var);
        jm(yVarJ3, UserMetadata.MAX_ATTRIBUTE_SIZE, new z.y() { // from class: zo.o
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).ej(yVarJ3, exc);
            }
        });
    }

    public final zn.y wm(@Nullable ft.bv bvVar) {
        ur.fh fhVar;
        return (!(bvVar instanceof ft.p) || (fhVar = ((ft.p) bvVar).mediaPeriodId) == null) ? yk() : i3(new mg.n3(fhVar));
    }

    @Override // zo.y
    public final void wz(final di.v vVar) {
        final zn.y yVarQ = q();
        jm(yVarQ, 1007, new z.y() { // from class: zo.oz
            @Override // v0.z.y
            public final void invoke(Object obj) {
                yg.im(yVarQ, vVar, (zn) obj);
            }
        });
    }

    @Override // zo.y
    public final void x4(final di.v vVar) {
        final zn.y yVarNe = ne();
        jm(yVarNe, 1020, new z.y() { // from class: zo.x
            @Override // v0.z.y
            public final void invoke(Object obj) {
                yg.l3(yVarNe, vVar, (zn) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.v
    public final void xc(int i, @Nullable mg.n3 n3Var) {
        final zn.y yVarJ3 = j3(i, n3Var);
        jm(yVarJ3, 1027, new z.y() { // from class: zo.ud
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).y(yVarJ3);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.v
    public final void y(int i, @Nullable mg.n3 n3Var, final int i5) {
        final zn.y yVarJ3 = j3(i, n3Var);
        jm(yVarJ3, 1022, new z.y() { // from class: zo.k
            @Override // v0.z.y
            public final void invoke(Object obj) {
                yg.i(yVarJ3, i5, (zn) obj);
            }
        });
    }

    public final zn.y yk() {
        return i3(this.f9565s.gv());
    }

    @Override // ur.b
    public final void yt(int i, @Nullable mg.n3 n3Var, final ur.i4 i4Var, final ur.c cVar) {
        final zn.y yVarJ3 = j3(i, n3Var);
        jm(yVarJ3, 1000, new z.y() { // from class: zo.ut
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).en(yVarJ3, i4Var, cVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.v
    public final void z(int i, @Nullable mg.n3 n3Var) {
        final zn.y yVarJ3 = j3(i, n3Var);
        jm(yVarJ3, XXPermissions.REQUEST_CODE, new z.y() { // from class: zo.nf
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).x(yVarJ3);
            }
        });
    }

    public final /* synthetic */ void z8(ft.im imVar, zn znVar, v0.wz wzVar) {
        znVar.q9(imVar, new zn.n3(wzVar, this.f9562f));
    }

    @Override // com.google.android.exoplayer2.drm.v
    public final void zn(int i, @Nullable mg.n3 n3Var) {
        final zn.y yVarJ3 = j3(i, n3Var);
        jm(yVarJ3, 1023, new z.y() { // from class: zo.lc
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).rb(yVarJ3);
            }
        });
    }

    @Override // ft.im.gv
    public final void onPositionDiscontinuity(final im.v vVar, final im.v vVar2, final int i) {
        if (i == 1) {
            this.f9561co = false;
        }
        this.f9565s.i9((ft.im) v0.y.v(this.w));
        final zn.y yVarYk = yk();
        jm(yVarYk, 11, new z.y() { // from class: zo.j
            @Override // v0.z.y
            public final void invoke(Object obj) {
                yg.fq(yVarYk, i, vVar, vVar2, (zn) obj);
            }
        });
    }

    @Override // ft.im.gv
    public void onCues(final b0.a aVar) {
        final zn.y yVarYk = yk();
        jm(yVarYk, 27, new z.y() { // from class: zo.x4
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((zn) obj).b(yVarYk, aVar);
            }
        });
    }

    @Override // ft.im.gv
    public void onRenderedFirstFrame() {
    }

    @Override // ft.im.gv
    public void onLoadingChanged(boolean z) {
    }

    public static /* synthetic */ void nd(zn znVar, v0.wz wzVar) {
    }

    @Override // ft.im.gv
    public void onEvents(ft.im imVar, im.zn znVar) {
    }
}
