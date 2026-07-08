package androidx.lifecycle;

import androidx.lifecycle.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements t {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f833v;
    public final ap.fb y;

    public /* synthetic */ class y {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[s.y.values().length];
            try {
                iArr[s.y.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.y.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.y.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.y.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.y.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s.y.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s.y.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            y = iArr;
        }
    }

    public gv(ap.fb defaultLifecycleObserver, t tVar) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.y = defaultLifecycleObserver;
        this.f833v = tVar;
    }

    @Override // androidx.lifecycle.t
    public void onStateChanged(ap.mt source, s.y event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (y.y[event.ordinal()]) {
            case 1:
                this.y.vp(source);
                break;
            case 2:
                this.y.onStart(source);
                break;
            case 3:
                this.y.x0(source);
                break;
            case 4:
                this.y.vl(source);
                break;
            case 5:
                this.y.onStop(source);
                break;
            case 6:
                this.y.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        t tVar = this.f833v;
        if (tVar != null) {
            tVar.onStateChanged(source, event);
        }
    }
}
