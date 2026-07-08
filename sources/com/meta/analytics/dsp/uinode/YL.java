package com.meta.analytics.dsp.uinode;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YL implements InterfaceC03937h {
    public static YL A07;
    public static byte[] A08;
    public static String[] A09 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    public C0W A00;
    public InterfaceC03736g A01;
    public C7g A02;
    public InterfaceC04047w A03;
    public C04108c A04;
    public JE A05;
    public InterfaceC0629Hj A06;

    public static String A06(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[6].length() != strArr[7].length()) {
                break;
            }
            String[] strArr2 = A09;
            strArr2[6] = "Hv2WK1fJh7GnXaP";
            strArr2[7] = "jwUFRNkRPBL5IaL";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i11 = bArrCopyOfRange[i10] - i8;
            String[] strArr3 = A09;
            if (strArr3[4].charAt(26) != strArr3[0].charAt(26)) {
                break;
            }
            String[] strArr4 = A09;
            strArr4[2] = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG";
            strArr4[3] = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw";
            bArrCopyOfRange[i10] = (byte) (i11 - 98);
            i10++;
        }
        throw new RuntimeException();
    }

    public static void A07() {
        A08 = new byte[]{-62, -11, -55, -10, -13, -62, -63, -62, -16, 2, 16, 16, 6, 12, 11, -67, 1, -2, 17, -2, -67, 6, 11, 6, 17, 6, -2, 9, 6, 23, 2, 1, 33, 20, 31, 30, 33, 35, 2, 20, 34, 34, 24, 30, 29, -13, 16, 35, 16, -8, 29, 24, 35, 24, 16, 27, 24, 41, 20, 19};
        if (A09[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1063Ym c1063Ym) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1063Ym);
        InterfaceC0629Hj interfaceC0629HjA05 = A05(c1063Ym, this.A03, A03(c1063Ym));
        this.A06 = interfaceC0629HjA05;
        A09(c1063Ym, A00(c1063Ym, interfaceC0629HjA05));
        A0A(c1063Ym, this.A06);
        A0B(c1063Ym, this.A06);
        InterfaceC0629Hj interfaceC0629Hj = this.A06;
        if (interfaceC0629Hj != null) {
            interfaceC0629Hj.A5m();
        }
    }

    static {
        A07();
    }

    public static AnonymousClass66 A00(C1063Ym c1063Ym, InterfaceC0629Hj interfaceC0629Hj) {
        if (!C0653Ih.A1P(c1063Ym) || interfaceC0629Hj == null) {
            return null;
        }
        return AnonymousClass67.A00().A00(interfaceC0629Hj);
    }

    public static InterfaceC04047w A01(C1063Ym c1063Ym) {
        return AbstractC04057x.A00().A00(c1063Ym, new YS());
    }

    public static synchronized YL A02() {
        if (A07 == null) {
            A07 = new YL();
        }
        return A07;
    }

    public static RK A03(C1063Ym c1063Ym) {
        if (!C0653Ih.A1L(c1063Ym)) {
            return null;
        }
        return C0875Rc.A01(c1063Ym);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC03937h
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC0629Hj A86() {
        return this.A06;
    }

    public static InterfaceC0629Hj A05(C1063Ym c1063Ym, InterfaceC04047w interfaceC04047w, RK rk) {
        if (C0653Ih.A2E(c1063Ym) && rk != null && !ProcessUtils.isRemoteRenderingProcess()) {
            return AbstractC0898Rz.A00().A00(c1063Ym, interfaceC04047w, rk, K9.A04(c1063Ym), new YM(new K1(c1063Ym, A06(0, 0, 122), null, EnumC0674Jg.A07, 0, new C0679Jl(), LW.A01(C0653Ih.A0J(c1063Ym)), null, null, new C1135aZ()), c1063Ym), C0896Rx.A00().A00());
        }
        return null;
    }

    public static void A08() {
        String strA06 = A06(8, 24, 59);
        if (A09[5].length() == 20) {
            throw new RuntimeException();
        }
        A09[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        AbstractC0683Jp.A05(A06(32, 28, 77), strA06, A06(0, 8, 46));
    }

    public static void A09(C1063Ym c1063Ym, AnonymousClass66 anonymousClass66) {
        if (!C0653Ih.A1P(c1063Ym) || anonymousClass66 == null) {
            return;
        }
        AnonymousClass64.A00().A00(anonymousClass66, c1063Ym);
    }

    public static void A0A(C1063Ym c1063Ym, InterfaceC0629Hj interfaceC0629Hj) {
        if (!C0653Ih.A0h(c1063Ym) || interfaceC0629Hj == null) {
            return;
        }
        new C6R(c1063Ym, interfaceC0629Hj, new C6S(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1063Ym c1063Ym, InterfaceC0629Hj interfaceC0629Hj) {
        if (interfaceC0629Hj == null) {
            return;
        }
        AbstractC0656Il.A00(c1063Ym, interfaceC0629Hj);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03937h
    public final J2 A5u(C1063Ym c1063Ym) {
        return VQ.A01(c1063Ym);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03937h
    public final synchronized C7g A6A(C03927f c03927f) {
        if (this.A02 == null) {
            this.A02 = new YN(this);
        }
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03937h
    public final synchronized InterfaceC03736g A6L() {
        if (this.A01 == null) {
            this.A01 = new C1065Yo();
        }
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03937h
    public final synchronized InterfaceC04047w A6j(C03927f c03927f) {
        if (this.A03 == null) {
            this.A03 = A01(c03927f.A01());
        }
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03937h
    public final synchronized AnonymousClass89 A6l(C03927f c03927f) {
        return new C1052Yb(c03927f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03937h
    public final synchronized InterfaceC03947i A6v(C03927f c03927f) {
        return new EO(this, c03927f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03937h
    public final synchronized C0W A77(C03927f c03927f) {
        if (!C0653Ih.A0v(c03927f)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0X.A00().A00(new YQ(c03927f));
        }
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03937h
    public final synchronized C7k A7q(C03927f c03927f) {
        return new YO(c03927f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03937h
    public final C1063Ym A7r(Context context) {
        C1063Ym sdkContext = AbstractC03917e.A00();
        if (sdkContext == null) {
            C1063Ym sdkContext2 = new C1063Ym(context, this);
            AbstractC03917e.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03937h
    public final synchronized JE A7s(C1063Ym c1063Ym) {
        if (this.A05 == null) {
            this.A05 = new VY(c1063Ym);
        }
        return this.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03937h
    public final synchronized C04108c A7y() {
        if (this.A04 == null) {
            this.A04 = new C04108c();
            A08();
        }
        return this.A04;
    }
}
