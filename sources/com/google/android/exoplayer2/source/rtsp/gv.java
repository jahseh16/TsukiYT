package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.a;
import com.google.android.exoplayer2.source.rtsp.fb;
import com.google.android.exoplayer2.source.rtsp.s;
import com.google.android.exoplayer2.source.rtsp.v;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import ft.q;
import hx.co;
import hx.f3;
import hx.i4;
import hx.n;
import hx.r;
import hx.w;
import hx.x4;
import hx.xc;
import hx.z;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import k4.c;
import k4.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements Closeable {

    @Nullable
    public com.google.android.exoplayer2.source.rtsp.zn c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public Uri f1824co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1825d;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public boolean f1826ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1827f;

    @Nullable
    public String f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final String f1828fb;
    public boolean fh;

    @Nullable
    public n3 n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public s.y f1830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SocketFactory f1831s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v f1833v;
    public final a y;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayDeque<a.gv> f1832t = new ArrayDeque<>();
    public final SparseArray<r> w = new SparseArray<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0056gv f1829p = new C0056gv();
    public fb z = new fb(new zn());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f1834x = -9223372036854775807L;
    public int d0 = -1;

    public interface a {
        void n3(i4 i4Var, k4.r<xc> rVar);

        void zn(String str, @Nullable Throwable th);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.gv$gv, reason: collision with other inner class name */
    public final class C0056gv {
        public r n3;
        public int y;

        public C0056gv() {
        }

        public void a(Uri uri, String str) {
            v0.y.fb(gv.this.d0 == 2);
            s(y(5, str, k4.i4.f3(), uri));
            gv.this.f1826ej = true;
        }

        public final void c5(x4 x4Var) {
            k4.r<String> rVarMt = s.mt(x4Var);
            gv.this.pz(rVarMt);
            gv.this.z.co(rVarMt);
        }

        public void f(Uri uri, String str) {
            if (gv.this.d0 == -1 || gv.this.d0 == 0) {
                return;
            }
            gv.this.d0 = 0;
            s(y(12, str, k4.i4.f3(), uri));
        }

        public void fb(Uri uri, long j, String str) {
            boolean z = true;
            if (gv.this.d0 != 1 && gv.this.d0 != 2) {
                z = false;
            }
            v0.y.fb(z);
            s(y(6, str, k4.i4.n("Range", i4.n3(j)), uri));
        }

        public void gv(int i) {
            c5(new x4(405, new v.n3(gv.this.f1828fb, gv.this.f3, i).v()));
            this.y = Math.max(this.y, i + 1);
        }

        public void i9(Uri uri, String str, @Nullable String str2) {
            gv.this.d0 = 0;
            s(y(10, str2, k4.i4.n("Transport", str), uri));
        }

        public void n3() {
            v0.y.c5(this.n3);
            k4.x4<String, String> x4VarN3 = this.n3.zn.n3();
            HashMap map = new HashMap();
            for (String str : x4VarN3.keySet()) {
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    map.put(str, (String) c.gv(x4VarN3.get(str)));
                }
            }
            s(y(this.n3.n3, gv.this.f3, map, this.n3.y));
        }

        public final void s(r rVar) {
            int i = Integer.parseInt((String) v0.y.v(rVar.zn.gv("CSeq")));
            v0.y.fb(gv.this.w.get(i) == null);
            gv.this.w.append(i, rVar);
            k4.r<String> rVarP = s.p(rVar);
            gv.this.pz(rVarP);
            gv.this.z.co(rVarP);
            this.n3 = rVar;
        }

        public void v(Uri uri, @Nullable String str) {
            s(y(4, str, k4.i4.f3(), uri));
        }

        public final r y(int i, @Nullable String str, Map<String, String> map, Uri uri) {
            String str2 = gv.this.f1828fb;
            int i5 = this.y;
            this.y = i5 + 1;
            v.n3 n3Var = new v.n3(str2, str, i5);
            if (gv.this.c != null) {
                v0.y.c5(gv.this.f1830r);
                try {
                    n3Var.n3("Authorization", gv.this.c.y(gv.this.f1830r, uri, i));
                } catch (q e4) {
                    gv.this.u0(new RtspMediaSource.zn(e4));
                }
            }
            n3Var.gv(map);
            return new r(uri, i, n3Var.v(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        }

        public void zn(Uri uri, @Nullable String str) {
            s(y(2, str, k4.i4.f3(), uri));
        }
    }

    public final class n3 implements Runnable, Closeable {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f1835fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f1837v;
        public final Handler y = ut.i4();

        public n3(long j) {
            this.f1837v = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1835fb = false;
            this.y.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            gv.this.f1829p.v(gv.this.f1824co, gv.this.f3);
            this.y.postDelayed(this, this.f1837v);
        }

        public void y() {
            if (this.f1835fb) {
                return;
            }
            this.f1835fb = true;
            this.y.postDelayed(this, this.f1837v);
        }
    }

    public interface v {
        void gv(RtspMediaSource.zn znVar);

        void v();

        void y(long j, k4.r<f3> rVar);
    }

    public final class zn implements fb.gv {
        public final Handler y = ut.i4();

        public zn() {
        }

        public final void a(List<String> list) {
            gv.this.f1829p.gv(Integer.parseInt((String) v0.y.v(s.f(list).zn.gv("CSeq"))));
        }

        public final void c5(hx.f fVar) {
            i4 i4VarGv = i4.zn;
            String str = fVar.n3.y.get("range");
            if (str != null) {
                try {
                    i4VarGv = i4.gv(str);
                } catch (q e4) {
                    gv.this.y.zn("SDP format error.", e4);
                    return;
                }
            }
            k4.r<xc> rVarM = gv.m(fVar.n3, gv.this.f1824co);
            if (rVarM.isEmpty()) {
                gv.this.y.zn("No playable track.", null);
            } else {
                gv.this.y.n3(i4VarGv, rVarM);
                gv.this.fh = true;
            }
        }

        public final void f() {
            v0.y.fb(gv.this.d0 == 2);
            gv.this.d0 = 1;
            gv.this.f1826ej = false;
            if (gv.this.f1834x != -9223372036854775807L) {
                gv gvVar = gv.this;
                gvVar.l(ut.gf(gvVar.f1834x));
            }
        }

        public final void fb(List<String> list) {
            k4.r<f3> rVarYt;
            x4 x4VarT = s.t(list);
            int i = Integer.parseInt((String) v0.y.v(x4VarT.n3.gv("CSeq")));
            r rVar = (r) gv.this.w.get(i);
            if (rVar == null) {
                return;
            }
            gv.this.w.remove(i);
            int i5 = rVar.n3;
            try {
                try {
                    int i8 = x4VarT.y;
                    if (i8 == 200) {
                        switch (i5) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case Code.UNIMPLEMENTED /* 12 */:
                                return;
                            case 2:
                                c5(new hx.f(i8, hx.c.n3(x4VarT.zn)));
                                return;
                            case 4:
                                i9(new co(i8, s.i9(x4VarT.n3.gv("Public"))));
                                return;
                            case 5:
                                f();
                                return;
                            case 6:
                                String strGv = x4VarT.n3.gv("Range");
                                i4 i4VarGv = strGv == null ? i4.zn : i4.gv(strGv);
                                try {
                                    String strGv2 = x4VarT.n3.gv("RTP-Info");
                                    rVarYt = strGv2 == null ? k4.r.yt() : f3.y(strGv2, gv.this.f1824co);
                                } catch (q unused) {
                                    rVarYt = k4.r.yt();
                                }
                                t(new z(x4VarT.y, i4VarGv, rVarYt));
                                return;
                            case 10:
                                String strGv3 = x4VarT.n3.gv("Session");
                                String strGv4 = x4VarT.n3.gv("Transport");
                                if (strGv3 == null || strGv4 == null) {
                                    throw q.gv("Missing mandatory session or transport header", null);
                                }
                                tl(new c5(x4VarT.y, s.tl(strGv3), strGv4));
                                return;
                            default:
                                throw new IllegalStateException();
                        }
                    }
                    if (i8 == 401) {
                        if (gv.this.f1830r == null || gv.this.f1825d) {
                            gv.this.u0(new RtspMediaSource.zn(s.z(i5) + " " + x4VarT.y));
                            return;
                        }
                        k4.r<String> rVarV = x4VarT.n3.v("WWW-Authenticate");
                        if (rVarV.isEmpty()) {
                            throw q.gv("Missing WWW-Authenticate header in a 401 response.", null);
                        }
                        for (int i10 = 0; i10 < rVarV.size(); i10++) {
                            gv.this.c = s.xc(rVarV.get(i10));
                            if (gv.this.c.y == 2) {
                                break;
                            }
                        }
                        gv.this.f1829p.n3();
                        gv.this.f1825d = true;
                        return;
                    }
                    if (i8 == 461) {
                        String str = s.z(i5) + " " + x4VarT.y;
                        gv.this.u0((i5 != 10 || ((String) v0.y.v(rVar.zn.gv("Transport"))).contains("TCP")) ? new RtspMediaSource.zn(str) : new RtspMediaSource.gv(str));
                        return;
                    }
                    if (i8 != 301 && i8 != 302) {
                        gv.this.u0(new RtspMediaSource.zn(s.z(i5) + " " + x4VarT.y));
                        return;
                    }
                    if (gv.this.d0 != -1) {
                        gv.this.d0 = 0;
                    }
                    String strGv5 = x4VarT.n3.gv("Location");
                    if (strGv5 == null) {
                        gv.this.y.zn("Redirection without new location.", null);
                        return;
                    }
                    Uri uri = Uri.parse(strGv5);
                    gv.this.f1824co = s.w(uri);
                    gv.this.f1830r = s.wz(uri);
                    gv.this.f1829p.zn(gv.this.f1824co, gv.this.f3);
                } catch (q e4) {
                    e = e4;
                    gv.this.u0(new RtspMediaSource.zn(e));
                }
            } catch (IllegalArgumentException e5) {
                e = e5;
                gv.this.u0(new RtspMediaSource.zn(e));
            }
        }

        public final void i9(co coVar) {
            if (gv.this.n != null) {
                return;
            }
            if (gv.cy(coVar.n3)) {
                gv.this.f1829p.zn(gv.this.f1824co, gv.this.f3);
            } else {
                gv.this.y.zn("DESCRIBE not supported.", null);
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.fb.gv
        public /* synthetic */ void n3(List list, Exception exc) {
            w.n3(this, list, exc);
        }

        public final void t(z zVar) {
            v0.y.fb(gv.this.d0 == 1);
            gv.this.d0 = 2;
            if (gv.this.n == null) {
                gv gvVar = gv.this;
                gvVar.n = gvVar.new n3(30000L);
                gv.this.n.y();
            }
            gv.this.f1834x = -9223372036854775807L;
            gv.this.f1833v.y(ut.xb(zVar.n3.y), zVar.zn);
        }

        public final void tl(c5 c5Var) {
            v0.y.fb(gv.this.d0 != -1);
            gv.this.d0 = 1;
            gv.this.f3 = c5Var.n3.y;
            gv.this.g();
        }

        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final void s(List<String> list) {
            gv.this.pz(list);
            if (s.v(list)) {
                fb(list);
            } else {
                a(list);
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.fb.gv
        public /* synthetic */ void y(Exception exc) {
            w.y(this, exc);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.fb.gv
        public void zn(final List<String> list) {
            this.y.post(new Runnable() { // from class: hx.i9
                @Override // java.lang.Runnable
                public final void run() {
                    this.y.s(list);
                }
            });
        }
    }

    public gv(a aVar, v vVar, String str, Uri uri, SocketFactory socketFactory, boolean z) {
        this.y = aVar;
        this.f1833v = vVar;
        this.f1828fb = str;
        this.f1831s = socketFactory;
        this.f1827f = z;
        this.f1824co = s.w(uri);
        this.f1830r = s.wz(uri);
    }

    public static boolean cy(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    public static k4.r<xc> m(n nVar, Uri uri) {
        r.y yVar = new r.y();
        for (int i = 0; i < nVar.n3.size(); i++) {
            hx.y yVar2 = nVar.n3.get(i);
            if (hx.s.zn(yVar2)) {
                yVar.y(new xc(yVar2, uri));
            }
        }
        return yVar.f();
    }

    public void ad(long j) {
        if (this.d0 == 2 && !this.f1826ej) {
            this.f1829p.a(this.f1824co, (String) v0.y.v(this.f3));
        }
        this.f1834x = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        n3 n3Var = this.n;
        if (n3Var != null) {
            n3Var.close();
            this.n = null;
            this.f1829p.f(this.f1824co, (String) v0.y.v(this.f3));
        }
        this.z.close();
    }

    public final void g() {
        a.gv gvVarPollFirst = this.f1832t.pollFirst();
        if (gvVarPollFirst == null) {
            this.f1833v.v();
        } else {
            this.f1829p.i9(gvVarPollFirst.zn(), gvVarPollFirst.gv(), this.f3);
        }
    }

    public void l(long j) {
        this.f1829p.fb(this.f1824co, j, (String) v0.y.v(this.f3));
    }

    public final void pz(List<String> list) {
        if (this.f1827f) {
            v0.r.n3("RtspClient", g4.s.fb("\n").gv(list));
        }
    }

    public void qj() throws IOException {
        try {
            this.z.w(y4(this.f1824co));
            this.f1829p.v(this.f1824co, this.f3);
        } catch (IOException e4) {
            ut.wz(this.z);
            throw e4;
        }
    }

    public void qk(List<a.gv> list) {
        this.f1832t.addAll(list);
        g();
    }

    public int tg() {
        return this.d0;
    }

    public final void u0(Throwable th) {
        RtspMediaSource.zn znVar = th instanceof RtspMediaSource.zn ? (RtspMediaSource.zn) th : new RtspMediaSource.zn(th);
        if (this.fh) {
            this.f1833v.gv(znVar);
        } else {
            this.y.zn(g4.z.gv(th.getMessage()), th);
        }
    }

    public void wf() {
        try {
            close();
            fb fbVar = new fb(new zn());
            this.z = fbVar;
            fbVar.w(y4(this.f1824co));
            this.f3 = null;
            this.f1825d = false;
            this.c = null;
        } catch (IOException e4) {
            this.f1833v.gv(new RtspMediaSource.zn(e4));
        }
    }

    public void xb(int i, fb.n3 n3Var) {
        this.z.p(i, n3Var);
    }

    public final Socket y4(Uri uri) throws IOException {
        v0.y.y(uri.getHost() != null);
        return this.f1831s.createSocket((String) v0.y.v(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }
}
