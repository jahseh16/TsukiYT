package l2;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
import com.google.android.material.R$attr;
import t2.n3;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final float f6111gv;
    public final int n3;
    public final boolean y;
    public final int zn;

    public y(@NonNull Context context) {
        this.y = n3.n3(context, R$attr.f2173p, false);
        this.n3 = g2.y.n3(context, R$attr.w, 0);
        this.zn = g2.y.n3(context, R$attr.f2181wz, 0);
        this.f6111gv = context.getResources().getDisplayMetrics().density;
    }

    public boolean gv() {
        return this.y;
    }

    public int n3(int i, float f3) {
        float fY = y(f3);
        return ud.y.i9(g2.y.s(ud.y.i9(i, 255), this.n3, fY), Color.alpha(i));
    }

    public final boolean v(int i) {
        return ud.y.i9(i, 255) == this.zn;
    }

    public float y(float f3) {
        if (this.f6111gv <= 0.0f || f3 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f3 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int zn(int i, float f3) {
        return (this.y && v(i)) ? n3(i, f3) : i;
    }
}
