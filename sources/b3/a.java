package b3;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public class a extends zn {
    public a(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override // b3.zn
    public void y() {
        this.y.setEndIconOnClickListener(null);
        this.y.setEndIconDrawable((Drawable) null);
        this.y.setEndIconContentDescription((CharSequence) null);
    }
}
