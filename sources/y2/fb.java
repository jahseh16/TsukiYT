package y2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import java.util.BitSet;
import y2.f;
import y2.t;
import y2.tl;

/* JADX INFO: loaded from: classes.dex */
public class fb extends Drawable implements a8.a, wz {
    public static final Paint o = new Paint(1);
    public static final String qn = "fb";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f9252b;
    public final Paint c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final RectF f9253co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final t.n3 f9254d;
    public final Paint d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final t f9255ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9256f;
    public final Region f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final tl.fb[] f9257fb;
    public final v2.y fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    @NonNull
    public final RectF f9258hw;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public boolean f9259j5;
    public f n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Path f9260p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Region f9261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final BitSet f9262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Matrix f9263t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final tl.fb[] f9264v;
    public final Path w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f9265x;
    public zn y;
    public final RectF z;

    public class n3 implements f.zn {
        public final /* synthetic */ float y;

        public n3(float f3) {
            this.y = f3;
        }

        @Override // y2.f.zn
        @NonNull
        public y2.zn y(@NonNull y2.zn znVar) {
            return znVar instanceof c5 ? znVar : new y2.n3(this.y, znVar);
        }
    }

    public class y implements t.n3 {
        public y() {
        }

        @Override // y2.t.n3
        public void n3(@NonNull tl tlVar, Matrix matrix, int i) {
            fb.this.f9262s.set(i, tlVar.v());
            fb.this.f9264v[i] = tlVar.a(matrix);
        }

        @Override // y2.t.n3
        public void y(@NonNull tl tlVar, Matrix matrix, int i) {
            fb.this.f9262s.set(i + 4, tlVar.v());
            fb.this.f9257fb[i] = tlVar.a(matrix);
        }
    }

    public /* synthetic */ fb(zn znVar, y yVar) {
        this(znVar);
    }

    public static int qn(int i, int i5) {
        return (i * (i5 + (i5 >>> 7))) >>> 8;
    }

    @NonNull
    public static fb tl(Context context, float f3) {
        int iZn = g2.y.zn(context, R$attr.f2181wz, fb.class.getSimpleName());
        fb fbVar = new fb();
        fbVar.k5(context);
        fbVar.k(ColorStateList.valueOf(iZn));
        fbVar.q9(f3);
        return fbVar;
    }

    @Nullable
    public final PorterDuffColorFilter a(@NonNull Paint paint, boolean z) {
        int color;
        int iT;
        if (!z || (iT = t((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(iT, PorterDuff.Mode.SRC_IN);
    }

    public final boolean a8() {
        zn znVar = this.y;
        int i = znVar.f9274p;
        return i != 1 && znVar.f9273mt > 0 && (i == 2 || j());
    }

    public final boolean b() {
        Paint.Style style = this.y.f9281x4;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.d0.getStrokeWidth() > 0.0f;
    }

    public int c() {
        return (int) (((double) this.y.f9268co) * Math.sin(Math.toRadians(r0.z)));
    }

    public final void c5() {
        f fVarN = rz().n(new n3(-mg()));
        this.n = fVarN;
        this.f9255ej.gv(fVarN, this.y.f9269f, x4(), this.f9260p);
    }

    public float co() {
        return this.y.y.i9().y(r());
    }

    public void ct(float f3) {
        this.y.f9277t = f3;
        invalidateSelf();
    }

    public float d() {
        return this.y.y.mt().y(r());
    }

    public int d0() {
        return (int) (((double) this.y.f9268co) * Math.cos(Math.toRadians(r0.z)));
    }

    public void dm(@Nullable ColorStateList colorStateList) {
        zn znVar = this.y;
        if (znVar.f9279v != colorStateList) {
            znVar.f9279v = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.c.setColorFilter(this.f9265x);
        int alpha = this.c.getAlpha();
        this.c.setAlpha(qn(alpha, this.y.f9278tl));
        this.d0.setColorFilter(this.f9252b);
        this.d0.setStrokeWidth(this.y.f9277t);
        int alpha2 = this.d0.getAlpha();
        this.d0.setAlpha(qn(alpha2, this.y.f9278tl));
        if (this.f9256f) {
            c5();
            fb(r(), this.w);
            this.f9256f = false;
        }
        j5(canvas);
        if (x()) {
            xc(canvas);
        }
        if (b()) {
            mt(canvas);
        }
        this.c.setAlpha(alpha);
        this.d0.setAlpha(alpha2);
    }

    public final void eb() {
        float fUd = ud();
        this.y.f9273mt = (int) Math.ceil(0.75f * fUd);
        this.y.f9268co = (int) Math.ceil(fUd * 0.25f);
        rs();
        yt();
    }

    public float ej() {
        return this.y.w;
    }

    public void en(int i, int i5, int i8, int i10) {
        zn znVar = this.y;
        if (znVar.f9267c5 == null) {
            znVar.f9267c5 = new Rect();
        }
        this.y.f9267c5.set(i, i5, i8, i10);
        invalidateSelf();
    }

    @NonNull
    public final PorterDuffColorFilter f(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? a(paint, z) : i9(colorStateList, mode, z);
    }

    @Nullable
    public ColorStateList f3() {
        return this.y.f9271gv;
    }

    public void f7(float f3) {
        zn znVar = this.y;
        if (znVar.f9269f != f3) {
            znVar.f9269f = f3;
            this.f9256f = true;
            invalidateSelf();
        }
    }

    public final void fb(@NonNull RectF rectF, @NonNull Path path) {
        s(rectF, path);
        if (this.y.f9272i9 != 1.0f) {
            this.f9263t.reset();
            Matrix matrix = this.f9263t;
            float f3 = this.y.f9272i9;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f9263t);
        }
        path.computeBounds(this.f9258hw, true);
    }

    public int fh() {
        return this.y.f9273mt;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.y.f9274p == 2) {
            return;
        }
        if (hw()) {
            outline.setRoundRect(getBounds(), d() * this.y.f9269f);
            return;
        }
        fb(r(), this.w);
        if (this.w.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.w);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.y.f9267c5;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f9261r.set(getBounds());
        fb(r(), this.w);
        this.f3.setPath(this.w, this.f9261r);
        this.f9261r.op(this.f3, Region.Op.DIFFERENCE);
        return this.f9261r;
    }

    public boolean hw() {
        return this.y.y.r(r());
    }

    public float i4() {
        return this.y.f9282xc;
    }

    @NonNull
    public final PorterDuffColorFilter i9(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = t(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f9256f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.y.f9270fb) != null && colorStateList.isStateful()) || (((colorStateList2 = this.y.f9266a) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.y.f9279v) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.y.f9271gv) != null && colorStateList4.isStateful())));
    }

    public boolean j() {
        return (hw() || this.w.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public final void j5(@NonNull Canvas canvas) {
        if (a8()) {
            canvas.save();
            o(canvas);
            if (!this.f9259j5) {
                wz(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f9258hw.width() - getBounds().width());
            int iHeight = (int) (this.f9258hw.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f9258hw.width()) + (this.y.f9273mt * 2) + iWidth, ((int) this.f9258hw.height()) + (this.y.f9273mt * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f3 = (getBounds().left - this.y.f9273mt) - iWidth;
            float f4 = (getBounds().top - this.y.f9273mt) - iHeight;
            canvas2.translate(-f3, -f4);
            wz(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    public void jz(Paint.Style style) {
        this.y.f9281x4 = style;
        yt();
    }

    public void k(@Nullable ColorStateList colorStateList) {
        zn znVar = this.y;
        if (znVar.f9271gv != colorStateList) {
            znVar.f9271gv = colorStateList;
            onStateChange(getState());
        }
    }

    public void k5(Context context) {
        this.y.n3 = new l2.y(context);
        eb();
    }

    public final float mg() {
        if (b()) {
            return this.d0.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final void mt(@NonNull Canvas canvas) {
        p(canvas, this.d0, this.f9260p, this.n, x4());
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.y = new zn(this.y);
        return this;
    }

    public float n() {
        return this.y.f9280wz;
    }

    public final void o(@NonNull Canvas canvas) {
        canvas.translate(c(), d0());
    }

    public final boolean o4(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.y.f9271gv == null || color2 == (colorForState2 = this.y.f9271gv.getColorForState(iArr, (color2 = this.c.getColor())))) {
            z = false;
        } else {
            this.c.setColor(colorForState2);
            z = true;
        }
        if (this.y.f9279v == null || color == (colorForState = this.y.f9279v.getColorForState(iArr, (color = this.d0.getColor())))) {
            return z;
        }
        this.d0.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f9256f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, o2.c5.n3
    public boolean onStateChange(int[] iArr) {
        boolean z = o4(iArr) || rs();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void oz(float f3) {
        setShapeAppearanceModel(this.y.y.i4(f3));
    }

    public final void p(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull f fVar, @NonNull RectF rectF) {
        if (!fVar.r(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fY = fVar.z().y(rectF) * this.y.f9269f;
            canvas.drawRoundRect(rectF, fY, fY, paint);
        }
    }

    public void q9(float f3) {
        zn znVar = this.y;
        if (znVar.f9282xc != f3) {
            znVar.f9282xc = f3;
            eb();
        }
    }

    @NonNull
    public RectF r() {
        this.f9253co.set(getBounds());
        return this.f9253co;
    }

    public final boolean rs() {
        PorterDuffColorFilter porterDuffColorFilter = this.f9265x;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f9252b;
        zn znVar = this.y;
        this.f9265x = f(znVar.f9270fb, znVar.f9276s, this.c, true);
        zn znVar2 = this.y;
        this.f9252b = f(znVar2.f9266a, znVar2.f9276s, this.d0, false);
        zn znVar3 = this.y;
        if (znVar3.f9275r) {
            this.fh.gv(znVar3.f9270fb.getColorForState(getState(), 0));
        }
        return (j5.zn.y(porterDuffColorFilter, this.f9265x) && j5.zn.y(porterDuffColorFilter2, this.f9252b)) ? false : true;
    }

    @NonNull
    public f rz() {
        return this.y.y;
    }

    public final void s(@NonNull RectF rectF, @NonNull Path path) {
        t tVar = this.f9255ej;
        zn znVar = this.y;
        tVar.v(znVar.y, znVar.f9269f, rectF, this.f9254d, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        zn znVar = this.y;
        if (znVar.f9278tl != i) {
            znVar.f9278tl = i;
            yt();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.y.zn = colorFilter;
        yt();
    }

    @Override // y2.wz
    public void setShapeAppearanceModel(@NonNull f fVar) {
        this.y.y = fVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.y.f9270fb = colorStateList;
        rs();
        yt();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        zn znVar = this.y;
        if (znVar.f9276s != mode) {
            znVar.f9276s = mode;
            rs();
            yt();
        }
    }

    public int t(int i) {
        float fUd = ud() + n();
        l2.y yVar = this.y.n3;
        return yVar != null ? yVar.zn(i, fUd) : i;
    }

    @Nullable
    public ColorStateList ta() {
        return this.y.f9270fb;
    }

    public void u(float f3) {
        zn znVar = this.y;
        if (znVar.f9280wz != f3) {
            znVar.f9280wz = f3;
            eb();
        }
    }

    public float ud() {
        return i4() + ej();
    }

    public void ut(@NonNull y2.zn znVar) {
        setShapeAppearanceModel(this.y.y.f3(znVar));
    }

    public boolean vl() {
        l2.y yVar = this.y.n3;
        return yVar != null && yVar.gv();
    }

    public void w(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        p(canvas, paint, path, this.y.y, rectF);
    }

    public final void wz(@NonNull Canvas canvas) {
        if (this.f9262s.cardinality() > 0) {
            Log.w(qn, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.y.f9268co != 0) {
            canvas.drawPath(this.w, this.fh.zn());
        }
        for (int i = 0; i < 4; i++) {
            this.f9264v[i].n3(this.fh, this.y.f9273mt, canvas);
            this.f9257fb[i].n3(this.fh, this.y.f9273mt, canvas);
        }
        if (this.f9259j5) {
            int iC = c();
            int iD0 = d0();
            canvas.translate(-iC, -iD0);
            canvas.drawPath(this.w, o);
            canvas.translate(iC, iD0);
        }
    }

    public final boolean x() {
        Paint.Style style = this.y.f9281x4;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    @NonNull
    public final RectF x4() {
        this.z.set(r());
        float fMg = mg();
        this.z.inset(fMg, fMg);
        return this.z;
    }

    public final void xc(@NonNull Canvas canvas) {
        p(canvas, this.c, this.w, this.y.y, r());
    }

    public void xg(float f3, @Nullable ColorStateList colorStateList) {
        ct(f3);
        dm(colorStateList);
    }

    public void y5(float f3, int i) {
        ct(f3);
        dm(ColorStateList.valueOf(i));
    }

    public final void yt() {
        super.invalidateSelf();
    }

    public float z() {
        return this.y.y.t().y(r());
    }

    public float z6() {
        return this.y.y.z().y(r());
    }

    public fb() {
        this(new f());
    }

    public fb(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i5) {
        this(f.v(context, attributeSet, i, i5).tl());
    }

    public fb(@NonNull f fVar) {
        this(new zn(fVar, null));
    }

    public fb(@NonNull zn znVar) {
        this.f9264v = new tl.fb[4];
        this.f9257fb = new tl.fb[4];
        this.f9262s = new BitSet(8);
        this.f9263t = new Matrix();
        this.w = new Path();
        this.f9260p = new Path();
        this.f9253co = new RectF();
        this.z = new RectF();
        this.f9261r = new Region();
        this.f3 = new Region();
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d0 = paint2;
        this.fh = new v2.y();
        this.f9255ej = Looper.getMainLooper().getThread() == Thread.currentThread() ? t.f() : new t();
        this.f9258hw = new RectF();
        this.f9259j5 = true;
        this.y = znVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = o;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        rs();
        o4(getState());
        this.f9254d = new y();
    }

    public static final class zn extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public ColorStateList f9266a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @Nullable
        public Rect f9267c5;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public int f9268co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f9269f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public ColorStateList f9270fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public ColorStateList f9271gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public float f9272i9;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public int f9273mt;

        @Nullable
        public l2.y n3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f9274p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f9275r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public PorterDuff.Mode f9276s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f9277t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public int f9278tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public ColorStateList f9279v;
        public float w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public float f9280wz;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public Paint.Style f9281x4;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public float f9282xc;

        @NonNull
        public f y;
        public int z;

        @Nullable
        public ColorFilter zn;

        public zn(f fVar, l2.y yVar) {
            this.f9271gv = null;
            this.f9279v = null;
            this.f9266a = null;
            this.f9270fb = null;
            this.f9276s = PorterDuff.Mode.SRC_IN;
            this.f9267c5 = null;
            this.f9272i9 = 1.0f;
            this.f9269f = 1.0f;
            this.f9278tl = 255;
            this.f9280wz = 0.0f;
            this.f9282xc = 0.0f;
            this.w = 0.0f;
            this.f9274p = 0;
            this.f9273mt = 0;
            this.f9268co = 0;
            this.z = 0;
            this.f9275r = false;
            this.f9281x4 = Paint.Style.FILL_AND_STROKE;
            this.y = fVar;
            this.n3 = yVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            fb fbVar = new fb(this, null);
            fbVar.f9256f = true;
            return fbVar;
        }

        public zn(@NonNull zn znVar) {
            this.f9271gv = null;
            this.f9279v = null;
            this.f9266a = null;
            this.f9270fb = null;
            this.f9276s = PorterDuff.Mode.SRC_IN;
            this.f9267c5 = null;
            this.f9272i9 = 1.0f;
            this.f9269f = 1.0f;
            this.f9278tl = 255;
            this.f9280wz = 0.0f;
            this.f9282xc = 0.0f;
            this.w = 0.0f;
            this.f9274p = 0;
            this.f9273mt = 0;
            this.f9268co = 0;
            this.z = 0;
            this.f9275r = false;
            this.f9281x4 = Paint.Style.FILL_AND_STROKE;
            this.y = znVar.y;
            this.n3 = znVar.n3;
            this.f9277t = znVar.f9277t;
            this.zn = znVar.zn;
            this.f9271gv = znVar.f9271gv;
            this.f9279v = znVar.f9279v;
            this.f9276s = znVar.f9276s;
            this.f9270fb = znVar.f9270fb;
            this.f9278tl = znVar.f9278tl;
            this.f9272i9 = znVar.f9272i9;
            this.f9268co = znVar.f9268co;
            this.f9274p = znVar.f9274p;
            this.f9275r = znVar.f9275r;
            this.f9269f = znVar.f9269f;
            this.f9280wz = znVar.f9280wz;
            this.f9282xc = znVar.f9282xc;
            this.w = znVar.w;
            this.f9273mt = znVar.f9273mt;
            this.z = znVar.z;
            this.f9266a = znVar.f9266a;
            this.f9281x4 = znVar.f9281x4;
            if (znVar.f9267c5 != null) {
                this.f9267c5 = new Rect(znVar.f9267c5);
            }
        }
    }
}
