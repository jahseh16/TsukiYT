package zo;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class gn {
    public static final gn n3;

    @Nullable
    public final y y;

    public static final class y {
        public static final y n3 = new y(LogSessionId.LOG_SESSION_ID_NONE);
        public final LogSessionId y;

        public y(LogSessionId logSessionId) {
            this.y = logSessionId;
        }
    }

    static {
        n3 = v0.ut.y < 31 ? new gn() : new gn(y.n3);
    }

    public gn() {
        this((y) null);
        v0.y.fb(v0.ut.y < 31);
    }

    public LogSessionId y() {
        return ((y) v0.y.v(this.y)).y;
    }

    public gn(LogSessionId logSessionId) {
        this(new y(logSessionId));
    }

    public gn(@Nullable y yVar) {
        this.y = yVar;
    }
}
