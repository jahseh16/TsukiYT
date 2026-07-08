package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OK implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "HBnrsW65aYWVvlJTMpWxFuU7z6MV4xxJ", "tXIuQqWBvr", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "VtieTS2CshWtQMI3l6Acm9um24vRFq1J", "25ZZ2FxRZN7AWJhoRaY84f3F1yf7l7BH", "QBWydbCUfoNWyqRHIYB4mtuveM9uMuB5", "ip309lScFF5SkXTTlyumKzm4Zaw9hedS"};
    public final /* synthetic */ C0930Tf A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            int i11 = bArrCopyOfRange[i10] ^ i8;
            if (A02[2].length() == 2) {
                throw new RuntimeException();
            }
            A02[4] = "tqBSefJA8FkovjSgYNKxEGKjBcizSh9O";
            bArrCopyOfRange[i10] = (byte) (i11 ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{114, 118, 122, 124, 126};
    }

    static {
        A01();
    }

    public OK(C0930Tf c0930Tf) {
        this.A00 = c0930Tf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 20));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
