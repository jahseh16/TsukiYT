package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0755Mm {
    public int A00;
    public EnumC0739Lw A01;
    public InterfaceC0759Mq A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C1064Yn A0C;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A09 = true;
    public boolean A07 = true;
    public boolean A08 = true;

    public C0755Mm(C1064Yn c1064Yn, InterfaceC0759Mq interfaceC0759Mq) {
        this.A0C = c1064Yn;
        this.A02 = interfaceC0759Mq;
    }

    public final C0755Mm A0D(int i) {
        this.A00 = i;
        return this;
    }

    public final C0755Mm A0E(EnumC0739Lw enumC0739Lw) {
        this.A01 = enumC0739Lw;
        return this;
    }

    public final C0755Mm A0F(String str) {
        this.A03 = str;
        return this;
    }

    public final C0755Mm A0G(String str) {
        this.A04 = str;
        return this;
    }

    public final C0755Mm A0H(String str) {
        this.A05 = str;
        return this;
    }

    public final C0755Mm A0I(String str) {
        this.A06 = str;
        return this;
    }

    public final C0755Mm A0J(boolean z) {
        this.A09 = z;
        return this;
    }

    public final C0755Mm A0K(boolean z) {
        this.A0A = z;
        return this;
    }

    public final C0755Mm A0L(boolean z) {
        this.A0B = z;
        return this;
    }

    public final C0756Mn A0M() {
        return new C0756Mn(this, null);
    }
}
