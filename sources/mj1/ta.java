package mj1;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ta {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long[] f6518gv;
    public final Function2<kj1.a, Integer, Boolean> n3;
    public final kj1.a y;
    public long zn;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f6517v = new y(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final long[] f6516a = new long[0];

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ta(kj1.a descriptor, Function2<? super kj1.a, ? super Integer, Boolean> readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.y = descriptor;
        this.n3 = readIfAbsent;
        int iGv = descriptor.gv();
        if (iGv <= 64) {
            this.zn = iGv != 64 ? (-1) << iGv : 0L;
            this.f6518gv = f6516a;
        } else {
            this.zn = 0L;
            this.f6518gv = v(iGv);
        }
    }

    public final int gv() {
        int iNumberOfTrailingZeros;
        int iGv = this.y.gv();
        do {
            long j = this.zn;
            if (j == -1) {
                if (iGv > 64) {
                    return zn();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.zn |= 1 << iNumberOfTrailingZeros;
        } while (!this.n3.invoke(this.y, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }

    public final void n3(int i) {
        int i5 = (i >>> 6) - 1;
        long[] jArr = this.f6518gv;
        jArr[i5] = jArr[i5] | (1 << (i & 63));
    }

    public final long[] v(int i) {
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            jArr[ArraysKt.getLastIndex(jArr)] = (-1) << i;
        }
        return jArr;
    }

    public final void y(int i) {
        if (i < 64) {
            this.zn |= 1 << i;
        } else {
            n3(i);
        }
    }

    public final int zn() {
        int length = this.f6518gv.length;
        int i = 0;
        while (i < length) {
            int i5 = i + 1;
            int i8 = i5 * 64;
            long j = this.f6518gv[i];
            while (j != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << iNumberOfTrailingZeros;
                int i10 = iNumberOfTrailingZeros + i8;
                if (this.n3.invoke(this.y, Integer.valueOf(i10)).booleanValue()) {
                    this.f6518gv[i] = j;
                    return i10;
                }
            }
            this.f6518gv[i] = j;
            i = i5;
        }
        return -1;
    }
}
