package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1106a6<K, V> extends AbstractC02892y<K, V> {
    public final /* synthetic */ C1105a5 A00;

    public C1106a6(C1105a5 c1105a5) {
        this.A00 = c1105a5;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02892y
    public final int A04() {
        return ((AnonymousClass31) this.A00).A00;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02892y
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02892y
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02892y
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02892y
    public final Object A0B(int i, int i5) {
        return this.A00.A02[(i << 1) + i5];
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02892y
    public final V A0C(int i, V value) {
        return this.A00.A0C(i, value);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02892y
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02892y
    public final void A0E(int i) {
        this.A00.A0A(i);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02892y
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
