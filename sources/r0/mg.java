package r0;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface mg {

    public static final class n3 {
        public final long n3;
        public final int y;

        public n3(int i, long j) {
            v0.y.y(j >= 0);
            this.y = i;
            this.n3 = j;
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f7512gv;
        public final int n3;
        public final int y;
        public final int zn;

        public y(int i, int i5, int i8, int i10) {
            this.y = i;
            this.n3 = i5;
            this.zn = i8;
            this.f7512gv = i10;
        }

        public boolean y(int i) {
            if (i == 1) {
                if (this.y - this.n3 <= 1) {
                    return false;
                }
            } else if (this.zn - this.f7512gv <= 1) {
                return false;
            }
            return true;
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f7513gv;
        public final ur.c n3;
        public final ur.i4 y;
        public final IOException zn;

        public zn(ur.i4 i4Var, ur.c cVar, IOException iOException, int i) {
            this.y = i4Var;
            this.n3 = cVar;
            this.zn = iOException;
            this.f7513gv = i;
        }
    }

    void gv(long j);

    @Nullable
    n3 n3(y yVar, zn znVar);

    long y(zn znVar);

    int zn(int i);
}
