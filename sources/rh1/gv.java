package rh1;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gv {
    public static final FragmentManager y(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        AppCompatActivity appCompatActivityN3 = n3.n3(context);
        if (appCompatActivityN3 != null) {
            return appCompatActivityN3.getSupportFragmentManager();
        }
        return null;
    }
}
