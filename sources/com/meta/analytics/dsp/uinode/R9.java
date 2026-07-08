package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface R9 {
    void A8Q();

    boolean A8b();

    boolean A8c();

    boolean A9B();

    void ADu(boolean z, int i);

    void AGN(int i);

    void AGS(QM qm, int i);

    void AGZ(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    QM getStartReason();

    RB getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f3);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(RC rc2);

    void setup(Uri uri);
}
