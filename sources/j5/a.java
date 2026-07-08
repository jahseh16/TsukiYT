package j5;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class a<T> implements v<T> {
    public int n3;
    public final Object[] y;

    public a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.y = new Object[i];
    }

    @Override // j5.v
    public T n3() {
        int i = this.n3;
        if (i <= 0) {
            return null;
        }
        int i5 = i - 1;
        Object[] objArr = this.y;
        T t3 = (T) objArr[i5];
        objArr[i5] = null;
        this.n3 = i - 1;
        return t3;
    }

    @Override // j5.v
    public boolean y(@NonNull T t3) {
        if (zn(t3)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.n3;
        Object[] objArr = this.y;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t3;
        this.n3 = i + 1;
        return true;
    }

    public final boolean zn(@NonNull T t3) {
        for (int i = 0; i < this.n3; i++) {
            if (this.y[i] == t3) {
                return true;
            }
        }
        return false;
    }
}
