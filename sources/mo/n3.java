package mo;

import android.net.Uri;
import android.util.Pair;
import b1.d0;
import b1.mt;
import b1.p;
import b1.t;
import b1.ta;
import b1.tl;
import b1.wz;
import ft.g;
import ft.q;
import java.io.IOException;
import java.util.Map;
import mn.oz;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements t {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final mt f6709s = new mt() { // from class: mo.y
        @Override // b1.mt
        public final t[] createExtractors() {
            return n3.a();
        }

        @Override // b1.mt
        public /* synthetic */ t[] y(Uri uri, Map map) {
            return p.y(this, uri, map);
        }
    };
    public ta n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0134n3 f6713v;
    public wz y;
    public int zn = 0;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f6712gv = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6710a = -1;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f6711fb = -1;

    /* JADX INFO: renamed from: mo.n3$n3, reason: collision with other inner class name */
    public interface InterfaceC0134n3 {
        void n3(long j);

        void y(int i, long j) throws q;

        boolean zn(tl tlVar, long j) throws IOException;
    }

    public static final class y implements InterfaceC0134n3 {

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public static final int[] f6714tl = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public static final int[] f6715wz = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f6716a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f6717c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6718f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f6719fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f6720gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public long f6721i9;
        public final ta n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final g f6722s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f6723t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final byte[] f6724v;
        public final wz y;
        public final mo.zn zn;

        public y(wz wzVar, ta taVar, mo.zn znVar) throws q {
            this.y = wzVar;
            this.n3 = taVar;
            this.zn = znVar;
            int iMax = Math.max(1, znVar.zn / 10);
            this.f6719fb = iMax;
            d dVar = new d(znVar.f6733fb);
            dVar.c();
            int iC = dVar.c();
            this.f6720gv = iC;
            int i = znVar.n3;
            int i5 = (((znVar.f6735v - (i * 4)) * 8) / (znVar.f6732a * i)) + 1;
            if (iC == i5) {
                int iT = ut.t(iMax, iC);
                this.f6724v = new byte[znVar.f6735v * iT];
                this.f6716a = new d(iT * s(iC, i));
                int i8 = ((znVar.zn * znVar.f6735v) * 8) / iC;
                this.f6722s = new g.n3().o4("audio/raw").ud(i8).u(i8).f7(s(iMax, i)).a8(znVar.n3).rs(znVar.zn).jz(2).z6();
                return;
            }
            throw q.y("Expected frames per block: " + i5 + "; got: " + iC, null);
        }

        public static int s(int i, int i5) {
            return i * 2 * i5;
        }

        public final int a(int i) {
            return i / (this.zn.n3 * 2);
        }

        public final void c5(int i) {
            long jX5 = this.f6721i9 + ut.x5(this.f6723t, 1000000L, this.zn.zn);
            int iFb = fb(i);
            this.n3.a(jX5, 1, iFb, this.f6718f - iFb, null);
            this.f6723t += (long) i;
            this.f6718f -= iFb;
        }

        public final int fb(int i) {
            return s(i, this.zn.n3);
        }

        public final void gv(byte[] bArr, int i, d dVar) {
            for (int i5 = 0; i5 < i; i5++) {
                for (int i8 = 0; i8 < this.zn.n3; i8++) {
                    v(bArr, i5, i8, dVar.v());
                }
            }
            int iFb = fb(this.f6720gv * i);
            dVar.oz(0);
            dVar.j(iFb);
        }

        @Override // mo.n3.InterfaceC0134n3
        public void n3(long j) {
            this.f6717c5 = 0;
            this.f6721i9 = j;
            this.f6718f = 0;
            this.f6723t = 0L;
        }

        public final void v(byte[] bArr, int i, int i5, byte[] bArr2) {
            mo.zn znVar = this.zn;
            int i8 = znVar.f6735v;
            int i10 = znVar.n3;
            int i11 = (i * i8) + (i5 * 4);
            int i12 = (i10 * 4) + i11;
            int i13 = (i8 / i10) - 4;
            int iP = (short) (((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255));
            int iMin = Math.min(bArr[i11 + 2] & 255, 88);
            int i14 = f6715wz[iMin];
            int i15 = ((i * this.f6720gv * i10) + i5) * 2;
            bArr2[i15] = (byte) (iP & 255);
            bArr2[i15 + 1] = (byte) (iP >> 8);
            for (int i16 = 0; i16 < i13 * 2; i16++) {
                byte b4 = bArr[((i16 / 8) * i10 * 4) + i12 + ((i16 / 2) % 4)];
                int i17 = i16 % 2 == 0 ? b4 & 15 : (b4 & 255) >> 4;
                int i18 = ((((i17 & 7) * 2) + 1) * i14) >> 3;
                if ((i17 & 8) != 0) {
                    i18 = -i18;
                }
                iP = ut.p(iP + i18, -32768, 32767);
                i15 += i10 * 2;
                bArr2[i15] = (byte) (iP & 255);
                bArr2[i15 + 1] = (byte) (iP >> 8);
                int i19 = iMin + f6714tl[i17];
                int[] iArr = f6715wz;
                iMin = ut.p(i19, 0, iArr.length - 1);
                i14 = iArr[iMin];
            }
        }

        @Override // mo.n3.InterfaceC0134n3
        public void y(int i, long j) {
            this.y.z(new v(this.zn, this.f6720gv, i, j));
            this.n3.y(this.f6722s);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:4:0x001c). Please report as a decompilation issue!!! */
        @Override // mo.n3.InterfaceC0134n3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean zn(b1.tl r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f6719fb
                int r1 = r6.f6718f
                int r1 = r6.a(r1)
                int r0 = r0 - r1
                int r1 = r6.f6720gv
                int r0 = v0.ut.t(r0, r1)
                mo.zn r1 = r6.zn
                int r1 = r1.f6735v
                int r0 = r0 * r1
                r1 = 0
                r3 = 1
                int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r4 != 0) goto L1e
            L1c:
                r1 = 1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                if (r1 != 0) goto L3f
                int r2 = r6.f6717c5
                if (r2 >= r0) goto L3f
                int r2 = r0 - r2
                long r4 = (long) r2
                long r4 = java.lang.Math.min(r4, r8)
                int r2 = (int) r4
                byte[] r4 = r6.f6724v
                int r5 = r6.f6717c5
                int r2 = r7.read(r4, r5, r2)
                r4 = -1
                if (r2 != r4) goto L39
                goto L1c
            L39:
                int r4 = r6.f6717c5
                int r4 = r4 + r2
                r6.f6717c5 = r4
                goto L1f
            L3f:
                int r7 = r6.f6717c5
                mo.zn r8 = r6.zn
                int r8 = r8.f6735v
                int r7 = r7 / r8
                if (r7 <= 0) goto L77
                byte[] r8 = r6.f6724v
                v0.d r9 = r6.f6716a
                r6.gv(r8, r7, r9)
                int r8 = r6.f6717c5
                mo.zn r9 = r6.zn
                int r9 = r9.f6735v
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f6717c5 = r8
                v0.d r7 = r6.f6716a
                int r7 = r7.fb()
                b1.ta r8 = r6.n3
                v0.d r9 = r6.f6716a
                r8.n3(r9, r7)
                int r8 = r6.f6718f
                int r8 = r8 + r7
                r6.f6718f = r8
                int r7 = r6.a(r8)
                int r8 = r6.f6719fb
                if (r7 < r8) goto L77
                r6.c5(r8)
            L77:
                if (r1 == 0) goto L84
                int r7 = r6.f6718f
                int r7 = r6.a(r7)
                if (r7 <= 0) goto L84
                r6.c5(r7)
            L84:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: mo.n3.y.zn(b1.tl, long):boolean");
        }
    }

    public static final class zn implements InterfaceC0134n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f6725a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f6726fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final g f6727gv;
        public final ta n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f6728s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f6729v;
        public final wz y;
        public final mo.zn zn;

        public zn(wz wzVar, ta taVar, mo.zn znVar, String str, int i) throws q {
            this.y = wzVar;
            this.n3 = taVar;
            this.zn = znVar;
            int i5 = (znVar.n3 * znVar.f6732a) / 8;
            if (znVar.f6735v == i5) {
                int i8 = znVar.zn;
                int i10 = i8 * i5 * 8;
                int iMax = Math.max(i5, (i8 * i5) / 10);
                this.f6729v = iMax;
                this.f6727gv = new g.n3().o4(str).ud(i10).u(i10).f7(iMax).a8(znVar.n3).rs(znVar.zn).jz(i).z6();
                return;
            }
            throw q.y("Expected block size: " + i5 + "; got: " + znVar.f6735v, null);
        }

        @Override // mo.n3.InterfaceC0134n3
        public void n3(long j) {
            this.f6725a = j;
            this.f6726fb = 0;
            this.f6728s = 0L;
        }

        @Override // mo.n3.InterfaceC0134n3
        public void y(int i, long j) {
            this.y.z(new v(this.zn, 1, i, j));
            this.n3.y(this.f6727gv);
        }

        @Override // mo.n3.InterfaceC0134n3
        public boolean zn(tl tlVar, long j) throws IOException {
            int i;
            int i5;
            long j4 = j;
            while (j4 > 0 && (i = this.f6726fb) < (i5 = this.f6729v)) {
                int iV = this.n3.v(tlVar, (int) Math.min(i5 - i, j4), true);
                if (iV == -1) {
                    j4 = 0;
                } else {
                    this.f6726fb += iV;
                    j4 -= (long) iV;
                }
            }
            int i8 = this.zn.f6735v;
            int i10 = this.f6726fb / i8;
            if (i10 > 0) {
                long jX5 = this.f6725a + ut.x5(this.f6728s, 1000000L, r1.zn);
                int i11 = i10 * i8;
                int i12 = this.f6726fb - i11;
                this.n3.a(jX5, 1, i11, i12, null);
                this.f6728s += (long) i10;
                this.f6726fb = i12;
            }
            return j4 <= 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t[] a() {
        return new t[]{new n3()};
    }

    private void v() {
        v0.y.c5(this.n3);
        ut.i9(this.y);
    }

    public final void c5(tl tlVar) throws IOException {
        mo.zn znVarN3 = gv.n3(tlVar);
        int i = znVarN3.y;
        if (i == 17) {
            this.f6713v = new y(this.y, this.n3, znVarN3);
        } else if (i == 6) {
            this.f6713v = new zn(this.y, this.n3, znVarN3, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.f6713v = new zn(this.y, this.n3, znVarN3, "audio/g711-mlaw", -1);
        } else {
            int iY = oz.y(i, znVarN3.f6732a);
            if (iY == 0) {
                throw q.f("Unsupported WAV format type: " + znVarN3.y);
            }
            this.f6713v = new zn(this.y, this.n3, znVarN3, "audio/raw", iY);
        }
        this.zn = 3;
    }

    public final int f(tl tlVar) throws IOException {
        v0.y.fb(this.f6711fb != -1);
        return ((InterfaceC0134n3) v0.y.v(this.f6713v)).zn(tlVar, this.f6711fb - tlVar.getPosition()) ? -1 : 0;
    }

    @Override // b1.t
    public int fb(tl tlVar, d0 d0Var) throws IOException {
        v();
        int i = this.zn;
        if (i == 0) {
            s(tlVar);
            return 0;
        }
        if (i == 1) {
            i9(tlVar);
            return 0;
        }
        if (i == 2) {
            c5(tlVar);
            return 0;
        }
        if (i == 3) {
            t(tlVar);
            return 0;
        }
        if (i == 4) {
            return f(tlVar);
        }
        throw new IllegalStateException();
    }

    @Override // b1.t
    public boolean gv(tl tlVar) throws IOException {
        return gv.y(tlVar);
    }

    public final void i9(tl tlVar) throws IOException {
        this.f6712gv = gv.zn(tlVar);
        this.zn = 2;
    }

    public final void s(tl tlVar) throws IOException {
        v0.y.fb(tlVar.getPosition() == 0);
        int i = this.f6710a;
        if (i != -1) {
            tlVar.w(i);
            this.zn = 4;
        } else {
            if (!gv.y(tlVar)) {
                throw q.y("Unsupported or unrecognized wav file type.", null);
            }
            tlVar.w((int) (tlVar.f() - tlVar.getPosition()));
            this.zn = 1;
        }
    }

    public final void t(tl tlVar) throws IOException {
        Pair<Long, Long> pairV = gv.v(tlVar);
        this.f6710a = ((Long) pairV.first).intValue();
        long jLongValue = ((Long) pairV.second).longValue();
        long j = this.f6712gv;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        this.f6711fb = ((long) this.f6710a) + jLongValue;
        long length = tlVar.getLength();
        if (length != -1 && this.f6711fb > length) {
            r.c5("WavExtractor", "Data exceeds input length: " + this.f6711fb + ", " + length);
            this.f6711fb = length;
        }
        ((InterfaceC0134n3) v0.y.v(this.f6713v)).y(this.f6710a, this.f6711fb);
        this.zn = 4;
    }

    @Override // b1.t
    public void y(long j, long j4) {
        this.zn = j == 0 ? 0 : 4;
        InterfaceC0134n3 interfaceC0134n3 = this.f6713v;
        if (interfaceC0134n3 != null) {
            interfaceC0134n3.n3(j4);
        }
    }

    @Override // b1.t
    public void zn(wz wzVar) {
        this.y = wzVar;
        this.n3 = wzVar.a(0, 1);
        wzVar.p();
    }

    @Override // b1.t
    public void release() {
    }
}
