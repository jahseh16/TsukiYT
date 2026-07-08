package ej;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final ThreadLocal<TypedValue> y = new ThreadLocal<>();
    public static final WeakHashMap<gv, SparseArray<zn>> n3 = new WeakHashMap<>(0);
    public static final Object zn = new Object();

    public static final class a {
        public static void y(@NonNull Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                n3.y(theme);
            } else if (i >= 23) {
                y.y(theme);
            }
        }
    }

    public static final class gv {
        public final Resources.Theme n3;
        public final Resources y;

        public gv(@NonNull Resources resources, @Nullable Resources.Theme theme) {
            this.y = resources;
            this.n3 = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || gv.class != obj.getClass()) {
                return false;
            }
            gv gvVar = (gv) obj;
            return this.y.equals(gvVar.y) && j5.zn.y(this.n3, gvVar.n3);
        }

        public int hashCode() {
            return j5.zn.n3(this.y, this.n3);
        }
    }

    public static class n3 {
        @NonNull
        public static ColorStateList n3(@NonNull Resources resources, int i, @Nullable Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }

        public static int y(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }
    }

    public static abstract class v {
        @NonNull
        public static Handler v(@Nullable Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public abstract void fb(@NonNull Typeface typeface);

        public final void gv(@NonNull Typeface typeface, @Nullable Handler handler) {
            v(handler).post(new c5(this, typeface));
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public abstract void a(int i);

        public final void zn(int i, @Nullable Handler handler) {
            v(handler).post(new i9(this, i));
        }
    }

    public static class y {
        public static Drawable n3(Resources resources, int i, int i5, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i5, theme);
        }

        public static Drawable y(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }
    }

    public static class zn {
        public final Configuration n3;
        public final ColorStateList y;
        public final int zn;

        public zn(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, @Nullable Resources.Theme theme) {
            this.y = colorStateList;
            this.n3 = configuration;
            this.zn = theme == null ? 0 : theme.hashCode();
        }
    }

    @Nullable
    public static Drawable a(@NonNull Resources resources, int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return y.y(resources, i, theme);
    }

    public static void c5(@NonNull Context context, int i, @NonNull v vVar, @Nullable Handler handler) throws Resources.NotFoundException {
        j5.s.fb(vVar);
        if (context.isRestricted()) {
            vVar.zn(-4, handler);
        } else {
            tl(context, i, new TypedValue(), 0, vVar, handler, false, false);
        }
    }

    @Nullable
    public static ColorStateList f(Resources resources, int i, @Nullable Resources.Theme theme) {
        if (t(resources, i)) {
            return null;
        }
        try {
            return ej.zn.y(resources, resources.getXml(i), theme);
        } catch (Exception e4) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e4);
            return null;
        }
    }

    @Nullable
    public static Typeface fb(@NonNull Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return tl(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static int gv(@NonNull Resources resources, int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 23 ? n3.y(resources, i, theme) : resources.getColor(i);
    }

    @NonNull
    public static TypedValue i9() {
        ThreadLocal<TypedValue> threadLocal = y;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.zn == r5.hashCode()) goto L22;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList n3(@androidx.annotation.NonNull ej.s.gv r5, int r6) {
        /*
            java.lang.Object r0 = ej.s.zn
            monitor-enter(r0)
            java.util.WeakHashMap<ej.s$gv, android.util.SparseArray<ej.s$zn>> r1 = ej.s.n3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            ej.s$zn r2 = (ej.s.zn) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.n3     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.y     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.n3     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.zn     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.zn     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.y     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ej.s.n3(ej.s$gv, int):android.content.res.ColorStateList");
    }

    @Nullable
    public static Typeface s(@NonNull Context context, int i, @NonNull TypedValue typedValue, int i5, @Nullable v vVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return tl(context, i, typedValue, i5, vVar, null, true, false);
    }

    public static boolean t(@NonNull Resources resources, int i) {
        TypedValue typedValueI9 = i9();
        resources.getValue(i, typedValueI9, true);
        int i5 = typedValueI9.type;
        return i5 >= 28 && i5 <= 31;
    }

    public static Typeface tl(@NonNull Context context, int i, @NonNull TypedValue typedValue, int i5, @Nullable v vVar, @Nullable Handler handler, boolean z, boolean z5) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceWz = wz(context, resources, typedValue, i, i5, vVar, handler, z, z5);
        if (typefaceWz != null || vVar != null || z5) {
            return typefaceWz;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    @Nullable
    public static ColorStateList v(@NonNull Resources resources, int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        gv gvVar = new gv(resources, theme);
        ColorStateList colorStateListN3 = n3(gvVar, i);
        if (colorStateListN3 != null) {
            return colorStateListN3;
        }
        ColorStateList colorStateListF = f(resources, i, theme);
        if (colorStateListF == null) {
            return Build.VERSION.SDK_INT >= 23 ? n3.n3(resources, i, theme) : resources.getColorStateList(i);
        }
        y(gvVar, i, colorStateListF, theme);
        return colorStateListF;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface wz(@androidx.annotation.NonNull android.content.Context r16, android.content.res.Resources r17, @androidx.annotation.NonNull android.util.TypedValue r18, int r19, int r20, @androidx.annotation.Nullable ej.s.v r21, @androidx.annotation.Nullable android.os.Handler r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ej.s.wz(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, ej.s$v, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    public static void y(@NonNull gv gvVar, int i, @NonNull ColorStateList colorStateList, @Nullable Resources.Theme theme) {
        synchronized (zn) {
            try {
                WeakHashMap<gv, SparseArray<zn>> weakHashMap = n3;
                SparseArray<zn> sparseArray = weakHashMap.get(gvVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(gvVar, sparseArray);
                }
                sparseArray.append(i, new zn(colorStateList, gvVar.y.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public static Typeface zn(@NonNull Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return tl(context, i, new TypedValue(), 0, null, null, false, true);
    }
}
