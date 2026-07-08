package lf;

import android.net.Uri;
import b1.fh;
import ft.q;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import lf.ud;

/* JADX INFO: loaded from: classes.dex */
public final class s implements b1.t {

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public static final b1.mt f6353tl = new b1.mt() { // from class: lf.fb
        @Override // b1.mt
        public final b1.t[] createExtractors() {
            return s.c5();
        }

        @Override // b1.mt
        public /* synthetic */ b1.t[] y(Uri uri, Map map) {
            return b1.p.y(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b1.wz f6354a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f6355c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6356f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f6357fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final v0.d f6358gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f6359i9;
    public final c5 n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6360s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6361t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v0.ta f6362v;
    public final int y;
    public final v0.d zn;

    public s() {
        this(0);
    }

    private static int a(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b1.t[] c5() {
        return new b1.t[]{new s()};
    }

    private b1.fh s(long j, boolean z) {
        return new b1.v(j, this.f6360s, a(this.f6355c5, this.n3.f()), this.f6355c5, z);
    }

    public final int f(b1.tl tlVar) throws IOException {
        int i = 0;
        while (true) {
            tlVar.z(this.f6358gv.v(), 0, 10);
            this.f6358gv.oz(0);
            if (this.f6358gv.x() != 4801587) {
                break;
            }
            this.f6358gv.ut(3);
            int iZ6 = this.f6358gv.z6();
            i += iZ6 + 10;
            tlVar.tl(iZ6);
        }
        tlVar.s();
        tlVar.tl(i);
        if (this.f6360s == -1) {
            this.f6360s = i;
        }
        return i;
    }

    @Override // b1.t
    public int fb(b1.tl tlVar, b1.d0 d0Var) throws IOException {
        v0.y.c5(this.f6354a);
        long length = tlVar.getLength();
        int i = this.y;
        if ((i & 2) != 0 || ((i & 1) != 0 && length != -1)) {
            v(tlVar);
        }
        int i5 = tlVar.read(this.zn.v(), 0, 2048);
        boolean z = i5 == -1;
        i9(length, z);
        if (z) {
            return -1;
        }
        this.zn.oz(0);
        this.zn.j(i5);
        if (!this.f6356f) {
            this.n3.a(this.f6357fb, 4);
            this.f6356f = true;
        }
        this.n3.y(this.zn);
        return 0;
    }

    @Override // b1.t
    public boolean gv(b1.tl tlVar) throws IOException {
        int iF = f(tlVar);
        int i = iF;
        int i5 = 0;
        int i8 = 0;
        do {
            tlVar.z(this.f6358gv.v(), 0, 2);
            this.f6358gv.oz(0);
            if (c5.tl(this.f6358gv.yt())) {
                i5++;
                if (i5 >= 4 && i8 > 188) {
                    return true;
                }
                tlVar.z(this.f6358gv.v(), 0, 4);
                this.f6362v.w(14);
                int iS = this.f6362v.s(13);
                if (iS <= 6) {
                    i++;
                    tlVar.s();
                    tlVar.tl(i);
                } else {
                    tlVar.tl(iS - 6);
                    i8 += iS;
                }
            } else {
                i++;
                tlVar.s();
                tlVar.tl(i);
            }
            i5 = 0;
            i8 = 0;
        } while (i - iF < 8192);
        return false;
    }

    public final void i9(long j, boolean z) {
        if (this.f6361t) {
            return;
        }
        boolean z5 = (this.y & 1) != 0 && this.f6355c5 > 0;
        if (z5 && this.n3.f() == -9223372036854775807L && !z) {
            return;
        }
        if (!z5 || this.n3.f() == -9223372036854775807L) {
            this.f6354a.z(new fh.n3(-9223372036854775807L));
        } else {
            this.f6354a.z(s(j, (this.y & 2) != 0));
        }
        this.f6361t = true;
    }

    public final void v(b1.tl tlVar) throws IOException {
        int iS;
        if (this.f6359i9) {
            return;
        }
        this.f6355c5 = -1;
        tlVar.s();
        long j = 0;
        if (tlVar.getPosition() == 0) {
            f(tlVar);
        }
        int i = 0;
        int i5 = 0;
        do {
            try {
                if (!tlVar.v(this.f6358gv.v(), 0, 2, true)) {
                    break;
                }
                this.f6358gv.oz(0);
                if (!c5.tl(this.f6358gv.yt())) {
                    break;
                }
                if (!tlVar.v(this.f6358gv.v(), 0, 4, true)) {
                    break;
                }
                this.f6362v.w(14);
                iS = this.f6362v.s(13);
                if (iS <= 6) {
                    this.f6359i9 = true;
                    throw q.y("Malformed ADTS stream", null);
                }
                j += (long) iS;
                i5++;
                if (i5 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (tlVar.mt(iS - 6, true));
        i = i5;
        tlVar.s();
        if (i > 0) {
            this.f6355c5 = (int) (j / ((long) i));
        } else {
            this.f6355c5 = -1;
        }
        this.f6359i9 = true;
    }

    @Override // b1.t
    public void y(long j, long j4) {
        this.f6356f = false;
        this.n3.zn();
        this.f6357fb = j4;
    }

    @Override // b1.t
    public void zn(b1.wz wzVar) {
        this.f6354a = wzVar;
        this.n3.v(wzVar, new ud.gv(0, 1));
        wzVar.p();
    }

    public s(int i) {
        this.y = (i & 2) != 0 ? i | 1 : i;
        this.n3 = new c5(true);
        this.zn = new v0.d(2048);
        this.f6355c5 = -1;
        this.f6360s = -1L;
        v0.d dVar = new v0.d(10);
        this.f6358gv = dVar;
        this.f6362v = new v0.ta(dVar.v());
    }

    @Override // b1.t
    public void release() {
    }
}
