package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.bottomsheet.MBottomSheetBehavior;
import free.daily.tube.base_impl.init.BaseApp;
import free.daily.tube.multipack.R;
import ir.f;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vq.a;
import zh1.xc;

/* JADX INFO: loaded from: classes.dex */
public class MBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public final Lazy en;

    public MBottomSheetBehavior() {
        this.en = LazyKt.lazy(new Function0() { // from class: y1.n3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(MBottomSheetBehavior.vp());
            }
        });
    }

    public static final int vp() {
        return a.zn(R.dimen.y, BaseApp.n3.y());
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public void cr(View child, int i) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (eb() || i != 5) {
            super.cr(child, i);
        }
    }

    public final int gq() {
        return ((Number) this.en.getValue()).intValue();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public void wf(View view, int i, int i5, boolean z) {
        if (i != 4) {
            super.wf(view, i, i5, z);
            return;
        }
        int iGq = ((List) f.y.f().getValue()).size() > 1 ? gq() : 0;
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int iF = iArr[1] - xc.f(view.getResources());
            if (i5 > 0) {
                float f3 = iF / i5;
                if (0.0f <= f3 && f3 <= 1.0f) {
                    iGq = (int) ((1 - f3) * iGq);
                }
            }
        }
        super.wf(view, i, i5 - iGq, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.en = LazyKt.lazy(new Function0() { // from class: y1.n3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(MBottomSheetBehavior.vp());
            }
        });
    }
}
