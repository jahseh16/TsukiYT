package ft;

import androidx.annotation.Nullable;
import ft.h;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface hk extends h.n3 {

    public interface y {
        void n3();

        void y();
    }

    boolean a();

    boolean c5();

    void co(long j, long j4) throws p;

    void fb();

    String getName();

    int getState();

    @Nullable
    ur.en getStream();

    ic gv();

    @Nullable
    v0.i4 i4();

    void i9();

    boolean isReady();

    void p(g[] gVarArr, ur.en enVar, long j, long j4) throws p;

    void r(long j) throws p;

    int s();

    void start() throws p;

    void stop();

    void t(gn gnVar, g[] gVarArr, ur.en enVar, long j, boolean z, boolean z5, long j4, long j7) throws p;

    void tl() throws IOException;

    void w(float f3, float f4) throws p;

    boolean wz();

    void x4(int i, zo.gn gnVar);

    void y();

    long z();
}
