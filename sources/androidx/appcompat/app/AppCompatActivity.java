package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import ap.o;
import ap.qn;
import i9.gv;
import i9.zn;
import qk.a;
import qk.zn;
import ta.f3;
import ta.t;
import w.gq;
import wz.n3;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements zn, f3.y {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private gv mDelegate;
    private Resources mResources;

    public class n3 implements fb.n3 {
        public n3() {
        }

        @Override // fb.n3
        public void y(@NonNull Context context) {
            gv delegate = AppCompatActivity.this.getDelegate();
            delegate.w();
            delegate.co(AppCompatActivity.this.getSavedStateRegistry().n3(AppCompatActivity.DELEGATE_TAG));
        }
    }

    public class y implements zn.InterfaceC0151zn {
        public y() {
        }

        @Override // qk.zn.InterfaceC0151zn
        @NonNull
        public Bundle y() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().i4(bundle);
            return bundle;
        }
    }

    public AppCompatActivity() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().s(DELEGATE_TAG, new y());
        addOnContextAvailableListener(new n3());
    }

    private void initViewTreeOwners() {
        qn.n3(getWindow().getDecorView(), this);
        o.y(getWindow().getDecorView(), this);
        a.y(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // a.a, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().gv(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().a(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        i9.y supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // ta.c5, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        i9.y supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.xc(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().i9(i);
    }

    @NonNull
    public gv getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = gv.fb(this, this);
        }
        return this.mDelegate;
    }

    @Nullable
    public i9.n3 getDrawerToggleDelegate() {
        return getDelegate().t();
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return getDelegate().wz();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && gq.n3()) {
            this.mResources = new gq(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    @Nullable
    public i9.y getSupportActionBar() {
        return getDelegate().xc();
    }

    @Override // ta.f3.y
    @Nullable
    public Intent getSupportParentActivityIntent() {
        return t.y(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().p();
    }

    @Override // a.a, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().mt(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull f3 f3Var) {
        f3Var.zn(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().z();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, a.a, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        i9.y supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.c5() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // a.a, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NonNull Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().r(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().x4();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().f3();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().n();
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        f3 f3VarV = f3.v(this);
        onCreateSupportNavigateUpTaskStack(f3VarV);
        onPrepareSupportNavigateUpTaskStack(f3VarV);
        f3VarV.fb();
        try {
            ta.n3.n3(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().ej(charSequence);
    }

    @Override // i9.zn
    @Nullable
    public wz.n3 onWindowStartingSupportActionMode(@NonNull n3.y yVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        i9.y supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.w()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // a.a, android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().rz(i);
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        getDelegate().d(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().z6(i);
    }

    @Nullable
    public wz.n3 startSupportActionMode(@NonNull n3.y yVar) {
        return getDelegate().ud(yVar);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().p();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        t.v(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().fh(i);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return t.a(this, intent);
    }

    public AppCompatActivity(int i) {
        super(i);
        initDelegate();
    }

    @Override // a.a, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().mg(view);
    }

    @Override // a.a, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().ta(view, layoutParams);
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull f3 f3Var) {
    }

    @Override // i9.zn
    public void onSupportActionModeFinished(@NonNull wz.n3 n3Var) {
    }

    @Override // i9.zn
    public void onSupportActionModeStarted(@NonNull wz.n3 n3Var) {
    }
}
