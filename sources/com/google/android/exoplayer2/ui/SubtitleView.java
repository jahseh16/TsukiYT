package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import b0.n3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q0.xc;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public y f1991co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1992f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f1993fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1994p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f1995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1996t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q0.n3 f1997v;
    public boolean w;
    public List<b0.n3> y;
    public View z;

    public interface y {
        void y(List<b0.n3> list, q0.n3 n3Var, float f3, int i, float f4);
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = Collections.emptyList();
        this.f1997v = q0.n3.f7438fb;
        this.f1993fb = 0;
        this.f1995s = 0.0533f;
        this.f1992f = 0.08f;
        this.f1996t = true;
        this.w = true;
        com.google.android.exoplayer2.ui.y yVar = new com.google.android.exoplayer2.ui.y(context);
        this.f1991co = yVar;
        this.z = yVar;
        addView(yVar);
        this.f1994p = 1;
    }

    private List<b0.n3> getCuesWithStylingPreferencesApplied() {
        if (this.f1996t && this.w) {
            return this.y;
        }
        ArrayList arrayList = new ArrayList(this.y.size());
        for (int i = 0; i < this.y.size(); i++) {
            arrayList.add(y(this.y.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (ut.y < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private q0.n3 getUserCaptionStyle() {
        if (ut.y < 19 || isInEditMode()) {
            return q0.n3.f7438fb;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? q0.n3.f7438fb : q0.n3.y(captioningManager.getUserStyle());
    }

    private <T extends View & y> void setView(T t3) {
        removeView(this.z);
        View view = this.z;
        if (view instanceof a) {
            ((a) view).fb();
        }
        this.z = t3;
        this.f1991co = t3;
        addView(t3);
    }

    public void a() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void fb() {
        this.f1991co.y(getCuesWithStylingPreferencesApplied(), this.f1997v, this.f1995s, this.f1993fb, this.f1992f);
    }

    public final void gv(int i, float f3) {
        this.f1993fb = i;
        this.f1995s = f3;
        fb();
    }

    public void n3(int i, float f3) {
        Context context = getContext();
        gv(2, TypedValue.applyDimension(i, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.w = z;
        fb();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f1996t = z;
        fb();
    }

    public void setBottomPaddingFraction(float f3) {
        this.f1992f = f3;
        fb();
    }

    public void setCues(@Nullable List<b0.n3> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.y = list;
        fb();
    }

    public void setFractionalTextSize(float f3) {
        zn(f3, false);
    }

    public void setStyle(q0.n3 n3Var) {
        this.f1997v = n3Var;
        fb();
    }

    public void setViewType(int i) {
        if (this.f1994p == i) {
            return;
        }
        if (i == 1) {
            setView(new com.google.android.exoplayer2.ui.y(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new a(getContext()));
        }
        this.f1994p = i;
    }

    public void v() {
        setStyle(getUserCaptionStyle());
    }

    public final b0.n3 y(b0.n3 n3Var) {
        n3.C0034n3 c0034n3N3 = n3Var.n3();
        if (!this.f1996t) {
            xc.v(c0034n3N3);
        } else if (!this.w) {
            xc.a(c0034n3N3);
        }
        return c0034n3N3.y();
    }

    public void zn(float f3, boolean z) {
        gv(z ? 1 : 0, f3);
    }
}
