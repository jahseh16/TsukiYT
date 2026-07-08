package a;

import android.view.View;
import androidx.activity.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final void y(View view, co onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.n3, onBackPressedDispatcherOwner);
    }
}
