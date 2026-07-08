package ur;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import b1.fh;
import com.google.android.exoplayer2.drm.v;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import ft.g;
import ft.p1;
import ft.q;
import ft.u0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r0.mg;
import r0.p;
import r0.ta;
import ur.b;
import ur.d0;
import ur.f7;
import ur.x4;

/* JADX INFO: loaded from: classes.dex */
public final class j implements d0, b1.wz, ta.n3<y>, ta.a, f7.gv {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public final String f8565co;
    public boolean ct;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public d0.y f8566d;
    public int dm;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    @Nullable
    public IcyHeaders f8567ej;
    public int en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b.y f8568f;
    public final vl f3;
    public boolean f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.a f8569fb;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public boolean f8570hw;
    public b1.fh j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public boolean f8571j5;
    public boolean jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8572k;
    public v o;
    public boolean o4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0.n3 f8573p;
    public boolean qn;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0.mg f8575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v.y f8576t;
    public long u;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public boolean f8577ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r0.tl f8578v;
    public final n3 w;
    public boolean xg;
    public final Uri y;
    public final long z;
    public static final Map<String, String> rs = x();

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public static final g f8563eb = new g.n3().oz("icy").o4("application/x-icy").z6();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r0.ta f8574r = new r0.ta("ProgressiveMediaPeriod");
    public final v0.s n = new v0.s();
    public final Runnable c = new Runnable() { // from class: ur.hw
        @Override // java.lang.Runnable
        public final void run() {
            this.y.oz();
        }
    };
    public final Runnable d0 = new Runnable() { // from class: ur.j5
        @Override // java.lang.Runnable
        public final void run() {
            this.y.qn();
        }
    };
    public final Handler fh = v0.ut.i4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gv[] f8564b = new gv[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f7[] f8579x = new f7[0];
    public long y5 = -9223372036854775807L;
    public long oz = -9223372036854775807L;
    public int q9 = 1;

    public static final class gv {
        public final boolean n3;
        public final int y;

        public gv(int i, boolean z) {
            this.y = i;
            this.n3 = z;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || gv.class != obj.getClass()) {
                return false;
            }
            gv gvVar = (gv) obj;
            return this.y == gvVar.y && this.n3 == gvVar.n3;
        }

        public int hashCode() {
            return (this.y * 31) + (this.n3 ? 1 : 0);
        }
    }

    public interface n3 {
        void y(long j, boolean z, boolean z5);
    }

    public static final class v {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final boolean[] f8580gv;
        public final boolean[] n3;
        public final lc y;
        public final boolean[] zn;

        public v(lc lcVar, boolean[] zArr) {
            this.y = lcVar;
            this.n3 = zArr;
            int i = lcVar.y;
            this.zn = new boolean[i];
            this.f8580gv = new boolean[i];
        }
    }

    public final class y implements ta.v, x4.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v0.s f8581a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final vl f8585gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public long f8586i9;
        public final Uri n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public volatile boolean f8587s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public b1.ta f8588t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public boolean f8589tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final b1.wz f8590v;
        public final r0.j5 zn;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final b1.d0 f8584fb = new b1.d0();

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public boolean f8582c5 = true;
        public final long y = i4.y();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public r0.p f8583f = fb(0);

        public y(Uri uri, r0.tl tlVar, vl vlVar, b1.wz wzVar, v0.s sVar) {
            this.n3 = uri;
            this.zn = new r0.j5(tlVar);
            this.f8585gv = vlVar;
            this.f8590v = wzVar;
            this.f8581a = sVar;
        }

        private r0.p fb(long j) {
            return new p.n3().c5(this.n3).s(j).a(j.this.f8565co).n3(6).v(j.rs).y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(long j, long j4) {
            this.f8584fb.y = j;
            this.f8586i9 = j4;
            this.f8582c5 = true;
            this.f8589tl = false;
        }

        @Override // r0.ta.v
        public void f() {
            this.f8587s = true;
        }

        @Override // r0.ta.v
        public void i9() throws IOException {
            int iGv = 0;
            while (iGv == 0 && !this.f8587s) {
                try {
                    long j = this.f8584fb.y;
                    r0.p pVarFb = fb(j);
                    this.f8583f = pVarFb;
                    long jY = this.zn.y(pVarFb);
                    if (jY != -1) {
                        jY += j;
                        j.this.en();
                    }
                    long j4 = jY;
                    j.this.f8567ej = IcyHeaders.y(this.zn.fb());
                    r0.c5 x4Var = this.zn;
                    if (j.this.f8567ej != null && j.this.f8567ej.f1593t != -1) {
                        x4Var = new x4(this.zn, j.this.f8567ej.f1593t, this);
                        b1.ta taVarYt = j.this.yt();
                        this.f8588t = taVarYt;
                        taVarYt.y(j.f8563eb);
                    }
                    long jZn = j;
                    this.f8585gv.v(x4Var, this.n3, this.zn.fb(), j, j4, this.f8590v);
                    if (j.this.f8567ej != null) {
                        this.f8585gv.n3();
                    }
                    if (this.f8582c5) {
                        this.f8585gv.y(jZn, this.f8586i9);
                        this.f8582c5 = false;
                    }
                    while (true) {
                        long j7 = jZn;
                        while (iGv == 0 && !this.f8587s) {
                            try {
                                this.f8581a.y();
                                iGv = this.f8585gv.gv(this.f8584fb);
                                jZn = this.f8585gv.zn();
                                if (jZn > j.this.z + j7) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f8581a.gv();
                        j.this.fh.post(j.this.d0);
                    }
                    if (iGv == 1) {
                        iGv = 0;
                    } else if (this.f8585gv.zn() != -1) {
                        this.f8584fb.y = this.f8585gv.zn();
                    }
                    r0.w.y(this.zn);
                } catch (Throwable th) {
                    if (iGv != 1 && this.f8585gv.zn() != -1) {
                        this.f8584fb.y = this.f8585gv.zn();
                    }
                    r0.w.y(this.zn);
                    throw th;
                }
            }
        }

        @Override // ur.x4.y
        public void y(v0.d dVar) {
            long jMax = !this.f8589tl ? this.f8586i9 : Math.max(j.this.k5(true), this.f8586i9);
            int iY = dVar.y();
            b1.ta taVar = (b1.ta) v0.y.v(this.f8588t);
            taVar.n3(dVar, iY);
            taVar.a(jMax, 1, iY, 0, null);
            this.f8589tl = true;
        }
    }

    public final class zn implements en {
        public final int y;

        public zn(int i) {
            this.y = i;
        }

        @Override // ur.en
        public int a(u0 u0Var, di.fb fbVar, int i) {
            return j.this.dm(this.y, u0Var, fbVar, i);
        }

        @Override // ur.en
        public boolean isReady() {
            return j.this.hw(this.y);
        }

        @Override // ur.en
        public void n3() throws IOException {
            j.this.f7(this.y);
        }

        @Override // ur.en
        public int w(long j) {
            return j.this.eb(this.y, j);
        }
    }

    public j(Uri uri, r0.tl tlVar, vl vlVar, com.google.android.exoplayer2.drm.a aVar, v.y yVar, r0.mg mgVar, b.y yVar2, n3 n3Var, r0.n3 n3Var2, @Nullable String str, int i) {
        this.y = uri;
        this.f8578v = tlVar;
        this.f8569fb = aVar;
        this.f8576t = yVar;
        this.f8575s = mgVar;
        this.f8568f = yVar2;
        this.w = n3Var;
        this.f8573p = n3Var2;
        this.f8565co = str;
        this.z = i;
        this.f3 = vlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long k5(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.f8579x.length; i++) {
            if (z || ((v) v0.y.v(this.o)).zn[i]) {
                jMax = Math.max(jMax, this.f8579x[i].c());
            }
        }
        return jMax;
    }

    private void lc() {
        y yVar = new y(this.y, this.f8578v, this.f3, this, this.n);
        if (this.f8571j5) {
            v0.y.fb(vl());
            long j = this.oz;
            if (j != -9223372036854775807L && this.y5 > j) {
                this.ct = true;
                this.y5 = -9223372036854775807L;
                return;
            }
            yVar.s(((b1.fh) v0.y.v(this.j)).v(this.y5).y.n3, this.y5);
            for (f7 f7Var : this.f8579x) {
                f7Var.u(this.y5);
            }
            this.y5 = -9223372036854775807L;
        }
        this.dm = b();
        this.f8568f.d0(new i4(yVar.y, yVar.f8583f, this.f8574r.wz(yVar, this, this.f8575s.zn(this.q9))), 1, -1, null, 0, null, yVar.f8586i9, this.oz);
    }

    private boolean nf() {
        return this.f7 || vl();
    }

    private boolean o4(boolean[] zArr, long j) {
        int length = this.f8579x.length;
        for (int i = 0; i < length; i++) {
            if (!this.f8579x[i].en(j, false) && (zArr[i] || !this.qn)) {
                return false;
            }
        }
        return true;
    }

    private void q9(int i) {
        ud();
        boolean[] zArr = this.o.n3;
        if (this.xg && zArr[i]) {
            if (this.f8579x[i].x(false)) {
                return;
            }
            this.y5 = 0L;
            this.xg = false;
            this.f7 = true;
            this.u = 0L;
            this.dm = 0;
            for (f7 f7Var : this.f8579x) {
                f7Var.ut();
            }
            ((d0.y) v0.y.v(this.f8566d)).a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qn() {
        if (this.o4) {
            return;
        }
        ((d0.y) v0.y.v(this.f8566d)).a(this);
    }

    private void ut(int i) {
        ud();
        v vVar = this.o;
        boolean[] zArr = vVar.f8580gv;
        if (zArr[i]) {
            return;
        }
        g gVarZn = vVar.y.n3(i).zn(0);
        this.f8568f.c5(v0.n.f(gVarZn.f3), gVarZn, 0, null, this.u);
        zArr[i] = true;
    }

    private boolean vl() {
        return this.y5 != -9223372036854775807L;
    }

    public static Map<String, String> x() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    @Override // b1.wz
    public b1.ta a(int i, int i5) {
        return xg(new gv(i, false));
    }

    public final boolean a8(y yVar, int i) {
        b1.fh fhVar;
        if (this.jz || !((fhVar = this.j) == null || fhVar.c5() == -9223372036854775807L)) {
            this.dm = i;
            return true;
        }
        if (this.f8571j5 && !nf()) {
            this.xg = true;
            return false;
        }
        this.f7 = this.f8571j5;
        this.u = 0L;
        this.dm = 0;
        for (f7 f7Var : this.f8579x) {
            f7Var.ut();
        }
        yVar.s(0L, 0L);
        return true;
    }

    public final int b() {
        int iZ6 = 0;
        for (f7 f7Var : this.f8579x) {
            iZ6 += f7Var.z6();
        }
        return iZ6;
    }

    @Override // ur.d0
    public void c5(d0.y yVar, long j) {
        this.f8566d = yVar;
        this.n.a();
        lc();
    }

    @Override // ur.d0
    public void co(long j, boolean z) {
        ud();
        if (vl()) {
            return;
        }
        boolean[] zArr = this.o.zn;
        int length = this.f8579x.length;
        for (int i = 0; i < length; i++) {
            this.f8579x[i].p(j, z, zArr[i]);
        }
    }

    public void ct() {
        if (this.f8571j5) {
            for (f7 f7Var : this.f8579x) {
                f7Var.qn();
            }
        }
        this.f8574r.tl(this);
        this.fh.removeCallbacksAndMessages(null);
        this.f8566d = null;
        this.o4 = true;
    }

    public int dm(int i, u0 u0Var, di.fb fbVar, int i5) {
        if (nf()) {
            return -3;
        }
        ut(i);
        int iO = this.f8579x[i].o(u0Var, fbVar, i5, this.ct);
        if (iO == -3) {
            q9(i);
        }
        return iO;
    }

    public int eb(int i, long j) {
        if (nf()) {
            return 0;
        }
        ut(i);
        f7 f7Var = this.f8579x[i];
        int iTa = f7Var.ta(j, this.ct);
        f7Var.dm(iTa);
        if (iTa == 0) {
            q9(i);
        }
        return iTa;
    }

    public final void en() {
        this.fh.post(new Runnable() { // from class: ur.qn
            @Override // java.lang.Runnable
            public final void run() {
                this.y.o();
            }
        });
    }

    @Override // ur.d0
    public long f(n0.c[] cVarArr, boolean[] zArr, en[] enVarArr, boolean[] zArr2, long j) {
        n0.c cVar;
        ud();
        v vVar = this.o;
        lc lcVar = vVar.y;
        boolean[] zArr3 = vVar.zn;
        int i = this.en;
        int i5 = 0;
        for (int i8 = 0; i8 < cVarArr.length; i8++) {
            en enVar = enVarArr[i8];
            if (enVar != null && (cVarArr[i8] == null || !zArr[i8])) {
                int i10 = ((zn) enVar).y;
                v0.y.fb(zArr3[i10]);
                this.en--;
                zArr3[i10] = false;
                enVarArr[i8] = null;
            }
        }
        boolean z = !this.f8572k ? j == 0 : i != 0;
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            if (enVarArr[i11] == null && (cVar = cVarArr[i11]) != null) {
                v0.y.fb(cVar.length() == 1);
                v0.y.fb(cVar.a(0) == 0);
                int iZn = lcVar.zn(cVar.tl());
                v0.y.fb(!zArr3[iZn]);
                this.en++;
                zArr3[iZn] = true;
                enVarArr[i11] = new zn(iZn);
                zArr2[i11] = true;
                if (!z) {
                    f7 f7Var = this.f8579x[iZn];
                    z = (f7Var.en(j, true) || f7Var.rz() == 0) ? false : true;
                }
            }
        }
        if (this.en == 0) {
            this.xg = false;
            this.f7 = false;
            if (this.f8574r.i9()) {
                f7[] f7VarArr = this.f8579x;
                int length = f7VarArr.length;
                while (i5 < length) {
                    f7VarArr[i5].mt();
                    i5++;
                }
                this.f8574r.a();
            } else {
                f7[] f7VarArr2 = this.f8579x;
                int length2 = f7VarArr2.length;
                while (i5 < length2) {
                    f7VarArr2[i5].ut();
                    i5++;
                }
            }
        } else if (z) {
            j = i9(j);
            while (i5 < enVarArr.length) {
                if (enVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
                i5++;
            }
        }
        this.f8572k = true;
        return j;
    }

    public void f7(int i) throws IOException {
        this.f8579x[i].yt();
        k();
    }

    @Override // ur.d0, ur.jz
    public long fb() {
        long jK5;
        ud();
        if (this.ct || this.en == 0) {
            return Long.MIN_VALUE;
        }
        if (vl()) {
            return this.y5;
        }
        if (this.qn) {
            int length = this.f8579x.length;
            jK5 = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                v vVar = this.o;
                if (vVar.n3[i] && vVar.zn[i] && !this.f8579x[i].a8()) {
                    jK5 = Math.min(jK5, this.f8579x[i].c());
                }
            }
        } else {
            jK5 = Long.MAX_VALUE;
        }
        if (jK5 == Long.MAX_VALUE) {
            jK5 = k5(false);
        }
        return jK5 == Long.MIN_VALUE ? this.u : jK5;
    }

    @Override // ur.d0
    public long gv(long j, p1 p1Var) {
        ud();
        if (!this.j.s()) {
            return 0L;
        }
        fh.y yVarV = this.j.v(j);
        return p1Var.y(j, yVarV.y.y, yVarV.n3.y);
    }

    public boolean hw(int i) {
        return !nf() && this.f8579x[i].x(this.ct);
    }

    @Override // ur.d0
    public long i9(long j) {
        ud();
        boolean[] zArr = this.o.n3;
        if (!this.j.s()) {
            j = 0;
        }
        int i = 0;
        this.f7 = false;
        this.u = j;
        if (vl()) {
            this.y5 = j;
            return j;
        }
        if (this.q9 != 7 && o4(zArr, j)) {
            return j;
        }
        this.xg = false;
        this.y5 = j;
        this.ct = false;
        if (this.f8574r.i9()) {
            f7[] f7VarArr = this.f8579x;
            int length = f7VarArr.length;
            while (i < length) {
                f7VarArr[i].mt();
                i++;
            }
            this.f8574r.a();
        } else {
            this.f8574r.fb();
            f7[] f7VarArr2 = this.f8579x;
            int length2 = f7VarArr2.length;
            while (i < length2) {
                f7VarArr2[i].ut();
                i++;
            }
        }
        return j;
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: jz, reason: merged with bridge method [inline-methods] */
    public void j5(y yVar, long j, long j4, boolean z) {
        r0.j5 j5Var = yVar.zn;
        i4 i4Var = new i4(yVar.y, yVar.f8583f, j5Var.c5(), j5Var.p(), j, j4, j5Var.a());
        this.f8575s.gv(yVar.y);
        this.f8568f.mt(i4Var, 1, -1, null, 0, null, yVar.f8586i9, this.oz);
        if (z) {
            return;
        }
        for (f7 f7Var : this.f8579x) {
            f7Var.ut();
        }
        if (this.en > 0) {
            ((d0.y) v0.y.v(this.f8566d)).a(this);
        }
    }

    public void k() throws IOException {
        this.f8574r.f(this.f8575s.zn(this.q9));
    }

    @Override // ur.d0
    public lc mt() {
        ud();
        return this.o.y;
    }

    public final /* synthetic */ void o() {
        this.jz = true;
    }

    public final void oz() {
        if (this.o4 || this.f8571j5 || !this.f8570hw || this.j == null) {
            return;
        }
        for (f7 f7Var : this.f8579x) {
            if (f7Var.d() == null) {
                return;
            }
        }
        this.n.gv();
        int length = this.f8579x.length;
        rs[] rsVarArr = new rs[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            g gVarZ6 = (g) v0.y.v(this.f8579x[i].d());
            String str = gVarZ6.f3;
            boolean zXc = v0.n.xc(str);
            boolean z = zXc || v0.n.co(str);
            zArr[i] = z;
            this.qn = z | this.qn;
            IcyHeaders icyHeaders = this.f8567ej;
            if (icyHeaders != null) {
                if (zXc || this.f8564b[i].n3) {
                    Metadata metadata = gVarZ6.z;
                    gVarZ6 = gVarZ6.n3().en(metadata == null ? new Metadata(icyHeaders) : metadata.y(icyHeaders)).z6();
                }
                if (zXc && gVarZ6.f4789t == -1 && gVarZ6.w == -1 && icyHeaders.y != -1) {
                    gVarZ6 = gVarZ6.n3().ud(icyHeaders.y).z6();
                }
            }
            rsVarArr[i] = new rs(Integer.toString(i), gVarZ6.zn(this.f8569fb.zn(gVarZ6)));
        }
        this.o = new v(new lc(rsVarArr), zArr);
        this.f8571j5 = true;
        ((d0.y) v0.y.v(this.f8566d)).xc(this);
    }

    @Override // b1.wz
    public void p() {
        this.f8570hw = true;
        this.fh.post(this.c);
    }

    /* JADX INFO: renamed from: rs, reason: merged with bridge method [inline-methods] */
    public final void j(b1.fh fhVar) {
        this.j = this.f8567ej == null ? fhVar : new fh.n3(-9223372036854775807L);
        this.oz = fhVar.c5();
        boolean z = !this.jz && fhVar.c5() == -9223372036854775807L;
        this.f8577ut = z;
        this.q9 = z ? 7 : 1;
        this.w.y(this.oz, fhVar.s(), this.f8577ut);
        if (this.f8571j5) {
            return;
        }
        oz();
    }

    @Override // ur.d0
    public long t() {
        if (!this.f7) {
            return -9223372036854775807L;
        }
        if (!this.ct && b() <= this.dm) {
            return -9223372036854775807L;
        }
        this.f7 = false;
        return this.u;
    }

    @Override // r0.ta.a
    public void tl() {
        for (f7 f7Var : this.f8579x) {
            f7Var.j();
        }
        this.f3.release();
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void xc(y yVar, long j, long j4) {
        b1.fh fhVar;
        if (this.oz == -9223372036854775807L && (fhVar = this.j) != null) {
            boolean zS = fhVar.s();
            long jK5 = k5(true);
            long j7 = jK5 == Long.MIN_VALUE ? 0L : jK5 + 10000;
            this.oz = j7;
            this.w.y(j7, zS, this.f8577ut);
        }
        r0.j5 j5Var = yVar.zn;
        i4 i4Var = new i4(yVar.y, yVar.f8583f, j5Var.c5(), j5Var.p(), j, j4, j5Var.a());
        this.f8575s.gv(yVar.y);
        this.f8568f.r(i4Var, 1, -1, null, 0, null, yVar.f8586i9, this.oz);
        this.ct = true;
        ((d0.y) v0.y.v(this.f8566d)).a(this);
    }

    public final void ud() {
        v0.y.fb(this.f8571j5);
        v0.y.v(this.o);
        v0.y.v(this.j);
    }

    @Override // ur.d0, ur.jz
    public boolean v(long j) {
        if (this.ct || this.f8574r.c5() || this.xg) {
            return false;
        }
        if (this.f8571j5 && this.en == 0) {
            return false;
        }
        boolean zA = this.n.a();
        if (this.f8574r.i9()) {
            return zA;
        }
        lc();
        return true;
    }

    @Override // ur.f7.gv
    public void w(g gVar) {
        this.fh.post(this.c);
    }

    @Override // ur.d0
    public void wz() throws IOException {
        k();
        if (this.ct && !this.f8571j5) {
            throw q.y("Loading finished before preparation is complete.", null);
        }
    }

    public final b1.ta xg(gv gvVar) {
        int length = this.f8579x.length;
        for (int i = 0; i < length; i++) {
            if (gvVar.equals(this.f8564b[i])) {
                return this.f8579x[i];
            }
        }
        f7 f7VarF = f7.f(this.f8573p, this.f8569fb, this.f8576t);
        f7VarF.xg(this);
        int i5 = length + 1;
        gv[] gvVarArr = (gv[]) Arrays.copyOf(this.f8564b, i5);
        gvVarArr[length] = gvVar;
        this.f8564b = (gv[]) v0.ut.f(gvVarArr);
        f7[] f7VarArr = (f7[]) Arrays.copyOf(this.f8579x, i5);
        f7VarArr[length] = f7VarF;
        this.f8579x = (f7[]) v0.ut.f(f7VarArr);
        return f7VarF;
    }

    @Override // ur.d0, ur.jz
    public boolean y() {
        return this.f8574r.i9() && this.n.v();
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: y5, reason: merged with bridge method [inline-methods] */
    public ta.zn fh(y yVar, long j, long j4, IOException iOException, int i) {
        ta.zn znVarS;
        r0.j5 j5Var = yVar.zn;
        i4 i4Var = new i4(yVar.y, yVar.f8583f, j5Var.c5(), j5Var.p(), j, j4, j5Var.a());
        long jY = this.f8575s.y(new mg.zn(i4Var, new c(1, -1, null, 0, null, v0.ut.gf(yVar.f8586i9), v0.ut.gf(this.oz)), iOException, i));
        if (jY == -9223372036854775807L) {
            znVarS = r0.ta.f7549fb;
        } else {
            int iB = b();
            znVarS = a8(yVar, iB) ? r0.ta.s(iB > this.dm, jY) : r0.ta.f7548a;
        }
        boolean zZn = znVarS.zn();
        this.f8568f.i4(i4Var, 1, -1, null, 0, null, yVar.f8586i9, this.oz, iOException, !zZn);
        if (!zZn) {
            this.f8575s.gv(yVar.y);
        }
        return znVarS;
    }

    public b1.ta yt() {
        return xg(new gv(0, true));
    }

    @Override // b1.wz
    public void z(final b1.fh fhVar) {
        this.fh.post(new Runnable() { // from class: ur.o
            @Override // java.lang.Runnable
            public final void run() {
                this.y.j(fhVar);
            }
        });
    }

    @Override // ur.d0, ur.jz
    public long zn() {
        return fb();
    }

    @Override // ur.d0, ur.jz
    public void s(long j) {
    }
}
