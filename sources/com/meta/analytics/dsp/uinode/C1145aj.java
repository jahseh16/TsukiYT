package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1145aj extends KT {
    public static byte[] A05;
    public static String[] A06 = {"Gpv8eHHTEOtePQmo1OD6muRo415gTvmp", "m8VLVbL9uinkegCEMoYL3DBV4Qd", "9DesmfPYImwpHbFMCkN8D4N2A0eEtTnA", "p6qK7niiHhY9MGJ6cPP69YBKuDETC8Y4", "5iURk91XNbuPvrJWt8OL2zSUhjl2Moa0", "44pBDqZwGccZEwpE1ClPCXXxeIB", "3LUdHIp1lrC6CN8jsqyi77AXm4NZ0z", "iLxtTrJV"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ C1182bK A01;
    public final /* synthetic */ C02601v A02;
    public final /* synthetic */ FO A03;
    public final /* synthetic */ C8Q A04;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A06[2] = "zvIoaGxek6NRisBEUIKkM8UdU9N5bmYn";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 50);
            i10++;
        }
    }

    public static void A02() {
        A05 = new byte[]{33, 61, 19, 54, 51, 34, 38, 55, 32, 114, 38, 59, 63, 55, 61, 39, 38, 124, 90, 77, 77, 80, 77, 36, 58, 46, 119, 106, 110, 102, 108, 118, 119};
        if (A06[4].charAt(21) == 'x') {
            throw new RuntimeException();
        }
        A06[2] = "OuAVUMSSWbttlxL4z5HkeS5T535dgvDy";
    }

    static {
        A02();
    }

    public C1145aj(FO fo, C02601v c02601v, C1182bK c1182bK, long j, C8Q c8q) {
        this.A03 = fo;
        this.A02 = c02601v;
        this.A01 = c1182bK;
        this.A00 = j;
        this.A04 = c8q;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A03.A0Q(this.A02);
        this.A03.A0N(this.A01);
        Map mapA01 = this.A03.A01(this.A00);
        mapA01.put(A00(18, 5, 13), A00(0, 2, 62));
        mapA01.put(A00(23, 3, 123), A00(26, 7, 49));
        this.A03.A05(this.A04.A03(C8U.A05), mapA01);
        this.A03.ABR(new C0670Jb(AdErrorType.NETWORK_ERROR, A00(2, 16, 96)));
    }
}
