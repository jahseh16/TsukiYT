package m3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import qn.ut;
import y2.c5;
import y2.fb;

/* JADX INFO: loaded from: classes.dex */
public class zn extends ConstraintLayout {
    public int j;
    public final Runnable o;
    public fb oz;

    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zn.this.n();
        }
    }

    public zn(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean f3(View view) {
        return "skip".equals(view.getTag());
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(ut.tl());
        }
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.o);
            handler.post(this.o);
        }
    }

    public void i4(int i) {
        this.j = i;
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n() {
        int childCount = getChildCount();
        int i = 1;
        for (int i5 = 0; i5 < childCount; i5++) {
            if (f3(getChildAt(i5))) {
                i++;
            }
        }
        androidx.constraintlayout.widget.zn znVar = new androidx.constraintlayout.widget.zn();
        znVar.fb(this);
        float f3 = 0.0f;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getId() != R$id.n3 && !f3(childAt)) {
                znVar.i9(childAt.getId(), R$id.n3, this.j, f3);
                f3 += 360.0f / (childCount - i);
            }
        }
        znVar.zn(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.ViewGroup*/.onFinishInflate();
        n();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        c();
    }

    public final Drawable r() {
        fb fbVar = new fb();
        this.oz = fbVar;
        fbVar.ut(new c5(0.5f));
        this.oz.k(ColorStateList.valueOf(-1));
        return this.oz;
    }

    public void setBackgroundColor(int i) {
        this.oz.k(ColorStateList.valueOf(i));
    }

    public int x4() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zn(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R$layout.f2262f, (ViewGroup) this);
        ut.u0(this, r());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.sc, i, 0);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.x1, 0);
        this.o = new y();
        typedArrayObtainStyledAttributes.recycle();
    }
}
