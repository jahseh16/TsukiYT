package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y8 implements InterfaceC0636Hq {
    public static byte[] A04;
    public static String[] A05 = {"Xobc5aSRFsnlTfq950Hm2L3uP2yqTx5R", "l", "qpzLH3olNTSgnmEJfqgMoILAygrv9Gvu", "rA2kHVtwjUdxF3LXQtoL786BdYvsVYLD", "0rBDFyThd5IBv1Jp4I3rS", "drj1vvUtkoX3RGiyI02l8il3i3aSfPCy", "cZlTLMFk7RrLemAAhuy1ARzIYrj9DMLk", "NSM"};
    public Y5 A00;
    public InterfaceC0636Hq A01;
    public final C9Z A02;
    public final C0980Ve A03;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-84, -44, -53, -45, -56, -49, -53, -60, 127, -47, -60, -51, -61, -60, -47, -60, -47, 127, -52, -60, -61, -56, -64, 127, -62, -53, -50, -62, -54, -46, 127, -60, -51, -64, -63, -53, -60, -61, -115};
    }

    static {
        A02();
    }

    public Y8(C9Z c9z, InterfaceC0623Hd interfaceC0623Hd) {
        this.A02 = c9z;
        this.A03 = new C0980Ve(interfaceC0623Hd);
    }

    private void A01() {
        this.A03.A02(this.A01.A7k());
        C04559x c04559xA7h = this.A01.A7h();
        if (!c04559xA7h.equals(this.A03.A7h())) {
            this.A03.AGA(c04559xA7h);
            this.A02.ACb(c04559xA7h);
        }
    }

    private boolean A03() {
        Y5 y5 = this.A00;
        if (y5 != null && !y5.A91()) {
            boolean zA9C = this.A00.A9C();
            if (A05[1].length() == 23) {
                throw new RuntimeException();
            }
            A05[1] = "Da4vHoBMew1xMnwVwhw0NxQudcM";
            if (zA9C || !this.A00.A8a()) {
                return true;
            }
        }
        return false;
    }

    public final long A04() {
        if (A03()) {
            A01();
            long jA7k = this.A01.A7k();
            if (A05[7].length() == 18) {
                throw new RuntimeException();
            }
            A05[7] = "L098bBK7xK";
            return jA7k;
        }
        return this.A03.A7k();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j) {
        this.A03.A02(j);
    }

    public final void A08(Y5 y5) {
        if (y5 == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(Y5 y5) throws C04359c {
        InterfaceC0636Hq interfaceC0636HqA7N = y5.A7N();
        if (interfaceC0636HqA7N != null) {
            InterfaceC0636Hq interfaceC0636Hq = this.A01;
            if (A05[0].charAt(12) != 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "G6KpX7Ur5Z0x6RCw4xSrHpY3l6NonZ5O";
            strArr[3] = "DkiI2Rz4cuYvxyrSRslfvXTI6PdAzLXl";
            if (interfaceC0636HqA7N != interfaceC0636Hq) {
                if (interfaceC0636Hq == null) {
                    this.A01 = interfaceC0636HqA7N;
                    this.A00 = y5;
                    InterfaceC0636Hq rendererMediaClock = this.A03;
                    interfaceC0636HqA7N.AGA(rendererMediaClock.A7h());
                    A01();
                    return;
                }
                throw C04359c.A02(new IllegalStateException(A00(0, 39, 31)));
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0636Hq
    public final C04559x A7h() {
        InterfaceC0636Hq interfaceC0636Hq = this.A01;
        if (interfaceC0636Hq != null) {
            return interfaceC0636Hq.A7h();
        }
        return this.A03.A7h();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0636Hq
    public final long A7k() {
        if (A03()) {
            return this.A01.A7k();
        }
        return this.A03.A7k();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0636Hq
    public final C04559x AGA(C04559x c04559x) {
        InterfaceC0636Hq interfaceC0636Hq = this.A01;
        if (interfaceC0636Hq != null) {
            c04559x = interfaceC0636Hq.AGA(c04559x);
        }
        this.A03.AGA(c04559x);
        this.A02.ACb(c04559x);
        return c04559x;
    }
}
