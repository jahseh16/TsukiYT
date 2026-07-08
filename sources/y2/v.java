package y2;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class v extends gv {
    public float y = -1.0f;

    @Override // y2.gv
    public void y(@NonNull tl tlVar, float f3, float f4, float f5) {
        tlVar.xc(0.0f, f5 * f4, 180.0f, 180.0f - f3);
        double d4 = f5;
        double d5 = f4;
        tlVar.tl((float) (Math.sin(Math.toRadians(f3)) * d4 * d5), (float) (Math.sin(Math.toRadians(90.0f - f3)) * d4 * d5));
    }
}
