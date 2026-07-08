package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import o2.i9;

/* JADX INFO: loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f2949f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final EditText f2950fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextWatcher f2951s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextInputLayout f2952v;
    public final Chip y;

    public class n3 extends i9 {
        public n3() {
        }

        @Override // o2.i9, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.y.setText(ChipTextInputComboView.this.zn("00"));
            } else {
                ChipTextInputComboView.this.y.setText(ChipTextInputComboView.this.zn(editable));
            }
        }
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void gv() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2950fb.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.y.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gv();
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
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.y.setChecked(z);
        this.f2950fb.setVisibility(z ? 0 : 4);
        this.y.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            this.f2950fb.requestFocus();
            if (TextUtils.isEmpty(this.f2950fb.getText())) {
                return;
            }
            EditText editText = this.f2950fb;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.y.setOnClickListener(onClickListener);
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
    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.y.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.y.toggle();
    }

    public final String zn(CharSequence charSequence) {
        return TimeModel.y(getResources(), charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View, com.google.android.material.chip.Chip] */
    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ?? r52 = (Chip) layoutInflaterFrom.inflate(R$layout.f2271t, (ViewGroup) this, false);
        this.y = r52;
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R$layout.f2272tl, (ViewGroup) this, false);
        this.f2952v = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f2950fb = editText;
        editText.setVisibility(4);
        n3 n3Var = new n3();
        this.f2951s = n3Var;
        editText.addTextChangedListener(n3Var);
        gv();
        addView(r52);
        addView(textInputLayout);
        this.f2949f = (TextView) findViewById(R$id.f2250tl);
        editText.setSaveEnabled(false);
    }
}
