package com.meta.analytics.dsp.uinode;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ST extends AbstractC03184c<SN> {
    public static String[] A0H = {"U2dBX20JaeRgS8KUkn4U", "4wbYdEjd6EY1wYpAHERmBQ5UbLFk3rIE", "poCzv8x7tLJqIV5ZIWq", "9iyDRDGf0xWQ70I4mtfqA0IQycZfZ47C", "v2glKkwlOEfR0MfsI3TqmdNecXONmhZ3", "6XdF3RdtkhprEZiVEVCq65KOMzsBziM7", "2OiOSmaAlP7OTnmHwLOjTjXlL7jeDPuL", "nkMLdycTxYcJ5galJfvG8bjM9rVBse8i"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MB A04;
    public MC A05;
    public String A06;
    public List<C0836Pp> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC1167b5 A0A;
    public final C03696c A0B;
    public final C1064Yn A0C;
    public final J2 A0D;
    public final C0723Lg A0E;
    public final C0900Sb A0F;
    public final RE A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public ST(C1064Yn c1064Yn, List<C0836Pp> list, AbstractC1167b5 abstractC1167b5, J2 j22, C03696c c03696c, RE re, C0723Lg c0723Lg, MC mc, String str, int i, int i5, int i8, int i10, C0900Sb c0900Sb, MB mb2) {
        this.A0C = c1064Yn;
        this.A0D = j22;
        this.A0B = c03696c;
        this.A0G = re;
        this.A0E = c0723Lg;
        this.A05 = mc;
        this.A0A = abstractC1167b5;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i10;
        this.A06 = str;
        this.A01 = i8;
        this.A02 = i5;
        this.A0F = c0900Sb;
        this.A04 = mb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final SN A0C(ViewGroup viewGroup, int i) {
        return new SN(AbstractC0818Ox.A00(new OO(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0H(this.A04).A0K(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A0y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0D(SN sn, int i) {
        sn.A0j(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            sn.AFr();
            String[] strArr = A0H;
            if (strArr[3].charAt(29) == strArr[6].charAt(29)) {
                throw new RuntimeException();
            }
            A0H[1] = "f5MkbcX2dFxcVTBDK6f4VKhLC7wzzoeI";
            this.A08 = true;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    public final int A0E() {
        return this.A07.size();
    }
}
