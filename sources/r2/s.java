package r2;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import r2.n3;

/* JADX INFO: loaded from: classes.dex */
public abstract class s<S extends n3> {
    public fb n3;
    public S y;

    public s(S s3) {
        this.y = s3;
    }

    public void a(@NonNull fb fbVar) {
        this.n3 = fbVar;
    }

    public void fb(@NonNull Canvas canvas, float f3) {
        this.y.v();
        y(canvas, f3);
    }

    public abstract int gv();

    public abstract void n3(@NonNull Canvas canvas, @NonNull Paint paint, float f3, float f4, int i);

    public abstract int v();

    public abstract void y(@NonNull Canvas canvas, float f3);

    public abstract void zn(@NonNull Canvas canvas, @NonNull Paint paint);
}
