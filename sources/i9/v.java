package i9;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$color;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.c5;
import androidx.appcompat.view.menu.v;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.s;
import ej.s;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import qn.d;
import qn.dm;
import qn.p;
import qn.rs;
import qn.ut;
import qn.xg;
import w.ad;
import w.gq;
import w.vp;
import w.y5;
import wz.n3;
import x.y;
import xc.zn;

/* JADX INFO: loaded from: classes.dex */
public class v extends i9.gv implements v.y, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public boolean f5602ap;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5603b;
    public z c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public i9.y f5604co;
    public boolean ct;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PopupWindow f5605d;
    public wz.n3 d0;
    public boolean dm;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xc f5606e;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public int f5607eb;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public Runnable f5608ej;
    public boolean en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f5609f;
    public y5 f3;
    public boolean f7;
    public ActionBarContextView fh;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i9.wz f5610g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public Rect f5611g3;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public boolean f5612hw;
    public boolean j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public ViewGroup f5613j5;
    public boolean jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5614k;

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    public boolean f5615kp;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public int f5616lc;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i9.tl f5617m;
    public fb n;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public boolean f5618nf;
    public View o;
    public boolean o4;
    public boolean oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i9.zn f5619p;
    public boolean q9;
    public TextView qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f5620r;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f5621ra;

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public Rect f5622rb;
    public boolean rs;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f5623s;
    public xc s8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Window f5624t;
    public co[] u;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public boolean f5625ut;
    public tl w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public qn.y5 f5626x;
    public boolean xg;
    public co y5;

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public final Runnable f5627yc;

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public int f5628yg;
    public MenuInflater z;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final x4.s<String, Integer> f5601u0 = new x4.s<>();

    /* JADX INFO: renamed from: bk, reason: collision with root package name */
    public static final boolean f5600bk = false;
    public static final int[] y4 = {R.attr.windowBackground};
    public static final boolean tg = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean pz = true;

    public class a implements i9.n3 {
        public a() {
        }
    }

    public static class c5 {
        public static void n3(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            int i = configuration.densityDpi;
            int i5 = configuration2.densityDpi;
            if (i != i5) {
                configuration3.densityDpi = i5;
            }
        }

        public static Context y(@NonNull Context context, @NonNull Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }
    }

    public static final class co {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5629a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public View f5630c5;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public Bundle f5631co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.appcompat.view.menu.zn f5632f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public ViewGroup f5633fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f5634gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public androidx.appcompat.view.menu.v f5635i9;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public boolean f5636mt;
        public int n3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f5637p = false;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public View f5638s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Context f5639t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public boolean f5640tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f5641v;
        public boolean w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public boolean f5642wz;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public boolean f5643xc;
        public int y;
        public int zn;

        public co(int i) {
            this.y = i;
        }

        public void gv(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(R$attr.y, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                themeNewTheme.applyStyle(i, true);
            }
            themeNewTheme.resolveAttribute(R$attr.f309z6, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                themeNewTheme.applyStyle(i5, true);
            } else {
                themeNewTheme.applyStyle(R$style.n3, true);
            }
            wz.gv gvVar = new wz.gv(context, 0);
            gvVar.getTheme().setTo(themeNewTheme);
            this.f5639t = gvVar;
            TypedArray typedArrayObtainStyledAttributes = gvVar.obtainStyledAttributes(R$styleable.tg);
            this.n3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f424cr, 0);
            this.f5629a = typedArrayObtainStyledAttributes.getResourceId(R$styleable.pq, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean n3() {
            if (this.f5638s == null) {
                return false;
            }
            return this.f5630c5 != null || this.f5632f.y().getCount() > 0;
        }

        public androidx.appcompat.view.menu.i9 y(c5.y yVar) {
            if (this.f5635i9 == null) {
                return null;
            }
            if (this.f5632f == null) {
                androidx.appcompat.view.menu.zn znVar = new androidx.appcompat.view.menu.zn(this.f5639t, R$layout.f392i9);
                this.f5632f = znVar;
                znVar.gv(yVar);
                this.f5635i9.n3(this.f5632f);
            }
            return this.f5632f.i9(this.f5633fb);
        }

        public void zn(androidx.appcompat.view.menu.v vVar) {
            androidx.appcompat.view.menu.zn znVar;
            androidx.appcompat.view.menu.v vVar2 = this.f5635i9;
            if (vVar == vVar2) {
                return;
            }
            if (vVar2 != null) {
                vVar2.vl(this.f5632f);
            }
            this.f5635i9 = vVar;
            if (vVar == null || (znVar = this.f5632f) == null) {
                return;
            }
            vVar.n3(znVar);
        }
    }

    public static class f {
        public static void y(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            i9.s.y(configuration3, locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public final class fb implements c5.y {
        public fb() {
        }

        @Override // androidx.appcompat.view.menu.c5.y
        public void n3(@NonNull androidx.appcompat.view.menu.v vVar, boolean z) {
            v.this.hw(vVar);
        }

        @Override // androidx.appcompat.view.menu.c5.y
        public boolean zn(@NonNull androidx.appcompat.view.menu.v vVar) {
            Window.Callback callbackEb = v.this.eb();
            if (callbackEb == null) {
                return true;
            }
            callbackEb.onMenuOpened(108, vVar);
            return true;
        }
    }

    public class gv implements Runnable {
        public gv() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v vVar = v.this;
            vVar.f5605d.showAtLocation(vVar.fh, 55, 0, 0);
            v.this.f7();
            if (!v.this.ad()) {
                v.this.fh.setAlpha(1.0f);
                v.this.fh.setVisibility(0);
            } else {
                v.this.fh.setAlpha(0.0f);
                v vVar2 = v.this;
                vVar2.f5626x = ut.v(vVar2.fh).n3(1.0f);
                v.this.f5626x.i9(new y(this));
            }
        }
    }

    public static class i9 {
        public static boolean y(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    public class mt extends ContentFrameLayout {
        public mt(Context context) {
            super(context);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return v.this.q9(keyEvent) || super/*android.widget.FrameLayout*/.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean n3(int i, int i5) {
            return i < -5 || i5 < -5 || i > getWidth() + 5 || i5 > getHeight() + 5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !n3((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super/*android.widget.FrameLayout*/.onInterceptTouchEvent(motionEvent);
            }
            v.this.qn(0);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(f.n3.gv(getContext(), i));
        }
    }

    public class n3 implements d {
        public n3() {
        }

        public rs y(View view, rs rsVar) {
            int iTl = rsVar.tl();
            int iOa = v.this.oa(rsVar, null);
            if (iTl != iOa) {
                rsVar = rsVar.mt(rsVar.f(), iOa, rsVar.t(), rsVar.i9());
            }
            return ut.dm(view, rsVar);
        }
    }

    public static class p {
        public static void y(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    public class s implements n3.y {
        public n3.y y;

        public s(n3.y yVar) {
            this.y = yVar;
        }

        @Override // wz.n3.y
        public boolean gv(wz.n3 n3Var, Menu menu) {
            ut.yg(v.this.f5613j5);
            return this.y.gv(n3Var, menu);
        }

        @Override // wz.n3.y
        public void n3(wz.n3 n3Var) {
            this.y.n3(n3Var);
            v vVar = v.this;
            if (vVar.f5605d != null) {
                vVar.f5624t.getDecorView().removeCallbacks(v.this.f5608ej);
            }
            v vVar2 = v.this;
            if (vVar2.fh != null) {
                vVar2.f7();
                v vVar3 = v.this;
                vVar3.f5626x = ut.v(vVar3.fh).n3(0.0f);
                v.this.f5626x.i9(new y(this));
            }
            v vVar4 = v.this;
            i9.zn znVar = vVar4.f5619p;
            if (znVar != null) {
                znVar.onSupportActionModeFinished(vVar4.d0);
            }
            v vVar5 = v.this;
            vVar5.d0 = null;
            ut.yg(vVar5.f5613j5);
        }

        @Override // wz.n3.y
        public boolean y(wz.n3 n3Var, MenuItem menuItem) {
            return this.y.y(n3Var, menuItem);
        }

        @Override // wz.n3.y
        public boolean zn(wz.n3 n3Var, Menu menu) {
            return this.y.zn(n3Var, menu);
        }
    }

    public static class t {
        public static void y(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            if ((i9.c5.y(configuration) & 3) != (i9.c5.y(configuration2) & 3)) {
                i9.i9.y(configuration3, i9.c5.y(configuration3) | (i9.c5.y(configuration2) & 3));
            }
            if ((i9.c5.y(configuration) & 12) != (i9.c5.y(configuration2) & 12)) {
                i9.i9.y(configuration3, i9.c5.y(configuration3) | (i9.c5.y(configuration2) & 12));
            }
        }
    }

    /* JADX INFO: renamed from: i9.v$v, reason: collision with other inner class name */
    public class C0104v extends dm {
        public C0104v() {
        }

        public void n3(View view) {
            v.this.fh.setAlpha(1.0f);
            v.this.f5626x.i9((xg) null);
            v.this.f5626x = null;
        }

        public void zn(View view) {
            v.this.fh.setVisibility(0);
            v.this.fh.sendAccessibilityEvent(32);
            if (v.this.fh.getParent() instanceof View) {
                ut.yg((View) v.this.fh.getParent());
            }
        }
    }

    public class w extends xc {
        public final i9.mt zn;

        public w(@NonNull i9.mt mtVar) {
            super();
            this.zn = mtVar;
        }

        @Override // i9.v.xc
        public void gv() {
            v.this.a8();
        }

        @Override // i9.v.xc
        public IntentFilter n3() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // i9.v.xc
        public int zn() {
            return this.zn.gv() ? 2 : 1;
        }
    }

    public class wz extends xc {
        public final PowerManager zn;

        public wz(@NonNull Context context) {
            super();
            this.zn = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // i9.v.xc
        public void gv() {
            v.this.a8();
        }

        @Override // i9.v.xc
        public IntentFilter n3() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // i9.v.xc
        public int zn() {
            return i9.y(this.zn) ? 2 : 1;
        }
    }

    public abstract class xc {
        public BroadcastReceiver y;

        public class y extends BroadcastReceiver {
            public y() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                xc.this.gv();
            }
        }

        public xc() {
        }

        public abstract void gv();

        @Nullable
        public abstract IntentFilter n3();

        public void v() {
            y();
            IntentFilter intentFilterN3 = n3();
            if (intentFilterN3 == null || intentFilterN3.countActions() == 0) {
                return;
            }
            if (this.y == null) {
                this.y = new y();
            }
            v.this.f5609f.registerReceiver(this.y, intentFilterN3);
        }

        public void y() {
            BroadcastReceiver broadcastReceiver = this.y;
            if (broadcastReceiver != null) {
                try {
                    v.this.f5609f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.y = null;
            }
        }

        public abstract int zn();
    }

    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v vVar = v.this;
            if ((vVar.f5628yg & 1) != 0) {
                vVar.k(0);
            }
            v vVar2 = v.this;
            if ((vVar2.f5628yg & 4096) != 0) {
                vVar2.k(108);
            }
            v vVar3 = v.this;
            vVar3.f5602ap = false;
            vVar3.f5628yg = 0;
        }
    }

    public final class z implements c5.y {
        public z() {
        }

        @Override // androidx.appcompat.view.menu.c5.y
        public void n3(@NonNull androidx.appcompat.view.menu.v vVar, boolean z) {
            androidx.appcompat.view.menu.v vVarMg = vVar.mg();
            boolean z5 = vVarMg != vVar;
            v vVar2 = v.this;
            if (z5) {
                vVar = vVarMg;
            }
            co coVarU = vVar2.u(vVar);
            if (coVarU != null) {
                if (!z5) {
                    v.this.o(coVarU, z);
                } else {
                    v.this.vl(coVarU.y, coVarU, vVarMg);
                    v.this.o(coVarU, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.c5.y
        public boolean zn(@NonNull androidx.appcompat.view.menu.v vVar) {
            Window.Callback callbackEb;
            if (vVar != vVar.mg()) {
                return true;
            }
            v vVar2 = v.this;
            if (!vVar2.f5625ut || (callbackEb = vVar2.eb()) == null || v.this.rs) {
                return true;
            }
            callbackEb.onMenuOpened(108, vVar);
            return true;
        }
    }

    public v(Activity activity, i9.zn znVar) {
        this(activity, null, znVar, activity);
    }

    @NonNull
    public static Configuration y5(@NonNull Configuration configuration, @Nullable Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f3 = configuration.fontScale;
            float f4 = configuration2.fontScale;
            if (f3 != f4) {
                configuration3.fontScale = f4;
            }
            int i = configuration.mcc;
            int i5 = configuration2.mcc;
            if (i != i5) {
                configuration3.mcc = i5;
            }
            int i8 = configuration.mnc;
            int i10 = configuration2.mnc;
            if (i8 != i10) {
                configuration3.mnc = i10;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                f.y(configuration, configuration2, configuration3);
            } else if (!j5.zn.y(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i12 = configuration.touchscreen;
            int i13 = configuration2.touchscreen;
            if (i12 != i13) {
                configuration3.touchscreen = i13;
            }
            int i14 = configuration.keyboard;
            int i15 = configuration2.keyboard;
            if (i14 != i15) {
                configuration3.keyboard = i15;
            }
            int i16 = configuration.keyboardHidden;
            int i17 = configuration2.keyboardHidden;
            if (i16 != i17) {
                configuration3.keyboardHidden = i17;
            }
            int i18 = configuration.navigation;
            int i19 = configuration2.navigation;
            if (i18 != i19) {
                configuration3.navigation = i19;
            }
            int i20 = configuration.navigationHidden;
            int i21 = configuration2.navigationHidden;
            if (i20 != i21) {
                configuration3.navigationHidden = i21;
            }
            int i22 = configuration.orientation;
            int i23 = configuration2.orientation;
            if (i22 != i23) {
                configuration3.orientation = i23;
            }
            int i24 = configuration.screenLayout & 15;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 15)) {
                configuration3.screenLayout |= i25 & 15;
            }
            int i26 = configuration.screenLayout & 192;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 192)) {
                configuration3.screenLayout |= i27 & 192;
            }
            int i28 = configuration.screenLayout & 48;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 48)) {
                configuration3.screenLayout |= i29 & 48;
            }
            int i30 = configuration.screenLayout & 768;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 768)) {
                configuration3.screenLayout |= i31 & 768;
            }
            if (i11 >= 26) {
                t.y(configuration, configuration2, configuration3);
            }
            int i32 = configuration.uiMode & 15;
            int i33 = configuration2.uiMode;
            if (i32 != (i33 & 15)) {
                configuration3.uiMode |= i33 & 15;
            }
            int i34 = configuration.uiMode & 48;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 48)) {
                configuration3.uiMode |= i35 & 48;
            }
            int i36 = configuration.screenWidthDp;
            int i37 = configuration2.screenWidthDp;
            if (i36 != i37) {
                configuration3.screenWidthDp = i37;
            }
            int i38 = configuration.screenHeightDp;
            int i39 = configuration2.screenHeightDp;
            if (i38 != i39) {
                configuration3.screenHeightDp = i39;
            }
            int i40 = configuration.smallestScreenWidthDp;
            int i41 = configuration2.smallestScreenWidthDp;
            if (i40 != i41) {
                configuration3.smallestScreenWidthDp = i41;
            }
            c5.n3(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    @Override // i9.gv
    @NonNull
    public Context a(@NonNull Context context) {
        this.dm = true;
        int iYc = yc(context, yt());
        if (pz && (context instanceof ContextThemeWrapper)) {
            try {
                p.y((ContextThemeWrapper) context, j(context, iYc, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof wz.gv) {
            try {
                ((wz.gv) context).y(j(context, iYc, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!tg) {
            return super.a(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = c5.y(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationJ = j(context, iYc, configuration2.equals(configuration3) ? null : y5(configuration2, configuration3));
        wz.gv gvVar = new wz.gv(context, R$style.zn);
        gvVar.y(configurationJ);
        try {
            if (context.getTheme() != null) {
                s.a.y(gvVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.a(gvVar);
    }

    public boolean a8() {
        return x(true);
    }

    public final boolean ad() {
        ViewGroup viewGroup;
        return this.f5612hw && (viewGroup = this.f5613j5) != null && ut.q9(viewGroup);
    }

    public final boolean ap() {
        if (!this.f5621ra && (this.f5623s instanceof Activity)) {
            PackageManager packageManager = this.f5609f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f5609f, this.f5623s.getClass()), i >= 29 ? 269221888 : i >= 24 ? 786432 : 0);
                this.f5618nf = (activityInfo == null || (activityInfo.configChanges & NotificationCompat.FLAG_GROUP_SUMMARY) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e4) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e4);
                this.f5618nf = false;
            }
        }
        this.f5621ra = true;
        return this.f5618nf;
    }

    public final void b() {
        ContentFrameLayout contentFrameLayoutFindViewById = this.f5613j5.findViewById(R.id.content);
        View decorView = this.f5624t.getDecorView();
        contentFrameLayoutFindViewById.y(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f5609f.obtainStyledAttributes(R$styleable.tg);
        typedArrayObtainStyledAttributes.getValue(R$styleable.f437gq, contentFrameLayoutFindViewById.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(R$styleable.vp, contentFrameLayoutFindViewById.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.f471qj)) {
            typedArrayObtainStyledAttributes.getValue(R$styleable.f471qj, contentFrameLayoutFindViewById.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.f456l)) {
            typedArrayObtainStyledAttributes.getValue(R$styleable.f456l, contentFrameLayoutFindViewById.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.cy)) {
            typedArrayObtainStyledAttributes.getValue(R$styleable.cy, contentFrameLayoutFindViewById.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.f472qk)) {
            typedArrayObtainStyledAttributes.getValue(R$styleable.f472qk, contentFrameLayoutFindViewById.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayoutFindViewById.requestLayout();
    }

    public void bk(int i) {
        i9.y yVarXc;
        if (i != 108 || (yVarXc = xc()) == null) {
            return;
        }
        yVarXc.s(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i9.gv
    public View c5(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z5;
        if (this.f5617m == null) {
            String string = this.f5609f.obtainStyledAttributes(R$styleable.tg).getString(R$styleable.f467o0);
            if (string == null) {
                this.f5617m = new i9.tl();
            } else {
                try {
                    this.f5617m = (i9.tl) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f5617m = new i9.tl();
                }
            }
        }
        boolean z7 = f5600bk;
        boolean zCy = false;
        if (z7) {
            if (this.f5610g == null) {
                this.f5610g = new i9.wz();
            }
            if (this.f5610g.y(attributeSet)) {
                z5 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zCy = cy((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zCy = true;
                }
                z5 = zCy;
            }
        } else {
            z5 = false;
        }
        return this.f5617m.p(view, str, context, attributeSet, z5, z7, true, gq.n3());
    }

    @Override // i9.gv
    public void co(Bundle bundle) {
        String strZn;
        this.dm = true;
        x(false);
        jz();
        Object obj = this.f5623s;
        if (obj instanceof Activity) {
            try {
                strZn = ta.t.zn((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strZn = null;
            }
            if (strZn != null) {
                i9.y yVarPq = pq();
                if (yVarPq == null) {
                    this.f5615kp = true;
                } else {
                    yVarPq.p(true);
                }
            }
            i9.gv.zn(this);
        }
        this.ct = true;
    }

    public final boolean cr(co coVar, int i, KeyEvent keyEvent, int i5) {
        androidx.appcompat.view.menu.v vVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((coVar.f5640tl || o0(coVar, keyEvent)) && (vVar = coVar.f5635i9) != null) {
            zPerformShortcut = vVar.performShortcut(i, keyEvent, i5);
        }
        if (zPerformShortcut && (i5 & 1) == 0 && this.f3 == null) {
            o(coVar, true);
        }
        return zPerformShortcut;
    }

    public final xc ct(@NonNull Context context) {
        if (this.f5606e == null) {
            this.f5606e = new w(i9.mt.y(context));
        }
        return this.f5606e;
    }

    public final boolean cy(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f5624t.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ut.ut((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // i9.gv
    public void d(Toolbar toolbar) {
        if (this.f5623s instanceof Activity) {
            i9.y yVarXc = xc();
            if (yVarXc instanceof i9.co) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.z = null;
            if (yVarXc != null) {
                yVarXc.tl();
            }
            if (toolbar != null) {
                i9.w wVar = new i9.w(toolbar, rs(), this.w);
                this.f5604co = wVar;
                this.f5624t.setCallback(wVar.n());
            } else {
                this.f5604co = null;
                this.f5624t.setCallback(this.w);
            }
            p();
        }
    }

    public final xc dm(@NonNull Context context) {
        if (this.s8 == null) {
            this.s8 = new wz(context);
        }
        return this.s8;
    }

    public final boolean e(co coVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f5609f;
        int i = coVar.y;
        if ((i == 0 || i == 108) && this.f3 != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(R$attr.f280a, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(R$attr.f288fb, typedValue, true);
            } else {
                theme.resolveAttribute(R$attr.f288fb, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                wz.gv gvVar = new wz.gv(context, 0);
                gvVar.getTheme().setTo(themeNewTheme);
                context = gvVar;
            }
        }
        androidx.appcompat.view.menu.v vVar = new androidx.appcompat.view.menu.v(context);
        vVar.qn(this);
        coVar.zn(vVar);
        return true;
    }

    public final Window.Callback eb() {
        return this.f5624t.getCallback();
    }

    @Override // i9.gv
    public final void ej(CharSequence charSequence) {
        this.f5620r = charSequence;
        y5 y5Var = this.f3;
        if (y5Var != null) {
            y5Var.setWindowTitle(charSequence);
            return;
        }
        if (pq() != null) {
            pq().x4(charSequence);
            return;
        }
        TextView textView = this.qn;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void en() {
        if (this.f5612hw) {
            return;
        }
        this.f5613j5 = oz();
        CharSequence charSequenceRs = rs();
        if (!TextUtils.isEmpty(charSequenceRs)) {
            y5 y5Var = this.f3;
            if (y5Var != null) {
                y5Var.setWindowTitle(charSequenceRs);
            } else if (pq() != null) {
                pq().x4(charSequenceRs);
            } else {
                TextView textView = this.qn;
                if (textView != null) {
                    textView.setText(charSequenceRs);
                }
            }
        }
        b();
        tg(this.f5613j5);
        this.f5612hw = true;
        co coVarO4 = o4(0, false);
        if (this.rs) {
            return;
        }
        if (coVarO4 == null || coVarO4.f5635i9 == null) {
            s8(108);
        }
    }

    @Override // i9.gv
    public void f3() {
        this.o4 = true;
        a8();
    }

    public void f7() {
        qn.y5 y5Var = this.f5626x;
        if (y5Var != null) {
            y5Var.zn();
        }
    }

    @Override // i9.gv
    public boolean fh(int i) {
        int iWf = wf(i);
        if (this.en && iWf == 108) {
            return false;
        }
        if (this.f5625ut && iWf == 1) {
            this.f5625ut = false;
        }
        if (iWf == 1) {
            qj();
            this.en = true;
            return true;
        }
        if (iWf == 2) {
            qj();
            this.j = true;
            return true;
        }
        if (iWf == 5) {
            qj();
            this.oz = true;
            return true;
        }
        if (iWf == 10) {
            qj();
            this.f5614k = true;
            return true;
        }
        if (iWf == 108) {
            qj();
            this.f5625ut = true;
            return true;
        }
        if (iWf != 109) {
            return this.f5624t.requestFeature(iWf);
        }
        qj();
        this.q9 = true;
        return true;
    }

    public boolean g(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z5 = this.xg;
            this.xg = false;
            co coVarO4 = o4(0, false);
            if (coVarO4 != null && coVarO4.f5643xc) {
                if (!z5) {
                    o(coVarO4, true);
                }
                return true;
            }
            if (kp()) {
                return true;
            }
        } else if (i == 82) {
            u0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final boolean g3(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        co coVarO4 = o4(i, true);
        if (coVarO4.f5643xc) {
            return false;
        }
        return o0(coVarO4, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean gq(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f5609f
            r1 = 0
            android.content.res.Configuration r0 = r6.j(r0, r7, r1)
            boolean r2 = r6.ap()
            android.content.Context r3 = r6.f5609f
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.dm
            if (r8 == 0) goto L47
            boolean r8 = i9.v.tg
            if (r8 != 0) goto L30
            boolean r8 = r6.ct
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f5623s
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f5623s
            android.app.Activity r8 = (android.app.Activity) r8
            ta.n3.a(r8)
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.vp(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f5623s
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L5e
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            r8.onNightModeChanged(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.v.gq(int, boolean):boolean");
    }

    @Override // i9.gv
    public void gv(View view, ViewGroup.LayoutParams layoutParams) {
        en();
        ((ViewGroup) this.f5613j5.findViewById(R.id.content)).addView(view, layoutParams);
        this.w.y().onContentChanged();
    }

    public void hw(@NonNull androidx.appcompat.view.menu.v vVar) {
        if (this.jz) {
            return;
        }
        this.jz = true;
        this.f3.t();
        Window.Callback callbackEb = eb();
        if (callbackEb != null && !this.rs) {
            callbackEb.onPanelClosed(108, vVar);
        }
        this.jz = false;
    }

    @Override // i9.gv
    @Nullable
    public <T extends View> T i9(int i) {
        en();
        return (T) this.f5624t.findViewById(i);
    }

    @NonNull
    public final Configuration j(@NonNull Context context, int i, @Nullable Configuration configuration) {
        int i5 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    public final void j5() {
        xc xcVar = this.f5606e;
        if (xcVar != null) {
            xcVar.y();
        }
        xc xcVar2 = this.s8;
        if (xcVar2 != null) {
            xcVar2.y();
        }
    }

    public final void jz() {
        if (this.f5624t == null) {
            Object obj = this.f5623s;
            if (obj instanceof Activity) {
                k5(((Activity) obj).getWindow());
            }
        }
        if (this.f5624t == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public void k(int i) {
        co coVarO4;
        co coVarO42 = o4(i, true);
        if (coVarO42.f5635i9 != null) {
            Bundle bundle = new Bundle();
            coVarO42.f5635i9.j5(bundle);
            if (bundle.size() > 0) {
                coVarO42.f5631co = bundle;
            }
            coVarO42.f5635i9.xg();
            coVarO42.f5635i9.clear();
        }
        coVarO42.f5636mt = true;
        coVarO42.f5637p = true;
        if ((i != 108 && i != 0) || this.f3 == null || (coVarO4 = o4(0, false)) == null) {
            return;
        }
        coVarO4.f5640tl = false;
        o0(coVarO4, null);
    }

    public final void k5(@NonNull Window window) {
        if (this.f5624t != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof tl) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        tl tlVar = new tl(callback);
        this.w = tlVar;
        window.setCallback(tlVar);
        ad adVarR = ad.r(this.f5609f, (AttributeSet) null, y4);
        Drawable drawableS = adVarR.s(0);
        if (drawableS != null) {
            window.setBackgroundDrawable(drawableS);
        }
        adVarR.i4();
        this.f5624t = window;
    }

    public boolean kp() {
        wz.n3 n3Var = this.d0;
        if (n3Var != null) {
            n3Var.zn();
            return true;
        }
        i9.y yVarXc = xc();
        return yVarXc != null && yVarXc.fb();
    }

    @Nullable
    public final AppCompatActivity l() {
        for (Context baseContext = this.f5609f; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public final void lc() {
        en();
        if (this.f5625ut && this.f5604co == null) {
            Object obj = this.f5623s;
            if (obj instanceof Activity) {
                this.f5604co = new i9.co((Activity) this.f5623s, this.q9);
            } else if (obj instanceof Dialog) {
                this.f5604co = new i9.co((Dialog) this.f5623s);
            }
            i9.y yVar = this.f5604co;
            if (yVar != null) {
                yVar.p(this.f5615kp);
            }
        }
    }

    public boolean m(int i, KeyEvent keyEvent) {
        i9.y yVarXc = xc();
        if (yVarXc != null && yVarXc.wz(i, keyEvent)) {
            return true;
        }
        co coVar = this.y5;
        if (coVar != null && cr(coVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            co coVar2 = this.y5;
            if (coVar2 != null) {
                coVar2.f5642wz = true;
            }
            return true;
        }
        if (this.y5 == null) {
            co coVarO4 = o4(0, true);
            o0(coVarO4, keyEvent);
            boolean zCr = cr(coVarO4, keyEvent.getKeyCode(), keyEvent, 1);
            coVarO4.f5640tl = false;
            if (zCr) {
                return true;
            }
        }
        return false;
    }

    @Override // i9.gv
    public void mg(View view) {
        en();
        ViewGroup viewGroup = (ViewGroup) this.f5613j5.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.w.y().onContentChanged();
    }

    @Override // i9.gv
    public void mt(Configuration configuration) {
        i9.y yVarXc;
        if (this.f5625ut && this.f5612hw && (yVarXc = xc()) != null) {
            yVarXc.t(configuration);
        }
        w.f.n3().fb(this.f5609f);
        x(false);
    }

    @Override // i9.gv
    public void n() {
        this.o4 = false;
        i9.y yVarXc = xc();
        if (yVarXc != null) {
            yVarXc.co(false);
        }
    }

    @Override // androidx.appcompat.view.menu.v.y
    public void n3(@NonNull androidx.appcompat.view.menu.v vVar) {
        xb(true);
    }

    public final boolean nf(co coVar) {
        View view = coVar.f5630c5;
        if (view != null) {
            coVar.f5638s = view;
            return true;
        }
        if (coVar.f5635i9 == null) {
            return false;
        }
        if (this.c == null) {
            this.c = new z();
        }
        View view2 = (View) coVar.y(this.c);
        coVar.f5638s = view2;
        return view2 != null;
    }

    public void o(co coVar, boolean z5) {
        ViewGroup viewGroup;
        y5 y5Var;
        if (z5 && coVar.y == 0 && (y5Var = this.f3) != null && y5Var.v()) {
            hw(coVar.f5635i9);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f5609f.getSystemService("window");
        if (windowManager != null && coVar.f5643xc && (viewGroup = coVar.f5633fb) != null) {
            windowManager.removeView(viewGroup);
            if (z5) {
                vl(coVar.y, coVar, null);
            }
        }
        coVar.f5640tl = false;
        coVar.f5642wz = false;
        coVar.f5643xc = false;
        coVar.f5638s = null;
        coVar.f5637p = true;
        if (this.y5 == coVar) {
            this.y5 = null;
        }
    }

    public final boolean o0(co coVar, KeyEvent keyEvent) {
        y5 y5Var;
        y5 y5Var2;
        y5 y5Var3;
        if (this.rs) {
            return false;
        }
        if (coVar.f5640tl) {
            return true;
        }
        co coVar2 = this.y5;
        if (coVar2 != null && coVar2 != coVar) {
            o(coVar2, false);
        }
        Window.Callback callbackEb = eb();
        if (callbackEb != null) {
            coVar.f5630c5 = callbackEb.onCreatePanelView(coVar.y);
        }
        int i = coVar.y;
        boolean z5 = i == 0 || i == 108;
        if (z5 && (y5Var3 = this.f3) != null) {
            y5Var3.a();
        }
        if (coVar.f5630c5 == null && (!z5 || !(pq() instanceof i9.w))) {
            androidx.appcompat.view.menu.v vVar = coVar.f5635i9;
            if (vVar == null || coVar.f5636mt) {
                if (vVar == null && (!e(coVar) || coVar.f5635i9 == null)) {
                    return false;
                }
                if (z5 && this.f3 != null) {
                    if (this.n == null) {
                        this.n = new fb();
                    }
                    this.f3.gv(coVar.f5635i9, this.n);
                }
                coVar.f5635i9.xg();
                if (!callbackEb.onCreatePanelMenu(coVar.y, coVar.f5635i9)) {
                    coVar.zn(null);
                    if (z5 && (y5Var = this.f3) != null) {
                        y5Var.gv((Menu) null, this.n);
                    }
                    return false;
                }
                coVar.f5636mt = false;
            }
            coVar.f5635i9.xg();
            Bundle bundle = coVar.f5631co;
            if (bundle != null) {
                coVar.f5635i9.hw(bundle);
                coVar.f5631co = null;
            }
            if (!callbackEb.onPreparePanel(0, coVar.f5630c5, coVar.f5635i9)) {
                if (z5 && (y5Var2 = this.f3) != null) {
                    y5Var2.gv((Menu) null, this.n);
                }
                coVar.f5635i9.y5();
                return false;
            }
            boolean z7 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            coVar.w = z7;
            coVar.f5635i9.setQwertyMode(z7);
            coVar.f5635i9.y5();
        }
        coVar.f5640tl = true;
        coVar.f5642wz = false;
        this.y5 = coVar;
        return true;
    }

    public co o4(int i, boolean z5) {
        co[] coVarArr = this.u;
        if (coVarArr == null || coVarArr.length <= i) {
            co[] coVarArr2 = new co[i + 1];
            if (coVarArr != null) {
                System.arraycopy(coVarArr, 0, coVarArr2, 0, coVarArr.length);
            }
            this.u = coVarArr2;
            coVarArr = coVarArr2;
        }
        co coVar = coVarArr[i];
        if (coVar != null) {
            return coVar;
        }
        co coVar2 = new co(i);
        coVarArr[i] = coVar2;
        return coVar2;
    }

    public final int oa(@Nullable rs rsVar, @Nullable Rect rect) {
        boolean z5;
        boolean z7;
        int iTl = rsVar != null ? rsVar.tl() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.fh;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z5 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.fh.getLayoutParams();
            if (this.fh.isShown()) {
                if (this.f5622rb == null) {
                    this.f5622rb = new Rect();
                    this.f5611g3 = new Rect();
                }
                Rect rect2 = this.f5622rb;
                Rect rect3 = this.f5611g3;
                if (rsVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(rsVar.f(), rsVar.tl(), rsVar.t(), rsVar.i9());
                }
                vp.y(this.f5613j5, rect2, rect3);
                int i = rect2.top;
                int i5 = rect2.left;
                int i8 = rect2.right;
                rs rsVarB = ut.b(this.f5613j5);
                int iF = rsVarB == null ? 0 : rsVarB.f();
                int iT = rsVarB == null ? 0 : rsVarB.t();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i8) {
                    z7 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i8;
                    z7 = true;
                }
                if (i <= 0 || this.o != null) {
                    View view = this.o;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != iF || marginLayoutParams2.rightMargin != iT) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = iF;
                            marginLayoutParams2.rightMargin = iT;
                            this.o.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f5609f);
                    this.o = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iF;
                    layoutParams.rightMargin = iT;
                    this.f5613j5.addView(this.o, -1, layoutParams);
                }
                View view3 = this.o;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    w9(this.o);
                }
                if (!this.f5614k && z) {
                    iTl = 0;
                }
                z5 = z;
                z = z7;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z5 = false;
            } else {
                z5 = false;
                z = false;
            }
            if (z) {
                this.fh.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.o;
        if (view4 != null) {
            view4.setVisibility(z5 ? 0 : 8);
        }
        return iTl;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return c5(view, str, context, attributeSet);
    }

    public final ViewGroup oz() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f5609f.obtainStyledAttributes(R$styleable.tg);
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.xb)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.oa, false)) {
            fh(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.xb, false)) {
            fh(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.wf, false)) {
            fh(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.f415ad, false)) {
            fh(10);
        }
        this.f7 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.pz, false);
        typedArrayObtainStyledAttributes.recycle();
        jz();
        this.f5624t.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f5609f);
        if (this.en) {
            viewGroup = this.f5614k ? (ViewGroup) layoutInflaterFrom.inflate(R$layout.f400xc, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(R$layout.f399wz, (ViewGroup) null);
        } else if (this.f7) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(R$layout.f386a, (ViewGroup) null);
            this.q9 = false;
            this.f5625ut = false;
        } else if (this.f5625ut) {
            TypedValue typedValue = new TypedValue();
            this.f5609f.getTheme().resolveAttribute(R$attr.f280a, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new wz.gv(this.f5609f, typedValue.resourceId) : this.f5609f).inflate(R$layout.w, (ViewGroup) null);
            y5 y5VarFindViewById = viewGroup.findViewById(R$id.w);
            this.f3 = y5VarFindViewById;
            y5VarFindViewById.setWindowCallback(eb());
            if (this.q9) {
                this.f3.s(109);
            }
            if (this.j) {
                this.f3.s(2);
            }
            if (this.oz) {
                this.f3.s(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f5625ut + ", windowActionBarOverlay: " + this.q9 + ", android:windowIsFloating: " + this.f7 + ", windowActionModeOverlay: " + this.f5614k + ", windowNoTitle: " + this.en + " }");
        }
        ut.ad(viewGroup, new n3());
        if (this.f3 == null) {
            this.qn = (TextView) viewGroup.findViewById(R$id.f370k5);
        }
        vp.zn(viewGroup);
        ContentFrameLayout contentFrameLayoutFindViewById = viewGroup.findViewById(R$id.n3);
        ViewGroup viewGroup2 = (ViewGroup) this.f5624t.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayoutFindViewById.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayoutFindViewById.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f5624t.setContentView(viewGroup);
        contentFrameLayoutFindViewById.setAttachListener(new zn());
        return viewGroup;
    }

    @Override // i9.gv
    public void p() {
        i9.y yVarXc = xc();
        if (yVarXc == null || !yVarXc.f()) {
            s8(0);
        }
    }

    public final i9.y pq() {
        return this.f5604co;
    }

    public final void pz(co coVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (coVar.f5643xc || this.rs) {
            return;
        }
        if (coVar.y == 0 && (this.f5609f.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackEb = eb();
        if (callbackEb != null && !callbackEb.onMenuOpened(coVar.y, coVar.f5635i9)) {
            o(coVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f5609f.getSystemService("window");
        if (windowManager != null && o0(coVar, keyEvent)) {
            ViewGroup viewGroup = coVar.f5633fb;
            if (viewGroup != null && !coVar.f5637p) {
                View view = coVar.f5630c5;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                coVar.f5642wz = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, coVar.f5634gv, coVar.f5641v, 1002, 8519680, -3);
                layoutParams2.gravity = coVar.zn;
                layoutParams2.windowAnimations = coVar.f5629a;
                windowManager.addView(coVar.f5633fb, layoutParams2);
                coVar.f5643xc = true;
            }
            if (viewGroup == null) {
                if (!ra(coVar) || coVar.f5633fb == null) {
                    return;
                }
            } else if (coVar.f5637p && viewGroup.getChildCount() > 0) {
                coVar.f5633fb.removeAllViews();
            }
            if (!nf(coVar) || !coVar.n3()) {
                coVar.f5637p = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = coVar.f5638s.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            coVar.f5633fb.setBackgroundResource(coVar.n3);
            ViewParent parent = coVar.f5638s.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(coVar.f5638s);
            }
            coVar.f5633fb.addView(coVar.f5638s, layoutParams3);
            if (!coVar.f5638s.hasFocus()) {
                coVar.f5638s.requestFocus();
            }
            i = -2;
            coVar.f5642wz = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, coVar.f5634gv, coVar.f5641v, 1002, 8519680, -3);
            layoutParams22.gravity = coVar.zn;
            layoutParams22.windowAnimations = coVar.f5629a;
            windowManager.addView(coVar.f5633fb, layoutParams22);
            coVar.f5643xc = true;
        }
    }

    public boolean q9(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f5623s;
        if (((obj instanceof p.y) || (obj instanceof i9.f)) && (decorView = this.f5624t.getDecorView()) != null && qn.p.gv(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.w.y().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? rb(keyCode, keyEvent) : g(keyCode, keyEvent);
    }

    public final void qj() {
        if (this.f5612hw) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public wz.n3 qk(@NonNull n3.y yVar) {
        wz.n3 n3VarOnWindowStartingSupportActionMode;
        Context gvVar;
        i9.zn znVar;
        f7();
        wz.n3 n3Var = this.d0;
        if (n3Var != null) {
            n3Var.zn();
        }
        if (!(yVar instanceof s)) {
            yVar = new s(yVar);
        }
        i9.zn znVar2 = this.f5619p;
        if (znVar2 == null || this.rs) {
            n3VarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                n3VarOnWindowStartingSupportActionMode = znVar2.onWindowStartingSupportActionMode(yVar);
            } catch (AbstractMethodError unused) {
                n3VarOnWindowStartingSupportActionMode = null;
            }
        }
        if (n3VarOnWindowStartingSupportActionMode != null) {
            this.d0 = n3VarOnWindowStartingSupportActionMode;
        } else {
            if (this.fh == null) {
                if (this.f7) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f5609f.getTheme();
                    theme.resolveAttribute(R$attr.f280a, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f5609f.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        gvVar = new wz.gv(this.f5609f, 0);
                        gvVar.getTheme().setTo(themeNewTheme);
                    } else {
                        gvVar = this.f5609f;
                    }
                    this.fh = new ActionBarContextView(gvVar);
                    PopupWindow popupWindow = new PopupWindow(gvVar, (AttributeSet) null, R$attr.f283c5);
                    this.f5605d = popupWindow;
                    ut.t.n3(popupWindow, 2);
                    this.f5605d.setContentView(this.fh);
                    this.f5605d.setWidth(-1);
                    gvVar.getTheme().resolveAttribute(R$attr.n3, typedValue, true);
                    this.fh.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, gvVar.getResources().getDisplayMetrics()));
                    this.f5605d.setHeight(-2);
                    this.f5608ej = new gv();
                } else {
                    ViewStubCompat viewStubCompatFindViewById = this.f5613j5.findViewById(R$id.f374s);
                    if (viewStubCompatFindViewById != null) {
                        viewStubCompatFindViewById.setLayoutInflater(LayoutInflater.from(xg()));
                        this.fh = viewStubCompatFindViewById.y();
                    }
                }
            }
            if (this.fh != null) {
                f7();
                this.fh.f();
                wz.v vVar = new wz.v(this.fh.getContext(), this.fh, yVar, this.f5605d == null);
                if (yVar.zn(vVar, vVar.v())) {
                    vVar.f();
                    this.fh.s(vVar);
                    this.d0 = vVar;
                    if (ad()) {
                        this.fh.setAlpha(0.0f);
                        qn.y5 y5VarN3 = ut.v(this.fh).n3(1.0f);
                        this.f5626x = y5VarN3;
                        y5VarN3.i9(new C0104v());
                    } else {
                        this.fh.setAlpha(1.0f);
                        this.fh.setVisibility(0);
                        this.fh.sendAccessibilityEvent(32);
                        if (this.fh.getParent() instanceof View) {
                            ut.yg((View) this.fh.getParent());
                        }
                    }
                    if (this.f5605d != null) {
                        this.f5624t.getDecorView().post(this.f5608ej);
                    }
                } else {
                    this.d0 = null;
                }
            }
        }
        wz.n3 n3Var2 = this.d0;
        if (n3Var2 != null && (znVar = this.f5619p) != null) {
            znVar.onSupportActionModeStarted(n3Var2);
        }
        return this.d0;
    }

    public void qn(int i) {
        o(o4(i, true), true);
    }

    @Override // i9.gv
    public void r(Bundle bundle) {
        en();
    }

    public final boolean ra(co coVar) {
        coVar.gv(xg());
        coVar.f5633fb = new mt(coVar.f5639t);
        coVar.zn = 81;
        return true;
    }

    public boolean rb(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.xg = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            g3(0, keyEvent);
            return true;
        }
        return false;
    }

    public final CharSequence rs() {
        Object obj = this.f5623s;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f5620r;
    }

    @Override // i9.gv
    public void rz(int i) {
        en();
        ViewGroup viewGroup = (ViewGroup) this.f5613j5.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f5609f).inflate(i, viewGroup);
        this.w.y().onContentChanged();
    }

    public final void s8(int i) {
        this.f5628yg = (1 << i) | this.f5628yg;
        if (this.f5602ap) {
            return;
        }
        ut.nf(this.f5624t.getDecorView(), this.f5627yc);
        this.f5602ap = true;
    }

    @Override // i9.gv
    public final i9.n3 t() {
        return new a();
    }

    @Override // i9.gv
    public void ta(View view, ViewGroup.LayoutParams layoutParams) {
        en();
        ViewGroup viewGroup = (ViewGroup) this.f5613j5.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.w.y().onContentChanged();
    }

    @Override // i9.gv
    public int tl() {
        return this.f5607eb;
    }

    public co u(Menu menu) {
        co[] coVarArr = this.u;
        int length = coVarArr != null ? coVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            co coVar = coVarArr[i];
            if (coVar != null && coVar.f5635i9 == menu) {
                return coVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            wz.n3 r0 = r4.d0
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            i9.v$co r2 = r4.o4(r5, r0)
            if (r5 != 0) goto L43
            w.y5 r5 = r4.f3
            if (r5 == 0) goto L43
            boolean r5 = r5.y()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f5609f
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            w.y5 r5 = r4.f3
            boolean r5 = r5.v()
            if (r5 != 0) goto L3c
            boolean r5 = r4.rs
            if (r5 != 0) goto L62
            boolean r5 = r4.o0(r2, r6)
            if (r5 == 0) goto L62
            w.y5 r5 = r4.f3
            boolean r0 = r5.zn()
            goto L68
        L3c:
            w.y5 r5 = r4.f3
            boolean r0 = r5.n3()
            goto L68
        L43:
            boolean r5 = r2.f5643xc
            if (r5 != 0) goto L64
            boolean r3 = r2.f5642wz
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f5640tl
            if (r5 == 0) goto L62
            boolean r5 = r2.f5636mt
            if (r5 == 0) goto L5b
            r2.f5640tl = r1
            boolean r5 = r4.o0(r2, r6)
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L62
            r4.pz(r2, r6)
            goto L68
        L62:
            r0 = 0
            goto L68
        L64:
            r4.o(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f5609f
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.v.u0(int, android.view.KeyEvent):boolean");
    }

    @Override // i9.gv
    public wz.n3 ud(@NonNull n3.y yVar) {
        i9.zn znVar;
        if (yVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        wz.n3 n3Var = this.d0;
        if (n3Var != null) {
            n3Var.zn();
        }
        s sVar = new s(yVar);
        i9.y yVarXc = xc();
        if (yVarXc != null) {
            wz.n3 n3VarI4 = yVarXc.i4(sVar);
            this.d0 = n3VarI4;
            if (n3VarI4 != null && (znVar = this.f5619p) != null) {
                znVar.onSupportActionModeStarted(n3VarI4);
            }
        }
        if (this.d0 == null) {
            this.d0 = qk(sVar);
        }
        return this.d0;
    }

    public void ut() {
        androidx.appcompat.view.menu.v vVar;
        y5 y5Var = this.f3;
        if (y5Var != null) {
            y5Var.t();
        }
        if (this.f5605d != null) {
            this.f5624t.getDecorView().removeCallbacks(this.f5608ej);
            if (this.f5605d.isShowing()) {
                try {
                    this.f5605d.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f5605d = null;
        }
        f7();
        co coVarO4 = o4(0, false);
        if (coVarO4 == null || (vVar = coVarO4.f5635i9) == null) {
            return;
        }
        vVar.close();
    }

    public void vl(int i, co coVar, Menu menu) {
        if (menu == null) {
            if (coVar == null && i >= 0) {
                co[] coVarArr = this.u;
                if (i < coVarArr.length) {
                    coVar = coVarArr[i];
                }
            }
            if (coVar != null) {
                menu = coVar.f5635i9;
            }
        }
        if ((coVar == null || coVar.f5643xc) && !this.rs) {
            this.w.y().onPanelClosed(i, menu);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vp(int i, boolean z5, @Nullable Configuration configuration) {
        Resources resources = this.f5609f.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26) {
            i9.xc.y(resources);
        }
        int i8 = this.f5616lc;
        if (i8 != 0) {
            this.f5609f.setTheme(i8);
            if (i5 >= 23) {
                this.f5609f.getTheme().applyStyle(this.f5616lc, true);
            }
        }
        if (z5) {
            Object obj = this.f5623s;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof ap.mt) {
                    if (((ap.mt) activity).getLifecycle().n3().n3(s.n3.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.o4) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    @Override // i9.gv
    public void w() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f5609f);
        if (layoutInflaterFrom.getFactory() == null) {
            qn.mt.y(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof v) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void w9(View view) {
        view.setBackgroundColor((ut.hw(view) & 8192) != 0 ? d.y.getColor(this.f5609f, R$color.n3) : d.y.getColor(this.f5609f, R$color.y));
    }

    public final int wf(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i != 9) {
            return i;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    @Override // i9.gv
    public MenuInflater wz() {
        if (this.z == null) {
            lc();
            i9.y yVar = this.f5604co;
            this.z = new wz.fb(yVar != null ? yVar.i9() : this.f5609f);
        }
        return this.z;
    }

    public final boolean x(boolean z5) {
        if (this.rs) {
            return false;
        }
        int iYt = yt();
        boolean zGq = gq(yc(this.f5609f, iYt), z5);
        if (iYt == 0) {
            ct(this.f5609f).v();
        } else {
            xc xcVar = this.f5606e;
            if (xcVar != null) {
                xcVar.y();
            }
        }
        if (iYt == 3) {
            dm(this.f5609f).v();
        } else {
            xc xcVar2 = this.s8;
            if (xcVar2 != null) {
                xcVar2.y();
            }
        }
        return zGq;
    }

    @Override // i9.gv
    public void x4() {
        i9.y yVarXc = xc();
        if (yVarXc != null) {
            yVarXc.co(true);
        }
    }

    public final void xb(boolean z5) {
        y5 y5Var = this.f3;
        if (y5Var == null || !y5Var.y() || (ViewConfiguration.get(this.f5609f).hasPermanentMenuKey() && !this.f3.fb())) {
            co coVarO4 = o4(0, true);
            coVarO4.f5637p = true;
            o(coVarO4, false);
            pz(coVarO4, null);
            return;
        }
        Window.Callback callbackEb = eb();
        if (this.f3.v() && z5) {
            this.f3.n3();
            if (this.rs) {
                return;
            }
            callbackEb.onPanelClosed(108, o4(0, true).f5635i9);
            return;
        }
        if (callbackEb == null || this.rs) {
            return;
        }
        if (this.f5602ap && (this.f5628yg & 1) != 0) {
            this.f5624t.getDecorView().removeCallbacks(this.f5627yc);
            this.f5627yc.run();
        }
        co coVarO42 = o4(0, true);
        androidx.appcompat.view.menu.v vVar = coVarO42.f5635i9;
        if (vVar == null || coVarO42.f5636mt || !callbackEb.onPreparePanel(0, coVarO42.f5630c5, vVar)) {
            return;
        }
        callbackEb.onMenuOpened(108, coVarO42.f5635i9);
        this.f3.zn();
    }

    @Override // i9.gv
    public i9.y xc() {
        lc();
        return this.f5604co;
    }

    public final Context xg() {
        i9.y yVarXc = xc();
        Context contextI9 = yVarXc != null ? yVarXc.i9() : null;
        return contextI9 == null ? this.f5609f : contextI9;
    }

    @Override // androidx.appcompat.view.menu.v.y
    public boolean y(@NonNull androidx.appcompat.view.menu.v vVar, @NonNull MenuItem menuItem) {
        co coVarU;
        Window.Callback callbackEb = eb();
        if (callbackEb == null || this.rs || (coVarU = u(vVar.mg())) == null) {
            return false;
        }
        return callbackEb.onMenuItemSelected(coVarU.y, menuItem);
    }

    public void y4(int i) {
        if (i == 108) {
            i9.y yVarXc = xc();
            if (yVarXc != null) {
                yVarXc.s(false);
                return;
            }
            return;
        }
        if (i == 0) {
            co coVarO4 = o4(i, true);
            if (coVarO4.f5643xc) {
                o(coVarO4, false);
            }
        }
    }

    public int yc(@NonNull Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return ct(context).zn();
                }
                return -1;
            }
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return dm(context).zn();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i;
    }

    public boolean yg() {
        return this.f5603b;
    }

    public final int yt() {
        int i = this.f5607eb;
        return i != -100 ? i : i9.gv.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // i9.gv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5623s
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            i9.gv.c(r3)
        L9:
            boolean r0 = r3.f5602ap
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f5624t
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f5627yc
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.o4 = r0
            r0 = 1
            r3.rs = r0
            int r0 = r3.f5607eb
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f5623s
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            x4.s<java.lang.String, java.lang.Integer> r0 = i9.v.f5601u0
            java.lang.Object r1 = r3.f5623s
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f5607eb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            x4.s<java.lang.String, java.lang.Integer> r0 = i9.v.f5601u0
            java.lang.Object r1 = r3.f5623s
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            i9.y r0 = r3.f5604co
            if (r0 == 0) goto L5e
            r0.tl()
        L5e:
            r3.j5()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.v.z():void");
    }

    @Override // i9.gv
    public void z6(int i) {
        this.f5616lc = i;
    }

    public v(Dialog dialog, i9.zn znVar) {
        this(dialog.getContext(), dialog.getWindow(), znVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public v(Context context, Window window, i9.zn znVar, Object obj) {
        x4.s<String, Integer> sVar;
        Integer num;
        AppCompatActivity appCompatActivityL;
        this.f5626x = null;
        this.f5603b = true;
        this.f5607eb = -100;
        this.f5627yc = new y();
        this.f5609f = context;
        this.f5619p = znVar;
        this.f5623s = obj;
        if (this.f5607eb == -100 && (obj instanceof Dialog) && (appCompatActivityL = l()) != null) {
            this.f5607eb = appCompatActivityL.getDelegate().tl();
        }
        if (this.f5607eb == -100 && (num = (sVar = f5601u0).get(obj.getClass().getName())) != null) {
            this.f5607eb = num.intValue();
            sVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            k5(window);
        }
        w.f.s();
    }

    public class tl extends WindowCallbackWrapper {
        public tl(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return v.this.q9(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || v.this.m(keyEvent.getKeyCode(), keyEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [wz.a$y, wz.n3$y] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final ActionMode n3(final ActionMode.Callback callback) {
            final Context context = v.this.f5609f;
            ?? r02 = new n3.y(context, callback) { // from class: wz.a$y
                public final Context n3;
                public final ActionMode.Callback y;
                public final ArrayList<a> zn = new ArrayList<>();

                /* JADX INFO: renamed from: gv, reason: collision with root package name */
                public final x4.s<Menu, Menu> f9057gv = new x4.s<>();

                {
                    this.n3 = context;
                    this.y = callback;
                }

                public final Menu a(Menu menu) {
                    Menu menu2 = this.f9057gv.get(menu);
                    if (menu2 != null) {
                        return menu2;
                    }
                    Menu vVar = new xc.v(this.n3, (y) menu);
                    this.f9057gv.put(menu, vVar);
                    return vVar;
                }

                @Override // wz.n3.y
                public boolean gv(n3 n3Var, Menu menu) {
                    return this.y.onPrepareActionMode(v(n3Var), a(menu));
                }

                @Override // wz.n3.y
                public void n3(n3 n3Var) {
                    this.y.onDestroyActionMode(v(n3Var));
                }

                public ActionMode v(n3 n3Var) {
                    int size = this.zn.size();
                    for (int i = 0; i < size; i++) {
                        a aVar = this.zn.get(i);
                        if (aVar != null && aVar.n3 == n3Var) {
                            return aVar;
                        }
                    }
                    a aVar2 = new a(this.n3, n3Var);
                    this.zn.add(aVar2);
                    return aVar2;
                }

                @Override // wz.n3.y
                public boolean y(n3 n3Var, MenuItem menuItem) {
                    return this.y.onActionItemClicked(v(n3Var), new zn(this.n3, (x.n3) menuItem));
                }

                @Override // wz.n3.y
                public boolean zn(n3 n3Var, Menu menu) {
                    return this.y.onCreateActionMode(v(n3Var), a(menu));
                }
            };
            wz.n3 n3VarUd = v.this.ud(r02);
            if (n3VarUd != null) {
                return r02.v(n3VarUd);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.v)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            v.this.bk(i);
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            v.this.y4(i);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.v vVar = menu instanceof androidx.appcompat.view.menu.v ? (androidx.appcompat.view.menu.v) menu : null;
            if (i == 0 && vVar == null) {
                return false;
            }
            if (vVar != null) {
                vVar.jz(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (vVar != null) {
                vVar.jz(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.v vVar;
            co coVarO4 = v.this.o4(0, true);
            if (coVarO4 == null || (vVar = coVarO4.f5635i9) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, vVar, i);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return v.this.yg() ? n3(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (v.this.yg() && i == 0) {
                return n3(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
        }
    }

    public class zn implements ContentFrameLayout.y {
        public zn() {
        }

        public void onDetachedFromWindow() {
            v.this.ut();
        }

        public void y() {
        }
    }

    @Override // i9.gv
    public void i4(Bundle bundle) {
    }

    public void tg(ViewGroup viewGroup) {
    }
}
