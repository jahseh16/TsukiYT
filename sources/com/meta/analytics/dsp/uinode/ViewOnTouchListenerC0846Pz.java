package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0846Pz implements View.OnTouchListener {
    public final /* synthetic */ Q0 A00;

    public ViewOnTouchListenerC0846Pz(Q0 q02) {
        this.A00 = q02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            Q0.A00(this.A00);
            this.A00.A06.A9u(this.A00.A03.A12(), new C0777Ni().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
