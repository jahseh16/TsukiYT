package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i9.t;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends t {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f2585fb;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.n3$n3, reason: collision with other inner class name */
    public class C0062n3 extends BottomSheetBehavior.fb {
        public C0062n3() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.fb
        public void n3(@NonNull View view, int i) {
            if (i == 5) {
                n3.this.wb();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.fb
        public void y(@NonNull View view, float f3) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (t7(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (t7(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    public final void j4(@NonNull BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.f2585fb = z;
        if (bottomSheetBehavior.ct() == 5) {
            wb();
            return;
        }
        if (getDialog() instanceof com.google.android.material.bottomsheet.y) {
            ((com.google.android.material.bottomsheet.y) getDialog()).t();
        }
        bottomSheetBehavior.o(new C0062n3());
        bottomSheetBehavior.tg(5);
    }

    @Override // i9.t, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new com.google.android.material.bottomsheet.y(getContext(), getTheme());
    }

    public final boolean t7(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof com.google.android.material.bottomsheet.y)) {
            return false;
        }
        com.google.android.material.bottomsheet.y yVar = (com.google.android.material.bottomsheet.y) dialog;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorI9 = yVar.i9();
        if (!bottomSheetBehaviorI9.eb() || !yVar.f()) {
            return false;
        }
        j4(bottomSheetBehaviorI9, z);
        return true;
    }

    public final void wb() {
        if (this.f2585fb) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }
}
