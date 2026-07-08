package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public AtomicReference<Object> y = new AtomicReference<>();

    public enum n3 {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean n3(n3 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public enum y {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0015y Companion = new C0015y(null);

        public /* synthetic */ class n3 {
            public static final /* synthetic */ int[] y;

            static {
                int[] iArr = new int[y.values().length];
                try {
                    iArr[y.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[y.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[y.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[y.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[y.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[y.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                y = iArr;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.s$y$y, reason: collision with other inner class name */
        public static final class C0015y {

            /* JADX INFO: renamed from: androidx.lifecycle.s$y$y$y, reason: collision with other inner class name */
            public /* synthetic */ class C0016y {
                public static final /* synthetic */ int[] y;

                static {
                    int[] iArr = new int[n3.values().length];
                    try {
                        iArr[n3.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[n3.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[n3.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[n3.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[n3.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    y = iArr;
                }
            }

            public /* synthetic */ C0015y(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final y n3(n3 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C0016y.y[state.ordinal()];
                if (i == 1) {
                    return y.ON_START;
                }
                if (i == 2) {
                    return y.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return y.ON_CREATE;
            }

            public final y y(n3 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C0016y.y[state.ordinal()];
                if (i == 1) {
                    return y.ON_DESTROY;
                }
                if (i == 2) {
                    return y.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return y.ON_PAUSE;
            }

            public final y zn(n3 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C0016y.y[state.ordinal()];
                if (i == 1) {
                    return y.ON_CREATE;
                }
                if (i == 2) {
                    return y.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return y.ON_RESUME;
            }

            public C0015y() {
            }
        }

        public static final y a(n3 n3Var) {
            return Companion.zn(n3Var);
        }

        public static final y n3(n3 n3Var) {
            return Companion.y(n3Var);
        }

        public final n3 gv() {
            switch (n3.y[ordinal()]) {
                case 1:
                case 2:
                    return n3.CREATED;
                case 3:
                case 4:
                    return n3.STARTED;
                case 5:
                    return n3.RESUMED;
                case 6:
                    return n3.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public abstract void gv(ap.p pVar);

    public abstract n3 n3();

    public abstract void y(ap.p pVar);

    public final AtomicReference<Object> zn() {
        return this.y;
    }
}
