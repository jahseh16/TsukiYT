package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0466Ai {
    public final Handler A00;
    public final InterfaceC0467Aj A01;

    public C0466Ai(Handler handler, InterfaceC0467Aj interfaceC0467Aj) {
        this.A00 = interfaceC0467Aj != null ? (Handler) AbstractC0620Ha.A01(handler) : null;
        this.A01 = interfaceC0467Aj;
    }

    public final void A01(int i) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0465Ah(this, i));
        }
    }

    public final void A02(int i, long j, long j4) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0463Af(this, i, j, j4));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0462Ae(this, format));
        }
    }

    public final void A04(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0464Ag(this, bc));
        }
    }

    public final void A05(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0460Ac(this, bc));
        }
    }

    public final void A06(String str, long j, long j4) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0461Ad(this, str, j, j4));
        }
    }
}
