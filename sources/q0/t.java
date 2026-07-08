package q0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f7442a;

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public Rect f7443a8;
    public float c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public CharSequence f7444c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f7445co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StaticLayout f7446d;
    public int d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public int f7447ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Bitmap f7448f;
    public float f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Paint f7449fb;
    public int fh;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final float f7450gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public int f7451i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f7452i9;
    public int mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public float f7453mt;
    public float n;
    public final float n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f7454p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7455r;
    public int rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f7456s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f7457t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public StaticLayout f7458ta;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f7459tl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public int f7460ud;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f7461v;
    public int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int f7462wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public int f7463x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public float f7464xc;
    public final float y;
    public int z;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public int f7465z6;
    public final float zn;

    public t(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f7461v = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f7450gv = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.y = fRound;
        this.n3 = fRound;
        this.zn = fRound;
        TextPaint textPaint = new TextPaint();
        this.f7442a = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f7449fb = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f7456s = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public static boolean y(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f7448f
            int r1 = r7.rz
            int r2 = r7.d0
            int r1 = r1 - r2
            int r3 = r7.mg
            int r4 = r7.fh
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f7464xc
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f7457t
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f7454p
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f7453mt
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L32
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L44
        L32:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L44:
            int r3 = r7.w
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L4d
            float r3 = (float) r1
        L4b:
            float r2 = r2 - r3
            goto L53
        L4d:
            if (r3 != r5) goto L53
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L4b
        L53:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f7462wz
            if (r3 != r6) goto L5e
            float r3 = (float) r0
        L5c:
            float r4 = r4 - r3
            goto L64
        L5e:
            if (r3 != r5) goto L64
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L5c
        L64:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f7443a8 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.t.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fb() {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.t.fb():void");
    }

    public final void gv(Canvas canvas, boolean z) {
        if (z) {
            v(canvas);
            return;
        }
        v0.y.v(this.f7443a8);
        v0.y.v(this.f7448f);
        zn(canvas);
    }

    public void n3(b0.n3 n3Var, n3 n3Var2, float f3, float f4, float f5, Canvas canvas, int i, int i5, int i8, int i10) {
        int i11;
        boolean z = n3Var.f1206s == null;
        if (!z) {
            i11 = -16777216;
        } else if (TextUtils.isEmpty(n3Var.y)) {
            return;
        } else {
            i11 = n3Var.f3 ? n3Var.n : n3Var2.zn;
        }
        if (y(this.f7444c5, n3Var.y) && ut.zn(this.f7452i9, n3Var.f1208v) && this.f7448f == n3Var.f1206s && this.f7457t == n3Var.f1202f && this.f7459tl == n3Var.f1207t && ut.zn(Integer.valueOf(this.f7462wz), Integer.valueOf(n3Var.w)) && this.f7464xc == n3Var.f1204p && ut.zn(Integer.valueOf(this.w), Integer.valueOf(n3Var.f1200co)) && this.f7454p == n3Var.z && this.f7453mt == n3Var.f1205r && this.f7445co == n3Var2.y && this.z == n3Var2.n3 && this.f7455r == i11 && this.f7451i4 == n3Var2.f7440gv && this.f7463x4 == n3Var2.f7441v && ut.zn(this.f7442a.getTypeface(), n3Var2.f7439a) && this.f3 == f3 && this.n == f4 && this.c == f5 && this.d0 == i && this.fh == i5 && this.rz == i8 && this.mg == i10) {
            gv(canvas, z);
            return;
        }
        this.f7444c5 = n3Var.y;
        this.f7452i9 = n3Var.f1208v;
        this.f7448f = n3Var.f1206s;
        this.f7457t = n3Var.f1202f;
        this.f7459tl = n3Var.f1207t;
        this.f7462wz = n3Var.w;
        this.f7464xc = n3Var.f1204p;
        this.w = n3Var.f1200co;
        this.f7454p = n3Var.z;
        this.f7453mt = n3Var.f1205r;
        this.f7445co = n3Var2.y;
        this.z = n3Var2.n3;
        this.f7455r = i11;
        this.f7451i4 = n3Var2.f7440gv;
        this.f7463x4 = n3Var2.f7441v;
        this.f7442a.setTypeface(n3Var2.f7439a);
        this.f3 = f3;
        this.n = f4;
        this.c = f5;
        this.d0 = i;
        this.fh = i5;
        this.rz = i8;
        this.mg = i10;
        if (z) {
            v0.y.v(this.f7444c5);
            fb();
        } else {
            v0.y.v(this.f7448f);
            a();
        }
        gv(canvas, z);
    }

    public final void v(Canvas canvas) {
        StaticLayout staticLayout = this.f7458ta;
        StaticLayout staticLayout2 = this.f7446d;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f7465z6, this.f7447ej);
        if (Color.alpha(this.f7455r) > 0) {
            this.f7449fb.setColor(this.f7455r);
            canvas.drawRect(-this.f7460ud, 0.0f, staticLayout.getWidth() + this.f7460ud, staticLayout.getHeight(), this.f7449fb);
        }
        int i = this.f7451i4;
        if (i == 1) {
            this.f7442a.setStrokeJoin(Paint.Join.ROUND);
            this.f7442a.setStrokeWidth(this.y);
            this.f7442a.setColor(this.f7463x4);
            this.f7442a.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.f7442a;
            float f3 = this.n3;
            float f4 = this.zn;
            textPaint.setShadowLayer(f3, f4, f4, this.f7463x4);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i5 = z ? -1 : this.f7463x4;
            int i8 = z ? this.f7463x4 : -1;
            float f5 = this.n3 / 2.0f;
            this.f7442a.setColor(this.f7445co);
            this.f7442a.setStyle(Paint.Style.FILL);
            float f7 = -f5;
            this.f7442a.setShadowLayer(this.n3, f7, f7, i5);
            staticLayout2.draw(canvas);
            this.f7442a.setShadowLayer(this.n3, f5, f5, i8);
        }
        this.f7442a.setColor(this.f7445co);
        this.f7442a.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f7442a.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    public final void zn(Canvas canvas) {
        canvas.drawBitmap(this.f7448f, (Rect) null, this.f7443a8, this.f7456s);
    }
}
