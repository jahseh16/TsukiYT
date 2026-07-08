package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BK extends TS {
    public MZ A00;
    public InterfaceC0811Oq A01;
    public C0838Pr A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public RelativeLayout A06;
    public C0900Sb A07;
    public final C1064Yn A08;
    public final AbstractC0841Pu A09;
    public final AbstractC0808On A0A;
    public final O7 A0B;
    public final NX A0C;
    public final MV A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final OP A0I;
    public static String[] A0J = {"dJoea1DbFsfm9GTpKIzcXYdmCRfBe4FS", "N1xc2MysRccxXRgwDgHXZSQeh7bFq7uk", "3nDu3mubCrSGPsHb", "SUxuavEQD34fwSKO8hxc7w", "hmAyL1Y1BI3zOyZEMNvfuG", "1nycCDmAbpyAo4RWRzHJ2ixoeiRT", "fh6VcnyoMwgZMcb2oBIx6", "bmD"};
    public static final int A0L = (int) (LD.A02 * 0.0f);
    public static final int A0M = (int) (LD.A02 * 9.0f);
    public static final int A0K = (int) (LD.A02 * 9.0f);

    public BK(OP op, boolean z, String str, C0900Sb c0900Sb) {
        super(op, z);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new BP(this);
        this.A09 = new BO(this);
        this.A0B = new BN(this);
        this.A0A = new BM(this);
        this.A0C = new BL(this);
        this.A0I = op;
        this.A07 = c0900Sb;
        this.A0E = str;
        C1064Yn c1064YnA05 = op.A05();
        this.A08 = c1064YnA05;
        setGravity(17);
        int i = A0L;
        setPadding(i, 0, i, i);
        AbstractC0731Lo.A0M(this, 0);
        setUpView(c1064YnA05);
        Paint paint = new Paint();
        this.A0F = paint;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(16);
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A0I.A0A() != null && this.A02 != null) {
            this.A0I.A0A().A9R(this.A02.getSimpleVideoView());
            if (C0653Ih.A1r(getContext())) {
                this.A0I.A0A().A07(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        if (this.A0I.A0A() != null) {
            this.A0I.A0A().A05();
            if (this.A02 != null) {
                this.A0I.A0A().AGl(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A01 == null) {
            return;
        }
        if (!A18() || !this.A05) {
            boolean zA18 = A18();
            String[] strArr = A0J;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[3] = "whWH7G9NZGoicUCMK8TGye";
            strArr2[4] = "jQqQ2QRGHP0rmsCqitHuog";
            if (zA18 || !this.A04) {
                return;
            }
        }
        this.A01.AAn();
    }

    private void A05(View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A06(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        AbstractC0731Lo.A0K(view);
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A0D() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A11() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.TS
    public final void A14() {
        C0838Pr c0838Pr;
        if (A18() && (c0838Pr = this.A02) != null) {
            c0838Pr.A01();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TS
    public final void A15() {
        if (A18()) {
            A16();
            C0838Pr c0838Pr = this.A02;
            if (c0838Pr != null) {
                c0838Pr.A05(QM.A02);
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TS
    public final void A16() {
        C0838Pr c0838Pr;
        float volume = this.A07.A0P().getVolume();
        if (!A18() || (c0838Pr = this.A02) == null) {
            return;
        }
        float newVolume = c0838Pr.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TS
    public final boolean A17() {
        C0838Pr c0838Pr;
        return A18() && (c0838Pr = this.A02) != null && c0838Pr.A06();
    }

    @Override // com.meta.analytics.dsp.uinode.TS
    public final boolean A18() {
        return this.A03;
    }

    public final void A19(Map<String, String> extraParams) {
        C0838Pr c0838Pr = this.A02;
        if (c0838Pr != null) {
            c0838Pr.A02();
            if (A18()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final C0838Pr getVideoView() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.OL, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z = radius == 1;
        if (z) {
            i = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int i5 = A0L;
        int radius2 = getWidth();
        float f3 = radius2 - i5;
        int radius3 = getHeight();
        rectF.set(i5, 0.0f, f3, radius3 - i5);
        if (z) {
            i = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(C1Q c1q, Map<String, String> extraData) {
        getCtaButton().setCta(c1q, this.A0E, extraData);
    }

    public void setImageUrl(String str) {
        MZ mz = this.A00;
        if (mz != null) {
            mz.setVisibility(0);
            new AsyncTaskC0941Tq(this.A00, this.A08).A04().A06(new C0933Ti(this, null)).A07(str);
        }
        C0838Pr c0838Pr = this.A02;
        if (c0838Pr != null) {
            c0838Pr.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z) {
        this.A03 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC0811Oq interfaceC0811Oq) {
        this.A01 = interfaceC0811Oq;
    }

    public void setUpImageView(C1064Yn c1064Yn) {
        this.A00 = new MZ(c1064Yn);
        if (C0653Ih.A16(c1064Yn)) {
            AbstractC0780Nl.A00(this.A00, C0653Ih.A17(c1064Yn), new ViewOnClickListenerC0791Nw(this));
        }
        A06(this.A00);
    }

    public void setUpMediaContainer(C1064Yn c1064Yn) {
        RelativeLayout relativeLayout = new RelativeLayout(c1064Yn);
        this.A06 = relativeLayout;
        A06(relativeLayout);
        MZ mz = this.A00;
        if (mz != null) {
            this.A06.addView(mz);
            A05(this.A00);
        }
        C0838Pr c0838Pr = this.A02;
        if (c0838Pr != null) {
            this.A06.addView(c0838Pr);
            A05(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C1064Yn c1064Yn) {
        this.A02 = new C0838Pr(c1064Yn, new JA(this.A0E, getAdEventManager()));
        if (C0653Ih.A18(c1064Yn)) {
            AbstractC0780Nl.A00(this.A02, C0653Ih.A19(c1064Yn), new ViewOnClickListenerC0792Nx(this));
        }
        A06(this.A02);
    }

    private void setUpView(C1064Yn c1064Yn) {
        setUpImageView(c1064Yn);
        setUpVideoView(c1064Yn);
        setUpMediaContainer(c1064Yn);
    }

    public void setVideoPlaceholderUrl(String str) {
        C0838Pr c0838Pr = this.A02;
        if (c0838Pr != null) {
            c0838Pr.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        MZ mz = this.A00;
        if (mz != null) {
            if (A0J[5].length() == 10) {
                throw new RuntimeException();
            }
            A0J[2] = "s54OOOYMcUndmM7F";
            mz.setVisibility(8);
        }
        C0838Pr c0838Pr = this.A02;
        if (c0838Pr != null) {
            c0838Pr.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
