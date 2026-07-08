package a2;

import android.graphics.Canvas;
import android.os.Build;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static int y(@NonNull Canvas canvas, float f3, float f4, float f5, float f7, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f3, f4, f5, f7, i) : canvas.saveLayerAlpha(f3, f4, f5, f7, i, 31);
    }
}
