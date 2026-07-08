package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AsyncTaskC0941Tq extends AsyncTask<String, Void, Bitmap[]> implements InterfaceC03887b {
    public static byte[] A0A;
    public static String[] A0B = {"Y", "r8ye64eLoQHeOJVpmB1uxWw1zCCHhuzX", "pvZIfONmKv3cVbimQPa9", "RLgA2SApOIsDDawooMs2KL5D8ZiCWoW1", "kM6akDIqkvY", "0vJdyNO9qrz2JF8Kt31GcmRDql8haFQB", "b8N1ZLVb0I2QrMIKflin5UtA7D7V4D", "X"};
    public int A00;
    public int A01;
    public InterfaceC0776Nh A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final WeakReference<C0774Nf> A06;
    public final WeakReference<C1064Yn> A07;
    public final WeakReference<ImageView> A08;
    public final WeakReference<ViewGroup> A09;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-89, -91, -82, -91, -78, -87, -93};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Bitmap[] A03(String... strArr) throws Throwable {
        if (KL.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            Bitmap bitmapA0N = null;
            Bitmap bitmapA01 = null;
            C1064Yn c1064Yn = this.A07.get();
            if (c1064Yn == null) {
                return new Bitmap[]{null, null};
            }
            try {
                bitmapA0N = new C03696c(c1064Yn).A0N(str, this.A00, this.A01);
                if (bitmapA0N != null && !this.A03) {
                    bitmapA01 = AbstractC0738Lv.A01(c1064Yn, bitmapA0N, this.A04, this.A05);
                }
            } catch (Throwable th) {
                c1064Yn.A07().A9a(A00(0, 7, 16), C8A.A1V, new C8B(th));
            }
            return new Bitmap[]{bitmapA0N, bitmapA01};
        } catch (Throwable th2) {
            KL.A00(th2, this);
            return null;
        }
    }

    static {
        A01();
    }

    public AsyncTaskC0941Tq(ViewGroup viewGroup, int i, int i5, C1064Yn c1064Yn) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1064Yn);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i;
        this.A05 = i5;
    }

    public AsyncTaskC0941Tq(ViewGroup viewGroup, C1064Yn c1064Yn) {
        this(viewGroup, 12, 16, c1064Yn);
    }

    public AsyncTaskC0941Tq(ImageView imageView, C1064Yn c1064Yn) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1064Yn);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public AsyncTaskC0941Tq(C0774Nf c0774Nf, C1064Yn c1064Yn) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1064Yn);
        this.A06 = new WeakReference<>(c0774Nf);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(Bitmap[] result) throws Throwable {
        C0774Nf c0774Nf;
        if (KL.A02(this)) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.A08;
            if (weakReference != null) {
                ImageView imageView = weakReference.get();
                if (result[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(result[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(result[0]);
                }
            }
            WeakReference<C0774Nf> weakReference2 = this.A06;
            if (weakReference2 != null && (c0774Nf = weakReference2.get()) != null) {
                c0774Nf.setImage(result[0], result[1]);
            }
            WeakReference<ViewGroup> weakReference3 = this.A09;
            if (weakReference3 != null && weakReference3.get() != null && result[1] != null) {
                AbstractC0731Lo.A0S(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), result[1]));
            }
            InterfaceC0776Nh interfaceC0776Nh = this.A02;
            if (interfaceC0776Nh != null) {
                interfaceC0776Nh.ABh(result[0] != null);
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    public final AsyncTaskC0941Tq A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final AsyncTaskC0941Tq A05(int i, int i5) {
        this.A00 = i;
        this.A01 = i5;
        return this;
    }

    public final AsyncTaskC0941Tq A06(InterfaceC0776Nh interfaceC0776Nh) {
        this.A02 = interfaceC0776Nh;
        return this;
    }

    public final void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            InterfaceC0776Nh interfaceC0776Nh = this.A02;
            if (interfaceC0776Nh != null) {
                interfaceC0776Nh.ABh(false);
                return;
            }
            return;
        }
        executeOnExecutor(ExecutorC0736Lt.A06, str);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03887b
    public final C1064Yn A5t() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) throws Throwable {
        if (KL.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (Throwable th) {
            KL.A00(th, this);
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "X";
            strArr2[7] = "y";
        }
    }
}
