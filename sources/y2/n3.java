package y2;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements zn {
    public final float n3;
    public final zn y;

    public n3(float f3, @NonNull zn znVar) {
        while (znVar instanceof n3) {
            znVar = ((n3) znVar).y;
            f3 += ((n3) znVar).n3;
        }
        this.y = znVar;
        this.n3 = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.y.equals(n3Var.y) && this.n3 == n3Var.n3;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.y, Float.valueOf(this.n3)});
    }

    @Override // y2.zn
    public float y(@NonNull RectF rectF) {
        return Math.max(0.0f, this.y.y(rectF) + this.n3);
    }
}
