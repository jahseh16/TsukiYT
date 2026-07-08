package y2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import com.google.android.material.R$styleable;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public static final y2.zn f9233tl = new c5(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y2.zn f9234a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public a f9235c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f9236f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public y2.zn f9237fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public gv f9238gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public a f9239i9;
    public gv n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y2.zn f9240s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f9241t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y2.zn f9242v;
    public gv y;
    public gv zn;

    public interface zn {
        @NonNull
        y2.zn y(@NonNull y2.zn znVar);
    }

    @NonNull
    public static n3 a(@NonNull Context context, AttributeSet attributeSet, int i, int i5, int i8) {
        return fb(context, attributeSet, i, i5, new y2.y(i8));
    }

    @NonNull
    public static n3 fb(@NonNull Context context, AttributeSet attributeSet, int i, int i5, @NonNull y2.zn znVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.nw, i, i5);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.a0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.gp, 0);
        typedArrayObtainStyledAttributes.recycle();
        return gv(context, resourceId, resourceId2, znVar);
    }

    @NonNull
    public static n3 gv(Context context, int i, int i5, @NonNull y2.zn znVar) {
        if (i5 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i5;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.f5);
        try {
            int i8 = typedArrayObtainStyledAttributes.getInt(R$styleable.zl, 0);
            int i10 = typedArrayObtainStyledAttributes.getInt(R$styleable.n5, i8);
            int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.ea, i8);
            int i12 = typedArrayObtainStyledAttributes.getInt(R$styleable.dj, i8);
            int i13 = typedArrayObtainStyledAttributes.getInt(R$styleable.ho, i8);
            y2.zn znVarTl = tl(typedArrayObtainStyledAttributes, R$styleable.af, znVar);
            y2.zn znVarTl2 = tl(typedArrayObtainStyledAttributes, R$styleable.zr, znVarTl);
            y2.zn znVarTl3 = tl(typedArrayObtainStyledAttributes, R$styleable.dq, znVarTl);
            y2.zn znVarTl4 = tl(typedArrayObtainStyledAttributes, R$styleable.p7, znVarTl);
            return new n3().c(i10, znVarTl2).mg(i11, znVarTl3).x4(i12, znVarTl4).mt(i13, tl(typedArrayObtainStyledAttributes, R$styleable.je, znVarTl));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static n3 n3(Context context, int i, int i5) {
        return zn(context, i, i5, 0);
    }

    @NonNull
    public static y2.zn tl(TypedArray typedArray, int i, @NonNull y2.zn znVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return znVar;
        }
        int i5 = typedValuePeekValue.type;
        return i5 == 5 ? new y2.y(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i5 == 6 ? new c5(typedValuePeekValue.getFraction(1.0f, 1.0f)) : znVar;
    }

    @NonNull
    public static n3 v(@NonNull Context context, AttributeSet attributeSet, int i, int i5) {
        return a(context, attributeSet, i, i5, 0);
    }

    @NonNull
    public static n3 y() {
        return new n3();
    }

    @NonNull
    public static n3 zn(Context context, int i, int i5, int i8) {
        return gv(context, i, i5, new y2.y(i8));
    }

    @NonNull
    public gv c5() {
        return this.f9238gv;
    }

    @NonNull
    public gv co() {
        return this.n3;
    }

    @NonNull
    public gv f() {
        return this.zn;
    }

    @NonNull
    public f f3(@NonNull y2.zn znVar) {
        return x4().w(znVar).tl();
    }

    @NonNull
    public f i4(float f3) {
        return x4().xc(f3).tl();
    }

    @NonNull
    public y2.zn i9() {
        return this.f9240s;
    }

    @NonNull
    public y2.zn mt() {
        return this.f9242v;
    }

    @NonNull
    public f n(@NonNull zn znVar) {
        return x4().rz(znVar.y(mt())).z6(znVar.y(z())).r(znVar.y(i9())).n(znVar.y(t())).tl();
    }

    @NonNull
    public gv p() {
        return this.y;
    }

    public boolean r(@NonNull RectF rectF) {
        boolean z = this.f9241t.getClass().equals(a.class) && this.f9239i9.getClass().equals(a.class) && this.f9235c5.getClass().equals(a.class) && this.f9236f.getClass().equals(a.class);
        float fY = this.f9242v.y(rectF);
        return z && ((this.f9234a.y(rectF) > fY ? 1 : (this.f9234a.y(rectF) == fY ? 0 : -1)) == 0 && (this.f9240s.y(rectF) > fY ? 1 : (this.f9240s.y(rectF) == fY ? 0 : -1)) == 0 && (this.f9237fb.y(rectF) > fY ? 1 : (this.f9237fb.y(rectF) == fY ? 0 : -1)) == 0) && ((this.n3 instanceof i9) && (this.y instanceof i9) && (this.zn instanceof i9) && (this.f9238gv instanceof i9));
    }

    @NonNull
    public a s() {
        return this.f9236f;
    }

    @NonNull
    public y2.zn t() {
        return this.f9237fb;
    }

    @NonNull
    public a w() {
        return this.f9235c5;
    }

    @NonNull
    public a wz() {
        return this.f9241t;
    }

    @NonNull
    public n3 x4() {
        return new n3(this);
    }

    @NonNull
    public a xc() {
        return this.f9239i9;
    }

    @NonNull
    public y2.zn z() {
        return this.f9234a;
    }

    public f(@NonNull n3 n3Var) {
        this.y = n3Var.y;
        this.n3 = n3Var.n3;
        this.zn = n3Var.zn;
        this.f9238gv = n3Var.f9247gv;
        this.f9242v = n3Var.f9251v;
        this.f9234a = n3Var.f9243a;
        this.f9237fb = n3Var.f9246fb;
        this.f9240s = n3Var.f9249s;
        this.f9235c5 = n3Var.f9244c5;
        this.f9239i9 = n3Var.f9248i9;
        this.f9236f = n3Var.f9245f;
        this.f9241t = n3Var.f9250t;
    }

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public y2.zn f9243a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @NonNull
        public a f9244c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public a f9245f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @NonNull
        public y2.zn f9246fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @NonNull
        public gv f9247gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        @NonNull
        public a f9248i9;

        @NonNull
        public gv n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NonNull
        public y2.zn f9249s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NonNull
        public a f9250t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NonNull
        public y2.zn f9251v;

        @NonNull
        public gv y;

        @NonNull
        public gv zn;

        public n3() {
            this.y = s.n3();
            this.n3 = s.n3();
            this.zn = s.n3();
            this.f9247gv = s.n3();
            this.f9251v = new y2.y(0.0f);
            this.f9243a = new y2.y(0.0f);
            this.f9246fb = new y2.y(0.0f);
            this.f9249s = new y2.y(0.0f);
            this.f9244c5 = s.zn();
            this.f9248i9 = s.zn();
            this.f9245f = s.zn();
            this.f9250t = s.zn();
        }

        public static float wz(gv gvVar) {
            if (gvVar instanceof i9) {
                return ((i9) gvVar).y;
            }
            if (gvVar instanceof v) {
                return ((v) gvVar).y;
            }
            return -1.0f;
        }

        @NonNull
        public n3 c(int i, @NonNull y2.zn znVar) {
            return d0(s.y(i)).rz(znVar);
        }

        @NonNull
        public n3 co(@NonNull gv gvVar) {
            this.f9247gv = gvVar;
            float fWz = wz(gvVar);
            if (fWz != -1.0f) {
                z(fWz);
            }
            return this;
        }

        @NonNull
        public n3 d(float f3) {
            this.f9243a = new y2.y(f3);
            return this;
        }

        @NonNull
        public n3 d0(@NonNull gv gvVar) {
            this.y = gvVar;
            float fWz = wz(gvVar);
            if (fWz != -1.0f) {
                fh(fWz);
            }
            return this;
        }

        @NonNull
        public n3 f3(float f3) {
            this.f9246fb = new y2.y(f3);
            return this;
        }

        @NonNull
        public n3 fh(float f3) {
            this.f9251v = new y2.y(f3);
            return this;
        }

        @NonNull
        public n3 i4(@NonNull gv gvVar) {
            this.zn = gvVar;
            float fWz = wz(gvVar);
            if (fWz != -1.0f) {
                f3(fWz);
            }
            return this;
        }

        @NonNull
        public n3 mg(int i, @NonNull y2.zn znVar) {
            return ta(s.y(i)).z6(znVar);
        }

        @NonNull
        public n3 mt(int i, @NonNull y2.zn znVar) {
            return co(s.y(i)).r(znVar);
        }

        @NonNull
        public n3 n(@NonNull y2.zn znVar) {
            this.f9246fb = znVar;
            return this;
        }

        @NonNull
        public n3 p(@NonNull gv gvVar) {
            return d0(gvVar).ta(gvVar).i4(gvVar).co(gvVar);
        }

        @NonNull
        public n3 r(@NonNull y2.zn znVar) {
            this.f9249s = znVar;
            return this;
        }

        @NonNull
        public n3 rz(@NonNull y2.zn znVar) {
            this.f9251v = znVar;
            return this;
        }

        @NonNull
        public n3 ta(@NonNull gv gvVar) {
            this.n3 = gvVar;
            float fWz = wz(gvVar);
            if (fWz != -1.0f) {
                d(fWz);
            }
            return this;
        }

        @NonNull
        public f tl() {
            return new f(this);
        }

        @NonNull
        public n3 w(@NonNull y2.zn znVar) {
            return rz(znVar).z6(znVar).n(znVar).r(znVar);
        }

        @NonNull
        public n3 x4(int i, @NonNull y2.zn znVar) {
            return i4(s.y(i)).n(znVar);
        }

        @NonNull
        public n3 xc(float f3) {
            return fh(f3).d(f3).f3(f3).z(f3);
        }

        @NonNull
        public n3 z(float f3) {
            this.f9249s = new y2.y(f3);
            return this;
        }

        @NonNull
        public n3 z6(@NonNull y2.zn znVar) {
            this.f9243a = znVar;
            return this;
        }

        public n3(@NonNull f fVar) {
            this.y = s.n3();
            this.n3 = s.n3();
            this.zn = s.n3();
            this.f9247gv = s.n3();
            this.f9251v = new y2.y(0.0f);
            this.f9243a = new y2.y(0.0f);
            this.f9246fb = new y2.y(0.0f);
            this.f9249s = new y2.y(0.0f);
            this.f9244c5 = s.zn();
            this.f9248i9 = s.zn();
            this.f9245f = s.zn();
            this.f9250t = s.zn();
            this.y = fVar.y;
            this.n3 = fVar.n3;
            this.zn = fVar.zn;
            this.f9247gv = fVar.f9238gv;
            this.f9251v = fVar.f9242v;
            this.f9243a = fVar.f9234a;
            this.f9246fb = fVar.f9237fb;
            this.f9249s = fVar.f9240s;
            this.f9244c5 = fVar.f9235c5;
            this.f9248i9 = fVar.f9239i9;
            this.f9245f = fVar.f9236f;
            this.f9250t = fVar.f9241t;
        }
    }

    public f() {
        this.y = s.n3();
        this.n3 = s.n3();
        this.zn = s.n3();
        this.f9238gv = s.n3();
        this.f9242v = new y2.y(0.0f);
        this.f9234a = new y2.y(0.0f);
        this.f9237fb = new y2.y(0.0f);
        this.f9240s = new y2.y(0.0f);
        this.f9235c5 = s.zn();
        this.f9239i9 = s.zn();
        this.f9236f = s.zn();
        this.f9241t = s.zn();
    }
}
