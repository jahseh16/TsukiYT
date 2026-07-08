package kotlinx.coroutines.channels;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ChannelResult<T> {
    public static final Companion Companion = new Companion(null);
    private static final Failed failed = new Failed();
    private final Object holder;

    public static final class Closed extends Failed {
        public final Throwable cause;

        public Closed(Throwable th) {
            this.cause = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Closed) && Intrinsics.areEqual(this.cause, ((Closed) obj).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> Object m198closedJP2dKIU(Throwable th) {
            return ChannelResult.m189constructorimpl(new Closed(th));
        }

        /* JADX INFO: renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> Object m199failurePtdJZtk() {
            return ChannelResult.m189constructorimpl(ChannelResult.failed);
        }

        /* JADX INFO: renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> Object m200successJP2dKIU(E e4) {
            return ChannelResult.m189constructorimpl(e4);
        }

        private Companion() {
        }
    }

    public static class Failed {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ ChannelResult(Object obj) {
        this.holder = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ChannelResult m188boximpl(Object obj) {
        return new ChannelResult(obj);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m189constructorimpl(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m190equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof ChannelResult) && Intrinsics.areEqual(obj, ((ChannelResult) obj2).m197unboximpl());
    }

    /* JADX INFO: renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m191exceptionOrNullimpl(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOrNull-impl, reason: not valid java name */
    public static final T m192getOrNullimpl(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m193hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m194isClosedimpl(Object obj) {
        return obj instanceof Closed;
    }

    /* JADX INFO: renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m195isSuccessimpl(Object obj) {
        return !(obj instanceof Failed);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m196toStringimpl(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m190equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m193hashCodeimpl(this.holder);
    }

    public String toString() {
        return m196toStringimpl(this.holder);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m197unboximpl() {
        return this.holder;
    }
}
