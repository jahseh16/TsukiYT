package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PW implements View.OnTouchListener {
    public final /* synthetic */ C0922Sx A00;

    public PW(C0922Sx c0922Sx) {
        this.A00 = c0922Sx;
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
                    this.A00.A0k(false);
                }
                break;
        }
        return true;
    }
}
