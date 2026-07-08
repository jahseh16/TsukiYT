package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1089Zn extends AnonymousClass51 {
    public static byte[] A06;
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    static {
        A06();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final int A03(View view, int i) {
        AbstractC03304o abstractC03304oA08 = A08();
        if (abstractC03304oA08 == null || !abstractC03304oA08.A21()) {
            return 0;
        }
        C03314p c03314p = (C03314p) view.getLayoutParams();
        return A0N(abstractC03304oA08.A0o(view) - c03314p.topMargin, abstractC03304oA08.A0j(view) + c03314p.bottomMargin, abstractC03304oA08.A0g(), abstractC03304oA08.A0X() - abstractC03304oA08.A0d(), i);
    }

    public static String A04(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{41, 12, 11, 0, 4, 23, 54, 8, 10, 10, 17, 13, 54, 6, 23, 10, 9, 9, 0, 23, 21, 35, 57, 108, 63, 36, 35, 57, 32, 40, 108, 35, 58, 41, 62, 62, 37, 40, 41, 108, 47, 35, 33, 60, 57, 56, 41, 31, 47, 62, 35, 32, 32, 26, 41, 47, 56, 35, 62, 10, 35, 62, 28, 35, 63, 37, 56, 37, 35, 34, 108, 59, 36, 41, 34, 108, 56, 36, 41, 108, 0, 45, 53, 35, 57, 56, 1, 45, 34, 45, 43, 41, 62, 108, 40, 35, 41, 63, 108, 34, 35, 56, 108, 37, 33, 60, 32, 41, 33, 41, 34, 56, 108, 42, 55, 56, 41, 121, 41, 43, 60, 63, 60, 43, 60, 55, 58, 60, 121, 42, 49, 54, 44, 53, 61, 121, 59, 60, 121, 54, 55, 60, 121, 54, 63, 121, 45, 49, 60, 121, 58, 54, 55, 42, 45, 56, 55, 45, 42, 121, 61, 60, 63, 48, 55, 60, 61, 121, 48, 55, 121, 10, 52, 54, 54, 45, 49, 10, 58, 43, 54, 53, 53, 60, 43, 117, 121, 42, 45, 56, 43, 45, 48, 55, 62, 121, 46, 48, 45, 49, 121, 10, 23, 24, 9, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public int A0O(View view, int i) {
        AbstractC03304o abstractC03304oA08 = A08();
        if (abstractC03304oA08 == null || !abstractC03304oA08.A20()) {
            return 0;
        }
        C03314p c03314p = (C03314p) view.getLayoutParams();
        return A0N(abstractC03304oA08.A0k(view) - c03314p.leftMargin, abstractC03304oA08.A0n(view) + c03314p.rightMargin, abstractC03304oA08.A0e(), abstractC03304oA08.A0h() - abstractC03304oA08.A0f(), i);
    }

    public C1089Zn(Context context) {
        this.A03 = A0J(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.A02.y > 0.0f ? 1 : -1;
    }

    private int A01(int i, int i5) {
        int before = i - i5;
        if (i * before <= 0) {
            return 0;
        }
        return before;
    }

    private final void A07(C03404z c03404z) {
        PointF pointFA0P = A0P(A07());
        if (pointFA0P == null || (pointFA0P.x == 0.0f && pointFA0P.y == 0.0f)) {
            c03404z.A03(A07());
            A09();
            return;
        }
        A0B(pointFA0P);
        this.A02 = pointFA0P;
        this.A00 = (int) (pointFA0P.x * 10000.0f);
        this.A01 = (int) (pointFA0P.y * 10000.0f);
        int time = (int) (A0L(10000) * 1.2f);
        c03404z.A04((int) (this.A00 * 1.2f), (int) (this.A01 * 1.2f), time, this.A05);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass51
    public final void A0G() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass51
    public final void A0H(int i, int i5, AnonymousClass53 anonymousClass53, C03404z c03404z) {
        if (A06() == 0) {
            A09();
            return;
        }
        this.A00 = A01(this.A00, i);
        int iA01 = A01(this.A01, i5);
        this.A01 = iA01;
        if (this.A00 == 0 && iA01 == 0) {
            A07(c03404z);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass51
    public void A0I(View view, AnonymousClass53 anonymousClass53, C03404z c03404z) {
        int iA0O = A0O(view, A0K());
        int dx = A00();
        int iA03 = A03(view, dx);
        int dy = iA0O * iA0O;
        int dx2 = iA03 * iA03;
        int time = A0M((int) Math.sqrt(dy + dx2));
        if (time > 0) {
            int distance = -iA0O;
            int dy2 = -iA03;
            c03404z.A04(distance, dy2, time, this.A04);
        }
    }

    public float A0J(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0K() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.A02.x > 0.0f ? 1 : -1;
    }

    public int A0L(int i) {
        return (int) Math.ceil(Math.abs(i) * this.A03);
    }

    public final int A0M(int i) {
        return (int) Math.ceil(((double) A0L(i)) / 0.3356d);
    }

    public final int A0N(int i, int i5, int i8, int i10, int i11) {
        switch (i11) {
            case -1:
                return i8 - i;
            case 0:
                int i12 = i8 - i;
                if (i12 > 0) {
                    return i12;
                }
                int i13 = i10 - i5;
                if (i13 < 0) {
                    return i13;
                }
                return 0;
            case 1:
                return i10 - i5;
            default:
                throw new IllegalArgumentException(A04(113, 93, 122));
        }
    }

    public PointF A0P(int i) {
        Object objA08 = A08();
        if (objA08 instanceof AnonymousClass50) {
            return ((AnonymousClass50) objA08).A4O(i);
        }
        Log.w(A04(0, 20, 70), A04(20, 93, 111) + AnonymousClass50.class.getCanonicalName());
        return null;
    }
}
