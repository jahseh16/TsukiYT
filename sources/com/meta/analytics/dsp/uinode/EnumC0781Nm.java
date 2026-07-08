package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0781Nm {
    A06(0),
    A05(1),
    A04(2);

    public static byte[] A01;
    public static String[] A02 = {"rZGvvZMI6I", "wpdicw5jfWUP9Cs9nncu65zzvPXSjTXh", "qXEMgnv7Ct425l7In8PWxhOPFYVbEYpB", "dTodKdBY68fO6HNBSU3LN7qZJ4nOCEpk", "Hkjhu", "mY7TKQYFYXm3BBS2pDypGTbdY20sKsEk", "u0FGaDIimXxXG0l3UqPLAtx16Sc8Y059", "GEphX9PDUn8ir5euMIdeMTZrm9gVIFzw"};
    public int A00;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{46, 35, 44, 38, 49, 33, 35, 50, 39, 77, 82, 79, 73, 79, 92, 84, 73, 102, 125, 96, 99, 118, 112, 122, 117, 122, 118, 119};
    }

    static {
        A02();
    }

    EnumC0781Nm(int i) {
        this.A00 = i;
    }

    public static EnumC0781Nm A00(int i) throws CloneNotSupportedException {
        for (EnumC0781Nm enumC0781Nm : valuesCustom()) {
            if (enumC0781Nm.A00 == i) {
                return enumC0781Nm;
            }
        }
        return A05;
    }

    public final int A03() {
        return this.A00;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0781Nm[] valuesCustom() throws CloneNotSupportedException {
        Object objClone = values().clone();
        if (A02[4].length() == 18) {
            throw new RuntimeException();
        }
        A02[4] = "9YF3oPenjmVnddjujEMQmJq4m";
        return (EnumC0781Nm[]) objClone;
    }
}
