package c5;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gv extends c5.y<Intent, ActivityResult> {
    public static final y y = new y(null);

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    @Override // c5.y
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Intent input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c5.y
    public ActivityResult parseResult(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
