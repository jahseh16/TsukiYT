package lf;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ft.g;
import ft.q;
import java.util.Arrays;
import java.util.Collections;
import lf.ud;
import mn.y;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class c5 implements tl {

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final byte[] f6231x4 = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b1.ta f6232a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f6233c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f6234co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6235f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public b1.ta f6236fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public final String f6237gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f6238i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public int f6239mt;
    public final v0.ta n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6240p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f6241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6243t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f6244tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f6245v;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int f6246wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public int f6247xc;
    public final boolean y;
    public b1.ta z;
    public final v0.d zn;

    public c5(boolean z) {
        this(z, null);
    }

    private boolean c5(v0.d dVar, byte[] bArr, int i) {
        int iMin = Math.min(dVar.y(), i - this.f6233c5);
        dVar.t(bArr, this.f6233c5, iMin);
        int i5 = this.f6233c5 + iMin;
        this.f6233c5 = i5;
        return i5 == i;
    }

    public static boolean tl(int i) {
        return (i & 65526) == 65520;
    }

    @Override // lf.tl
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f6234co = j;
        }
    }

    public final void co() {
        this.f6242s = 0;
        this.f6233c5 = 0;
        this.f6238i9 = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public long f() {
        return this.f6240p;
    }

    public final void fb(v0.d dVar) {
        if (dVar.y() == 0) {
            return;
        }
        this.n3.y[0] = dVar.v()[dVar.a()];
        this.n3.w(2);
        int iS = this.n3.s(4);
        int i = this.f6246wz;
        if (i != -1 && iS != i) {
            p();
            return;
        }
        if (!this.f6243t) {
            this.f6243t = true;
            this.f6244tl = this.f6247xc;
            this.f6246wz = iS;
        }
        z();
    }

    public final boolean i4(v0.d dVar, byte[] bArr, int i) {
        if (dVar.y() < i) {
            return false;
        }
        dVar.t(bArr, 0, i);
        return true;
    }

    public final void i9(v0.d dVar) {
        byte[] bArrV = dVar.v();
        int iA = dVar.a();
        int iFb = dVar.fb();
        while (iA < iFb) {
            int i = iA + 1;
            byte b4 = bArrV[iA];
            int i5 = b4 & 255;
            if (this.f6238i9 == 512 && t((byte) -1, (byte) i5) && (this.f6243t || s(dVar, iA - 1))) {
                this.f6247xc = (b4 & 8) >> 3;
                this.f6235f = (b4 & 1) == 0;
                if (this.f6243t) {
                    z();
                } else {
                    mt();
                }
                dVar.oz(i);
                return;
            }
            int i8 = this.f6238i9;
            int i10 = i5 | i8;
            if (i10 == 329) {
                this.f6238i9 = 768;
            } else if (i10 == 511) {
                this.f6238i9 = NotificationCompat.FLAG_GROUP_SUMMARY;
            } else if (i10 == 836) {
                this.f6238i9 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            } else if (i10 == 1075) {
                r();
                dVar.oz(i);
                return;
            } else if (i8 != 256) {
                this.f6238i9 = NotificationCompat.FLAG_LOCAL_ONLY;
            }
            iA = i;
        }
        dVar.oz(iA);
    }

    public final void mt() {
        this.f6242s = 1;
        this.f6233c5 = 0;
    }

    public final void n3() {
        v0.y.v(this.f6232a);
        ut.i9(this.z);
        ut.i9(this.f6236fb);
    }

    public final void p() {
        this.f6243t = false;
        co();
    }

    public final void r() {
        this.f6242s = 2;
        this.f6233c5 = f6231x4.length;
        this.f6239mt = 0;
        this.zn.oz(0);
    }

    public final boolean s(v0.d dVar, int i) {
        dVar.oz(i + 1);
        if (!i4(dVar, this.n3.y, 1)) {
            return false;
        }
        this.n3.w(4);
        int iS = this.n3.s(1);
        int i5 = this.f6244tl;
        if (i5 != -1 && iS != i5) {
            return false;
        }
        if (this.f6246wz != -1) {
            if (!i4(dVar, this.n3.y, 1)) {
                return true;
            }
            this.n3.w(2);
            if (this.n3.s(4) != this.f6246wz) {
                return false;
            }
            dVar.oz(i + 2);
        }
        if (!i4(dVar, this.n3.y, 4)) {
            return true;
        }
        this.n3.w(14);
        int iS2 = this.n3.s(13);
        if (iS2 < 7) {
            return false;
        }
        byte[] bArrV = dVar.v();
        int iFb = dVar.fb();
        int i8 = i + iS2;
        if (i8 >= iFb) {
            return true;
        }
        byte b4 = bArrV[i8];
        if (b4 == -1) {
            int i10 = i8 + 1;
            if (i10 == iFb) {
                return true;
            }
            return t((byte) -1, bArrV[i10]) && ((bArrV[i10] & 8) >> 3) == iS;
        }
        if (b4 != 73) {
            return false;
        }
        int i11 = i8 + 1;
        if (i11 == iFb) {
            return true;
        }
        if (bArrV[i11] != 68) {
            return false;
        }
        int i12 = i8 + 2;
        return i12 == iFb || bArrV[i12] == 51;
    }

    public final boolean t(byte b4, byte b6) {
        return tl(((b4 & 255) << 8) | (b6 & 255));
    }

    @Override // lf.tl
    public void v(b1.wz wzVar, ud.gv gvVar) {
        gvVar.y();
        this.f6245v = gvVar.n3();
        b1.ta taVarA = wzVar.a(gvVar.zn(), 1);
        this.f6232a = taVarA;
        this.z = taVarA;
        if (!this.y) {
            this.f6236fb = new b1.f();
            return;
        }
        gvVar.y();
        b1.ta taVarA2 = wzVar.a(gvVar.zn(), 5);
        this.f6236fb = taVarA2;
        taVarA2.y(new g.n3().oz(gvVar.n3()).o4("application/id3").z6());
    }

    public final void w(v0.d dVar) {
        int iMin = Math.min(dVar.y(), this.f6239mt - this.f6233c5);
        this.z.n3(dVar, iMin);
        int i = this.f6233c5 + iMin;
        this.f6233c5 = i;
        int i5 = this.f6239mt;
        if (i == i5) {
            long j = this.f6234co;
            if (j != -9223372036854775807L) {
                this.z.a(j, 1, i5, 0, null);
                this.f6234co += this.f6241r;
            }
            co();
        }
    }

    public final void wz() throws q {
        this.n3.w(0);
        if (this.w) {
            this.n3.mt(10);
        } else {
            int i = 2;
            int iS = this.n3.s(2) + 1;
            if (iS != 2) {
                v0.r.c5("AdtsReader", "Detected audio object type: " + iS + ", but assuming AAC LC.");
            } else {
                i = iS;
            }
            this.n3.mt(5);
            byte[] bArrN3 = mn.y.n3(i, this.f6246wz, this.n3.s(3));
            y.n3 n3VarA = mn.y.a(bArrN3);
            g gVarZ6 = new g.n3().oz(this.f6245v).o4("audio/mp4a-latm").x(n3VarA.zn).a8(n3VarA.n3).rs(n3VarA.y).ut(Collections.singletonList(bArrN3)).k(this.f6237gv).z6();
            this.f6240p = 1024000000 / ((long) gVarZ6.oz);
            this.f6232a.y(gVarZ6);
            this.w = true;
        }
        this.n3.mt(4);
        int iS2 = this.n3.s(13);
        int i5 = iS2 - 7;
        if (this.f6235f) {
            i5 = iS2 - 9;
        }
        x4(this.f6232a, this.f6240p, 0, i5);
    }

    public final void x4(b1.ta taVar, long j, int i, int i5) {
        this.f6242s = 4;
        this.f6233c5 = i;
        this.z = taVar;
        this.f6241r = j;
        this.f6239mt = i5;
    }

    public final void xc() {
        this.f6236fb.n3(this.zn, 10);
        this.zn.oz(6);
        x4(this.f6236fb, 0L, 10, this.zn.z6() + 10);
    }

    @Override // lf.tl
    public void y(v0.d dVar) throws q {
        n3();
        while (dVar.y() > 0) {
            int i = this.f6242s;
            if (i == 0) {
                i9(dVar);
            } else if (i == 1) {
                fb(dVar);
            } else if (i != 2) {
                if (i == 3) {
                    if (c5(dVar, this.n3.y, this.f6235f ? 7 : 5)) {
                        wz();
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    w(dVar);
                }
            } else if (c5(dVar, this.zn.v(), 10)) {
                xc();
            }
        }
    }

    public final void z() {
        this.f6242s = 3;
        this.f6233c5 = 0;
    }

    @Override // lf.tl
    public void zn() {
        this.f6234co = -9223372036854775807L;
        p();
    }

    public c5(boolean z, @Nullable String str) {
        this.n3 = new v0.ta(new byte[7]);
        this.zn = new v0.d(Arrays.copyOf(f6231x4, 10));
        co();
        this.f6244tl = -1;
        this.f6246wz = -1;
        this.f6240p = -9223372036854775807L;
        this.f6234co = -9223372036854775807L;
        this.y = z;
        this.f6237gv = str;
    }

    @Override // lf.tl
    public void gv() {
    }
}
