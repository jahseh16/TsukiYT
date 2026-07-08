package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1188bQ implements P0 {
    public final /* synthetic */ C1185bN A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.P0
    public final void A9L() {
        String strA00 = this.A00.A03.A10().A00();
        if (TextUtils.isEmpty(strA00)) {
            return;
        }
        C0712Kv.A0M(new C0712Kv(), this.A00.A04, AbstractC0715Ky.A00(strA00), this.A00.A6T());
    }

    public C1188bQ(C1185bN c1185bN) {
        this.A00 = c1185bN;
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void ABO(B0 b02) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1189bR(this, b02), 1L);
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void ABd() {
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void ADL(View view, MotionEvent motionEvent) {
    }
}
