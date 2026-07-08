package com.meta.analytics.dsp.uinode;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0680Jm implements RJ {
    public static byte[] A04;
    public int A00;
    public String A01;
    public Map<String, List<String>> A02;
    public byte[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -56, -41, -38, -46, -43, -50, -125, -56, -43, -43, -46, -43};
    }

    public C0680Jm(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e4) {
            Log.e(getClass().getSimpleName(), A00(0, 13, 34), e4);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.meta.analytics.dsp.uinode.RJ
    public final byte[] A68() {
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.RJ
    public final String A69() {
        byte[] bArr = this.A03;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.RJ
    public final Map<String, List<String>> A79() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.RJ
    public final int A83() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.RJ
    public final String getUrl() {
        return this.A01;
    }
}
