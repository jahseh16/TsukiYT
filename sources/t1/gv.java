package t1;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.R$id;

/* JADX INFO: loaded from: classes.dex */
public class gv extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> y = new gv("childrenAlpha");

    public gv(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void set(@NonNull ViewGroup viewGroup, @NonNull Float f3) {
        float fFloatValue = f3.floatValue();
        viewGroup.setTag(R$id.rz, f3);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(fFloatValue);
        }
    }

    @Override // android.util.Property
    @NonNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Float get(@NonNull ViewGroup viewGroup) {
        Float f3 = (Float) viewGroup.getTag(R$id.rz);
        return f3 != null ? f3 : Float.valueOf(1.0f);
    }
}
