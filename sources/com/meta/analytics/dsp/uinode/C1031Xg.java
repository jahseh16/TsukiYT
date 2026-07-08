package com.meta.analytics.dsp.uinode;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1031Xg extends C6 {
    public static byte[] A03;
    public static String[] A04 = {"NGxGYCc4p5LcUzQMJWyw5DiDSRjOQe9F", "UCFVtk8FFiQwlTHXhlKlMorjx3xQRwUs", "gTYsvz0mqVjOzoMK", "3KonftsBU2Jf7i08alR6FL8DBvSTG56H", "D2cphfoCJeCyY12qt8LourkPjJ4neP20", "nKjfLlw2BnKut4cvipNa", "Z1RdCfwuszFRU44UcECPMtJ2BxVCI0wR", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[6].charAt(5) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "nNsRewLEUEMjLhcIGLcqJY6DWywwxHcp";
            strArr[3] = "fafmuFk897DEXRggqTinAcDDyPNFBZka";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 126);
            i10++;
        }
    }

    public static void A01() {
        A03 = new byte[]{39, 91, 74, 79, 85, 6, 76, 85, 88, 83, 71, 90, 6, 84, 85, 90, 6, 89, 91, 86, 86, 85, 88, 90, 75, 74, 32, 6, 48, 68, 51, 56, 62, -2, 54, 6, 0, 0, -4, 48, 59, 48, 70, -33, -13, -30, -25, -19, -83, -27, -75, -81, -81, -85, -21, -22, -33, -11, -24, -4, -21, -16, -10, -74, -12, -9, -69, -24, -76, -13, -24, -5, -12, 41, 61, 44, 49, 55, -9, 53, 56, 45, 47};
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C1031Xg(C4 c4) {
        super(c4);
    }

    @Override // com.meta.analytics.dsp.uinode.C6
    public final void A0B(C0645Hz c0645Hz, long j) throws C04539v {
        if (this.A00 == 2) {
            int iA04 = c0645Hz.A04();
            super.A00.AFR(c0645Hz, iA04);
            super.A00.AFS(j, 1, iA04, 0, null);
            return;
        }
        int iA0E = c0645Hz.A0E();
        if (A04[2].length() != 16) {
            throw new RuntimeException();
        }
        A04[7] = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        if (iA0E == 0 && !this.A01) {
            byte[] bArr = new byte[c0645Hz.A04()];
            c0645Hz.A0c(bArr, 0, bArr.length);
            Pair<Integer, Integer> audioParams = AbstractC0624He.A03(bArr);
            super.A00.A5n(Format.A07(null, A00(58, 15, 9), null, -1, -1, ((Integer) audioParams.second).intValue(), ((Integer) audioParams.first).intValue(), Collections.singletonList(bArr), null, 0, null));
            this.A01 = true;
            return;
        }
        if (this.A00 == 10 && iA0E != 1) {
            return;
        }
        int iA042 = c0645Hz.A04();
        super.A00.AFR(c0645Hz, iA042);
        super.A00.AFS(j, 1, iA042, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    @Override // com.meta.analytics.dsp.uinode.C6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0C(com.meta.analytics.dsp.uinode.C0645Hz r18) throws com.meta.analytics.dsp.uinode.C1027Xc {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1031Xg.A0C(com.facebook.ads.redexgen.X.Hz):boolean");
    }
}
