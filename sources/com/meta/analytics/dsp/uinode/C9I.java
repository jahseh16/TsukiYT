package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9I extends QS {
    public int A00;
    public boolean A01;
    public final AbstractC04268s<C9H> A02;
    public final AbstractC04268s<AnonymousClass98> A03;
    public final AbstractC04268s<O8> A04;
    public final AbstractC04268s<AnonymousClass93> A05;
    public final AbstractC04268s<C0760Mr> A06;
    public final AbstractC04268s<C0748Mf> A07;
    public final AbstractC04268s<C0743Ma> A08;
    public final AbstractC04268s<MU> A09;
    public final AbstractC04268s<C0737Lu> A0A;
    public final SA A0B;
    public final NX A0C;
    public final MV A0D;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C9I(C1064Yn c1064Yn, J2 j22, SA sa, List<C2P> list, String str) {
        super(c1064Yn, j22, sa, list, str, !sa.A0h(), new QR(c1064Yn, sa));
        MV mv = new MV() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MW mw) {
                this.A00.A0a();
            }
        };
        this.A0D = mv;
        S7 s72 = new S7(this);
        this.A07 = s72;
        S3 s3 = new S3(this);
        this.A03 = s3;
        RH rh = new RH(this);
        this.A04 = rh;
        RA ra2 = new RA(this);
        this.A05 = ra2;
        C0850Qd c0850Qd = new C0850Qd(this);
        this.A02 = c0850Qd;
        C0849Qc c0849Qc = new C0849Qc(this);
        this.A06 = c0849Qc;
        C0847Qa c0847Qa = new C0847Qa(this);
        this.A09 = c0847Qa;
        QV qv = new QV(this);
        this.A0A = qv;
        S9 s9 = new S9(this);
        this.A08 = s9;
        NX nx = new NX() { // from class: com.facebook.ads.redexgen.X.9K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0782Nn c0782Nn) {
                C9I c9i = this.A00;
                c9i.A00 = c9i.A0B.getDuration();
            }
        };
        this.A0C = nx;
        this.A01 = false;
        this.A0B = sa;
        sa.getEventBus().A03(mv, ra2, s72, rh, s3, c0850Qd, c0849Qc, c0847Qa, qv, nx, s9);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C9I(C1064Yn c1064Yn, J2 j22, SA sa, List<C2P> list, String str, Bundle bundle, Map<String, String> map) {
        super(c1064Yn, j22, sa, list, str, !sa.A0h(), bundle, map, new QR(c1064Yn, sa));
        MV mv = new MV() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MW mw) {
                this.A00.A0a();
            }
        };
        this.A0D = mv;
        S7 s72 = new S7(this);
        this.A07 = s72;
        S3 s3 = new S3(this);
        this.A03 = s3;
        RH rh = new RH(this);
        this.A04 = rh;
        RA ra2 = new RA(this);
        this.A05 = ra2;
        C0850Qd c0850Qd = new C0850Qd(this);
        this.A02 = c0850Qd;
        C0849Qc c0849Qc = new C0849Qc(this);
        this.A06 = c0849Qc;
        C0847Qa c0847Qa = new C0847Qa(this);
        this.A09 = c0847Qa;
        QV qv = new QV(this);
        this.A0A = qv;
        S9 s9 = new S9(this);
        this.A08 = s9;
        this.A0C = new NX() { // from class: com.facebook.ads.redexgen.X.9K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0782Nn c0782Nn) {
                C9I c9i = this.A00;
                c9i.A00 = c9i.A0B.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = sa;
        sa.getEventBus().A03(mv, ra2, s72, rh, s3, c0850Qd, c0849Qc, c0847Qa, qv, s9);
    }

    public C9I(C1064Yn c1064Yn, J2 j22, SA sa, String str) {
        this(c1064Yn, j22, sa, new ArrayList(), str);
    }

    public C9I(C1064Yn c1064Yn, J2 j22, SA sa, String str, Bundle bundle) {
        this(c1064Yn, j22, sa, new ArrayList(), str, bundle, null);
    }

    public C9I(C1064Yn c1064Yn, J2 j22, SA sa, String str, Map<String, String> extraParams) {
        this(c1064Yn, j22, sa, new ArrayList(), str, null, extraParams);
    }

    public final void A0i() {
        S8 s8 = new S8(this);
        if (this.A0B.A0l()) {
            ExecutorC0725Li.A00(s8);
        } else {
            this.A0B.getStateHandler().post(s8);
        }
    }
}
