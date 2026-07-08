package lf;

import androidx.annotation.Nullable;
import ft.q;
import lf.ud;
import v0.hw;

/* JADX INFO: loaded from: classes.dex */
public final class i4 implements ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6309a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f6310c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6311f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f6312fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f6313gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f6314i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6315s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6316t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public hw f6317v;
    public final tl y;
    public final v0.ta n3 = new v0.ta(new byte[10]);
    public int zn = 0;

    public i4(tl tlVar) {
        this.y = tlVar;
    }

    public final void a() {
        this.n3.w(0);
        this.f6316t = -9223372036854775807L;
        if (this.f6309a) {
            this.n3.mt(4);
            long jS = ((long) this.n3.s(3)) << 30;
            this.n3.mt(1);
            long jS2 = jS | ((long) (this.n3.s(15) << 15));
            this.n3.mt(1);
            long jS3 = jS2 | ((long) this.n3.s(15));
            this.n3.mt(1);
            if (!this.f6315s && this.f6312fb) {
                this.n3.mt(4);
                long jS4 = ((long) this.n3.s(3)) << 30;
                this.n3.mt(1);
                long jS5 = jS4 | ((long) (this.n3.s(15) << 15));
                this.n3.mt(1);
                long jS6 = jS5 | ((long) this.n3.s(15));
                this.n3.mt(1);
                this.f6317v.n3(jS6);
                this.f6315s = true;
            }
            this.f6316t = this.f6317v.n3(jS3);
        }
    }

    public final void fb(int i) {
        this.zn = i;
        this.f6313gv = 0;
    }

    public final boolean gv(v0.d dVar, @Nullable byte[] bArr, int i) {
        int iMin = Math.min(dVar.y(), i - this.f6313gv);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            dVar.ut(iMin);
        } else {
            dVar.t(bArr, this.f6313gv, iMin);
        }
        int i5 = this.f6313gv + iMin;
        this.f6313gv = i5;
        return i5 == i;
    }

    @Override // lf.ud
    public void n3(hw hwVar, b1.wz wzVar, ud.gv gvVar) {
        this.f6317v = hwVar;
        this.y.v(wzVar, gvVar);
    }

    public final boolean v() {
        this.n3.w(0);
        int iS = this.n3.s(24);
        if (iS != 1) {
            v0.r.c5("PesReader", "Unexpected start code prefix: " + iS);
            this.f6314i9 = -1;
            return false;
        }
        this.n3.mt(8);
        int iS2 = this.n3.s(16);
        this.n3.mt(5);
        this.f6311f = this.n3.fb();
        this.n3.mt(2);
        this.f6309a = this.n3.fb();
        this.f6312fb = this.n3.fb();
        this.n3.mt(6);
        int iS3 = this.n3.s(8);
        this.f6310c5 = iS3;
        if (iS2 == 0) {
            this.f6314i9 = -1;
        } else {
            int i = (iS2 - 3) - iS3;
            this.f6314i9 = i;
            if (i < 0) {
                v0.r.c5("PesReader", "Found negative packet payload size: " + this.f6314i9);
                this.f6314i9 = -1;
            }
        }
        return true;
    }

    @Override // lf.ud
    public final void y(v0.d dVar, int i) throws q {
        v0.y.c5(this.f6317v);
        if ((i & 1) != 0) {
            int i5 = this.zn;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    v0.r.c5("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f6314i9 != -1) {
                        v0.r.c5("PesReader", "Unexpected start indicator: expected " + this.f6314i9 + " more bytes");
                    }
                    this.y.gv();
                }
            }
            fb(1);
        }
        while (dVar.y() > 0) {
            int i8 = this.zn;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        if (gv(dVar, this.n3.y, Math.min(10, this.f6310c5)) && gv(dVar, null, this.f6310c5)) {
                            a();
                            i |= this.f6311f ? 4 : 0;
                            this.y.a(this.f6316t, i);
                            fb(3);
                        }
                    } else {
                        if (i8 != 3) {
                            throw new IllegalStateException();
                        }
                        int iY = dVar.y();
                        int i10 = this.f6314i9;
                        int i11 = i10 != -1 ? iY - i10 : 0;
                        if (i11 > 0) {
                            iY -= i11;
                            dVar.j(dVar.a() + iY);
                        }
                        this.y.y(dVar);
                        int i12 = this.f6314i9;
                        if (i12 != -1) {
                            int i13 = i12 - iY;
                            this.f6314i9 = i13;
                            if (i13 == 0) {
                                this.y.gv();
                                fb(1);
                            }
                        }
                    }
                } else if (gv(dVar, this.n3.y, 9)) {
                    fb(v() ? 2 : 0);
                }
            } else {
                dVar.ut(dVar.y());
            }
        }
    }

    @Override // lf.ud
    public final void zn() {
        this.zn = 0;
        this.f6313gv = 0;
        this.f6315s = false;
        this.y.zn();
    }
}
