package n0;

import androidx.annotation.Nullable;
import ft.g;
import ft.xq;
import java.util.List;
import ur.mg;
import ur.rs;

/* JADX INFO: loaded from: classes.dex */
public interface c extends rz {

    public interface n3 {
        c[] y(y[] yVarArr, r0.a aVar, mg.n3 n3Var, xq xqVar);
    }

    public static final class y {
        public final int[] n3;
        public final rs y;
        public final int zn;

        public y(rs rsVar, int... iArr) {
            this(rsVar, iArr, 0);
        }

        public y(rs rsVar, int[] iArr, int i) {
            if (iArr.length == 0) {
                v0.r.gv("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.y = rsVar;
            this.n3 = iArr;
            this.zn = i;
        }
    }

    void c5(float f3);

    int co();

    void f();

    void fb();

    boolean gv(int i, long j);

    @Nullable
    Object i9();

    g mt();

    int n3();

    int p();

    void r();

    boolean w(long j, h6.a aVar, List<? extends h6.wz> list);

    void wz(boolean z);

    int xc(long j, List<? extends h6.wz> list);

    void y();

    void z(long j, long j4, long j7, List<? extends h6.wz> list, h6.xc[] xcVarArr);

    boolean zn(int i, long j);
}
