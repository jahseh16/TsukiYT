package sg;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class n3 {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final String f7809c5 = "sg.n3";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup.LayoutParams f7810a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public View f7812gv;
    public View n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7813s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ViewGroup f7814v;
    public final View y;
    public int zn = -1;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f7811fb = 0;

    public n3(View view) {
        this.y = view;
        this.f7810a = view.getLayoutParams();
        this.f7812gv = view;
        this.f7813s = view.getId();
    }

    public void gv() {
        ViewGroup viewGroup = this.f7814v;
        if (viewGroup != null) {
            viewGroup.removeView(this.f7812gv);
            this.f7814v.addView(this.y, this.f7811fb, this.f7810a);
            this.f7812gv = this.y;
            this.n3 = null;
            this.zn = -1;
        }
    }

    public final boolean n3() {
        if (this.f7814v != null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) this.y.getParent();
        this.f7814v = viewGroup;
        if (viewGroup == null) {
            Log.e(f7809c5, "the source view have not attach to any view");
            return false;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (this.y == this.f7814v.getChildAt(i)) {
                this.f7811fb = i;
                return true;
            }
        }
        return true;
    }

    public View y() {
        return this.n3;
    }

    public void zn(View view) {
        if (this.f7812gv == view) {
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (n3()) {
            this.n3 = view;
            this.f7814v.removeView(this.f7812gv);
            this.n3.setId(this.f7813s);
            this.f7814v.addView(this.n3, this.f7811fb, this.f7810a);
            this.f7812gv = this.n3;
        }
    }
}
