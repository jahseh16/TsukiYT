package yg;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public final Map<n3<?>, Object> y = new LinkedHashMap();

    public interface n3<T> {
    }

    /* JADX INFO: renamed from: yg.y$y, reason: collision with other inner class name */
    public static final class C0200y extends y {
        public static final C0200y n3 = new C0200y();

        @Override // yg.y
        public <T> T y(n3<T> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    public final Map<n3<?>, Object> n3() {
        return this.y;
    }

    public abstract <T> T y(n3<T> n3Var);
}
