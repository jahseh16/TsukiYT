package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1248cb<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public List<InterfaceC1250cd<ModelType, StateType>> A01 = null;
    public C1247ca A00 = C1247ca.A08;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C1248cb(ModelType model, StateType state, String str) {
        this.A02 = model;
        this.A03 = state;
        this.A04 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cd != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C1248cb<ModelType, StateType> A05(InterfaceC1250cd<ModelType, StateType> interfaceC1250cd) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC1250cd);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C1247ca<ModelType, StateType> A06() {
        return new C1247ca<>(this);
    }
}
