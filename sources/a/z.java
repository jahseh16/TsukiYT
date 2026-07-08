package a;

import android.view.View;
import androidx.activity.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static final void y(View view, tl fullyDrawnReporterOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.y, fullyDrawnReporterOwner);
    }
}
