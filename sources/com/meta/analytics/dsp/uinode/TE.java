package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.google.protobuf.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TE extends NY {
    public static byte[] A01;
    public final /* synthetic */ PB A00;

    static {
        A04();
    }

    public static String A03(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{5, 24, 15, 0, 12, 8, 2, 62, 18, 5, 10, 62, 13, 0, 24, 4, 19, 62, 2, 14, 15, 21, 4, 15, 21, 62, 9, 4, 8, 6, 9, 21, 12, 17, 6, 9, 5, 1, 11, 55, 27, 12, 3, 55, 4, 9, 17, 13, 26, 55, 11, 7, 6, 28, 13, 6, 28, 55, 31, 1, 12, 28, 0};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        int dynamicWebViewWidth = getDynamicWebViewWidth();
        int dynamicWebViewHeight = getDynamicWebViewHeight();
        if (dynamicWebViewWidth <= 0 || dynamicWebViewHeight <= 0) {
            super.onMeasure(i, i5);
            return;
        }
        float f3 = dynamicWebViewWidth / dynamicWebViewHeight;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i5);
        boolean z = mode != 1073741824;
        boolean z5 = mode2 != 1073741824;
        int width = getResources().getDisplayMetrics().widthPixels;
        int height = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int width2 = viewGroup.getWidth();
            height = Reader.READ_DONE;
            width = width2 != 0 ? viewGroup.getWidth() : Reader.READ_DONE;
            if (viewGroup.getHeight() != 0) {
                height = viewGroup.getHeight();
            }
        }
        int iA01 = A01(dynamicWebViewWidth, width, i);
        int iA012 = A01(dynamicWebViewHeight, height, i5);
        if ((z5 || z) && Math.abs((iA01 / iA012) - f3) > 1.0E-7d) {
            boolean z7 = false;
            if (z5) {
                iA012 = (int) (iA01 / f3);
                z7 = true;
            }
            if (!z7 && z) {
                iA01 = (int) (iA012 * f3);
            }
        }
        setMeasuredDimension(iA01, iA012);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TE(PB pb2, C1064Yn c1064Yn) {
        super(c1064Yn);
        this.A00 = pb2;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int i, int i5, int i8) {
        int specMode = View.MeasureSpec.getMode(i8);
        int result = View.MeasureSpec.getSize(i8);
        switch (specMode) {
            case Integer.MIN_VALUE:
                return Math.min(Math.min(i, result), i5);
            case 0:
                return Math.min(i, i5);
            case 1073741824:
                return result;
            default:
                return i;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.NY
    public final WebChromeClient A0D() {
        return new P6(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.NY
    public final WebViewClient A0E() {
        return new P7(this.A00);
    }

    private int getDynamicWebViewHeight() {
        return this.A00.A09.A0V().optInt(A03(0, 32, 19));
    }

    private int getDynamicWebViewWidth() {
        return this.A00.A09.A0V().optInt(A03(32, 31, 26));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A00.A02 != null) {
            this.A00.A02.ADL(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
