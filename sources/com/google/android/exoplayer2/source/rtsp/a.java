package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import b1.fh;
import b1.wz;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.fb;
import com.google.android.exoplayer2.source.rtsp.gv;
import com.google.android.exoplayer2.source.rtsp.n3;
import com.google.android.exoplayer2.source.rtsp.y;
import ft.g;
import ft.p1;
import ft.u0;
import hx.f3;
import hx.i4;
import hx.xc;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import k4.r;
import n0.c;
import r0.ta;
import ur.d0;
import ur.en;
import ur.f7;
import ur.lc;
import ur.rs;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1796b;
    public long c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public d0.y f1797co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1798d;
    public long d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public boolean f1799ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<v> f1800f;

    @Nullable
    public RtspMediaSource.zn f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final n3 f1801fb;
    public boolean fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public int f1802hw;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public boolean f1803j5;
    public long n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y.InterfaceC0057y f1804p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public IOException f1805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.rtsp.gv f1806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<gv> f1807t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f1808v = ut.i4();
    public final zn w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1809x;
    public final r0.n3 y;
    public r<rs> z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.a$a, reason: collision with other inner class name */
    public final class C0054a implements en {
        public final int y;

        public C0054a(int i) {
            this.y = i;
        }

        @Override // ur.en
        public int a(u0 u0Var, di.fb fbVar, int i) {
            return a.this.ut(this.y, u0Var, fbVar, i);
        }

        @Override // ur.en
        public boolean isReady() {
            return a.this.qn(this.y);
        }

        @Override // ur.en
        public void n3() throws RtspMediaSource.zn {
            if (a.this.f3 != null) {
                throw a.this.f3;
            }
        }

        @Override // ur.en
        public int w(long j) {
            return a.this.en(this.y, j);
        }
    }

    public final class gv {
        public final com.google.android.exoplayer2.source.rtsp.n3 n3;
        public final xc y;

        @Nullable
        public String zn;

        public gv(xc xcVar, int i, y.InterfaceC0057y interfaceC0057y) {
            this.y = xcVar;
            this.n3 = new com.google.android.exoplayer2.source.rtsp.n3(i, xcVar, new n3.y() { // from class: hx.wz
                @Override // com.google.android.exoplayer2.source.rtsp.n3.y
                public final void y(String str, com.google.android.exoplayer2.source.rtsp.y yVar) {
                    this.y.a(str, yVar);
                }
            }, a.this.f1801fb, interfaceC0057y);
        }

        public final /* synthetic */ void a(String str, com.google.android.exoplayer2.source.rtsp.y yVar) {
            this.zn = str;
            fb.n3 n3VarT = yVar.t();
            if (n3VarT != null) {
                a.this.f1806s.xb(yVar.gv(), n3VarT);
                a.this.f1803j5 = true;
            }
            a.this.oz();
        }

        public String gv() {
            v0.y.c5(this.zn);
            return this.zn;
        }

        public boolean v() {
            return this.zn != null;
        }

        public Uri zn() {
            return this.n3.n3.n3;
        }
    }

    public final class v {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f1813gv;
        public final ta n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f1814v;
        public final gv y;
        public final f7 zn;

        public v(xc xcVar, int i, y.InterfaceC0057y interfaceC0057y) {
            this.y = a.this.new gv(xcVar, i, interfaceC0057y);
            this.n3 = new ta("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i);
            f7 f7VarT = f7.t(a.this.y);
            this.zn = f7VarT;
            f7VarT.xg(a.this.f1801fb);
        }

        public int a(u0 u0Var, di.fb fbVar, int i) {
            return this.zn.o(u0Var, fbVar, i, this.f1813gv);
        }

        public int c5(long j) {
            int iTa = this.zn.ta(j, this.f1813gv);
            this.zn.dm(iTa);
            return iTa;
        }

        public void fb() {
            if (this.f1814v) {
                return;
            }
            this.n3.t();
            this.zn.j();
            this.f1814v = true;
        }

        public long gv() {
            return this.zn.c();
        }

        public void i9() {
            this.n3.wz(this.y.n3, a.this.f1801fb, 0);
        }

        public void s(long j) {
            if (this.f1813gv) {
                return;
            }
            this.y.n3.zn();
            this.zn.ut();
            this.zn.u(j);
        }

        public boolean v() {
            return this.zn.x(this.f1813gv);
        }

        public void zn() {
            if (this.f1813gv) {
                return;
            }
            this.y.n3.f();
            this.f1813gv = true;
            a.this.u();
        }
    }

    public interface zn {
        void n3();

        void y(i4 i4Var);
    }

    public a(r0.n3 n3Var, y.InterfaceC0057y interfaceC0057y, Uri uri, zn znVar, String str, SocketFactory socketFactory, boolean z) {
        this.y = n3Var;
        this.f1804p = interfaceC0057y;
        this.w = znVar;
        n3 n3Var2 = new n3();
        this.f1801fb = n3Var2;
        this.f1806s = new com.google.android.exoplayer2.source.rtsp.gv(n3Var2, n3Var2, str, uri, socketFactory, z);
        this.f1800f = new ArrayList();
        this.f1807t = new ArrayList();
        this.c = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.d0 = -9223372036854775807L;
    }

    private boolean f7(long j) {
        for (int i = 0; i < this.f1800f.size(); i++) {
            if (!this.f1800f.get(i).zn.en(j, false)) {
                return false;
            }
        }
        return true;
    }

    public static r<rs> hw(r<v> rVar) {
        r.y yVar = new r.y();
        for (int i = 0; i < rVar.size(); i++) {
            yVar.y(new rs(Integer.toString(i), (g) v0.y.v(rVar.get(i).zn.d())));
        }
        return yVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f1799ej || this.f1809x) {
            return;
        }
        for (int i = 0; i < this.f1800f.size(); i++) {
            if (this.f1800f.get(i).zn.d() == null) {
                return;
            }
        }
        this.f1809x = true;
        this.z = hw(r.rz(this.f1800f));
        ((d0.y) v0.y.v(this.f1797co)).xc(this);
    }

    private boolean jz() {
        return this.f1798d;
    }

    public static /* synthetic */ int n3(a aVar) {
        int i = aVar.f1802hw;
        aVar.f1802hw = i + 1;
        return i;
    }

    @Override // ur.d0
    public void c5(d0.y yVar, long j) {
        this.f1797co = yVar;
        try {
            this.f1806s.qj();
        } catch (IOException e4) {
            this.f1805r = e4;
            ut.wz(this.f1806s);
        }
    }

    @Override // ur.d0
    public void co(long j, boolean z) {
        if (o()) {
            return;
        }
        for (int i = 0; i < this.f1800f.size(); i++) {
            v vVar = this.f1800f.get(i);
            if (!vVar.f1813gv) {
                vVar.zn.p(j, z, true);
            }
        }
    }

    public int en(int i, long j) {
        if (jz()) {
            return -3;
        }
        return this.f1800f.get(i).c5(j);
    }

    @Override // ur.d0
    public long f(c[] cVarArr, boolean[] zArr, en[] enVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < cVarArr.length; i++) {
            if (enVarArr[i] != null && (cVarArr[i] == null || !zArr[i])) {
                enVarArr[i] = null;
            }
        }
        this.f1807t.clear();
        for (int i5 = 0; i5 < cVarArr.length; i5++) {
            c cVar = cVarArr[i5];
            if (cVar != null) {
                rs rsVarTl = cVar.tl();
                int iIndexOf = ((r) v0.y.v(this.z)).indexOf(rsVarTl);
                this.f1807t.add(((v) v0.y.v(this.f1800f.get(iIndexOf))).y);
                if (this.z.contains(rsVarTl) && enVarArr[i5] == null) {
                    enVarArr[i5] = new C0054a(iIndexOf);
                    zArr2[i5] = true;
                }
            }
        }
        for (int i8 = 0; i8 < this.f1800f.size(); i8++) {
            v vVar = this.f1800f.get(i8);
            if (!this.f1807t.contains(vVar.y)) {
                vVar.zn();
            }
        }
        this.f1796b = true;
        if (j != 0) {
            this.n = j;
            this.c = j;
            this.d0 = j;
        }
        oz();
        return j;
    }

    @Override // ur.d0, ur.jz
    public long fb() {
        if (this.fh || this.f1800f.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j = this.n;
        if (j != -9223372036854775807L) {
            return j;
        }
        boolean z = true;
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.f1800f.size(); i++) {
            v vVar = this.f1800f.get(i);
            if (!vVar.f1813gv) {
                jMin = Math.min(jMin, vVar.gv());
                z = false;
            }
        }
        if (z || jMin == Long.MIN_VALUE) {
            return 0L;
        }
        return jMin;
    }

    @Override // ur.d0
    public long i9(long j) {
        if (fb() == 0 && !this.f1803j5) {
            this.d0 = j;
            return j;
        }
        co(j, false);
        this.n = j;
        if (o()) {
            int iTg = this.f1806s.tg();
            if (iTg == 1) {
                return j;
            }
            if (iTg != 2) {
                throw new IllegalStateException();
            }
            this.c = j;
            this.f1806s.ad(j);
            return j;
        }
        if (f7(j)) {
            return j;
        }
        this.c = j;
        this.f1806s.ad(j);
        for (int i = 0; i < this.f1800f.size(); i++) {
            this.f1800f.get(i).s(j);
        }
        return j;
    }

    @Nullable
    public final com.google.android.exoplayer2.source.rtsp.n3 j5(Uri uri) {
        for (int i = 0; i < this.f1800f.size(); i++) {
            if (!this.f1800f.get(i).f1813gv) {
                gv gvVar = this.f1800f.get(i).y;
                if (gvVar.zn().equals(uri)) {
                    return gvVar.n3;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        this.f1803j5 = true;
        this.f1806s.wf();
        y.InterfaceC0057y interfaceC0057yN3 = this.f1804p.n3();
        if (interfaceC0057yN3 == null) {
            this.f3 = new RtspMediaSource.zn("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f1800f.size());
        ArrayList arrayList2 = new ArrayList(this.f1807t.size());
        for (int i = 0; i < this.f1800f.size(); i++) {
            v vVar = this.f1800f.get(i);
            if (vVar.f1813gv) {
                arrayList.add(vVar);
            } else {
                v vVar2 = new v(vVar.y.y, i, interfaceC0057yN3);
                arrayList.add(vVar2);
                vVar2.i9();
                if (this.f1807t.contains(vVar.y)) {
                    arrayList2.add(vVar2.y);
                }
            }
        }
        r rVarRz = r.rz(this.f1800f);
        this.f1800f.clear();
        this.f1800f.addAll(arrayList);
        this.f1807t.clear();
        this.f1807t.addAll(arrayList2);
        for (int i5 = 0; i5 < rVarRz.size(); i5++) {
            ((v) rVarRz.get(i5)).zn();
        }
    }

    @Override // ur.d0
    public lc mt() {
        v0.y.fb(this.f1809x);
        return new lc((rs[]) ((r) v0.y.v(this.z)).toArray(new rs[0]));
    }

    public final boolean o() {
        return this.c != -9223372036854775807L;
    }

    public final void oz() {
        boolean zV = true;
        for (int i = 0; i < this.f1807t.size(); i++) {
            zV &= this.f1807t.get(i).v();
        }
        if (zV && this.f1796b) {
            this.f1806s.qk(this.f1807t);
        }
    }

    public void q9() {
        for (int i = 0; i < this.f1800f.size(); i++) {
            this.f1800f.get(i).fb();
        }
        ut.wz(this.f1806s);
        this.f1799ej = true;
    }

    public boolean qn(int i) {
        return !jz() && this.f1800f.get(i).v();
    }

    @Override // ur.d0, ur.jz
    public void s(long j) {
    }

    @Override // ur.d0
    public long t() {
        if (!this.f1798d) {
            return -9223372036854775807L;
        }
        this.f1798d = false;
        return 0L;
    }

    public final void u() {
        this.fh = true;
        for (int i = 0; i < this.f1800f.size(); i++) {
            this.fh &= this.f1800f.get(i).f1813gv;
        }
    }

    public int ut(int i, u0 u0Var, di.fb fbVar, int i5) {
        if (jz()) {
            return -3;
        }
        return this.f1800f.get(i).a(u0Var, fbVar, i5);
    }

    @Override // ur.d0, ur.jz
    public boolean v(long j) {
        return y();
    }

    @Override // ur.d0
    public void wz() throws IOException {
        IOException iOException = this.f1805r;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // ur.d0, ur.jz
    public boolean y() {
        return !this.fh;
    }

    @Override // ur.d0, ur.jz
    public long zn() {
        return fb();
    }

    public final class n3 implements wz, ta.n3<com.google.android.exoplayer2.source.rtsp.n3>, f7.gv, gv.a, gv.v {
        public n3() {
        }

        @Override // b1.wz
        public b1.ta a(int i, int i5) {
            return ((v) v0.y.v((v) a.this.f1800f.get(i))).zn;
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void j5(com.google.android.exoplayer2.source.rtsp.n3 n3Var, long j, long j4, boolean z) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.gv.v
        public void gv(RtspMediaSource.zn znVar) {
            if (!(znVar instanceof RtspMediaSource.gv) || a.this.f1803j5) {
                a.this.f3 = znVar;
            } else {
                a.this.k();
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.gv.a
        public void n3(i4 i4Var, r<xc> rVar) {
            for (int i = 0; i < rVar.size(); i++) {
                xc xcVar = rVar.get(i);
                a aVar = a.this;
                v vVar = aVar.new v(xcVar, i, aVar.f1804p);
                a.this.f1800f.add(vVar);
                vVar.i9();
            }
            a.this.w.y(i4Var);
        }

        @Override // b1.wz
        public void p() {
            Handler handler = a.this.f1808v;
            final a aVar = a.this;
            handler.post(new Runnable() { // from class: hx.t
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.j();
                }
            });
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void xc(com.google.android.exoplayer2.source.rtsp.n3 n3Var, long j, long j4) {
            if (a.this.fb() == 0) {
                if (a.this.f1803j5) {
                    return;
                }
                a.this.k();
                return;
            }
            for (int i = 0; i < a.this.f1800f.size(); i++) {
                v vVar = (v) a.this.f1800f.get(i);
                if (vVar.y.n3 == n3Var) {
                    vVar.zn();
                    return;
                }
            }
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: tl, reason: merged with bridge method [inline-methods] */
        public ta.zn fh(com.google.android.exoplayer2.source.rtsp.n3 n3Var, long j, long j4, IOException iOException, int i) {
            if (!a.this.f1809x) {
                a.this.f1805r = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                a.this.f3 = new RtspMediaSource.zn(n3Var.n3.n3.toString(), iOException);
            } else if (a.n3(a.this) < 3) {
                return ta.f7550gv;
            }
            return ta.f7548a;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.gv.v
        public void v() {
            a.this.f1806s.l(a.this.c != -9223372036854775807L ? ut.gf(a.this.c) : a.this.d0 != -9223372036854775807L ? ut.gf(a.this.d0) : 0L);
        }

        @Override // ur.f7.gv
        public void w(g gVar) {
            Handler handler = a.this.f1808v;
            final a aVar = a.this;
            handler.post(new Runnable() { // from class: hx.tl
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.j();
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.rtsp.gv.v
        public void y(long j, r<f3> rVar) {
            ArrayList arrayList = new ArrayList(rVar.size());
            for (int i = 0; i < rVar.size(); i++) {
                arrayList.add((String) v0.y.v(rVar.get(i).zn.getPath()));
            }
            for (int i5 = 0; i5 < a.this.f1807t.size(); i5++) {
                if (!arrayList.contains(((gv) a.this.f1807t.get(i5)).zn().getPath())) {
                    a.this.w.n3();
                    if (a.this.o()) {
                        a.this.f1798d = true;
                        a.this.c = -9223372036854775807L;
                        a.this.n = -9223372036854775807L;
                        a.this.d0 = -9223372036854775807L;
                    }
                }
            }
            for (int i8 = 0; i8 < rVar.size(); i8++) {
                f3 f3Var = rVar.get(i8);
                com.google.android.exoplayer2.source.rtsp.n3 n3VarJ5 = a.this.j5(f3Var.zn);
                if (n3VarJ5 != null) {
                    n3VarJ5.a(f3Var.y);
                    n3VarJ5.v(f3Var.n3);
                    if (a.this.o() && a.this.c == a.this.n) {
                        n3VarJ5.gv(j, f3Var.y);
                    }
                }
            }
            if (!a.this.o()) {
                if (a.this.d0 == -9223372036854775807L || !a.this.f1803j5) {
                    return;
                }
                a aVar = a.this;
                aVar.i9(aVar.d0);
                a.this.d0 = -9223372036854775807L;
                return;
            }
            if (a.this.c == a.this.n) {
                a.this.c = -9223372036854775807L;
                a.this.n = -9223372036854775807L;
            } else {
                a.this.c = -9223372036854775807L;
                a aVar2 = a.this;
                aVar2.i9(aVar2.n);
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.gv.a
        public void zn(String str, @Nullable Throwable th) {
            a.this.f1805r = th == null ? new IOException(str) : new IOException(str, th);
        }

        @Override // b1.wz
        public void z(fh fhVar) {
        }
    }

    @Override // ur.d0
    public long gv(long j, p1 p1Var) {
        return j;
    }
}
