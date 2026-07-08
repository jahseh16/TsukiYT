package m2;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    @NonNull
    public final View y;
    public boolean n3 = false;
    public int zn = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public n3(y yVar) {
        this.y = (View) yVar;
    }

    public void a(int i) {
        this.zn = i;
    }

    public void gv(@NonNull Bundle bundle) {
        this.n3 = bundle.getBoolean("expanded", false);
        this.zn = bundle.getInt("expandedComponentIdHint", 0);
        if (this.n3) {
            y();
        }
    }

    public int n3() {
        return this.zn;
    }

    @NonNull
    public Bundle v() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.n3);
        bundle.putInt("expandedComponentIdHint", this.zn);
        return bundle;
    }

    public final void y() {
        CoordinatorLayout parent = this.y.getParent();
        if (parent instanceof CoordinatorLayout) {
            parent.a(this.y);
        }
    }

    public boolean zn() {
        return this.n3;
    }
}
