package com.meta.analytics.dsp.uinode;

import android.app.Activity;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0706Kp {
    public static final C0706Kp A04 = new C0706Kp(new C0963Um(), new C0962Ul());
    public final InterfaceC0705Ko A02;
    public final InterfaceC0721Le A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C0706Kp(InterfaceC0721Le interfaceC0721Le, InterfaceC0705Ko interfaceC0705Ko) {
        this.A03 = interfaceC0721Le;
        this.A02 = interfaceC0705Ko;
    }

    public static C0706Kp A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A50();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A7G();
        boolean z = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C0706Kp.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A50() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
