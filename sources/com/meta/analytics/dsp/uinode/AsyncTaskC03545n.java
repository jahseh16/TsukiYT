package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AsyncTaskC03545n extends AsyncTask<C03565p, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"1BJo9noXfKND6AuvSNdcB1V3GCwIAiOG", "Zj7TA2K", "dGMOiNue98uIHvh7voSV0LAZFWXYzfEv", "CcnxrNYo5kyWzKS3XGCDqe4PQiCtH", "knheqnusZFI0swerek9wKwEDBcdWqhKt", "XjDOSOe9Ixcmw73z7hfuGI1aFjWKj", "M2ugdIZCKbhB2vBaVocVLhBvD0BsDTY5", "metH7Y2aXkNKgtpuuGKiPWqQd6SU"};
    public final InterfaceC03555o A00;
    public final C1064Yn A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Drawable A00(C03565p... c03565pArr) throws Throwable {
        if (!KL.A02(this) && c03565pArr != null) {
            try {
                if (c03565pArr.length >= 1) {
                    String str = c03565pArr[0].A01;
                    String str2 = c03565pArr[0].A00;
                    Bitmap bitmapA0N = null;
                    try {
                        bitmapA0N = new C03696c(this.A01).A0N(str, -1, -1);
                    } catch (Throwable th) {
                        this.A01.A07().A9a(A01(0, 7, 42), C8A.A1V, new C8B(th));
                    }
                    if (bitmapA0N != null) {
                        return V2.A05(this.A01, bitmapA0N, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                KL.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{59, 57, 50, 57, 46, 53, 63};
    }

    static {
        A02();
    }

    public AsyncTaskC03545n(C1064Yn c1064Yn, InterfaceC03555o interfaceC03555o, boolean z) {
        this.A01 = c1064Yn;
        this.A00 = interfaceC03555o;
        this.A02 = z;
    }

    public /* synthetic */ AsyncTaskC03545n(C1064Yn c1064Yn, InterfaceC03555o interfaceC03555o, boolean z, Z9 z9) {
        this(c1064Yn, interfaceC03555o, z);
    }

    private final void A03(Drawable drawable) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.ABi(drawable);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C03565p[] c03565pArr) throws Throwable {
        if (KL.A02(this)) {
            return null;
        }
        try {
            return A00(c03565pArr);
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            KL.A00(th, this);
            String[] strArr = A04;
            if (strArr[0].charAt(5) != strArr[4].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "H4qVqfS";
            strArr2[7] = "3NPSPTmKkS9byZNXvPXu57LevjUG";
        }
    }
}
