package ak1;

import com.google.protobuf.Reader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tl {
    public static final y zn = new y(null);
    public final int[] n3 = new int[10];
    public int y;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    public final boolean a(int i) {
        return ((1 << i) & this.y) != 0;
    }

    public final int c5() {
        return Integer.bitCount(this.y);
    }

    public final void fb(tl other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = 0;
        while (i < 10) {
            int i5 = i + 1;
            if (other.a(i)) {
                s(i, other.y(i));
            }
            i = i5;
        }
    }

    public final int gv() {
        return (this.y & 16) != 0 ? this.n3[4] : Reader.READ_DONE;
    }

    public final int n3() {
        if ((this.y & 2) != 0) {
            return this.n3[1];
        }
        return -1;
    }

    public final tl s(int i, int i5) {
        if (i >= 0) {
            int[] iArr = this.n3;
            if (i < iArr.length) {
                this.y = (1 << i) | this.y;
                iArr[i] = i5;
            }
        }
        return this;
    }

    public final int v(int i) {
        return (this.y & 32) != 0 ? this.n3[5] : i;
    }

    public final int y(int i) {
        return this.n3[i];
    }

    public final int zn() {
        if ((this.y & 128) != 0) {
            return this.n3[7];
        }
        return 65535;
    }
}
