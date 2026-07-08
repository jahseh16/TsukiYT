package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UF implements L8 {
    public static byte[] A01;
    public static String[] A02 = {"XQ6pDaA1rZEM", "XoeGOYiSv0w2M1U1qXC2kK0WxpTFbq6C", "goNPtYs5sZFfNSJyOgs171oDuCl7t69H", "IBRmsKraW8ihcuaNuynFKjmRlH", "udOMyB", "k9bLdXox5SSCuqwZoRmzAy5kJm", "rLCACxpviKCtWgunDsmekf59Ef0kXw8R", "IiDilnQTvcIperbA6lCpmy3utrrmGEhT"};
    public final /* synthetic */ UD A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-32, -8, -22, -24, -8, -30};
    }

    static {
        A01();
    }

    public UF(UD ud2) {
        this.A00 = ud2;
    }

    public /* synthetic */ UF(UD ud2, UK uk) {
        this(ud2);
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        this.A00.A0W.setToolbarActionMessage(A00(0, 0, 7));
        this.A00.A0I();
        if (this.A00.A0U && this.A00.A0V()) {
            this.A00.A0W.setToolbarActionMode(1);
        } else {
            this.A00.A0W.setToolbarActionMode(0);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f3) {
        float fA03;
        this.A00.A0O((int) f3);
        if (this.A00.A0V) {
            if (this.A00.A0B) {
                fA03 = 1.0f - (f3 / this.A00.A0F.A0x().A0D().A02());
                if (this.A00.A0E || fA03 < 1.0f) {
                    this.A00.A0E = false;
                    String strA02 = this.A00.A0F.A11().A02();
                    String[] strArr = A02;
                    if (strArr[1].charAt(20) != strArr[6].charAt(20)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[0] = "16sMGD3KF8iI";
                    strArr2[5] = "yItCOMUcMHVXea4ql8lykvs7qx";
                    this.A00.A0W.setToolbarActionMessage(strA02.replace(A00(0, 6, 65), String.valueOf((int) f3)));
                } else {
                    this.A00.A0E = true;
                    this.A00.A0W.setToolbarActionMessage(A00(0, 0, 7));
                }
            } else {
                fA03 = 1.0f - (f3 / this.A00.A0F.A0x().A0D().A03());
            }
            this.A00.A0W.setProgress(100.0f * fA03);
            float fA02 = this.A00.A0F.A0x().A0D().A02() - f3;
            float percentageOfReward = this.A00.A0F.A0x().A0D().A03();
            boolean z = fA02 >= percentageOfReward;
            if (!this.A00.A0E && z) {
                this.A00.A0W.setToolbarActionMode(1);
                return;
            }
            return;
        }
        this.A00.A0W.setProgress(100.0f * (1.0f - (f3 / this.A00.A0G.A07())));
    }
}
