package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XL implements InterfaceC0502Bs, C1 {
    public static byte[] A0J;
    public static String[] A0K = {"NMENm2VVY4CjFU7qkzTmTxviYk7AnS7Z", "JBVFfjWytxpjUnZZ6lInsU7tzfFzOPaX", "YaevPinMBRqhVFzNm59vwI8bFO4cI8AD", "52TqclTutshaaFkrwJ4nyJTeA2xWvRpu", "JGseDZtum4mqdbq3nSxMUnsGXrSMUYmk", "xuKwDkc3QqvJvTm3i1k9vAbPWWVSjov2", "2GdyUNwnHd6eSNq3THJOdF5Wjs3u7UdX", "VVA8bJ0ju0kVaqoWpNH4VPWsYewebzZE"};
    public static final InterfaceC0505Bv A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public InterfaceC0504Bu A09;
    public C0645Hz A0A;
    public boolean A0B;
    public CY[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C0645Hz A0F;
    public final C0645Hz A0G;
    public final C0645Hz A0H;
    public final ArrayDeque<XT> A0I;

    public static String A04(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{107, 94, 69, 71, 10, 89, 67, 80, 79, 10, 70, 79, 89, 89, 10, 94, 66, 75, 68, 10, 66, 79, 75, 78, 79, 88, 10, 70, 79, 68, 77, 94, 66, 10, 2, 95, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 3, 4, 104, 109, 57, 57};
    }

    static {
        A07();
        A0L = new XM();
        A0M = IF.A08(A04(48, 4, 57));
    }

    public XL() {
        this(0);
    }

    public XL(int i) {
        this.A0E = i;
        this.A0F = new C0645Hz(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C0645Hz(AbstractC0641Hv.A03);
        this.A0G = new C0645Hz(4);
        this.A06 = -1;
    }

    private int A00(long j) {
        long sampleAccumulatedBytes = Long.MAX_VALUE;
        int i = 1;
        int i5 = -1;
        long j4 = Long.MAX_VALUE;
        long j7 = Long.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        int i8 = 0;
        while (true) {
            CY[] cyArr = this.A0C;
            if (i8 >= cyArr.length) {
                if (j7 == Long.MAX_VALUE || trackIndex == 0) {
                    return i5;
                }
                long preferredSkipAmount = 10485760 + j7;
                if (j4 < preferredSkipAmount) {
                    return i5;
                }
                return minAccumulatedBytesTrackIndex;
            }
            CY cy = cyArr[i8];
            int i10 = cy.A00;
            if (i10 != cy.A03.A01) {
                long j8 = cy.A03.A06[i10];
                String[] strArr = A0K;
                if (strArr[2].charAt(0) == strArr[4].charAt(0)) {
                    throw new RuntimeException();
                }
                A0K[7] = "SNUxNBsUQVazn7VwiZNUPsjETt3vlrb9";
                long j9 = this.A0D[i8][i10];
                long j10 = j8 - j;
                int i11 = (j10 < 0 || j10 >= 262144) ? 1 : 0;
                if ((i11 == 0 && i != 0) || (i11 == i && j10 < sampleAccumulatedBytes)) {
                    i = i11;
                    sampleAccumulatedBytes = j10;
                    i5 = i8;
                    j4 = j9;
                }
                if (j9 < j7) {
                    j7 = j9;
                    trackIndex = i11;
                    minAccumulatedBytesTrackIndex = i8;
                }
            }
            i8++;
        }
    }

    private int A01(InterfaceC0503Bt interfaceC0503Bt, C0507Bz c0507Bz) throws InterruptedException, IOException {
        int i;
        long jA7i = interfaceC0503Bt.A7i();
        if (this.A06 == -1) {
            int iA00 = A00(jA7i);
            this.A06 = iA00;
            if (iA00 == -1) {
                return -1;
            }
        }
        CY cy = this.A0C[this.A06];
        C4 trackOutput = cy.A01;
        int i5 = cy.A00;
        long j = cy.A03.A06[i5];
        int i8 = cy.A03.A05[i5];
        long j4 = (j - jA7i) + ((long) this.A04);
        if (j4 < 0 || j4 >= 262144) {
            c0507Bz.A00 = j;
            return 1;
        }
        if (cy.A02.A02 == 1) {
            j4 += 8;
            i8 -= 8;
        }
        interfaceC0503Bt.AGP((int) j4);
        int sampleSize = cy.A02.A01;
        String[] strArr = A0K;
        if (strArr[5].charAt(6) == strArr[3].charAt(6)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0K;
        strArr2[2] = "Kr0RNkXRcq3MKFcdyeDViEL730qvS1Or";
        strArr2[4] = "dsHpYadjIesMKkl8nKWo5Xy2zI1EHMvq";
        if (sampleSize != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int nalUnitLengthFieldLength = cy.A02.A01;
            int i10 = 4 - cy.A02.A01;
            while (this.A04 < i8) {
                int i11 = this.A05;
                if (i11 == 0) {
                    interfaceC0503Bt.readFully(this.A0G.A00, i10, nalUnitLengthFieldLength);
                    this.A0G.A0Y(0);
                    this.A05 = this.A0G.A0H();
                    this.A0H.A0Y(0);
                    trackOutput.AFR(this.A0H, 4);
                    this.A04 += 4;
                    i8 += i10;
                } else {
                    int iAFQ = trackOutput.AFQ(interfaceC0503Bt, i11, false);
                    this.A04 += iAFQ;
                    this.A05 -= iAFQ;
                }
            }
            i = 0;
        } else {
            while (true) {
                int i12 = this.A04;
                if (i12 >= i8) {
                    break;
                }
                int iAFQ2 = trackOutput.AFQ(interfaceC0503Bt, i8 - i12, false);
                this.A04 += iAFQ2;
                this.A05 -= iAFQ2;
            }
            i = 0;
        }
        long[] jArr = cy.A03.A07;
        String[] strArr3 = A0K;
        if (strArr3[0].charAt(11) != strArr3[1].charAt(11)) {
            A0K[6] = "rOKgrdqhHdXOkXubOIefZGVtdh7cvyNY";
            trackOutput.AFS(jArr[i5], cy.A03.A04[i5], i8, 0, null);
            cy.A00 += 0;
            this.A06 = -1;
            this.A04 = i;
            this.A05 = i;
            return i;
        }
        A0K[6] = "wHchi0wLq1ErSeSpKTFcZRDvkUCQV0RS";
        trackOutput.AFS(jArr[i5], cy.A03.A04[i5], i8, 0, null);
        cy.A00++;
        this.A06 = -1;
        this.A04 = i;
        this.A05 = i;
        return i;
    }

    public static int A02(C0514Ch c0514Ch, long j) {
        int iA00 = c0514Ch.A00(j);
        if (iA00 == -1) {
            return c0514Ch.A01(j);
        }
        return iA00;
    }

    public static long A03(C0514Ch c0514Ch, long j, long j4) {
        int iA02 = A02(c0514Ch, j);
        if (iA02 == -1) {
            return j4;
        }
        long jMin = Math.min(c0514Ch.A06[iA02], j4);
        if (A0K[6].charAt(20) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[5] = "p3vbyKglgBhvg6ga7RihuDYjPakbSwaT";
        strArr[3] = "aiiDKqFmbgCXZZv8uVJN0mXFbRvDRlE6";
        return jMin;
    }

    private ArrayList<C0514Ch> A05(XT xt, C0506Bw c0506Bw, boolean z) throws C04539v {
        C0511Ce c0511CeA0C;
        ArrayList<C0514Ch> arrayList = new ArrayList<>();
        for (int i = 0; i < xt.A01.size(); i++) {
            XT xt2 = xt.A01.get(i);
            int i5 = ((CJ) xt2).A00;
            if (i5 == CJ.A1M && (c0511CeA0C = CO.A0C(xt2, xt.A07(CJ.A0o), -9223372036854775807L, null, z, this.A0B)) != null) {
                C0514Ch c0514ChA0E = CO.A0E(c0511CeA0C, xt2.A06(CJ.A0e).A06(CJ.A0i).A06(CJ.A17), c0506Bw);
                if (c0514ChA0E.A01 != 0) {
                    arrayList.add(c0514ChA0E);
                }
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j) throws C04539v {
        while (true) {
            boolean zIsEmpty = this.A0I.isEmpty();
            if (A0K[7].charAt(14) == 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[0] = "xKK31fned0mjTVppOAxzoNj9viNrlryO";
            strArr[1] = "3HkC7zoZl6jjTlZPcBHC3lXiUTtQlSXh";
            if (zIsEmpty || this.A0I.peek().A00 != j) {
                break;
            }
            XT xtPop = this.A0I.pop();
            if (((CJ) xtPop).A00 == CJ.A0k) {
                A0A(xtPop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                XT containerAtom = this.A0I.peek();
                containerAtom.A08(xtPop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A09(long j) {
        for (CY cy : this.A0C) {
            C0514Ch c0514Ch = cy.A03;
            int iA00 = c0514Ch.A00(j);
            if (iA00 == -1) {
                iA00 = c0514Ch.A01(j);
            }
            cy.A00 = iA00;
            if (A0K[6].charAt(20) == 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[5] = "MNnvCsSYuz9FkO9KQczdYnABN7zTLwyu";
            strArr[3] = "oflUn1lXrJVPIzwz3GYNJmaWxDOTuoWv";
        }
    }

    private void A0A(XT xt) throws C04539v {
        ArrayList<C0514Ch> arrayListA05;
        int trackCount = -1;
        long jMax = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadataA0F = null;
        C0506Bw c0506Bw = new C0506Bw();
        XS xsA07 = xt.A07(CJ.A1Q);
        if (xsA07 != null && (metadataA0F = CO.A0F(xsA07, this.A0B)) != null) {
            c0506Bw.A05(metadataA0F);
        }
        try {
            arrayListA05 = A05(xt, c0506Bw, (this.A0E & 1) != 0);
        } catch (XP unused) {
            c0506Bw = new C0506Bw();
            arrayListA05 = A05(xt, c0506Bw, true);
        }
        int size = arrayListA05.size();
        for (int i = 0; i < size; i++) {
            C0514Ch c0514Ch = arrayListA05.get(i);
            C0511Ce c0511Ce = c0514Ch.A03;
            CY cy = new CY(c0511Ce, c0514Ch, this.A09.AGi(i, c0511Ce.A03));
            Format formatA0F = c0511Ce.A07.A0F(c0514Ch.A00 + 30);
            if (c0511Ce.A03 == 1) {
                if (c0506Bw.A03()) {
                    formatA0F = formatA0F.A0G(c0506Bw.A00, c0506Bw.A01);
                }
                if (metadataA0F != null) {
                    formatA0F = formatA0F.A0J(metadataA0F);
                }
            }
            cy.A01.A5n(formatA0F);
            jMax = Math.max(jMax, c0511Ce.A04 != -9223372036854775807L ? c0511Ce.A04 : c0514Ch.A02);
            if (c0511Ce.A03 == 2 && trackCount == -1) {
                trackCount = arrayList.size();
            }
            arrayList.add(cy);
        }
        this.A02 = trackCount;
        this.A08 = jMax;
        CY[] cyArr = (CY[]) arrayList.toArray(new CY[arrayList.size()]);
        this.A0C = cyArr;
        this.A0D = A0G(cyArr);
        this.A09.A5Y();
        this.A09.AFi(this);
    }

    public static boolean A0B(int i) {
        return i == CJ.A0k || i == CJ.A1M || i == CJ.A0e || i == CJ.A0i || i == CJ.A17 || i == CJ.A0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0C(int r4) {
        /*
            int r0 = com.meta.analytics.dsp.uinode.CJ.A0d
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A0o
            if (r4 == r0) goto L7a
            int r3 = com.meta.analytics.dsp.uinode.CJ.A0W
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XL.A0K
            r0 = 2
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XL.A0K
            java.lang.String r1 = "Lbfp0NvNFR61AEm901fhAiQEZdUAojSN"
            r0 = 7
            r2[r0] = r1
            if (r4 == r3) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1B
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1E
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1C
            if (r4 == r0) goto L7a
            int r3 = com.meta.analytics.dsp.uinode.CJ.A0D
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XL.A0K
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 11
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L7e
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XL.A0K
            java.lang.String r1 = "AcWpjtb96ZMDu8ZbPmw7y3S9ldwHNTMG"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "liNDCAzQcSMqwn5YpITrjlM20opaDBZf"
            r0 = 4
            r2[r0] = r1
            if (r4 == r3) goto L7a
        L56:
            int r0 = com.meta.analytics.dsp.uinode.CJ.A0P
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1A
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1D
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1F
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A18
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A0C
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1K
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A0V
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1Q
            if (r4 != r0) goto L7c
        L7a:
            r0 = 1
        L7b:
            return r0
        L7c:
            r0 = 0
            goto L7b
        L7e:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XL.A0K
            java.lang.String r1 = "Et4fiiNPrE1ktHaAFcacRxoSMiMckR7G"
            r0 = 6
            r2[r0] = r1
            if (r4 == r3) goto L7a
            goto L56
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XL.A0C(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0D(com.meta.analytics.dsp.uinode.InterfaceC0503Bt r12) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XL.A0D(com.facebook.ads.redexgen.X.Bt):boolean");
    }

    private boolean A0E(InterfaceC0503Bt interfaceC0503Bt, C0507Bz c0507Bz) throws InterruptedException, IOException {
        long j = this.A07 - ((long) this.A00);
        long atomEndPosition = interfaceC0503Bt.A7i() + j;
        boolean z = false;
        C0645Hz c0645Hz = this.A0A;
        if (c0645Hz != null) {
            interfaceC0503Bt.readFully(c0645Hz.A00, this.A00, (int) j);
            if (this.A01 == CJ.A0V) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new XS(this.A01, this.A0A));
            }
        } else if (j < 262144) {
            interfaceC0503Bt.AGP((int) j);
        } else {
            long atomPayloadSize = interfaceC0503Bt.A7i();
            c0507Bz.A00 = atomPayloadSize + j;
            z = true;
        }
        A08(atomEndPosition);
        return z && this.A03 != 2;
    }

    public static boolean A0F(C0645Hz c0645Hz) {
        int iA08;
        int majorBrand;
        c0645Hz.A0Y(8);
        int iA082 = c0645Hz.A08();
        int majorBrand2 = A0M;
        if (iA082 == majorBrand2) {
            return true;
        }
        c0645Hz.A0Z(4);
        do {
            int iA04 = c0645Hz.A04();
            String[] strArr = A0K;
            String str = strArr[0];
            String str2 = strArr[1];
            int iCharAt = str.charAt(11);
            int majorBrand3 = str2.charAt(11);
            if (iCharAt != majorBrand3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[5] = "HZNBHqeXKlwJLRyY4R1ZazClo3jLxgS8";
            strArr2[3] = "ULnGw1bPzwMM6OF7GcjqoSbIBNnkFp5Y";
            if (iA04 > 0) {
                iA08 = c0645Hz.A08();
                majorBrand = A0M;
            } else {
                return false;
            }
        } while (iA08 != majorBrand);
        return true;
    }

    public static long[][] A0G(CY[] cyArr) {
        long[][] jArr = new long[cyArr.length][];
        int[] iArr = new int[cyArr.length];
        long[] jArr2 = new long[cyArr.length];
        boolean[] zArr = new boolean[cyArr.length];
        for (int i = 0; i < cyArr.length; i++) {
            jArr[i] = new long[cyArr[i].A03.A01];
            jArr2[i] = cyArr[i].A03.A07[0];
        }
        long j = 0;
        int i5 = 0;
        while (true) {
            int length = cyArr.length;
            String[] strArr = A0K;
            if (strArr[0].charAt(11) != strArr[1].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[5] = "yJ2jD62HfH2jQTY3DSfm8DixkPqWTM6R";
            strArr2[3] = "ERCQlGdy7dAXpXma9fK0CLCiAFSx2az3";
            if (i5 < length) {
                long j4 = Long.MAX_VALUE;
                int minTimeTrackIndex = -1;
                for (int i8 = 0; i8 < cyArr.length; i8++) {
                    if (!zArr[i8] && jArr2[i8] <= j4) {
                        minTimeTrackIndex = i8;
                        j4 = jArr2[i8];
                    }
                }
                int i10 = iArr[minTimeTrackIndex];
                jArr[minTimeTrackIndex][i10] = j;
                j += (long) cyArr[minTimeTrackIndex].A03.A05[i10];
                int i11 = i10 + 1;
                iArr[minTimeTrackIndex] = i11;
                if (i11 < jArr[minTimeTrackIndex].length) {
                    jArr2[minTimeTrackIndex] = cyArr[minTimeTrackIndex].A03.A07[i11];
                } else {
                    zArr[minTimeTrackIndex] = true;
                    i5++;
                }
            } else {
                return jArr;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A08;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j) {
        long j4;
        long jA03;
        int iA01;
        CY[] cyArr = this.A0C;
        if (cyArr.length == 0) {
            return new C0(C2.A03);
        }
        long j7 = -9223372036854775807L;
        long jA032 = -1;
        int i = this.A02;
        if (i != -1) {
            C0514Ch c0514Ch = cyArr[i].A03;
            int iA02 = A02(c0514Ch, j);
            if (iA02 == -1) {
                return new C0(C2.A03);
            }
            j4 = c0514Ch.A07[iA02];
            jA03 = c0514Ch.A06[iA02];
            if (j4 < j && iA02 < c0514Ch.A01 - 1 && (iA01 = c0514Ch.A01(j)) != -1 && iA01 != iA02) {
                j7 = c0514Ch.A07[iA01];
                jA032 = c0514Ch.A06[iA01];
            }
        } else {
            j4 = j;
            jA03 = Long.MAX_VALUE;
        }
        int secondSampleIndex = 0;
        while (true) {
            CY[] cyArr2 = this.A0C;
            if (secondSampleIndex >= cyArr2.length) {
                break;
            }
            if (secondSampleIndex != this.A02) {
                C0514Ch c0514Ch2 = cyArr2[secondSampleIndex].A03;
                jA03 = A03(c0514Ch2, j4, jA03);
                if (j7 != -9223372036854775807L) {
                    jA032 = A03(c0514Ch2, j7, jA032);
                }
            }
            secondSampleIndex++;
        }
        C2 c22 = new C2(j4, jA03);
        if (j7 == -9223372036854775807L) {
            return new C0(c22);
        }
        return new C0(c22, new C2(j7, jA032));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final void A8o(InterfaceC0504Bu interfaceC0504Bu) {
        this.A09 = interfaceC0504Bu;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final int AEH(InterfaceC0503Bt interfaceC0503Bt, C0507Bz c0507Bz) throws InterruptedException, IOException {
        while (true) {
            switch (this.A03) {
                case 0:
                    if (!A0D(interfaceC0503Bt)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    if (A0E(interfaceC0503Bt, c0507Bz)) {
                        return 1;
                    }
                    break;
                case 2:
                    return A01(interfaceC0503Bt, c0507Bz);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final void AFh(long j, long j4) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j == 0) {
            A06();
        } else {
            if (this.A0C == null) {
                return;
            }
            A09(j4);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final boolean AGR(InterfaceC0503Bt interfaceC0503Bt) throws InterruptedException, IOException {
        return AbstractC0510Cc.A04(interfaceC0503Bt);
    }
}
