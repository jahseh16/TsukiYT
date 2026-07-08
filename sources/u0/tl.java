package u0;

import android.app.Activity;
import android.view.View;
import androidx.navigation.R$id;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
public final class tl {
    public static final tl y = new tl();

    public static final class n3 extends Lambda implements Function1<View, androidx.navigation.gv> {
        public static final n3 y = new n3();

        public n3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.gv invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return tl.y.v(it);
        }
    }

    public static final class y extends Lambda implements Function1<View, View> {
        public static final y y = new y();

        public y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final View invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    public static final void a(View view, androidx.navigation.gv gvVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(R$id.y, gvVar);
    }

    public static final androidx.navigation.gv n3(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewS = ta.n3.s(activity, i);
        Intrinsics.checkNotNullExpressionValue(viewS, "requireViewById<View>(activity, viewId)");
        androidx.navigation.gv gvVarGv = y.gv(viewS);
        if (gvVarGv != null) {
            return gvVarGv;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i);
    }

    public static final androidx.navigation.gv zn(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        androidx.navigation.gv gvVarGv = y.gv(view);
        if (gvVarGv != null) {
            return gvVarGv;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public final androidx.navigation.gv gv(View view) {
        return (androidx.navigation.gv) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(view, y.y), n3.y));
    }

    public final androidx.navigation.gv v(View view) {
        Object tag = view.getTag(R$id.y);
        if (tag instanceof WeakReference) {
            return (androidx.navigation.gv) ((WeakReference) tag).get();
        }
        if (tag instanceof androidx.navigation.gv) {
            return (androidx.navigation.gv) tag;
        }
        return null;
    }
}
