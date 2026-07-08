package com.meta.analytics.dsp.uinode;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0950Tz extends AbstractC03184c<SV> {
    public int A00;
    public int A01;
    public int A02;
    public MC A03;
    public RE A04;
    public String A05;
    public List<C0836Pp> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1167b5 A08;
    public final C03696c A09;
    public final C1064Yn A0A;
    public final J2 A0B;
    public final V2 A0C;
    public final C0723Lg A0D;
    public final BQ A0E;
    public final KP A0F;

    public C0950Tz(C1064Yn c1064Yn, List<C0836Pp> list, AbstractC1167b5 abstractC1167b5, J2 j22, V2 v22, MC mc, String str, BQ bq, KP kp2) {
        this.A0A = c1064Yn;
        this.A0B = j22;
        this.A0C = v22;
        this.A09 = v22.A10();
        this.A04 = v22.A1A();
        this.A0D = v22.A19();
        this.A03 = mc;
        this.A08 = abstractC1167b5;
        this.A06 = list;
        this.A05 = str;
        this.A0E = bq;
        this.A0F = kp2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final SV A0C(ViewGroup viewGroup, int i) {
        return new SV(AbstractC0787Ns.A00(new OO(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0I(this.A0F).A0G(this.A0C).A0K(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A0y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0D(SV sv, int i) {
        C0836Pp c0836Pp = this.A06.get(i);
        sv.A0k(this.A04);
        sv.A0j(c0836Pp, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    public final int A0E() {
        return this.A06.size();
    }

    public final void A0F(int i, int i5, int i8) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i5;
        this.A01 = i8;
        if (needsUpdate) {
            A06();
        }
    }

    public final void A0G(RE re) {
        this.A04 = re;
    }
}
