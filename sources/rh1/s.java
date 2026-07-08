package rh1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final void a(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        v(i, 0, context != null ? context.getApplicationContext() : null);
    }

    public static final void c5(CharSequence text, int i, Context context) {
        Application applicationZn;
        Intrinsics.checkNotNullParameter(text, "text");
        if (context == null || (applicationZn = n3.zn(context)) == null) {
            return;
        }
        Toast.makeText(i9(applicationZn), text, i).show();
    }

    public static final void fb(View view, CharSequence text) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Context context = view.getContext();
        c5(text, 0, context != null ? context.getApplicationContext() : null);
    }

    public static final Toast gv(Context context, CharSequence text, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Toast toastMakeText = Toast.makeText(i9(context), text, i);
        Intrinsics.checkNotNullExpressionValue(toastMakeText, "makeText(...)");
        return toastMakeText;
    }

    public static final Context i9(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (sh1.n3.n3.y() && !(context instanceof sh1.n3)) ? new sh1.n3(context) : context;
    }

    public static final void n3(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        v(i, 1, context != null ? context.getApplicationContext() : null);
    }

    public static final void s(Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Context context = fragment.getContext();
        v(i, 0, context != null ? context.getApplicationContext() : null);
    }

    public static final void v(int i, int i5, Context context) {
        Application applicationZn;
        if (context == null || (applicationZn = n3.zn(context)) == null) {
            return;
        }
        Toast.makeText(i9(applicationZn), i, i5).show();
    }

    public static final void y(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        v(i, 1, activity.getApplicationContext());
    }

    public static final Toast zn(Context context, int i, int i5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Toast toastMakeText = Toast.makeText(i9(context), i, i5);
        Intrinsics.checkNotNullExpressionValue(toastMakeText, "makeText(...)");
        return toastMakeText;
    }
}
