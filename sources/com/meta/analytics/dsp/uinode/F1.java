package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F1 {
    public static String[] A04 = {"XHo", "ubtbrXFiKU0aMD9WZdFFXMvL5SNCKhBD", "k9cdhOGQS1oEdCdR21VeueSE4nGT", "BZNadIlHUT8LbNbZ8qdMYncW4fXCJJFh", "22DNreJXUwzG5I9t9ymbmjKefjfUTWMr", "OkM0GcBH5aVjMNZagw1JqhxPR8ijdnHI", "ik3Hzc9el9B7KCBCFVHKN4tCPL2D2JGF", "0FgMGgJ2UsG2ZcXwt2m5OtQLezKmVI44"};
    public final int A00;
    public final C0560Eo A01;
    public final long A02;
    public final CopyOnWriteArrayList<F0> A03;

    public F1() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public F1(CopyOnWriteArrayList<F0> copyOnWriteArrayList, int i, C0560Eo c0560Eo, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c0560Eo;
        this.A02 = j;
    }

    private long A00(long j) {
        long jA01 = C9W.A01(j);
        if (jA01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final F1 A02(int i, C0560Eo c0560Eo, long j) {
        return new F1(this.A03, i, c0560Eo, j);
    }

    public final void A03() {
        AbstractC0620Ha.A04(this.A01 != null);
        for (F0 f02 : this.A03) {
            F4 listener = f02.A01;
            A01(f02.A00, new RunnableC0563Er(this, listener));
        }
    }

    public final void A04() {
        AbstractC0620Ha.A04(this.A01 != null);
        String[] strArr = A04;
        if (strArr[4].charAt(4) != strArr[1].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "rYA4ryMG3XFm73cnSWA4HWNW3HUxv7KC";
        strArr2[1] = "1YJ2rSWw51hvYcz1kikUBhJeKIWd76IZ";
        for (F0 listenerAndHandler : this.A03) {
            A01(listenerAndHandler.A00, new RunnableC0564Es(this, listenerAndHandler.A01));
        }
    }

    public final void A05() {
        AbstractC0620Ha.A04(this.A01 != null);
        for (F0 f02 : this.A03) {
            F4 listener = f02.A01;
            A01(f02.A00, new RunnableC0569Ex(this, listener));
        }
    }

    public final void A06(int i, Format format, int i5, Object obj, long j) {
        A0C(new F3(1, i, format, i5, obj, A00(j), -9223372036854775807L));
    }

    public final void A07(Handler handler, F4 f4) {
        AbstractC0620Ha.A03((handler == null || f4 == null) ? false : true);
        this.A03.add(new F0(handler, f4));
    }

    public final void A08(F2 f22, F3 f3) {
        for (F0 f02 : this.A03) {
            F4 listener = f02.A01;
            A01(f02.A00, new RunnableC0567Ev(this, listener, f22, f3));
        }
    }

    public final void A09(F2 f22, F3 f3) {
        for (F0 f02 : this.A03) {
            F4 listener = f02.A01;
            A01(f02.A00, new RunnableC0566Eu(this, listener, f22, f3));
        }
    }

    public final void A0A(F2 f22, F3 f3) {
        for (F0 f02 : this.A03) {
            F4 listener = f02.A01;
            A01(f02.A00, new RunnableC0565Et(this, listener, f22, f3));
        }
    }

    public final void A0B(F2 f22, F3 f3, IOException iOException, boolean z) {
        for (F0 f02 : this.A03) {
            A01(f02.A00, new RunnableC0568Ew(this, f02.A01, f22, f3, iOException, z));
        }
    }

    public final void A0C(F3 f3) {
        for (F0 f02 : this.A03) {
            F4 listener = f02.A01;
            A01(f02.A00, new RunnableC0571Ez(this, listener, f3));
        }
    }

    public final void A0D(F4 f4) {
        for (F0 listenerAndHandler : this.A03) {
            if (listenerAndHandler.A01 == f4) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(C0619Gy c0619Gy, int i, int i5, Format format, int i8, Object obj, long j, long j4, long j7) {
        A0A(new F2(c0619Gy, j7, 0L, 0L), new F3(i, i5, format, i8, obj, A00(j), A00(j4)));
    }

    public final void A0F(C0619Gy c0619Gy, int i, int i5, Format format, int i8, Object obj, long j, long j4, long j7, long j8, long j9) {
        A08(new F2(c0619Gy, j7, j8, j9), new F3(i, i5, format, i8, obj, A00(j), A00(j4)));
    }

    public final void A0G(C0619Gy c0619Gy, int i, int i5, Format format, int i8, Object obj, long j, long j4, long j7, long j8, long j9) {
        A09(new F2(c0619Gy, j7, j8, j9), new F3(i, i5, format, i8, obj, A00(j), A00(j4)));
    }

    public final void A0H(C0619Gy c0619Gy, int i, int i5, Format format, int i8, Object obj, long j, long j4, long j7, long j8, long j9, IOException iOException, boolean z) {
        A0B(new F2(c0619Gy, j7, j8, j9), new F3(i, i5, format, i8, obj, A00(j), A00(j4)), iOException, z);
    }
}
