package com.meta.analytics.dsp.uinode;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0943Ts extends NY {
    public static byte[] A0F;
    public static String[] A0G = {"8gq0YClbFfezV7VWazRrkmUo5IqHlAe0", "DZEC2fF8R1zbFaxtc", "FhN1N87P5UC3PnJCVDWnxEC", "JmSzPmcyjiRof3lizahs2qZ", "A3Evrr3LcR4BJzz79LIh", "2a6NLKfKqYFtWGCWoigE8lnPrM", "Nz12Z6hGfXPsqa2uThDzH9TN", "eI6gTMB0yvKckA2LC3VZ0zYV"};
    public static final String A0H;
    public float A00;
    public C0723Lg A01;
    public RD A02;
    public RE A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Path A07;
    public final RectF A08;
    public final C1064Yn A09;
    public final WeakReference<InterfaceC0770Nb> A0A;
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;
    public final AtomicInteger A0D;
    public final AtomicReference<String> A0E;

    public static String A04(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0G[1] = "qkBM5EbEKD4bLDmS2";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 94);
            i10++;
        }
    }

    public static void A06() {
        A0F = new byte[]{0, 35, 2, 46, 45, 51, 49, 46, 43};
    }

    static {
        A06();
        A0H = C0943Ts.class.getSimpleName();
    }

    public C0943Ts(C1064Yn c1064Yn, WeakReference<InterfaceC0770Nb> weakReference, int i, String str) {
        this(c1064Yn, weakReference, i, false);
        if (C0653Ih.A1W(c1064Yn)) {
            c1064Yn.A01().A0A().AGw(this, str == null ? A04(0, 0, 74) : str, false, true);
            this.A06 = true;
        }
    }

    public C0943Ts(C1064Yn c1064Yn, WeakReference<InterfaceC0770Nb> weakReference, int i, boolean z) {
        super(c1064Yn);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.A0B = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
        this.A0C = atomicBoolean2;
        this.A07 = new Path();
        this.A08 = new RectF();
        this.A0D = new AtomicInteger(5000);
        this.A0E = new AtomicReference<>();
        this.A01 = new C0723Lg();
        this.A05 = true;
        this.A06 = false;
        this.A09 = c1064Yn;
        this.A04 = z;
        this.A0A = weakReference;
        this.A02 = new C0947Tw(this);
        this.A03 = new RE(this, i, new WeakReference(this.A02), c1064Yn);
        setWebChromeClient(A0D());
        setWebViewClient(A0E());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        if (Build.VERSION.SDK_INT > 16) {
            addJavascriptInterface(new C0769Na(this, weakReference.get(), this.A03, atomicBoolean, atomicBoolean2, c1064Yn), A04(0, 9, 97));
        }
    }

    private final boolean A07() {
        return this.A0B.get();
    }

    @Override // com.meta.analytics.dsp.uinode.NY
    public final WebChromeClient A0D() {
        return new C0771Nc();
    }

    @Override // com.meta.analytics.dsp.uinode.NY
    public final WebViewClient A0E() {
        return new C0772Nd(this.A09, this.A0A, new WeakReference(this.A03), new WeakReference(this.A01), new WeakReference(this.A0C), new WeakReference(this), this.A0D, this.A0E, this.A04);
    }

    public final void A0F() {
        this.A09.A0E().AGy();
        this.A0B.set(true);
        new Handler(Looper.getMainLooper()).post(new C0945Tu(this.A03));
    }

    public final void A0G(int i, int i5) {
        RE re = this.A03;
        if (re != null) {
            re.A0W(i);
            this.A03.A0X(i5);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.NY, android.webkit.WebView
    public final void destroy() {
        if (this.A06) {
            this.A09.A01().A0A().AGk(this);
        }
        RE re = this.A03;
        if (re != null) {
            re.A0V();
            this.A03 = null;
        }
        AbstractC0731Lo.A0J(this);
        this.A02 = null;
        this.A01 = null;
        AbstractC0773Ne.A03(this);
        super.destroy();
    }

    public C0723Lg getTouchDataRecorder() {
        return this.A01;
    }

    public RE getViewabilityChecker() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A00 > 0.0f) {
            this.A08.set(0.0f, 0.0f, getWidth(), getHeight());
            this.A07.reset();
            Path path = this.A07;
            RectF rectF = this.A08;
            float f3 = this.A00;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
            canvas.clipPath(this.A07);
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.A01.A06(this.A09, motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.A0A.get() != null) {
            this.A0A.get();
        }
        if (this.A03 == null) {
            return;
        }
        this.A09.A0E().AHC(i);
        if (A0G[1].length() != 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[7] = "DtJWCHxLbH6gtxJRxIB1oyEG";
        strArr[6] = "cIpyg99BbIZ2paT5Gicx86FT";
        if (i == 0 && A07()) {
            this.A03.A0U();
        } else {
            if (i != 8) {
                return;
            }
            this.A03.A0V();
        }
    }

    public void setBlockLocalFileAccessOutsideCache(boolean z) {
        this.A04 = z;
    }

    public void setCheckAssetsByJavascriptBridge(boolean z) {
        this.A0C.set(z);
    }

    public void setCornerRadius(float f3) {
        this.A00 = f3;
        invalidate();
    }

    public void setLogMultipleImpressions(boolean z) {
        this.A05 = z;
    }

    public void setRequestId(String str) {
        this.A0E.set(str);
    }

    public void setWebViewTimeoutInMillis(int i) {
        if (i >= 0) {
            this.A0D.set(i);
        }
    }
}
