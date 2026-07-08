package com.meta.analytics.dsp.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/DeprecationLevel;", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EnumC1227c9 {
    public static byte[] A00;
    public static String[] A01 = {"api0z4PLINI5PK7LagBELyWT8AU4BGgW", "tmHanTUUlVK2", "u8tbQk2LTcb9GIJamNGwL98U9aG3b", "uEM1KGpibvzV", "W9EVcNIUBQlzdv120ZbDMEhAMhQyYGpr", "AlTJn44OR47d", "gBWp24bWtYCd", "71PlBcC0MYbUetiTqoYfalKEMb7tn"};
    public static final /* synthetic */ InterfaceC0596Ga A02;
    public static final /* synthetic */ EnumC1227c9[] A03;
    public static final EnumC1227c9 A04;
    public static final EnumC1227c9 A05;
    public static final EnumC1227c9 A06;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            byte b4 = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 71);
            String[] strArr = A01;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "DA30Z9K3Cvr4";
            strArr2[3] = "j8lODtrdRLA8";
            bArrCopyOfRange[i10] = b4;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{109, 122, 122, 103, 122, 64, 65, 76, 76, 77, 70, 83, 69, 86, 74, 77, 74, 67};
    }

    public static final /* synthetic */ EnumC1227c9[] A02() {
        return new EnumC1227c9[]{A06, A04, A05};
    }

    public static EnumC1227c9 valueOf(String str) {
        return (EnumC1227c9) Enum.valueOf(EnumC1227c9.class, str);
    }

    public static EnumC1227c9[] values() {
        return (EnumC1227c9[]) A03.clone();
    }

    static {
        A01();
        A06 = new EnumC1227c9(A00(11, 7, 67), 0);
        A04 = new EnumC1227c9(A00(0, 5, 111), 1);
        A05 = new EnumC1227c9(A00(5, 6, 79), 2);
        EnumC1227c9[] enumC1227c9ArrA02 = A02();
        A03 = enumC1227c9ArrA02;
        A02 = AbstractC1221by.A01(enumC1227c9ArrA02);
    }

    public EnumC1227c9(String str, int i) {
    }
}
