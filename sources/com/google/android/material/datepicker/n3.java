package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import h2.a;
import h2.c5;
import h2.s;
import java.util.Iterator;
import java.util.LinkedHashSet;
import qn.ut;
import y2.fb;

/* JADX INFO: loaded from: classes.dex */
public final class n3<S> extends DialogFragment {

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f2689ej;
    public TextView en;
    public int f7;
    public int fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public c5<S> f2691hw;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f2692j5;
    public CheckableImageButton jz;
    public int oz;
    public boolean q9;
    public com.google.android.material.datepicker.y<S> qn;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public CharSequence f2693ut;
    public Button xg;

    @Nullable
    public fb y5;
    public static final Object dm = "CONFIRM_BUTTON_TAG";
    public static final Object ct = "CANCEL_BUTTON_TAG";
    public static final Object o4 = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final LinkedHashSet<a<? super S>> f2690fb = new LinkedHashSet<>();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f2688co = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> f3 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> d0 = new LinkedHashSet<>();

    public class gv implements View.OnClickListener {
        public gv() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n3.this.xg.setEnabled(n3.this.f2689ej.ap());
            n3.this.jz.toggle();
            n3 n3Var = n3.this;
            n3Var.gm(n3Var.jz);
            n3.this.m5();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n3$n3, reason: collision with other inner class name */
    public class ViewOnClickListenerC0065n3 implements View.OnClickListener {
        public ViewOnClickListenerC0065n3() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = n3.this.f2688co.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            n3.this.dismiss();
        }
    }

    public class y implements View.OnClickListener {
        public y() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = n3.this.f2690fb.iterator();
            while (it.hasNext()) {
                ((a) it.next()).y(n3.this.cp());
            }
            n3.this.dismiss();
        }
    }

    public class zn extends s<S> {
        public zn() {
        }

        @Override // h2.s
        public void y(S s3) {
            n3.this.op();
            n3.this.xg.setEnabled(n3.this.f2689ej.ap());
        }
    }

    public static int ja(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.f2199ej);
        int i = Month.gv().f2680s;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(R$dimen.f2194a8) * i) + ((i - 1) * resources.getDimensionPixelOffset(R$dimen.f2208k5));
    }

    public static int rk(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.f2203hw) + resources.getDimensionPixelOffset(R$dimen.f2206j5) + resources.getDimensionPixelOffset(R$dimen.vl);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.f2220x);
        int i = com.google.android.material.datepicker.zn.f2708t;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R$dimen.f2216ud) * i) + ((i - 1) * resources.getDimensionPixelOffset(R$dimen.f2223yt)) + resources.getDimensionPixelOffset(R$dimen.f2224z6);
    }

    public static boolean t3(@NonNull Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(t2.n3.zn(context, R$attr.f2169i4, com.google.android.material.datepicker.y.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public static boolean t6(@NonNull Context context) {
        return t3(context, R$attr.c);
    }

    @NonNull
    public static Drawable wv(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, f.n3.gv(context, R$drawable.n3));
        stateListDrawable.addState(new int[0], f.n3.gv(context, R$drawable.zn));
        return stateListDrawable;
    }

    public static boolean y0(@NonNull Context context) {
        return t3(context, R.attr.windowFullscreen);
    }

    public String bx() {
        return this.f2689ej.k(getContext());
    }

    @Nullable
    public final S cp() {
        return this.f2689ej.g();
    }

    public final int gd(Context context) {
        int i = this.fh;
        return i != 0 ? i : this.f2689ej.mg(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void gm(@NonNull CheckableImageButton checkableImageButton) {
        this.jz.setContentDescription(this.jz.isChecked() ? checkableImageButton.getContext().getString(R$string.w) : checkableImageButton.getContext().getString(R$string.f2284mt));
    }

    public final void m5() {
        int iGd = gd(requireContext());
        this.qn = com.google.android.material.datepicker.y.t3(this.f2689ej, iGd, this.f2692j5);
        this.f2691hw = this.jz.isChecked() ? h2.fb.j4(this.f2689ej, iGd, this.f2692j5) : this.qn;
        op();
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R$id.f3, this.f2691hw);
        fragmentTransactionBeginTransaction.commitNow();
        this.f2691hw.ez(new zn());
    }

    public final void ng(Context context) {
        this.jz.setTag(o4);
        this.jz.setImageDrawable(wv(context));
        this.jz.setChecked(this.f7 != 0);
        ut.g3(this.jz, (qn.y) null);
        gm(this.jz);
        this.jz.setOnClickListener(new gv());
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f3.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.fh = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f2689ej = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f2692j5 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.oz = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2693ut = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f7 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), gd(requireContext()));
        Context context = dialog.getContext();
        this.q9 = y0(context);
        int iZn = t2.n3.zn(context, R$attr.f2181wz, n3.class.getCanonicalName());
        fb fbVar = new fb(context, null, R$attr.f2169i4, R$style.f2298i4);
        this.y5 = fbVar;
        fbVar.k5(context);
        this.y5.k(ColorStateList.valueOf(iZn));
        this.y5.q9(ut.n(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.q9 ? R$layout.f3 : R$layout.f2265i4, viewGroup);
        Context context = viewInflate.getContext();
        if (this.q9) {
            viewInflate.findViewById(R$id.f3).setLayoutParams(new LinearLayout.LayoutParams(ja(context), -2));
        } else {
            View viewFindViewById = viewInflate.findViewById(R$id.n);
            View viewFindViewById2 = viewInflate.findViewById(R$id.f3);
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(ja(context), -1));
            viewFindViewById2.setMinimumHeight(rk(requireContext()));
        }
        TextView textView = (TextView) viewInflate.findViewById(R$id.mg);
        this.en = textView;
        ut.g(textView, 1);
        this.jz = (CheckableImageButton) viewInflate.findViewById(R$id.f2249ta);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.f2234d);
        CharSequence charSequence = this.f2693ut;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.oz);
        }
        ng(context);
        this.xg = (Button) viewInflate.findViewById(R$id.zn);
        if (this.f2689ej.ap()) {
            this.xg.setEnabled(true);
        } else {
            this.xg.setEnabled(false);
        }
        this.xg.setTag(dm);
        this.xg.setOnClickListener(new y());
        Button button = (Button) viewInflate.findViewById(R$id.y);
        button.setTag(ct);
        button.setOnClickListener(new ViewOnClickListenerC0065n3());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.d0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.fh);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f2689ej);
        CalendarConstraints.n3 n3Var = new CalendarConstraints.n3(this.f2692j5);
        if (this.qn.gd() != null) {
            n3Var.n3(this.qn.gd().f2681t);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", n3Var.y());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.oz);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f2693ut);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.q9) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.y5);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.f2195b);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.y5, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new j2.y(requireDialog(), rect));
        }
        m5();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f2691hw.wb();
        super.onStop();
    }

    public final void op() {
        String strBx = bx();
        this.en.setContentDescription(String.format(getString(R$string.f2288tl), strBx));
        this.en.setText(strBx);
    }
}
