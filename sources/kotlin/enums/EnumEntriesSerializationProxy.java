package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    private static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    private final Class<E> c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public EnumEntriesSerializationProxy(E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        Intrinsics.checkNotNull(cls);
        this.c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.c.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return EnumEntriesKt.enumEntries(enumConstants);
    }
}
