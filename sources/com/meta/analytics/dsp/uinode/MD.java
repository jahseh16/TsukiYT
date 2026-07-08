package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface MD {
    void A9Q(Intent intent, Bundle bundle, C5V c5v);

    void ACW(boolean z);

    void ACu(boolean z);

    void AFT(Bundle bundle);

    String getCurrentClientToken();

    boolean onActivityResult(int i, int i5, Intent intent);

    void onDestroy();
}
