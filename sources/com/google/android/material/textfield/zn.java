package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.TextInputLayout;
import o2.i9;

/* JADX INFO: loaded from: classes.dex */
public class zn extends b3.zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout.fb f2945a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final TextWatcher f2946gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextInputLayout.a f2947v;

    public class gv implements View.OnClickListener {
        public gv() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = zn.this.y.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (zn.this.fb()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            zn.this.y.ut();
        }
    }

    public class n3 implements TextInputLayout.a {
        public n3() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.a
        public void y(@NonNull TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            zn.this.zn.setChecked(!r4.fb());
            editText.removeTextChangedListener(zn.this.f2946gv);
            editText.addTextChangedListener(zn.this.f2946gv);
        }
    }

    public class y extends i9 {
        public y() {
        }

        @Override // o2.i9, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i5, int i8) {
            zn.this.zn.setChecked(!r1.fb());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.zn$zn, reason: collision with other inner class name */
    public class C0075zn implements TextInputLayout.fb {

        /* JADX INFO: renamed from: com.google.android.material.textfield.zn$zn$y */
        public class y implements Runnable {
            public final /* synthetic */ EditText y;

            public y(EditText editText) {
                this.y = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.y.removeTextChangedListener(zn.this.f2946gv);
            }
        }

        public C0075zn() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.fb
        public void y(@NonNull TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new y(editText));
        }
    }

    public zn(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f2946gv = new y();
        this.f2947v = new n3();
        this.f2945a = new C0075zn();
    }

    public static boolean s(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    public final boolean fb() {
        EditText editText = this.y.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // b3.zn
    public void y() {
        this.y.setEndIconDrawable(f.n3.gv(this.n3, R$drawable.y));
        TextInputLayout textInputLayout = this.y;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R$string.z));
        this.y.setEndIconOnClickListener(new gv());
        this.y.v(this.f2947v);
        this.y.a(this.f2945a);
        EditText editText = this.y.getEditText();
        if (s(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
