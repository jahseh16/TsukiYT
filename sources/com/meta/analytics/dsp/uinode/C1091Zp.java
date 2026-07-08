package com.meta.analytics.dsp.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1091Zp implements InterfaceC03284m {
    public static byte[] A04;
    public static String[] A05 = {"yYJ6SOT3uDFyj2TBTti7WWfRsn28EaA0", "ibfMp1J9gSZsYrxVf4NvaZx8D9JO1QBg", "rjgnGVcZwB7yGoiyculy9B4zYqmoHpCR", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "BFeMqfRovMahqpkErO60kJAdny9RRdno", "ZwvbtEc0kmFFJCTTqnK3GQ6ySyfI7Whf", "3RaP0tr92GxZHPCEm9", "lHI5DV8"};
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-87, -66, -42, -52, -46, -47, 125, -51, -52, -48, -58, -47, -58, -52, -53, -48, 125, -54, -46, -48, -47, 125, -65, -62, 125, -53, -52, -53, -118, -53, -62, -60, -66, -47, -58, -45, -62, -60, -35, -20, -39, -32, -108, -40, -35, -25, -24, -43, -30, -41, -39, -108, -31, -23, -25, -24, -108, -42, -39, -108, -30, -29, -30, -95, -30, -39, -37, -43, -24, -35, -22, -39};
    }

    static {
        A01();
    }

    public final void A02() {
        int[] iArr = this.A03;
        if (iArr != null) {
            if (A05[7].length() != 7) {
                throw new RuntimeException();
            }
            A05[7] = "V5jR13F";
            Arrays.fill(iArr, -1);
        }
        this.A00 = 0;
    }

    public final void A03(int i, int i5) {
        this.A01 = i;
        this.A02 = i5;
    }

    public final void A04(C0547Eb c0547Eb, boolean z) {
        this.A00 = 0;
        int[] iArr = this.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC03304o abstractC03304o = c0547Eb.A06;
        if (c0547Eb.A04 != null && abstractC03304o != null && abstractC03304o.A1U()) {
            if (z) {
                boolean zA0B = c0547Eb.A00.A0B();
                String[] strArr = A05;
                if (strArr[0].charAt(30) != strArr[5].charAt(30)) {
                    A05[7] = "b5aEeD0";
                    if (!zA0B) {
                        abstractC03304o.A1r(c0547Eb.A04.A0E(), this);
                    }
                }
                throw new RuntimeException();
            }
            if (!c0547Eb.A1p()) {
                abstractC03304o.A1q(this.A01, this.A02, c0547Eb.A0s, this);
            }
            int i = this.A00;
            int i5 = abstractC03304o.A00;
            String[] strArr2 = A05;
            if (strArr2[3].length() != strArr2[6].length()) {
                A05[7] = "TjVTm35";
                if (i > i5) {
                    abstractC03304o.A00 = this.A00;
                    abstractC03304o.A08 = z;
                    c0547Eb.A0r.A0O();
                    return;
                }
                return;
            }
            throw new RuntimeException();
        }
    }

    public final boolean A05(int i) {
        if (this.A03 != null) {
            int i5 = this.A00 * 2;
            for (int i8 = 0; i8 < i5; i8 += 2) {
                int count = this.A03[i8];
                if (count == i) {
                    String[] strArr = A05;
                    String str = strArr[0];
                    String str2 = strArr[5];
                    int i10 = str.charAt(30);
                    int count2 = str2.charAt(30);
                    if (i10 == count2) {
                        throw new RuntimeException();
                    }
                    A05[2] = "SVfMGWcG5IEJEA83X9P3956xbutBXkdM";
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03284m
    public final void A3S(int i, int i5) {
        if (i >= 0) {
            if (i5 >= 0) {
                int i8 = this.A00 * 2;
                int[] iArr = this.A03;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.A03 = iArr2;
                    Arrays.fill(iArr2, -1);
                } else {
                    int storagePosition = iArr.length;
                    if (i8 >= storagePosition) {
                        int[] iArr3 = this.A03;
                        int storagePosition2 = i8 * 2;
                        int[] iArr4 = new int[storagePosition2];
                        this.A03 = iArr4;
                        System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                    }
                }
                int[] iArr5 = this.A03;
                iArr5[i8] = i;
                int storagePosition3 = i8 + 1;
                iArr5[storagePosition3] = i5;
                int storagePosition4 = this.A00;
                this.A00 = storagePosition4 + 1;
                return;
            }
            throw new IllegalArgumentException(A00(37, 35, 33));
        }
        throw new IllegalArgumentException(A00(0, 37, 10));
    }
}
