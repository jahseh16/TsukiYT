package a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.lifecycle.s;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class wz implements androidx.lifecycle.t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f24f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static Field f25fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static Field f26s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f27v;
    public Activity y;

    public wz(Activity activity) {
        this.y = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void y() {
        try {
            f27v = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f26s = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f24f = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f25fb = declaredField3;
            declaredField3.setAccessible(true);
            f27v = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.t
    public void onStateChanged(@NonNull ap.mt mtVar, @NonNull s.y yVar) {
        if (yVar != s.y.ON_DESTROY) {
            return;
        }
        if (f27v == 0) {
            y();
        }
        if (f27v == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.y.getSystemService("input_method");
            try {
                Object obj = f25fb.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f26s.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f24f.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (ClassCastException unused2) {
                            }
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
