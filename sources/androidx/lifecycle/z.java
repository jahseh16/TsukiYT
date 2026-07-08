package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class z extends Fragment {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n3 f879v = new n3((DefaultConstructorMarker) null);
    public y y;

    public interface y {
        void onCreate();

        void onResume();

        void onStart();
    }

    public static final void v(Activity activity) {
        f879v.zn(activity);
    }

    public final void a(y yVar) {
        this.y = yVar;
    }

    public final void gv(y yVar) {
        if (yVar != null) {
            yVar.onStart();
        }
    }

    public final void n3(y yVar) {
        if (yVar != null) {
            yVar.onCreate();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        n3(this.y);
        y(s.y.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        y(s.y.ON_DESTROY);
        this.y = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        y(s.y.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        zn(this.y);
        y(s.y.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        gv(this.y);
        y(s.y.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        y(s.y.ON_STOP);
    }

    public final void y(s.y yVar) {
        if (Build.VERSION.SDK_INT < 29) {
            n3 n3Var = f879v;
            Activity activity = getActivity();
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            n3Var.y(activity, yVar);
        }
    }

    public final void zn(y yVar) {
        if (yVar != null) {
            yVar.onResume();
        }
    }
}
