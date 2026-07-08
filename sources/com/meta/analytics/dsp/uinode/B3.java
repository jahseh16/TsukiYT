package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class B3 extends FrameLayout implements MD, TD {
    public static byte[] A0I;
    public static String[] A0J = {"Ky6zrcoV7NYtZpO3AnBVhERgUe61TP4A", "7", "MIS71VG0t7feKobdqgnq1TwubiJ1N09z", "nEwmQOfqxRkjYDAAu8TY0n89Pulsb82", "nm6mhrtocmSPL4qM7u9wOkkvqXPHcra", "ADTrDSFqqVysA22fSklmKPGMwsWvvDiN", "oNlgPu", "28CTXOUAXLtNi6XFaROwO0buCKC9QIVi"};
    public C5T A00;
    public C5V A01;
    public PL A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC1167b5 A06;
    public final C1064Yn A07;
    public final J2 A08;
    public final JA A09;
    public final ViewOnSystemUiVisibilityChangeListenerC0718Lb A0A;
    public final C0723Lg A0B;
    public final MC A0C;
    public final InterfaceC0752Mj A0D;
    public final P3 A0E;
    public final PB A0F;
    public final RD A0G;
    public final RE A0H;

    public static String A0B(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{-88, -43, -43, -46, -43, -125, -58, -43, -56, -60, -41, -52, -47, -54, -125, -58, -46, -47, -55, -52, -54, -125, -83, -74, -78, -79, 6, 11, 4, 12, 17, 8, 7, 2, 4, 7, -95, -90, -97, -89, -84, -93, -94, -99, -97, -94, -99, -89, -84, -94, -93, -74, -107, -102, -109, -101, -96, -105, -106, -111, -109, -106, -111, -90, -95, -90, -109, -98, -115, -110, -117, -109, -104, -113, -114, -119, -98, -109, -105, -113, -119, -99, -102, -113, -104, -98, -90, -81, -84, -90, -82, -94, -74, -78, -72, -75, -90, -88, 25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    static {
        A0D();
    }

    public B3(C1064Yn c1064Yn, J2 j22, MC mc, AbstractC1167b5 abstractC1167b5, InterfaceC0752Mj interfaceC0752Mj, int i) {
        int i5;
        super(c1064Yn);
        this.A00 = new TQ(this);
        TP tp = new TP(this);
        this.A0G = tp;
        this.A03 = true;
        this.A07 = c1064Yn;
        this.A08 = j22;
        this.A0C = mc;
        this.A06 = abstractC1167b5;
        this.A0D = interfaceC0752Mj;
        PB pbA02 = PC.A02(abstractC1167b5.A0S());
        if (pbA02 == null) {
            this.A0F = new PB(c1064Yn, abstractC1167b5, j22, i);
            this.A04 = false;
        } else {
            this.A0F = pbA02;
            this.A04 = true;
        }
        JA jaA0K = this.A0F.A0K();
        this.A09 = jaA0K;
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new TO(this));
        AbstractC0731Lo.A0G(1003, this.A0F.A0O());
        if (abstractC1167b5.A0g()) {
            i5 = 0;
            P3 p3 = new P3(c1064Yn, j22, abstractC1167b5, new C03696c(c1064Yn), jaA0K, mc, interfaceC0752Mj, new TN(this));
            this.A0E = p3;
            p3.A0N();
            this.A0F.A0O().setOnTouchListener(new ViewOnTouchListenerC0820Oz(this));
            addView(p3, new FrameLayout.LayoutParams(-1, -1));
        } else {
            i5 = 0;
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        RE re = new RE(mediaView, 1, new WeakReference(tp), c1064Yn);
        this.A0H = re;
        re.A0W(abstractC1167b5.A0C());
        re.A0X(abstractC1167b5.A0D());
        this.A0F.A0e(re);
        ViewOnSystemUiVisibilityChangeListenerC0718Lb viewOnSystemUiVisibilityChangeListenerC0718Lb = new ViewOnSystemUiVisibilityChangeListenerC0718Lb(this);
        this.A0A = viewOnSystemUiVisibilityChangeListenerC0718Lb;
        viewOnSystemUiVisibilityChangeListenerC0718Lb.A05(EnumC0717La.A03);
        setBackgroundColor(i5);
        if (C0653Ih.A1W(c1064Yn)) {
            c1064Yn.A0A().AGx(mediaView, abstractC1167b5.A12(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean zA18 = abstractC1167b5.A18();
            String strA0B = A0B(68, 18, 1);
            String strA0B2 = A0B(36, 16, 21);
            String strA0B3 = A0B(52, 16, 9);
            String strA0B4 = A0B(26, 10, 122);
            if (zA18) {
                jSONObject.put(strA0B4, true);
                jSONObject.put(strA0B3, 2);
                jSONObject.put(strA0B2, i5);
                jSONObject.put(strA0B, abstractC1167b5.A0I());
            } else if (C0716Kz.A05(abstractC1167b5.A0O())) {
                jSONObject.put(strA0B4, true);
                jSONObject.put(strA0B3, 2);
                jSONObject.put(strA0B2, 1);
                jSONObject.put(strA0B, abstractC1167b5.A0I());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(C8A.A15, A0B(0, 26, 58));
        }
    }

    private void A0C() {
        C0827Pg c0827PgA0B = new C0825Pe(this.A07, this.A06.A0x().A0E(), this.A06.A10()).A08(this.A06.A0w().A01()).A0B();
        addView(c0827PgA0B, new FrameLayout.LayoutParams(-1, -1));
        c0827PgA0B.A04(new TL(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0E().A5H();
            this.A0F.A0X();
        } else {
            this.A07.A0E().A5I();
            if (this.A0F.A0k()) {
                AGY();
                C1064Yn c1064Yn = this.A07;
                if (A0J[6].length() != 6) {
                    throw new RuntimeException();
                }
                A0J[7] = "2uXfZ95rl8UwGJAIvPTgfy7qu4p9pGiW";
                if (C0653Ih.A1W(c1064Yn)) {
                    this.A07.A0A().ABG();
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.A0F.A0O().getParent();
        if (viewGroup != null) {
            ViewGroup parent = this.A0F.A0O();
            viewGroup.removeView(parent);
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3U(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19 && this.A06.A0h()) {
            this.A0A.A05(EnumC0717La.A04);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0786Nr c0786Nr = new C0786Nr(this.A07, this.A0D.A6R(), this.A0H, this.A0B, this.A08, this.A06.A0y(), this.A0C);
        HashMap map = new HashMap();
        map.put(A0B(86, 12, 26), A0B(98, 9, 123));
        c0786Nr.A07(this.A06.A12(), str, map);
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void A8S() {
        A0F(this.A06.A0x().A0F().A05());
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void A8T(String str) {
        A0F(str);
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void A8X() {
        this.A0C.A43(this.A0D.A5s());
        Q7 serverSideRewardHandler = new Q7(this.A07, this.A0D, this.A06.A0T(), this.A0C);
        serverSideRewardHandler.A05();
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void A9K() {
        new Handler(Looper.getMainLooper()).post(new TM(this));
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        PB.A0B().incrementAndGet();
        c5v.A0N(this.A00);
        this.A01 = c5v;
        A0E();
        if (this.A06.A0x().A0P()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void ABb() {
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void ABf() {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0P();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void ACL(boolean z) {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0R(z);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void ACW(boolean z) {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0S(z);
        }
        if (z) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void ACu(boolean z) {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0T(z);
        }
        boolean z5 = this.A03;
        if (A0J[1].length() == 11) {
            throw new RuntimeException();
        }
        A0J[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
        if (z5) {
            this.A03 = false;
        } else if (z) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void AD8() {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0Q();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void ADc(boolean z) {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0U(z);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void ADe(boolean z) {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0V(z);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void ADr(String str) {
        String urlString = this.A06.A13(str);
        if (urlString == null) {
            return;
        }
        C0712Kv.A0M(new C0712Kv(), this.A07, AbstractC0715Ky.A00(urlString), this.A06.A12());
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void AGY() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void close() {
        C5V c5v = this.A01;
        if (c5v == null) {
            return;
        }
        c5v.finish(4);
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public String getCurrentClientToken() {
        return this.A06.A12();
    }

    private ViewGroup getMediaView() {
        P3 p3 = this.A0E;
        return p3 != null ? p3 : this.A0F.A0O();
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final boolean onActivityResult(int i, int i5, Intent intent) {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void onDestroy() {
        if (C0653Ih.A1W(this.A07)) {
            this.A07.A0A().AGk(getMediaView());
        }
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0O();
        }
        this.A0A.A03();
        this.A08.A9X(this.A06.A12(), new C0777Ni().A02(this.A0B).A03(this.A0H).A05());
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        PC.A04(this.A06.A0S());
        PB.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(MC mc) {
    }

    public void setRtfActionsJavascriptListener(PL pl) {
        this.A02 = pl;
    }
}
