package com.wheelview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import free.daily.tube.base_impl.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class WheelView extends FrameLayout {

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public boolean f3127ap;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3128b;
    public int c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f3129co;
    public Interpolator ct;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f3130d;
    public int d0;
    public boolean dm;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f3131e;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public int f3132eb;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public Paint f3133ej;
    public s en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<fb> f3134f;
    public int f3;
    public int f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public float f3135fb;
    public VelocityTracker fh;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public fb[] f3136g3;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public float f3137hw;
    public int j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public float f3138j5;
    public boolean jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3139k;

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    public LinearGradient f3140kp;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public int f3141lc;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3142m;
    public int n;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public boolean f3143nf;
    public float o;
    public int o4;
    public int oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3144p;
    public int q9;
    public float qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3145r;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public HandlerThread f3146ra;

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public LinearGradient f3147rb;
    public int rs;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3148s;
    public int s8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList<String> f3149t;
    public boolean u;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public int f3150ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f3151v;
    public int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3152x;
    public boolean xg;
    public float y;
    public boolean y5;

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public Handler f3153yc;

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public EditText f3154yg;
    public float z;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = WheelView.this.f3141lc;
            if (WheelView.this.f3131e == null) {
            }
            switch (message.what) {
                case 10010:
                    WheelView.this.rs++;
                    WheelView wheelView = WheelView.this;
                    wheelView.f3141lc = (int) (wheelView.ct.getInterpolation(wheelView.rs / 200.0f) * WheelView.this.o4);
                    WheelView wheelView2 = WheelView.this;
                    wheelView2.ud(wheelView2.f3132eb > 0 ? WheelView.this.f3141lc - i : (WheelView.this.f3141lc - i) * (-1));
                    if (WheelView.this.rs < 200 && WheelView.this.f3143nf && (WheelView.this.rs < 40 || Math.abs(i - WheelView.this.f3141lc) >= WheelView.this.f3145r)) {
                        WheelView.this.f3131e.sendEmptyMessageDelayed(10010, 10L);
                    } else {
                        WheelView.this.f3143nf = false;
                        WheelView.this.f3131e.sendEmptyMessage(10011);
                    }
                    break;
                case 10011:
                    WheelView wheelView3 = WheelView.this;
                    wheelView3.q9(wheelView3.f3132eb > 0 ? WheelView.this.f3145r : WheelView.this.f3145r * (-1));
                    WheelView.this.f3148s = false;
                    WheelView.this.f3143nf = false;
                    WheelView.this.f3141lc = 0;
                    WheelView.this.o4 = 0;
                    break;
                case 10012:
                    WheelView.this.s8 += WheelView.this.f3132eb > 0 ? WheelView.this.f3141lc - i : (WheelView.this.f3141lc - i) * (-1);
                    WheelView.this.f3141lc = 0;
                    WheelView.this.f3148s = false;
                    WheelView.this.f3143nf = false;
                    WheelView.this.yt();
                    WheelView.this.postInvalidate();
                    break;
            }
        }
    }

    public interface c5 {
    }

    public class fb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3155a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public boolean f3156c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public TextPaint f3157fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f3158gv;
        public String n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Rect f3160s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f3161v;
        public int y;
        public String zn;

        public synchronized float a() {
            return ((WheelView.this.f3151v / 2.0f) - (WheelView.this.o / 2.0f)) - (this.f3161v + this.f3155a);
        }

        public void c5(String str) {
            this.f3156c5 = true;
            this.n3 = str;
            this.zn = new String(str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
        
            if ((r6.f3161v + r6.f3155a) < (((r6.f3159i9.j + 2) * r6.f3159i9.o) / 2.0f)) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized boolean fb() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.y()     // Catch: java.lang.Throwable -> L45
                r1 = 0
                if (r0 == 0) goto La
                monitor-exit(r6)
                return r1
            La:
                int r0 = r6.f3161v     // Catch: java.lang.Throwable -> L45
                int r2 = r6.f3155a     // Catch: java.lang.Throwable -> L45
                int r0 = r0 + r2
                float r0 = (float) r0     // Catch: java.lang.Throwable -> L45
                com.wheelview.WheelView r2 = com.wheelview.WheelView.this     // Catch: java.lang.Throwable -> L45
                int r2 = com.wheelview.WheelView.fb(r2)     // Catch: java.lang.Throwable -> L45
                r3 = 1
                int r2 = r2 - r3
                float r2 = (float) r2     // Catch: java.lang.Throwable -> L45
                com.wheelview.WheelView r4 = com.wheelview.WheelView.this     // Catch: java.lang.Throwable -> L45
                float r4 = com.wheelview.WheelView.x4(r4)     // Catch: java.lang.Throwable -> L45
                float r2 = r2 * r4
                r4 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 / r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 >= 0) goto L47
                int r0 = r6.f3161v     // Catch: java.lang.Throwable -> L45
                int r2 = r6.f3155a     // Catch: java.lang.Throwable -> L45
                int r0 = r0 + r2
                float r0 = (float) r0     // Catch: java.lang.Throwable -> L45
                com.wheelview.WheelView r2 = com.wheelview.WheelView.this     // Catch: java.lang.Throwable -> L45
                int r2 = com.wheelview.WheelView.fb(r2)     // Catch: java.lang.Throwable -> L45
                int r2 = r2 + (-4)
                float r2 = (float) r2     // Catch: java.lang.Throwable -> L45
                com.wheelview.WheelView r5 = com.wheelview.WheelView.this     // Catch: java.lang.Throwable -> L45
                float r5 = com.wheelview.WheelView.x4(r5)     // Catch: java.lang.Throwable -> L45
                float r2 = r2 * r5
                float r2 = r2 / r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 > 0) goto L7e
                goto L47
            L45:
                r0 = move-exception
                goto L82
            L47:
                int r0 = r6.f3161v     // Catch: java.lang.Throwable -> L45
                int r2 = r6.f3155a     // Catch: java.lang.Throwable -> L45
                int r0 = r0 + r2
                float r0 = (float) r0     // Catch: java.lang.Throwable -> L45
                com.wheelview.WheelView r2 = com.wheelview.WheelView.this     // Catch: java.lang.Throwable -> L45
                int r2 = com.wheelview.WheelView.fb(r2)     // Catch: java.lang.Throwable -> L45
                int r2 = r2 - r3
                float r2 = (float) r2     // Catch: java.lang.Throwable -> L45
                com.wheelview.WheelView r5 = com.wheelview.WheelView.this     // Catch: java.lang.Throwable -> L45
                float r5 = com.wheelview.WheelView.x4(r5)     // Catch: java.lang.Throwable -> L45
                float r2 = r2 * r5
                float r2 = r2 / r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L80
                int r0 = r6.f3161v     // Catch: java.lang.Throwable -> L45
                int r2 = r6.f3155a     // Catch: java.lang.Throwable -> L45
                int r0 = r0 + r2
                float r0 = (float) r0     // Catch: java.lang.Throwable -> L45
                com.wheelview.WheelView r2 = com.wheelview.WheelView.this     // Catch: java.lang.Throwable -> L45
                int r2 = com.wheelview.WheelView.fb(r2)     // Catch: java.lang.Throwable -> L45
                int r2 = r2 + 2
                float r2 = (float) r2     // Catch: java.lang.Throwable -> L45
                com.wheelview.WheelView r5 = com.wheelview.WheelView.this     // Catch: java.lang.Throwable -> L45
                float r5 = com.wheelview.WheelView.x4(r5)     // Catch: java.lang.Throwable -> L45
                float r2 = r2 * r5
                float r2 = r2 / r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 >= 0) goto L80
            L7e:
                monitor-exit(r6)
                return r3
            L80:
                monitor-exit(r6)
                return r1
            L82:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wheelview.WheelView.fb.fb():boolean");
        }

        public synchronized boolean gv() {
            if (this.f3161v + this.f3155a <= WheelView.this.f3151v) {
                if (this.f3161v + this.f3155a + WheelView.this.o >= 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public void n3(Canvas canvas, int i) {
            if (gv()) {
                if (this.f3157fb == null) {
                    TextPaint textPaint = new TextPaint();
                    this.f3157fb = textPaint;
                    textPaint.setAntiAlias(true);
                }
                if (this.f3160s == null) {
                    this.f3160s = new Rect();
                }
                if (y()) {
                    this.f3157fb.setColor(WheelView.this.q9);
                    float fA = a();
                    if (fA <= 0.0f) {
                        fA *= -1.0f;
                    }
                    this.f3157fb.setTextSize(WheelView.this.f3138j5 + ((WheelView.this.qn - WheelView.this.f3138j5) * (1.0f - (fA / WheelView.this.o))));
                    this.f3157fb.setTypeface(Typeface.DEFAULT_BOLD);
                } else if (fb()) {
                    this.f3157fb.setColor(WheelView.this.f3150ut);
                    this.f3157fb.setTextSize(WheelView.this.f3138j5);
                    this.f3157fb.setTypeface(Typeface.DEFAULT);
                } else {
                    this.f3157fb.setColor(WheelView.this.oz);
                    this.f3157fb.setTextSize(WheelView.this.f3138j5);
                    this.f3157fb.setTypeface(Typeface.DEFAULT);
                }
                if (WheelView.this.o < Math.max(WheelView.this.qn, WheelView.this.f3138j5)) {
                    float f3 = WheelView.this.o - (WheelView.this.f3128b * 2.0f);
                    this.f3157fb.setTextSize(f3);
                    WheelView.this.f3154yg.setTextSize(0, f3);
                }
                if (this.f3156c5) {
                    String str = (String) TextUtils.ellipsize(this.n3, this.f3157fb, i, TextUtils.TruncateAt.END);
                    this.n3 = str;
                    this.f3157fb.getTextBounds(str, 0, str.length(), this.f3160s);
                    if (WheelView.this.qn == WheelView.this.f3138j5) {
                        this.f3156c5 = false;
                    }
                }
                canvas.drawText(this.n3, (this.f3158gv + (WheelView.this.y / 2.0f)) - (this.f3160s.width() / 2.0f), this.f3161v + this.f3155a + (WheelView.this.o / 2.0f) + (this.f3160s.height() / 2.0f), this.f3157fb);
            }
        }

        public synchronized boolean s() {
            boolean z = false;
            if (this.f3160s == null) {
                return false;
            }
            if (this.f3161v + this.f3155a >= (((WheelView.this.j / 2) * WheelView.this.o) - (WheelView.this.o / 2.0f)) + (this.f3160s.height() / 2.0f)) {
                if (this.f3161v + this.f3155a <= (((WheelView.this.j / 2) * WheelView.this.o) + (WheelView.this.o / 2.0f)) - (this.f3160s.height() / 2.0f)) {
                    z = true;
                }
            }
            return z;
        }

        public synchronized void v(int i) {
            this.f3155a = i;
        }

        public synchronized boolean y() {
            if (this.f3161v + this.f3155a > ((WheelView.this.j - 2) * WheelView.this.o) / 2.0f) {
                if (this.f3161v + this.f3155a < (WheelView.this.j * WheelView.this.o) / 2.0f) {
                    return true;
                }
            }
            return false;
        }

        public String zn() {
            return this.zn;
        }

        public fb() {
            this.y = 0;
            this.n3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            this.zn = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            this.f3158gv = 0;
            this.f3161v = 0;
            this.f3155a = 0;
            this.f3156c5 = true;
        }
    }

    public class gv implements Runnable {
        public gv() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WheelView.this.en.n3(WheelView.this.f3136g3[WheelView.this.j / 2].y, WheelView.this.f3136g3[WheelView.this.j / 2].zn());
        }
    }

    public class n3 implements TextView.OnEditorActionListener {
        public n3() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
                return false;
            }
            WheelView.this.f3154yg.setVisibility(8);
            WheelView.xc(WheelView.this);
            return true;
        }
    }

    public interface s {
        void n3(int i, String str);

        void y(int i, String str);
    }

    public class v implements Runnable {
        public final /* synthetic */ int y;

        public v(int i) {
            this.y = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iA;
            int iA2;
            WheelView.this.yt();
            int selected = WheelView.this.getSelected();
            if (selected != -1) {
                iA2 = (int) ((fb) WheelView.this.f3134f.get(selected)).a();
            } else {
                synchronized (WheelView.this.f3136g3) {
                    try {
                        iA = 0;
                        if (this.y <= 0) {
                            int length = WheelView.this.f3136g3.length - 1;
                            while (true) {
                                if (length >= 0) {
                                    if (WheelView.this.f3136g3[length] != null && WheelView.this.f3136g3[length].y()) {
                                        iA = (int) WheelView.this.f3136g3[length].a();
                                        break;
                                    }
                                    length--;
                                } else {
                                    break;
                                }
                            }
                        } else {
                            int i = 0;
                            while (true) {
                                if (i < WheelView.this.f3136g3.length) {
                                    if (WheelView.this.f3136g3[i] != null && WheelView.this.f3136g3[i].y()) {
                                        iA = (int) WheelView.this.f3136g3[i].a();
                                        break;
                                    }
                                    i++;
                                } else {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iA2 = iA;
            }
            int i5 = iA2 > 0 ? iA2 : iA2 * (-1);
            int i8 = iA2 <= 0 ? -1 : 1;
            int i10 = WheelView.this.f3145r;
            while (true) {
                if (i5 == 0) {
                    break;
                }
                i5 -= i10;
                if (i5 < 0) {
                    WheelView.this.s8 -= i5 * i8;
                    WheelView.this.yt();
                    WheelView.this.postInvalidate();
                    try {
                        Thread.sleep(10L);
                        break;
                    } catch (InterruptedException e4) {
                        e4.printStackTrace();
                    }
                } else {
                    WheelView.this.s8 -= i10 * i8;
                    WheelView.this.yt();
                    WheelView.this.postInvalidate();
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            WheelView.this.j(this.y);
        }
    }

    public class y implements View.OnFocusChangeListener {
        public final /* synthetic */ Context y;

        public y(Context context) {
            this.y = context;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                WheelView.this.f3154yg.setText(WheelView.this.getSelectedText());
                WheelView.this.ut(this.y);
                WheelView.xc(WheelView.this);
                WheelView.this.f3154yg.selectAll();
                return;
            }
            WheelView.this.f3154yg.setSelection(0, 0);
            WheelView.this.f3154yg.setVisibility(8);
            WheelView.xc(WheelView.this);
            WheelView.j5(WheelView.this.f3154yg);
        }
    }

    public class zn implements Runnable {
        public final /* synthetic */ fb y;

        public zn(fb fbVar) {
            this.y = fbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            s sVar = WheelView.this.en;
            fb fbVar = this.y;
            sVar.y(fbVar.y, fbVar.zn());
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3148s = false;
        this.f3134f = new ArrayList<>();
        this.f3149t = new ArrayList<>();
        this.f3129co = 0L;
        this.z = 1.0f;
        this.f3145r = 1;
        this.f3 = 2;
        this.n = 100;
        this.f3152x = -16777216;
        this.f3128b = 2.0f;
        this.f3137hw = -1.0f;
        this.f3138j5 = 14.0f;
        this.qn = 22.0f;
        this.o = 50.0f;
        this.j = 7;
        this.oz = -16777216;
        this.f3150ut = -1;
        this.q9 = -65536;
        this.f3139k = -654311425;
        this.f7 = -1056964609;
        this.jz = true;
        this.u = true;
        this.y5 = true;
        this.xg = true;
        this.dm = false;
        this.ct = new DecelerateInterpolator(2.0f);
        this.rs = 0;
        this.f3143nf = false;
        qn(context, attributeSet);
        o();
    }

    public static void j5(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
    }

    public static /* bridge */ /* synthetic */ c5 xc(WheelView wheelView) {
        wheelView.getClass();
        return null;
    }

    public final void a8(int i) {
        this.s8 -= i;
        vl(false);
        postInvalidate();
    }

    public final synchronized void b(Canvas canvas) {
        if (this.dm) {
            return;
        }
        synchronized (this.f3136g3) {
            try {
                for (fb fbVar : this.f3136g3) {
                    if (fbVar != null) {
                        fbVar.n3(canvas, getMeasuredWidth());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void ej(int i) {
        this.s8 -= i;
        yt();
        invalidate();
    }

    public int getItemNumber() {
        return this.j;
    }

    public int getListSize() {
        ArrayList<fb> arrayList = this.f3134f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public int getSelected() {
        synchronized (this.f3136g3) {
            try {
                for (fb fbVar : this.f3136g3) {
                    if (fbVar != null && fbVar.s()) {
                        return fbVar.y;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getSelectedText() {
        synchronized (this.f3136g3) {
            try {
                for (fb fbVar : this.f3136g3) {
                    if (fbVar != null && fbVar.s()) {
                        return fbVar.zn();
                    }
                }
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void hw(int i, long j) {
        try {
            this.rs = 0;
            int iAbs = Math.abs(i / 10);
            if (((long) this.f3132eb) * j > 0) {
                this.o4 += iAbs;
            } else {
                this.o4 = iAbs;
            }
            this.f3132eb = (int) j;
            this.f3143nf = true;
            Handler handler = this.f3131e;
            if (handler == null) {
                return;
            }
            handler.sendEmptyMessage(10010);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j(int i) {
        if (this.u) {
            synchronized (this.f3136g3) {
                try {
                    yt();
                    int i5 = 0;
                    for (fb fbVar : this.f3136g3) {
                        if (fbVar != null && fbVar.s()) {
                            int iA = (int) fbVar.a();
                            oz(fbVar);
                            a8(iA);
                            return;
                        }
                    }
                    if (i > 0) {
                        while (true) {
                            fb[] fbVarArr = this.f3136g3;
                            if (i5 >= fbVarArr.length) {
                                break;
                            }
                            fb fbVar2 = fbVarArr[i5];
                            if (fbVar2 != null && fbVar2.y()) {
                                int iA2 = (int) this.f3136g3[i5].a();
                                oz(this.f3136g3[i5]);
                                a8(iA2);
                                return;
                            }
                            i5++;
                        }
                    } else {
                        for (int length = this.f3136g3.length - 1; length >= 0; length--) {
                            fb fbVar3 = this.f3136g3[length];
                            if (fbVar3 != null && fbVar3.y()) {
                                int iA3 = (int) this.f3136g3[length].a();
                                oz(this.f3136g3[length]);
                                a8(iA3);
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void k5(Canvas canvas) {
        if (this.f3133ej == null) {
            this.f3133ej = new Paint();
            float f3 = this.o;
            int i = this.f3139k;
            int i5 = this.f7;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f3140kp = new LinearGradient(0.0f, 0.0f, 0.0f, f3, i, i5, tileMode);
            float f4 = this.f3151v;
            this.f3147rb = new LinearGradient(0.0f, f4 - this.o, 0.0f, f4, this.f7, this.f3139k, tileMode);
        }
        this.f3133ej.setShader(this.f3140kp);
        canvas.drawRect(0.0f, 0.0f, this.y, (this.j / 2) * this.o, this.f3133ej);
        this.f3133ej.setShader(this.f3147rb);
        float f5 = this.f3151v;
        canvas.drawRect(0.0f, f5 - ((this.j / 2) * this.o), this.y, f5, this.f3133ej);
    }

    public final void o() {
        this.dm = true;
        this.f3134f.clear();
        for (int i = 0; i < this.f3149t.size(); i++) {
            fb fbVar = new fb();
            fbVar.y = i;
            fbVar.c5(this.f3149t.get(i));
            fbVar.f3158gv = 0;
            fbVar.f3161v = (int) (i * this.o);
            this.f3134f.add(fbVar);
        }
        this.dm = false;
        z6(this.y5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerThread handlerThread = new HandlerThread("goOnHandlerThread");
        this.f3146ra = handlerThread;
        handlerThread.setPriority(1);
        this.f3146ra.start();
        this.f3131e = new a(this.f3146ra.getLooper());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        HandlerThread handlerThread = this.f3146ra;
        if (handlerThread != null && handlerThread.isAlive()) {
            this.f3146ra.quit();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.y = getWidth();
        x(canvas);
        b(canvas);
        k5(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        if (mode == Integer.MIN_VALUE) {
            int size = View.MeasureSpec.getSize(i5);
            float f3 = size;
            if (f3 < this.f3151v && size != 0) {
                this.f3151v = f3;
                this.o = (int) (f3 / this.j);
            }
        } else if (mode == 1073741824) {
            this.f3151v = View.MeasureSpec.getSize(i5);
            this.o = (int) (r10 / this.j);
        }
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (mode2 == Integer.MIN_VALUE) {
            int size3 = View.MeasureSpec.getSize(i);
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(this.qn);
            Rect rect = new Rect();
            Iterator<String> it = this.f3149t.iterator();
            int iWidth = 0;
            while (it.hasNext()) {
                String str = it.next() + "PA";
                textPaint.getTextBounds(str, 0, str.length(), rect);
                if (iWidth < rect.width()) {
                    iWidth = rect.width();
                }
            }
            if (size3 > getPaddingLeft() + iWidth + getPaddingRight() && iWidth != 0) {
                size2 = iWidth + getPaddingLeft() + getPaddingRight();
            }
        }
        float f4 = this.f3137hw;
        if (f4 != -1.0f && size2 > f4) {
            size2 = (int) f4;
        }
        setMeasuredDimension(size2, (int) this.f3151v);
        this.f3154yg.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - ((FrameLayout.LayoutParams) this.f3154yg.getLayoutParams()).leftMargin) - ((FrameLayout.LayoutParams) this.f3154yg.getLayoutParams()).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (this.f3151v / this.j), 1073741824));
        if (Math.abs(this.f3135fb - this.f3151v) > 0.1d) {
            int selected = getSelected();
            o();
            if (selected != -1) {
                setDefault(selected);
            } else {
                setDefault(this.f3142m);
            }
            this.f3135fb = this.f3151v;
            this.f3154yg.getLayoutParams().height = (int) (this.f3151v / this.j);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.jz) {
            return true;
        }
        if (this.fh == null) {
            this.fh = VelocityTracker.obtain();
        }
        this.fh.addMovement(motionEvent);
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3154yg.setVisibility(8);
            this.f3154yg.clearFocus();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (this.f3148s) {
                this.f3143nf = false;
                Handler handler = this.f3131e;
                if (handler != null) {
                    handler.removeMessages(10010);
                    this.f3131e.sendEmptyMessage(10012);
                }
            }
            this.f3148s = true;
            this.w = (int) motionEvent.getY();
            this.f3144p = (int) motionEvent.getY();
            this.f3129co = System.currentTimeMillis();
        } else if (action == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f3129co;
            VelocityTracker velocityTracker = this.fh;
            velocityTracker.computeCurrentVelocity(1000, this.c);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.d0) {
                hw(yVelocity, y3 - this.w);
            } else {
                if (Math.abs(y3 - this.w) > this.f3 || jCurrentTimeMillis > this.n) {
                    q9(y3 - this.w);
                } else {
                    int i = this.w;
                    float f3 = i;
                    float f4 = this.o;
                    int i5 = this.j;
                    if (f3 >= (i5 / 2) * f4 || i <= 0) {
                        float f5 = i;
                        float f7 = this.f3151v;
                        if (f5 <= f7 - ((i5 / 2) * f4) || i >= f7) {
                            if (this.f3127ap) {
                                this.f3154yg.setVisibility(0);
                                this.f3154yg.requestFocus();
                            }
                            j(y3 - this.w);
                        } else {
                            ej(-((int) (f4 / 3.0f)));
                            q9(((-((int) this.o)) * 2) / 3);
                        }
                    } else {
                        ej((int) (f4 / 3.0f));
                        q9((((int) this.o) * 2) / 3);
                    }
                }
                this.f3148s = false;
            }
            this.fh.recycle();
            this.fh = null;
        } else if (action == 2) {
            this.f3143nf = false;
            this.f3148s = true;
            ej(y3 - this.f3144p);
            this.f3144p = y3;
        }
        return true;
    }

    public final void oz(fb fbVar) {
        if (this.en != null) {
            this.f3153yc.removeCallbacksAndMessages(null);
            this.f3153yc.post(new zn(fbVar));
        }
    }

    public final synchronized void q9(int i) {
        Handler handler = this.f3131e;
        if (handler == null) {
            return;
        }
        handler.post(new v(i));
    }

    public final void qn(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.w);
        this.o = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.a8, this.o);
        this.j = typedArrayObtainStyledAttributes.getInt(R.styleable.n, this.j);
        this.f3138j5 = typedArrayObtainStyledAttributes.getDimension(R.styleable.d, this.f3138j5);
        this.qn = typedArrayObtainStyledAttributes.getDimension(R.styleable.ud, this.qn);
        this.oz = typedArrayObtainStyledAttributes.getColor(R.styleable.ta, this.oz);
        this.f3150ut = typedArrayObtainStyledAttributes.getColor(R.styleable.z6, this.f3150ut);
        this.q9 = typedArrayObtainStyledAttributes.getColor(R.styleable.ej, this.q9);
        this.f3152x = typedArrayObtainStyledAttributes.getColor(R.styleable.c, this.f3152x);
        this.f3128b = typedArrayObtainStyledAttributes.getDimension(R.styleable.d0, this.f3128b);
        this.f3137hw = typedArrayObtainStyledAttributes.getDimension(R.styleable.p, -1.0f);
        this.u = typedArrayObtainStyledAttributes.getBoolean(R.styleable.mg, true);
        this.jz = typedArrayObtainStyledAttributes.getBoolean(R.styleable.f3, true);
        this.y5 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.i4, true);
        this.f3127ap = typedArrayObtainStyledAttributes.getBoolean(R.styleable.x, false);
        this.f3139k = typedArrayObtainStyledAttributes.getColor(R.styleable.fh, -654311425);
        this.f7 = typedArrayObtainStyledAttributes.getColor(R.styleable.rz, -1056964609);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.z = f3;
        this.f3145r = (int) (1.0f * f3);
        this.f3 = (int) (f3 * 2.0f);
        int i = this.j;
        this.f3151v = i * this.o;
        this.f3136g3 = new fb[i + 2];
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.n = ViewConfiguration.getTapTimeout();
        this.d0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3153yc = new Handler(Looper.getMainLooper());
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.x4, -16777216);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.co, 0);
        EditText editText = new EditText(context);
        this.f3154yg = editText;
        if (resourceId == 0) {
            editText.setBackgroundColor(0);
        } else {
            editText.setBackgroundResource(resourceId);
        }
        this.f3154yg.setTextColor(color);
        this.f3154yg.setTextSize(0, this.qn);
        this.f3154yg.setGravity(17);
        this.f3154yg.setPadding(0, 0, 0, 0);
        this.f3154yg.setOnFocusChangeListener(new y(context));
        this.f3154yg.setInputType(typedArrayObtainStyledAttributes.getInt(R.styleable.mt, 0));
        this.f3154yg.setImeOptions(6);
        this.f3154yg.setOnEditorActionListener(new n3());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) this.o);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.z, 0);
        layoutParams.rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.r, 0);
        Log.e("WheelView", "leftMargin=" + layoutParams.leftMargin);
        Log.e("WheelView", "rightMargin=" + layoutParams.rightMargin);
        addView(this.f3154yg, layoutParams);
        this.f3154yg.setVisibility(8);
        setWillNotDraw(false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setCyclic(boolean z) {
        this.y5 = z;
        z6(z);
    }

    public void setData(ArrayList<String> arrayList) {
        this.f3149t = arrayList;
        o();
        requestLayout();
    }

    public void setDefault(int i) {
        this.f3142m = i;
        if (!this.f3134f.isEmpty() && i <= this.f3134f.size() - 1) {
            this.s8 = 0;
            Iterator<fb> it = this.f3134f.iterator();
            while (it.hasNext()) {
                it.next().f3155a = 0;
            }
            yt();
            float fA = this.f3134f.get(i).a();
            oz(this.f3134f.get(i));
            a8((int) fA);
        }
    }

    public void setEnable(boolean z) {
        this.jz = z;
    }

    public void setItemNumber(int i) {
        this.j = i;
        this.f3151v = i * this.o;
        this.f3136g3 = new fb[i + 2];
        requestLayout();
    }

    public void setNormalColor(int i) {
        this.oz = i;
        invalidate();
    }

    public void setOnInputListener(c5 c5Var) {
    }

    public void setOnSelectListener(s sVar) {
        this.en = sVar;
    }

    public void setSecondTextColor(int i) {
        this.f3150ut = i;
        invalidate();
    }

    public void setSelectedColor(int i) {
        this.q9 = i;
        invalidate();
    }

    public void setWithInputText(boolean z) {
        this.f3127ap = z;
    }

    public final void ud(int i) {
        this.s8 -= i;
        yt();
        postInvalidate();
    }

    public final void ut(Context context) {
        ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(this.f3154yg, 1);
    }

    public final void vl(boolean z) {
        if (this.f3134f.isEmpty()) {
            return;
        }
        int i = 0;
        if (this.xg) {
            if (this.s8 > this.o * this.f3134f.size()) {
                this.s8 %= ((int) this.o) * this.f3134f.size();
            } else {
                int i5 = this.s8;
                if (i5 < 0) {
                    this.s8 = (i5 % (((int) this.o) * this.f3134f.size())) + (((int) this.o) * this.f3134f.size());
                }
            }
            float f3 = this.f3134f.get(0).f3161v + this.s8;
            int iAbs = (int) Math.abs(f3 / this.o);
            int i8 = (int) (f3 - (this.o * iAbs));
            synchronized (this.f3136g3) {
                while (i < this.f3136g3.length) {
                    try {
                        int size = iAbs + i;
                        if (size < 0) {
                            size += this.f3134f.size();
                        } else if (size >= this.f3134f.size()) {
                            size -= this.f3134f.size();
                        }
                        fb[] fbVarArr = this.f3136g3;
                        ArrayList<fb> arrayList = this.f3134f;
                        fbVarArr[i] = arrayList.get(size % arrayList.size());
                        this.f3136g3[i].v(((int) (this.o * ((i - size) % this.f3134f.size()))) - i8);
                        i++;
                    } finally {
                    }
                }
            }
        } else {
            float f4 = this.s8;
            float size2 = this.o * this.f3134f.size();
            int i10 = this.j;
            float f5 = this.o;
            if (f4 > (size2 - ((i10 / 2) * f5)) - f5) {
                float f7 = this.j / 2;
                float f8 = this.o;
                this.s8 = (int) (((f5 * this.f3134f.size()) - (f7 * f8)) - f8);
                Handler handler = this.f3131e;
                if (handler != null) {
                    handler.removeMessages(10010);
                    this.f3131e.sendEmptyMessage(10012);
                }
            } else if (this.s8 < ((-i10) / 2) * f5) {
                this.s8 = (int) (((-i10) / 2) * f5);
                Handler handler2 = this.f3131e;
                if (handler2 != null) {
                    handler2.removeMessages(10010);
                    this.f3131e.sendEmptyMessage(10012);
                }
            }
            float f9 = this.f3134f.get(0).f3161v + this.s8;
            float f10 = this.o;
            int i11 = (int) (f9 / f10);
            int i12 = (int) (f9 - (f10 * i11));
            synchronized (this.f3136g3) {
                while (i < this.f3136g3.length) {
                    try {
                        int i13 = i11 + i;
                        if (i13 < 0 || i13 >= this.f3134f.size()) {
                            i13 = -1;
                        }
                        if (i13 == -1) {
                            this.f3136g3[i] = null;
                        } else {
                            this.f3136g3[i] = this.f3134f.get(i13);
                            this.f3136g3[i].v(((int) (this.o * (i - i13))) - i12);
                        }
                        i++;
                    } finally {
                    }
                }
            }
        }
        if (!z || this.en == null || this.f3136g3[this.j / 2] == null) {
            return;
        }
        this.f3153yc.post(new gv());
    }

    public final void x(Canvas canvas) {
        if (this.f3130d == null) {
            Paint paint = new Paint();
            this.f3130d = paint;
            paint.setColor(this.f3152x);
            this.f3130d.setAntiAlias(true);
            this.f3130d.setStrokeWidth(this.f3128b);
        }
        float f3 = this.f3151v;
        float f4 = this.o;
        float f5 = this.f3128b;
        canvas.drawLine(0.0f, ((f3 / 2.0f) - (f4 / 2.0f)) + f5, this.y, ((f3 / 2.0f) - (f4 / 2.0f)) + f5, this.f3130d);
        float f7 = this.f3151v;
        float f8 = this.o;
        float f9 = this.f3128b;
        canvas.drawLine(0.0f, ((f7 / 2.0f) + (f8 / 2.0f)) - f9, this.y, ((f7 / 2.0f) + (f8 / 2.0f)) - f9, this.f3130d);
    }

    public final void yt() {
        vl(true);
    }

    public final void z6(boolean z) {
        if (this.f3149t.size() < this.j + 2) {
            this.xg = false;
        } else {
            this.xg = z;
        }
    }
}
