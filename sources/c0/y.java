package c0;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import b0.c5;
import b0.f;
import b0.n3;
import b0.wz;
import b0.xc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class y extends v {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final int f1360c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f1361co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1362f;
    public long f3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public boolean f1364i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final int f1365i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public boolean f1366mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1367p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte f1368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1369s;
    public int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    @Nullable
    public List<b0.n3> f1372wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    @Nullable
    public List<b0.n3> f1374xc;
    public byte z;
    public static final int[] n = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] c = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] d0 = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] fh = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] rz = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] mg = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public static final int[] f1359ta = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean[] f1358d = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final d f1363fb = new d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList<C0043y> f1370t = new ArrayList<>();

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public C0043y f1371tl = new C0043y(0, 4);

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public int f1373x4 = 0;

    /* JADX INFO: renamed from: c0.y$y, reason: collision with other inner class name */
    public static final class C0043y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1375a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f1376fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f1377gv;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1378s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1379v;
        public final List<C0044y> y = new ArrayList();
        public final List<SpannableString> n3 = new ArrayList();
        public final StringBuilder zn = new StringBuilder();

        /* JADX INFO: renamed from: c0.y$y$y, reason: collision with other inner class name */
        public static class C0044y {
            public final boolean n3;
            public final int y;
            public int zn;

            public C0044y(int i, boolean z, int i5) {
                this.y = i;
                this.n3 = z;
                this.zn = i5;
            }
        }

        public C0043y(int i, int i5) {
            i9(i);
            this.f1378s = i5;
        }

        public static void p(SpannableStringBuilder spannableStringBuilder, int i, int i5) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i5, 33);
        }

        public static void wz(SpannableStringBuilder spannableStringBuilder, int i, int i5, int i8) {
            if (i8 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i8), i, i5, 33);
        }

        public static void xc(SpannableStringBuilder spannableStringBuilder, int i, int i5) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i5, 33);
        }

        public void a() {
            int length = this.zn.length();
            if (length > 0) {
                this.zn.delete(length - 1, length);
                for (int size = this.y.size() - 1; size >= 0; size--) {
                    C0044y c0044y = this.y.get(size);
                    int i = c0044y.zn;
                    if (i != length) {
                        return;
                    }
                    c0044y.zn = i - 1;
                }
            }
        }

        public boolean c5() {
            return this.y.isEmpty() && this.n3.isEmpty() && this.zn.length() == 0;
        }

        public void f() {
            this.n3.add(s());
            this.zn.setLength(0);
            this.y.clear();
            int iMin = Math.min(this.f1378s, this.f1377gv);
            while (this.n3.size() >= iMin) {
                this.n3.remove(0);
            }
        }

        @Nullable
        public b0.n3 fb(int i) {
            float f3;
            int i5 = this.f1379v + this.f1375a;
            int i8 = 32 - i5;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < this.n3.size(); i10++) {
                spannableStringBuilder.append(ut.wm(this.n3.get(i10), i8));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(ut.wm(s(), i8));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i8 - spannableStringBuilder.length();
            int i11 = i5 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.f1376fb != 2 || (Math.abs(i11) >= 3 && length >= 0)) ? (this.f1376fb != 2 || i11 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i5 = 32 - length;
                }
                f3 = ((i5 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f3 = 0.5f;
            }
            int i12 = this.f1377gv;
            if (i12 > 7) {
                i12 -= 17;
            } else if (this.f1376fb == 1) {
                i12 -= this.f1378s - 1;
            }
            return new n3.C0034n3().xc(spannableStringBuilder).w(Layout.Alignment.ALIGN_NORMAL).s(i12, 1).f(f3).t(i).y();
        }

        public void i9(int i) {
            this.f1376fb = i;
            this.y.clear();
            this.n3.clear();
            this.zn.setLength(0);
            this.f1377gv = 15;
            this.f1379v = 0;
            this.f1375a = 0;
        }

        public final SpannableString s() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.zn);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i5 = -1;
            int i8 = -1;
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            boolean z = false;
            while (i < this.y.size()) {
                C0044y c0044y = this.y.get(i);
                boolean z5 = c0044y.n3;
                int i13 = c0044y.y;
                if (i13 != 8) {
                    boolean z7 = i13 == 7;
                    if (i13 != 7) {
                        i12 = y.d0[i13];
                    }
                    z = z7;
                }
                int i14 = c0044y.zn;
                i++;
                if (i14 != (i < this.y.size() ? this.y.get(i).zn : length)) {
                    if (i5 != -1 && !z5) {
                        p(spannableStringBuilder, i5, i14);
                        i5 = -1;
                    } else if (i5 == -1 && z5) {
                        i5 = i14;
                    }
                    if (i8 != -1 && !z) {
                        xc(spannableStringBuilder, i8, i14);
                        i8 = -1;
                    } else if (i8 == -1 && z) {
                        i8 = i14;
                    }
                    if (i12 != i11) {
                        wz(spannableStringBuilder, i10, i14, i11);
                        i11 = i12;
                        i10 = i14;
                    }
                }
            }
            if (i5 != -1 && i5 != length) {
                p(spannableStringBuilder, i5, length);
            }
            if (i8 != -1 && i8 != length) {
                xc(spannableStringBuilder, i8, length);
            }
            if (i10 != length) {
                wz(spannableStringBuilder, i10, length, i11);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void t(int i) {
            this.f1376fb = i;
        }

        public void tl(int i) {
            this.f1378s = i;
        }

        public void v(char c) {
            if (this.zn.length() < 32) {
                this.zn.append(c);
            }
        }

        public void w(int i, boolean z) {
            this.y.add(new C0044y(i, z, this.zn.length()));
        }
    }

    public y(String str, int i, long j) {
        this.f1362f = j > 0 ? j * 1000 : -9223372036854775807L;
        this.f1369s = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f1365i9 = 0;
            this.f1360c5 = 0;
        } else if (i == 2) {
            this.f1365i9 = 1;
            this.f1360c5 = 0;
        } else if (i == 3) {
            this.f1365i9 = 0;
            this.f1360c5 = 1;
        } else if (i != 4) {
            r.c5("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f1365i9 = 0;
            this.f1360c5 = 0;
        } else {
            this.f1365i9 = 1;
            this.f1360c5 = 1;
        }
        k5(0);
        b();
        this.f1364i4 = true;
        this.f3 = -9223372036854775807L;
    }

    public static boolean a8(byte b4) {
        return 1 <= b4 && b4 <= 15;
    }

    public static boolean c(byte b4) {
        return (b4 & 224) == 0;
    }

    public static char co(byte b4) {
        return (char) mg[b4 & 31];
    }

    public static boolean d0(byte b4, byte b6) {
        return (b4 & 246) == 18 && (b6 & 224) == 32;
    }

    public static boolean ej(byte b4, byte b6) {
        return (b4 & 247) == 17 && (b6 & 240) == 48;
    }

    public static boolean fh(byte b4, byte b6) {
        return (b4 & 247) == 17 && (b6 & 240) == 32;
    }

    public static boolean mg(byte b4, byte b6) {
        return (b4 & 240) == 16 && (b6 & 192) == 64;
    }

    public static int p(byte b4) {
        return (b4 >> 3) & 1;
    }

    public static char r(byte b4, byte b6) {
        return (b4 & 1) == 0 ? co(b6) : z(b6);
    }

    public static boolean rz(byte b4, byte b6) {
        return (b4 & 246) == 20 && (b6 & 240) == 32;
    }

    public static boolean ta(byte b4) {
        return (b4 & 240) == 16;
    }

    public static boolean ud(byte b4, byte b6) {
        return (b4 & 247) == 23 && b6 >= 33 && b6 <= 35;
    }

    public static char w(byte b4) {
        return (char) fh[(b4 & 127) - 32];
    }

    public static char x4(byte b4) {
        return (char) rz[b4 & 15];
    }

    public static char z(byte b4) {
        return (char) f1359ta[b4 & 31];
    }

    public static boolean z6(byte b4) {
        return (b4 & 246) == 20;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // c0.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(b0.wz r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.y.a(b0.wz):void");
    }

    public final void b() {
        this.f1371tl.i9(this.w);
        this.f1370t.clear();
        this.f1370t.add(this.f1371tl);
    }

    public final boolean d(boolean z, byte b4, byte b6) {
        if (!z || !ta(b4)) {
            this.f1361co = false;
        } else {
            if (this.f1361co && this.z == b4 && this.f1368r == b6) {
                this.f1361co = false;
                return true;
            }
            this.f1361co = true;
            this.z = b4;
            this.f1368r = b6;
        }
        return false;
    }

    @Override // c0.v
    public boolean f() {
        return this.f1372wz != this.f1374xc;
    }

    public final void f3(byte b4) {
        if (b4 == 32) {
            k5(2);
            return;
        }
        if (b4 == 41) {
            k5(3);
            return;
        }
        switch (b4) {
            case 37:
                k5(1);
                yt(2);
                break;
            case 38:
                k5(1);
                yt(3);
                break;
            case 39:
                k5(1);
                yt(4);
                break;
            default:
                int i = this.w;
                if (i != 0) {
                    if (b4 != 33) {
                        switch (b4) {
                            case 44:
                                this.f1372wz = Collections.emptyList();
                                int i5 = this.w;
                                if (i5 == 1 || i5 == 3) {
                                    b();
                                }
                                break;
                            case 45:
                                if (i == 1 && !this.f1371tl.c5()) {
                                    this.f1371tl.f();
                                    break;
                                }
                                break;
                            case 46:
                                b();
                                break;
                            case 47:
                                this.f1372wz = mt();
                                b();
                                break;
                        }
                    } else {
                        this.f1371tl.a();
                        break;
                    }
                }
                break;
        }
    }

    @Override // c0.v
    @Nullable
    /* JADX INFO: renamed from: fb */
    public /* bridge */ /* synthetic */ wz gv() throws f {
        return super.gv();
    }

    @Override // c0.v, di.gv
    public void flush() {
        super.flush();
        this.f1372wz = null;
        this.f1374xc = null;
        k5(0);
        yt(4);
        b();
        this.f1366mt = false;
        this.f1361co = false;
        this.z = (byte) 0;
        this.f1368r = (byte) 0;
        this.f1373x4 = 0;
        this.f1364i4 = true;
        this.f3 = -9223372036854775807L;
    }

    public final boolean hw(byte b4) {
        if (c(b4)) {
            this.f1373x4 = p(b4);
        }
        return this.f1373x4 == this.f1365i9;
    }

    public final void i4(byte b4) {
        this.f1371tl.v(' ');
        this.f1371tl.w((b4 >> 1) & 7, (b4 & 1) == 1);
    }

    public final void k5(int i) {
        int i5 = this.w;
        if (i5 == i) {
            return;
        }
        this.w = i;
        if (i == 3) {
            for (int i8 = 0; i8 < this.f1370t.size(); i8++) {
                this.f1370t.get(i8).t(i);
            }
            return;
        }
        b();
        if (i5 == 3 || i == 1 || i == 0) {
            this.f1372wz = Collections.emptyList();
        }
    }

    public final List<b0.n3> mt() {
        int size = this.f1370t.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            b0.n3 n3VarFb = this.f1370t.get(i).fb(Integer.MIN_VALUE);
            arrayList.add(n3VarFb);
            if (n3VarFb != null) {
                iMin = Math.min(iMin, n3VarFb.f1200co);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            b0.n3 n3Var = (b0.n3) arrayList.get(i5);
            if (n3Var != null) {
                if (n3Var.f1200co != iMin) {
                    n3Var = (b0.n3) v0.y.v(this.f1370t.get(i5).fb(iMin));
                }
                arrayList2.add(n3Var);
            }
        }
        return arrayList2;
    }

    public final void n(byte b4, byte b6) {
        int i = n[b4 & 7];
        if ((b6 & 32) != 0) {
            i++;
        }
        if (i != this.f1371tl.f1377gv) {
            if (this.w != 1 && !this.f1371tl.c5()) {
                C0043y c0043y = new C0043y(this.w, this.f1367p);
                this.f1371tl = c0043y;
                this.f1370t.add(c0043y);
            }
            this.f1371tl.f1377gv = i;
        }
        boolean z = (b6 & 16) == 16;
        boolean z5 = (b6 & 1) == 1;
        int i5 = (b6 >> 1) & 7;
        this.f1371tl.w(z ? 8 : i5, z5);
        if (z) {
            this.f1371tl.f1379v = c[i5];
        }
    }

    @Override // c0.v, di.gv
    @Nullable
    /* JADX INFO: renamed from: s */
    public xc n3() throws f {
        xc xcVarC5;
        xc xcVarN3 = super.n3();
        if (xcVarN3 != null) {
            return xcVarN3;
        }
        if (!vl() || (xcVarC5 = c5()) == null) {
            return null;
        }
        this.f1372wz = Collections.emptyList();
        this.f3 = -9223372036854775807L;
        xcVarC5.mt(i9(), v(), Long.MAX_VALUE);
        return xcVarC5;
    }

    @Override // c0.v
    /* JADX INFO: renamed from: t */
    public /* bridge */ /* synthetic */ void zn(wz wzVar) throws f {
        super.zn(wzVar);
    }

    @Override // c0.v
    public c5 v() {
        List<b0.n3> list = this.f1372wz;
        this.f1374xc = list;
        return new a((List) v0.y.v(list));
    }

    public final boolean vl() {
        return (this.f1362f == -9223372036854775807L || this.f3 == -9223372036854775807L || i9() - this.f3 < this.f1362f) ? false : true;
    }

    public final void x(byte b4, byte b6) {
        if (a8(b4)) {
            this.f1364i4 = false;
            return;
        }
        if (z6(b4)) {
            if (b6 != 32 && b6 != 47) {
                switch (b6) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b6) {
                            case 42:
                            case 43:
                                this.f1364i4 = false;
                                break;
                        }
                }
            }
            this.f1364i4 = true;
        }
    }

    @Override // c0.v, b0.i9
    public /* bridge */ /* synthetic */ void y(long j) {
        super.y(j);
    }

    public final void yt(int i) {
        this.f1367p = i;
        this.f1371tl.tl(i);
    }

    @Override // c0.v, di.gv
    public void release() {
    }
}
