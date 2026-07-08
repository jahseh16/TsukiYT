package com.meta.analytics.dsp.uinode;

import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C3P extends C0547Eb implements View.OnTouchListener {
    public static byte[] A07;
    public static String[] A08 = {"y4Urxqcv9RCHCbRsxOihNkmZ9cqKDFdZ", "LGqXjwU2H5uaBf0UptGCT7ZDInUwl5IV", "fkBbKznr2zH2OwfKJXQ1DdYWN1N", "HFNULQ3MobNCNeOVkX9dtbi8574Dr14V", "KPqvTm6ScHx6bbBibk9kuRT9nwj9YcDc", "WIY3Unb14PjE3ayNyWd6XWPIVw0Az9uS", "ZZL8YXP6wYj9", "tbuIO4j0iRDkkCNXzrivmX4Au5offJfR"};
    public int A00;
    public C1090Zo A01;
    public InterfaceC0833Pm A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public final int A06;

    public static String A09(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{-53, -26, -39, -24, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -25, -26, -28, -15, -104, -21, -19, -24, -24, -25, -22, -20, -21, -104, -60, -31, -26, -35, -39, -22, -60, -39, -15, -25, -19, -20, -59, -39, -26, -39, -33, -35, -22};
    }

    static {
        A0A();
    }

    public C3P(C1064Yn c1064Yn) {
        super(c1064Yn);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public C3P(C1064Yn c1064Yn, AttributeSet attributeSet) {
        super(c1064Yn, attributeSet);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public C3P(C1064Yn c1064Yn, AttributeSet attributeSet, int i) {
        super(c1064Yn, attributeSet, i);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    private int A05() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    private int A06(int i) {
        int i5 = this.A00 - i;
        int delta = this.A02.A7j(i5);
        int scrollX = this.A06;
        if (i5 > scrollX) {
            return A08(this.A05, delta);
        }
        if (i5 < (-scrollX)) {
            return A07(this.A05, delta);
        }
        return this.A05;
    }

    private int A07(int i, int i5) {
        return Math.max(i - i5, 0);
    }

    private int A08(int i, int i5) {
        return Math.min(i + i5, getItemCount() - 1);
    }

    public void A1y(int i, boolean z) {
        if (getAdapter() == null) {
            return;
        }
        this.A05 = i;
        if (z) {
            A1W(i);
        } else {
            A1V(i);
        }
    }

    public int getCurrentPosition() {
        return this.A05;
    }

    private int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().A0E();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int action = motionEvent.getActionMasked();
        if (action == 1 || action == 6 || action == 3 || action == 4) {
            if (this.A04) {
                int rawX2 = A06(rawX);
                A1y(rawX2, true);
            }
            this.A03 = true;
            this.A04 = false;
            return true;
        }
        if (action == 0 || action == 5 || (this.A03 && action == 2)) {
            this.A00 = rawX;
            String[] strArr = A08;
            String str = strArr[5];
            String str2 = strArr[4];
            int action2 = str.charAt(14);
            int rawX3 = str2.charAt(14);
            if (action2 == rawX3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[5] = "MxKeEan5PHYt2nmJnSz3xsZ38eI3mGgL";
            strArr2[4] = "utg9fSYK4sdWKYxBX5KGIJ2pCeKuK2tx";
            if (this.A03) {
                this.A03 = false;
            }
            this.A04 = true;
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.C0547Eb
    public void setLayoutManager(AbstractC03304o abstractC03304o) {
        if (abstractC03304o instanceof C1090Zo) {
            super.setLayoutManager(abstractC03304o);
            this.A01 = (C1090Zo) abstractC03304o;
            return;
        }
        throw new IllegalArgumentException(A09(0, 50, 58));
    }

    public void setSnapDelegate(InterfaceC0833Pm interfaceC0833Pm) {
        this.A02 = interfaceC0833Pm;
    }
}
