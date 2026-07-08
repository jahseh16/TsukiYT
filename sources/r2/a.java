package r2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import r2.n3;

/* JADX INFO: loaded from: classes.dex */
public final class a<S extends n3> extends fb {

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public static final eb.zn<a> f7620hw = new y("indicatorLevel");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7621b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eb.v f7622d;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final eb.gv f7623ej;
    public s<S> fh;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f7624x;

    public static class y extends eb.zn<a> {
        public y(String str) {
            super(str);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(a aVar, float f3) {
            aVar.n(f3 / 10000.0f);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(a aVar) {
            return aVar.i4() * 10000.0f;
        }
    }

    public a(@NonNull Context context, @NonNull n3 n3Var, @NonNull s<S> sVar) {
        super(context, n3Var);
        this.f7621b = false;
        f3(sVar);
        eb.v vVar = new eb.v();
        this.f7622d = vVar;
        vVar.gv(1.0f);
        vVar.a(50.0f);
        eb.gv gvVar = new eb.gv(this, f7620hw);
        this.f7623ej = gvVar;
        gvVar.w(vVar);
        tl(1.0f);
    }

    @NonNull
    public static a<v> r(@NonNull Context context, @NonNull v vVar) {
        return new a<>(context, vVar, new zn(vVar));
    }

    public void c(float f3) {
        setLevel((int) (f3 * 10000.0f));
    }

    @Override // r2.fb
    public /* bridge */ /* synthetic */ boolean c5() {
        return super.c5();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.fh.fb(canvas, fb());
            this.fh.zn(canvas, this.n);
            this.fh.n3(canvas, this.n, 0.0f, i4(), g2.y.y(this.f7632v.zn[0], getAlpha()));
            canvas.restore();
        }
    }

    public void f3(@NonNull s<S> sVar) {
        this.fh = sVar;
        sVar.a(this);
    }

    @Override // r2.fb, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.fh.gv();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.fh.v();
    }

    @Override // r2.fb, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public final float i4() {
        return this.f7624x;
    }

    @Override // r2.fb
    public /* bridge */ /* synthetic */ boolean i9() {
        return super.i9();
    }

    @Override // r2.fb, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f7623ej.n3();
        n(getLevel() / 10000.0f);
    }

    @Override // r2.fb
    public /* bridge */ /* synthetic */ boolean mt(@NonNull x5.n3 n3Var) {
        return super.mt(n3Var);
    }

    public final void n(float f3) {
        this.f7624x = f3;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        if (this.f7621b) {
            this.f7623ej.n3();
            n(i / 10000.0f);
            return true;
        }
        this.f7623ej.c5(i4() * 10000.0f);
        this.f7623ej.tl(i);
        return true;
    }

    @Override // r2.fb
    public boolean p(boolean z, boolean z5, boolean z7) {
        boolean zP = super.p(z, z5, z7);
        float fY = this.f7627fb.y(this.y.getContentResolver());
        if (fY == 0.0f) {
            this.f7621b = true;
        } else {
            this.f7621b = false;
            this.f7622d.a(50.0f / fY);
        }
        return zP;
    }

    @Override // r2.fb
    public /* bridge */ /* synthetic */ boolean s() {
        return super.s();
    }

    @Override // r2.fb, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // r2.fb, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // r2.fb, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z5) {
        return super.setVisible(z, z5);
    }

    @Override // r2.fb, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // r2.fb, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // r2.fb
    public /* bridge */ /* synthetic */ void t(@NonNull x5.n3 n3Var) {
        super.t(n3Var);
    }

    @Override // r2.fb
    public /* bridge */ /* synthetic */ boolean w(boolean z, boolean z5, boolean z7) {
        return super.w(z, z5, z7);
    }

    @NonNull
    public s<S> x4() {
        return this.fh;
    }
}
