package ak1;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface t {
    public static final y y = y.y;
    public static final t n3 = new y.C0005y();

    public static final class y {
        public static final /* synthetic */ y y = new y();

        /* JADX INFO: renamed from: ak1.t$y$y, reason: collision with other inner class name */
        public static final class C0005y implements t {
            @Override // ak1.t
            public boolean gv(int i, List<zn> responseHeaders, boolean z) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // ak1.t
            public boolean n3(int i, hk1.fb source, int i5, boolean z) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i5);
                return true;
            }

            @Override // ak1.t
            public void y(int i, n3 errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }

            @Override // ak1.t
            public boolean zn(int i, List<zn> requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }
        }
    }

    boolean gv(int i, List<zn> list, boolean z);

    boolean n3(int i, hk1.fb fbVar, int i5, boolean z) throws IOException;

    void y(int i, n3 n3Var);

    boolean zn(int i, List<zn> list);
}
