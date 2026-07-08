package i9;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes.dex */
public class t extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new f(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setupDialog(@NonNull Dialog dialog, int i) {
        if (!(dialog instanceof f)) {
            super.setupDialog(dialog, i);
            return;
        }
        f fVar = (f) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        fVar.gv(1);
    }
}
