package w2;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static <T> ObjectAnimator y(T t3, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t3, property, (TypeConverter) null, path);
    }
}
