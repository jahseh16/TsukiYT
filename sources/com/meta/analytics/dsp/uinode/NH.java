package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NH implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ NJ A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, 20, 33, 18, 20, 22, 39, 28, 41, 28, 39, 44, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -60, -58, -41, -52, -46, -47, -111, -71, -84, -88, -70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A00.A07) && !A00(0, 11, 35).equals(this.A00.A07)) {
                Intent intent = new Intent(A00(22, 26, 33), AbstractC0715Ky.A00(this.A00.A07));
                intent.addFlags(268435456);
                this.A00.A0B.A0E().A8g();
                try {
                    C0702Kj.A0C(this.A00.A0B, intent);
                    this.A00.A05.ACR();
                } catch (C0700Kh e4) {
                    Throwable cause = e4.getCause();
                    C0700Kh cause2 = e4;
                    if (cause != null) {
                        cause2 = e4.getCause();
                    }
                    this.A00.A0B.A07().A9a(A00(11, 11, 113), C8A.A00, new C8B(cause2));
                }
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    public NH(NJ nj) {
        this.A00 = nj;
    }
}
