package com.meta.analytics.dsp.uinode;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AsyncTaskC0684Jq extends AsyncTask<RW, Void, RJ> implements RT {
    public static byte[] A04;
    public RL A00;
    public C0675Jh A01;
    public Exception A02;
    public Executor A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final RJ A00(RW... rwArr) throws Throwable {
        if (KL.A02(this)) {
            return null;
        }
        try {
            if (rwArr != null) {
                try {
                    if (rwArr.length > 0) {
                        RJ rjA0J = this.A01.A0J(rwArr[0]);
                        if (this.A01.A0K().A04() && rjA0J != null) {
                            String.format(Locale.US, A01(108, 21, 6), Integer.valueOf(rjA0J.A83()), rjA0J.getUrl(), rjA0J.A69());
                        }
                        if (rjA0J != null) {
                            return rjA0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 119));
                    }
                } catch (Exception e4) {
                    this.A02 = e4;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 98), e4.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 69));
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-18, 25, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, -2, 11, 29, 21, -54, 30, 11, 21, 15, 29, -54, 15, 34, 11, 13, 30, 22, 35, -54, 25, 24, 15, -54, 11, 28, 17, 31, 23, 15, 24, 30, -54, 25, 16, -54, 30, 35, 26, 15, -54, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, 15, 27, 27, 23, -25, 57, 44, 56, 60, 44, 58, 59, -25, 45, 40, 48, 51, 44, 43, 1, -25, -20, 58, 36, 80, 80, 76, -4, 78, 65, 79, 76, 75, 74, 79, 65, -4, 69, 79, -4, 74, 81, 72, 72, -67, -48, -34, -37, -38, -39, -34, -48, -91, -117, -112, -49, -117, -109, -112, -34, -108, -91, 117, -112, -34};
    }

    public AsyncTaskC0684Jq(C0675Jh c0675Jh, RL rl, Executor executor) {
        this.A01 = c0675Jh;
        this.A00 = rl;
        this.A03 = executor;
    }

    private final void A03(RJ result) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.AB9(result);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    public final void A04(RW rw2) {
        super.executeOnExecutor(this.A03, rw2);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ RJ doInBackground(RW[] rwArr) throws Throwable {
        if (KL.A02(this)) {
            return null;
        }
        try {
            return A00(rwArr);
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.ABS(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(RJ rj) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            A03(rj);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
