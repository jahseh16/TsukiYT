package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EnumC02421d {
    public static byte[] A01;
    public static final /* synthetic */ EnumC02421d[] A02;
    public static final EnumC02421d A03;
    public static final EnumC02421d A04;
    public static final EnumC02421d A05;
    public final String A00;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{24, 23, 18, 27, 1, 14, 12, 27, 29, 31, 29, 22, 27, 3, 1, 28, 11, 10, 12, 3, 1, 22, 16, 18, 16, 27, 22, 119, 101, 98, 118, 105, 101, 119, 127, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 0);
        EnumC02421d enumC02421d = new EnumC02421d(strA01, 0, strA01);
        A05 = enumC02421d;
        String strA012 = A01(13, 14, 115);
        EnumC02421d enumC02421d2 = new EnumC02421d(strA012, 1, strA012);
        A04 = enumC02421d2;
        String strA013 = A01(0, 13, 126);
        EnumC02421d enumC02421d3 = new EnumC02421d(strA013, 2, strA013);
        A03 = enumC02421d3;
        A02 = new EnumC02421d[]{enumC02421d, enumC02421d2, enumC02421d3};
    }

    public EnumC02421d(String str, int i, String str2) {
        this.A00 = str2;
    }

    public static EnumC02421d A00(String str) {
        for (EnumC02421d enumC02421d : values()) {
            if (enumC02421d.A00.equalsIgnoreCase(str)) {
                return enumC02421d;
            }
        }
        return A03;
    }

    public static EnumC02421d valueOf(String str) {
        return (EnumC02421d) Enum.valueOf(EnumC02421d.class, str);
    }

    public static EnumC02421d[] values() {
        return (EnumC02421d[]) A02.clone();
    }
}
