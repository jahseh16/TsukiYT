package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IH {
    public static byte[] A05;
    public static String[] A06 = {"BmLXPPjgF3W3yl6sHxYVjODx4Gc4ZSvN", "I4b0P0MoHEzHAP7yyYIBBQ151YdBHOwS", "TnUUZ2ELhZytD28RyaEX2mWW0X", "N95", "x88QxZ2XVEltUSPssGjwLeARzs7qYdf0", "T8gtGJunXdUSumjdX3X9mxIBVL", "lBAIpAErMYY7sFwVqjboSux", "Abd"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static IH A00(C0645Hz c0645Hz) throws C04539v {
        try {
            c0645Hz.A0Z(4);
            int iA0E = (c0645Hz.A0E() & 3) + 1;
            if (iA0E == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iA0E2 = c0645Hz.A0E() & 31;
            for (int i = 0; i < iA0E2; i++) {
                arrayList.add(A03(c0645Hz));
            }
            int iA0E3 = c0645Hz.A0E();
            for (int i5 = 0; i5 < iA0E3; i5++) {
                arrayList.add(A03(c0645Hz));
            }
            int i8 = -1;
            int i10 = -1;
            float f3 = 1.0f;
            if (iA0E2 > 0) {
                C0640Hu c0640HuA06 = AbstractC0641Hv.A06((byte[]) arrayList.get(0), iA0E, ((byte[]) arrayList.get(0)).length);
                i8 = c0640HuA06.A06;
                i10 = c0640HuA06.A02;
                f3 = c0640HuA06.A00;
            } else {
                String[] strArr = A06;
                if (strArr[3].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "uBIRbiuvHYy0oHv2RJvgJqXQ4A";
                strArr2[5] = "sPpQgCzWXqIb9lVIC566YsDxxs";
            }
            return new IH(arrayList, iA0E, i8, i10, f3);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw new C04539v(A01(0, 24, 65), e4);
        }
    }

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-14, 31, 31, 28, 31, -51, 29, 14, 31, 32, 22, 27, 20, -51, -18, 3, -16, -51, 16, 28, 27, 19, 22, 20};
    }

    static {
        A02();
    }

    public IH(List<byte[]> initializationData, int i, int i5, int i8, float f3) {
        this.A04 = initializationData;
        this.A02 = i;
        this.A03 = i5;
        this.A01 = i8;
        this.A00 = f3;
    }

    public static byte[] A03(C0645Hz c0645Hz) {
        int iA0I = c0645Hz.A0I();
        int offset = c0645Hz.A06();
        c0645Hz.A0Z(iA0I);
        return AbstractC0624He.A08(c0645Hz.A00, offset, iA0I);
    }
}
