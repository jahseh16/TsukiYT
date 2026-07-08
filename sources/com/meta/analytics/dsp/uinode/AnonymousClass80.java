package com.meta.analytics.dsp.uinode;

import android.os.Process;
import android.text.TextUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.80, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass80 implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C1063Ym A00;
    public final AnonymousClass87 A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{42, 28, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, 11, 7, 5, 70, 14, 9, 11, 13, 10, 7, 7, 3, 70, 9, 12, 27, 71, 86, 69, 87, 76, 20, 18, 5, 19, 30, 23, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public AnonymousClass80(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1063Ym c1063Ym, InterfaceC04077z interfaceC04077z) {
        this(uncaughtExceptionHandler, c1063Ym, interfaceC04077z, AnonymousClass88.A00());
    }

    public AnonymousClass80(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1063Ym c1063Ym, InterfaceC04077z interfaceC04077z, AnonymousClass87 anonymousClass87) {
        this.A02 = uncaughtExceptionHandler;
        if (c1063Ym != null) {
            this.A00 = c1063Ym;
            this.A03 = interfaceC04077z.A7z(c1063Ym);
            this.A01 = anonymousClass87;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String strA03 = LW.A03(this.A00, th);
            if (!TextUtils.isEmpty(strA03)) {
                String stackTraceString = A00(17, 16, 41);
                if (strA03.contains(stackTraceString)) {
                    Map<String, String> mapA02 = new C04067y(strA03, this.A03).A02();
                    String strA00 = A00(38, 7, 38);
                    String stackTraceString2 = A00(33, 5, 101);
                    mapA02.put(strA00, stackTraceString2);
                    Throwable thA00 = KG.A00();
                    String strA002 = A00(45, 12, 98);
                    if (thA00 == th) {
                        String stackTraceString3 = A00(1, 1, 108);
                        mapA02.put(strA002, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(0, 1, 91);
                        mapA02.put(strA002, stackTraceString4);
                    }
                    this.A01.AHF(new C8E(this.A00.A08().A01(), this.A00.A08().A02(), mapA02), this.A00);
                    if (C0653Ih.A1h(this.A00)) {
                        C0653Ih.A0a(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
