package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1150ao extends KT {
    public static byte[] A03;
    public InterfaceC02280p A00;
    public String A01;
    public final /* synthetic */ FR A02;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{105, -116, -119, -104, -100, -115, -102, 72, -100, -111, -107, -115, -105, -99, -100, 86};
    }

    public C1150ao(FR fr, InterfaceC02280p interfaceC02280p, String str) {
        this.A02 = fr;
        this.A00 = interfaceC02280p;
        this.A01 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A02.A0S(this.A01);
        this.A02.A0N(this.A00);
        this.A02.ABR(new C0670Jb(AdErrorType.NETWORK_ERROR, A00(0, 16, 38)));
    }
}
