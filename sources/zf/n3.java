package zf;

import android.net.Uri;
import b1.d0;
import b1.fh;
import b1.mt;
import b1.p;
import b1.t;
import b1.ta;
import b1.tl;
import b1.v;
import b1.wz;
import ft.g;
import ft.q;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements t {

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public static final int[] f9440mt;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f9442r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9443a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f9444c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9445f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f9446fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f9447gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f9448i9;
    public final int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f9449s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public wz f9450t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public ta f9451tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9452v;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public fh f9453wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public boolean f9454xc;
    public final byte[] y;
    public boolean zn;
    public static final mt w = new mt() { // from class: zf.y
        @Override // b1.mt
        public final t[] createExtractors() {
            return n3.tl();
        }

        @Override // b1.mt
        public /* synthetic */ t[] y(Uri uri, Map map) {
            return p.y(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f9441p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final byte[] f9439co = ut.ap("#!AMR\n");
    public static final byte[] z = ut.ap("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f9440mt = iArr;
        f9442r = iArr[8];
    }

    public n3() {
        this(0);
    }

    public static int a(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t[] tl() {
        return new t[]{new n3()};
    }

    public static boolean w(tl tlVar, byte[] bArr) throws IOException {
        tlVar.s();
        byte[] bArr2 = new byte[bArr.length];
        tlVar.z(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public final int c5(int i) throws q {
        if (f(i)) {
            return this.zn ? f9440mt[i] : f9441p[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.zn ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw q.y(sb.toString(), null);
    }

    public final int co(tl tlVar) throws IOException {
        if (this.f9443a == 0) {
            try {
                int iP = p(tlVar);
                this.f9452v = iP;
                this.f9443a = iP;
                if (this.f9444c5 == -1) {
                    this.f9449s = tlVar.getPosition();
                    this.f9444c5 = this.f9452v;
                }
                if (this.f9444c5 == this.f9452v) {
                    this.f9448i9++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iV = this.f9451tl.v(tlVar, this.f9443a, true);
        if (iV == -1) {
            return -1;
        }
        int i = this.f9443a - iV;
        this.f9443a = i;
        if (i > 0) {
            return 0;
        }
        this.f9451tl.a(this.f9445f + this.f9447gv, 1, this.f9452v, 0, null);
        this.f9447gv += 20000;
        return 0;
    }

    public final boolean f(int i) {
        return i >= 0 && i <= 15 && (t(i) || i9(i));
    }

    @Override // b1.t
    public int fb(tl tlVar, d0 d0Var) throws IOException {
        v();
        if (tlVar.getPosition() == 0 && !mt(tlVar)) {
            throw q.y("Could not find AMR header.", null);
        }
        wz();
        int iCo = co(tlVar);
        xc(tlVar.getLength(), iCo);
        return iCo;
    }

    @Override // b1.t
    public boolean gv(tl tlVar) throws IOException {
        return mt(tlVar);
    }

    public final boolean i9(int i) {
        return !this.zn && (i < 12 || i > 14);
    }

    public final boolean mt(tl tlVar) throws IOException {
        byte[] bArr = f9439co;
        if (w(tlVar, bArr)) {
            this.zn = false;
            tlVar.w(bArr.length);
            return true;
        }
        byte[] bArr2 = z;
        if (!w(tlVar, bArr2)) {
            return false;
        }
        this.zn = true;
        tlVar.w(bArr2.length);
        return true;
    }

    public final int p(tl tlVar) throws IOException {
        tlVar.s();
        tlVar.z(this.y, 0, 1);
        byte b4 = this.y[0];
        if ((b4 & 131) <= 0) {
            return c5((b4 >> 3) & 15);
        }
        throw q.y("Invalid padding bits for frame header " + ((int) b4), null);
    }

    public final fh s(long j, boolean z5) {
        return new v(j, this.f9449s, a(this.f9444c5, 20000L), this.f9444c5, z5);
    }

    public final boolean t(int i) {
        return this.zn && (i < 10 || i > 13);
    }

    public final void v() {
        v0.y.c5(this.f9451tl);
        ut.i9(this.f9450t);
    }

    public final void wz() {
        if (this.f9454xc) {
            return;
        }
        this.f9454xc = true;
        boolean z5 = this.zn;
        this.f9451tl.y(new g.n3().o4(z5 ? "audio/amr-wb" : "audio/3gpp").f7(f9442r).a8(1).rs(z5 ? 16000 : 8000).z6());
    }

    public final void xc(long j, int i) {
        int i5;
        if (this.f9446fb) {
            return;
        }
        int i8 = this.n3;
        if ((i8 & 1) == 0 || j == -1 || !((i5 = this.f9444c5) == -1 || i5 == this.f9452v)) {
            fh.n3 n3Var = new fh.n3(-9223372036854775807L);
            this.f9453wz = n3Var;
            this.f9450t.z(n3Var);
            this.f9446fb = true;
            return;
        }
        if (this.f9448i9 >= 20 || i == -1) {
            fh fhVarS = s(j, (i8 & 2) != 0);
            this.f9453wz = fhVarS;
            this.f9450t.z(fhVarS);
            this.f9446fb = true;
        }
    }

    @Override // b1.t
    public void y(long j, long j4) {
        this.f9447gv = 0L;
        this.f9452v = 0;
        this.f9443a = 0;
        if (j != 0) {
            fh fhVar = this.f9453wz;
            if (fhVar instanceof v) {
                this.f9445f = ((v) fhVar).zn(j);
                return;
            }
        }
        this.f9445f = 0L;
    }

    @Override // b1.t
    public void zn(wz wzVar) {
        this.f9450t = wzVar;
        this.f9451tl = wzVar.a(0, 1);
        wzVar.p();
    }

    public n3(int i) {
        this.n3 = (i & 2) != 0 ? i | 1 : i;
        this.y = new byte[1];
        this.f9444c5 = -1;
    }

    @Override // b1.t
    public void release() {
    }
}
