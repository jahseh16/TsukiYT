package mp;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class n3 {
    @Nullable
    public static <T extends View> T y(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            T t3 = (T) viewGroup.getChildAt(i5).findViewById(i);
            if (t3 != null) {
                return t3;
            }
        }
        return null;
    }
}
