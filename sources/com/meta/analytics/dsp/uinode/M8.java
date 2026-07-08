package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class M8 implements View.OnClickListener {
    public final /* synthetic */ C02391a A00;
    public final /* synthetic */ JA A01;
    public final /* synthetic */ M9 A02;
    public final /* synthetic */ MC A03;
    public final /* synthetic */ String A04;

    public M8(M9 m9, JA ja, MC mc, String str, C02391a c02391a) {
        this.A02 = m9;
        this.A01 = ja;
        this.A03 = mc;
        this.A04 = str;
        this.A00 = c02391a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A04(J9.A0A, null);
            if (this.A02.A02.A0O(this.A02.A03.A01(), true)) {
                this.A03.A9M(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                C0712Kv.A0M(new C0712Kv(), this.A02.A03, AbstractC0715Ky.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
