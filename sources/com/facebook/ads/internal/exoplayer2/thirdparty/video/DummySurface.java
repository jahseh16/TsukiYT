package com.facebook.ads.internal.exoplayer2.thirdparty.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.meta.analytics.dsp.uinode.AbstractC0620Ha;
import com.meta.analytics.dsp.uinode.IF;
import com.meta.analytics.dsp.uinode.IL;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public boolean A00;
    public final boolean A01;
    public final IL A02;

    static {
        A04();
    }

    public static String A02(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, 73, 66, 81, 75, 86, 90, 81, 126, 124, 97, 122, 107, 109, 122, 107, 106, 81, 109, 97, 96, 122, 107, 96, 122, 9, 11, 0, 19, 7, 4, 30, 19, 63, 57, 62, 42, 45, 47, 41, 32, 41, 63, 63, 19, 47, 35, 34, 56, 41, 52, 56, 46, 21, 8, 14, 11, 11, 20, 9, 15, 30, 31, 91, 11, 9, 18, 20, 9, 91, 15, 20, 91, 58, 43, 50, 91, 23, 30, 13, 30, 23, 91, 74, 76, 51, 63, 90, 93, 94, 91, 19, 28, 22, 0, 29, 27, 22, 92, 26, 19, 0, 22, 5, 19, 0, 23, 92, 4, 0, 92, 26, 27, 21, 26, 45, 2, 23, 0, 20, 29, 0, 31, 19, 28, 17, 23, 117, 103, 107, 117, 115, 104, 97};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized boolean A05(Context context) {
        boolean z;
        z = true;
        if (!A04) {
            A03 = IF.A02 < 24 ? 0 : A00(context);
            A04 = true;
        }
        if (A03 == 0) {
            z = false;
        }
        return z;
    }

    public DummySurface(IL il, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.A02 = il;
        this.A01 = z;
    }

    public static int A00(Context context) {
        String strEglQueryString;
        if (IF.A02 < 26 && (A02(127, 7, 21).equals(IF.A05) || A02(85, 6, 120).equals(IF.A06))) {
            return 0;
        }
        if ((IF.A02 < 26 && !context.getPackageManager().hasSystemFeature(A02(91, 36, 97))) || (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !strEglQueryString.contains(A02(0, 25, 29))) {
            return 0;
        }
        if (strEglQueryString.contains(A02(25, 27, 95))) {
            return 1;
        }
        return 2;
    }

    public static DummySurface A01(Context context, boolean z) {
        A03();
        AbstractC0620Ha.A04(!z || A05(context));
        return new IL().A04(z ? A03 : 0);
    }

    public static void A03() {
        if (IF.A02 >= 17) {
        } else {
            throw new UnsupportedOperationException(A02(52, 33, 104));
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
