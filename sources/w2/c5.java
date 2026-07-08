package w2;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public class c5 implements TypeEvaluator<Rect> {
    public Rect y;

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f3, Rect rect, Rect rect2) {
        int i = rect.left + ((int) ((rect2.left - r0) * f3));
        int i5 = rect.top + ((int) ((rect2.top - r1) * f3));
        int i8 = rect.right + ((int) ((rect2.right - r2) * f3));
        int i10 = rect.bottom + ((int) ((rect2.bottom - r6) * f3));
        Rect rect3 = this.y;
        if (rect3 == null) {
            return new Rect(i, i5, i8, i10);
        }
        rect3.set(i, i5, i8, i10);
        return this.y;
    }
}
