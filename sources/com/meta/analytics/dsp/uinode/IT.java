package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IT {
    public static byte[] A0C;
    public static String[] A0D = {"xjDjhxCoR5E9PaR", "vpLFoDls1yXd", "vp7lX6ix760xQFA", "plC", "mnLR5dwnrEQUmTikV", "t5Nzngx1C9ROF", "WJjUxBMWNKZwORVrQ", "T20oC"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final IR A0A;
    public final IS A0B;

    public static String A02(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            int i11 = (bArrCopyOfRange[i10] - i8) - 91;
            if (A0D[5].length() != 13) {
                throw new RuntimeException();
            }
            A0D[2] = "fcjVOHbVEUruwwj";
            bArrCopyOfRange[i10] = (byte) i11;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{-13, -8, 2, -1, -5, -16, 8, 29, 15, 20, 10, 21, 29};
    }

    static {
        A04();
    }

    public IT() {
        this(null);
    }

    public IT(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 75));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = IF.A02 >= 17 ? A01(context) : null;
            this.A0B = IS.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public static long A00(long j, long j4, long j7) {
        long j8;
        long vsyncCount = j7 * ((j - j4) / j7);
        long j9 = j4 + vsyncCount;
        if (j <= j9) {
            j8 = j9 - j7;
        } else {
            j8 = j9;
            if (A0D[5].length() != 13) {
                throw new RuntimeException();
            }
            A0D[7] = "KRnDU";
            j9 += j7;
        }
        return j9 - j < j - j8 ? j9 : j8;
    }

    private IR A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 52));
        if (displayManager == null) {
            return null;
        }
        return new IR(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.A06 = refreshRate;
            this.A07 = (refreshRate * 80) / 100;
        }
    }

    private boolean A06(long j, long j4) {
        long j7 = j - this.A04;
        long elapsedFrameTimeNs = this.A05;
        return Math.abs((j4 - elapsedFrameTimeNs) - j7) > 20000000;
    }

    public final long A07(long j, long j4) {
        long j7 = 1000 * j;
        long j8 = j7;
        long j9 = j4;
        if (this.A08) {
            if (j != this.A02) {
                this.A01++;
                this.A00 = this.A03;
            }
            long j10 = this.A01;
            if (j10 >= 6) {
                long j11 = this.A00 + ((j7 - this.A04) / j10);
                if (!A06(j11, j4)) {
                    j9 = (this.A05 + j11) - this.A04;
                    j8 = j11;
                } else {
                    this.A08 = false;
                }
            } else if (A06(j7, j4)) {
                this.A08 = false;
            }
        }
        if (!this.A08) {
            this.A04 = j7;
            this.A05 = j4;
            this.A01 = 0L;
            this.A08 = true;
        }
        this.A02 = j;
        this.A03 = j8;
        IS is = this.A0B;
        if (is != null) {
            long j12 = this.A06;
            if (A0D[2].length() != 15) {
                throw new RuntimeException();
            }
            A0D[3] = "GMIC0";
            if (j12 != -9223372036854775807L) {
                long j13 = is.A04;
                if (j13 == -9223372036854775807L) {
                    return j9;
                }
                return A00(j9, j13, this.A06) - this.A07;
            }
        }
        return j9;
    }

    public final void A08() {
        if (this.A09 != null) {
            IR ir = this.A0A;
            if (ir != null) {
                ir.A01();
            }
            this.A0B.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            IR ir = this.A0A;
            if (ir != null) {
                ir.A00();
            }
            A03();
        }
    }
}
