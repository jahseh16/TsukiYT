package com.meta.analytics.dsp.uinode;

import android.content.ActivityNotFoundException;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0786Nr {
    public static long A0C;
    public static byte[] A0D;
    public static String[] A0E = {"Dlx9HUQ", "3SJpPR4POSYtfyo20zogCoACzZ0TFz6K", "kjKhSI2oz7rhTngoHOUaCo24OHJZbpIQ", "a4Zk7jMDxn", "WU0c1Yk7xIFA3rTFxMg", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "SjppttcIPjZ3F", "aZkh9z8pdJw1o0Uivju"};
    public AbstractC1167b5 A00;
    public InterfaceC0785Nq A01;
    public OG A02;
    public boolean A03;
    public boolean A04;
    public final C1U A05;
    public final C1064Yn A06;
    public final J2 A07;
    public final C0723Lg A08;
    public final MC A09;
    public final RE A0A;
    public final String A0B;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0D = new byte[]{31, 8, 29, 30, 41, 40, 40, 51, 50, 31, 48, 53, 63, 55, 16, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, 23, 82, 79, 82, 84, 66, 67, 94, 89, 80, 23, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    static {
        A01();
        A0C = 0L;
    }

    public C0786Nr(C1064Yn c1064Yn, String str, RE re, C0723Lg c0723Lg, J2 j22, C1U c1u) {
        this(c1064Yn, str, re, c0723Lg, j22, c1u, new C0937Tm());
    }

    public C0786Nr(C1064Yn c1064Yn, String str, RE re, C0723Lg c0723Lg, J2 j22, C1U c1u, MC mc) {
        this.A03 = true;
        this.A06 = c1064Yn;
        this.A0B = str;
        this.A0A = re;
        this.A08 = c0723Lg;
        this.A07 = j22;
        this.A05 = c1u;
        this.A09 = mc;
    }

    private void A02(String str, String str2, Map<String, String> map) {
        String strA00 = A00(0, 22, 52);
        try {
            AbstractC0731Lo.A0Z(map, this.A00);
            AbstractC02210h abstractC02210hA01 = C02220i.A01(this.A06, this.A07, str, AbstractC0715Ky.A00(str2), new C0777Ni(map).A03(this.A0A).A02(this.A08).A05(), this.A03, this.A04, this.A05);
            if (abstractC02210hA01 instanceof C0578Fg) {
                ((C0578Fg) abstractC02210hA01).A0H(this.A02);
            }
            EnumC02200g actionOutcome = EnumC02200g.A08;
            if (abstractC02210hA01 != null) {
                actionOutcome = abstractC02210hA01.A0C();
            }
            if (!(((abstractC02210hA01 instanceof C0576Fe) || (abstractC02210hA01 instanceof C0578Fg)) && AbstractC0731Lo.A0e(this.A06, actionOutcome, map)) && actionOutcome != EnumC02200g.A05) {
                InterfaceC0785Nq interfaceC0785Nq = this.A01;
                if (interfaceC0785Nq != null) {
                    interfaceC0785Nq.ABE();
                }
                this.A09.A43(this.A0B);
            }
        } catch (ActivityNotFoundException e4) {
            Log.e(strA00, A00(44, 20, 100) + str2, e4);
        } catch (Exception e5) {
            Log.e(strA00, A00(22, 22, 95), e5);
        }
    }

    public static boolean A03(C1064Yn c1064Yn) {
        boolean isIABBottomSheetEnabled = C0653Ih.A2N(c1064Yn);
        int iA06 = C0653Ih.A06(c1064Yn);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = A0C;
        long j4 = jCurrentTimeMillis - j;
        if (isIABBottomSheetEnabled) {
            String[] strArr = A0E;
            String str = strArr[0];
            String str2 = strArr[6];
            int clickguardTime = str.length();
            if (clickguardTime == str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "iHhMWVvnkjnFrqYtRUL";
            strArr2[4] = "26cGs68neeVahMKc5kl";
            if (j > 0 && j4 < iA06) {
                return true;
            }
        }
        A0C = System.currentTimeMillis();
        return false;
    }

    public final void A04(AbstractC1167b5 abstractC1167b5) {
        this.A00 = abstractC1167b5;
    }

    public final void A05(InterfaceC0785Nq interfaceC0785Nq) {
        this.A01 = interfaceC0785Nq;
    }

    public final void A06(OG og) {
        this.A02 = og;
    }

    public final void A07(String str, String str2, Map<String, String> extraData) {
        new JA(str, this.A07).A04(J9.A0J, extraData);
        if (this.A08.A09(this.A06)) {
            this.A07.A9W(str, extraData);
        } else {
            A02(str, str2, extraData);
        }
    }

    public final void A08(boolean z) {
        this.A04 = z;
    }
}
