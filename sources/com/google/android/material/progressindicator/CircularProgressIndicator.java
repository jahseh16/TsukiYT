package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import r2.a;
import r2.i9;
import r2.v;

/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressIndicator extends y<v> {
    public static final int fh = R$style.f2300mt;

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.f2175s);
    }

    public final void co() {
        setIndeterminateDrawable(i9.co(getContext(), (v) this.y));
        setProgressDrawable(a.r(getContext(), (v) this.y));
    }

    public int getIndicatorDirection() {
        return ((v) this.y).f7649c5;
    }

    public int getIndicatorInset() {
        return ((v) this.y).f7651s;
    }

    public int getIndicatorSize() {
        return ((v) this.y).f7650fb;
    }

    @Override // com.google.android.material.progressindicator.y
    /* JADX INFO: renamed from: mt, reason: merged with bridge method [inline-methods] */
    public v c5(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    public void setIndicatorDirection(int i) {
        ((v) this.y).f7649c5 = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s3 = this.y;
        if (((v) s3).f7651s != i) {
            ((v) s3).f7651s = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        S s3 = this.y;
        if (((v) s3).f7650fb != iMax) {
            ((v) s3).f7650fb = iMax;
            ((v) s3).v();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.y
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((v) this.y).v();
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, fh);
        co();
    }
}
