package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.google.android.gms.stats.CodePackage;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0792Nx implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"eK2iG9BFnR5LMlE7G3m8", "2ToUjM2zwZ75WerTaDOi0LZSzIqlBfkc", "7dSK8vzOrDGLLmFObH3b", "garB0MzcdmAd1iXvvKCbdmDeJ8TMxCEG", "k0fVZwzOfWxa", CodePackage.OTA, "EVmJiz3R0TMllDo4HJAPWmaYp66nl7Ex", "xkv8Ynv3GUGlmRL7DeQJBLAGHPyG9ojQ"};
    public final /* synthetic */ BK A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[4].length() != 12) {
                throw new RuntimeException();
            }
            A02[5] = "7dr";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 58);
            i10++;
        }
    }

    public static void A01() {
        byte[] bArr = {9, -4, -9, -8, 2};
        if (A02[5].length() != 3) {
            throw new RuntimeException();
        }
        A02[4] = "UQKYIP1cQ1d2";
        A01 = bArr;
    }

    static {
        A01();
    }

    public ViewOnClickListenerC0792Nx(BK bk2) {
        this.A00 = bk2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 89));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
