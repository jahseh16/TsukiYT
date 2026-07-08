package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import o2.f;
import o2.v;

/* JADX INFO: loaded from: classes.dex */
public class TextInputEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f2860f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2861t;

    public TextInputEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.f2184xc);
    }

    @Nullable
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void getFocusedRect(@Nullable Rect rect) {
        super/*android.widget.EditText*/.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f2861t || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f2860f);
        rect.bottom = this.f2860f.bottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean getGlobalVisibleRect(@Nullable Rect rect, @Nullable Point point) {
        boolean globalVisibleRect = super/*android.widget.EditText*/.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f2861t && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.f2860f, point);
            rect.bottom = this.f2860f.bottom;
        }
        return globalVisibleRect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.vl()) ? super/*android.widget.EditText*/.getHint() : textInputLayout.getHint();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final String n3(@NonNull TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        setLabelFor(R$id.f2257yt);
        String str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        String string = !zIsEmpty2 ? hint.toString() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        if (zIsEmpty) {
            return !TextUtils.isEmpty(string) ? string : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        if (!TextUtils.isEmpty(string)) {
            str = ", " + string;
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.widget.EditText*/.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.vl() && super/*android.widget.EditText*/.getHint() == null && v.y()) {
            setHint(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        }
    }

    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.widget.EditText*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        accessibilityNodeInfo.setText(n3(textInputLayout));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean requestRectangleOnScreen(@Nullable Rect rect) {
        boolean zRequestRectangleOnScreen = super/*android.widget.EditText*/.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f2861t) {
            this.f2860f.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(R$dimen.qn), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f2860f, true);
        }
        return zRequestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f2861t = z;
    }

    public TextInputEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(e3.y.zn(context, attributeSet, i, 0), attributeSet, i);
        this.f2860f = new Rect();
        TypedArray typedArrayS = f.s(context, attributeSet, R$styleable.P, i, R$style.f2299i9, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayS.getBoolean(R$styleable.Q, false));
        typedArrayS.recycle();
    }
}
