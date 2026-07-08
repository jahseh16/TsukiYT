package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q0.fb;
import q0.xc;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class a extends FrameLayout implements SubtitleView.y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2006f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public List<b0.n3> f2007fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q0.n3 f2008s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2009t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final WebView f2010v;
    public float w;
    public final com.google.android.exoplayer2.ui.y y;

    public static /* synthetic */ class n3 {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            y = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                y[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                y[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class y extends WebView {
        public y(a aVar, Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    public a(Context context) {
        this(context, null);
    }

    public static String a(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    public static String gv(q0.n3 n3Var) {
        int i = n3Var.f7440gv;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unset" : ut.rz("-0.05em -0.05em 0.15em %s", fb.n3(n3Var.f7441v)) : ut.rz("0.06em 0.08em 0.15em %s", fb.n3(n3Var.f7441v)) : ut.rz("0.1em 0.12em 0.15em %s", fb.n3(n3Var.f7441v)) : ut.rz("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", fb.n3(n3Var.f7441v));
    }

    public static int n3(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    public static String s(b0.n3 n3Var) {
        float f3 = n3Var.f1201d;
        if (f3 == 0.0f) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        int i = n3Var.fh;
        return ut.rz("%s(%.2fdeg)", (i == 2 || i == 1) ? "skewY" : "skewX", Float.valueOf(f3));
    }

    public static String zn(@Nullable Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = n3.y[alignment.ordinal()];
        return i != 1 ? i != 2 ? "center" : "end" : "start";
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c5() {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.a.c5():void");
    }

    public void fb() {
        this.f2010v.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        super.onLayout(z, i, i5, i8, i10);
        if (!z || this.f2007fb.isEmpty()) {
            return;
        }
        c5();
    }

    public final String v(int i, float f3) {
        float fS = xc.s(i, f3, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fS == -3.4028235E38f ? "unset" : ut.rz("%.2fpx", Float.valueOf(fS / getContext().getResources().getDisplayMetrics().density));
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.y
    public void y(List<b0.n3> list, q0.n3 n3Var, float f3, int i, float f4) {
        this.f2008s = n3Var;
        this.f2006f = f3;
        this.f2009t = i;
        this.w = f4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            b0.n3 n3Var2 = list.get(i5);
            if (n3Var2.f1206s != null) {
                arrayList.add(n3Var2);
            } else {
                arrayList2.add(n3Var2);
            }
        }
        if (!this.f2007fb.isEmpty() || !arrayList2.isEmpty()) {
            this.f2007fb = arrayList2;
            c5();
        }
        this.y.y(arrayList, n3Var, f3, i, f4);
        invalidate();
    }

    public a(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2007fb = Collections.emptyList();
        this.f2008s = q0.n3.f7438fb;
        this.f2006f = 0.0533f;
        this.f2009t = 0;
        this.w = 0.08f;
        com.google.android.exoplayer2.ui.y yVar = new com.google.android.exoplayer2.ui.y(context, attributeSet);
        this.y = yVar;
        y yVar2 = new y(this, context, attributeSet);
        this.f2010v = yVar2;
        yVar2.setBackgroundColor(0);
        addView(yVar);
        addView(yVar2);
    }
}
