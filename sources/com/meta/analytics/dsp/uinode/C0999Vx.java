package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0999Vx implements InterfaceC0615Gu {
    public static byte[] A00;
    public static final InterfaceC0614Gt A01;
    public static final C0999Vx A02;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{51, 2, 26, 26, 14, 87, 4, 24, 2, 5, 20, 18};
    }

    static {
        A01();
        A02 = new C0999Vx();
        A01 = new C1000Vy();
    }

    public C0999Vx() {
    }

    public /* synthetic */ C0999Vx(C1000Vy c1000Vy) {
        this();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final Uri A8E() {
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final long ADl(C0619Gy c0619Gy) throws IOException {
        throw new IOException(A00(0, 12, 28));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final void close() throws IOException {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final int read(byte[] bArr, int i, int i5) throws IOException {
        throw new UnsupportedOperationException();
    }
}
