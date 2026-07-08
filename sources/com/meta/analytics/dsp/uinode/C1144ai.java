package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1144ai implements AnonymousClass15 {
    public static byte[] A07;
    public static String[] A08 = {"NdU3dTBV9vpPy6YybD2Qky8Xp9oiymUK", "iGXlqhzjj4re98AW13mRmUxQt0ip7heY", "i4JUsV98mtHDxTx4GI", "uX4rqc35PVKyGMlab4Ievks4AeXTKuCR", "rLO13ppjW7wMy", "YX8F9O1K3gbo5OniWABn3Un2bmHHQded", "vQnjhTu4uDmsPPd6tCmWM2PRV3nZ7tVA", "6doRqStA7fW6oocsKlayDSgQ6jqa5ScM"};
    public final /* synthetic */ long A03;
    public final /* synthetic */ FO A04;
    public final /* synthetic */ C8Q A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{57, 46, 46, 51, 46, 67, 93, 73};
    }

    static {
        A01();
    }

    public C1144ai(FO fo, Runnable runnable, long j, C8Q c8q) {
        this.A04 = fo;
        this.A06 = runnable;
        this.A03 = j;
        this.A05 = c8q;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass15
    public final void ACM(C1182bK c1182bK) {
        if (!this.A00) {
            this.A00 = true;
            this.A04.A05(this.A05.A03(C8U.A03), null);
        }
        if (this.A04.A06 != null) {
            this.A04.A06.A0C();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass15
    public final void ACN(C1182bK c1182bK) {
        if (c1182bK != this.A04.A00) {
            return;
        }
        this.A04.A0F().removeCallbacks(this.A06);
        this.A04.A01 = c1182bK;
        this.A04.A06.A0F(c1182bK);
        if (!this.A02) {
            this.A02 = true;
            this.A04.A05(this.A05.A03(C8U.A05), this.A04.A01(this.A03));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass15
    public final void ACO(C1182bK c1182bK) {
        if (!this.A01) {
            this.A01 = true;
            FO fo = this.A04;
            C8Q c8q = this.A05;
            C8U c8u = C8U.A04;
            String[] strArr = A08;
            if (strArr[3].charAt(16) != strArr[0].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "w5hMaJohNUScvyTMb6YchiksjKW7iU2S";
            strArr2[0] = "lwejxTPFHVjkcDrib15s3w6szJ9sWeR6";
            fo.A05(c8q.A03(c8u), null);
        }
        this.A04.A0L();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass15
    public final void ACQ(C1182bK c1182bK, C0670Jb c0670Jb) {
        if (c1182bK != this.A04.A00) {
            return;
        }
        this.A04.A0F().removeCallbacks(this.A06);
        this.A04.A0N(c1182bK);
        if (!this.A02) {
            this.A02 = true;
            Map mapA01 = this.A04.A01(this.A03);
            mapA01.put(A00(0, 5, 58), String.valueOf(c0670Jb.A03().getErrorCode()));
            mapA01.put(A00(5, 3, 72), String.valueOf(c0670Jb.A04()));
            this.A04.A05(this.A05.A03(C8U.A05), mapA01);
        }
        this.A04.ABR(c0670Jb);
    }
}
