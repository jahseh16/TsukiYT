package b1;

import androidx.annotation.Nullable;
import ft.g;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface ta {

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f1278gv;
        public final byte[] n3;
        public final int y;
        public final int zn;

        public y(int i, byte[] bArr, int i5, int i8) {
            this.y = i;
            this.n3 = bArr;
            this.zn = i5;
            this.f1278gv = i8;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || y.class != obj.getClass()) {
                return false;
            }
            y yVar = (y) obj;
            return this.y == yVar.y && this.zn == yVar.zn && this.f1278gv == yVar.f1278gv && Arrays.equals(this.n3, yVar.n3);
        }

        public int hashCode() {
            return (((((this.y * 31) + Arrays.hashCode(this.n3)) * 31) + this.zn) * 31) + this.f1278gv;
        }
    }

    void a(long j, int i, int i5, int i8, @Nullable y yVar);

    int gv(r0.c5 c5Var, int i, boolean z, int i5) throws IOException;

    void n3(v0.d dVar, int i);

    int v(r0.c5 c5Var, int i, boolean z) throws IOException;

    void y(g gVar);

    void zn(v0.d dVar, int i, int i5);
}
