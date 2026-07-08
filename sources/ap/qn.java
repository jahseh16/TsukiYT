package ap;

import android.view.View;
import androidx.lifecycle.runtime.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
public final class qn {

    public static final class n3 extends Lambda implements Function1<View, mt> {
        public static final n3 y = new n3();

        public n3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final mt invoke(View viewParent) {
            Intrinsics.checkNotNullParameter(viewParent, "viewParent");
            Object tag = viewParent.getTag(R$id.y);
            if (tag instanceof mt) {
                return (mt) tag;
            }
            return null;
        }
    }

    public static final class y extends Lambda implements Function1<View, View> {
        public static final y y = new y();

        public y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final View invoke(View currentView) {
            Intrinsics.checkNotNullParameter(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    public static final void n3(View view, mt mtVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R$id.y, mtVar);
    }

    public static final mt y(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (mt) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(view, y.y), n3.y));
    }
}
