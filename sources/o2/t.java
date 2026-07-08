package o2;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import qn.d;
import qn.rs;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class t {

    public static class y implements d {
        public final /* synthetic */ gv n3;
        public final /* synthetic */ zn y;

        public y(zn znVar, gv gvVar) {
            this.y = znVar;
            this.n3 = gvVar;
        }

        public rs y(View view, rs rsVar) {
            return this.y.y(view, rsVar, new gv(this.n3));
        }
    }

    public interface zn {
        rs y(View view, rs rsVar, gv gvVar);
    }

    public static void a(@NonNull View view) {
        if (ut.ut(view)) {
            ut.yg(view);
        } else {
            view.addOnAttachStateChangeListener(new n3());
        }
    }

    public static boolean gv(View view) {
        return ut.ta(view) == 1;
    }

    public static float n3(@NonNull Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static PorterDuff.Mode v(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void y(@NonNull View view, @NonNull zn znVar) {
        ut.ad(view, new y(znVar, new gv(ut.a8(view), view.getPaddingTop(), ut.ud(view), view.getPaddingBottom())));
        a(view);
    }

    public static float zn(@NonNull View view) {
        float fN = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fN += ut.n((View) parent);
        }
        return fN;
    }

    public static class gv {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f7097gv;
        public int n3;
        public int y;
        public int zn;

        public gv(int i, int i5, int i8, int i10) {
            this.y = i;
            this.n3 = i5;
            this.zn = i8;
            this.f7097gv = i10;
        }

        public gv(@NonNull gv gvVar) {
            this.y = gvVar.y;
            this.n3 = gvVar.n3;
            this.zn = gvVar.zn;
            this.f7097gv = gvVar.f7097gv;
        }
    }

    public static class n3 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
            view.removeOnAttachStateChangeListener(this);
            ut.yg(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
