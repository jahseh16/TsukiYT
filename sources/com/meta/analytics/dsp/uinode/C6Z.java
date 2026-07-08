package com.meta.analytics.dsp.uinode;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C6Z implements Callable<Boolean> {
    public static byte[] A02;
    public static String[] A03 = {"4L70rbdc", "PBHhMXx0npnpwTY", "91GJPzFmEyeOW3DYeKz29HPCrWXW0gNC", "umTRidE45okZulrVlJrHIV8", "kRbho3HgdeG0CdJ8rA209tRImftPXEnI", "60YY30c8MY", "ZuHjaYDngPTOcLYvMZdLe8TI8ruUn8GD", "lL0vcWHD5F"};
    public final C6Y A00;
    public final /* synthetic */ C03696c A01;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{114, 126, 109, 116, 106, 111, 43, 52, 57, 56, 50};
        if (A03[1].length() != 15) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "XFV0lH04tD";
        strArr[5] = "8rdCtS3Igw";
    }

    static {
        A02();
    }

    public C6Z(C03696c c03696c, C6Y c6y) {
        this.A01 = c03696c;
        this.A00 = c6y;
    }

    private final Boolean A00() throws Throwable {
        String strA01;
        if (KL.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                strA01 = A01(0, 6, 63);
            } else {
                strA01 = A01(6, 5, 125);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            AnonymousClass06 anonymousClass06 = new AnonymousClass06(str, creativeType, this.A00.A06, strA01, this.A00.A02, this.A00.A05);
            anonymousClass06.A04 = this.A00.A03;
            anonymousClass06.A02 = this.A00.A01;
            anonymousClass06.A05 = this.A00.A04;
            if (C03726f.A06(this.A01.A04)) {
                C03696c.A0F.put(this.A00.A08, anonymousClass06);
            }
            return Boolean.valueOf(C03696c.A03(this.A01.A04.A01()).AFJ(anonymousClass06) != null);
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (KL.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }
}
