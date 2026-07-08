package ur;

import android.os.Handler;
import androidx.annotation.Nullable;
import ft.xb;
import ft.xq;
import java.io.IOException;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public interface mg {

    public static final class n3 extends fh {
        public n3(Object obj) {
            super(obj);
        }

        public n3 zn(Object obj) {
            return new n3(super.y(obj));
        }

        public n3(Object obj, long j) {
            super(obj, j);
        }

        public n3(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public n3(Object obj, int i, int i5, long j) {
            super(obj, i, i5, j);
        }

        public n3(fh fhVar) {
            super(fhVar);
        }
    }

    public interface y {
        y n3(v5.r rVar);

        mg y(xb xbVar);

        y zn(r0.mg mgVar);
    }

    public interface zn {
        void y(mg mgVar, xq xqVar);
    }

    xb c();

    void d(d0 d0Var);

    void ej(zn znVar);

    void f7(b bVar);

    void hw(zn znVar, @Nullable r0.o oVar, gn gnVar);

    void j(com.google.android.exoplayer2.drm.v vVar);

    void k(Handler handler, b bVar);

    void o(Handler handler, com.google.android.exoplayer2.drm.v vVar);

    void oz() throws IOException;

    @Nullable
    xq q9();

    boolean ut();

    void w(zn znVar);

    void y5(zn znVar);

    d0 zn(n3 n3Var, r0.n3 n3Var2, long j);
}
