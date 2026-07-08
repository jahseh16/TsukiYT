package fb;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public volatile Context n3;
    public final Set<n3> y = new CopyOnWriteArraySet();

    public final Context gv() {
        return this.n3;
    }

    public final void n3() {
        this.n3 = null;
    }

    public final void v(n3 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.y.remove(listener);
    }

    public final void y(n3 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.n3;
        if (context != null) {
            listener.y(context);
        }
        this.y.add(listener);
    }

    public final void zn(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.n3 = context;
        Iterator<n3> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().y(context);
        }
    }
}
