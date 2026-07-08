package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6R, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6R {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C6S A00;
    public final C6T A01;
    public final C1063Ym A02;
    public final InterfaceC0882Rj A03;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, 63};
    }

    static {
        A01();
        A06 = C6R.class.getSimpleName();
    }

    public C6R(C1063Ym c1063Ym, InterfaceC0629Hj interfaceC0629Hj, C6S c6s, C6T c6t) {
        this.A02 = c1063Ym;
        InterfaceC0882Rj interfaceC0882RjA4i = interfaceC0629Hj.A4i(EnumC0883Rk.A06);
        this.A03 = interfaceC0882RjA4i;
        this.A00 = c6s;
        this.A01 = c6t;
        interfaceC0882RjA4i.A3R(new C1072Yv(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A03.A9C()) {
                this.A02.A04().A8z();
                return;
            }
            String btExtras = this.A03.A6h().optString(A00(0, 9, 62));
            if (!TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || C0653Ih.A0f(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
