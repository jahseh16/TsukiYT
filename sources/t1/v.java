package t1;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class v extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> n3 = new v();
    public final WeakHashMap<Drawable, Integer> y;

    public v() {
        super(Integer.class, "drawableAlphaCompat");
        this.y = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void set(@NonNull Drawable drawable, @NonNull Integer num) {
        drawable.setAlpha(num.intValue());
    }

    @Override // android.util.Property
    @Nullable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Integer get(@NonNull Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }
}
