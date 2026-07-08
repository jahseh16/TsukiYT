package w2;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class f3 implements n {
    public final ViewOverlay y;

    public f3(@NonNull View view) {
        this.y = view.getOverlay();
    }

    @Override // w2.n
    public void n3(@NonNull Drawable drawable) {
        this.y.remove(drawable);
    }

    @Override // w2.n
    public void y(@NonNull Drawable drawable) {
        this.y.add(drawable);
    }
}
