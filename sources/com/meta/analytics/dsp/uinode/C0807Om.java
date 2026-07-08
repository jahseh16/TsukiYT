package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0807Om extends RelativeLayout {
    public final View A00;
    public final O4 A01;

    public C0807Om(C1064Yn c1064Yn, View view) {
        super(c1064Yn);
        this.A00 = view;
        O4 o4 = new O4(c1064Yn);
        this.A01 = o4;
        AbstractC0731Lo.A0K(o4);
    }

    public final void A00(int i) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void A01(O9 o9, boolean z) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (o9 != null) {
            if (z) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                o9.setAlignment(3);
                layoutParams2.setMargins(OL.A07 / 2, OL.A07 / 2, OL.A07 / 2, OL.A07 / 2);
                linearLayout.addView(o9, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                AbstractC0731Lo.A0S(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams insideLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                insideLayoutParams.addRule(3, this.A01.getId());
                insideLayoutParams.setMargins(0, OL.A07, 0, 0);
                o9.setAlignment(17);
                addView(o9, insideLayoutParams);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
