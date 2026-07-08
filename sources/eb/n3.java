package eb;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import eb.n3;
import eb.y;
import java.util.ArrayList;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3<T extends n3<T>> implements y.n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Object f3313gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public float f3314i9;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final eb.zn f3317v;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public static final mt f3305tl = new a("translationX");

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public static final mt f3306wz = new fb("translationY");

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public static final mt f3308xc = new s("translationZ");
    public static final mt w = new c5("scaleX");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final mt f3303p = new i9("scaleY");

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public static final mt f3302mt = new f("rotation");

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final mt f3300co = new t("rotationX");
    public static final mt z = new tl("rotationY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final mt f3304r = new wz("x");

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final mt f3307x4 = new y("y");

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final mt f3301i4 = new C0085n3("z");
    public static final mt f3 = new zn("alpha");
    public static final mt n = new gv("scrollX");
    public static final mt c = new v("scrollY");
    public float y = 0.0f;
    public float n3 = Float.MAX_VALUE;
    public boolean zn = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3309a = false;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public float f3312fb = Float.MAX_VALUE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f3315s = -Float.MAX_VALUE;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f3310c5 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<w> f3311f = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList<p> f3316t = new ArrayList<>();

    public static class a extends mt {
        public a(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            view.setTranslationX(f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return view.getTranslationX();
        }
    }

    public static class c5 extends mt {
        public c5(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            view.setScaleX(f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return view.getScaleX();
        }
    }

    public static class f extends mt {
        public f(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            view.setRotation(f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return view.getRotation();
        }
    }

    public static class fb extends mt {
        public fb(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            view.setTranslationY(f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return view.getTranslationY();
        }
    }

    public static class gv extends mt {
        public gv(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            view.setScrollX((int) f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return view.getScrollX();
        }
    }

    public static class i9 extends mt {
        public i9(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            view.setScaleY(f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return view.getScaleY();
        }
    }

    public static abstract class mt extends eb.zn<View> {
        public /* synthetic */ mt(String str, a aVar) {
            this(str);
        }

        public mt(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: eb.n3$n3, reason: collision with other inner class name */
    public static class C0085n3 extends mt {
        public C0085n3(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            ut.oa(view, f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return ut.j5(view);
        }
    }

    public interface p {
        void y(n3 n3Var, float f3, float f4);
    }

    public static class s extends mt {
        public s(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            ut.vp(view, f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return ut.vl(view);
        }
    }

    public static class t extends mt {
        public t(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            view.setRotationX(f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return view.getRotationX();
        }
    }

    public static class tl extends mt {
        public tl(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            view.setRotationY(f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return view.getRotationY();
        }
    }

    public static class v extends mt {
        public v(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            view.setScrollY((int) f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return view.getScrollY();
        }
    }

    public interface w {
        void y(n3 n3Var, boolean z, float f3, float f4);
    }

    public static class wz extends mt {
        public wz(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            view.setX(f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return view.getX();
        }
    }

    public static class xc {
        public float n3;
        public float y;
    }

    public static class y extends mt {
        public y(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            view.setY(f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return view.getY();
        }
    }

    public static class zn extends mt {
        public zn(String str) {
            super(str, null);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void n3(View view, float f3) {
            view.setAlpha(f3);
        }

        @Override // eb.zn
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public float y(View view) {
            return view.getAlpha();
        }
    }

    public <K> n3(K k3, eb.zn<K> znVar) {
        this.f3313gv = k3;
        this.f3317v = znVar;
        if (znVar == f3302mt || znVar == f3300co || znVar == z) {
            this.f3314i9 = 0.1f;
            return;
        }
        if (znVar == f3) {
            this.f3314i9 = 0.00390625f;
        } else if (znVar == w || znVar == f3303p) {
            this.f3314i9 = 0.00390625f;
        } else {
            this.f3314i9 = 1.0f;
        }
    }

    public static <T> void fb(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public boolean a() {
        return this.f3309a;
    }

    public T c5(float f4) {
        this.n3 = f4;
        this.zn = true;
        return this;
    }

    public final void f() {
        if (this.f3309a) {
            return;
        }
        this.f3309a = true;
        if (!this.zn) {
            this.n3 = gv();
        }
        float f4 = this.n3;
        if (f4 > this.f3312fb || f4 < this.f3315s) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        eb.y.gv().y(this, 0L);
    }

    public final float gv() {
        return this.f3317v.y(this.f3313gv);
    }

    public void i9() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f3309a) {
            return;
        }
        f();
    }

    public void n3() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f3309a) {
            zn(true);
        }
    }

    public void s(float f4) {
        this.f3317v.n3(this.f3313gv, f4);
        for (int i = 0; i < this.f3316t.size(); i++) {
            if (this.f3316t.get(i) != null) {
                this.f3316t.get(i).y(this, this.n3, this.y);
            }
        }
        fb(this.f3316t);
    }

    public abstract boolean t(long j);

    public float v() {
        return this.f3314i9 * 0.75f;
    }

    @Override // eb.y.n3
    public boolean y(long j) {
        long j4 = this.f3310c5;
        if (j4 == 0) {
            this.f3310c5 = j;
            s(this.n3);
            return false;
        }
        this.f3310c5 = j;
        boolean zT = t(j - j4);
        float fMin = Math.min(this.n3, this.f3312fb);
        this.n3 = fMin;
        float fMax = Math.max(fMin, this.f3315s);
        this.n3 = fMax;
        s(fMax);
        if (zT) {
            zn(false);
        }
        return zT;
    }

    public final void zn(boolean z5) {
        this.f3309a = false;
        eb.y.gv().fb(this);
        this.f3310c5 = 0L;
        this.zn = false;
        for (int i = 0; i < this.f3311f.size(); i++) {
            if (this.f3311f.get(i) != null) {
                this.f3311f.get(i).y(this, z5, this.n3, this.y);
            }
        }
        fb(this.f3311f);
    }
}
