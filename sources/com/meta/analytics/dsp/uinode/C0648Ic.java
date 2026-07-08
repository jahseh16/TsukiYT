package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0648Ic {
    public final Handler A00;
    public final InterfaceC0649Id A01;

    public C0648Ic(Handler handler, InterfaceC0649Id interfaceC0649Id) {
        this.A00 = interfaceC0649Id != null ? (Handler) AbstractC0620Ha.A01(handler) : null;
        this.A01 = interfaceC0649Id;
    }

    public final void A01(int i, int i5, int i8, float f3) {
        if (this.A01 != null) {
            this.A00.post(new IZ(this, i, i5, i8, f3));
        }
    }

    public final void A02(int i, long j) {
        if (this.A01 != null) {
            this.A00.post(new IY(this, i, j));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0646Ia(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new IX(this, format));
        }
    }

    public final void A05(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0647Ib(this, bc));
        }
    }

    public final void A06(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new IV(this, bc));
        }
    }

    public final void A07(String str, long j, long j4) {
        if (this.A01 != null) {
            this.A00.post(new IW(this, str, j, j4));
        }
    }
}
