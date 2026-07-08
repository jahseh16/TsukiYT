package x;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface n3 extends MenuItem {
    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @Nullable
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @Nullable
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @Nullable
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @Nullable
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @Nullable
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @NonNull
    n3 n3(@Nullable qn.n3 n3Var);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setActionView(@Nullable View view);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    @NonNull
    n3 setContentDescription(@Nullable CharSequence charSequence);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintList(@Nullable ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintMode(@Nullable PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShortcut(char c, char c3, int i, int i5);

    @Override // android.view.MenuItem
    void setShowAsAction(int i);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShowAsActionFlags(int i);

    @Override // android.view.MenuItem
    @NonNull
    n3 setTooltipText(@Nullable CharSequence charSequence);

    @Nullable
    qn.n3 y();
}
