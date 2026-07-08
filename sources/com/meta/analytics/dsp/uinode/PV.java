package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PV implements View.OnTouchListener {
    public static byte[] A01;
    public static String[] A02 = {"nTJw2HQmlXly2UF06", "09pvuqNAuk0d0kWf9oP4EF7vD9WhRuQ2", "C723y22SlktCgvbyr", "ZmMyMPPk6FEy4XD3gqTK2d5Nku0Q81Z0", "skuvOwmau9g9aPLOFCXPmD", "axafZnGOpn7qXt4tgge2fS17aPq3Kcv5", "MD612YACy1aZjZYrd9Q8DckZRQGlrVYC", "HeA9vxZD3qLAMjz4pEIeKnSfi2CXY38t"};
    public final /* synthetic */ C0922Sx A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{74, 76, 90, 77, 96, 92, 83, 86, 92, 84, 96, 86, 94, 93, 91, 93, 75, 92, 113, 69, 75, 87, 94, 79, 74, 113, 77, 66, 71, 77, 69, 113, 71, 79, 76};
    }

    static {
        A01();
    }

    public PV(C0922Sx c0922Sx) {
        this.A00 = c0922Sx;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.A00.A0O || this.A00.A09 == null || !this.A00.A09.isAcceptingText()) {
                    return false;
                }
                this.A00.A0O = true;
                this.A00.A0j(A00(14, 21, 47));
                return false;
            case 1:
                C0922Sx.A0A(this.A00);
                if (A02[7].length() != 32) {
                    throw new RuntimeException();
                }
                A02[3] = "V8Iyg5ceA0qUXrZrfcXrbF7yHzuc3ZLC";
                if (this.A00.A0N || this.A00.A07 < 5) {
                    return false;
                }
                this.A00.A0N = true;
                this.A00.A0j(A00(0, 14, 62));
                return false;
            default:
                return false;
        }
    }
}
