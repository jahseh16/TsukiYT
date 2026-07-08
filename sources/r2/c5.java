package r2;

import android.animation.Animator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class c5<T extends Animator> {
    public final float[] n3;
    public i9 y;
    public final int[] zn;

    public c5(int i) {
        this.n3 = new float[i * 2];
        this.zn = new int[i];
    }

    public abstract void a();

    public abstract void fb();

    public abstract void gv(@NonNull x5.n3 n3Var);

    public float n3(int i, int i5, int i8) {
        return (i - i5) / i8;
    }

    public abstract void s();

    public void v(@NonNull i9 i9Var) {
        this.y = i9Var;
    }

    public abstract void y();

    public abstract void zn();
}
