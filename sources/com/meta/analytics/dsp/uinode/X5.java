package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X5 implements DB {
    public static byte[] A02;
    public static String[] A03 = {"W3zpeZwD9Fi1kBaR", "uMdULlbYt84VxY86rM0TiEJbhaqKcXZ1", "Usin4k2UYlEJmIUoIPMyl4MixoDpG9ii", "hBZpg4XSGRsBFeFqV0aqL6EoVOREEldE", "UimonN4w5kzXtUMO8SJw69s6gFNeuD2Z", "uuKAqm4Yer5CcRyJ", "zRTcmdaM3Tn4RRVoPrSr5tVrwuK6PMWw", "taTU185R1PVUiY2ntZzDAqagtcVNoAEE"};
    public final int A00;
    public final List<Format> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private D7 A00(DA da) {
        String strA01;
        int i;
        if (A03(32)) {
            return new D7(this.A01);
        }
        C0645Hz c0645Hz = new C0645Hz(da.A03);
        List<Format> arrayList = this.A01;
        while (c0645Hz.A04() > 0) {
            int iA0E = c0645Hz.A0E();
            int iA06 = c0645Hz.A06() + c0645Hz.A0E();
            if (iA0E == 134) {
                arrayList = new ArrayList<>();
                int iA0E2 = c0645Hz.A0E() & 31;
                for (int i5 = 0; i5 < iA0E2; i5++) {
                    String strA0S = c0645Hz.A0S(3);
                    int iA0E3 = c0645Hz.A0E();
                    if ((iA0E3 & 128) != 0) {
                        strA01 = A01(19, 19, 101);
                        i = iA0E3 & 63;
                    } else {
                        strA01 = A01(0, 19, 66);
                        i = 1;
                    }
                    arrayList.add(Format.A08(null, strA01, null, -1, 0, strA0S, i, null));
                    c0645Hz.A0Z(2);
                }
            }
            c0645Hz.A0Y(iA06);
        }
        return new D7(arrayList);
    }

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{16, 1, 1, 29, 24, 18, 16, 5, 24, 30, 31, 94, 18, 20, 16, 92, 71, 65, 73, 55, 38, 38, 58, 63, 53, 55, 34, 63, 57, 56, 121, 53, 51, 55, 123, 97, 102, 110};
    }

    static {
        A02();
    }

    public X5() {
        this(0);
    }

    public X5(int i) {
        this(i, Collections.emptyList());
    }

    public X5(int i, List<Format> list) {
        this.A00 = i;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 66), 0, null));
        }
        this.A01 = list;
    }

    private boolean A03(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.meta.analytics.dsp.uinode.DB
    public final SparseArray<DD> A4d() {
        return new SparseArray<>();
    }

    @Override // com.meta.analytics.dsp.uinode.DB
    public final DD A4j(int i, DA da) {
        switch (i) {
            case 2:
                return new C1021Ww(new X2());
            case 3:
            case 4:
                return new C1021Ww(new C1022Wx(da.A01));
            case 15:
                if (A03(2)) {
                    return null;
                }
                return new C1021Ww(new X6(false, da.A01));
            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                boolean zA03 = A03(2);
                String[] strArr = A03;
                if (strArr[4].charAt(2) == strArr[3].charAt(2)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[2] = "Zsc3HcoanD4hgKlowrimr1mcCeCJ4aqm";
                strArr2[6] = "fbfbpCk06enibsJo0cAFVF7ae3oKLvDz";
                if (zA03) {
                    return null;
                }
                return new C1021Ww(new C1023Wy(da.A01));
            case 21:
                return new C1021Ww(new C1024Wz());
            case 27:
                boolean zA032 = A03(4);
                String[] strArr3 = A03;
                if (strArr3[7].charAt(13) != strArr3[1].charAt(13)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A03;
                strArr4[2] = "MnHqmUaQQZIE89AoLzdx0BMakHNAXRZh";
                strArr4[6] = "UBVzW5fdc0gZ9W3oa8if0wBLwl14wyCB";
                if (zA032) {
                    return null;
                }
                return new C1021Ww(new X1(A00(da), A03(1), A03(8)));
            case 36:
                return new C1021Ww(new X0(A00(da)));
            case 89:
                return new C1021Ww(new X3(da.A02));
            case 129:
            case 135:
                return new C1021Ww(new X9(da.A01));
            case 130:
            case 138:
                return new C1021Ww(new X4(da.A01));
            case 134:
                if (A03(16)) {
                    return null;
                }
                return new C1018Wt(new C1017Ws());
            default:
                return null;
        }
    }
}
