package com.meta.analytics.dsp.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6T {
    public static byte[] A03;
    public static String[] A04 = {"fwnF9NqGlDDvd3tmLjHzlBLQ0vKEWHbi", "JyVh64c57ZQhNNoyVwIaBwBMCWCp47TX", "NiVjB9zhlvCIBmozr5iuMf4XPmRpTykj", "aMEAUKQnrJbxe7", "r8tEg4U8ig5A4Tipsx9WF382DZkzVk0N", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "NXFd2c7X4J9ga52f6GNSRbndM6EeYerJ", "Iv2mUp4tdjLGTNz"};
    public static final AtomicBoolean A05;
    public C1063Ym A00;
    public String A01;
    public final LP A02 = new LP(300000000000L, new C1071Yu(this));

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{114, 125, 114, 127, 124, 116, 42, 33, 48, 51, 43, 54, 47, 59, 48, 61, 52, 33, 75, 93, 75, 75, 81, 87, 86, 71, 76, 81, 85, 93};
    }

    static {
        A04();
        A05 = new AtomicBoolean(false);
    }

    public static InterfaceC04168i A00(C1063Ym c1063Ym) {
        if (C0653Ih.A10(c1063Ym)) {
            return C04178j.A01(A01(0, 6, 104), A01(18, 12, 67), A01(6, 12, 63));
        }
        YK ykA00 = C04178j.A00();
        String[] strArr = A04;
        if (strArr[2].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        A04[0] = "UkANKLN4N59lG96lj5R5seL3Uvk1PYyc";
        return ykA00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C1063Ym c1063Ym;
        synchronized (this) {
            c1063Ym = this.A00;
        }
        if (c1063Ym == null) {
            return;
        }
        String strA04 = C04198l.A00().A01(c1063Ym, true).A04(A00(c1063Ym));
        synchronized (this) {
            this.A01 = strA04;
        }
    }

    public static void A03() {
        A05.set(true);
    }

    public final synchronized String A06(C1063Ym c1063Ym) {
        this.A00 = c1063Ym;
        c1063Ym.A07().AAL();
        if (this.A00.A06().AGJ() || ((A05.get() && C0653Ih.A1Y(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A05.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
