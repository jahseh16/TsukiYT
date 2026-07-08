package com.meta.analytics.dsp.uinode;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YW implements KZ {
    public static byte[] A01;
    public final /* synthetic */ C1063Ym A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{68, 64, 67, 119, 102, 107, 103, 108, 97, 103, 76, 103, 118, 117, 109, 112, 105, 15, 52, 63, 34, 42, 63, 57, 46, 63, 62, 122, 63, 40, 40, 53, 40, 116, 121, 104, 123, 105, 114, 69, 105, 114, 115, 127, 118, 126};
    }

    public YW(C1063Ym c1063Ym) {
        this.A00 = c1063Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.KZ
    public final void A9S(int i, Throwable th) {
        Log.e(A00(0, 17, 13), A00(17, 17, 85), th);
        this.A00.A07().A9a(A00(34, 12, 21), i, new C8B(th));
    }
}
