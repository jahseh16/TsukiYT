package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1242cU {
    public InterfaceC1243cV A00;
    public C1229cH A01;
    public final InterfaceC1251ce A03;
    public final InterfaceC1244cW A04;
    public final LinkedHashMap<Integer, Runnable> A05 = new LinkedHashMap<>();
    public final InterfaceC1243cV A02 = new HD(this);

    public C1242cU(InterfaceC1251ce interfaceC1251ce, InterfaceC1244cW interfaceC1244cW) {
        this.A03 = interfaceC1251ce;
        this.A04 = interfaceC1244cW;
    }

    public static C1242cU A01() {
        return new C1242cU(new HH(), null);
    }

    private void A03(AbstractC1245cY abstractC1245cY, InterfaceC1249cc interfaceC1249cc, HB hb) {
        C1229cH c1229cHA00 = C1229cH.A00(abstractC1245cY, interfaceC1249cc, hb);
        this.A01 = c1229cHA00;
        if (0 != 0) {
            c1229cHA00.A01(null);
        }
        this.A01.A02(this.A02);
    }

    private final void A04(DspViewableNode dspViewableNode) {
        C1229cH localViewpointWatcher = this.A01;
        if (localViewpointWatcher != null && dspViewableNode != null) {
            localViewpointWatcher.A03(dspViewableNode);
        }
    }

    private final void A05(DspViewableNode dspViewableNode, C1247ca c1247ca) {
        C1229cH localViewpointWatcher = this.A01;
        if (localViewpointWatcher != null && dspViewableNode != null && c1247ca != null) {
            localViewpointWatcher.A04(dspViewableNode, c1247ca);
        }
    }

    public final void A06(View view) {
        A04(view != null ? ViewpointViewNode.A00(view) : null);
    }

    public final void A07(View view, C1247ca c1247ca) {
        A05(view != null ? ViewpointViewNode.A00(view) : null, c1247ca);
    }

    public final void A08(AbstractC1245cY abstractC1245cY, View view) {
        if (abstractC1245cY != null && view != null) {
            final InterfaceC1244cW interfaceC1244cW = null;
            A03(abstractC1245cY, new HE(view, this.A03), new HB(interfaceC1244cW) { // from class: com.facebook.ads.redexgen.X.6w
                public static byte[] A09;
                public static String[] A0A = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
                public static final String A0B;
                public long A00;
                public cX A01;
                public final InterfaceC1244cW A02;
                public final Map<String, C1234cM> A06 = new HashMap();
                public final C1235cN A04 = new C1235cN();
                public final C1235cN A03 = new C1235cN();
                public final List<Rect> A05 = new ArrayList(1);
                public final boolean A08 = false;
                public final boolean A07 = false;

                public static String A02(int i, int i5, int i8) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i5);
                    for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
                        bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 91);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A03() {
                    A09 = new byte[]{41, 21, 20, 14, 93, 11, 20, 24, 10, 13, 18, 20, 19, 9, 93, 21, 28, 14, 93, 19, 18, 9, 93, 31, 24, 24, 19, 93, 16, 24, 28, 14, 8, 15, 24, 25, 93, 18, 15, 93, 20, 14, 93, 28, 93, 26, 15, 18, 8, 13, 93, 10, 21, 20, 30, 21, 93, 10, 20, 17, 17, 93, 19, 24, 11, 24, 15, 93, 15, 24, 9, 8, 15, 19, 93, 28, 93, 16, 24, 28, 14, 8, 15, 24, 16, 24, 19, 9, 93, 14, 20, 19, 30, 24, 93, 20, 9, 90, 14, 93, 16, 28, 25, 24, 93, 8, 13, 93, 18, 27, 93, 14, 8, 31, 11, 20, 24, 10, 14, 93, 9, 21, 28, 9, 93, 30, 18, 8, 17, 25, 93, 31, 24, 93, 18, 27, 27, 14, 30, 15, 24, 24, 19, 118, 125, 111, 75, 123, 121, 118, 63, 36, 61, 61, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
                }

                static {
                    A03();
                    A0B = C03846w.class.getSimpleName();
                }

                {
                    this.A02 = interfaceC1244cW;
                }

                public static Rect A00(C1234cM c1234cM) {
                    if (c1234cM != null && c1234cM.A02.top != Integer.MIN_VALUE && c1234cM.A02.left != Integer.MIN_VALUE) {
                        Rect rect = c1234cM.A02;
                        String[] strArr = A0A;
                        if (strArr[1].length() == strArr[6].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[1] = "p";
                        strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                        if (rect.right != Integer.MIN_VALUE && c1234cM.A02.bottom != Integer.MIN_VALUE) {
                            return c1234cM.A02;
                        }
                    }
                    throw new IllegalStateException(A02(0, 143, 38));
                }

                private C1234cM A01(C1247ca c1247ca, Rect rect, Rect rect2) {
                    C1234cM c1234cMA03 = this.A06.get(c1247ca.A04);
                    if (this.A04.A06(c1247ca)) {
                        if (c1234cMA03 != null) {
                            c1234cMA03.A01 = EnumC1238cQ.A04;
                        } else {
                            c1234cMA03 = C1234cM.A03(this.A00);
                            this.A06.put(c1247ca.A04, c1234cMA03);
                        }
                    }
                    c1234cMA03.A02.set(rect2);
                    c1234cMA03.A03.add(new Rect(rect));
                    return c1234cMA03;
                }

                private void A04(C1235cN c1235cN) {
                    for (C1247ca c1247ca : c1235cN.A01()) {
                        C1234cM c1234cM = this.A06.get(c1247ca.A04);
                        if (c1234cM == null) {
                            if (0 != 0) {
                                String str = A02(150, 36, 10) + c1247ca.A04;
                                throw new NullPointerException(A02(186, 10, 85));
                            }
                        } else {
                            c1234cM.A01 = EnumC1238cQ.A03;
                            c1234cM.A03.clear();
                            c1247ca.A03(this);
                            if (this.A08) {
                                Map<String, C1234cM> map = this.A06;
                                String[] strArr = A0A;
                                if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0A;
                                strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                                strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                                map.remove(c1234cM);
                            } else {
                                continue;
                            }
                        }
                    }
                }

                private void A05(C1235cN c1235cN) {
                    Iterator it = c1235cN.A00().iterator();
                    while (it.hasNext()) {
                        ((C1247ca) it.next()).A03(this);
                    }
                }

                @Override // com.meta.analytics.dsp.uinode.HB
                public final void A3V(C1247ca c1247ca, Rect rect, Rect rect2) {
                    A01(c1247ca, rect, rect2);
                    C1247ca c1247ca2 = c1247ca.A01;
                    C1247ca parentViewpointData = C1247ca.A08;
                    if (c1247ca2 == parentViewpointData) {
                        return;
                    }
                    boolean zA06 = this.A03.A06(c1247ca2);
                    C1234cM parentViewProperties = this.A06.get(c1247ca2.A04);
                    if (zA06) {
                        if (parentViewProperties == null) {
                            parentViewProperties = C1234cM.A03(this.A00);
                            parentViewProperties.A02.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                            this.A06.put(c1247ca2.A04, parentViewProperties);
                        } else {
                            parentViewProperties.A03.clear();
                            if (!this.A07 || c1247ca2.A04()) {
                                parentViewProperties.A01 = EnumC1238cQ.A04;
                            }
                        }
                    }
                    parentViewProperties.A03.add(new Rect(rect));
                }

                @Override // com.meta.analytics.dsp.uinode.HB
                public final void A41(long j, List<Rect> viewportRects) {
                    this.A00 = j;
                    this.A05.clear();
                    Iterator<Rect> it = viewportRects.iterator();
                    while (it.hasNext()) {
                        this.A05.add(new Rect(it.next()));
                    }
                    Iterator it2 = this.A04.A01().iterator();
                    while (it2.hasNext()) {
                        this.A06.remove(((C1247ca) it2.next()).A04);
                    }
                    Iterator it3 = this.A03.A01().iterator();
                    while (it3.hasNext()) {
                        this.A06.remove(((C1247ca) it3.next()).A04);
                    }
                    Iterator<C1234cM> it4 = this.A06.values().iterator();
                    while (it4.hasNext()) {
                        it4.next().A03.clear();
                    }
                    this.A04.A04();
                    this.A03.A04();
                }

                @Override // com.meta.analytics.dsp.uinode.HB
                public final void A5Z() {
                    A05(this.A04);
                    A04(this.A04);
                    A05(this.A03);
                    A04(this.A03);
                    if (0 != 0) {
                        new C1233cL(toString(), this, this.A05, this.A04.A00(), this.A03.A00());
                        throw new NullPointerException(A02(143, 7, 67));
                    }
                }

                @Override // com.meta.analytics.dsp.uinode.InterfaceC1237cP
                public final void A78(C1247ca c1247ca, Rect rect) {
                    rect.setEmpty();
                    Iterator it = this.A06.get(c1247ca.A04).A03.iterator();
                    while (it.hasNext()) {
                        rect.union((Rect) it.next());
                    }
                }

                @Override // com.meta.analytics.dsp.uinode.InterfaceC1237cP
                public final EnumC1238cQ A8J(C1247ca c1247ca) {
                    return this.A06.get(c1247ca.A04).A01;
                }

                @Override // com.meta.analytics.dsp.uinode.InterfaceC1237cP
                public final void A8L(Rect rect) {
                    rect.setEmpty();
                    Iterator<Rect> it = this.A05.iterator();
                    while (it.hasNext()) {
                        rect.union(it.next());
                    }
                }

                @Override // com.meta.analytics.dsp.uinode.InterfaceC1237cP
                public final float A8M(C1247ca c1247ca) {
                    C1234cM c1234cM = this.A06.get(c1247ca.A04);
                    if (c1234cM != null) {
                        Rect rectA00 = A00(c1234cM);
                        int iHeight = rectA00.height() * rectA00.width();
                        int totalVisibleArea = 0;
                        for (Rect rect : c1234cM.A03) {
                            totalVisibleArea += rect.height() * rect.width();
                        }
                        return totalVisibleArea / iHeight;
                    }
                    return 0.0f;
                }

                @Override // com.meta.analytics.dsp.uinode.HB
                public final void AGH(cX cXVar) {
                    this.A01 = cXVar;
                }
            });
        }
    }
}
