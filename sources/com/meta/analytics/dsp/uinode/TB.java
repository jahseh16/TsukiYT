package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TB extends RD {
    public static byte[] A01;
    public final /* synthetic */ PQ A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{90, 81, 88, 80, 87, 92, 93, 102, 88, 93, 102, 80, 87, 93, 92, 65};
    }

    public TB(PQ pq) {
        this.A00 = pq;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A03() {
        if (!this.A00.A08.A07()) {
            this.A00.A08.A05();
            if (!TextUtils.isEmpty(this.A00.A05.A12())) {
                Map<String, String> mapA05 = new C0777Ni().A03(this.A00.A0B).A02(this.A00.A08).A04(this.A00.A05.A0O()).A05();
                mapA05.put(A00(0, 16, 10), A00(0, 0, 11) + this.A00.A01);
                this.A00.A07.A9g(this.A00.A05.A12(), mapA05);
                C1U.A07(this.A00.A05.A0y(), this.A00.A06);
                this.A00.A06.A0E().A2k();
                if (!this.A00.A03) {
                    C2O.A00(this.A00.A05.A0N());
                }
                if (!this.A00.A04) {
                    this.A00.A09.A43(this.A00.A0A.A7B());
                }
            }
        }
    }
}
