package com.meta.analytics.dsp.uinode;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RF {
    public float A00;
    public C0Q A01;
    public Map<String, String> A02;

    public RF(C0Q c0q) {
        this(c0q, 0.0f);
    }

    public RF(C0Q c0q, float f3) {
        this(c0q, f3, null);
    }

    public RF(C0Q c0q, float f3, Map<String, String> windowParams) {
        this.A01 = c0q;
        this.A00 = f3;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A02();
    }

    public final C0Q A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == C0Q.A0J;
    }
}
