package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0631Hl implements InterfaceC0888Rp {
    public static boolean A03;
    public static byte[] A04;
    public static final InterfaceC0886Rn A05;
    public static final String A06;
    public long A00 = 0;
    public final InterfaceC0887Ro A01;
    public final InterfaceC0893Ru A02;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{127, -88, -85, -100, -94, -89, -96, 89, -89, -98, -79, -83, 89, -84, -78, -89, -100, 89, -102, -83, 89, -77, -57, -40, -47, -122, -57, -39, -122, -44, -43, -122, -39, -33, -44, -55, -50, -40, -43, -44, -49, -32, -57, -38, -49, -43, -44, -122, -39, -55, -50, -53, -54, -37, -46, -53, -54, -108, -122, -78, -57, -39, -38, -122, -39, -33, -44, -55, -122, -57, -38, -122, -117, -54, -108, -122, -76, -53, -34, -38, -122, -39, -33, -44, -55, -122, -57, -38, -122, -117, -54, -108, -51, -26, -33, -33, -22, -102, -32, -23, -20, -102, -97, -34, -102, -25, -29, -26, -26, -29, -19, -88, -14, -15, -43, -8, -15, -55, -20, -15, -20, -10, -21, -24, -25};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0888Rp
    public final synchronized void A5k(int i) {
        long jA4z = this.A02.A4z() + (((long) i) * 1000000 * ((long) (A03 ? 1 : 1000)));
        long j = this.A00;
        if (j == 0 || j > jA4z) {
            this.A00 = jA4z;
            notifyAll();
        }
    }

    static {
        A02();
        A06 = C0631Hl.class.getSimpleName();
        A05 = new C0634Ho();
        A03 = false;
    }

    public C0631Hl(InterfaceC0887Ro interfaceC0887Ro, InterfaceC0893Ru interfaceC0893Ru) {
        this.A01 = interfaceC0887Ro;
        this.A02 = interfaceC0893Ru;
        Thread scheduler = new Thread(new RunnableC0889Rq(this));
        scheduler.start();
    }

    private void A01() {
        while (true) {
            synchronized (this) {
                if (this.A00 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    long jA4z = this.A02.A4z();
                    long j = this.A00;
                    if (jA4z < j) {
                        int millisToSleep = (int) ((j - jA4z) / 1000000);
                        if (millisToSleep >= 1) {
                            String.format(Locale.US, A00(92, 20, 69), Integer.valueOf(millisToSleep));
                            try {
                                long current = millisToSleep;
                                this.A02.AGQ(this, current);
                            } catch (InterruptedException unused2) {
                            }
                        }
                    }
                    this.A00 = 0L;
                    this.A01.AFP();
                    long jA4z2 = this.A02.A4z();
                    if (0 != 0) {
                        throw new NullPointerException(A00(112, 13, 78));
                    }
                    synchronized (this) {
                        if (this.A00 < jA4z2) {
                            String.format(Locale.US, A00(21, 71, 49), Long.valueOf(jA4z2), Long.valueOf(this.A00));
                            this.A00 = 0L;
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ void A03(C0631Hl c0631Hl) {
        c0631Hl.A01();
        throw null;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0888Rp
    public final synchronized void A5l() {
        this.A00 = this.A02.A4z();
        String str = A00(0, 21, 4) + this.A00;
        notifyAll();
    }
}
