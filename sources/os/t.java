package os;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import r0.mg;
import ur.b;

/* JADX INFO: loaded from: classes.dex */
public interface t {

    public static final class gv extends IOException {
        public final Uri url;

        public gv(Uri uri) {
            this.url = uri;
        }
    }

    public interface n3 {
        void a();

        boolean n3(Uri uri, mg.zn znVar, boolean z);
    }

    public interface v {
        void a8(fb fbVar);
    }

    public interface y {
        t y(nr.fb fbVar, mg mgVar, f fVar);
    }

    public static final class zn extends IOException {
        public final Uri url;

        public zn(Uri uri) {
            this.url = uri;
        }
    }

    void a(n3 n3Var);

    boolean c5(Uri uri, long j);

    @Nullable
    fb f(Uri uri, boolean z);

    boolean fb(Uri uri);

    @Nullable
    s gv();

    void i9() throws IOException;

    boolean isLive();

    void n3(n3 n3Var);

    void s(Uri uri, b.y yVar, v vVar);

    void stop();

    void v(Uri uri);

    void y(Uri uri) throws IOException;

    long zn();
}
