package com.meta.analytics.dsp.uinode;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1007Wi implements DQ {
    public static byte[] A02;
    public MediaCodecInfo[] A00;
    public final int A01;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{3, -11, -13, 5, 2, -11, -67, 0, -4, -15, 9, -14, -15, -13, -5};
    }

    public C1007Wi(boolean z) {
        this.A01 = z ? 1 : 0;
    }

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final int A6U() {
        A01();
        return this.A00.length;
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final MediaCodecInfo A6V(int i) {
        A01();
        return this.A00[i];
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final boolean A9H(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A00(0, 15, 99));
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final boolean AFf() {
        return true;
    }
}
