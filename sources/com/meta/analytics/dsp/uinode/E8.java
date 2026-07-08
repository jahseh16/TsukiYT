package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class E8 implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ EG A00;
    public final /* synthetic */ DownloadAction[] A01;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{30, 53, 45, 52, 54, 53, 59, 62, 23, 59, 52, 59, 61, 63, 40, 105, 92, 75, 74, 80, 74, 77, 80, 87, 94, 25, 88, 90, 77, 80, 86, 87, 74, 25, 95, 88, 80, 85, 92, 93, 23};
    }

    public E8(EG eg, DownloadAction[] downloadActionArr) {
        this.A00 = eg;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.A09.A02(this.A01);
            } catch (IOException e4) {
                Log.e(A00(0, 15, 36), A00(15, 26, 71), e4);
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
