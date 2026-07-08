package a8;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class i9 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public PorterDuff.Mode f37gv;
    public Drawable.ConstantState n3;
    public int y;
    public ColorStateList zn;

    public i9(@Nullable i9 i9Var) {
        this.zn = null;
        this.f37gv = s.w;
        if (i9Var != null) {
            this.y = i9Var.y;
            this.n3 = i9Var.n3;
            this.zn = i9Var.zn;
            this.f37gv = i9Var.f37gv;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.y;
        Drawable.ConstantState constantState = this.n3;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public boolean y() {
        return this.n3 != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable(@Nullable Resources resources) {
        return new c5(this, resources);
    }
}
