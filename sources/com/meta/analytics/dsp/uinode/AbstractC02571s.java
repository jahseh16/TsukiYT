package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC02571s {
    public static byte[] A00;
    public static String[] A01 = {"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            A01[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b4 = (byte) ((bArrCopyOfRange[i10] - i8) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr2[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            bArrCopyOfRange[i10] = b4;
            i10++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    static {
        A01();
    }

    public static void A02(C1064Yn c1064Yn, AbstractC1167b5 abstractC1167b5, boolean z, InterfaceC02551q interfaceC02551q) {
        if (!C0653Ih.A1k(c1064Yn)) {
            C03696c c03696c = new C03696c(c1064Yn);
            C02411c c02411cA06 = abstractC1167b5.A0x().A0D().A06();
            c03696c.A0d(new JA(abstractC1167b5.A12(), c1064Yn.A09()));
            if (c02411cA06 == null) {
                interfaceC02551q.ACZ(AdError.CACHE_ERROR);
                return;
            }
            if (c02411cA06.A0J()) {
                interfaceC02551q.ACa();
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                A01[0] = "84TqyqDRqUmJCVM8";
                return;
            }
            C6Y c6y = new C6Y(c02411cA06.A0E(), abstractC1167b5.A0S(), abstractC1167b5.A0P());
            c6y.A04 = true;
            if (C0653Ih.A1Z(c1064Yn)) {
                c6y.A03 = A00(0, 5, 22);
            }
            switch (C02541p.A00[c02411cA06.A09().ordinal()]) {
                case 1:
                case 2:
                    c03696c.A0X(c6y);
                    break;
            }
            c03696c.A0b(new C03676a(abstractC1167b5.A10().A01(), -1, -1, abstractC1167b5.A0S(), abstractC1167b5.A0P()));
            c03696c.A0b(new C03676a(c02411cA06.A0D(), -1, -1, abstractC1167b5.A0S(), abstractC1167b5.A0P()));
            c03696c.A0W(new C1154as(c1064Yn, interfaceC02551q, c03696c, c02411cA06, z), new C6V(abstractC1167b5.A0S(), abstractC1167b5.A0P()));
            return;
        }
        interfaceC02551q.ACa();
    }
}
