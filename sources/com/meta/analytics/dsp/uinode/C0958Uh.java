package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0958Uh implements LU {
    public final Collection<String> A00;

    public C0958Uh() {
        this.A00 = new ArrayList();
    }

    @Override // com.meta.analytics.dsp.uinode.LU
    public final void AE8(String str) {
        this.A00.add(str);
    }

    @Override // com.meta.analytics.dsp.uinode.LU
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.A00.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append('\n');
        }
        return sb.toString();
    }
}
