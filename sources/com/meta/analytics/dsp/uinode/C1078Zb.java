package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1078Zb extends AnonymousClass37 {
    public static String[] A02 = {"kCJseLSqSIrXu4CFjUZgH7qP37OfZeHD", "xEAmwUG5TGVzyoKH1PTTnmgJSds6zi0t", "yfye5wiKddzXjwKpYSAHRZ10SdbOyGIS", "FmBYeFx3U0BhjOzbepjZtX", "pFd99JFbVQiCxR8NKRmLZvqZPwpJ8hMq", "9sA", "zOMSQIOQC2uzgyYA4i3GoXbtL5yC1N4Y", "6JUJmYz6"};
    public final AnonymousClass37 A00 = new C1079Zc(this);
    public final C0547Eb A01;

    public C1078Zb(C0547Eb c0547Eb) {
        this.A01 = c0547Eb;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass37
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C0547Eb.class.getName());
        if ((view instanceof C0547Eb) && !A0B()) {
            C0547Eb c0547Eb = (C0547Eb) view;
            if (c0547Eb.getLayoutManager() != null) {
                c0547Eb.getLayoutManager().A1t(accessibilityEvent);
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass37
    public final void A08(View view, C03093s c03093s) {
        super.A08(view, c03093s);
        c03093s.A0O(C0547Eb.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(c03093s);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass37
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[0].charAt(11)) {
                throw new RuntimeException();
            }
            A02[4] = "nByhcE3HAON4xHhAaRL71J2smf2uyoDS";
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            AbstractC03304o layoutManager = this.A01.getLayoutManager();
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "ZdbAAVtg";
            strArr2[3] = "rBKlzqXoYmUf6BYv0O8fT1";
            return layoutManager.A1V(i, bundle);
        }
        return false;
    }

    public final AnonymousClass37 A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1p();
    }
}
