package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface QB {
    View getView();

    ArrayList<View> getViewsForInteraction();

    void unregisterView();
}
