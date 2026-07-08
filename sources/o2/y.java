package o2;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import hw.i4;
import o2.s;
import qn.ut;
import qn.w;
import t2.y;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public static final boolean f7098eb = false;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    @NonNull
    public static final Paint f7099lc = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7100a;

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public int[] f7101a8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextPaint f7102b;
    public t2.y c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @NonNull
    public final Rect f7103c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public float f7104co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Bitmap f7105d;
    public t2.y d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public float f7106ej;
    public StaticLayout en;
    public Typeface f3;
    public float f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f7108fb;

    @Nullable
    public CharSequence fh;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f7109gv;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public float f7110hw;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public Typeface f7111i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @NonNull
    public final RectF f7112i9;
    public float j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public float f7113j5;
    public float jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f7114k;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    @NonNull
    public final TextPaint f7115k5;
    public boolean mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public float f7116mt;
    public Typeface n;
    public boolean n3;
    public ColorStateList o;
    public float oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f7117p;
    public ColorStateList q9;
    public float qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f7118r;

    @Nullable
    public CharSequence rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final Rect f7119s;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public boolean f7121ta;
    public float u;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public float f7123ud;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public float f7124ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f7125v;
    public TimeInterpolator vl;
    public ColorStateList w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7127x;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public float f7128x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public ColorStateList f7129xc;
    public CharSequence xg;
    public final View y;
    public float y5;

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    public TimeInterpolator f7130yt;
    public float z;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public Paint f7131z6;
    public float zn;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7107f = 16;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7120t = 16;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public float f7122tl = 15.0f;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public float f7126wz = 15.0f;
    public int dm = 1;
    public float ct = 0.0f;
    public float o4 = 1.0f;
    public int rs = s.f7085wz;

    /* JADX INFO: renamed from: o2.y$y, reason: collision with other inner class name */
    public class C0140y implements y.InterfaceC0176y {
        public C0140y() {
        }

        @Override // t2.y.InterfaceC0176y
        public void y(Typeface typeface) {
            y.this.vl(typeface);
        }
    }

    public y(View view) {
        this.y = view;
        TextPaint textPaint = new TextPaint(129);
        this.f7102b = textPaint;
        this.f7115k5 = new TextPaint(textPaint);
        this.f7103c5 = new Rect();
        this.f7119s = new Rect();
        this.f7112i9 = new RectF();
        this.f7100a = a();
    }

    public static boolean ej(@NonNull Rect rect, int i, int i5, int i8, int i10) {
        return rect.left == i && rect.top == i5 && rect.right == i8 && rect.bottom == i10;
    }

    public static boolean fh(float f3, float f4) {
        return Math.abs(f3 - f4) < 0.001f;
    }

    public static float ta(float f3, float f4, float f5, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f5);
        }
        return t1.y.y(f3, f4, f5);
    }

    public static int y(int i, int i5, float f3) {
        float f4 = 1.0f - f3;
        return Color.argb((int) ((Color.alpha(i) * f4) + (Color.alpha(i5) * f3)), (int) ((Color.red(i) * f4) + (Color.red(i5) * f3)), (int) ((Color.green(i) * f4) + (Color.green(i5) * f3)), (int) ((Color.blue(i) * f4) + (Color.blue(i5) * f3)));
    }

    public final float a() {
        float f3 = this.f7125v;
        return f3 + ((1.0f - f3) * 0.5f);
    }

    public void a8(@NonNull Rect rect) {
        ud(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void b(float f3) {
        this.jz = f3;
        ut.lc(this.y);
    }

    public final void c(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f7122tl);
        textPaint.setTypeface(this.f3);
        textPaint.setLetterSpacing(this.f7);
    }

    public final void c5(float f3) {
        boolean z;
        float f4;
        boolean z5;
        if (this.fh == null) {
            return;
        }
        float fWidth = this.f7103c5.width();
        float fWidth2 = this.f7119s.width();
        if (fh(f3, this.f7126wz)) {
            f4 = this.f7126wz;
            this.f7106ej = 1.0f;
            Typeface typeface = this.n;
            Typeface typeface2 = this.f7111i4;
            if (typeface != typeface2) {
                this.n = typeface2;
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            float f5 = this.f7122tl;
            Typeface typeface3 = this.n;
            Typeface typeface4 = this.f3;
            if (typeface3 != typeface4) {
                this.n = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (fh(f3, f5)) {
                this.f7106ej = 1.0f;
            } else {
                this.f7106ej = f3 / this.f7122tl;
            }
            float f7 = this.f7126wz / this.f7122tl;
            fWidth = fWidth2 * f7 > fWidth ? Math.min(fWidth / f7, fWidth2) : fWidth2;
            f4 = f5;
            z5 = z;
        }
        if (fWidth > 0.0f) {
            z5 = this.f7123ud != f4 || this.f7127x || z5;
            this.f7123ud = f4;
            this.f7127x = false;
        }
        if (this.rz == null || z5) {
            this.f7102b.setTextSize(this.f7123ud);
            this.f7102b.setTypeface(this.n);
            this.f7102b.setLinearText(this.f7106ej != 1.0f);
            this.mg = fb(this.fh);
            StaticLayout staticLayoutF = f(dm() ? this.dm : 1, fWidth, this.mg);
            this.en = staticLayoutF;
            this.rz = staticLayoutF.getText();
        }
    }

    public final float co(@NonNull RectF rectF, int i, int i5) {
        return (i5 == 17 || (i5 & 7) == 1) ? (i / 2.0f) + (zn() / 2.0f) : ((i5 & 8388613) == 8388613 || (i5 & 5) == 5) ? this.mg ? rectF.left + zn() : this.f7103c5.right : this.mg ? this.f7103c5.right : rectF.left + zn();
    }

    public void d() {
        this.n3 = this.f7103c5.width() > 0 && this.f7103c5.height() > 0 && this.f7119s.width() > 0 && this.f7119s.height() > 0;
    }

    public final void d0(float f3) {
        if (this.f7109gv) {
            this.f7112i9.set(f3 < this.f7100a ? this.f7119s : this.f7103c5);
            return;
        }
        this.f7112i9.left = ta(this.f7119s.left, this.f7103c5.left, f3, this.f7130yt);
        this.f7112i9.top = ta(this.f7117p, this.f7116mt, f3, this.f7130yt);
        this.f7112i9.right = ta(this.f7119s.right, this.f7103c5.right, f3, this.f7130yt);
        this.f7112i9.bottom = ta(this.f7119s.bottom, this.f7103c5.bottom, f3, this.f7130yt);
    }

    public final boolean dm() {
        return this.dm > 1 && (!this.mg || this.f7109gv) && !this.f7121ta;
    }

    public void en(TimeInterpolator timeInterpolator) {
        this.f7130yt = timeInterpolator;
        z6();
    }

    public final StaticLayout f(int i, float f3, boolean z) {
        StaticLayout staticLayoutY;
        try {
            staticLayoutY = s.zn(this.fh, this.f7102b, (int) f3).v(TextUtils.TruncateAt.END).s(z).gv(Layout.Alignment.ALIGN_NORMAL).fb(false).i9(i).c5(this.ct, this.o4).a(this.rs).y();
        } catch (s.y e4) {
            Log.e("CollapsingTextHelper", e4.getCause().getMessage(), e4);
            staticLayoutY = null;
        }
        return (StaticLayout) j5.s.fb(staticLayoutY);
    }

    public float f3() {
        return this.zn;
    }

    public final void f7(float f3) {
        c5(f3);
        boolean z = f7098eb && this.f7106ej != 1.0f;
        this.f7121ta = z;
        if (z) {
            wz();
        }
        ut.lc(this.y);
    }

    public final boolean fb(@NonNull CharSequence charSequence) {
        return (rz() ? i4.f5346gv : i4.zn).y(charSequence, 0, charSequence.length());
    }

    public final void gv() {
        s(this.zn);
    }

    public final boolean hw(Typeface typeface) {
        t2.y yVar = this.d0;
        if (yVar != null) {
            yVar.zn();
        }
        if (this.f7111i4 == typeface) {
            return false;
        }
        this.f7111i4 = typeface;
        return true;
    }

    public float i4() {
        c(this.f7115k5);
        return -this.f7115k5.ascent();
    }

    public final void i9() {
        Bitmap bitmap = this.f7105d;
        if (bitmap != null) {
            bitmap.recycle();
            this.f7105d = null;
        }
    }

    public void j(ColorStateList colorStateList) {
        if (this.f7129xc != colorStateList) {
            this.f7129xc = colorStateList;
            z6();
        }
    }

    public void j5(int i, int i5, int i8, int i10) {
        if (ej(this.f7119s, i, i5, i8, i10)) {
            return;
        }
        this.f7119s.set(i, i5, i8, i10);
        this.f7127x = true;
        d();
    }

    public final boolean jz(int[] iArr) {
        this.f7101a8 = iArr;
        if (!mg()) {
            return false;
        }
        z6();
        return true;
    }

    public void k(float f3) {
        float fY = b.y.y(f3, 0.0f, 1.0f);
        if (fY != this.zn) {
            this.zn = fY;
            gv();
        }
    }

    public void k5(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            z6();
        }
    }

    public final boolean mg() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.w;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f7129xc) != null && colorStateList.isStateful());
    }

    public final float mt(int i, int i5) {
        return (i5 == 17 || (i5 & 7) == 1) ? (i / 2.0f) - (zn() / 2.0f) : ((i5 & 8388613) == 8388613 || (i5 & 5) == 5) ? this.mg ? this.f7103c5.left : this.f7103c5.right - zn() : this.mg ? this.f7103c5.right - zn() : this.f7103c5.left;
    }

    public final void n(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f7126wz);
        textPaint.setTypeface(this.f7111i4);
        textPaint.setLetterSpacing(this.f7114k);
    }

    public final void n3() {
        StaticLayout staticLayout;
        float f3 = this.f7123ud;
        c5(this.f7126wz);
        CharSequence charSequence = this.rz;
        if (charSequence != null && (staticLayout = this.en) != null) {
            this.xg = TextUtils.ellipsize(charSequence, this.f7102b, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.xg;
        float fMeasureText = charSequence2 != null ? this.f7102b.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int iN3 = w.n3(this.f7120t, this.mg ? 1 : 0);
        int i = iN3 & 112;
        if (i == 48) {
            this.f7116mt = this.f7103c5.top;
        } else if (i != 80) {
            this.f7116mt = this.f7103c5.centerY() - ((this.f7102b.descent() - this.f7102b.ascent()) / 2.0f);
        } else {
            this.f7116mt = this.f7103c5.bottom + this.f7102b.ascent();
        }
        int i5 = iN3 & 8388615;
        if (i5 == 1) {
            this.z = this.f7103c5.centerX() - (fMeasureText / 2.0f);
        } else if (i5 != 5) {
            this.z = this.f7103c5.left;
        } else {
            this.z = this.f7103c5.right - fMeasureText;
        }
        c5(this.f7122tl);
        float height = this.en != null ? r1.getHeight() : 0.0f;
        CharSequence charSequence3 = this.rz;
        float fMeasureText2 = charSequence3 != null ? this.f7102b.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout2 = this.en;
        if (staticLayout2 != null && this.dm > 1) {
            fMeasureText2 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.en;
        this.y5 = staticLayout3 != null ? this.dm > 1 ? staticLayout3.getLineStart(0) : staticLayout3.getLineLeft(0) : 0.0f;
        int iN32 = w.n3(this.f7107f, this.mg ? 1 : 0);
        int i8 = iN32 & 112;
        if (i8 == 48) {
            this.f7117p = this.f7119s.top;
        } else if (i8 != 80) {
            this.f7117p = this.f7119s.centerY() - (height / 2.0f);
        } else {
            this.f7117p = (this.f7119s.bottom - height) + this.f7102b.descent();
        }
        int i10 = iN32 & 8388615;
        if (i10 == 1) {
            this.f7104co = this.f7119s.centerX() - (fMeasureText2 / 2.0f);
        } else if (i10 != 5) {
            this.f7104co = this.f7119s.left;
        } else {
            this.f7104co = this.f7119s.right - fMeasureText2;
        }
        i9();
        f7(f3);
    }

    public final void o(float f3) {
        this.u = f3;
        ut.lc(this.y);
    }

    public void oz(int i) {
        if (this.f7107f != i) {
            this.f7107f = i;
            z6();
        }
    }

    public float p() {
        n(this.f7115k5);
        return -this.f7115k5.ascent();
    }

    public final boolean q9(Typeface typeface) {
        t2.y yVar = this.c;
        if (yVar != null) {
            yVar.zn();
        }
        if (this.f3 == typeface) {
            return false;
        }
        this.f3 = typeface;
        return true;
    }

    public void qn(@NonNull Rect rect) {
        j5(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final int r(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f7101a8;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final boolean rz() {
        return ut.ta(this.y) == 1;
    }

    public final void s(float f3) {
        float f4;
        d0(f3);
        if (!this.f7109gv) {
            this.f7118r = ta(this.f7104co, this.z, f3, this.f7130yt);
            this.f7128x4 = ta(this.f7117p, this.f7116mt, f3, this.f7130yt);
            f7(ta(this.f7122tl, this.f7126wz, f3, this.vl));
            f4 = f3;
        } else if (f3 < this.f7100a) {
            this.f7118r = this.f7104co;
            this.f7128x4 = this.f7117p;
            f7(this.f7122tl);
            f4 = 0.0f;
        } else {
            this.f7118r = this.z;
            this.f7128x4 = this.f7116mt - this.f7108fb;
            f7(this.f7126wz);
            f4 = 1.0f;
        }
        TimeInterpolator timeInterpolator = t1.y.n3;
        b(1.0f - ta(0.0f, 1.0f, 1.0f - f3, timeInterpolator));
        o(ta(1.0f, 0.0f, f3, timeInterpolator));
        if (this.w != this.f7129xc) {
            this.f7102b.setColor(y(x4(), z(), f4));
        } else {
            this.f7102b.setColor(z());
        }
        float f5 = this.f7114k;
        float f7 = this.f7;
        if (f5 != f7) {
            this.f7102b.setLetterSpacing(ta(f7, f5, f3, timeInterpolator));
        } else {
            this.f7102b.setLetterSpacing(f5);
        }
        this.f7102b.setShadowLayer(ta(this.j, this.f7110hw, f3, null), ta(this.oz, this.f7113j5, f3, null), ta(this.f7124ut, this.qn, f3, null), y(r(this.q9), r(this.o), f3));
        if (this.f7109gv) {
            this.f7102b.setAlpha((int) (v(f3) * 255.0f));
        }
        ut.lc(this.y);
    }

    public void t(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (this.rz == null || !this.n3) {
            return;
        }
        boolean z = false;
        float lineLeft = (this.f7118r + this.en.getLineLeft(0)) - (this.y5 * 2.0f);
        this.f7102b.setTextSize(this.f7123ud);
        float f3 = this.f7118r;
        float f4 = this.f7128x4;
        if (this.f7121ta && this.f7105d != null) {
            z = true;
        }
        float f5 = this.f7106ej;
        if (f5 != 1.0f && !this.f7109gv) {
            canvas.scale(f5, f5, f3, f4);
        }
        if (z) {
            canvas.drawBitmap(this.f7105d, f3, f4, this.f7131z6);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!dm() || (this.f7109gv && this.zn <= this.f7100a)) {
            canvas.translate(f3, f4);
            this.en.draw(canvas);
        } else {
            tl(canvas, lineLeft, f4);
        }
        canvas.restoreToCount(iSave);
    }

    public final void tl(@NonNull Canvas canvas, float f3, float f4) {
        int alpha = this.f7102b.getAlpha();
        canvas.translate(f3, f4);
        float f5 = alpha;
        this.f7102b.setAlpha((int) (this.u * f5));
        this.en.draw(canvas);
        this.f7102b.setAlpha((int) (this.jz * f5));
        int lineBaseline = this.en.getLineBaseline(0);
        CharSequence charSequence = this.xg;
        float f7 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f7, this.f7102b);
        if (this.f7109gv) {
            return;
        }
        String strTrim = this.xg.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f7102b.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.en.getLineEnd(0), str.length()), 0.0f, f7, (Paint) this.f7102b);
    }

    public void u(@Nullable CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.fh, charSequence)) {
            this.fh = charSequence;
            this.rz = null;
            i9();
            z6();
        }
    }

    public void ud(int i, int i5, int i8, int i10) {
        if (ej(this.f7103c5, i, i5, i8, i10)) {
            return;
        }
        this.f7103c5.set(i, i5, i8, i10);
        this.f7127x = true;
        d();
    }

    public void ut(float f3) {
        if (this.f7122tl != f3) {
            this.f7122tl = f3;
            z6();
        }
    }

    public final float v(float f3) {
        float f4 = this.f7100a;
        return f3 <= f4 ? t1.y.n3(1.0f, 0.0f, this.f7125v, f4, f3) : t1.y.n3(0.0f, 1.0f, f4, 1.0f, f3);
    }

    public void vl(Typeface typeface) {
        if (hw(typeface)) {
            z6();
        }
    }

    public ColorStateList w() {
        return this.w;
    }

    public final void wz() {
        if (this.f7105d != null || this.f7119s.isEmpty() || TextUtils.isEmpty(this.rz)) {
            return;
        }
        s(0.0f);
        int width = this.en.getWidth();
        int height = this.en.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f7105d = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.en.draw(new Canvas(this.f7105d));
        if (this.f7131z6 == null) {
            this.f7131z6 = new Paint(3);
        }
    }

    public void x(int i) {
        t2.gv gvVar = new t2.gv(this.y.getContext(), i);
        ColorStateList colorStateList = gvVar.y;
        if (colorStateList != null) {
            this.w = colorStateList;
        }
        float f3 = gvVar.f8193wz;
        if (f3 != 0.0f) {
            this.f7126wz = f3;
        }
        ColorStateList colorStateList2 = gvVar.f8186gv;
        if (colorStateList2 != null) {
            this.o = colorStateList2;
        }
        this.f7113j5 = gvVar.f8183c5;
        this.qn = gvVar.f8187i9;
        this.f7110hw = gvVar.f8184f;
        this.f7114k = gvVar.f8191tl;
        t2.y yVar = this.d0;
        if (yVar != null) {
            yVar.zn();
        }
        this.d0 = new t2.y(new C0140y(), gvVar.v());
        gvVar.s(this.y.getContext(), this.d0);
        z6();
    }

    public final int x4() {
        return r(this.f7129xc);
    }

    public void xc(@NonNull RectF rectF, int i, int i5) {
        this.mg = fb(this.fh);
        rectF.left = mt(i, i5);
        rectF.top = this.f7103c5.top;
        rectF.right = co(rectF, i, i5);
        rectF.bottom = this.f7103c5.top + p();
    }

    public void xg(Typeface typeface) {
        boolean zHw = hw(typeface);
        boolean zQ9 = q9(typeface);
        if (zHw || zQ9) {
            z6();
        }
    }

    public void y5(TimeInterpolator timeInterpolator) {
        this.vl = timeInterpolator;
        z6();
    }

    public void yt(int i) {
        if (this.f7120t != i) {
            this.f7120t = i;
            z6();
        }
    }

    public int z() {
        return r(this.w);
    }

    public void z6() {
        if (this.y.getHeight() <= 0 || this.y.getWidth() <= 0) {
            return;
        }
        n3();
        gv();
    }

    public float zn() {
        if (this.fh == null) {
            return 0.0f;
        }
        n(this.f7115k5);
        TextPaint textPaint = this.f7115k5;
        CharSequence charSequence = this.fh;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }
}
