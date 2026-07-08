package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import b0.n3;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q0.t;
import q0.xc;

/* JADX INFO: loaded from: classes.dex */
public final class y extends View implements SubtitleView.y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q0.n3 f2032f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f2033fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f2034s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f2035t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<b0.n3> f2036v;
    public final List<t> y;

    public y(Context context) {
        this(context, null);
    }

    public static b0.n3 n3(b0.n3 n3Var) {
        n3.C0034n3 c0034n3W = n3Var.n3().f(-3.4028235E38f).t(Integer.MIN_VALUE).w(null);
        if (n3Var.f1207t == 0) {
            c0034n3W.s(1.0f - n3Var.f1202f, 0);
        } else {
            c0034n3W.s((-n3Var.f1202f) - 1.0f, 1);
        }
        int i = n3Var.w;
        if (i == 0) {
            c0034n3W.c5(2);
        } else if (i == 2) {
            c0034n3W.c5(0);
        }
        return c0034n3W.y();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<b0.n3> list = this.f2036v;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float fS = xc.s(this.f2033fb, this.f2034s, height, i);
        if (fS <= 0.0f) {
            return;
        }
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            b0.n3 n3VarN3 = list.get(i5);
            if (n3VarN3.fh != Integer.MIN_VALUE) {
                n3VarN3 = n3(n3VarN3);
            }
            b0.n3 n3Var = n3VarN3;
            int i8 = paddingBottom;
            this.y.get(i5).n3(n3Var, this.f2032f, fS, xc.s(n3Var.c, n3Var.d0, height, i), this.f2035t, canvas, paddingLeft, paddingTop, width, i8);
            i5++;
            size = size;
            i = i;
            paddingBottom = i8;
            width = width;
        }
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.y
    public void y(List<b0.n3> list, q0.n3 n3Var, float f3, int i, float f4) {
        this.f2036v = list;
        this.f2032f = n3Var;
        this.f2034s = f3;
        this.f2033fb = i;
        this.f2035t = f4;
        while (this.y.size() < list.size()) {
            this.y.add(new t(getContext()));
        }
        invalidate();
    }

    public y(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = new ArrayList();
        this.f2036v = Collections.emptyList();
        this.f2033fb = 0;
        this.f2034s = 0.0533f;
        this.f2032f = q0.n3.f7438fb;
        this.f2035t = 0.08f;
    }
}
