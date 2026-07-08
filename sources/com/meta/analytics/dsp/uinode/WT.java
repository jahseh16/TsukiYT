package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WT implements H8 {
    public static String[] A0C = {"G7jWD6ulf4YNSZyKFTHtDKYEexnehBFD", "eAcypqsPfTTSG9tYkNPVa4Ur1OSgM6nM", "x", "tNQG44GENbPBCr6MlCIr3t4n4NF0MmxZ", "OwErIGDXAeY1H11Nt9UmuNZTMubue4sT", "f", "eBkibdjxFKT4WmP6H51EPZ9055c0bCkp", "0Ce9TygyYiJS1KV85oyrWWiGz76nCu"};
    public long A00;
    public long A02;
    public C0619Gy A03;
    public final Uri A05;
    public final C0556Ek A07;
    public final InterfaceC0615Gu A08;
    public final C0626Hg A09;
    public volatile boolean A0A;
    public final /* synthetic */ CD A0B;
    public final C0507Bz A06 = new C0507Bz();
    public boolean A04 = true;
    public long A01 = -1;

    public WT(CD cd, Uri uri, InterfaceC0615Gu interfaceC0615Gu, C0556Ek c0556Ek, C0626Hg c0626Hg) {
        this.A0B = cd;
        this.A05 = (Uri) AbstractC0620Ha.A01(uri);
        this.A08 = (InterfaceC0615Gu) AbstractC0620Ha.A01(interfaceC0615Gu);
        this.A07 = (C0556Ek) AbstractC0620Ha.A01(c0556Ek);
        this.A09 = c0626Hg;
    }

    public final void A04(long j, long j4) {
        this.A06.A00 = j;
        this.A02 = j4;
        this.A04 = true;
    }

    @Override // com.meta.analytics.dsp.uinode.H8
    public final void A4A() {
        this.A0A = true;
    }

    @Override // com.meta.analytics.dsp.uinode.H8
    public final void A9P() throws InterruptedException, IOException {
        char cCharAt;
        char cCharAt2;
        C1038Xn c1038Xn;
        int result = 0;
        while (result == 0 && !this.A0A) {
            try {
                long jA7i = this.A06.A00;
                C0619Gy c0619Gy = new C0619Gy(this.A05, jA7i, -1L, this.A0B.A0b);
                this.A03 = c0619Gy;
                long jADl = this.A08.ADl(c0619Gy);
                this.A01 = jADl;
                if (jADl != -1) {
                    this.A01 = jADl + jA7i;
                }
                c1038Xn = new C1038Xn(this.A08, jA7i, this.A01);
                InterfaceC0502Bs extractor = this.A07.A02(c1038Xn, this.A08.A8E());
                if (this.A04) {
                    extractor.AFh(jA7i, this.A02);
                    this.A04 = false;
                }
                while (result == 0 && !this.A0A) {
                    this.A09.A00();
                    result = extractor.AEH(c1038Xn, this.A06);
                    if (c1038Xn.A7i() > this.A0B.A0P + jA7i) {
                        jA7i = c1038Xn.A7i();
                        this.A09.A01();
                        this.A0B.A0R.post(this.A0B.A0a);
                    }
                }
            } finally {
                if (cCharAt != cCharAt2) {
                }
            }
            if (result == 1) {
                result = 0;
            } else {
                C0507Bz c0507Bz = this.A06;
                if (A0C[7].length() == 32) {
                    throw new RuntimeException();
                }
                A0C[7] = "RP5F3MQdpmYGlMxTR22UmyqYUd";
                c0507Bz.A00 = c1038Xn.A7i();
                this.A00 = this.A06.A00 - this.A03.A01;
            }
            IF.A0W(this.A08);
        }
    }
}
