package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class E7 implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"trtHxdWfI8aUUasJnLCFOWNhTEgT5SfR", "ildDLLQ3Py5XZqRSamTTI6YoT50zpskF", "dVw5UxmZMKob3SUb3uvB6OES0lFAFJfM", "IR8fXYoB6j0jxnrkbU78JZ5o5XE94BNQ", "b3RCFjVWO3b8eRQaxF9", "jCTIeE11ZTJ65IoFy1xYkV7ELZ3vCqIN", "TgSfnKfrSSedvNLmmcoIbwvrw3BnVtDY", "eNW8IuS2yi6nO7dU30TIFIzk8f1M77f"};
    public final /* synthetic */ EG A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            int i11 = (bArrCopyOfRange[i10] ^ i8) ^ 26;
            if (A02[0].charAt(19) == 't') {
                throw new RuntimeException();
            }
            A02[6] = "Wfj4XOUJd4uRzIFmDg2tyEJWBqTNOatQ";
            bArrCopyOfRange[i10] = (byte) i11;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{76, 110, 121, 100, 98, 99, 45, 107, 100, 97, 104, 45, 97, 98, 108, 105, 100, 99, 106, 45, 107, 108, 100, 97, 104, 105, 35, 12, 39, 63, 38, 36, 39, 41, 44, 5, 41, 38, 41, 47, 45, 58};
    }

    static {
        A01();
    }

    public E7(EG eg) {
        this.A00 = eg;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        DownloadAction[] actions;
        if (KL.A02(this)) {
            return;
        }
        try {
            try {
                actions = this.A00.A09.A03(this.A00.A0E);
            } catch (Throwable th) {
                Log.e(A00(27, 15, 82), A00(0, 27, 23), th);
                actions = new DownloadAction[0];
            }
            this.A00.A07.post(new E6(this, actions));
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
