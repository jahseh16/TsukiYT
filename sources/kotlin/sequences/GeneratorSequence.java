package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
final class GeneratorSequence<T> implements Sequence<T> {
    private final Function0<T> getInitialValue;
    private final Function1<T, T> getNextValue;

    /* JADX INFO: renamed from: kotlin.sequences.GeneratorSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {
        private T nextItem;
        private int nextState = -2;
        final /* synthetic */ GeneratorSequence<T> this$0;

        public AnonymousClass1(GeneratorSequence<T> generatorSequence) {
            this.this$0 = generatorSequence;
        }

        private final void calcNext() {
            T t3;
            if (this.nextState == -2) {
                t3 = (T) ((GeneratorSequence) this.this$0).getInitialValue.invoke();
            } else {
                Function1 function1 = ((GeneratorSequence) this.this$0).getNextValue;
                T t5 = this.nextItem;
                Intrinsics.checkNotNull(t5);
                t3 = (T) function1.invoke(t5);
            }
            this.nextItem = t3;
            this.nextState = t3 == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState < 0) {
                calcNext();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.nextState < 0) {
                calcNext();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            T t3 = this.nextItem;
            Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.nextState = -1;
            return t3;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GeneratorSequence(Function0<? extends T> getInitialValue, Function1<? super T, ? extends T> getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.getInitialValue = getInitialValue;
        this.getNextValue = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }
}
