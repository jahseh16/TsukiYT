package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import b3.v;
import c2.y;
import com.google.android.material.button.MaterialButton;
import i9.tl;
import w.a;
import w.p;
import w.s;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends tl {
    @Override // i9.tl
    @NonNull
    public s gv(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    @Override // i9.tl
    @NonNull
    public p i9(Context context, AttributeSet attributeSet) {
        return new s2.y(context, attributeSet);
    }

    @Override // i9.tl
    @NonNull
    public a n3(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // i9.tl
    @NonNull
    public AppCompatTextView wz(Context context, AttributeSet attributeSet) {
        return new d3.y(context, attributeSet);
    }

    @Override // i9.tl
    @NonNull
    public AppCompatButton zn(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }
}
