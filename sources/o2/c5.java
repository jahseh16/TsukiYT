package o2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public t2.gv f7076a;
    public float zn;
    public final TextPaint y = new TextPaint(1);
    public final t2.v n3 = new y();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f7077gv = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public WeakReference<n3> f7078v = new WeakReference<>(null);

    public interface n3 {
        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);

        void y();
    }

    public class y extends t2.v {
        public y() {
        }

        @Override // t2.v
        public void n3(@NonNull Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            c5.this.f7077gv = true;
            n3 n3Var = (n3) c5.this.f7078v.get();
            if (n3Var != null) {
                n3Var.y();
            }
        }

        @Override // t2.v
        public void y(int i) {
            c5.this.f7077gv = true;
            n3 n3Var = (n3) c5.this.f7078v.get();
            if (n3Var != null) {
                n3Var.y();
            }
        }
    }

    public c5(@Nullable n3 n3Var) {
        fb(n3Var);
    }

    public float a(String str) {
        if (!this.f7077gv) {
            return this.zn;
        }
        float fZn = zn(str);
        this.zn = fZn;
        this.f7077gv = false;
        return fZn;
    }

    public void c5(boolean z) {
        this.f7077gv = z;
    }

    public void fb(@Nullable n3 n3Var) {
        this.f7078v = new WeakReference<>(n3Var);
    }

    @Nullable
    public t2.gv gv() {
        return this.f7076a;
    }

    public void i9(Context context) {
        this.f7076a.i9(context, this.y, this.n3);
    }

    public void s(@Nullable t2.gv gvVar, Context context) {
        if (this.f7076a != gvVar) {
            this.f7076a = gvVar;
            if (gvVar != null) {
                gvVar.f(context, this.y, this.n3);
                n3 n3Var = this.f7078v.get();
                if (n3Var != null) {
                    this.y.drawableState = n3Var.getState();
                }
                gvVar.i9(context, this.y, this.n3);
                this.f7077gv = true;
            }
            n3 n3Var2 = this.f7078v.get();
            if (n3Var2 != null) {
                n3Var2.y();
                n3Var2.onStateChange(n3Var2.getState());
            }
        }
    }

    @NonNull
    public TextPaint v() {
        return this.y;
    }

    public final float zn(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.y.measureText(charSequence, 0, charSequence.length());
    }
}
