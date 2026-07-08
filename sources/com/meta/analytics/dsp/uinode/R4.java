package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class R4 implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0689Jv A00;

    public R4(TextureViewSurfaceTextureListenerC0689Jv textureViewSurfaceTextureListenerC0689Jv) {
        this.A00 = textureViewSurfaceTextureListenerC0689Jv;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A00.A09 != null && motionEvent.getAction() == 1) {
            if (this.A00.A09.isShowing()) {
                this.A00.A09.hide();
            } else {
                this.A00.A09.show();
            }
        }
        return true;
    }
}
