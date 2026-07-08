package o2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class tl extends ImageButton {
    public int y;

    public tl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int getUserSetVisibility() {
        return this.y;
    }

    public final void n3(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.y = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        n3(i, true);
    }

    public tl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = getVisibility();
    }
}
