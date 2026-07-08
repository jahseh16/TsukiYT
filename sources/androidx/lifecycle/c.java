package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public final Handler n3;
    public final wz y;
    public y zn;

    public static final class y implements Runnable {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f824fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final s.y f825v;
        public final wz y;

        public y(wz registry, s.y event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.y = registry;
            this.f825v = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f824fb) {
                return;
            }
            this.y.c5(this.f825v);
            this.f824fb = true;
        }
    }

    public c(ap.mt provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.y = new wz(provider);
        this.n3 = new Handler();
    }

    public final void a(s.y yVar) {
        y yVar2 = this.zn;
        if (yVar2 != null) {
            yVar2.run();
        }
        y yVar3 = new y(this.y, yVar);
        this.zn = yVar3;
        Handler handler = this.n3;
        Intrinsics.checkNotNull(yVar3);
        handler.postAtFrontOfQueue(yVar3);
    }

    public void gv() {
        a(s.y.ON_STOP);
        a(s.y.ON_DESTROY);
    }

    public void n3() {
        a(s.y.ON_START);
    }

    public void v() {
        a(s.y.ON_START);
    }

    public s y() {
        return this.y;
    }

    public void zn() {
        a(s.y.ON_CREATE);
    }
}
