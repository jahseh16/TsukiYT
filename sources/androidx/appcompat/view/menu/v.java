package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import qn.n3;

/* JADX INFO: loaded from: classes.dex */
public class v implements x.y {
    public static final int[] d0 = {1, 4, 5, 3, 2, 0};
    public boolean c;
    public fb f3;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f624gv;
    public final Resources n3;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f632tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y f633v;
    public View w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public CharSequence f634wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public Drawable f636xc;
    public final Context y;
    public boolean zn;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f631t = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f628p = false;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public boolean f627mt = false;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f621co = false;
    public boolean z = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f629r = false;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public ArrayList<fb> f635x4 = new ArrayList<>();

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public CopyOnWriteArrayList<WeakReference<c5>> f625i4 = new CopyOnWriteArrayList<>();
    public boolean n = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<fb> f619a = new ArrayList<>();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public ArrayList<fb> f623fb = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f630s = true;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public ArrayList<fb> f620c5 = new ArrayList<>();

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public ArrayList<fb> f626i9 = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f622f = true;

    public interface y {
        void n3(@NonNull v vVar);

        boolean y(@NonNull v vVar, @NonNull MenuItem menuItem);
    }

    public v(Context context) {
        this.y = context;
        this.n3 = context.getResources();
        u(true);
    }

    public static int fh(int i) {
        int i5 = ((-65536) & i) >> 16;
        if (i5 >= 0) {
            int[] iArr = d0;
            if (i5 < iArr.length) {
                return (i & 65535) | (iArr[i5] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int wz(ArrayList<fb> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).a() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean a(fb fbVar) {
        boolean zS = false;
        if (!this.f625i4.isEmpty() && this.f3 == fbVar) {
            xg();
            for (WeakReference<c5> weakReference : this.f625i4) {
                c5 c5Var = weakReference.get();
                if (c5Var != null) {
                    zS = c5Var.s(this, fbVar);
                    if (zS) {
                        break;
                    }
                } else {
                    this.f625i4.remove(weakReference);
                }
            }
            y5();
            if (zS) {
                this.f3 = null;
            }
        }
        return zS;
    }

    public void a8(fb fbVar) {
        this.f630s = true;
        x(true);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return y(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i5, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.y.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i5, i8, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public boolean b(MenuItem menuItem, int i) {
        return k5(menuItem, null, i);
    }

    public ArrayList<fb> c() {
        mt();
        return this.f626i9;
    }

    public final void c5(boolean z) {
        if (this.f625i4.isEmpty()) {
            return;
        }
        xg();
        for (WeakReference<c5> weakReference : this.f625i4) {
            c5 c5Var = weakReference.get();
            if (c5Var == null) {
                this.f625i4.remove(weakReference);
            } else {
                c5Var.a(z);
            }
        }
        y5();
    }

    @Override // android.view.Menu
    public void clear() {
        fb fbVar = this.f3;
        if (fbVar != null) {
            a(fbVar);
        }
        this.f619a.clear();
        x(true);
    }

    public void clearHeader() {
        this.f636xc = null;
        this.f634wz = null;
        this.w = null;
        x(false);
    }

    @Override // android.view.Menu
    public void close() {
        v(true);
    }

    public ArrayList<fb> co() {
        mt();
        return this.f620c5;
    }

    public boolean d() {
        return this.n;
    }

    public boolean d0() {
        return this.z;
    }

    public boolean ej() {
        return this.f624gv;
    }

    public v en(View view) {
        q9(0, null, 0, null, view);
        return this;
    }

    public boolean f(fb fbVar) {
        boolean zZn = false;
        if (this.f625i4.isEmpty()) {
            return false;
        }
        xg();
        for (WeakReference<c5> weakReference : this.f625i4) {
            c5 c5Var = weakReference.get();
            if (c5Var != null) {
                zZn = c5Var.zn(this, fbVar);
                if (zZn) {
                    break;
                }
            } else {
                this.f625i4.remove(weakReference);
            }
        }
        y5();
        if (zZn) {
            this.f3 = fbVar;
        }
        return zZn;
    }

    public CharSequence f3() {
        return this.f634wz;
    }

    public v f7(CharSequence charSequence) {
        q9(0, charSequence, 0, null, null);
        return this;
    }

    public final fb fb(int i, int i5, int i8, int i10, CharSequence charSequence, int i11) {
        return new fb(this, i, i5, i8, i10, charSequence, i11);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            fb fbVar = this.f619a.get(i5);
            if (fbVar.getItemId() == i) {
                return fbVar;
            }
            if (fbVar.hasSubMenu() && (menuItemFindItem = fbVar.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f619a.get(i);
    }

    public void gv() {
        y yVar = this.f633v;
        if (yVar != null) {
            yVar.n3(this);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.c) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f619a.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void hw(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(z());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((t) item.getSubMenu()).hw(bundle);
            }
        }
        int i5 = bundle.getInt("android:menu:expandedactionview");
        if (i5 <= 0 || (menuItemFindItem = findItem(i5)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public Drawable i4() {
        return this.f636xc;
    }

    public final boolean i9(t tVar, c5 c5Var) {
        if (this.f625i4.isEmpty()) {
            return false;
        }
        boolean zV = c5Var != null ? c5Var.v(tVar) : false;
        for (WeakReference<c5> weakReference : this.f625i4) {
            c5 c5Var2 = weakReference.get();
            if (c5Var2 == null) {
                this.f625i4.remove(weakReference);
            } else if (!zV) {
                zV = c5Var2.v(tVar);
            }
        }
        return zV;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return w(i, keyEvent) != null;
    }

    public void j(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f619a.size();
        xg();
        for (int i = 0; i < size; i++) {
            fb fbVar = this.f619a.get(i);
            if (fbVar.getGroupId() == groupId && fbVar.tl() && fbVar.isCheckable()) {
                fbVar.co(fbVar == menuItem);
            }
        }
        y5();
    }

    public void j5(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((t) item.getSubMenu()).j5(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(z(), sparseArray);
        }
    }

    public void jz(boolean z) {
        this.c = z;
    }

    public v k(int i) {
        q9(i, null, 0, null, null);
        return this;
    }

    public boolean k5(MenuItem menuItem, c5 c5Var, int i) {
        fb fbVar = (fb) menuItem;
        if (fbVar == null || !fbVar.isEnabled()) {
            return false;
        }
        boolean zF = fbVar.f();
        n3 n3VarY = fbVar.y();
        boolean z = n3VarY != null && n3VarY.y();
        if (fbVar.i9()) {
            zF |= fbVar.expandActionView();
            if (zF) {
                v(true);
            }
        } else if (fbVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                v(false);
            }
            if (!fbVar.hasSubMenu()) {
                fbVar.f3(new t(r(), this, fbVar));
            }
            t tVar = (t) fbVar.getSubMenu();
            if (z) {
                n3VarY.a(tVar);
            }
            zF |= i9(tVar, c5Var);
            if (!zF) {
                v(true);
            }
        } else if ((i & 1) == 0) {
            v(true);
        }
        return zF;
    }

    public v mg() {
        return this;
    }

    public void mt() {
        ArrayList<fb> arrayListTa = ta();
        if (this.f622f) {
            boolean zFb = false;
            for (WeakReference<c5> weakReference : this.f625i4) {
                c5 c5Var = weakReference.get();
                if (c5Var == null) {
                    this.f625i4.remove(weakReference);
                } else {
                    zFb |= c5Var.fb();
                }
            }
            if (zFb) {
                this.f620c5.clear();
                this.f626i9.clear();
                int size = arrayListTa.size();
                for (int i = 0; i < size; i++) {
                    fb fbVar = arrayListTa.get(i);
                    if (fbVar.t()) {
                        this.f620c5.add(fbVar);
                    } else {
                        this.f626i9.add(fbVar);
                    }
                }
            } else {
                this.f620c5.clear();
                this.f626i9.clear();
                this.f626i9.addAll(ta());
            }
            this.f622f = false;
        }
    }

    public View n() {
        return this.w;
    }

    public void n3(c5 c5Var) {
        zn(c5Var, this.y);
    }

    public v o(int i) {
        this.f631t = i;
        return this;
    }

    public v oz(int i) {
        q9(0, null, i, null, null);
        return this;
    }

    public void p(List<fb> list, int i, KeyEvent keyEvent) {
        boolean zZ6 = z6();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f619a.size();
            for (int i5 = 0; i5 < size; i5++) {
                fb fbVar = this.f619a.get(i5);
                if (fbVar.hasSubMenu()) {
                    ((v) fbVar.getSubMenu()).p(list, i, keyEvent);
                }
                char alphabeticShortcut = zZ6 ? fbVar.getAlphabeticShortcut() : fbVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zZ6 ? fbVar.getAlphabeticModifiers() : fbVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zZ6 && alphabeticShortcut == '\b' && i == 67)) && fbVar.isEnabled()) {
                        list.add(fbVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i5) {
        return b(findItem(i), i5);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i5) {
        fb fbVarW = w(i, keyEvent);
        boolean zB = fbVarW != null ? b(fbVarW, i5) : false;
        if ((i5 & 2) != 0) {
            v(true);
        }
        return zB;
    }

    public final void q9(int i, CharSequence charSequence, int i5, Drawable drawable, View view) {
        Resources resourcesRz = rz();
        if (view != null) {
            this.w = view;
            this.f634wz = null;
            this.f636xc = null;
        } else {
            if (i > 0) {
                this.f634wz = resourcesRz.getText(i);
            } else if (charSequence != null) {
                this.f634wz = charSequence;
            }
            if (i5 > 0) {
                this.f636xc = d.y.getDrawable(r(), i5);
            } else if (drawable != null) {
                this.f636xc = drawable;
            }
            this.w = null;
        }
        x(false);
    }

    public void qn(y yVar) {
        this.f633v = yVar;
    }

    public Context r() {
        return this.y;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iT = t(i);
        if (iT >= 0) {
            int size = this.f619a.size() - iT;
            int i5 = 0;
            while (true) {
                int i8 = i5 + 1;
                if (i5 >= size || this.f619a.get(iT).getGroupId() != i) {
                    break;
                }
                yt(iT, false);
                i5 = i8;
            }
            x(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        yt(xc(i), true);
    }

    public Resources rz() {
        return this.n3;
    }

    public boolean s(@NonNull v vVar, @NonNull MenuItem menuItem) {
        y yVar = this.f633v;
        return yVar != null && yVar.y(vVar, menuItem);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z5) {
        int size = this.f619a.size();
        for (int i5 = 0; i5 < size; i5++) {
            fb fbVar = this.f619a.get(i5);
            if (fbVar.getGroupId() == i) {
                fbVar.z(z5);
                fbVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.n = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f619a.size();
        for (int i5 = 0; i5 < size; i5++) {
            fb fbVar = this.f619a.get(i5);
            if (fbVar.getGroupId() == i) {
                fbVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f619a.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            fb fbVar = this.f619a.get(i5);
            if (fbVar.getGroupId() == i && fbVar.n(z)) {
                z5 = true;
            }
        }
        if (z5) {
            x(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.zn = z;
        x(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f619a.size();
    }

    public int t(int i) {
        return tl(i, 0);
    }

    @NonNull
    public ArrayList<fb> ta() {
        if (!this.f630s) {
            return this.f623fb;
        }
        this.f623fb.clear();
        int size = this.f619a.size();
        for (int i = 0; i < size; i++) {
            fb fbVar = this.f619a.get(i);
            if (fbVar.isVisible()) {
                this.f623fb.add(fbVar);
            }
        }
        this.f630s = false;
        this.f622f = true;
        return this.f623fb;
    }

    public int tl(int i, int i5) {
        int size = size();
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < size) {
            if (this.f619a.get(i5).getGroupId() == i) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.n3
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.y
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.y
            boolean r3 = qn.k.a(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f624gv = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.v.u(boolean):void");
    }

    public void ud(fb fbVar) {
        this.f622f = true;
        x(true);
    }

    public v ut(Drawable drawable) {
        q9(0, null, 0, drawable, null);
        return this;
    }

    public final void v(boolean z) {
        if (this.f629r) {
            return;
        }
        this.f629r = true;
        for (WeakReference<c5> weakReference : this.f625i4) {
            c5 c5Var = weakReference.get();
            if (c5Var == null) {
                this.f625i4.remove(weakReference);
            } else {
                c5Var.n3(this, z);
            }
        }
        this.f629r = false;
    }

    public void vl(c5 c5Var) {
        for (WeakReference<c5> weakReference : this.f625i4) {
            c5 c5Var2 = weakReference.get();
            if (c5Var2 == null || c5Var2 == c5Var) {
                this.f625i4.remove(weakReference);
            }
        }
    }

    public fb w(int i, KeyEvent keyEvent) {
        ArrayList<fb> arrayList = this.f635x4;
        arrayList.clear();
        p(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zZ6 = z6();
        for (int i5 = 0; i5 < size; i5++) {
            fb fbVar = arrayList.get(i5);
            char alphabeticShortcut = zZ6 ? fbVar.getAlphabeticShortcut() : fbVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zZ6 && alphabeticShortcut == '\b' && i == 67))) {
                return fbVar;
            }
        }
        return null;
    }

    public void x(boolean z) {
        if (this.f628p) {
            this.f627mt = true;
            if (z) {
                this.f621co = true;
                return;
            }
            return;
        }
        if (z) {
            this.f630s = true;
            this.f622f = true;
        }
        c5(z);
    }

    public fb x4() {
        return this.f3;
    }

    public int xc(int i) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.f619a.get(i5).getItemId() == i) {
                return i5;
            }
        }
        return -1;
    }

    public void xg() {
        if (this.f628p) {
            return;
        }
        this.f628p = true;
        this.f627mt = false;
        this.f621co = false;
    }

    public MenuItem y(int i, int i5, int i8, CharSequence charSequence) {
        int iFh = fh(i8);
        fb fbVarFb = fb(i, i5, i8, iFh, charSequence, this.f631t);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f632tl;
        if (contextMenuInfo != null) {
            fbVarFb.x4(contextMenuInfo);
        }
        ArrayList<fb> arrayList = this.f619a;
        arrayList.add(wz(arrayList, iFh), fbVarFb);
        x(true);
        return fbVarFb;
    }

    public void y5() {
        this.f628p = false;
        if (this.f627mt) {
            this.f627mt = false;
            x(this.f621co);
        }
    }

    public final void yt(int i, boolean z) {
        if (i < 0 || i >= this.f619a.size()) {
            return;
        }
        this.f619a.remove(i);
        if (z) {
            x(true);
        }
    }

    public String z() {
        return "android:menu:actionviewstates";
    }

    public boolean z6() {
        return this.zn;
    }

    public void zn(c5 c5Var, Context context) {
        this.f625i4.add(new WeakReference<>(c5Var));
        c5Var.c5(context, this);
        this.f622f = true;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return y(0, 0, 0, this.n3.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.n3.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i5, int i8, CharSequence charSequence) {
        return y(i, i5, i8, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i5, int i8, CharSequence charSequence) {
        fb fbVar = (fb) y(i, i5, i8, charSequence);
        t tVar = new t(this.y, this, fbVar);
        fbVar.f3(tVar);
        return tVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i5, int i8, int i10) {
        return y(i, i5, i8, this.n3.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i5, int i8, int i10) {
        return addSubMenu(i, i5, i8, this.n3.getString(i10));
    }
}
