package com.meta.analytics.dsp.uinode;

import android.util.AttributeSet;
import android.view.View;
import com.google.protobuf.Reader;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3C extends C3P implements InterfaceC0833Pm {
    public static byte[] A07;
    public static String[] A08 = {"T7MK6mm4Fzbg8PTMnM4kcHpb21LLpIaw", "PTQtUxKdjysMmbj8hCZsGKEwd1IRWqqZ", "Zw8mt4VncD", "79VYCrnrWW", "2MnAMBnkkiKtyd2cP7mHhabJycDYuMiE", "jaMauIT7sdi", "OgIH7ZaBRtH9hoDgrnw", "xZmsCngT77DU5lblEiekqTVKPqNdsast"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MM A04;
    public boolean A05;
    public final C0490Bg A06;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-6, -7, -37, -20, -14, -16, -50, -13, -20, -7, -14, -16, -17};
    }

    static {
        A03();
    }

    public C3C(C1064Yn c1064Yn) {
        super(c1064Yn);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C0490Bg(c1064Yn, new C0830Pj(), new C0829Pi());
        A02();
    }

    public C3C(C1064Yn c1064Yn, AttributeSet attributeSet) {
        super(c1064Yn, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C0490Bg(c1064Yn, new C0830Pj(), new C0829Pi());
        A02();
    }

    public C3C(C1064Yn c1064Yn, AttributeSet attributeSet, int i) {
        super(c1064Yn, attributeSet, i);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C0490Bg(c1064Yn, new C0830Pj(), new C0829Pi());
        A02();
    }

    private int A00(int i) {
        int i5 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i8 = (measuredWidth - spacing) - i5;
        int itemSize = getAdapter().A0E();
        int numFullItems = 0;
        int spacing2 = Reader.READ_DONE;
        while (spacing2 > i) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i;
            }
            int spacing3 = numFullItems * i5;
            spacing2 = (int) ((i8 - spacing3) / (numFullItems + 0.333f));
        }
        return spacing2;
    }

    private void A02() {
        this.A06.A2A(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        AbstractC0731Lo.A0K(this);
    }

    private void A04(int i, int i5) {
        if (i == this.A03 && i5 == this.A02) {
            return;
        }
        this.A03 = i;
        if (A08[1].charAt(11) == 'q') {
            throw new RuntimeException();
        }
        A08[6] = "hNBaptvkpj";
        this.A02 = i5;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 13, 111));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C3P
    public final void A1y(int i, boolean z) {
        super.A1y(i, z);
        A04(i, 0);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0833Pm
    public final int A7j(int i) {
        int iAbs = Math.abs(i);
        int scrollXAbs = ((C3P) this).A06;
        if (iAbs <= scrollXAbs) {
            return 0;
        }
        int i5 = this.A01;
        if (i5 == 0) {
            return 1;
        }
        int scrollXAbs2 = 1 + (iAbs / i5);
        return scrollXAbs2;
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.C0547Eb, android.view.View
    public final void onMeasure(int i, int i5) {
        int height;
        int itemSize;
        super.onMeasure(i, i5);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i8 = (int) LD.A02;
            int verticalPadding = C0653Ih.A0E(getContext());
            height = (i8 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            height = Math.round(verticalPadding2 / 1.91f);
        }
        int verticalPadding3 = View.MeasureSpec.getMode(i5);
        switch (verticalPadding3) {
            case Integer.MIN_VALUE:
                int verticalPadding4 = View.MeasureSpec.getSize(i5);
                height = Math.min(verticalPadding4, height);
                break;
            case 1073741824:
                height = View.MeasureSpec.getSize(i5);
                break;
        }
        int height2 = height - paddingTop;
        if (this.A05) {
            int verticalPadding5 = MI.A09;
            itemSize = Math.min(verticalPadding5, height2);
        } else {
            itemSize = A00(height2);
        }
        int height3 = getMeasuredWidth();
        int verticalPadding6 = itemSize + paddingTop;
        setMeasuredDimension(height3, verticalPadding6);
        if (!this.A05) {
            int verticalPadding7 = this.A00;
            setChildWidth((verticalPadding7 * 2) + itemSize);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C0547Eb
    public void setAdapter(AbstractC03184c abstractC03184c) {
        this.A06.A2H(abstractC03184c == null ? -1 : abstractC03184c.hashCode());
        super.setAdapter(abstractC03184c);
    }

    public void setChildSpacing(int i) {
        this.A00 = i;
    }

    public void setChildWidth(int i) {
        this.A01 = i;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i5 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i8 = i5 - pageWidth2;
        C0490Bg c0490Bg = this.A06;
        int pageWidth3 = this.A01;
        c0490Bg.A2I((i8 - pageWidth3) / 2);
        C0490Bg c0490Bg2 = this.A06;
        int pageWidth4 = this.A01;
        c0490Bg2.A2G(((double) pageWidth4) / ((double) measuredWidth));
    }

    public void setCurrentPosition(int i) {
        A1y(i, false);
    }

    public void setOnPageChangedListener(MM mm) {
        this.A04 = mm;
    }

    public void setShowTextInCarousel(boolean z) {
        this.A05 = z;
    }
}
