package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.No, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0783No extends LinearLayout {
    public static byte[] A06;
    public static String[] A07 = {"cmzsI0MqV", "rmZj6bXGr2Mc3k6GGfUNTI8ab", "Oqa2BQOYUIgPEQnUKqUaSgjmS1hAy2aw", "VbR8t651F3u5xAC0yd", "KwIIB1PdAD0xOvkamO3Meu", "6KEr", "QBka00Gf2XeExLF7IYa6e3", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING};
    public static final LinearLayout.LayoutParams A08;
    public final int A00;
    public final View.OnClickListener A01;
    public final RelativeLayout A02;
    public final C1064Yn A03;
    public final ViewOnClickListenerC0936Tl A04;
    public final O3 A05;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {9, 12, 12, 13, 28, 9, 17, 20, 27};
        if (A07[1].length() != 25) {
            throw new RuntimeException();
        }
        A07[2] = "W8PIFEgMaUlhByfzvyeLgAFdtcDk8ZOz";
        A06 = bArr;
    }

    public abstract void A0A(int i);

    public abstract View getExpandableLayout();

    public abstract void setTitleMaxLines(int i);

    static {
        A01();
        A08 = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC0783No(C1064Yn c1064Yn, int i, C1P c1p, boolean z, String str, J2 j22, MC mc, RE re, C0723Lg c0723Lg, C1U c1u) {
        super(c1064Yn);
        AbstractC0731Lo.A0K(this);
        this.A03 = c1064Yn;
        this.A00 = i;
        O3 o32 = new O3(c1064Yn);
        this.A05 = o32;
        AbstractC0731Lo.A0M(o32, 0);
        AbstractC0731Lo.A0K(o32);
        ViewOnClickListenerC0936Tl viewOnClickListenerC0936Tl = new ViewOnClickListenerC0936Tl(c1064Yn, str, c1p, z, j22, mc, re, c0723Lg, c1u);
        this.A04 = viewOnClickListenerC0936Tl;
        AbstractC0731Lo.A0G(1001, viewOnClickListenerC0936Tl);
        this.A01 = OI.A03(viewOnClickListenerC0936Tl, A00(0, 9, 119));
        RelativeLayout relativeLayout = new RelativeLayout(c1064Yn);
        this.A02 = relativeLayout;
        relativeLayout.setLayoutParams(A08);
        AbstractC0731Lo.A0K(relativeLayout);
    }

    public void A09() {
        this.A05.setOnClickListener(this.A01);
    }

    public final ViewOnClickListenerC0936Tl getCTAButton() {
        return this.A04;
    }

    public final ImageView getIconView() {
        return this.A05;
    }

    public void setInfo(C1N c1n, C1Q c1q, String str, String str2, InterfaceC0785Nq interfaceC0785Nq) {
        this.A04.setCta(c1q, str, new HashMap(), interfaceC0785Nq);
        AsyncTaskC0941Tq asyncTaskC0941Tq = new AsyncTaskC0941Tq(this.A05, this.A03);
        int i = this.A00;
        asyncTaskC0941Tq.A05(i, i).A07(str2);
    }
}
