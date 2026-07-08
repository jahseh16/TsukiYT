package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C03927f extends ContextWrapper {
    public final InterfaceC03937h A00;
    public final AtomicReference<String> A01;

    public C03927f(Context context, InterfaceC03937h interfaceC03937h) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = interfaceC03937h;
    }

    public final InterfaceC03736g A00() {
        return this.A00.A6L();
    }

    public final C1063Ym A01() {
        return this.A00.A7r(this);
    }

    public final C7g A02() {
        return this.A00.A6A(this);
    }

    public final InterfaceC03947i A03() {
        return this.A00.A6v(this);
    }

    public final C7k A04() {
        return this.A00.A7q(this);
    }

    public final InterfaceC03967l A05() {
        return this.A00.A86();
    }

    public final InterfaceC04047w A06() {
        return this.A00.A6j(this);
    }

    public final AnonymousClass89 A07() {
        return this.A00.A6l(this);
    }

    public final C04108c A08() {
        return this.A00.A7y();
    }

    public final J2 A09() {
        return this.A00.A5u(A01());
    }

    public final JE A0A() {
        return this.A00.A7s(A01());
    }

    public final String A0B() {
        return this.A01.get();
    }

    public final void A0C(String str) {
        this.A01.set(str);
    }
}
