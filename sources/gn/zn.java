package gn;

import androidx.annotation.Nullable;
import n7.y;

/* JADX INFO: loaded from: classes.dex */
public class zn<T> {

    @Nullable
    public y<?, ?> n3;
    public final n3<T> y;

    @Nullable
    public T zn;

    public zn() {
        this.y = new n3<>();
        this.zn = null;
    }

    @Nullable
    public final T n3(float f3, float f4, T t3, T t5, float f5, float f7, float f8) {
        return y(this.y.s(f3, f4, t3, t5, f5, f7, f8));
    }

    @Nullable
    public T y(n3<T> n3Var) {
        return this.zn;
    }

    public final void zn(@Nullable y<?, ?> yVar) {
        this.n3 = yVar;
    }

    public zn(@Nullable T t3) {
        this.y = new n3<>();
        this.zn = t3;
    }
}
