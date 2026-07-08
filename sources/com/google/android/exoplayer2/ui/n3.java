package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ui.v;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends View implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2014b;
    public final int c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final Paint f2015co;
    public long ct;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2016d;
    public final int d0;
    public long dm;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    @Nullable
    public long[] f2017eb;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final int f2018ej;
    public ValueAnimator en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f2019f;
    public final int f3;
    public Rect f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Rect f2020fb;
    public final int fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public final StringBuilder f2021hw;
    public final Point j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public final Formatter f2022j5;
    public float jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2023k;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    @Nullable
    public boolean[] f2024lc;
    public final int n;
    public final CopyOnWriteArraySet<v.y> o;
    public long o4;
    public final float oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f2025p;
    public long q9;
    public final Runnable qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final Drawable f2026r;
    public int rs;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f2027s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f2028t;
    public boolean u;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public int f2029ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f2030v;
    public final Paint w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f2031x;
    public long xg;
    public final Rect y;
    public boolean y5;
    public final Paint z;

    public n3(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    private long getPositionIncrement() {
        long j = this.q9;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j4 = this.dm;
        if (j4 == -9223372036854775807L) {
            return 0L;
        }
        return j4 / ((long) this.f2029ut);
    }

    private String getProgressText() {
        return ut.eb(this.f2021hw, this.f2022j5, this.ct);
    }

    private long getScrubberPosition() {
        if (this.f2030v.width() <= 0 || this.dm == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f2027s.width()) * this.dm) / ((long) this.f2030v.width());
    }

    public static int t(float f3, int i) {
        return (int) (i / f3);
    }

    public static int v(float f3, int i) {
        return (int) ((i * f3) + 0.5f);
    }

    public static boolean w(Drawable drawable, int i) {
        return ut.y >= 23 && hf.y.y(drawable, i);
    }

    public final void a(Canvas canvas) {
        if (this.dm <= 0) {
            return;
        }
        Rect rect = this.f2027s;
        int iP = ut.p(rect.right, rect.left, this.f2030v.right);
        int iCenterY = this.f2027s.centerY();
        if (this.f2026r == null) {
            canvas.drawCircle(iP, iCenterY, (int) ((((this.y5 || isFocused()) ? this.f2018ej : isEnabled() ? this.fh : this.f2016d) * this.jz) / 2.0f), this.z);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.jz)) / 2;
        int intrinsicHeight = ((int) (this.f2026r.getIntrinsicHeight() * this.jz)) / 2;
        this.f2026r.setBounds(iP - intrinsicWidth, iCenterY - intrinsicHeight, iP + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f2026r.draw(canvas);
    }

    public final /* synthetic */ void c5() {
        co(false);
    }

    public final void co(boolean z) {
        removeCallbacks(this.qn);
        this.y5 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<v.y> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().zn(this, this.xg, z);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r();
    }

    public final void f(float f3) {
        Rect rect = this.f2027s;
        Rect rect2 = this.f2030v;
        rect.right = ut.p((int) f3, rect2.left, rect2.right);
    }

    public final void fb(Canvas canvas) {
        int iHeight = this.f2030v.height();
        int iCenterY = this.f2030v.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.dm <= 0) {
            Rect rect = this.f2030v;
            canvas.drawRect(rect.left, iCenterY, rect.right, i, this.w);
            return;
        }
        Rect rect2 = this.f2020fb;
        int i5 = rect2.left;
        int i8 = rect2.right;
        int iMax = Math.max(Math.max(this.f2030v.left, i8), this.f2027s.right);
        int i10 = this.f2030v.right;
        if (iMax < i10) {
            canvas.drawRect(iMax, iCenterY, i10, i, this.w);
        }
        int iMax2 = Math.max(i5, this.f2027s.right);
        if (i8 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i8, i, this.f2028t);
        }
        if (this.f2027s.width() > 0) {
            Rect rect3 = this.f2027s;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i, this.f2019f);
        }
        if (this.rs == 0) {
            return;
        }
        long[] jArr = (long[]) v0.y.v(this.f2017eb);
        boolean[] zArr = (boolean[]) v0.y.v(this.f2024lc);
        int i11 = this.d0 / 2;
        for (int i12 = 0; i12 < this.rs; i12++) {
            int iWidth = ((int) ((((long) this.f2030v.width()) * ut.mt(jArr[i12], 0L, this.dm)) / this.dm)) - i11;
            Rect rect4 = this.f2030v;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.d0, Math.max(0, iWidth)), iCenterY, r10 + this.d0, i, zArr[i12] ? this.f2015co : this.f2025p);
        }
    }

    @Override // com.google.android.exoplayer2.ui.v
    public long getPreferredUpdateDelay() {
        int iT = t(this.oz, this.f2030v.width());
        if (iT != 0) {
            long j = this.dm;
            if (j != 0 && j != -9223372036854775807L) {
                return j / ((long) iT);
            }
        }
        return Long.MAX_VALUE;
    }

    public final /* synthetic */ void i9(ValueAnimator valueAnimator) {
        this.jz = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.y);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2026r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void mt(long j) {
        this.xg = j;
        this.y5 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<v.y> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().a(this, j);
        }
    }

    @Override // com.google.android.exoplayer2.ui.v
    public void n3(@Nullable long[] jArr, @Nullable boolean[] zArr, int i) {
        v0.y.y(i == 0 || !(jArr == null || zArr == null));
        this.rs = i;
        this.f2017eb = jArr;
        this.f2024lc = zArr;
        z();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        fb(canvas);
        a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.y5 || z) {
            return;
        }
        co(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.dm <= 0) {
            return;
        }
        if (ut.y >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.wz(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.qn
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.qn
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.y5
            if (r0 == 0) goto L30
            r5 = 0
            r4.co(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.n3.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        int paddingBottom;
        int iMax;
        int i11 = i8 - i;
        int i12 = i10 - i5;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i11 - getPaddingRight();
        int i13 = this.u ? 0 : this.f2031x;
        if (this.c == 1) {
            paddingBottom = (i12 - getPaddingBottom()) - this.n;
            int paddingBottom2 = i12 - getPaddingBottom();
            int i14 = this.f3;
            iMax = (paddingBottom2 - i14) - Math.max(i13 - (i14 / 2), 0);
        } else {
            paddingBottom = (i12 - this.n) / 2;
            iMax = (i12 - this.f3) / 2;
        }
        this.y.set(paddingLeft, paddingBottom, paddingRight, this.n + paddingBottom);
        Rect rect = this.f2030v;
        Rect rect2 = this.y;
        rect.set(rect2.left + i13, iMax, rect2.right - i13, this.f3 + iMax);
        if (ut.y >= 29) {
            p(i11, i12);
        }
        z();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode == 0) {
            size = this.n;
        } else if (mode != 1073741824) {
            size = Math.min(this.n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        r();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f2026r;
        if (drawable == null || !w(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.dm
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.tl(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.y5
            if (r8 == 0) goto L76
            int r8 = r7.f2014b
            if (r0 >= r8) goto L3a
            int r8 = r7.f2023k
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.f(r8)
            goto L40
        L3a:
            r7.f2023k = r2
            float r8 = (float) r2
            r7.f(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.x4(r0)
            r7.z()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.y5
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = 1
        L59:
            r7.co(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.s(r8, r0)
            if (r0 == 0) goto L76
            r7.f(r8)
            long r0 = r7.getScrubberPosition()
            r7.mt(r0)
            r7.z()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.n3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i, int i5) {
        Rect rect = this.f7;
        if (rect != null && rect.width() == i && this.f7.height() == i5) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i5);
        this.f7 = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.dm <= 0) {
            return false;
        }
        if (i == 8192) {
            if (wz(-getPositionIncrement())) {
                co(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (wz(getPositionIncrement())) {
                co(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public final void r() {
        Drawable drawable = this.f2026r;
        if (drawable != null && drawable.isStateful() && this.f2026r.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final boolean s(float f3, float f4) {
        return this.y.contains((int) f3, (int) f4);
    }

    public void setAdMarkerColor(int i) {
        this.f2025p.setColor(i);
        invalidate(this.y);
    }

    public void setBufferedColor(int i) {
        this.f2028t.setColor(i);
        invalidate(this.y);
    }

    @Override // com.google.android.exoplayer2.ui.v
    public void setBufferedPosition(long j) {
        if (this.o4 == j) {
            return;
        }
        this.o4 = j;
        z();
    }

    @Override // com.google.android.exoplayer2.ui.v
    public void setDuration(long j) {
        if (this.dm == j) {
            return;
        }
        this.dm = j;
        if (this.y5 && j == -9223372036854775807L) {
            co(true);
        }
        z();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.v
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.y5 || z) {
            return;
        }
        co(true);
    }

    public void setKeyCountIncrement(int i) {
        v0.y.y(i > 0);
        this.f2029ut = i;
        this.q9 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        v0.y.y(j > 0);
        this.f2029ut = -1;
        this.q9 = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f2015co.setColor(i);
        invalidate(this.y);
    }

    public void setPlayedColor(int i) {
        this.f2019f.setColor(i);
        invalidate(this.y);
    }

    @Override // com.google.android.exoplayer2.ui.v
    public void setPosition(long j) {
        if (this.ct == j) {
            return;
        }
        this.ct = j;
        setContentDescription(getProgressText());
        z();
    }

    public void setScrubberColor(int i) {
        this.z.setColor(i);
        invalidate(this.y);
    }

    public void setUnplayedColor(int i) {
        this.w.setColor(i);
        invalidate(this.y);
    }

    public final Point tl(MotionEvent motionEvent) {
        this.j.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.j;
    }

    public final boolean wz(long j) {
        long j4 = this.dm;
        if (j4 <= 0) {
            return false;
        }
        long j7 = this.y5 ? this.xg : this.ct;
        long jMt = ut.mt(j7 + j, 0L, j4);
        if (jMt == j7) {
            return false;
        }
        if (this.y5) {
            x4(jMt);
        } else {
            mt(jMt);
        }
        z();
        return true;
    }

    public final void x4(long j) {
        if (this.xg == j) {
            return;
        }
        this.xg = j;
        Iterator<v.y> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().y(this, j);
        }
    }

    public final boolean xc(Drawable drawable) {
        return ut.y >= 23 && w(drawable, getLayoutDirection());
    }

    @Override // com.google.android.exoplayer2.ui.v
    public void y(v.y yVar) {
        v0.y.v(yVar);
        this.o.add(yVar);
    }

    public final void z() {
        this.f2020fb.set(this.f2030v);
        this.f2027s.set(this.f2030v);
        long j = this.y5 ? this.xg : this.ct;
        if (this.dm > 0) {
            int iWidth = (int) ((((long) this.f2030v.width()) * this.o4) / this.dm);
            Rect rect = this.f2020fb;
            Rect rect2 = this.f2030v;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f2030v.width()) * j) / this.dm);
            Rect rect3 = this.f2027s;
            Rect rect4 = this.f2030v;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f2020fb;
            int i = this.f2030v.left;
            rect5.right = i;
            this.f2027s.right = i;
        }
        invalidate(this.y);
    }

    public n3(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2, int i5) {
        super(context, attributeSet, i);
        this.y = new Rect();
        this.f2030v = new Rect();
        this.f2020fb = new Rect();
        this.f2027s = new Rect();
        Paint paint = new Paint();
        this.f2019f = paint;
        Paint paint2 = new Paint();
        this.f2028t = paint2;
        Paint paint3 = new Paint();
        this.w = paint3;
        Paint paint4 = new Paint();
        this.f2025p = paint4;
        Paint paint5 = new Paint();
        this.f2015co = paint5;
        Paint paint6 = new Paint();
        this.z = paint6;
        paint6.setAntiAlias(true);
        this.o = new CopyOnWriteArraySet<>();
        this.j = new Point();
        float f3 = context.getResources().getDisplayMetrics().density;
        this.oz = f3;
        this.f2014b = v(f3, -50);
        int iV = v(f3, 4);
        int iV2 = v(f3, 26);
        int iV3 = v(f3, 4);
        int iV4 = v(f3, 12);
        int iV5 = v(f3, 0);
        int iV6 = v(f3, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R$styleable.f1984v, i, i5);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.w);
                this.f2026r = drawable;
                if (drawable != null) {
                    xc(drawable);
                    iV2 = Math.max(drawable.getMinimumHeight(), iV2);
                }
                this.f3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f1962c5, iV);
                this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f1975mt, iV2);
                this.c = typedArrayObtainStyledAttributes.getInt(R$styleable.f1978s, 0);
                this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f1967fb, iV3);
                this.fh = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f1976p, iV4);
                this.f2016d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f1985wz, iV5);
                this.f2018ej = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f1988xc, iV6);
                int i8 = typedArrayObtainStyledAttributes.getInt(R$styleable.f1979t, -1);
                int i10 = typedArrayObtainStyledAttributes.getInt(R$styleable.f1981tl, -1);
                int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.f1971i9, -855638017);
                int i12 = typedArrayObtainStyledAttributes.getInt(R$styleable.f1963co, 872415231);
                int i13 = typedArrayObtainStyledAttributes.getInt(R$styleable.f1959a, -1291845888);
                int i14 = typedArrayObtainStyledAttributes.getInt(R$styleable.f1966f, 872414976);
                paint.setColor(i8);
                paint6.setColor(i10);
                paint2.setColor(i11);
                paint3.setColor(i12);
                paint4.setColor(i13);
                paint5.setColor(i14);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f3 = iV;
            this.n = iV2;
            this.c = 0;
            this.d0 = iV3;
            this.fh = iV4;
            this.f2016d = iV5;
            this.f2018ej = iV6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f2026r = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f2021hw = sb;
        this.f2022j5 = new Formatter(sb, Locale.getDefault());
        this.qn = new Runnable() { // from class: q0.gv
            @Override // java.lang.Runnable
            public final void run() {
                this.y.c5();
            }
        };
        Drawable drawable2 = this.f2026r;
        if (drawable2 != null) {
            this.f2031x = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f2031x = (Math.max(this.f2016d, Math.max(this.fh, this.f2018ej)) + 1) / 2;
        }
        this.jz = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.en = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: q0.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.y.i9(valueAnimator2);
            }
        });
        this.dm = -9223372036854775807L;
        this.q9 = -9223372036854775807L;
        this.f2029ut = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
