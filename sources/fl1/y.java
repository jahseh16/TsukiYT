package fl1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static final C0090y n3 = new C0090y(null);
    public final List<Object> y;

    /* JADX INFO: renamed from: fl1.y$y, reason: collision with other inner class name */
    public static final class C0090y {
        public /* synthetic */ C0090y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0090y() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public <T> T n3(KClass<?> clazz) {
        T t3;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Iterator<T> it = this.y.iterator();
        do {
            t3 = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (clazz.isInstance(next)) {
                t3 = next;
            }
        } while (t3 == null);
        return t3;
    }

    public String toString() {
        return Intrinsics.stringPlus("DefinitionParameters", CollectionsKt.toList(this.y));
    }

    public final y y(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.y.add(value);
        return this;
    }

    public y(List<Object> _values) {
        Intrinsics.checkNotNullParameter(_values, "_values");
        this.y = _values;
    }

    public /* synthetic */ y(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
