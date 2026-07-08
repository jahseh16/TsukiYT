package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class MB extends LinearLayout {
    public static int A00 = (int) (LD.A02 * 56.0f);

    public abstract void A04();

    public abstract void A05();

    public abstract void A06(C1P c1p, boolean z);

    public abstract boolean A07();

    public abstract View getDetailsContainer();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract MA getToolbarListener();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC0936Tl viewOnClickListenerC0936Tl);

    public abstract void setFullscreen(boolean z);

    public abstract void setPageDetails(C02391a c02391a, String str, int i, C02451g c02451g);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f3);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(EnumC0739Lw enumC0739Lw);

    public abstract void setProgressImmediate(float f3);

    public abstract void setProgressSpinnerInvisible(boolean z);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i);

    public abstract void setToolbarListener(MA ma);

    public MB(Context context) {
        super(context);
    }
}
