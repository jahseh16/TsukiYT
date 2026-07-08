package com.meta.analytics.dsp.uinode;

import android.graphics.Point;
import android.text.TextUtils;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0498Bo extends W6 {
    public static byte[] A02;
    public static String[] A03 = {"x6AsNgj7kZHrnoNYywGy3amTsD0l", "S34B6ywREx44pNmlWPMRcx17PIA7Fyf2", "1XorlyLpztZAXiZGzmiFCBwFfMWU", "T5Z409y2ECpb8uf8T6KWShvwgb", "8Qiq8HU85lCoFhvN1dBY3zigvCratExc", "EyxqnSMNDXwhS4zpORn6ov", "S8xh7faol6xkg145s9aDIWkyvYFJ4njt", "Q6jD8cwEOZ"};
    public static final int[] A04;
    public final InterfaceC0600Gf A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A03(TrackGroup trackGroup, int[] iArr, int i, String str, int i5, int i8, int i10, List<Integer> list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue = list.get(i12).intValue();
            if (A0L(trackGroup.A01(iIntValue), str, iArr[iIntValue], i, i5, i8, i10)) {
                i11++;
            }
        }
        return i11;
    }

    public static String A0C(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A02 = new byte[]{96, 123, 113};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A0F(TrackGroup trackGroup, int[] iArr, int i, String str, int i5, int i8, int i10, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(iIntValue), str, iArr[iIntValue], i, i5, i8, i10)) {
                list.remove(size);
            }
        }
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public C0498Bo() {
        this(null);
    }

    public C0498Bo(InterfaceC0600Gf interfaceC0600Gf) {
        this.A00 = interfaceC0600Gf;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i, int i5) {
        if (i == -1) {
            return i5 == -1 ? 0 : -1;
        }
        if (i5 == -1) {
            return 1;
        }
        return i - i5;
    }

    public static int A01(int i, int i5) {
        if (i > i5) {
            return 1;
        }
        return i5 > i ? -1 : 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A04(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r4, int[] r5, com.meta.analytics.dsp.uinode.GW r6) {
        /*
            r3 = 0
            r2 = 0
        L2:
            int r0 = r4.A01
            if (r2 >= r0) goto L17
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r1 = r4.A01(r2)
            r0 = r5[r2]
            boolean r0 = A0J(r1, r0, r6)
            if (r0 == 0) goto L14
            int r3 = r3 + 1
        L14:
            int r2 = r2 + 1
            goto L2
        L17:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C0498Bo.A04(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup, int[], com.facebook.ads.redexgen.X.GW):int");
    }

    public static Point A05(boolean z, int tempViewportWidth, int i, int i5, int i8) {
        if (z) {
            if ((i5 > i8) != (tempViewportWidth > i)) {
                tempViewportWidth = i;
                i = tempViewportWidth;
            }
        }
        if (i5 * i >= i8 * tempViewportWidth) {
            return new Point(tempViewportWidth, IF.A04(tempViewportWidth * i8, i5));
        }
        return new Point(IF.A04(i * i5, i8), i);
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0032 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.meta.analytics.dsp.uinode.C0497Bn A06(int r11, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r12, int[][] r13, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r14) throws com.meta.analytics.dsp.uinode.C04359c {
        /*
            r10 = this;
            r6 = 0
            r5 = 0
            r7 = 0
            r4 = 0
        L4:
            int r0 = r12.A01
            if (r4 >= r0) goto L64
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r3 = r12.A01(r4)
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.C0498Bo.A03
            r0 = 1
            r1 = r1[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            r0 = 70
            if (r1 == r0) goto L21
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L21:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C0498Bo.A03
            java.lang.String r1 = "1NYDqnXuXqFwXvhmhx1oqfe5tY82"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "WKIyqdfHfHQHhajlNNxex4"
            r0 = 5
            r2[r0] = r1
            r0 = r13[r4]
            r1 = 0
        L30:
            int r2 = r3.A01
            if (r1 >= r2) goto L61
            r8 = r0[r1]
            boolean r2 = r14.A0B
            boolean r2 = A0H(r8, r2)
            if (r2 == 0) goto L5c
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r2 = r3.A01(r1)
            int r2 = r2.A0D
            r9 = 1
            r2 = r2 & r9
            r8 = 0
            if (r2 == 0) goto L5f
            r2 = 1
        L4a:
            if (r2 == 0) goto L4d
            r9 = 2
        L4d:
            r2 = r0[r1]
            boolean r2 = A0H(r2, r8)
            if (r2 == 0) goto L57
            int r9 = r9 + 1000
        L57:
            if (r9 <= r7) goto L5c
            r6 = r3
            r5 = r1
            r7 = r9
        L5c:
            int r1 = r1 + 1
            goto L30
        L5f:
            r2 = 0
            goto L4a
        L61:
            int r4 = r4 + 1
            goto L4
        L64:
            if (r6 != 0) goto L68
            r0 = 0
        L67:
            return r0
        L68:
            com.facebook.ads.redexgen.X.Bn r0 = new com.facebook.ads.redexgen.X.Bn
            r0.<init>(r6, r5)
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C0498Bo.A06(int, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.Bn");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0115, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meta.analytics.dsp.uinode.C0497Bn A07(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r16, int[][] r17, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r18) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C0498Bo.A07(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.Bn");
    }

    private final C0497Bn A08(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C04359c {
        int i;
        int i5;
        TrackGroup trackGroup = null;
        int i8 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < trackGroupArray.A01; i11++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < trackGroupA01.A01; i12++) {
                if (A0H(iArr2[i12], defaultTrackSelector$Parameters.A0B)) {
                    Format formatA01 = trackGroupA01.A01(i12);
                    int i13 = formatA01.A0D & (defaultTrackSelector$Parameters.A00 ^ (-1));
                    boolean z = (i13 & 1) != 0;
                    boolean z5 = (i13 & 2) != 0;
                    boolean zA0K = A0K(formatA01, defaultTrackSelector$Parameters.A08);
                    if (zA0K || (defaultTrackSelector$Parameters.A0E && A0I(formatA01))) {
                        if (z) {
                            i = 8;
                        } else if (!z5) {
                            i = 6;
                        } else {
                            i = 4;
                        }
                        i5 = i + (zA0K ? 1 : 0);
                    } else if (z) {
                        i5 = 3;
                    } else if (z5) {
                        if (A0K(formatA01, defaultTrackSelector$Parameters.A07)) {
                            i5 = 2;
                        } else {
                            i5 = 1;
                        }
                    }
                    if (A0H(iArr2[i12], false)) {
                        i5 += 1000;
                    }
                    if (i5 > i10) {
                        trackGroup = trackGroupA01;
                        i8 = i12;
                        i10 = i5;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0497Bn(trackGroup, i8);
    }

    public static InterfaceC0601Gg A09(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, InterfaceC0600Gf interfaceC0600Gf) throws C04359c {
        int i5;
        if (defaultTrackSelector$Parameters.A0A) {
            i5 = 24;
        } else {
            i5 = 16;
        }
        boolean z = defaultTrackSelector$Parameters.A09 && (i & i5) != 0;
        for (int i8 = 0; i8 < trackGroupArray.A01; i8++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i8);
            int[] iArrA0O = A0O(trackGroupA01, iArr[i8], z, i5, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (iArrA0O.length > 0) {
                return ((InterfaceC0600Gf) AbstractC0620Ha.A01(interfaceC0600Gf)).A4o(trackGroupA01, iArrA0O);
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0011 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.meta.analytics.dsp.uinode.InterfaceC0601Gg A0A(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r11, int[][] r12, int r13, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r14, com.meta.analytics.dsp.uinode.InterfaceC0600Gf r15) throws com.meta.analytics.dsp.uinode.C04359c {
        /*
            r10 = this;
            r3 = -1
            r5 = -1
            r8 = 0
            r7 = 0
        L4:
            int r0 = r11.A01
            if (r7 >= r0) goto L39
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r6 = r11.A01(r7)
            r9 = r12[r7]
            r4 = 0
        Lf:
            int r0 = r6.A01
            if (r4 >= r0) goto L36
            r1 = r9[r4]
            boolean r0 = r14.A0B
            boolean r0 = A0H(r1, r0)
            if (r0 == 0) goto L33
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r2 = r6.A01(r4)
            com.facebook.ads.redexgen.X.GX r1 = new com.facebook.ads.redexgen.X.GX
            r0 = r9[r4]
            r1.<init>(r2, r14, r0)
            if (r8 == 0) goto L30
            int r0 = r1.A00(r8)
            if (r0 <= 0) goto L33
        L30:
            r5 = r7
            r3 = r4
            r8 = r1
        L33:
            int r4 = r4 + 1
            goto Lf
        L36:
            int r7 = r7 + 1
            goto L4
        L39:
            r0 = -1
            if (r5 != r0) goto L3e
            r0 = 0
            return r0
        L3e:
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r2 = r11.A01(r5)
            boolean r0 = r14.A0D
            if (r0 != 0) goto L58
            if (r15 == 0) goto L58
            r1 = r12[r5]
            boolean r0 = r14.A09
            int[] r1 = A0N(r2, r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto L58
            com.facebook.ads.redexgen.X.Gg r0 = r15.A4o(r2, r1)
            return r0
        L58:
            com.facebook.ads.redexgen.X.Bn r0 = new com.facebook.ads.redexgen.X.Bn
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C0498Bo.A0A(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], int, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters, com.facebook.ads.redexgen.X.Gf):com.facebook.ads.redexgen.X.Gg");
    }

    private final InterfaceC0601Gg A0B(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, InterfaceC0600Gf interfaceC0600Gf) throws C04359c {
        InterfaceC0601Gg interfaceC0601GgA09 = null;
        if (!defaultTrackSelector$Parameters.A0D && interfaceC0600Gf != null) {
            interfaceC0601GgA09 = A09(trackGroupArray, iArr, i, defaultTrackSelector$Parameters, interfaceC0600Gf);
        }
        if (interfaceC0601GgA09 == null) {
            return A07(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return interfaceC0601GgA09;
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i, int i5, boolean z) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i8 = 0; i8 < trackGroup.A01; i8++) {
            arrayList.add(Integer.valueOf(i8));
        }
        if (i == Integer.MAX_VALUE || i5 == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i10 = Reader.READ_DONE;
        for (int videoPixels = 0; videoPixels < trackGroup.A01; videoPixels++) {
            Format formatA01 = trackGroup.A01(videoPixels);
            if (formatA01.A0F > 0 && formatA01.A08 > 0) {
                Point pointA05 = A05(z, i, i5, formatA01.A0F, formatA01.A08);
                int i11 = formatA01.A0F * formatA01.A08;
                if (formatA01.A0F >= ((int) (pointA05.x * 0.98f)) && formatA01.A08 >= ((int) (pointA05.y * 0.98f)) && i11 < i10) {
                    i10 = i11;
                }
            }
        }
        if (i10 != Integer.MAX_VALUE) {
            for (int maxVideoPixelsToRetain = arrayList.size() - 1; maxVideoPixelsToRetain >= 0; maxVideoPixelsToRetain--) {
                int i12 = trackGroup.A01(((Integer) arrayList.get(maxVideoPixelsToRetain)).intValue()).A0E();
                if (i12 == -1 || i12 > i10) {
                    arrayList.remove(maxVideoPixelsToRetain);
                }
            }
        }
        return arrayList;
    }

    public static void A0G(C0599Ge c0599Ge, int[][][] iArr, AB[] abArr, InterfaceC0601Gg[] interfaceC0601GgArr, int i) {
        if (i == 0) {
            return;
        }
        int i5 = -1;
        int i8 = -1;
        boolean z = true;
        int i10 = 0;
        while (true) {
            int tunnelingAudioRendererIndex = c0599Ge.A00();
            if (i10 >= tunnelingAudioRendererIndex) {
                break;
            }
            int i11 = c0599Ge.A01(i10);
            InterfaceC0601Gg interfaceC0601Gg = interfaceC0601GgArr[i10];
            if ((i11 == 1 || i11 == 2) && interfaceC0601Gg != null && A0M(iArr[i10], c0599Ge.A02(i10), interfaceC0601Gg)) {
                if (i11 == 1) {
                    if (i5 != -1) {
                        z = false;
                        break;
                    }
                    i5 = i10;
                } else {
                    if (i8 != -1) {
                        z = false;
                        break;
                    }
                    i8 = i10;
                }
            }
            i10++;
        }
        if (z & ((i5 == -1 || i8 == -1) ? false : true)) {
            AB ab = new AB(i);
            abArr[i5] = ab;
            abArr[i8] = ab;
        }
    }

    public static boolean A0H(int i, boolean z) {
        int i5 = i & 7;
        return i5 == 4 || (z && i5 == 3);
    }

    public static boolean A0I(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 97));
    }

    public static boolean A0J(Format format, int i, GW gw) {
        if (!A0H(i, false) || format.A05 != gw.A00 || format.A0C != gw.A01) {
            return false;
        }
        String str = gw.A02;
        String[] strArr = A03;
        if (strArr[3].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A03[4] = "Z4TnxuroRrU42RhZWOmYjmwLcPTU1MVO";
        return str == null || TextUtils.equals(gw.A02, format.A0O);
    }

    public static boolean A0K(Format format, String str) {
        if (str != null) {
            boolean zEquals = TextUtils.equals(str, IF.A0L(format.A0N));
            if (A03[1].charAt(28) != 'F') {
                throw new RuntimeException();
            }
            A03[6] = "X09dGmvImKzkjml92Go2OBGPrO7s8ElS";
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0L(Format format, String str, int i, int i5, int i8, int i10, int i11) {
        if (!A0H(i, false) || (i & i5) == 0) {
            return false;
        }
        if (str != null && !IF.A0g(format.A0O, str)) {
            return false;
        }
        if (format.A0F != -1 && format.A0F > i8) {
            return false;
        }
        int i12 = format.A08;
        String[] strArr = A03;
        if (strArr[2].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A03[4] = "SWfcLm8XXzRqeXuobK6MjvAJ3gvDaDv7";
        if (i12 == -1 || format.A08 <= i10) {
            return format.A04 == -1 || format.A04 <= i11;
        }
        return false;
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, InterfaceC0601Gg interfaceC0601Gg) {
        if (interfaceC0601Gg == null) {
            return false;
        }
        int iA00 = trackGroupArray.A00(interfaceC0601Gg.A8A());
        for (int i = 0; i < interfaceC0601Gg.length(); i++) {
            int trackGroupIndex = iArr[iA00][interfaceC0601Gg.A7C(i)] & 32;
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:27:0x0088 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] A0N(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r10, int[] r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C0498Bo.A0N(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup, int[], boolean):int[]");
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i5, int selectedMimeTypeTrackCount, int i8, int i10, int i11, boolean z5) {
        int countForMimeType;
        if (trackGroup.A01 >= 2) {
            List<Integer> listA0D = A0D(trackGroup, i10, i11, z5);
            if (listA0D.size() < 2) {
                return A04;
            }
            String selectedMimeType = null;
            if (!z) {
                HashSet hashSet = new HashSet();
                int i12 = 0;
                for (int selectedMimeTypeTrackCount2 = 0; selectedMimeTypeTrackCount2 < listA0D.size(); selectedMimeTypeTrackCount2++) {
                    String str = trackGroup.A01(listA0D.get(selectedMimeTypeTrackCount2).intValue()).A0O;
                    if (hashSet.add(str) && (countForMimeType = A03(trackGroup, iArr, i, str, i5, selectedMimeTypeTrackCount, i8, listA0D)) > i12) {
                        selectedMimeType = str;
                        i12 = countForMimeType;
                    }
                }
            }
            A0F(trackGroup, iArr, i, selectedMimeType, i5, selectedMimeTypeTrackCount, i8, listA0D);
            return listA0D.size() < 2 ? A04 : IF.A0j(listA0D);
        }
        return A04;
    }

    private final InterfaceC0601Gg[] A0P(C0599Ge c0599Ge, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C04359c {
        int iA00 = c0599Ge.A00();
        InterfaceC0601Gg[] interfaceC0601GgArr = new InterfaceC0601Gg[iA00];
        boolean seenVideoRendererWithMappedTracks = false;
        boolean z = false;
        for (int i = 0; i < iA00; i++) {
            if (2 == c0599Ge.A01(i)) {
                if (!z) {
                    interfaceC0601GgArr[i] = A0B(c0599Ge.A02(i), iArr[i], iArr2[i], defaultTrackSelector$Parameters, this.A00);
                    z = interfaceC0601GgArr[i] != null;
                }
                seenVideoRendererWithMappedTracks |= c0599Ge.A02(i).A01 > 0;
            }
        }
        boolean z5 = false;
        int rendererCount = 0;
        for (int i5 = 0; i5 < iA00; i5++) {
            int iA01 = c0599Ge.A01(i5);
            switch (iA01) {
                case 1:
                    if (!z5) {
                        TrackGroupArray trackGroupArrayA02 = c0599Ge.A02(i5);
                        int[][] iArr3 = iArr[i5];
                        int i8 = iArr2[i5];
                        interfaceC0601GgArr[i5] = A0A(trackGroupArrayA02, iArr3, i8, defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                        z5 = interfaceC0601GgArr[i5] != null;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    if (rendererCount != 0) {
                        continue;
                    } else {
                        interfaceC0601GgArr[i5] = A08(c0599Ge.A02(i5), iArr[i5], defaultTrackSelector$Parameters);
                        rendererCount = interfaceC0601GgArr[i5] != null ? 1 : 0;
                        if (A03[1].charAt(28) != 'F') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[2] = "QJl7DztNVPNycYqDWlGKy9194VAG";
                        strArr[5] = "9kW2zRUIc2UhcVCPTVcu4Y";
                    }
                    break;
                default:
                    interfaceC0601GgArr[i5] = A06(iA01, c0599Ge.A02(i5), iArr[i5], defaultTrackSelector$Parameters);
                    break;
            }
        }
        return interfaceC0601GgArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    @Override // com.meta.analytics.dsp.uinode.W6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.meta.analytics.dsp.uinode.AB[], com.meta.analytics.dsp.uinode.InterfaceC0601Gg[]> A0V(com.meta.analytics.dsp.uinode.C0599Ge r11, int[][][] r12, int[] r13) throws com.meta.analytics.dsp.uinode.C04359c {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReference<com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters> r0 = r10.A01
            java.lang.Object r6 = r0.get()
            com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r6 = (com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters) r6
            int r5 = r11.A00()
            com.facebook.ads.redexgen.X.Gg[] r4 = r10.A0P(r11, r12, r13, r6)
            r3 = 0
        L11:
            r9 = 0
            r8 = 0
            r2 = 1
            if (r3 >= r5) goto L61
            boolean r0 = r6.A06(r3)
            if (r0 == 0) goto L21
            r4[r3] = r8
        L1e:
            int r3 = r3 + 1
            goto L11
        L21:
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r1 = r11.A02(r3)
            boolean r0 = r6.A07(r3, r1)
            if (r0 == 0) goto L1e
            com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride r7 = r6.A05(r3, r1)
            if (r7 != 0) goto L34
            r4[r3] = r8
            goto L1e
        L34:
            int r0 = r7.A01
            if (r0 != r2) goto L4a
            int r0 = r7.A00
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r2 = r1.A01(r0)
            int[] r0 = r7.A02
            r1 = r0[r9]
            com.facebook.ads.redexgen.X.Bn r0 = new com.facebook.ads.redexgen.X.Bn
            r0.<init>(r2, r1)
            r4[r3] = r0
            goto L1e
        L4a:
            com.facebook.ads.redexgen.X.Gf r0 = r10.A00
            java.lang.Object r2 = com.meta.analytics.dsp.uinode.AbstractC0620Ha.A01(r0)
            com.facebook.ads.redexgen.X.Gf r2 = (com.meta.analytics.dsp.uinode.InterfaceC0600Gf) r2
            int r0 = r7.A00
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r1 = r1.A01(r0)
            int[] r0 = r7.A02
            com.facebook.ads.redexgen.X.Gg r0 = r2.A4o(r1, r0)
            r4[r3] = r0
            goto L1e
        L61:
            com.facebook.ads.redexgen.X.AB[] r3 = new com.meta.analytics.dsp.uinode.AB[r5]
            r2 = 0
        L64:
            if (r2 >= r5) goto L85
            boolean r0 = r6.A06(r2)
            if (r0 != 0) goto L83
            int r1 = r11.A01(r2)
            r0 = 5
            if (r1 == r0) goto L77
            r0 = r4[r2]
            if (r0 == 0) goto L83
        L77:
            r0 = 1
        L78:
            if (r0 == 0) goto L81
            com.facebook.ads.redexgen.X.AB r0 = com.meta.analytics.dsp.uinode.AB.A01
        L7c:
            r3[r2] = r0
            int r2 = r2 + 1
            goto L64
        L81:
            r0 = r8
            goto L7c
        L83:
            r0 = 0
            goto L78
        L85:
            int r0 = r6.A04
            A0G(r11, r12, r3, r4, r0)
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C0498Bo.A0V(com.facebook.ads.redexgen.X.Ge, int[][][], int[]):android.util.Pair");
    }
}
