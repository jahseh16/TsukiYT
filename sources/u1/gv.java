package u1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public class gv<V extends View> extends CoordinatorLayout.zn<V> {
    public int n3;
    public v y;
    public int zn;

    public gv() {
        this.n3 = 0;
        this.zn = 0;
    }

    public void d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, int i) {
        coordinatorLayout.ud(v6, i);
    }

    public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, int i) {
        d(coordinatorLayout, v6, i);
        if (this.y == null) {
            this.y = new v(v6);
        }
        this.y.zn();
        this.y.y();
        int i5 = this.n3;
        if (i5 != 0) {
            this.y.v(i5);
            this.n3 = 0;
        }
        int i8 = this.zn;
        if (i8 == 0) {
            return true;
        }
        this.y.gv(i8);
        this.zn = 0;
        return true;
    }

    public int ta() {
        v vVar = this.y;
        if (vVar != null) {
            return vVar.n3();
        }
        return 0;
    }

    public boolean z6(int i) {
        v vVar = this.y;
        if (vVar != null) {
            return vVar.v(i);
        }
        this.n3 = i;
        return false;
    }

    public gv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n3 = 0;
        this.zn = 0;
    }
}
