package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0512Cf {
    public static byte[] A05;
    public static String[] A06 = {"ACQ", "Z1SKPMzbMAJhhabQH0qvIzzSk7pS7MzN", "6aLpRH6Tia4Sh8DeOCrm6uJB9pdHn", "T4Je7I0RF5bnUk10PIFXPnn9hg731vE9", "YJYhptho8kfm6vGcPcLLXGA80bzp3", "trfcxoKHMENKiNLiuCQzDNtcz23hOMTL", "PokKsHpwVBHIedcIPmeYCrQhpW", "5FKTxH2gEdxAxWs98iwby2xSeh4hilLh"};
    public final int A00;
    public final C3 A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{110, 117, 103, -120, -70, -70, -68, -76, -80, -75, -82, 103, -120, -116, -102, 116, -118, -101, -103, 103, -86, -71, -64, -73, -69, -74, 103, -76, -74, -85, -84, 117, -102, -72, -89, -87, -79, -117, -76, -87, -72, -65, -74, -70, -81, -75, -76, -120, -75, -66, -103, -78, -73, -71, -76, -76, -77, -74, -72, -87, -88, 100, -76, -74, -77, -72, -87, -89, -72, -83, -77, -78, 100, -73, -89, -84, -87, -79, -87, 100, -72, -67, -76, -87, 100, 107, -118, -119, -118, 88, -76, -77, -76, -60, -64, -62, -53, -64, -54, -52, -43, -38};
    }

    static {
        A02();
    }

    public C0512Cf(boolean z, String str, int i, byte[] bArr, int i5, int i8, byte[] bArr2) {
        AbstractC0620Ha.A03((bArr2 == null) ^ (i == 0));
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
        this.A04 = bArr2;
        this.A01 = new C3(A00(str), bArr, i5, i8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C0512Cf.A00(java.lang.String):int");
    }
}
