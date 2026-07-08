package oj1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class ej implements hw {
    public int n3;
    public char[] y = c5.y.n3();

    public final int a(int i, int i5) {
        int i8 = i5 + i;
        char[] cArr = this.y;
        if (cArr.length <= i8) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i8, i * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(this, newSize)");
            this.y = cArrCopyOf;
        }
        return i;
    }

    public void fb() {
        c5.y.y(this.y);
    }

    public final void gv(int i, int i5, String str) {
        byte b4;
        int length = str.length();
        while (i < length) {
            int iA = a(i5, 2);
            char cCharAt = str.charAt(i);
            if (cCharAt >= q9.y().length || (b4 = q9.y()[cCharAt]) == 0) {
                int i8 = iA + 1;
                this.y[iA] = cCharAt;
                i5 = i8;
                i++;
            } else {
                if (b4 == 1) {
                    String str2 = q9.n3()[cCharAt];
                    Intrinsics.checkNotNull(str2);
                    int iA2 = a(iA, str2.length());
                    str2.getChars(0, str2.length(), this.y, iA2);
                    i5 = iA2 + str2.length();
                    this.n3 = i5;
                } else {
                    char[] cArr = this.y;
                    cArr[iA] = '\\';
                    cArr[iA + 1] = (char) b4;
                    i5 = iA + 2;
                    this.n3 = i5;
                }
                i++;
            }
        }
        int iA3 = a(i5, 1);
        this.y[iA3] = '\"';
        this.n3 = iA3 + 1;
    }

    @Override // oj1.hw
    public void n3(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        v(text.length() + 2);
        char[] cArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        cArr[i] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i5);
        int i8 = length + i5;
        for (int i10 = i5; i10 < i8; i10++) {
            char c = cArr[i10];
            if (c < q9.y().length && q9.y()[c] != 0) {
                gv(i10 - i5, i10, text);
                return;
            }
        }
        cArr[i8] = '\"';
        this.n3 = i8 + 1;
    }

    public String toString() {
        return new String(this.y, 0, this.n3);
    }

    public final void v(int i) {
        a(this.n3, i);
    }

    @Override // oj1.hw
    public void writeLong(long j) {
        zn(String.valueOf(j));
    }

    @Override // oj1.hw
    public void y(char c) {
        v(1);
        char[] cArr = this.y;
        int i = this.n3;
        this.n3 = i + 1;
        cArr[i] = c;
    }

    @Override // oj1.hw
    public void zn(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        v(length);
        text.getChars(0, text.length(), this.y, this.n3);
        this.n3 += length;
    }
}
