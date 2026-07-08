package y2;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c5 implements zn {
    public final float y;

    public c5(float f3) {
        this.y = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5) && this.y == ((c5) obj).y;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.y)});
    }

    @Override // y2.zn
    public float y(@NonNull RectF rectF) {
        return this.y * rectF.height();
    }
}
