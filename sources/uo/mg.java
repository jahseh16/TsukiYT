package uo;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ic.c5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class mg extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8398b;
    public boolean c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public c8.n3 f8399co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public jr.zn f8400d;
    public boolean d0;
    public boolean dm;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public int f8401ej;
    public Rect en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8402f;

    @Nullable
    public Map<String, Typeface> f3;
    public Rect f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f8403fb;
    public boolean fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public boolean f8404hw;
    public Bitmap j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public vl f8405j5;
    public RectF jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Paint f8406k;

    @Nullable
    public String n;
    public final Matrix o;
    public Canvas oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f8407p;
    public RectF q9;
    public boolean qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public c8.y f8408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8409s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public zn f8410t;
    public RectF u;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public Rect f8411ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ic.fb f8412v;
    public final ArrayList<n3> w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8413x;
    public Matrix xg;
    public s y;
    public Matrix y5;

    @Nullable
    public String z;

    public interface n3 {
        void y(s sVar);
    }

    public class y implements ValueAnimator.AnimatorUpdateListener {
        public y() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (mg.this.f8400d != null) {
                mg.this.f8400d.b(mg.this.f8412v.t());
            }
        }
    }

    public enum zn {
        NONE,
        PLAY,
        RESUME
    }

    public mg() {
        ic.fb fbVar = new ic.fb();
        this.f8412v = fbVar;
        this.f8403fb = true;
        this.f8409s = false;
        this.f8402f = false;
        this.f8410t = zn.NONE;
        this.w = new ArrayList<>();
        y yVar = new y();
        this.f8407p = yVar;
        this.d0 = false;
        this.fh = true;
        this.f8401ej = 255;
        this.f8405j5 = vl.AUTOMATIC;
        this.qn = false;
        this.o = new Matrix();
        this.dm = false;
        fbVar.addUpdateListener(yVar);
    }

    public final c8.n3 a8() {
        c8.n3 n3Var = this.f8399co;
        if (n3Var != null && !n3Var.n3(z6())) {
            this.f8399co = null;
        }
        if (this.f8399co == null) {
            this.f8399co = new c8.n3(getCallback(), this.z, null, this.y.i9());
        }
        return this.f8399co;
    }

    public void ad(final String str) {
        s sVar = this.y;
        if (sVar == null) {
            this.w.add(new n3() { // from class: uo.x4
                @Override // uo.mg.n3
                public final void y(s sVar2) {
                    this.y.o4(str, sVar2);
                }
            });
            return;
        }
        h.s sVarT = sVar.t(str);
        if (sVarT != null) {
            wf((int) (sVarT.n3 + sVarT.zn));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void ap() {
        this.w.clear();
        this.f8412v.co();
        if (isVisible()) {
            return;
        }
        this.f8410t = zn.NONE;
    }

    @Nullable
    public ta b(String str) {
        s sVar = this.y;
        if (sVar == null) {
            return null;
        }
        return sVar.i9().get(str);
    }

    public void bk(String str) {
        this.n = str;
        c8.y yVarEj = ej();
        if (yVarEj != null) {
            yVarEj.zn(str);
        }
    }

    public boolean c() {
        return this.c;
    }

    public void co() {
        this.w.clear();
        this.f8412v.cancel();
        if (isVisible()) {
            return;
        }
        this.f8410t = zn.NONE;
    }

    public void cr(uo.n3 n3Var) {
        c8.n3 n3Var2 = this.f8399co;
        if (n3Var2 != null) {
            n3Var2.gv(n3Var);
        }
    }

    public void cs(float f3) {
        this.f8412v.d(f3);
    }

    public final /* synthetic */ void ct(int i, s sVar) {
        wf(i);
    }

    public void cy(final float f3) {
        s sVar = this.y;
        if (sVar == null) {
            this.w.add(new n3() { // from class: uo.mt
                @Override // uo.mg.n3
                public final void y(s sVar2) {
                    this.y.rs(f3, sVar2);
                }
            });
        } else {
            this.f8412v.rz(c5.c5(sVar.w(), this.y.a(), f3));
        }
    }

    public s d() {
        return this.y;
    }

    public void d0() {
        this.w.clear();
        this.f8412v.f();
        if (isVisible()) {
            return;
        }
        this.f8410t = zn.NONE;
    }

    public final /* synthetic */ void dm(int i, s sVar) {
        pz(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        uo.zn.y("Drawable#draw");
        if (this.f8402f) {
            try {
                if (this.qn) {
                    yc(canvas, this.f8400d);
                } else {
                    f3(canvas);
                }
            } catch (Throwable th) {
                ic.a.n3("Lottie crashed in draw!", th);
            }
        } else if (this.qn) {
            yc(canvas, this.f8400d);
        } else {
            f3(canvas);
        }
        this.dm = false;
        uo.zn.n3("Drawable#draw");
    }

    public final /* synthetic */ void e(float f3, s sVar) {
        vp(f3);
    }

    public final /* synthetic */ void eb(int i, int i5, s sVar) {
        qk(i, i5);
    }

    public final c8.y ej() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f8408r == null) {
            c8.y yVar = new c8.y(getCallback(), null);
            this.f8408r = yVar;
            String str = this.n;
            if (str != null) {
                yVar.zn(str);
            }
        }
        return this.f8408r;
    }

    public boolean en() {
        if (isVisible()) {
            return this.f8412v.isRunning();
        }
        zn znVar = this.f8410t;
        return znVar == zn.PLAY || znVar == zn.RESUME;
    }

    public final void f3(Canvas canvas) {
        jr.zn znVar = this.f8400d;
        s sVar = this.y;
        if (znVar == null || sVar == null) {
            return;
        }
        this.o.reset();
        if (!getBounds().isEmpty()) {
            this.o.preScale(r2.width() / sVar.n3().width(), r2.height() / sVar.n3().height());
            this.o.preTranslate(r2.left, r2.top);
        }
        znVar.fb(canvas, this.o, this.f8401ej);
    }

    public boolean f7() {
        ic.fb fbVar = this.f8412v;
        if (fbVar == null) {
            return false;
        }
        return fbVar.isRunning();
    }

    public final void fh(int i, int i5) {
        Bitmap bitmap = this.j;
        if (bitmap == null || bitmap.getWidth() < i || this.j.getHeight() < i5) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i5, Bitmap.Config.ARGB_8888);
            this.j = bitmapCreateBitmap;
            this.oz.setBitmap(bitmapCreateBitmap);
            this.dm = true;
            return;
        }
        if (this.j.getWidth() > i || this.j.getHeight() > i5) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.j, 0, 0, i, i5);
            this.j = bitmapCreateBitmap2;
            this.oz.setBitmap(bitmapCreateBitmap2);
            this.dm = true;
        }
    }

    public void g(boolean z) {
        if (z != this.fh) {
            this.fh = z;
            jr.zn znVar = this.f8400d;
            if (znVar != null) {
                znVar.vl(z);
            }
            invalidateSelf();
        }
    }

    public final void g3(RectF rectF, float f3, float f4) {
        rectF.set(rectF.left * f3, rectF.top * f4, rectF.right * f3, rectF.bottom * f4);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8401ej;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        s sVar = this.y;
        if (sVar == null) {
            return -1;
        }
        return sVar.n3().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        s sVar = this.y;
        if (sVar == null) {
            return -1;
        }
        return sVar.n3().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void gq(final String str) {
        s sVar = this.y;
        if (sVar == null) {
            this.w.add(new n3() { // from class: uo.i4
                @Override // uo.mg.n3
                public final void y(s sVar2) {
                    this.y.ra(str, sVar2);
                }
            });
            return;
        }
        h.s sVarT = sVar.t(str);
        if (sVarT != null) {
            l((int) sVarT.n3);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @Nullable
    public yt hw() {
        s sVar = this.y;
        if (sVar != null) {
            return sVar.wz();
        }
        return null;
    }

    public boolean i2() {
        return this.f3 == null && this.y.zn().w() > 0;
    }

    public final void i4(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.dm) {
            return;
        }
        this.dm = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return f7();
    }

    @SuppressLint({"WrongConstant"})
    public int j() {
        return this.f8412v.getRepeatMode();
    }

    public float j5() {
        return this.f8412v.t();
    }

    public boolean jz() {
        return this.f8404hw;
    }

    public final boolean k() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    public boolean k5() {
        return this.d0;
    }

    public List<h.v> kp(h.v vVar) {
        if (this.f8400d == null) {
            ic.a.zn("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f8400d.v(vVar, 0, arrayList, new h.v(new String[0]));
        return arrayList;
    }

    public void l(final int i) {
        if (this.y == null) {
            this.w.add(new n3() { // from class: uo.rz
                @Override // uo.mg.n3
                public final void y(s sVar) {
                    this.y.nf(i, sVar);
                }
            });
        } else {
            this.f8412v.ta(i);
        }
    }

    public final /* synthetic */ void lc(String str, s sVar) {
        qj(str);
    }

    public void le(boolean z) {
        this.f8402f = z;
    }

    public void m(boolean z) {
        this.f8404hw = z;
    }

    @Nullable
    public Bitmap mg(String str) {
        c8.n3 n3VarA8 = a8();
        if (n3VarA8 != null) {
            return n3VarA8.y(str);
        }
        return null;
    }

    public void mp(int i) {
        this.f8412v.setRepeatMode(i);
    }

    public final void mt() {
        s sVar = this.y;
        if (sVar == null) {
            return;
        }
        jr.zn znVar = new jr.zn(this, hk.x4.n3(sVar), sVar.f(), sVar);
        this.f8400d = znVar;
        if (this.f8398b) {
            znVar.a8(true);
        }
        this.f8400d.vl(this.fh);
    }

    public void n(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (this.y != null) {
            mt();
        }
    }

    public final /* synthetic */ void nf(int i, s sVar) {
        l(i);
    }

    public int o() {
        return this.f8412v.getRepeatCount();
    }

    public void o0(@Nullable String str) {
        this.z = str;
    }

    public final /* synthetic */ void o4(String str, s sVar) {
        ad(str);
    }

    public void oa(boolean z) {
        if (this.f8398b == z) {
            return;
        }
        this.f8398b = z;
        jr.zn znVar = this.f8400d;
        if (znVar != null) {
            znVar.a8(z);
        }
    }

    public float oz() {
        return this.f8412v.p();
    }

    public final boolean p() {
        return this.f8403fb || this.f8409s;
    }

    public void pq(boolean z) {
        this.f8409s = z;
    }

    public void pz(final int i) {
        if (this.y == null) {
            this.w.add(new n3() { // from class: uo.d0
                @Override // uo.mg.n3
                public final void y(s sVar) {
                    this.y.dm(i, sVar);
                }
            });
        } else {
            this.f8412v.fh(i);
        }
    }

    public void q5(int i) {
        this.f8412v.setRepeatCount(i);
    }

    @Nullable
    public Typeface q9(h.zn znVar) {
        Map<String, Typeface> map = this.f3;
        if (map != null) {
            String strY = znVar.y();
            if (map.containsKey(strY)) {
                return map.get(strY);
            }
            String strN3 = znVar.n3();
            if (map.containsKey(strN3)) {
                return map.get(strN3);
            }
            String str = znVar.y() + "-" + znVar.zn();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        c8.y yVarEj = ej();
        if (yVarEj != null) {
            return yVarEj.n3(znVar);
        }
        return null;
    }

    public void qj(final String str) {
        s sVar = this.y;
        if (sVar == null) {
            this.w.add(new n3() { // from class: uo.p
                @Override // uo.mg.n3
                public final void y(s sVar2) {
                    this.y.lc(str, sVar2);
                }
            });
            return;
        }
        h.s sVarT = sVar.t(str);
        if (sVarT != null) {
            int i = (int) sVarT.n3;
            qk(i, ((int) sVarT.zn) + i);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void qk(final int i, final int i5) {
        if (this.y == null) {
            this.w.add(new n3() { // from class: uo.co
                @Override // uo.mg.n3
                public final void y(s sVar) {
                    this.y.eb(i, i5, sVar);
                }
            });
        } else {
            this.f8412v.mg(i, i5 + 0.99f);
        }
    }

    public vl qn() {
        return this.qn ? vl.SOFTWARE : vl.HARDWARE;
    }

    public final void r() {
        s sVar = this.y;
        if (sVar == null) {
            return;
        }
        this.qn = this.f8405j5.n3(Build.VERSION.SDK_INT, sVar.p(), sVar.tl());
    }

    public final /* synthetic */ void ra(String str, s sVar) {
        gq(str);
    }

    public void rb() {
        if (this.f8400d == null) {
            this.w.add(new n3() { // from class: uo.r
                @Override // uo.mg.n3
                public final void y(s sVar) {
                    this.y.xg(sVar);
                }
            });
            return;
        }
        r();
        if (p() || o() == 0) {
            if (isVisible()) {
                this.f8412v.n();
                this.f8410t = zn.NONE;
            } else {
                this.f8410t = zn.RESUME;
            }
        }
        if (p()) {
            return;
        }
        pz((int) (oz() < 0.0f ? vl() : yt()));
        this.f8412v.f();
        if (isVisible()) {
            return;
        }
        this.f8410t = zn.NONE;
    }

    public void ro(Boolean bool) {
        this.f8403fb = bool.booleanValue();
    }

    public final /* synthetic */ void rs(float f3, s sVar) {
        cy(f3);
    }

    public final void rz() {
        if (this.oz != null) {
            return;
        }
        this.oz = new Canvas();
        this.u = new RectF();
        this.y5 = new Matrix();
        this.xg = new Matrix();
        this.f8411ut = new Rect();
        this.q9 = new RectF();
        this.f8406k = new im.y();
        this.f7 = new Rect();
        this.en = new Rect();
        this.jz = new RectF();
    }

    public final /* synthetic */ void s8(float f3, s sVar) {
        w2(f3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f8401ej = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        ic.a.zn("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z5) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z5);
        if (z) {
            zn znVar = this.f8410t;
            if (znVar == zn.PLAY) {
                yg();
            } else if (znVar == zn.RESUME) {
                rb();
            }
        } else if (this.f8412v.isRunning()) {
            ap();
            this.f8410t = zn.RESUME;
        } else if (zIsVisible) {
            this.f8410t = zn.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        yg();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        d0();
    }

    public boolean ta() {
        return this.fh;
    }

    public void tg(@Nullable Map<String, Typeface> map) {
        if (map == this.f3) {
            return;
        }
        this.f3 = map;
        invalidateSelf();
    }

    public final /* synthetic */ void u(h.v vVar, Object obj, gn.zn znVar, s sVar) {
        w(vVar, obj, znVar);
    }

    public boolean u0(s sVar) {
        if (this.y == sVar) {
            return false;
        }
        this.dm = true;
        z();
        this.y = sVar;
        mt();
        this.f8412v.d0(sVar);
        w2(this.f8412v.getAnimatedFraction());
        Iterator it = new ArrayList(this.w).iterator();
        while (it.hasNext()) {
            n3 n3Var = (n3) it.next();
            if (n3Var != null) {
                n3Var.y(sVar);
            }
            it.remove();
        }
        this.w.clear();
        sVar.x4(this.f8413x);
        r();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public int ud() {
        return (int) this.f8412v.tl();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @Nullable
    public j5 ut() {
        return null;
    }

    public float vl() {
        return this.f8412v.w();
    }

    public void vp(final float f3) {
        s sVar = this.y;
        if (sVar == null) {
            this.w.add(new n3() { // from class: uo.n
                @Override // uo.mg.n3
                public final void y(s sVar2) {
                    this.y.e(f3, sVar2);
                }
            });
        } else {
            l((int) c5.c5(sVar.w(), this.y.a(), f3));
        }
    }

    public <T> void w(final h.v vVar, final T t3, @Nullable final gn.zn<T> znVar) {
        jr.zn znVar2 = this.f8400d;
        if (znVar2 == null) {
            this.w.add(new n3() { // from class: uo.z
                @Override // uo.mg.n3
                public final void y(s sVar) {
                    this.y.u(vVar, t3, znVar, sVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (vVar == h.v.zn) {
            znVar2.s(t3, znVar);
        } else if (vVar.gv() != null) {
            vVar.gv().s(t3, znVar);
        } else {
            List<h.v> listKp = kp(vVar);
            for (int i = 0; i < listKp.size(); i++) {
                listKp.get(i).gv().s(t3, znVar);
            }
            zIsEmpty = true ^ listKp.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t3 == ud.f8450ta) {
                w2(j5());
            }
        }
    }

    public void w2(final float f3) {
        if (this.y == null) {
            this.w.add(new n3() { // from class: uo.c
                @Override // uo.mg.n3
                public final void y(s sVar) {
                    this.y.s8(f3, sVar);
                }
            });
            return;
        }
        uo.zn.y("Drawable#setProgress");
        this.f8412v.fh(this.y.s(f3));
        uo.zn.n3("Drawable#setProgress");
    }

    public void w9(boolean z) {
        this.f8413x = z;
        s sVar = this.y;
        if (sVar != null) {
            sVar.x4(z);
        }
    }

    public void wf(final int i) {
        if (this.y == null) {
            this.w.add(new n3() { // from class: uo.fh
                @Override // uo.mg.n3
                public final void y(s sVar) {
                    this.y.ct(i, sVar);
                }
            });
        } else {
            this.f8412v.rz(i + 0.99f);
        }
    }

    @Nullable
    public String x() {
        return this.z;
    }

    public final void x4(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void x5(vl vlVar) {
        this.f8405j5 = vlVar;
        r();
    }

    public void xb(boolean z) {
        this.d0 = z;
    }

    public final /* synthetic */ void xg(s sVar) {
        rb();
    }

    public void y4(uo.y yVar) {
        c8.y yVar2 = this.f8408r;
        if (yVar2 != null) {
            yVar2.gv(yVar);
        }
    }

    public final /* synthetic */ void y5(s sVar) {
        yg();
    }

    public final void yc(Canvas canvas, jr.zn znVar) {
        if (this.y == null || znVar == null) {
            return;
        }
        rz();
        canvas.getMatrix(this.y5);
        canvas.getClipBounds(this.f8411ut);
        x4(this.f8411ut, this.q9);
        this.y5.mapRect(this.q9);
        i4(this.q9, this.f8411ut);
        if (this.fh) {
            this.u.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            znVar.gv(this.u, null, false);
        }
        this.y5.mapRect(this.u);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        g3(this.u, fWidth, fHeight);
        if (!k()) {
            RectF rectF = this.u;
            Rect rect = this.f8411ut;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.u.width());
        int iCeil2 = (int) Math.ceil(this.u.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        fh(iCeil, iCeil2);
        if (this.dm) {
            this.o.set(this.y5);
            this.o.preScale(fWidth, fHeight);
            Matrix matrix = this.o;
            RectF rectF2 = this.u;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.j.eraseColor(0);
            znVar.fb(this.oz, this.o, this.f8401ej);
            this.y5.invert(this.xg);
            this.xg.mapRect(this.jz, this.u);
            i4(this.jz, this.en);
        }
        this.f7.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.j, this.f7, this.en, this.f8406k);
    }

    public void yg() {
        if (this.f8400d == null) {
            this.w.add(new n3() { // from class: uo.f3
                @Override // uo.mg.n3
                public final void y(s sVar) {
                    this.y.y5(sVar);
                }
            });
            return;
        }
        r();
        if (p() || o() == 0) {
            if (isVisible()) {
                this.f8412v.z();
                this.f8410t = zn.NONE;
            } else {
                this.f8410t = zn.PLAY;
            }
        }
        if (p()) {
            return;
        }
        pz((int) (oz() < 0.0f ? vl() : yt()));
        this.f8412v.f();
        if (isVisible()) {
            return;
        }
        this.f8410t = zn.NONE;
    }

    public void yk(boolean z) {
        this.f8412v.z6(z);
    }

    public float yt() {
        return this.f8412v.xc();
    }

    public void z() {
        if (this.f8412v.isRunning()) {
            this.f8412v.cancel();
            if (!isVisible()) {
                this.f8410t = zn.NONE;
            }
        }
        this.y = null;
        this.f8400d = null;
        this.f8399co = null;
        this.f8412v.i9();
        invalidateSelf();
    }

    @Nullable
    public final Context z6() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void ix(j5 j5Var) {
    }
}
