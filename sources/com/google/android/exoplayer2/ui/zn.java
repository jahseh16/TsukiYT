package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.ui.v;
import ft.bv;
import ft.gi;
import ft.im;
import ft.n7;
import ft.qj;
import ft.rb;
import ft.uo;
import ft.xb;
import ft.xc;
import ft.xq;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.z6;
import v0.ud;
import v0.ut;
import w0.mg;

/* JADX INFO: loaded from: classes.dex */
public class zn extends FrameLayout {

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public long f2037ap;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f2038b;

    @Nullable
    public final com.google.android.exoplayer2.ui.v c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public final ImageView f2039co;
    public boolean ct;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xq.n3 f2040d;
    public final StringBuilder d0;
    public boolean dm;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2041e;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public int f2042eb;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final xq.gv f2043ej;
    public final String en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final View f2044f;

    @Nullable
    public final TextView f3;
    public final float f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final View f2045fb;
    public final Formatter fh;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f2046g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public long f2047g3;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public final Drawable f2048hw;
    public final String j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public final Drawable f2049j5;
    public final String jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f2050k;

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    public long[] f2051kp;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public boolean f2052lc;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2053m;

    @Nullable
    public final TextView n;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public boolean f2054nf;
    public final String o;
    public int o4;
    public final String oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final View f2055p;
    public final Drawable q9;
    public final Drawable qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final View f2056r;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f2057ra;

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public boolean[] f2058rb;
    public int rs;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final View f2059s;
    public boolean s8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final View f2060t;

    @Nullable
    public im u;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public final Drawable f2061ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArrayList<v> f2062v;

    @Nullable
    public final View w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Runnable f2063x;
    public boolean xg;
    public final ViewOnClickListenerC0060zn y;
    public boolean y5;

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public boolean[] f2064yc;

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public long[] f2065yg;

    @Nullable
    public final ImageView z;

    public interface gv {
    }

    public static final class n3 {
        public static boolean y(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public interface v {
        void y(int i);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.zn$zn, reason: collision with other inner class name */
    public final class ViewOnClickListenerC0060zn implements im.gv, v.y, View.OnClickListener {
        public ViewOnClickListenerC0060zn() {
        }

        @Override // com.google.android.exoplayer2.ui.v.y
        public void a(com.google.android.exoplayer2.ui.v vVar, long j) {
            zn.this.ct = true;
            if (zn.this.n != null) {
                zn.this.n.setText(ut.eb(zn.this.d0, zn.this.fh, j));
            }
        }

        @Override // ft.im.gv
        public /* synthetic */ void onAvailableCommandsChanged(im.n3 n3Var) {
            n7.zn(this, n3Var);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            im imVar = zn.this.u;
            if (imVar == null) {
                return;
            }
            if (zn.this.f2059s == view) {
                imVar.j5();
                return;
            }
            if (zn.this.f2045fb == view) {
                imVar.n();
                return;
            }
            if (zn.this.w == view) {
                if (imVar.n3() != 4) {
                    imVar.y4();
                    return;
                }
                return;
            }
            if (zn.this.f2055p == view) {
                imVar.tg();
                return;
            }
            if (zn.this.f2044f == view) {
                zn.this.rz(imVar);
                return;
            }
            if (zn.this.f2060t == view) {
                zn.this.fh(imVar);
            } else if (zn.this.f2039co == view) {
                imVar.gv(ud.y(imVar.c5(), zn.this.f2042eb));
            } else if (zn.this.z == view) {
                imVar.f7(!imVar.u0());
            }
        }

        @Override // ft.im.gv
        public /* synthetic */ void onCues(b0.a aVar) {
            n7.gv(this, aVar);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onDeviceInfoChanged(xc xcVar) {
            n7.a(this, xcVar);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            n7.fb(this, i, z);
        }

        @Override // ft.im.gv
        public void onEvents(im imVar, im.zn znVar) {
            if (znVar.n3(4, 5)) {
                zn.this.j();
            }
            if (znVar.n3(4, 5, 7)) {
                zn.this.oz();
            }
            if (znVar.y(8)) {
                zn.this.ut();
            }
            if (znVar.y(9)) {
                zn.this.q9();
            }
            if (znVar.n3(8, 9, 11, 0, 13)) {
                zn.this.o();
            }
            if (znVar.n3(11, 0)) {
                zn.this.k();
            }
        }

        @Override // ft.im.gv
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            n7.c5(this, z);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            n7.i9(this, z);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onLoadingChanged(boolean z) {
            n7.f(this, z);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onMediaItemTransition(xb xbVar, int i) {
            n7.tl(this, xbVar, i);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onMediaMetadataChanged(qj qjVar) {
            n7.wz(this, qjVar);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onMetadata(Metadata metadata) {
            n7.xc(this, metadata);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            n7.w(this, z, i);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onPlaybackParametersChanged(uo uoVar) {
            n7.p(this, uoVar);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onPlaybackStateChanged(int i) {
            n7.mt(this, i);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            n7.co(this, i);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onPlayerError(bv bvVar) {
            n7.z(this, bvVar);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onPlayerErrorChanged(bv bvVar) {
            n7.r(this, bvVar);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            n7.x4(this, z, i);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            n7.f3(this, i);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onRenderedFirstFrame() {
            n7.c(this);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onRepeatModeChanged(int i) {
            n7.d0(this, i);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onSeekProcessed() {
            n7.mg(this);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            n7.ta(this, z);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            n7.d(this, z);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onSurfaceSizeChanged(int i, int i5) {
            n7.z6(this, i, i5);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onTimelineChanged(xq xqVar, int i) {
            n7.ej(this, xqVar, i);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onTrackSelectionParametersChanged(z6 z6Var) {
            n7.ud(this, z6Var);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onTracksChanged(gi giVar) {
            n7.a8(this, giVar);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onVideoSizeChanged(mg mgVar) {
            n7.x(this, mgVar);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onVolumeChanged(float f3) {
            n7.b(this, f3);
        }

        @Override // com.google.android.exoplayer2.ui.v.y
        public void y(com.google.android.exoplayer2.ui.v vVar, long j) {
            if (zn.this.n != null) {
                zn.this.n.setText(ut.eb(zn.this.d0, zn.this.fh, j));
            }
        }

        @Override // com.google.android.exoplayer2.ui.v.y
        public void zn(com.google.android.exoplayer2.ui.v vVar, long j, boolean z) {
            zn.this.ct = false;
            if (z || zn.this.u == null) {
                return;
            }
            zn znVar = zn.this;
            znVar.yt(znVar.u, j);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onCues(List list) {
            n7.v(this, list);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onPositionDiscontinuity(im.v vVar, im.v vVar2, int i) {
            n7.n(this, vVar, vVar2, i);
        }
    }

    static {
        rb.y("goog.exo.ui");
    }

    public zn(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = R$layout.n3;
        this.o4 = 5000;
        this.f2042eb = 0;
        this.rs = 200;
        this.f2037ap = -9223372036854775807L;
        this.f2052lc = true;
        this.f2054nf = true;
        this.f2057ra = true;
        this.f2041e = true;
        this.s8 = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R$styleable.f3, i, 0);
            try {
                this.o4 = typedArrayObtainStyledAttributes.getInt(R$styleable.f1964d, this.o4);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.n, resourceId);
                this.f2042eb = ta(typedArrayObtainStyledAttributes, this.f2042eb);
                this.f2052lc = typedArrayObtainStyledAttributes.getBoolean(R$styleable.mg, this.f2052lc);
                this.f2054nf = typedArrayObtainStyledAttributes.getBoolean(R$styleable.d0, this.f2054nf);
                this.f2057ra = typedArrayObtainStyledAttributes.getBoolean(R$styleable.rz, this.f2057ra);
                this.f2041e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.fh, this.f2041e);
                this.s8 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f1980ta, this.s8);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R$styleable.f1990z6, this.rs));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f2062v = new CopyOnWriteArrayList<>();
        this.f2040d = new xq.n3();
        this.f2043ej = new xq.gv();
        StringBuilder sb = new StringBuilder();
        this.d0 = sb;
        this.fh = new Formatter(sb, Locale.getDefault());
        this.f2065yg = new long[0];
        this.f2064yc = new boolean[0];
        this.f2051kp = new long[0];
        this.f2058rb = new boolean[0];
        ViewOnClickListenerC0060zn viewOnClickListenerC0060zn = new ViewOnClickListenerC0060zn();
        this.y = viewOnClickListenerC0060zn;
        this.f2063x = new Runnable() { // from class: q0.s
            @Override // java.lang.Runnable
            public final void run() {
                this.y.oz();
            }
        };
        this.f2038b = new Runnable() { // from class: q0.c5
            @Override // java.lang.Runnable
            public final void run() {
                this.y.d();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        com.google.android.exoplayer2.ui.v vVar = (com.google.android.exoplayer2.ui.v) findViewById(R$id.w);
        View viewFindViewById = findViewById(R$id.f1932p);
        if (vVar != null) {
            this.c = vVar;
        } else if (viewFindViewById != null) {
            com.google.android.exoplayer2.ui.n3 n3Var = new com.google.android.exoplayer2.ui.n3(context, null, 0, attributeSet2);
            n3Var.setId(R$id.w);
            n3Var.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(n3Var, iIndexOfChild);
            this.c = n3Var;
        } else {
            this.c = null;
        }
        this.f3 = (TextView) findViewById(R$id.f1927fb);
        this.n = (TextView) findViewById(R$id.f1938wz);
        com.google.android.exoplayer2.ui.v vVar2 = this.c;
        if (vVar2 != null) {
            vVar2.y(viewOnClickListenerC0060zn);
        }
        View viewFindViewById2 = findViewById(R$id.f1936tl);
        this.f2044f = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC0060zn);
        }
        View viewFindViewById3 = findViewById(R$id.f1935t);
        this.f2060t = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC0060zn);
        }
        View viewFindViewById4 = findViewById(R$id.f1940xc);
        this.f2045fb = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC0060zn);
        }
        View viewFindViewById5 = findViewById(R$id.f1930i9);
        this.f2059s = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC0060zn);
        }
        View viewFindViewById6 = findViewById(R$id.f1925co);
        this.f2055p = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC0060zn);
        }
        View viewFindViewById7 = findViewById(R$id.f1924c5);
        this.w = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC0060zn);
        }
        ImageView imageView = (ImageView) findViewById(R$id.f1931mt);
        this.f2039co = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC0060zn);
        }
        ImageView imageView2 = (ImageView) findViewById(R$id.z);
        this.z = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC0060zn);
        }
        View viewFindViewById8 = findViewById(R$id.f1929i4);
        this.f2056r = viewFindViewById8;
        setShowVrButton(false);
        qn(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.f2050k = resources.getInteger(R$integer.n3) / 100.0f;
        this.f7 = resources.getInteger(R$integer.y) / 100.0f;
        this.f2048hw = ut.ut(context, resources, R$drawable.zn);
        this.f2049j5 = ut.ut(context, resources, R$drawable.f1913gv);
        this.qn = ut.ut(context, resources, R$drawable.n3);
        this.f2061ut = ut.ut(context, resources, R$drawable.f1912fb);
        this.q9 = ut.ut(context, resources, R$drawable.f1909a);
        this.o = resources.getString(R$string.f1952s);
        this.j = resources.getString(R$string.f1942c5);
        this.oz = resources.getString(R$string.f1945fb);
        this.en = resources.getString(R$string.f1954tl);
        this.jz = resources.getString(R$string.f1953t);
        this.f2053m = -9223372036854775807L;
        this.f2046g = -9223372036854775807L;
    }

    public static boolean c(xq xqVar, xq.gv gvVar) {
        if (xqVar.z() > 100) {
            return false;
        }
        int iZ = xqVar.z();
        for (int i = 0; i < iZ; i++) {
            if (xqVar.mt(i, gvVar).c == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    @SuppressLint({"InlinedApi"})
    public static boolean ej(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    public static int ta(TypedArray typedArray, int i) {
        return typedArray.getInt(R$styleable.c, i);
    }

    public void a8(v vVar) {
        this.f2062v.remove(vVar);
    }

    public final void b() {
        View view;
        View view2;
        boolean zVl = vl();
        if (!zVl && (view2 = this.f2044f) != null) {
            view2.requestFocus();
        } else {
            if (!zVl || (view = this.f2060t) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    public void d() {
        if (ud()) {
            setVisibility(8);
            Iterator<v> it = this.f2062v.iterator();
            while (it.hasNext()) {
                it.next().y(getVisibility());
            }
            removeCallbacks(this.f2063x);
            removeCallbacks(this.f2038b);
            this.f2037ap = -9223372036854775807L;
        }
    }

    public boolean d0(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        im imVar = this.u;
        if (imVar == null || !ej(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (imVar.n3() == 4) {
                return true;
            }
            imVar.y4();
            return true;
        }
        if (keyCode == 89) {
            imVar.tg();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            mg(imVar);
            return true;
        }
        if (keyCode == 87) {
            imVar.j5();
            return true;
        }
        if (keyCode == 88) {
            imVar.n();
            return true;
        }
        if (keyCode == 126) {
            rz(imVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        fh(imVar);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return d0(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f2038b);
        } else if (motionEvent.getAction() == 1) {
            z6();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void fh(im imVar) {
        imVar.pause();
    }

    @Nullable
    public im getPlayer() {
        return this.u;
    }

    public int getRepeatToggleModes() {
        return this.f2042eb;
    }

    public boolean getShowShuffleButton() {
        return this.s8;
    }

    public int getShowTimeoutMs() {
        return this.o4;
    }

    public boolean getShowVrButton() {
        View view = this.f2056r;
        return view != null && view.getVisibility() == 0;
    }

    public void hw() {
        if (!ud()) {
            setVisibility(0);
            Iterator<v> it = this.f2062v.iterator();
            while (it.hasNext()) {
                it.next().y(getVisibility());
            }
            j5();
            b();
            x();
        }
        z6();
    }

    public final void j() {
        boolean z;
        boolean z5;
        if (ud() && this.y5) {
            boolean zVl = vl();
            View view = this.f2044f;
            boolean z7 = true;
            if (view != null) {
                z = zVl && view.isFocused();
                z5 = ut.y < 21 ? z : zVl && n3.y(this.f2044f);
                this.f2044f.setVisibility(zVl ? 8 : 0);
            } else {
                z = false;
                z5 = false;
            }
            View view2 = this.f2060t;
            if (view2 != null) {
                z |= !zVl && view2.isFocused();
                if (ut.y < 21) {
                    z7 = z;
                } else if (zVl || !n3.y(this.f2060t)) {
                    z7 = false;
                }
                z5 |= z7;
                this.f2060t.setVisibility(zVl ? 0 : 8);
            }
            if (z) {
                b();
            }
            if (z5) {
                x();
            }
        }
    }

    public final void j5() {
        j();
        o();
        ut();
        q9();
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.zn.k():void");
    }

    public final void k5(im imVar, int i, long j) {
        imVar.ut(i, j);
    }

    public final void mg(im imVar) {
        int iN3 = imVar.n3();
        if (iN3 == 1 || iN3 == 4 || !imVar.k()) {
            rz(imVar);
        } else {
            fh(imVar);
        }
    }

    public void n(v vVar) {
        v0.y.v(vVar);
        this.f2062v.add(vVar);
    }

    public final void o() {
        boolean zUd;
        boolean zUd2;
        boolean zUd3;
        boolean zUd4;
        boolean zUd5;
        if (ud() && this.y5) {
            im imVar = this.u;
            if (imVar != null) {
                zUd = imVar.ud(5);
                zUd3 = imVar.ud(7);
                zUd4 = imVar.ud(11);
                zUd5 = imVar.ud(12);
                zUd2 = imVar.ud(9);
            } else {
                zUd = false;
                zUd2 = false;
                zUd3 = false;
                zUd4 = false;
                zUd5 = false;
            }
            qn(this.f2057ra, zUd3, this.f2045fb);
            qn(this.f2052lc, zUd4, this.f2055p);
            qn(this.f2054nf, zUd5, this.w);
            qn(this.f2041e, zUd2, this.f2059s);
            com.google.android.exoplayer2.ui.v vVar = this.c;
            if (vVar != null) {
                vVar.setEnabled(zUd);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y5 = true;
        long j = this.f2037ap;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                d();
            } else {
                postDelayed(this.f2038b, jUptimeMillis);
            }
        } else if (ud()) {
            z6();
        }
        j5();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y5 = false;
        removeCallbacks(this.f2063x);
        removeCallbacks(this.f2038b);
    }

    public final void oz() {
        long jAp;
        long jBk;
        if (ud() && this.y5) {
            im imVar = this.u;
            if (imVar != null) {
                jAp = this.f2047g3 + imVar.ap();
                jBk = this.f2047g3 + imVar.bk();
            } else {
                jAp = 0;
                jBk = 0;
            }
            boolean z = jAp != this.f2053m;
            this.f2053m = jAp;
            this.f2046g = jBk;
            TextView textView = this.n;
            if (textView != null && !this.ct && z) {
                textView.setText(ut.eb(this.d0, this.fh, jAp));
            }
            com.google.android.exoplayer2.ui.v vVar = this.c;
            if (vVar != null) {
                vVar.setPosition(jAp);
                this.c.setBufferedPosition(jBk);
            }
            removeCallbacks(this.f2063x);
            int iN3 = imVar == null ? 1 : imVar.n3();
            if (imVar == null || !imVar.isPlaying()) {
                if (iN3 == 4 || iN3 == 1) {
                    return;
                }
                postDelayed(this.f2063x, 1000L);
                return;
            }
            com.google.android.exoplayer2.ui.v vVar2 = this.c;
            long jMin = Math.min(vVar2 != null ? vVar2.getPreferredUpdateDelay() : 1000L, 1000 - (jAp % 1000));
            float f3 = imVar.v().y;
            postDelayed(this.f2063x, ut.mt(f3 > 0.0f ? (long) (jMin / f3) : 1000L, this.rs, 1000L));
        }
    }

    public final void q9() {
        ImageView imageView;
        if (ud() && this.y5 && (imageView = this.z) != null) {
            im imVar = this.u;
            if (!this.s8) {
                qn(false, false, imageView);
                return;
            }
            if (imVar == null) {
                qn(true, false, imageView);
                this.z.setImageDrawable(this.q9);
                this.z.setContentDescription(this.jz);
            } else {
                qn(true, true, imageView);
                this.z.setImageDrawable(imVar.u0() ? this.f2061ut : this.q9);
                this.z.setContentDescription(imVar.u0() ? this.en : this.jz);
            }
        }
    }

    public final void qn(boolean z, boolean z5, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z5);
        view.setAlpha(z5 ? this.f2050k : this.f7);
        view.setVisibility(z ? 0 : 8);
    }

    public final void rz(im imVar) {
        int iN3 = imVar.n3();
        if (iN3 == 1) {
            imVar.prepare();
        } else if (iN3 == 4) {
            k5(imVar, imVar.g3(), -9223372036854775807L);
        }
        imVar.play();
    }

    public void setPlayer(@Nullable im imVar) {
        v0.y.fb(Looper.myLooper() == Looper.getMainLooper());
        v0.y.y(imVar == null || imVar.vl() == Looper.getMainLooper());
        im imVar2 = this.u;
        if (imVar2 == imVar) {
            return;
        }
        if (imVar2 != null) {
            imVar2.kp(this.y);
        }
        this.u = imVar;
        if (imVar != null) {
            imVar.f(this.y);
        }
        j5();
    }

    public void setProgressUpdateListener(@Nullable gv gvVar) {
    }

    public void setRepeatToggleModes(int i) {
        this.f2042eb = i;
        im imVar = this.u;
        if (imVar != null) {
            int iC5 = imVar.c5();
            if (i == 0 && iC5 != 0) {
                this.u.gv(0);
            } else if (i == 1 && iC5 == 2) {
                this.u.gv(1);
            } else if (i == 2 && iC5 == 1) {
                this.u.gv(2);
            }
        }
        ut();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f2054nf = z;
        o();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.xg = z;
        k();
    }

    public void setShowNextButton(boolean z) {
        this.f2041e = z;
        o();
    }

    public void setShowPreviousButton(boolean z) {
        this.f2057ra = z;
        o();
    }

    public void setShowRewindButton(boolean z) {
        this.f2052lc = z;
        o();
    }

    public void setShowShuffleButton(boolean z) {
        this.s8 = z;
        q9();
    }

    public void setShowTimeoutMs(int i) {
        this.o4 = i;
        if (ud()) {
            z6();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f2056r;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.rs = ut.p(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f2056r;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            qn(getShowVrButton(), onClickListener != null, this.f2056r);
        }
    }

    public boolean ud() {
        return getVisibility() == 0;
    }

    public final void ut() {
        ImageView imageView;
        if (ud() && this.y5 && (imageView = this.f2039co) != null) {
            if (this.f2042eb == 0) {
                qn(false, false, imageView);
                return;
            }
            im imVar = this.u;
            if (imVar == null) {
                qn(true, false, imageView);
                this.f2039co.setImageDrawable(this.f2048hw);
                this.f2039co.setContentDescription(this.o);
                return;
            }
            qn(true, true, imageView);
            int iC5 = imVar.c5();
            if (iC5 == 0) {
                this.f2039co.setImageDrawable(this.f2048hw);
                this.f2039co.setContentDescription(this.o);
            } else if (iC5 == 1) {
                this.f2039co.setImageDrawable(this.f2049j5);
                this.f2039co.setContentDescription(this.j);
            } else if (iC5 == 2) {
                this.f2039co.setImageDrawable(this.qn);
                this.f2039co.setContentDescription(this.oz);
            }
            this.f2039co.setVisibility(0);
        }
    }

    public final boolean vl() {
        im imVar = this.u;
        return (imVar == null || imVar.n3() == 4 || this.u.n3() == 1 || !this.u.k()) ? false : true;
    }

    public final void x() {
        View view;
        View view2;
        boolean zVl = vl();
        if (!zVl && (view2 = this.f2044f) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!zVl || (view = this.f2060t) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    public final void yt(im imVar, long j) {
        int iG3;
        xq xqVarYt = imVar.yt();
        if (this.dm && !xqVarYt.r()) {
            int iZ = xqVarYt.z();
            iG3 = 0;
            while (true) {
                long jA = xqVarYt.mt(iG3, this.f2043ej).a();
                if (j < jA) {
                    break;
                }
                if (iG3 == iZ - 1) {
                    j = jA;
                    break;
                } else {
                    j -= jA;
                    iG3++;
                }
            }
        } else {
            iG3 = imVar.g3();
        }
        k5(imVar, iG3, j);
        oz();
    }

    public final void z6() {
        removeCallbacks(this.f2038b);
        if (this.o4 <= 0) {
            this.f2037ap = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = this.o4;
        this.f2037ap = jUptimeMillis + ((long) i);
        if (this.y5) {
            postDelayed(this.f2038b, i);
        }
    }
}
