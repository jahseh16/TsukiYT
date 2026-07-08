package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YB implements AnonymousClass96 {
    public final List<C9B> A00 = new ArrayList();
    public final boolean A01;
    public final /* synthetic */ YA A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass96
    public final synchronized int A5g() {
        int i;
        i = 0;
        Iterator<C9B> it = this.A00.iterator();
        while (it.hasNext()) {
            i += it.next().A01;
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public YB(YA ya, List<AnonymousClass92> list, boolean z) throws IOException {
        this.A02 = ya;
        this.A01 = z;
        for (AnonymousClass92 fetch : list) {
            AnonymousClass91 anonymousClass91A01 = fetch.A01();
            this.A00.add(new C9B(new C04328z(fetch.A00(), anonymousClass91A01.A01()), anonymousClass91A01.A00() - anonymousClass91A01.A01(), anonymousClass91A01.A00()));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final C9B A00() {
        return this.A00.get(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final C9B A01() {
        return this.A00.get(r1.size() - 1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass96
    public final void A52() throws C9G {
        this.A02.A03(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass96
    public final boolean AAK() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.A06(this);
    }
}
