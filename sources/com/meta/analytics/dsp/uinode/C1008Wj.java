package com.meta.analytics.dsp.uinode;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1008Wj implements DQ {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-47, -60, -65, -64, -54, -118, -68, -47, -66};
    }

    public C1008Wj() {
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final int A6U() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final MediaCodecInfo A6V(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final boolean A9H(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 2).equals(str);
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final boolean AFf() {
        return false;
    }
}
