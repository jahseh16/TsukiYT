package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04148g {
    public static String A00;
    public static LA A01;
    public static byte[] A02;
    public static String[] A03 = {"pgH9SdtSFWTXX0l", "vxegEtvJMZ23RgjyHpc", "ulS7n8X7nNx1Irtm69lPCCFagtwQ2KXJ", "SMp4Mt4DU3EtKobKtaKcK4J1Rc2yK13N", "2t39yg7rltV6biRCRlaAvBIZnsjhSKww", "tY1PV27PV17ox8mww3so5aazg5RDJQQX", "2fotvTqtzlir49zwNSe", "KHZMFPmOyKnxl7a"};
    public static final Map<String, Integer> A04;
    public static final AtomicInteger A05;

    public static String A02(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{-87, -56, -51, -41};
    }

    static {
        A05();
        A00 = null;
        A05 = new AtomicInteger(0);
        A04 = new HashMap();
    }

    public static synchronized LA A00(C03927f c03927f) {
        if (A01 == null) {
            A01 = LB.A00(c03927f);
        }
        return A01;
    }

    public static Integer A01(String str) {
        Map<String, Integer> map = A04;
        synchronized (map) {
            Integer num = map.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(C03927f c03927f, String str, Map<String, String> params) {
        String strA03;
        if (A0A(c03927f)) {
            strA03 = C0696Kc.A03(str);
        } else {
            strA03 = A00;
        }
        if (strA03 != null) {
            String fingerprint = A02(1, 3, 55);
            params.put(fingerprint, strA03);
        }
    }

    public static void A07(final C03927f c03927f, boolean z) throws Exception {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(c03927f);
        try {
            final SharedPreferences sharedPreferencesA00 = KE.A00(c03927f);
            final C8K c8k = new C8K(c03927f);
            final String str = Build.FINGERPRINT + A02(0, 1, 30) + c8k.A06();
            A00 = sharedPreferencesA00.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.8f
                public static byte[] A04;
                public static String[] A05 = {"CoyLTTqL9oN", "BQ7yf8H5Dy6", "lyn", "mKjKy3YozjHGjndyHmGPrtRgt1Zkpmof", "kCMvlxHItYqHUu0uJG5AXtsVRpKoPm5F", "PZWzUgGQe3CdPYsrWXqgA6txhpTzavVR", "1z7bJiu6sIQ4w4e4OAYhOvPnvUYdbbgv", "yc5QaeADf08N4Bq6BgqF"};

                public static String A01(int i, int i5, int i8) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
                    for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
                        bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 127);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A02() {
                    A04 = new byte[]{24, 61, 51, 46, 61, 45, 17, 29, 31, 92, 19, 28, 22, 0, 29, 27, 22, 92, 4, 23, 28, 22, 27, 28, 21, 100, 116, 102, 119, 110, 112, 96, 127, 116, 112, 114, 112, 123, 112, 103, 124, 118};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Boolean call() throws java.lang.Exception {
                    /*
                        Method dump skipped, instruction units count: 234
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.CallableC04138f.call():java.lang.Boolean");
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            AtomicInteger atomicInteger = A05;
            String[] strArr = A03;
            if (strArr[1].length() != strArr[6].length()) {
                Exception e4 = new RuntimeException();
                throw e4;
            }
            String[] strArr2 = A03;
            strArr2[7] = "qnCKfAZ4ZrzI6TW";
            strArr2[0] = "3RwSqq6UclGHbC0";
            atomicInteger.set(0);
        }
    }

    public static void A08(C03927f c03927f, boolean z, String str) {
        if (A0A(c03927f)) {
            A09(c03927f, z, str);
        } else {
            A07(c03927f, z);
        }
    }

    public static void A09(C03927f c03927f, boolean z, final String str) {
        if (str == null) {
            str = c03927f.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(c03927f);
        final C0696Kc c0696Kc = new C0696Kc(c03927f, str);
        try {
            c0696Kc.A06();
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.8e
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final Boolean call() throws Exception {
                    c0696Kc.A05();
                    synchronized (C04148g.A04) {
                        C04148g.A04.put(str, 2);
                    }
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            Map<String, Integer> map = A04;
            synchronized (map) {
                map.put(str, 0);
            }
        }
    }

    public static boolean A0A(C03927f c03927f) {
        return ProcessUtils.isRemoteRenderingProcess() || C0653Ih.A2L(c03927f);
    }

    public static boolean A0B(String str) {
        Map<String, Integer> map = A04;
        synchronized (map) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            map.put(str, 1);
            return false;
        }
    }
}
