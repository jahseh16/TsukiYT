package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes.dex */
public final class InlineList<E> {
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <E> Object m207constructorimpl(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ Object m208constructorimpl$default(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m207constructorimpl(obj);
    }

    /* JADX INFO: renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final Object m209plusFjFbRPM(Object obj, E e4) {
        if (DebugKt.getASSERTIONS_ENABLED() && (e4 instanceof List)) {
            throw new AssertionError();
        }
        if (obj == null) {
            return m207constructorimpl(e4);
        }
        if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(e4);
            return m207constructorimpl(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e4);
        return m207constructorimpl(arrayList);
    }
}
