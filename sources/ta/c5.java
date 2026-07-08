package ta;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.s;
import androidx.lifecycle.wz;
import qn.p;

/* JADX INFO: loaded from: classes.dex */
public class c5 extends Activity implements ap.mt, p.y {
    private x4.s<Class<? extends y>, y> mExtraDataMap = new x4.s<>();
    private wz mLifecycleRegistry = new wz(this);

    @Deprecated
    public static class y {
    }

    private static boolean shouldSkipDump(@Nullable String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            String str = strArr[0];
            str.hashCode();
            switch (str) {
                case "--translation":
                    return Build.VERSION.SDK_INT >= 31;
                case "--dump-dumpable":
                case "--list-dumpables":
                    return Build.VERSION.SDK_INT >= 33;
                case "--contentcapture":
                    return Build.VERSION.SDK_INT >= 29;
                case "--autofill":
                    return Build.VERSION.SDK_INT >= 26;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !qn.p.gv(decorView, keyEvent)) {
            return qn.p.v(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !qn.p.gv(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends y> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    @NonNull
    public androidx.lifecycle.s getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.z.v(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        this.mLifecycleRegistry.f(s.n3.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(y yVar) {
        this.mExtraDataMap.put((Class<? extends y>) yVar.getClass(), yVar);
    }

    public final boolean shouldDumpInternalState(@Nullable String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    public boolean superDispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
