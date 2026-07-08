package y2;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class i9 extends gv {
    public float y = -1.0f;

    @Override // y2.gv
    public void y(@NonNull tl tlVar, float f3, float f4, float f5) {
        tlVar.xc(0.0f, f5 * f4, 180.0f, 180.0f - f3);
        float f7 = f5 * 2.0f * f4;
        tlVar.y(0.0f, 0.0f, f7, f7, 180.0f, f3);
    }
}
