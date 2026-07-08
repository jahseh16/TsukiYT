package t;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public Runnable f8080co;
    public zn f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Drawable f8082fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8083p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f8084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f8085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8086t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Rect f8087v;
    public gv y;
    public long z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8081f = 255;
    public int w = -1;

    public static abstract class gv extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f8088a;
        public int c;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public boolean f8089c5;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public int f8090co;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ColorStateList f8091d;
        public int d0;

        /* JADX INFO: renamed from: ej, reason: collision with root package name */
        public boolean f8092ej;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Rect f8093f;
        public boolean f3;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public Drawable[] f8094fb;
        public int fh;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f8095gv;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        public boolean f8096i4;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public boolean f8097i9;
        public ColorFilter mg;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public boolean f8098mt;
        public boolean n;
        public Resources n3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f8099p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f8100r;
        public boolean rz;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f8101s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f8102t;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        public boolean f8103ta;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public boolean f8104tl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public boolean f8105ud;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8106v;
        public int w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public int f8107wz;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public boolean f8108x4;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public int f8109xc;
        public final n3 y;
        public boolean z;

        /* JADX INFO: renamed from: z6, reason: collision with root package name */
        public PorterDuff.Mode f8110z6;
        public int zn;

        public gv(gv gvVar, n3 n3Var, Resources resources) {
            this.f8089c5 = false;
            this.f8102t = false;
            this.f3 = true;
            this.d0 = 0;
            this.fh = 0;
            this.y = n3Var;
            this.n3 = resources != null ? resources : gvVar != null ? gvVar.n3 : null;
            int iA = n3.a(resources, gvVar != null ? gvVar.zn : 0);
            this.zn = iA;
            if (gvVar == null) {
                this.f8094fb = new Drawable[10];
                this.f8101s = 0;
                return;
            }
            this.f8095gv = gvVar.f8095gv;
            this.f8106v = gvVar.f8106v;
            this.f8108x4 = true;
            this.f8096i4 = true;
            this.f8089c5 = gvVar.f8089c5;
            this.f8102t = gvVar.f8102t;
            this.f3 = gvVar.f3;
            this.n = gvVar.n;
            this.c = gvVar.c;
            this.d0 = gvVar.d0;
            this.fh = gvVar.fh;
            this.rz = gvVar.rz;
            this.mg = gvVar.mg;
            this.f8103ta = gvVar.f8103ta;
            this.f8091d = gvVar.f8091d;
            this.f8110z6 = gvVar.f8110z6;
            this.f8092ej = gvVar.f8092ej;
            this.f8105ud = gvVar.f8105ud;
            if (gvVar.zn == iA) {
                if (gvVar.f8097i9) {
                    this.f8093f = gvVar.f8093f != null ? new Rect(gvVar.f8093f) : null;
                    this.f8097i9 = true;
                }
                if (gvVar.f8104tl) {
                    this.f8107wz = gvVar.f8107wz;
                    this.f8109xc = gvVar.f8109xc;
                    this.w = gvVar.w;
                    this.f8099p = gvVar.f8099p;
                    this.f8104tl = true;
                }
            }
            if (gvVar.f8098mt) {
                this.f8090co = gvVar.f8090co;
                this.f8098mt = true;
            }
            if (gvVar.z) {
                this.f8100r = gvVar.f8100r;
                this.z = true;
            }
            Drawable[] drawableArr = gvVar.f8094fb;
            this.f8094fb = new Drawable[drawableArr.length];
            this.f8101s = gvVar.f8101s;
            SparseArray<Drawable.ConstantState> sparseArray = gvVar.f8088a;
            if (sparseArray != null) {
                this.f8088a = sparseArray.clone();
            } else {
                this.f8088a = new SparseArray<>(this.f8101s);
            }
            int i = this.f8101s;
            for (int i5 = 0; i5 < i; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f8088a.put(i5, constantState);
                    } else {
                        this.f8094fb[i5] = drawableArr[i5];
                    }
                }
            }
        }

        public final int a() {
            return this.f8094fb.length;
        }

        public final int c5() {
            if (!this.f8104tl) {
                gv();
            }
            return this.f8109xc;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f8101s;
            Drawable[] drawableArr = this.f8094fb;
            for (int i5 = 0; i5 < i; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f8088a.get(i5);
                    if (constantState != null && C0171n3.y(constantState)) {
                        return true;
                    }
                } else if (a8.y.n3(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable co(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                a8.y.tl(drawable, this.c);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.y);
            return drawableMutate;
        }

        public final int f() {
            if (!this.f8104tl) {
                gv();
            }
            return this.w;
        }

        public final void f3(boolean z) {
            this.f8089c5 = z;
        }

        public final Drawable fb(int i) {
            int iIndexOfKey;
            Drawable drawable = this.f8094fb[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f8088a;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawableCo = co(this.f8088a.valueAt(iIndexOfKey).newDrawable(this.n3));
            this.f8094fb[i] = drawableCo;
            this.f8088a.removeAt(iIndexOfKey);
            if (this.f8088a.size() == 0) {
                this.f8088a = null;
            }
            return drawableCo;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f8095gv | this.f8106v;
        }

        public void gv() {
            this.f8104tl = true;
            v();
            int i = this.f8101s;
            Drawable[] drawableArr = this.f8094fb;
            this.f8109xc = -1;
            this.f8107wz = -1;
            this.f8099p = 0;
            this.w = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Drawable drawable = drawableArr[i5];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f8107wz) {
                    this.f8107wz = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f8109xc) {
                    this.f8109xc = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.w) {
                    this.w = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f8099p) {
                    this.f8099p = minimumHeight;
                }
            }
        }

        public final boolean i4(int i, int i5) {
            int i8 = this.f8101s;
            Drawable[] drawableArr = this.f8094fb;
            boolean z = false;
            for (int i10 = 0; i10 < i8; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    boolean zTl = Build.VERSION.SDK_INT >= 23 ? a8.y.tl(drawable, i) : false;
                    if (i10 == i5) {
                        z = zTl;
                    }
                }
            }
            this.c = i;
            return z;
        }

        public final int i9() {
            if (!this.f8104tl) {
                gv();
            }
            return this.f8099p;
        }

        public abstract void mt();

        public final void n(Resources resources) {
            if (resources != null) {
                this.n3 = resources;
                int iA = n3.a(resources, this.zn);
                int i = this.zn;
                this.zn = iA;
                if (i != iA) {
                    this.f8104tl = false;
                    this.f8097i9 = false;
                }
            }
        }

        public final void n3(Resources.Theme theme) {
            if (theme != null) {
                v();
                int i = this.f8101s;
                Drawable[] drawableArr = this.f8094fb;
                for (int i5 = 0; i5 < i; i5++) {
                    Drawable drawable = drawableArr[i5];
                    if (drawable != null && a8.y.n3(drawable)) {
                        a8.y.y(drawableArr[i5], theme);
                        this.f8106v |= drawableArr[i5].getChangingConfigurations();
                    }
                }
                n(C0171n3.zn(theme));
            }
        }

        public final boolean p() {
            return this.f8102t;
        }

        public final void r(int i) {
            this.d0 = i;
        }

        public final int s() {
            return this.f8101s;
        }

        public final Rect t() {
            Rect rect = null;
            if (this.f8089c5) {
                return null;
            }
            Rect rect2 = this.f8093f;
            if (rect2 != null || this.f8097i9) {
                return rect2;
            }
            v();
            Rect rect3 = new Rect();
            int i = this.f8101s;
            Drawable[] drawableArr = this.f8094fb;
            for (int i5 = 0; i5 < i; i5++) {
                if (drawableArr[i5].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i8 = rect3.left;
                    if (i8 > rect.left) {
                        rect.left = i8;
                    }
                    int i10 = rect3.top;
                    if (i10 > rect.top) {
                        rect.top = i10;
                    }
                    int i11 = rect3.right;
                    if (i11 > rect.right) {
                        rect.right = i11;
                    }
                    int i12 = rect3.bottom;
                    if (i12 > rect.bottom) {
                        rect.bottom = i12;
                    }
                }
            }
            this.f8097i9 = true;
            this.f8093f = rect;
            return rect;
        }

        public final int tl() {
            if (!this.f8104tl) {
                gv();
            }
            return this.f8107wz;
        }

        public final void v() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f8088a;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f8094fb[this.f8088a.keyAt(i)] = co(this.f8088a.valueAt(i).newDrawable(this.n3));
                }
                this.f8088a = null;
            }
        }

        public void w() {
            this.f8098mt = false;
            this.z = false;
        }

        public final int wz() {
            if (this.f8098mt) {
                return this.f8090co;
            }
            v();
            int i = this.f8101s;
            Drawable[] drawableArr = this.f8094fb;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i5 = 1; i5 < i; i5++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i5].getOpacity());
            }
            this.f8090co = opacity;
            this.f8098mt = true;
            return opacity;
        }

        public final void x4(int i) {
            this.fh = i;
        }

        public void xc(int i, int i5) {
            Drawable[] drawableArr = new Drawable[i5];
            Drawable[] drawableArr2 = this.f8094fb;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f8094fb = drawableArr;
        }

        public final int y(Drawable drawable) {
            int i = this.f8101s;
            if (i >= this.f8094fb.length) {
                xc(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.y);
            this.f8094fb[i] = drawable;
            this.f8101s++;
            this.f8106v = drawable.getChangingConfigurations() | this.f8106v;
            w();
            this.f8093f = null;
            this.f8097i9 = false;
            this.f8104tl = false;
            this.f8108x4 = false;
            return i;
        }

        public final void z(boolean z) {
            this.f8102t = z;
        }

        public boolean zn() {
            if (this.f8108x4) {
                return this.f8096i4;
            }
            v();
            this.f8108x4 = true;
            int i = this.f8101s;
            Drawable[] drawableArr = this.f8094fb;
            for (int i5 = 0; i5 < i; i5++) {
                if (drawableArr[i5].getConstantState() == null) {
                    this.f8096i4 = false;
                    return false;
                }
            }
            this.f8096i4 = true;
            return true;
        }
    }

    /* JADX INFO: renamed from: t.n3$n3, reason: collision with other inner class name */
    public static class C0171n3 {
        public static void n3(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static boolean y(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static Resources zn(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n3.this.y(true);
            n3.this.invalidateSelf();
        }
    }

    public static int a(@Nullable Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(@NonNull Resources.Theme theme) {
        this.y.n3(theme);
    }

    public final void c5(Resources resources) {
        this.y.n(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.y.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f8082fb;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f8085s;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fb(int r10) {
        /*
            r9 = this;
            int r0 = r9.w
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            t.n3$gv r0 = r9.y
            int r0 = r0.fh
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f8085s
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f8082fb
            if (r0 == 0) goto L29
            r9.f8085s = r0
            t.n3$gv r0 = r9.y
            int r0 = r0.fh
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f8084r = r0
            goto L35
        L29:
            r9.f8085s = r4
            r9.f8084r = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f8082fb
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            t.n3$gv r0 = r9.y
            int r1 = r0.f8101s
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.fb(r10)
            r9.f8082fb = r0
            r9.w = r10
            if (r0 == 0) goto L5a
            t.n3$gv r10 = r9.y
            int r10 = r10.d0
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.z = r2
        L51:
            r9.gv(r0)
            goto L5a
        L55:
            r9.f8082fb = r4
            r10 = -1
            r9.w = r10
        L5a:
            long r0 = r9.z
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f8084r
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f8080co
            if (r0 != 0) goto L73
            t.n3$y r0 = new t.n3$y
            r0.<init>()
            r9.f8080co = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.y(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t.n3.fb(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8081f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.y.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.y.zn()) {
            return null;
        }
        this.y.f8095gv = getChangingConfigurations();
        return this.y;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f8082fb;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.f8087v;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.y.p()) {
            return this.y.c5();
        }
        Drawable drawable = this.f8082fb;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.y.p()) {
            return this.y.tl();
        }
        Drawable drawable = this.f8082fb;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.y.p()) {
            return this.y.i9();
        }
        Drawable drawable = this.f8082fb;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.y.p()) {
            return this.y.f();
        }
        Drawable drawable = this.f8082fb;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f8082fb;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.y.wz();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f8082fb;
        if (drawable != null) {
            C0171n3.n3(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        boolean padding;
        Rect rectT = this.y.t();
        if (rectT != null) {
            rect.set(rectT);
            padding = (rectT.right | ((rectT.left | rectT.top) | rectT.bottom)) != 0;
        } else {
            Drawable drawable = this.f8082fb;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (v()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    public final void gv(Drawable drawable) {
        if (this.f3 == null) {
            this.f3 = new zn();
        }
        drawable.setCallback(this.f3.n3(drawable.getCallback()));
        try {
            if (this.y.d0 <= 0 && this.f8086t) {
                drawable.setAlpha(this.f8081f);
            }
            gv gvVar = this.y;
            if (gvVar.f8103ta) {
                drawable.setColorFilter(gvVar.mg);
            } else {
                if (gvVar.f8092ej) {
                    a8.y.xc(drawable, gvVar.f8091d);
                }
                gv gvVar2 = this.y;
                if (gvVar2.f8105ud) {
                    a8.y.w(drawable, gvVar2.f8110z6);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.y.f3);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                a8.y.tl(drawable, a8.y.a(this));
            }
            a8.y.i9(drawable, this.y.rz);
            Rect rect = this.f8087v;
            if (rect != null) {
                a8.y.t(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f3.y());
        } catch (Throwable th) {
            drawable.setCallback(this.f3.y());
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        gv gvVar = this.y;
        if (gvVar != null) {
            gvVar.w();
        }
        if (drawable != this.f8082fb || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.y.rz;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f8085s;
        boolean z5 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f8085s = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f8082fb;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f8086t) {
                this.f8082fb.setAlpha(this.f8081f);
            }
        }
        if (this.f8084r != 0) {
            this.f8084r = 0L;
            z = true;
        }
        if (this.z != 0) {
            this.z = 0L;
        } else {
            z5 = z;
        }
        if (z5) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f8083p && super.mutate() == this) {
            gv gvVarN3 = n3();
            gvVarN3.mt();
            s(gvVarN3);
            this.f8083p = true;
        }
        return this;
    }

    public gv n3() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8085s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f8082fb;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.y.i4(i, zn());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f8085s;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f8082fb;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f8085s;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f8082fb;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void s(gv gvVar) {
        this.y = gvVar;
        int i = this.w;
        if (i >= 0) {
            Drawable drawableFb = gvVar.fb(i);
            this.f8082fb = drawableFb;
            if (drawableFb != null) {
                gv(drawableFb);
            }
        }
        this.f8085s = null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        if (drawable != this.f8082fb || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f8086t && this.f8081f == i) {
            return;
        }
        this.f8086t = true;
        this.f8081f = i;
        Drawable drawable = this.f8082fb;
        if (drawable != null) {
            if (this.z == 0) {
                drawable.setAlpha(i);
            } else {
                y(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        gv gvVar = this.y;
        if (gvVar.rz != z) {
            gvVar.rz = z;
            Drawable drawable = this.f8082fb;
            if (drawable != null) {
                a8.y.i9(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        gv gvVar = this.y;
        gvVar.f8103ta = true;
        if (gvVar.mg != colorFilter) {
            gvVar.mg = colorFilter;
            Drawable drawable = this.f8082fb;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        gv gvVar = this.y;
        if (gvVar.f3 != z) {
            gvVar.f3 = z;
            Drawable drawable = this.f8082fb;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f3, float f4) {
        Drawable drawable = this.f8082fb;
        if (drawable != null) {
            a8.y.f(drawable, f3, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i5, int i8, int i10) {
        Rect rect = this.f8087v;
        if (rect == null) {
            this.f8087v = new Rect(i, i5, i8, i10);
        } else {
            rect.set(i, i5, i8, i10);
        }
        Drawable drawable = this.f8082fb;
        if (drawable != null) {
            a8.y.t(drawable, i, i5, i8, i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        gv gvVar = this.y;
        gvVar.f8092ej = true;
        if (gvVar.f8091d != colorStateList) {
            gvVar.f8091d = colorStateList;
            a8.y.xc(this.f8082fb, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        gv gvVar = this.y;
        gvVar.f8105ud = true;
        if (gvVar.f8110z6 != mode) {
            gvVar.f8110z6 = mode;
            a8.y.w(this.f8082fb, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z5) {
        boolean visible = super.setVisible(z, z5);
        Drawable drawable = this.f8085s;
        if (drawable != null) {
            drawable.setVisible(z, z5);
        }
        Drawable drawable2 = this.f8082fb;
        if (drawable2 != null) {
            drawable2.setVisible(z, z5);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable != this.f8082fb || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    public final boolean v() {
        return isAutoMirrored() && a8.y.a(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f8086t = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f8082fb
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.z
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f8081f
            r3.setAlpha(r9)
            r13.z = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            t.n3$gv r9 = r13.y
            int r9 = r9.d0
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f8081f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.z = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f8085s
            if (r9 == 0) goto L65
            long r10 = r13.f8084r
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f8085s = r0
            r13.f8084r = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            t.n3$gv r4 = r13.y
            int r4 = r4.fh
            int r3 = r3 / r4
            int r4 = r13.f8081f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f8084r = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f8080co
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.n3.y(boolean):void");
    }

    public int zn() {
        return this.w;
    }

    public static class zn implements Drawable.Callback {
        public Drawable.Callback y;

        public zn n3(Drawable.Callback callback) {
            this.y = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
            Drawable.Callback callback = this.y;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            Drawable.Callback callback = this.y;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        public Drawable.Callback y() {
            Drawable.Callback callback = this.y;
            this.y = null;
            return callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
        }
    }
}
