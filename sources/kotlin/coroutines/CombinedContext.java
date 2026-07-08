package kotlin.coroutines;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
public final class CombinedContext implements CoroutineContext, Serializable {
    private final CoroutineContext.Element element;
    private final CoroutineContext left;

    public static final class Serialized implements Serializable {
        public static final Companion Companion = new Companion(null);
        private static final long serialVersionUID = 0;
        private final CoroutineContext[] elements;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public Serialized(CoroutineContext[] elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.elements;
            CoroutineContext coroutineContextPlus = EmptyCoroutineContext.INSTANCE;
            for (CoroutineContext coroutineContext : coroutineContextArr) {
                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
            }
            return coroutineContextPlus;
        }
    }

    public CombinedContext(CoroutineContext left, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.left = left;
        this.element = element;
    }

    private final boolean contains(CoroutineContext.Element element) {
        return Intrinsics.areEqual(get(element.getKey()), element);
    }

    private final boolean containsAll(CombinedContext combinedContext) {
        while (contains(combinedContext.element)) {
            CoroutineContext coroutineContext = combinedContext.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                Intrinsics.checkNotNull(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return contains((CoroutineContext.Element) coroutineContext);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
        return false;
    }

    private final int size() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.left;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toString$lambda$2(String acc, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    private final Object writeReplace() {
        int size = size();
        final CoroutineContext[] coroutineContextArr = new CoroutineContext[size];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(Unit.INSTANCE, new Function2() { // from class: bj1.y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.writeReplace$lambda$3(coroutineContextArr, ref$IntRef, (Unit) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (ref$IntRef.element == size) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeReplace$lambda$3(CoroutineContext[] coroutineContextArr, Ref$IntRef ref$IntRef, Unit unit, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        Intrinsics.checkNotNullParameter(element, "element");
        int i = ref$IntRef.element;
        ref$IntRef.element = i + 1;
        coroutineContextArr[i] = element;
        return Unit.INSTANCE;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.size() != size() || !combinedContext.containsAll(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r3, Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke((Object) this.left.fold(r3, operation), this.element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e4 = (E) combinedContext.element.get(key);
            if (e4 != null) {
                return e4;
            }
            CoroutineContext coroutineContext = combinedContext.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.get(key);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        CoroutineContext coroutineContextMinusKey = this.left.minusKey(key);
        return coroutineContextMinusKey == this.left ? this : coroutineContextMinusKey == EmptyCoroutineContext.INSTANCE ? this.element : new CombinedContext(coroutineContextMinusKey, this.element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.plus(this, coroutineContext);
    }

    public String toString() {
        return '[' + ((String) fold(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, new Function2() { // from class: bj1.n3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.toString$lambda$2((String) obj, (CoroutineContext.Element) obj2);
            }
        })) + ']';
    }
}
