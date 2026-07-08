package c5;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class y<I, O> {

    /* JADX INFO: renamed from: c5.y$y, reason: collision with other inner class name */
    public static final class C0046y<T> {
        public final T y;

        public C0046y(T t3) {
            this.y = t3;
        }

        public final T y() {
            return this.y;
        }
    }

    public abstract Intent createIntent(Context context, I i);

    public C0046y<O> getSynchronousResult(Context context, I i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract O parseResult(int i, Intent intent);
}
