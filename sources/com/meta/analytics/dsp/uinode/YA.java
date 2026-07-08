package com.meta.analytics.dsp.uinode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YA<T> implements AnonymousClass97<T> {
    public static byte[] A06;
    public C04328z A00;
    public C04328z A01;
    public List<YA<T>.RecordFileBasedFetch> A02;
    public boolean A03;
    public final C04318y A04;
    public final C9E A05;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-28, 2, 15, -63, 16, 15, 13, 26, -63, 5, 6, 13, 6, 21, 6, -63, 4, 22, 19, 20, 16, 19, 20, -63, 17, 16, 10, 15, 21, 10, 15, 8, -63, 2, 21, -63, 21, 9, 6, -63, 5, 2, 21, 2, 3, 2, 20, 6, -63, 20, 21, 2, 19, 21, -38, 12, 9, 10, 6, 9, -73, 7, 6, 10, 0, 11, 0, 6, 5, -73, 0, 10, -73, -8, 11, -73, -65, -68, -5, -61, -68, -5, -64, -61, -73, -8, 5, -5, -73, 9, -4, -6, 6, 9, -5, -73, -3, 0, 3, -4, -73, 10, -4, 8, 12, -4, 5, -6, -4, -73, 10, 11, -8, 9, 11, 10, -73, -8, 11, -73, -65, -68, -5, -61, -68, -5, -64, -47, -73, -5, -8, 11, -8, -73, -1, -8, 10, -73, 7, 9, 6, -7, -8, -7, 3, 16, -73, -7, -4, -4, 5, -73, 3, 6, 10, 11, -78, -28, -31, -30, -34, -31, -113, -33, -34, -30, -40, -29, -40, -34, -35, -113, -40, -30, -113, -48, -29, -113, -105, -108, -45, -101, -108, -45, -104, -101, -113, -47, -28, -29, -113, -31, -44, -46, -34, -31, -45, -113, -43, -40, -37, -44, -113, -30, -44, -32, -28, -44, -35, -46, -44, -113, -34, -35, -37, -24, -113, -41, -48, -30, -113, -43, -40, -37, -44, -113, -108, -45, -87, -113, -45, -48, -29, -48, -113, -41, -48, -30, -113, -33, -31, -34, -47, -48, -47, -37, -24, -113, -47, -44, -44, -35, -113, -37, -34, -30, -29, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 0, 3, 3, -65, 3, 0, 19, 0, -65, 19, 14, -65, 11, 14, 6, -72, -45, -37, -34, -41, -42, -110, -26, -31, -110, -43, -34, -41, -45, -28, -110, -42, -45, -26, -45, -44, -45, -27, -41, -9, 18, 26, 29, 22, 21, -47, 37, 32, -47, 23, 22, 37, 20, 25, -47, 21, 18, 37, 18, -47, 23, 35, 32, 30, -47, 29, 32, 24, 34, 61, 69, 72, 65, 64, -4, 80, 75, -4, 67, 65, 80, -4, 78, 65, 63, 75, 78, 64, -4, 63, 75, 81, 74, 80, 5, 32, 40, 43, 36, 35, -33, 51, 46, -33, 52, 47, 35, 32, 51, 36, -33, 37, 40, 43, 36, -33, 50, 36, 48, 52, 36, 45, 34, 36, 43, 62, 60, 72, 75, 61, 31, 66, 69, 62, 27, 58, 76, 62, 61, 43, 62, 60, 72, 75, 61, 29, 58, 77, 58, 59, 58, 76, 62, -7, 60, 69, 72, 76, 62, 61, -8, 11, 9, 21, 24, 10, -20, 15, 18, 11, -24, 7, 25, 11, 10, -8, 11, 9, 21, 24, 10, -22, 7, 26, 7, 8, 7, 25, 11, -58, 15, 25, -58, 9, 18, 21, 25, 11, 10, -24, 1, -2, 1, 2, 10, 1, -77, -27, -8, -10, 2, 5, -9, -39, -4, -1, -8, -43, -12, 6, -8, -9, -27, -8, -10, 2, 5, -9, -41, -12, 7, -12, -11, -12, 6, -8, -77, -7, -8, 7, -10, -5, 11, 29, 26, 27, 23, 26, 5, 2, 21, 2};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/YA<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(YB yb) {
        if (!this.A02.remove(yb)) {
            return false;
        }
        if (yb.A5g() > 0 && yb.A01().A02.A05(yb.A01().A01).equals(this.A01)) {
            this.A01 = yb.A00().A02;
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public YA(AnonymousClass94 anonymousClass94, C9C c9c) throws IOException {
        this.A05 = new C9E(anonymousClass94.A04(A00(515, 4, 63)), c9c);
        C04318y c04318y = new C04318y(new File(anonymousClass94.A05(), A00(509, 6, 70)));
        this.A04 = c04318y;
        this.A00 = c04318y.A03();
        this.A02 = new ArrayList();
        A05(c9c);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i, int i5) throws IOException {
        C04328z c04328z = new C04328z(i, i5);
        this.A00 = c04328z;
        this.A04.A04(c04328z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/YA<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(YB yb) throws C9G {
        if (!this.A03) {
            if (A06(yb)) {
                if (yb.A5g() == 0) {
                    return;
                }
                if (this.A00.A04(yb.A00().A02) == 0) {
                    try {
                        Iterator<C9B> it = yb.A00.iterator();
                        while (it.hasNext()) {
                            if (it.next().A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), yb.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e4) {
                        throw new C9G(A00(361, 30, 93), e4);
                    }
                }
                throw new C9G(A00(0, 54, 63));
            }
            throw new C9G(A00(466, 43, 49));
        }
        throw new C9G(A00(427, 39, 68));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0066 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(com.meta.analytics.dsp.uinode.C9C r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.YA.A05(com.facebook.ads.redexgen.X.9C):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass97
    public final synchronized AnonymousClass96 A5f(byte[] bArr, int[] iArr) throws C9G {
        YA<T>.RecordFileBasedFetch yb;
        if (!this.A03) {
            int i = 0;
            int i5 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean mayHaveMoreData = true;
                while (true) {
                    AnonymousClass92 anonymousClass92A0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i, iArr, i5);
                    int iA00 = anonymousClass92A0A.A01().A00();
                    int storageOffset = anonymousClass92A0A.A01().A01();
                    int i8 = iA00 - storageOffset;
                    int storageOffset2 = anonymousClass92A0A.A01().A02();
                    i += storageOffset2;
                    i5 += i8;
                    if (anonymousClass92A0A.A01().A03() == AnonymousClass90.A02) {
                        arrayList.add(anonymousClass92A0A);
                    }
                    if (anonymousClass92A0A.A01().A03() == AnonymousClass90.A03) {
                        break;
                    }
                    if (anonymousClass92A0A.A01().A03() == AnonymousClass90.A04) {
                        int countsOffset = this.A05.A06();
                        int storageOffset3 = this.A05.A08();
                        int countsOffset2 = countsOffset + storageOffset3;
                        int storageOffset4 = this.A01.A02();
                        if (countsOffset2 == storageOffset4 + 1) {
                            mayHaveMoreData = false;
                            break;
                        }
                        int storageOffset5 = this.A01.A02();
                        this.A01 = new C04328z(storageOffset5 + 1, 0);
                    } else {
                        this.A01 = this.A01.A05(i8);
                    }
                }
                yb = new YB(this, arrayList, mayHaveMoreData);
                this.A02.add(yb);
                if (!arrayList.isEmpty()) {
                    C04328z c04328z = yb.A01().A02;
                    int storageOffset6 = yb.A01().A01;
                    this.A01 = c04328z.A05(storageOffset6);
                }
            } catch (IOException e4) {
                throw new C9G(A00(306, 29, 79), e4);
            }
        } else {
            throw new C9G(A00(391, 36, 119));
        }
        return yb;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass97
    public final synchronized int A7n() throws C9G {
        int iA09;
        if (!this.A03) {
            try {
                iA09 = this.A05.A09();
                int iA02 = this.A00.A02();
                int count = this.A05.A06();
                if (iA02 == count) {
                    int count2 = this.A00.A03();
                    iA09 -= count2;
                }
            } catch (IOException e4) {
                throw new C9G(A00(335, 26, 122), e4);
            }
        } else {
            throw new C9G(A00(427, 39, 68));
        }
        return iA09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass97
    public final synchronized void AGb(byte[] bArr) throws C9G {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e4) {
                throw new C9G(A00(257, 25, 61), e4);
            }
        } else {
            throw new C9G(A00(427, 39, 68));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass97
    public final synchronized void clear() throws C9G {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e4) {
            throw new C9G(A00(282, 24, 16), e4);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
