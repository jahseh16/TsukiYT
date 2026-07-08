package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class HH implements InterfaceC1251ce {
    public final List<InterfaceC0890Rr> A00 = new ArrayList();

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1251ce
    public final InterfaceC0890Rr A5q(int i) {
        this.A00.get(i);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC0890Rr> iterator() {
        return this.A00.iterator();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1251ce
    public final int size() {
        return this.A00.size();
    }
}
