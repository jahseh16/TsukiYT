package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WK implements InterfaceC0586Fq {
    public static byte[] A00;
    public static String[] A01 = {"WhhTtmL3IE0OcmfXWkhGt3DJMBKWOPru", "IevVaXk7JqzzQUabSVzCZHFLz34", "JQeKeaIRvnKict07eDImxsw0zmpeeDwJ", "rs4XVQZ55s40EhV5j5mU6ZQA9Y9rRaIz", "SJPDpX1Ek2cYyhaXJ8Sq3wDJ6OH3a64q", "ZrPZtqAmah23MQGa5C4AxOobVPmeO1Q6", "YNQWbrIx5dPz4M9Oia0FZFMQh4yL9BRJ", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING};

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(9) == strArr[6].charAt(9)) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[7] = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            strArr2[1] = "4dyVwnIREhtUy8kbUvz4COx2efs";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i11 = (bArrCopyOfRange[i10] ^ i8) ^ 91;
            String[] strArr3 = A01;
            if (strArr3[3].charAt(9) == strArr3[6].charAt(9)) {
                break;
            }
            String[] strArr4 = A01;
            strArr4[2] = "YKvNYNoIe7sickVZlze0IU3YAzLP0yRC";
            strArr4[0] = "QfLwrAzJ9MWwcUOLXpFOoivgYgfoEA7m";
            bArrCopyOfRange[i10] = (byte) i11;
            i10++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        byte[] bArr = {74, 127, 127, 110, 102, 123, 127, 110, 111, 43, 127, 100, 43, 104, 121, 110, 106, 127, 110, 43, 111, 110, 104, 100, 111, 110, 121, 43, 109, 100, 121, 43, 126, 101, 120, 126, 123, 123, 100, 121, 127, 110, 111, 43, 109, 100, 121, 102, 106, 127, 77, 92, 92, 64, 69, 79, 77, 88, 69, 67, 66, 3, 79, 73, 77, 1, 26, 28, 20, 15, 30, 30, 2, 7, 13, 15, 26, 7, 1, 0, 65, 13, 11, 15, 67, 89, 94, 86, 89, 72, 72, 84, 81, 91, 89, 76, 81, 87, 86, 23, 92, 78, 90, 75, 77, 90, 75, 20, 5, 5, 25, 28, 22, 20, 1, 28, 26, 27, 90, 5, 18, 6, 56, 41, 41, 53, 48, 58, 56, 45, 48, 54, 55, 118, 45, 45, 52, 53, 114, 33, 52, 53, 86, 71, 71, 91, 94, 84, 86, 67, 94, 88, 89, 24, 79, 26, 90, 71, 3, 26, 84, 82, 86, 26, 1, 7, 15, 107, 122, 122, 102, 99, 105, 107, 126, 99, 101, 100, 37, 114, 39, 103, 122, 62, 39, 124, 126, 126, 119, 102, 102, 122, 127, 117, 119, 98, 127, 121, 120, 57, 110, 59, 103, 99, 127, 117, 125, 98, 127, 123, 115, 59, 98, 110, 37, 113, 49, 32, 32, 60, 57, 51, 49, 36, 57, 63, 62, 127, 40, 125, 35, 37, 50, 34, 57, 32, 26, 11, 22, 26, 65, 24, 26, 26, 110, 127, 98, 110, 53, 98, 55, 105, 105, 123};
        String[] strArr = A01;
        if (strArr[7].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        strArr2[1] = "2GwQ5PhYbi899tQyrHJTlEvTlhB";
        A00 = bArr;
    }

    static {
        A01();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0586Fq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meta.analytics.dsp.uinode.WL A4Z(com.facebook.ads.internal.exoplayer2.thirdparty.Format r6) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.WK.A4Z(com.facebook.ads.internal.exoplayer2.thirdparty.Format):com.facebook.ads.redexgen.X.WL");
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0586Fq
    public final boolean AGf(Format format) {
        String str = format.A0O;
        String mimeType = A00(236, 8, 53);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(244, 10, 65);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(122, 20, 2);
                if (!mimeType3.equals(str)) {
                    String[] strArr = A01;
                    if (strArr[4].charAt(2) != strArr[5].charAt(2)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A01;
                    strArr2[2] = "loep2I6zPFVtcRcjqtJxRjX9IyStAKeo";
                    strArr2[0] = "undYhYHmNoLvcT1DYiuXgnR63VlRVc3K";
                    String mimeType4 = A00(167, 21, 81);
                    if (!mimeType4.equals(str)) {
                        String mimeType5 = A00(216, 20, 11);
                        if (!mimeType5.equals(str)) {
                            String mimeType6 = A00(188, 28, 77);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(50, 19, 119);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(142, 25, 108);
                                    if (!mimeType8.equals(str)) {
                                        String mimeType9 = A00(69, 19, 53);
                                        if (!mimeType9.equals(str)) {
                                            String mimeType10 = A00(88, 19, 99);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(107, 15, 46);
                                                if (!mimeType11.equals(str)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
