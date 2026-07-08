package ak1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum n3 {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public static final y y = new y(null);
    private final int httpCode;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n3 y(int i) {
            for (n3 n3Var : n3.values()) {
                if (n3Var.n3() == i) {
                    return n3Var;
                }
            }
            return null;
        }

        public y() {
        }
    }

    n3(int i) {
        this.httpCode = i;
    }

    public final int n3() {
        return this.httpCode;
    }
}
