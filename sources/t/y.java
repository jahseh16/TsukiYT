package t;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.resources.R$styleable;
import ej.f;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t.gv;
import t.n3;
import w.g;
import x4.c5;
import x5.s;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class y extends t.gv implements a8.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8111d;
    public zn d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public int f8112ej;
    public fb fh;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8113x;

    public static class a implements TimeInterpolator {
        public int n3;
        public int[] y;
        public int zn;

        public a(AnimationDrawable animationDrawable, boolean z) {
            n3(animationDrawable, z);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f3) {
            int i = (int) ((f3 * this.zn) + 0.5f);
            int i5 = this.n3;
            int[] iArr = this.y;
            int i8 = 0;
            while (i8 < i5) {
                int i10 = iArr[i8];
                if (i < i10) {
                    break;
                }
                i -= i10;
                i8++;
            }
            return (i8 / i5) + (i8 < i5 ? i / this.zn : 0.0f);
        }

        public int n3(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.n3 = numberOfFrames;
            int[] iArr = this.y;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.y = new int[numberOfFrames];
            }
            int[] iArr2 = this.y;
            int i = 0;
            for (int i5 = 0; i5 < numberOfFrames; i5++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i5) - 1 : i5);
                iArr2[i5] = duration;
                i += duration;
            }
            this.zn = i;
            return i;
        }

        public int y() {
            return this.zn;
        }
    }

    public static class gv extends fb {
        public final x5.zn y;

        public gv(x5.zn znVar) {
            super();
            this.y = znVar;
        }

        @Override // t.y.fb
        public void gv() {
            this.y.stop();
        }

        @Override // t.y.fb
        public void zn() {
            this.y.start();
        }
    }

    public static class n3 extends fb {
        public final Animatable y;

        public n3(Animatable animatable) {
            super();
            this.y = animatable;
        }

        @Override // t.y.fb
        public void gv() {
            this.y.stop();
        }

        @Override // t.y.fb
        public void zn() {
            this.y.start();
        }
    }

    public static class v extends fb {
        public final boolean n3;
        public final ObjectAnimator y;

        public v(AnimationDrawable animationDrawable, boolean z, boolean z5) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i5 = z ? 0 : numberOfFrames - 1;
            a aVar = new a(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i5);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(aVar.y());
            objectAnimatorOfInt.setInterpolator(aVar);
            this.n3 = z5;
            this.y = objectAnimatorOfInt;
        }

        @Override // t.y.fb
        public void gv() {
            this.y.cancel();
        }

        @Override // t.y.fb
        public void n3() {
            this.y.reverse();
        }

        @Override // t.y.fb
        public boolean y() {
            return this.n3;
        }

        @Override // t.y.fb
        public void zn() {
            this.y.start();
        }
    }

    public static class zn extends gv.y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c5<Integer> f8114b;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public x4.v<Long> f8115x;

        public zn(@Nullable zn znVar, @NonNull y yVar, @Nullable Resources resources) {
            super(znVar, yVar, resources);
            if (znVar != null) {
                this.f8115x = znVar.f8115x;
                this.f8114b = znVar.f8114b;
            } else {
                this.f8115x = new x4.v<>();
                this.f8114b = new c5<>();
            }
        }

        public static long mg(int i, int i5) {
            return ((long) i5) | (((long) i) << 32);
        }

        public int d(@NonNull int[] iArr) {
            int iD0 = super.d0(iArr);
            return iD0 >= 0 ? iD0 : super.d0(StateSet.WILD_CARD);
        }

        public boolean ej(int i, int i5) {
            return (this.f8115x.c5(mg(i, i5), -1L).longValue() & 4294967296L) != 0;
        }

        public int fh(@NonNull int[] iArr, @NonNull Drawable drawable, int i) {
            int iC = super.c(iArr, drawable);
            this.f8114b.tl(iC, Integer.valueOf(i));
            return iC;
        }

        @Override // t.gv.y, t.n3.gv
        public void mt() {
            this.f8115x = this.f8115x.clone();
            this.f8114b = this.f8114b.clone();
        }

        @Override // t.gv.y, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new y(this, null);
        }

        public int rz(int i, int i5, @NonNull Drawable drawable, boolean z) {
            int iY = super.y(drawable);
            long jMg = mg(i, i5);
            long j = z ? 8589934592L : 0L;
            long j4 = iY;
            this.f8115x.n3(jMg, Long.valueOf(j4 | j));
            if (z) {
                this.f8115x.n3(mg(i5, i), Long.valueOf(4294967296L | j4 | j));
            }
            return iY;
        }

        public int ta(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f8114b.s(i, 0).intValue();
        }

        public boolean ud(int i, int i5) {
            return (this.f8115x.c5(mg(i, i5), -1L).longValue() & 8589934592L) != 0;
        }

        public int z6(int i, int i5) {
            return (int) this.f8115x.c5(mg(i, i5), -1L).longValue();
        }

        @Override // t.gv.y, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new y(this, resources);
        }
    }

    public y() {
        this(null, null);
    }

    public static y tl(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            y yVar = new y();
            yVar.wz(context, resources, xmlPullParser, attributeSet, theme);
            return yVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // t.gv, t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public final boolean co(int i) {
        int iZn;
        int iZ6;
        fb n3Var;
        fb fbVar = this.fh;
        if (fbVar == null) {
            iZn = zn();
        } else {
            if (i == this.f8111d) {
                return true;
            }
            if (i == this.f8112ej && fbVar.y()) {
                fbVar.n3();
                this.f8111d = this.f8112ej;
                this.f8112ej = i;
                return true;
            }
            iZn = this.f8111d;
            fbVar.gv();
        }
        this.fh = null;
        this.f8112ej = -1;
        this.f8111d = -1;
        zn znVar = this.d0;
        int iTa = znVar.ta(iZn);
        int iTa2 = znVar.ta(i);
        if (iTa2 == 0 || iTa == 0 || (iZ6 = znVar.z6(iTa, iTa2)) < 0) {
            return false;
        }
        boolean zUd = znVar.ud(iTa, iTa2);
        fb(iZ6);
        x5.zn current = getCurrent();
        if (current instanceof AnimationDrawable) {
            n3Var = new v((AnimationDrawable) current, znVar.ej(iTa, iTa2), zUd);
        } else {
            if (!(current instanceof x5.zn)) {
                if (current instanceof Animatable) {
                    n3Var = new n3((Animatable) current);
                }
                return false;
            }
            n3Var = new gv(current);
        }
        n3Var.zn();
        this.fh = n3Var;
        this.f8112ej = iZn;
        this.f8111d = i;
        return true;
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    @NonNull
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(@NonNull Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(@NonNull Outline outline) {
        super.getOutline(outline);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(@NonNull Rect rect) {
        return super.getPadding(rect);
    }

    @Override // t.n3, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(@NonNull Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // t.gv, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        fb fbVar = this.fh;
        if (fbVar != null) {
            fbVar.gv();
            this.fh = null;
            fb(this.f8111d);
            this.f8111d = -1;
            this.f8112ej = -1;
        }
    }

    public final int mt(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayF = f.f(resources, theme, attributeSet, R$styleable.f577f);
        int resourceId = typedArrayF.getResourceId(R$styleable.f588wz, -1);
        int resourceId2 = typedArrayF.getResourceId(R$styleable.f586tl, -1);
        int resourceId3 = typedArrayF.getResourceId(R$styleable.f585t, -1);
        Drawable drawableI9 = resourceId3 > 0 ? g.s().i9(context, resourceId3) : null;
        boolean z = typedArrayF.getBoolean(R$styleable.f590xc, false);
        typedArrayF.recycle();
        if (drawableI9 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableI9 = xmlPullParser.getName().equals("animated-vector") ? x5.zn.y(context, resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableI9 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.d0.rz(resourceId, resourceId2, drawableI9, z);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    @Override // t.gv, t.n3, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f8113x && super.mutate() == this) {
            this.d0.mt();
            this.f8113x = true;
        }
        return this;
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    @Override // t.gv, t.n3, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int iD = this.d0.d(iArr);
        boolean z = iD != zn() && (co(iD) || fb(iD));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public final int p(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayF = f.f(resources, theme, attributeSet, R$styleable.f584s);
        int resourceId = typedArrayF.getResourceId(R$styleable.f575c5, 0);
        int resourceId2 = typedArrayF.getResourceId(R$styleable.f580i9, -1);
        Drawable drawableI9 = resourceId2 > 0 ? g.s().i9(context, resourceId2) : null;
        typedArrayF.recycle();
        int[] iArrF = f(attributeSet);
        if (drawableI9 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableI9 = xmlPullParser.getName().equals("vector") ? s.zn(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableI9 != null) {
            return this.d0.fh(iArrF, drawableI9, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    @Override // t.gv, t.n3
    public void s(@NonNull n3.gv gvVar) {
        super.s(gvVar);
        if (gvVar instanceof zn) {
            this.d0 = (zn) gvVar;
        }
    }

    @Override // t.n3, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f3, float f4) {
        super.setHotspot(f3, f4);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i5, int i8, int i10) {
        super.setHotspotBounds(i, i5, i8, i10);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(@NonNull PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // t.n3, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z5) {
        boolean visible = super.setVisible(z, z5);
        fb fbVar = this.fh;
        if (fbVar != null && (visible || z5)) {
            if (z) {
                fbVar.zn();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // t.gv, t.n3
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public zn n3() {
        return new zn(this.d0, this, null);
    }

    @Override // t.n3, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public final void w() {
        onStateChange(getState());
    }

    public void wz(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayF = f.f(resources, theme, attributeSet, R$styleable.y);
        setVisible(typedArrayF.getBoolean(R$styleable.zn, true), true);
        z(typedArrayF);
        c5(resources);
        typedArrayF.recycle();
        xc(context, resources, xmlPullParser, attributeSet, theme);
        w();
    }

    public final void xc(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    p(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    mt(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    public final void z(TypedArray typedArray) {
        zn znVar = this.d0;
        znVar.f8095gv |= typedArray.getChangingConfigurations();
        znVar.f3(typedArray.getBoolean(R$styleable.f579gv, znVar.f8089c5));
        znVar.z(typedArray.getBoolean(R$styleable.f587v, znVar.f8102t));
        znVar.r(typedArray.getInt(R$styleable.f574a, znVar.d0));
        znVar.x4(typedArray.getInt(R$styleable.f578fb, znVar.fh));
        setDither(typedArray.getBoolean(R$styleable.n3, znVar.f3));
    }

    public y(@Nullable zn znVar, @Nullable Resources resources) {
        super(null);
        this.f8111d = -1;
        this.f8112ej = -1;
        s(new zn(znVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static abstract class fb {
        public fb() {
        }

        public abstract void gv();

        public boolean y() {
            return false;
        }

        public abstract void zn();

        public void n3() {
        }
    }
}
