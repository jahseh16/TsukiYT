package com.meta.analytics.dsp.uinode;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C03083r extends C0547Eb {
    public C03083r(C1064Yn c1064Yn) {
        super(c1064Yn);
        setCarouselLayoutManager(c1064Yn);
    }

    public AbstractC0899Sa getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.C0547Eb
    public C1090Zo getLayoutManager() {
        return (C1090Zo) super.getLayoutManager();
    }

    public AbstractC03354t getOnScrollListener() {
        return new US(this);
    }

    private void setCarouselLayoutManager(C1064Yn c1064Yn) {
        C1090Zo c1090Zo = new C1090Zo(c1064Yn, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1090Zo.A1R(true);
        }
        super.setLayoutManager(c1090Zo);
    }

    @Override // com.meta.analytics.dsp.uinode.C0547Eb
    public void setLayoutManager(AbstractC03304o abstractC03304o) {
    }
}
