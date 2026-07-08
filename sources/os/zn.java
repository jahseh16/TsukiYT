package os;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.protobuf.Reader;
import ft.q;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.c;
import os.fb;
import os.i9;
import os.s;
import os.t;
import r0.d0;
import r0.mg;
import r0.ta;
import r0.tl;
import r0.z6;
import ur.b;
import ur.i4;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements t, ta.n3<z6<c5>> {
    public static final t.y fh = new t.y() { // from class: os.n3
        @Override // os.t.y
        public final t y(nr.fb fbVar, mg mgVar, f fVar) {
            return new zn(fbVar, mgVar, fVar);
        }
    };
    public boolean c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public Handler f7266co;
    public long d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList<t.n3> f7267f;

    @Nullable
    public Uri f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final mg f7268fb;

    @Nullable
    public fb n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ta f7269p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public s f7270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap<Uri, C0142zn> f7271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final double f7272t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f7273v;

    @Nullable
    public b.y w;
    public final nr.fb y;

    @Nullable
    public t.v z;

    public class n3 implements t.n3 {
        public n3() {
        }

        @Override // os.t.n3
        public void a() {
            zn.this.f7267f.remove(this);
        }

        @Override // os.t.n3
        public boolean n3(Uri uri, mg.zn znVar, boolean z) {
            C0142zn c0142zn;
            if (zn.this.n == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List<s.n3> list = ((s) ut.i9(zn.this.f7270r)).f7261v;
                int i = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    C0142zn c0142zn2 = (C0142zn) zn.this.f7271s.get(list.get(i5).y);
                    if (c0142zn2 != null && jElapsedRealtime < c0142zn2.f7277p) {
                        i++;
                    }
                }
                mg.n3 n3VarN3 = zn.this.f7268fb.n3(new mg.y(1, 0, zn.this.f7270r.f7261v.size(), i), znVar);
                if (n3VarN3 != null && n3VarN3.y == 2 && (c0142zn = (C0142zn) zn.this.f7271s.get(uri)) != null) {
                    c0142zn.s(n3VarN3.n3);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: os.zn$zn, reason: collision with other inner class name */
    public final class C0142zn implements ta.n3<z6<c5>> {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public boolean f7274co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f7275f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final tl f7276fb;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f7277p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public fb f7279s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f7280t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final ta f7281v = new ta("DefaultHlsPlaylistTracker:MediaPlaylist");
        public long w;
        public final Uri y;

        @Nullable
        public IOException z;

        public C0142zn(Uri uri) {
            this.y = uri;
            this.f7276fb = zn.this.y.y(4);
        }

        public final Uri c5() {
            fb fbVar = this.f7279s;
            if (fbVar != null) {
                fb.a aVar = fbVar.f7208x4;
                if (aVar.y != -9223372036854775807L || aVar.f7211v) {
                    Uri.Builder builderBuildUpon = this.y.buildUpon();
                    fb fbVar2 = this.f7279s;
                    if (fbVar2.f7208x4.f7211v) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fbVar2.f7196f + ((long) fbVar2.f7200mt.size())));
                        fb fbVar3 = this.f7279s;
                        if (fbVar3.f7207wz != -9223372036854775807L) {
                            List<fb.n3> list = fbVar3.f7195co;
                            int size = list.size();
                            if (!list.isEmpty() && ((fb.n3) c.gv(list)).n) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    fb.a aVar2 = this.f7279s.f7208x4;
                    if (aVar2.y != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", aVar2.n3 ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.y;
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: co, reason: merged with bridge method [inline-methods] */
        public void xc(z6<c5> z6Var, long j, long j4) {
            c5 c5VarZn = z6Var.zn();
            i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
            if (c5VarZn instanceof fb) {
                r((fb) c5VarZn, i4Var);
                zn.this.w.z(i4Var, 4);
            } else {
                this.z = q.gv("Loaded playlist has unexpected type.", null);
                zn.this.w.f3(i4Var, 4, this.z, true);
            }
            zn.this.f7268fb.gv(z6Var.y);
        }

        public boolean f() {
            int i;
            if (this.f7279s == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, ut.gf(this.f7279s.f7202r));
            fb fbVar = this.f7279s;
            return fbVar.f7209xc || (i = fbVar.f7198gv) == 2 || i == 1 || this.f7275f + jMax > jElapsedRealtime;
        }

        @Nullable
        public fb i9() {
            return this.f7279s;
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: mt, reason: merged with bridge method [inline-methods] */
        public void j5(z6<c5> z6Var, long j, long j4, boolean z) {
            i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
            zn.this.f7268fb.gv(z6Var.y);
            zn.this.w.p(i4Var, 4);
        }

        public void p() throws IOException {
            this.f7281v.n3();
            IOException iOException = this.z;
            if (iOException != null) {
                throw iOException;
            }
        }

        public final void r(fb fbVar, i4 i4Var) {
            boolean z;
            fb fbVar2 = this.f7279s;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f7275f = jElapsedRealtime;
            fb fbVarTa = zn.this.ta(fbVar2, fbVar);
            this.f7279s = fbVarTa;
            IOException gvVar = null;
            if (fbVarTa != fbVar2) {
                this.z = null;
                this.f7280t = jElapsedRealtime;
                zn.this.hw(this.y, fbVarTa);
            } else if (!fbVarTa.f7209xc) {
                if (fbVar.f7196f + ((long) fbVar.f7200mt.size()) < this.f7279s.f7196f) {
                    gvVar = new t.zn(this.y);
                    z = true;
                } else {
                    double d4 = jElapsedRealtime - this.f7280t;
                    double dGf = ut.gf(r12.f7205tl) * zn.this.f7272t;
                    z = false;
                    if (d4 > dGf) {
                        gvVar = new t.gv(this.y);
                    }
                }
                if (gvVar != null) {
                    this.z = gvVar;
                    zn.this.b(this.y, new mg.zn(i4Var, new ur.c(4), gvVar, 1), z);
                }
            }
            fb fbVar3 = this.f7279s;
            this.w = jElapsedRealtime + ut.gf(!fbVar3.f7208x4.f7211v ? fbVar3 != fbVar2 ? fbVar3.f7205tl : fbVar3.f7205tl / 2 : 0L);
            if ((this.f7279s.f7207wz != -9223372036854775807L || this.y.equals(zn.this.f3)) && !this.f7279s.f7209xc) {
                w(c5());
            }
        }

        public final boolean s(long j) {
            this.f7277p = SystemClock.elapsedRealtime() + j;
            return this.y.equals(zn.this.f3) && !zn.this.a8();
        }

        public final /* synthetic */ void t(Uri uri) {
            this.f7274co = false;
            wz(uri);
        }

        public void tl() {
            w(this.y);
        }

        public final void w(final Uri uri) {
            this.f7277p = 0L;
            if (this.f7274co || this.f7281v.i9() || this.f7281v.c5()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.w) {
                wz(uri);
            } else {
                this.f7274co = true;
                zn.this.f7266co.postDelayed(new Runnable() { // from class: os.gv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.t(uri);
                    }
                }, this.w - jElapsedRealtime);
            }
        }

        public final void wz(Uri uri) {
            z6 z6Var = new z6(this.f7276fb, uri, 4, zn.this.f7273v.y(zn.this.f7270r, this.f7279s));
            zn.this.w.c(new i4(z6Var.y, z6Var.n3, this.f7281v.wz(z6Var, this, zn.this.f7268fb.zn(z6Var.zn))), z6Var.zn);
        }

        public void x4() {
            this.f7281v.t();
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public ta.zn fh(z6<c5> z6Var, long j, long j4, IOException iOException, int i) {
            ta.zn znVarS;
            i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
            boolean z = iOException instanceof i9.y;
            if ((z6Var.gv().getQueryParameter("_HLS_msn") != null) || z) {
                int i5 = iOException instanceof d0.v ? ((d0.v) iOException).responseCode : Reader.READ_DONE;
                if (z || i5 == 400 || i5 == 503) {
                    this.w = SystemClock.elapsedRealtime();
                    tl();
                    ((b.y) ut.i9(zn.this.w)).f3(i4Var, z6Var.zn, iOException, true);
                    return ta.f7548a;
                }
            }
            mg.zn znVar = new mg.zn(i4Var, new ur.c(z6Var.zn), iOException, i);
            if (zn.this.b(this.y, znVar, false)) {
                long jY = zn.this.f7268fb.y(znVar);
                znVarS = jY != -9223372036854775807L ? ta.s(false, jY) : ta.f7549fb;
            } else {
                znVarS = ta.f7548a;
            }
            boolean zZn = znVarS.zn();
            zn.this.w.f3(i4Var, z6Var.zn, iOException, !zZn);
            if (!zZn) {
                zn.this.f7268fb.gv(z6Var.y);
            }
            return znVarS;
        }
    }

    public zn(nr.fb fbVar, mg mgVar, f fVar) {
        this(fbVar, mgVar, fVar, 3.5d);
    }

    public static fb.gv mg(fb fbVar, fb fbVar2) {
        int i = (int) (fbVar2.f7196f - fbVar.f7196f);
        List<fb.gv> list = fbVar.f7200mt;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    @Override // os.t
    public void a(t.n3 n3Var) {
        v0.y.v(n3Var);
        this.f7267f.add(n3Var);
    }

    public final boolean a8() {
        List<s.n3> list = this.f7270r.f7261v;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C0142zn c0142zn = (C0142zn) v0.y.v(this.f7271s.get(list.get(i).y));
            if (jElapsedRealtime > c0142zn.f7277p) {
                Uri uri = c0142zn.y;
                this.f3 = uri;
                c0142zn.w(ej(uri));
                return true;
            }
        }
        return false;
    }

    public final boolean b(Uri uri, mg.zn znVar, boolean z) {
        Iterator<t.n3> it = this.f7267f.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= !it.next().n3(uri, znVar, z);
        }
        return z5;
    }

    @Override // os.t
    public boolean c5(Uri uri, long j) {
        if (this.f7271s.get(uri) != null) {
            return !r2.s(j);
        }
        return false;
    }

    public final int d(@Nullable fb fbVar, fb fbVar2) {
        fb.gv gvVarMg;
        if (fbVar2.f7194c5) {
            return fbVar2.f7199i9;
        }
        fb fbVar3 = this.n;
        int i = fbVar3 != null ? fbVar3.f7199i9 : 0;
        return (fbVar == null || (gvVarMg = mg(fbVar, fbVar2)) == null) ? i : (fbVar.f7199i9 + gvVarMg.f7217s) - fbVar2.f7200mt.get(0).f7217s;
    }

    public final Uri ej(Uri uri) {
        fb.zn znVar;
        fb fbVar = this.n;
        if (fbVar == null || !fbVar.f7208x4.f7211v || (znVar = fbVar.z.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(znVar.n3));
        int i = znVar.zn;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    @Override // os.t
    @Nullable
    public fb f(Uri uri, boolean z) {
        fb fbVarI9 = this.f7271s.get(uri).i9();
        if (fbVarI9 != null && z) {
            x(uri);
        }
        return fbVarI9;
    }

    @Override // os.t
    public boolean fb(Uri uri) {
        return this.f7271s.get(uri).f();
    }

    @Override // os.t
    @Nullable
    public s gv() {
        return this.f7270r;
    }

    public final void hw(Uri uri, fb fbVar) {
        if (uri.equals(this.f3)) {
            if (this.n == null) {
                this.c = !fbVar.f7209xc;
                this.d0 = fbVar.f7203s;
            }
            this.n = fbVar;
            this.z.a8(fbVar);
        }
        Iterator<t.n3> it = this.f7267f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // os.t
    public void i9() throws IOException {
        ta taVar = this.f7269p;
        if (taVar != null) {
            taVar.n3();
        }
        Uri uri = this.f3;
        if (uri != null) {
            y(uri);
        }
    }

    @Override // os.t
    public boolean isLive() {
        return this.c;
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: k5, reason: merged with bridge method [inline-methods] */
    public void j5(z6<c5> z6Var, long j, long j4, boolean z) {
        i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
        this.f7268fb.gv(z6Var.y);
        this.w.p(i4Var, 4);
    }

    @Override // os.t
    public void n3(t.n3 n3Var) {
        this.f7267f.remove(n3Var);
    }

    public final void rz(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.f7271s.put(uri, new C0142zn(uri));
        }
    }

    @Override // os.t
    public void s(Uri uri, b.y yVar, t.v vVar) {
        this.f7266co = ut.i4();
        this.w = yVar;
        this.z = vVar;
        z6 z6Var = new z6(this.y.y(4), uri, 4, this.f7273v.n3());
        v0.y.fb(this.f7269p == null);
        ta taVar = new ta("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f7269p = taVar;
        yVar.c(new i4(z6Var.y, z6Var.n3, taVar.wz(z6Var, this, this.f7268fb.zn(z6Var.zn))), z6Var.zn);
    }

    @Override // os.t
    public void stop() {
        this.f3 = null;
        this.n = null;
        this.f7270r = null;
        this.d0 = -9223372036854775807L;
        this.f7269p.t();
        this.f7269p = null;
        Iterator<C0142zn> it = this.f7271s.values().iterator();
        while (it.hasNext()) {
            it.next().x4();
        }
        this.f7266co.removeCallbacksAndMessages(null);
        this.f7266co = null;
        this.f7271s.clear();
    }

    public final fb ta(@Nullable fb fbVar, fb fbVar2) {
        return !fbVar2.a(fbVar) ? fbVar2.f7209xc ? fbVar.gv() : fbVar : fbVar2.zn(z6(fbVar, fbVar2), d(fbVar, fbVar2));
    }

    public final boolean ud(Uri uri) {
        List<s.n3> list = this.f7270r.f7261v;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).y)) {
                return true;
            }
        }
        return false;
    }

    @Override // os.t
    public void v(Uri uri) {
        this.f7271s.get(uri).tl();
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: vl, reason: merged with bridge method [inline-methods] */
    public ta.zn fh(z6<c5> z6Var, long j, long j4, IOException iOException, int i) {
        i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
        long jY = this.f7268fb.y(new mg.zn(i4Var, new ur.c(z6Var.zn), iOException, i));
        boolean z = jY == -9223372036854775807L;
        this.w.f3(i4Var, z6Var.zn, iOException, z);
        if (z) {
            this.f7268fb.gv(z6Var.y);
        }
        return z ? ta.f7549fb : ta.s(false, jY);
    }

    public final void x(Uri uri) {
        if (uri.equals(this.f3) || !ud(uri)) {
            return;
        }
        fb fbVar = this.n;
        if (fbVar == null || !fbVar.f7209xc) {
            this.f3 = uri;
            C0142zn c0142zn = this.f7271s.get(uri);
            fb fbVar2 = c0142zn.f7279s;
            if (fbVar2 == null || !fbVar2.f7209xc) {
                c0142zn.w(ej(uri));
            } else {
                this.n = fbVar2;
                this.z.a8(fbVar2);
            }
        }
    }

    @Override // os.t
    public void y(Uri uri) throws IOException {
        this.f7271s.get(uri).p();
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: yt, reason: merged with bridge method [inline-methods] */
    public void xc(z6<c5> z6Var, long j, long j4) {
        c5 c5VarZn = z6Var.zn();
        boolean z = c5VarZn instanceof fb;
        s sVarV = z ? s.v(c5VarZn.y) : (s) c5VarZn;
        this.f7270r = sVarV;
        this.f3 = sVarV.f7261v.get(0).y;
        this.f7267f.add(new n3());
        rz(sVarV.f7256gv);
        i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
        C0142zn c0142zn = this.f7271s.get(this.f3);
        if (z) {
            c0142zn.r((fb) c5VarZn, i4Var);
        } else {
            c0142zn.tl();
        }
        this.f7268fb.gv(z6Var.y);
        this.w.z(i4Var, 4);
    }

    public final long z6(@Nullable fb fbVar, fb fbVar2) {
        if (fbVar2.w) {
            return fbVar2.f7203s;
        }
        fb fbVar3 = this.n;
        long j = fbVar3 != null ? fbVar3.f7203s : 0L;
        if (fbVar == null) {
            return j;
        }
        int size = fbVar.f7200mt.size();
        fb.gv gvVarMg = mg(fbVar, fbVar2);
        return gvVarMg != null ? fbVar.f7203s + gvVarMg.f7213f : ((long) size) == fbVar2.f7196f - fbVar.f7196f ? fbVar.v() : j;
    }

    @Override // os.t
    public long zn() {
        return this.d0;
    }

    public zn(nr.fb fbVar, mg mgVar, f fVar, double d4) {
        this.y = fbVar;
        this.f7273v = fVar;
        this.f7268fb = mgVar;
        this.f7272t = d4;
        this.f7267f = new CopyOnWriteArrayList<>();
        this.f7271s = new HashMap<>();
        this.d0 = -9223372036854775807L;
    }
}
