package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1029Xe implements InterfaceC0502Bs {
    public static byte[] A0F;
    public static String[] A0G = {"QnLOeuXESrCaGCWmeMmr3ccgSJivirlh", "YhzsmTzzzxhtyY2gbPt9z7nrByNpJ8AG", "zwujZ5tU8kb2uxp5tp3MFQMZqwl6Xl8T", "kc6RUJmY0MGel4Ws9MlGHroinjQjp2AB", "ZiGWNZua4Zts1sNsjYBSU4OXsNo5k01z", "vZczIWNBPrLvTkXGahgR3lrPVHA61MAE", "WEnNwLMqAaXyN6vSaeVfRhJYgSEHaora", "u0NJWOpvT5UyzhfOPQB88kiisy6mVL7a"};
    public static final InterfaceC0505Bv A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public InterfaceC0504Bu A06;
    public C1031Xg A07;
    public C1026Xb A08;
    public boolean A09;
    public final C0645Hz A0C = new C0645Hz(4);
    public final C0645Hz A0B = new C0645Hz(9);
    public final C0645Hz A0E = new C0645Hz(11);
    public final C0645Hz A0D = new C0645Hz();
    public final C1028Xd A0A = new C1028Xd();
    public int A01 = 1;
    public long A04 = -9223372036854775807L;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{-41, -35, -25};
    }

    static {
        A03();
        A0H = new C1030Xf();
        A0I = IF.A08(A01(0, 3, 61));
    }

    private C0645Hz A00(InterfaceC0503Bt interfaceC0503Bt) throws InterruptedException, IOException {
        if (this.A02 > this.A0D.A05()) {
            C0645Hz c0645Hz = this.A0D;
            c0645Hz.A0b(new byte[Math.max(c0645Hz.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        interfaceC0503Bt.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        long j;
        if (!this.A09) {
            this.A06.AFi(new C1034Xj(-9223372036854775807L));
            this.A09 = true;
        }
        if (this.A04 == -9223372036854775807L) {
            if (this.A0A.A0D() == -9223372036854775807L) {
                long j4 = this.A05;
                String[] strArr = A0G;
                if (strArr[5].charAt(20) != strArr[0].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0G;
                strArr2[7] = "L5UStG7DYoKpX710PXz3zQwSbfDogpGa";
                strArr2[6] = "NY6hXsIFzv8ItyXdU8z07IBZswL3MGXa";
                j = -j4;
            } else {
                j = 0;
            }
            this.A04 = j;
        }
    }

    private void A04(InterfaceC0503Bt interfaceC0503Bt) throws InterruptedException, IOException {
        interfaceC0503Bt.AGP(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(InterfaceC0503Bt interfaceC0503Bt) throws InterruptedException, IOException {
        if (!interfaceC0503Bt.AEM(this.A0B.A00, 0, 9, true)) {
            return false;
        }
        this.A0B.A0Y(0);
        this.A0B.A0Z(4);
        int iA0E = this.A0B.A0E();
        int flags = iA0E & 4;
        boolean hasVideo = flags != 0;
        int flags2 = iA0E & 1;
        boolean z = flags2 != 0;
        if (hasVideo && this.A07 == null) {
            this.A07 = new C1031Xg(this.A06.AGi(8, 1));
        }
        if (z && this.A08 == null) {
            this.A08 = new C1026Xb(this.A06.AGi(9, 2));
        }
        this.A06.A5Y();
        int flags3 = this.A0B.A08();
        this.A00 = (flags3 - 9) + 4;
        this.A01 = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A06(com.meta.analytics.dsp.uinode.InterfaceC0503Bt r9) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r8 = this;
            r7 = 1
            int r1 = r8.A03
            r0 = 8
            if (r1 != r0) goto L3e
            com.facebook.ads.redexgen.X.Xg r0 = r8.A07
            if (r0 == 0) goto L3e
            r8.A02()
            com.facebook.ads.redexgen.X.Xg r5 = r8.A07
            com.facebook.ads.redexgen.X.Hz r6 = r8.A00(r9)
            long r2 = r8.A04
            java.lang.String[] r4 = com.meta.analytics.dsp.uinode.C1029Xe.A0G
            r0 = 2
            r1 = r4[r0]
            r0 = 1
            r4 = r4[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            char r0 = r4.charAt(r0)
            if (r1 == r0) goto L8f
            java.lang.String[] r4 = com.meta.analytics.dsp.uinode.C1029Xe.A0G
            java.lang.String r1 = "14LyfFoDFqyov0bzU05kIxDiosYU9C09"
            r0 = 4
            r4[r0] = r1
            long r0 = r8.A05
            long r2 = r2 + r0
            r5.A00(r6, r2)
        L37:
            r0 = 4
            r8.A00 = r0
            r0 = 2
            r8.A01 = r0
            return r7
        L3e:
            r0 = 9
            if (r1 != r0) goto L58
            com.facebook.ads.redexgen.X.Xb r0 = r8.A08
            if (r0 == 0) goto L58
            r8.A02()
            com.facebook.ads.redexgen.X.Xb r5 = r8.A08
            com.facebook.ads.redexgen.X.Hz r4 = r8.A00(r9)
            long r2 = r8.A04
            long r0 = r8.A05
            long r2 = r2 + r0
            r5.A00(r4, r2)
            goto L37
        L58:
            r0 = 18
            if (r1 != r0) goto L88
            boolean r0 = r8.A09
            if (r0 != 0) goto L88
            com.facebook.ads.redexgen.X.Xd r3 = r8.A0A
            com.facebook.ads.redexgen.X.Hz r2 = r8.A00(r9)
            long r0 = r8.A05
            r3.A00(r2, r0)
            com.facebook.ads.redexgen.X.Xd r0 = r8.A0A
            long r2 = r0.A0D()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L37
            com.facebook.ads.redexgen.X.Bu r1 = r8.A06
            com.facebook.ads.redexgen.X.Xj r0 = new com.facebook.ads.redexgen.X.Xj
            r0.<init>(r2)
            r1.AFi(r0)
            r0 = 1
            r8.A09 = r0
            goto L37
        L88:
            int r0 = r8.A02
            r9.AGP(r0)
            r7 = 0
            goto L37
        L8f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1029Xe.A06(com.facebook.ads.redexgen.X.Bt):boolean");
    }

    private boolean A07(InterfaceC0503Bt interfaceC0503Bt) throws InterruptedException, IOException {
        if (!interfaceC0503Bt.AEM(this.A0E.A00, 0, 11, true)) {
            return false;
        }
        this.A0E.A0Y(0);
        this.A03 = this.A0E.A0E();
        this.A02 = this.A0E.A0G();
        this.A05 = this.A0E.A0G();
        this.A05 = (((long) (this.A0E.A0E() << 24)) | this.A05) * 1000;
        this.A0E.A0Z(3);
        this.A01 = 4;
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final void A8o(InterfaceC0504Bu interfaceC0504Bu) {
        this.A06 = interfaceC0504Bu;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final int AEH(InterfaceC0503Bt interfaceC0503Bt, C0507Bz c0507Bz) throws InterruptedException, IOException {
        while (true) {
            switch (this.A01) {
                case 1:
                    if (!A05(interfaceC0503Bt)) {
                        return -1;
                    }
                    break;
                    break;
                case 2:
                    A04(interfaceC0503Bt);
                    break;
                case 3:
                    if (!A07(interfaceC0503Bt)) {
                        return -1;
                    }
                    break;
                    break;
                case 4:
                    if (A06(interfaceC0503Bt)) {
                        return 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final void AFh(long j, long j4) {
        this.A01 = 1;
        this.A04 = -9223372036854775807L;
        this.A00 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final boolean AGR(InterfaceC0503Bt interfaceC0503Bt) throws InterruptedException, IOException {
        interfaceC0503Bt.ADv(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        interfaceC0503Bt.ADv(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & 250) != 0) {
            return false;
        }
        interfaceC0503Bt.ADv(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset = this.A0C.A08();
        interfaceC0503Bt.AFM();
        interfaceC0503Bt.A3W(dataOffset);
        interfaceC0503Bt.ADv(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset2 = this.A0C.A08();
        return dataOffset2 == 0;
    }
}
