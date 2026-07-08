package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    public final Chip j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnClickListener f2970k;
    public final Chip o;
    public final ClockHandView oz;
    public final MaterialButtonToggleGroup q9;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public final ClockFaceView f2971ut;

    public interface a {
    }

    public interface fb {
    }

    public class gv implements View.OnTouchListener {
        public final /* synthetic */ GestureDetector y;

        public gv(GestureDetector gestureDetector) {
            this.y = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.y.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public class n3 implements MaterialButtonToggleGroup.v {
        public n3() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.v
        public void y(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            TimePickerView.x4(TimePickerView.this);
        }
    }

    public interface v {
    }

    public class y implements View.OnClickListener {
        public y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.r(TimePickerView.this);
        }
    }

    public class zn extends GestureDetector.SimpleOnGestureListener {
        public zn() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean zOnDoubleTap = super.onDoubleTap(motionEvent);
            TimePickerView.i4(TimePickerView.this);
            return zOnDoubleTap;
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ v i4(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public static /* synthetic */ fb r(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public static /* synthetic */ a x4(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        if (this.q9.getVisibility() == 0) {
            androidx.constraintlayout.widget.zn znVar = new androidx.constraintlayout.widget.zn();
            znVar.fb(this);
            znVar.v(R$id.f2247s, ut.ta(this) == 0 ? 2 : 1);
            znVar.zn(this);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f3() {
        this.o.setTag(R$id.f2235ej, 12);
        this.j.setTag(R$id.f2235ej, 10);
        this.o.setOnClickListener(this.f2970k);
        this.j.setOnClickListener(this.f2970k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void n() {
        View.OnTouchListener gvVar = new gv(new GestureDetector(getContext(), new zn()));
        this.o.setOnTouchListener(gvVar);
        this.j.setOnTouchListener(gvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onVisibilityChanged(@NonNull View view, int i) {
        super/*android.view.ViewGroup*/.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2970k = new y();
        LayoutInflater.from(context).inflate(R$layout.f2274wz, (ViewGroup) this);
        this.f2971ut = (ClockFaceView) findViewById(R$id.f2232c5);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R$id.f2236f);
        this.q9 = materialButtonToggleGroup;
        materialButtonToggleGroup.fb(new n3());
        this.o = (Chip) findViewById(R$id.f2253wz);
        this.j = (Chip) findViewById(R$id.f2248t);
        this.oz = (ClockHandView) findViewById(R$id.f2241i9);
        n();
        f3();
    }
}
