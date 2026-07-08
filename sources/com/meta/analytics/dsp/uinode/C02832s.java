package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02832s<E> implements Cloneable {
    public static byte[] A04;
    public static final Object A05;
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final E A02(long j, E e4) {
        E e5;
        int iA03 = AbstractC02822r.A03(this.A02, this.A00, j);
        return (iA03 < 0 || (e5 = (E) this.A03[iA03]) == A05) ? e4 : e5;
    }

    public static String A03(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{19, 79, 83, 82, 72, 27, 118, 90, 75, 18, 91, 87, 51, 53};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A0B(long j, E e4) {
        int iA03 = AbstractC02822r.A03(this.A02, this.A00, j);
        if (iA03 >= 0) {
            this.A03[iA03] = e4;
            return;
        }
        int iA032 = iA03 ^ (-1);
        int i = this.A00;
        if (iA032 < i) {
            Object[] objArr = this.A03;
            if (objArr[iA032] == A05) {
                this.A02[iA032] = j;
                objArr[iA032] = e4;
                return;
            }
        }
        if (this.A01 && i >= this.A02.length) {
            A04();
            iA032 = AbstractC02822r.A03(this.A02, this.A00, j) ^ (-1);
        }
        int i5 = this.A00;
        if (i5 >= this.A02.length) {
            int iA00 = AbstractC02822r.A00(i5 + 1);
            long[] jArr = new long[iA00];
            Object[] objArr2 = new Object[iA00];
            long[] jArr2 = this.A02;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = jArr;
            this.A03 = objArr2;
        }
        int i8 = this.A00;
        if (i8 - iA032 != 0) {
            long[] jArr3 = this.A02;
            System.arraycopy(jArr3, iA032, jArr3, iA032 + 1, i8 - iA032);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, iA032, objArr4, iA032 + 1, this.A00 - iA032);
        }
        this.A02[iA032] = j;
        this.A03[iA032] = e4;
        this.A00++;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final String toString() {
        if (A06() <= 0) {
            return A03(12, 2, 126);
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                sb.append(A03(10, 2, 65));
            }
            sb.append(A00(i));
            sb.append('=');
            E eA07 = A07(i);
            if (eA07 != this) {
                sb.append(eA07);
            } else {
                sb.append(A03(0, 10, 13));
            }
        }
        sb.append('}');
        return sb.toString();
    }

    static {
        A05();
        A05 = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C02832s() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C02832s(int i) {
        this.A01 = false;
        if (i == 0) {
            this.A02 = AbstractC02822r.A01;
            this.A03 = AbstractC02822r.A02;
        } else {
            int iA00 = AbstractC02822r.A00(i);
            this.A02 = new long[iA00];
            this.A03 = new Object[iA00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i) {
        if (this.A01) {
            A04();
        }
        return this.A02[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C02832s<E> clone() {
        C02832s<E> c02832s = null;
        try {
            c02832s = (C02832s) super.clone();
            c02832s.A02 = (long[]) this.A02.clone();
            c02832s.A03 = (Object[]) this.A03.clone();
            return c02832s;
        } catch (CloneNotSupportedException unused) {
            return c02832s;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        int i = this.A00;
        int i5 = 0;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj = objArr[i8];
            if (obj != A05) {
                if (i8 != i5) {
                    jArr[i5] = jArr[i8];
                    objArr[i5] = obj;
                    objArr[i8] = null;
                }
                i5++;
            }
        }
        this.A01 = false;
        this.A00 = i5;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j) {
        return A02(j, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i = this.A00;
        Object[] objArr = this.A03;
        for (int i5 = 0; i5 < i; i5++) {
            objArr[i5] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i) {
        Object[] objArr = this.A03;
        Object obj = objArr[i];
        Object obj2 = A05;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.A01 = true;
        }
    }
}
