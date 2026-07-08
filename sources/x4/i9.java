package x4;

import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class i9 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class n3<T> implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c5 f9084v;
        public int y;

        public n3(c5<T> c5Var) {
            this.f9084v = c5Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.y < this.f9084v.w();
        }

        @Override // java.util.Iterator
        public T next() {
            c5 c5Var = this.f9084v;
            int i = this.y;
            this.y = i + 1;
            return (T) c5Var.p(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class y extends IntIterator {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c5 f9085v;
        public int y;

        public y(c5<T> c5Var) {
            this.f9085v = c5Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.y < this.f9085v.w();
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            c5 c5Var = this.f9085v;
            int i = this.y;
            this.y = i + 1;
            return c5Var.t(i);
        }
    }

    public static final <T> Iterator<T> n3(c5<T> receiver$0) {
        Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new n3(receiver$0);
    }

    public static final <T> IntIterator y(c5<T> receiver$0) {
        Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new y(receiver$0);
    }
}
