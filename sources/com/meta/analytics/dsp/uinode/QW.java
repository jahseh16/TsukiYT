package com.meta.analytics.dsp.uinode;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QW implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C8D A00;

    public QW(C8D c8d) {
        this.A00 = c8d;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new LL(this, i));
    }
}
