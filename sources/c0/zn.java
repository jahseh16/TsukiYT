package c0;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import b0.c5;
import b0.f;
import b0.n3;
import b0.wz;
import b0.xc;
import c0.zn;
import com.google.firebase.remoteconfig.internal.Code;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import v0.d;
import v0.r;
import v0.ta;

/* JADX INFO: loaded from: classes.dex */
public final class zn extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1381f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final boolean f1383i9;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1384p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n3[] f1386t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public n3 f1387tl;

    @Nullable
    public C0045zn w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    @Nullable
    public List<b0.n3> f1388wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    @Nullable
    public List<b0.n3> f1389xc;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final d f1382fb = new d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ta f1385s = new ta();

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f1380c5 = -1;

    public static final class n3 {
        public static final int[] c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int[] f1390d;
        public static final int[] d0;
        public static final int f3;
        public static final int[] fh;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        public static final int f1391i4 = s(2, 2, 2, 0);
        public static final int[] mg;
        public static final int n;
        public static final boolean[] rz;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        public static final int[] f1392ta;

        /* JADX INFO: renamed from: z6, reason: collision with root package name */
        public static final int[] f1393z6;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1394a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f1395c5;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public int f1396co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1397f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f1398fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f1399gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public int f1400i9;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public int f1401mt;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1402p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1403r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1404s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1405t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public int f1406tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1407v;
        public int w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public int f1408wz;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public int f1409x4;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public int f1410xc;
        public int z;
        public boolean zn;
        public final List<SpannableString> y = new ArrayList();
        public final SpannableStringBuilder n3 = new SpannableStringBuilder();

        static {
            int iS = s(0, 0, 0, 0);
            f3 = iS;
            int iS2 = s(0, 0, 0, 3);
            n = iS2;
            c = new int[]{0, 0, 0, 0, 0, 2, 0};
            d0 = new int[]{0, 0, 0, 0, 0, 0, 2};
            fh = new int[]{3, 3, 3, 3, 3, 3, 1};
            rz = new boolean[]{false, false, false, true, true, true, false};
            mg = new int[]{iS, iS2, iS, iS, iS2, iS, iS};
            f1392ta = new int[]{0, 1, 2, 3, 4, 3, 4};
            f1390d = new int[]{0, 0, 0, 0, 0, 3, 3};
            f1393z6 = new int[]{iS, iS, iS, iS, iS, iS2, iS2};
        }

        public n3() {
            t();
        }

        public static int fb(int i, int i5, int i8) {
            return s(i, i5, i8, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int s(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                v0.y.zn(r4, r0, r1)
                v0.y.zn(r5, r0, r1)
                v0.y.zn(r6, r0, r1)
                v0.y.zn(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L20
                r3 = 3
                if (r7 == r3) goto L1e
            L1b:
                r7 = 255(0xff, float:3.57E-43)
                goto L22
            L1e:
                r7 = 0
                goto L22
            L20:
                r7 = 127(0x7f, float:1.78E-43)
            L22:
                if (r4 <= r1) goto L27
                r4 = 255(0xff, float:3.57E-43)
                goto L28
            L27:
                r4 = 0
            L28:
                if (r5 <= r1) goto L2d
                r5 = 255(0xff, float:3.57E-43)
                goto L2e
            L2d:
                r5 = 0
            L2e:
                if (r6 <= r1) goto L32
                r0 = 255(0xff, float:3.57E-43)
            L32:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: c0.zn.n3.s(int, int, int, int):int");
        }

        public void a(boolean z, boolean z5, boolean z7, int i, boolean z8, int i5, int i8, int i10, int i11, int i12, int i13, int i14) {
            this.zn = true;
            this.f1399gv = z;
            this.f1397f = z5;
            this.f1407v = i;
            this.f1394a = z8;
            this.f1398fb = i5;
            this.f1404s = i8;
            this.f1395c5 = i12;
            int i15 = i10 + 1;
            if (this.f1400i9 != i15) {
                this.f1400i9 = i15;
                while (true) {
                    if ((!z5 || this.y.size() < this.f1400i9) && this.y.size() < 15) {
                        break;
                    } else {
                        this.y.remove(0);
                    }
                }
            }
            if (i13 != 0 && this.f1406tl != i13) {
                this.f1406tl = i13;
                int i16 = i13 - 1;
                p(mg[i16], n, rz[i16], 0, d0[i16], fh[i16], c[i16]);
            }
            if (i14 == 0 || this.f1408wz == i14) {
                return;
            }
            this.f1408wz = i14;
            int i17 = i14 - 1;
            tl(0, 1, 1, false, false, f1390d[i17], f1392ta[i17]);
            wz(f1391i4, f1393z6[i17], f3);
        }

        public boolean c5() {
            return this.zn;
        }

        public boolean f() {
            return this.f1399gv;
        }

        public SpannableString gv() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.n3);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.w != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.w, length, 33);
                }
                if (this.f1402p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f1402p, length, 33);
                }
                if (this.f1401mt != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f1396co), this.f1401mt, length, 33);
                }
                if (this.z != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f1403r), this.z, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean i9() {
            return !c5() || (this.y.isEmpty() && this.n3.length() == 0);
        }

        public void n3() {
            int length = this.n3.length();
            if (length > 0) {
                this.n3.delete(length - 1, length);
            }
        }

        public void p(int i, int i5, boolean z, int i8, int i10, int i11, int i12) {
            this.f1410xc = i;
            this.f1405t = i12;
        }

        public void t() {
            v();
            this.zn = false;
            this.f1399gv = false;
            this.f1407v = 4;
            this.f1394a = false;
            this.f1398fb = 0;
            this.f1404s = 0;
            this.f1395c5 = 0;
            this.f1400i9 = 15;
            this.f1397f = true;
            this.f1405t = 0;
            this.f1406tl = 0;
            this.f1408wz = 0;
            int i = f3;
            this.f1410xc = i;
            this.f1396co = f1391i4;
            this.f1403r = i;
        }

        public void tl(int i, int i5, int i8, boolean z, boolean z5, int i10, int i11) {
            if (this.w != -1) {
                if (!z) {
                    this.n3.setSpan(new StyleSpan(2), this.w, this.n3.length(), 33);
                    this.w = -1;
                }
            } else if (z) {
                this.w = this.n3.length();
            }
            if (this.f1402p == -1) {
                if (z5) {
                    this.f1402p = this.n3.length();
                }
            } else {
                if (z5) {
                    return;
                }
                this.n3.setSpan(new UnderlineSpan(), this.f1402p, this.n3.length(), 33);
                this.f1402p = -1;
            }
        }

        public void v() {
            this.y.clear();
            this.n3.clear();
            this.w = -1;
            this.f1402p = -1;
            this.f1401mt = -1;
            this.z = -1;
            this.f1409x4 = 0;
        }

        public void w(boolean z) {
            this.f1399gv = z;
        }

        public void wz(int i, int i5, int i8) {
            if (this.f1401mt != -1 && this.f1396co != i) {
                this.n3.setSpan(new ForegroundColorSpan(this.f1396co), this.f1401mt, this.n3.length(), 33);
            }
            if (i != f1391i4) {
                this.f1401mt = this.n3.length();
                this.f1396co = i;
            }
            if (this.z != -1 && this.f1403r != i5) {
                this.n3.setSpan(new BackgroundColorSpan(this.f1403r), this.z, this.n3.length(), 33);
            }
            if (i5 != f3) {
                this.z = this.n3.length();
                this.f1403r = i5;
            }
        }

        public void xc(int i, int i5) {
            if (this.f1409x4 != i) {
                y('\n');
            }
            this.f1409x4 = i;
        }

        public void y(char c3) {
            if (c3 != '\n') {
                this.n3.append(c3);
                return;
            }
            this.y.add(gv());
            this.n3.clear();
            if (this.w != -1) {
                this.w = 0;
            }
            if (this.f1402p != -1) {
                this.f1402p = 0;
            }
            if (this.f1401mt != -1) {
                this.f1401mt = 0;
            }
            if (this.z != -1) {
                this.z = 0;
            }
            while (true) {
                if ((!this.f1397f || this.y.size() < this.f1400i9) && this.y.size() < 15) {
                    return;
                } else {
                    this.y.remove(0);
                }
            }
        }

        @Nullable
        public y zn() {
            Layout.Alignment alignment;
            float f4;
            float f5;
            if (i9()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.y.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.y.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) gv());
            int i5 = this.f1405t;
            if (i5 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i5 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f1405t);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f1394a) {
                f4 = this.f1404s / 99.0f;
                f5 = this.f1398fb / 99.0f;
            } else {
                f4 = this.f1404s / 209.0f;
                f5 = this.f1398fb / 74.0f;
            }
            float f7 = (f4 * 0.9f) + 0.05f;
            float f8 = (f5 * 0.9f) + 0.05f;
            int i8 = this.f1395c5;
            return new y(spannableStringBuilder, alignment2, f8, 0, i8 / 3 == 0 ? 0 : i8 / 3 == 1 ? 1 : 2, f7, i8 % 3 == 0 ? 0 : i8 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f1410xc != f3, this.f1410xc, this.f1407v);
        }
    }

    public static final class y {
        public static final Comparator<y> zn = new Comparator() { // from class: c0.n3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return zn.y.zn((zn.y) obj, (zn.y) obj2);
            }
        };
        public final int n3;
        public final b0.n3 y;

        public y(CharSequence charSequence, Layout.Alignment alignment, float f3, int i, int i5, float f4, int i8, float f5, boolean z, int i10, int i11) {
            n3.C0034n3 c0034n3Wz = new n3.C0034n3().xc(charSequence).w(alignment).s(f3, i).c5(i5).f(f4).t(i8).wz(f5);
            if (z) {
                c0034n3Wz.co(i10);
            }
            this.y = c0034n3Wz.y();
            this.n3 = i11;
        }

        public static /* synthetic */ int zn(y yVar, y yVar2) {
            return Integer.compare(yVar2.n3, yVar.n3);
        }
    }

    /* JADX INFO: renamed from: c0.zn$zn, reason: collision with other inner class name */
    public static final class C0045zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f1411gv = 0;
        public final int n3;
        public final int y;
        public final byte[] zn;

        public C0045zn(int i, int i5) {
            this.y = i;
            this.n3 = i5;
            this.zn = new byte[(i5 * 2) - 1];
        }
    }

    public zn(int i, @Nullable List<byte[]> list) {
        this.f1381f = i == -1 ? 1 : i;
        this.f1383i9 = list != null && v0.a.c5(list);
        this.f1386t = new n3[8];
        for (int i5 = 0; i5 < 8; i5++) {
            this.f1386t[i5] = new n3();
        }
        this.f1387tl = this.f1386t[0];
    }

    private void ta() {
        for (int i = 0; i < 8; i++) {
            this.f1386t[i].t();
        }
    }

    private List<b0.n3> w() {
        y yVarZn;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f1386t[i].i9() && this.f1386t[i].f() && (yVarZn = this.f1386t[i].zn()) != null) {
                arrayList.add(yVarZn);
            }
        }
        Collections.sort(arrayList, y.zn);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            arrayList2.add(((y) arrayList.get(i5)).y);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // c0.v
    public void a(wz wzVar) {
        ByteBuffer byteBuffer = (ByteBuffer) v0.y.v(wzVar.f3179fb);
        this.f1382fb.o(byteBuffer.array(), byteBuffer.limit());
        while (this.f1382fb.y() >= 3) {
            int iEj = this.f1382fb.ej();
            int i = iEj & 3;
            boolean z = (iEj & 4) == 4;
            byte bEj = (byte) this.f1382fb.ej();
            byte bEj2 = (byte) this.f1382fb.ej();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        xc();
                        int i5 = (bEj & 192) >> 6;
                        int i8 = this.f1380c5;
                        if (i8 != -1 && i5 != (i8 + 1) % 4) {
                            ta();
                            r.c5("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f1380c5 + " current=" + i5);
                        }
                        this.f1380c5 = i5;
                        int i10 = bEj & 63;
                        if (i10 == 0) {
                            i10 = 64;
                        }
                        C0045zn c0045zn = new C0045zn(i5, i10);
                        this.w = c0045zn;
                        byte[] bArr = c0045zn.zn;
                        int i11 = c0045zn.f1411gv;
                        c0045zn.f1411gv = i11 + 1;
                        bArr[i11] = bEj2;
                    } else {
                        v0.y.y(i == 2);
                        C0045zn c0045zn2 = this.w;
                        if (c0045zn2 == null) {
                            r.zn("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0045zn2.zn;
                            int i12 = c0045zn2.f1411gv;
                            int i13 = i12 + 1;
                            c0045zn2.f1411gv = i13;
                            bArr2[i12] = bEj;
                            c0045zn2.f1411gv = i12 + 2;
                            bArr2[i13] = bEj2;
                        }
                    }
                    C0045zn c0045zn3 = this.w;
                    if (c0045zn3.f1411gv == (c0045zn3.n3 * 2) - 1) {
                        xc();
                    }
                }
            }
        }
    }

    public final void c() {
        this.f1387tl.tl(this.f1385s.s(4), this.f1385s.s(2), this.f1385s.s(2), this.f1385s.fb(), this.f1385s.fb(), this.f1385s.s(3), this.f1385s.s(3));
    }

    public final void co(int i) {
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            this.f1385s.mt(8);
        } else if (i <= 23) {
            this.f1385s.mt(16);
        } else if (i <= 31) {
            this.f1385s.mt(24);
        }
    }

    public final void d0() {
        int iS = n3.s(this.f1385s.s(2), this.f1385s.s(2), this.f1385s.s(2), this.f1385s.s(2));
        int iS2 = n3.s(this.f1385s.s(2), this.f1385s.s(2), this.f1385s.s(2), this.f1385s.s(2));
        this.f1385s.mt(2);
        this.f1387tl.wz(iS, iS2, n3.fb(this.f1385s.s(2), this.f1385s.s(2), this.f1385s.s(2)));
    }

    @Override // c0.v
    public boolean f() {
        return this.f1388wz != this.f1389xc;
    }

    public final void f3(int i) {
        if (i == 32) {
            this.f1387tl.y(' ');
        }
        if (i == 33) {
            this.f1387tl.y((char) 160);
            return;
        }
        if (i == 37) {
            this.f1387tl.y((char) 8230);
            return;
        }
        if (i == 42) {
            this.f1387tl.y((char) 352);
            return;
        }
        if (i == 44) {
            this.f1387tl.y((char) 338);
            return;
        }
        if (i == 63) {
            this.f1387tl.y((char) 376);
            return;
        }
        if (i == 57) {
            this.f1387tl.y((char) 8482);
            return;
        }
        if (i == 58) {
            this.f1387tl.y((char) 353);
            return;
        }
        if (i == 60) {
            this.f1387tl.y((char) 339);
            return;
        }
        if (i == 61) {
            this.f1387tl.y((char) 8480);
            return;
        }
        switch (i) {
            case 48:
                this.f1387tl.y((char) 9608);
                break;
            case 49:
                this.f1387tl.y((char) 8216);
                break;
            case 50:
                this.f1387tl.y((char) 8217);
                break;
            case 51:
                this.f1387tl.y((char) 8220);
                break;
            case 52:
                this.f1387tl.y((char) 8221);
                break;
            case 53:
                this.f1387tl.y((char) 8226);
                break;
            default:
                switch (i) {
                    case 118:
                        this.f1387tl.y((char) 8539);
                        break;
                    case 119:
                        this.f1387tl.y((char) 8540);
                        break;
                    case 120:
                        this.f1387tl.y((char) 8541);
                        break;
                    case 121:
                        this.f1387tl.y((char) 8542);
                        break;
                    case 122:
                        this.f1387tl.y((char) 9474);
                        break;
                    case 123:
                        this.f1387tl.y((char) 9488);
                        break;
                    case 124:
                        this.f1387tl.y((char) 9492);
                        break;
                    case 125:
                        this.f1387tl.y((char) 9472);
                        break;
                    case 126:
                        this.f1387tl.y((char) 9496);
                        break;
                    case 127:
                        this.f1387tl.y((char) 9484);
                        break;
                    default:
                        r.c5("Cea708Decoder", "Invalid G2 character: " + i);
                        break;
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

    public final void fh() {
        this.f1385s.mt(4);
        int iS = this.f1385s.s(4);
        this.f1385s.mt(2);
        this.f1387tl.xc(iS, this.f1385s.s(6));
    }

    @Override // c0.v, di.gv
    public void flush() {
        super.flush();
        this.f1388wz = null;
        this.f1389xc = null;
        this.f1384p = 0;
        this.f1387tl = this.f1386t[0];
        ta();
        this.w = null;
    }

    public final void i4(int i) {
        this.f1387tl.y((char) (i & 255));
    }

    public final void mg() {
        C0045zn c0045zn = this.w;
        if (c0045zn.f1411gv != (c0045zn.n3 * 2) - 1) {
            r.n3("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.w.n3 * 2) - 1) + ", but current index is " + this.w.f1411gv + " (sequence number " + this.w.y + ");");
        }
        ta taVar = this.f1385s;
        C0045zn c0045zn2 = this.w;
        taVar.xc(c0045zn2.zn, c0045zn2.f1411gv);
        boolean z = false;
        while (true) {
            if (this.f1385s.n3() <= 0) {
                break;
            }
            int iS = this.f1385s.s(3);
            int iS2 = this.f1385s.s(5);
            if (iS == 7) {
                this.f1385s.mt(2);
                iS = this.f1385s.s(6);
                if (iS < 7) {
                    r.c5("Cea708Decoder", "Invalid extended service number: " + iS);
                }
            }
            if (iS2 == 0) {
                if (iS != 0) {
                    r.c5("Cea708Decoder", "serviceNumber is non-zero (" + iS + ") when blockSize is 0");
                }
            } else if (iS != this.f1381f) {
                this.f1385s.co(iS2);
            } else {
                int iV = this.f1385s.v() + (iS2 * 8);
                while (this.f1385s.v() < iV) {
                    int iS3 = this.f1385s.s(8);
                    if (iS3 == 16) {
                        int iS4 = this.f1385s.s(8);
                        if (iS4 <= 31) {
                            co(iS4);
                        } else {
                            if (iS4 <= 127) {
                                f3(iS4);
                            } else if (iS4 <= 159) {
                                z(iS4);
                            } else if (iS4 <= 255) {
                                n(iS4);
                            } else {
                                r.c5("Cea708Decoder", "Invalid extended command: " + iS4);
                            }
                            z = true;
                        }
                    } else if (iS3 <= 31) {
                        p(iS3);
                    } else {
                        if (iS3 <= 127) {
                            x4(iS3);
                        } else if (iS3 <= 159) {
                            mt(iS3);
                        } else if (iS3 <= 255) {
                            i4(iS3);
                        } else {
                            r.c5("Cea708Decoder", "Invalid base command: " + iS3);
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.f1388wz = w();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void mt(int i) {
        int i5 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i8 = i - 128;
                if (this.f1384p != i8) {
                    this.f1384p = i8;
                    this.f1387tl = this.f1386t[i8];
                }
                break;
            case 136:
                while (i5 <= 8) {
                    if (this.f1385s.fb()) {
                        this.f1386t[8 - i5].v();
                    }
                    i5++;
                }
                break;
            case 137:
                for (int i10 = 1; i10 <= 8; i10++) {
                    if (this.f1385s.fb()) {
                        this.f1386t[8 - i10].w(true);
                    }
                }
                break;
            case 138:
                while (i5 <= 8) {
                    if (this.f1385s.fb()) {
                        this.f1386t[8 - i5].w(false);
                    }
                    i5++;
                }
                break;
            case 139:
                for (int i11 = 1; i11 <= 8; i11++) {
                    if (this.f1385s.fb()) {
                        this.f1386t[8 - i11].w(!r0.f());
                    }
                }
                break;
            case 140:
                while (i5 <= 8) {
                    if (this.f1385s.fb()) {
                        this.f1386t[8 - i5].t();
                    }
                    i5++;
                }
                break;
            case 141:
                this.f1385s.mt(8);
                break;
            case 142:
                break;
            case 143:
                ta();
                break;
            case 144:
                if (this.f1387tl.c5()) {
                    c();
                } else {
                    this.f1385s.mt(16);
                }
                break;
            case 145:
                if (this.f1387tl.c5()) {
                    d0();
                } else {
                    this.f1385s.mt(24);
                }
                break;
            case 146:
                if (this.f1387tl.c5()) {
                    fh();
                } else {
                    this.f1385s.mt(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                r.c5("Cea708Decoder", "Invalid C1 command: " + i);
                break;
            case 151:
                if (this.f1387tl.c5()) {
                    rz();
                } else {
                    this.f1385s.mt(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i12 = i - 152;
                r(i12);
                if (this.f1384p != i12) {
                    this.f1384p = i12;
                    this.f1387tl = this.f1386t[i12];
                }
                break;
        }
    }

    public final void n(int i) {
        if (i == 160) {
            this.f1387tl.y((char) 13252);
            return;
        }
        r.c5("Cea708Decoder", "Invalid G3 character: " + i);
        this.f1387tl.y('_');
    }

    public final void p(int i) {
        if (i != 0) {
            if (i == 3) {
                this.f1388wz = w();
            }
            if (i == 8) {
                this.f1387tl.n3();
                return;
            }
            switch (i) {
                case Code.UNIMPLEMENTED /* 12 */:
                    ta();
                    break;
                case 13:
                    this.f1387tl.y('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        r.c5("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.f1385s.mt(8);
                    } else if (i >= 24 && i <= 31) {
                        r.c5("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.f1385s.mt(16);
                    } else {
                        r.c5("Cea708Decoder", "Invalid C0 command: " + i);
                    }
                    break;
            }
        }
    }

    public final void r(int i) {
        n3 n3Var = this.f1386t[i];
        this.f1385s.mt(2);
        boolean zFb = this.f1385s.fb();
        boolean zFb2 = this.f1385s.fb();
        boolean zFb3 = this.f1385s.fb();
        int iS = this.f1385s.s(3);
        boolean zFb4 = this.f1385s.fb();
        int iS2 = this.f1385s.s(7);
        int iS3 = this.f1385s.s(8);
        int iS4 = this.f1385s.s(4);
        int iS5 = this.f1385s.s(4);
        this.f1385s.mt(2);
        int iS6 = this.f1385s.s(6);
        this.f1385s.mt(2);
        n3Var.a(zFb, zFb2, zFb3, iS, zFb4, iS2, iS3, iS5, iS6, iS4, this.f1385s.s(3), this.f1385s.s(3));
    }

    @Override // c0.v, di.gv
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public final void rz() {
        int iS = n3.s(this.f1385s.s(2), this.f1385s.s(2), this.f1385s.s(2), this.f1385s.s(2));
        int iS2 = this.f1385s.s(2);
        int iFb = n3.fb(this.f1385s.s(2), this.f1385s.s(2), this.f1385s.s(2));
        if (this.f1385s.fb()) {
            iS2 |= 4;
        }
        boolean zFb = this.f1385s.fb();
        int iS3 = this.f1385s.s(2);
        int iS4 = this.f1385s.s(2);
        int iS5 = this.f1385s.s(2);
        this.f1385s.mt(8);
        this.f1387tl.p(iS, iFb, zFb, iS2, iS3, iS4, iS5);
    }

    @Override // c0.v
    @Nullable
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ xc n3() throws f {
        return super.n3();
    }

    @Override // c0.v
    /* JADX INFO: renamed from: t */
    public /* bridge */ /* synthetic */ void zn(wz wzVar) throws f {
        super.zn(wzVar);
    }

    @Override // c0.v
    public c5 v() {
        List<b0.n3> list = this.f1388wz;
        this.f1389xc = list;
        return new a((List) v0.y.v(list));
    }

    public final void x4(int i) {
        if (i == 127) {
            this.f1387tl.y((char) 9835);
        } else {
            this.f1387tl.y((char) (i & 255));
        }
    }

    public final void xc() {
        if (this.w == null) {
            return;
        }
        mg();
        this.w = null;
    }

    @Override // c0.v, b0.i9
    public /* bridge */ /* synthetic */ void y(long j) {
        super.y(j);
    }

    public final void z(int i) {
        if (i <= 135) {
            this.f1385s.mt(32);
            return;
        }
        if (i <= 143) {
            this.f1385s.mt(40);
        } else if (i <= 159) {
            this.f1385s.mt(2);
            this.f1385s.mt(this.f1385s.s(6) * 8);
        }
    }
}
