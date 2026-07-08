package t0;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface y {

    public interface n3 {
        void gv(y yVar, c5 c5Var);

        void y(y yVar, c5 c5Var);

        void zn(y yVar, c5 c5Var, c5 c5Var2);
    }

    /* JADX INFO: renamed from: t0.y$y, reason: collision with other inner class name */
    public static class C0174y extends IOException {
        public C0174y(String str) {
            super(str);
        }

        public C0174y(Throwable th) {
            super(th);
        }

        public C0174y(String str, Throwable th) {
            super(str, th);
        }
    }

    void a(c5 c5Var);

    c5 c5(String str, long j, long j4) throws C0174y, InterruptedException;

    void fb(c5 c5Var);

    @Nullable
    c5 gv(String str, long j, long j4) throws C0174y;

    void i9(File file, long j) throws C0174y;

    wz n3(String str);

    void s(String str, xc xcVar) throws C0174y;

    long v(String str, long j, long j4);

    File y(String str, long j, long j4) throws C0174y;

    long zn(String str, long j, long j4);
}
