package e2;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface gv {

    /* JADX INFO: renamed from: e2.gv$gv, reason: collision with other inner class name */
    public static class C0081gv extends Property<gv, Integer> {
        public static final Property<gv, Integer> y = new C0081gv("circularRevealScrimColor");

        public C0081gv(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull gv gvVar, @NonNull Integer num) {
            gvVar.setCircularRevealScrimColor(num.intValue());
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Integer get(@NonNull gv gvVar) {
            return Integer.valueOf(gvVar.getCircularRevealScrimColor());
        }
    }

    public static class n3 implements TypeEvaluator<v> {
        public static final TypeEvaluator<v> n3 = new n3();
        public final v y = new v();

        @Override // android.animation.TypeEvaluator
        @NonNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public v evaluate(float f3, @NonNull v vVar, @NonNull v vVar2) {
            this.y.y(q2.y.zn(vVar.y, vVar2.y, f3), q2.y.zn(vVar.n3, vVar2.n3, f3), q2.y.zn(vVar.zn, vVar2.zn, f3));
            return this.y;
        }
    }

    public static class v {
        public float n3;
        public float y;
        public float zn;

        public void y(float f3, float f4, float f5) {
            this.y = f3;
            this.n3 = f4;
            this.zn = f5;
        }

        public v() {
        }

        public v(float f3, float f4, float f5) {
            this.y = f3;
            this.n3 = f4;
            this.zn = f5;
        }
    }

    public static class zn extends Property<gv, v> {
        public static final Property<gv, v> y = new zn("circularReveal");

        public zn(String str) {
            super(v.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull gv gvVar, @Nullable v vVar) {
            gvVar.setRevealInfo(vVar);
        }

        @Override // android.util.Property
        @Nullable
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public v get(@NonNull gv gvVar) {
            return gvVar.getRevealInfo();
        }
    }

    int getCircularRevealScrimColor();

    @Nullable
    v getRevealInfo();

    void n3();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(@Nullable v vVar);

    void y();
}
