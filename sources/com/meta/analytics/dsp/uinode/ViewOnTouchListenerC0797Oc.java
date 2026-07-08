package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0797Oc implements View.OnTouchListener {
    public final /* synthetic */ TT A00;

    public ViewOnTouchListenerC0797Oc(TT tt) {
        this.A00 = tt;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                break;
            case 1:
                float browserFinalY = motionEvent.getY();
                if (this.A00.A00 < browserFinalY) {
                    this.A00.A0g(false);
                }
                break;
        }
        return true;
    }
}
