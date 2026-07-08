package j5;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class fb<T> extends a<T> {
    public final Object zn;

    public fb(int i) {
        super(i);
        this.zn = new Object();
    }

    @Override // j5.a, j5.v
    public T n3() {
        T t3;
        synchronized (this.zn) {
            t3 = (T) super.n3();
        }
        return t3;
    }

    @Override // j5.a, j5.v
    public boolean y(@NonNull T t3) {
        boolean zY;
        synchronized (this.zn) {
            zY = super.y(t3);
        }
        return zY;
    }
}
