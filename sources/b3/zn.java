package b3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn {
    public Context n3;
    public TextInputLayout y;
    public CheckableImageButton zn;

    public zn(@NonNull TextInputLayout textInputLayout) {
        this.y = textInputLayout;
        this.n3 = textInputLayout.getContext();
        this.zn = textInputLayout.getEndIconView();
    }

    public boolean gv() {
        return false;
    }

    public boolean n3(int i) {
        return true;
    }

    public abstract void y();

    public void zn(boolean z) {
    }
}
