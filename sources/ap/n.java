package ap;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class n<T> extends d0<T> {
    public mt.n3<androidx.lifecycle.xc<?>, y<?>> y = new mt.n3<>();

    public static class y<V> implements fh<V> {
        public final fh<? super V> n3;
        public final androidx.lifecycle.xc<V> y;
        public int zn = -1;

        public y(androidx.lifecycle.xc<V> xcVar, fh<? super V> fhVar) {
            this.y = xcVar;
            this.n3 = fhVar;
        }

        public void n3() {
            this.y.removeObserver(this);
        }

        @Override // ap.fh
        public void onChanged(@Nullable V v6) {
            if (this.zn != this.y.getVersion()) {
                this.zn = this.y.getVersion();
                this.n3.onChanged(v6);
            }
        }

        public void y() {
            this.y.observeForever(this);
        }
    }

    public <S> void n3(@NonNull androidx.lifecycle.xc<S> xcVar) {
        y<?> yVarFb = this.y.fb(xcVar);
        if (yVarFb != null) {
            yVarFb.n3();
        }
    }

    @Override // androidx.lifecycle.xc
    public void onActive() {
        Iterator<Map.Entry<androidx.lifecycle.xc<?>, y<?>>> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().getValue().y();
        }
    }

    @Override // androidx.lifecycle.xc
    public void onInactive() {
        Iterator<Map.Entry<androidx.lifecycle.xc<?>, y<?>>> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().getValue().n3();
        }
    }

    public <S> void y(@NonNull androidx.lifecycle.xc<S> xcVar, @NonNull fh<? super S> fhVar) {
        if (xcVar == null) {
            throw new NullPointerException("source cannot be null");
        }
        y<?> yVar = new y<>(xcVar, fhVar);
        y<?> yVarA = this.y.a(xcVar, yVar);
        if (yVarA != null && yVarA.n3 != fhVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (yVarA == null && hasActiveObservers()) {
            yVar.y();
        }
    }
}
