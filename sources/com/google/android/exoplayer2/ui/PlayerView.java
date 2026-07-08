package com.google.android.exoplayer2.ui;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.zn;
import ft.bv;
import ft.gi;
import ft.im;
import ft.n7;
import ft.qj;
import ft.uo;
import ft.xb;
import ft.xc;
import ft.xq;
import hf.fb;
import java.util.ArrayList;
import java.util.List;
import k4.r;
import n0.z6;
import v0.t;
import v0.ut;
import w0.mg;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public CharSequence f1893b;
    public boolean c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public final TextView f1894co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Drawable f1895d;

    @Nullable
    public zn.v d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public int f1896ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1897f;

    @Nullable
    public final FrameLayout f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final View f1898fb;
    public boolean fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public int f1899hw;
    public int j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public boolean f1900j5;

    @Nullable
    public im n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final View f1901p;
    public boolean qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final FrameLayout f1902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final View f1903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final ImageView f1904t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final AspectRatioFrameLayout f1905v;

    @Nullable
    public final SubtitleView w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1906x;
    public final y y;

    @Nullable
    public final zn z;

    public final class y implements im.gv, View.OnLayoutChangeListener, View.OnClickListener, zn.v {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public Object f1908v;
        public final xq.n3 y = new xq.n3();

        public y() {
        }

        @Override // ft.im.gv
        public /* synthetic */ void onAvailableCommandsChanged(im.n3 n3Var) {
            n7.zn(this, n3Var);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.z6();
        }

        @Override // ft.im.gv
        public /* synthetic */ void onCues(List list) {
            n7.v(this, list);
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
        public /* synthetic */ void onEvents(im imVar, im.zn znVar) {
            n7.s(this, imVar, znVar);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            n7.c5(this, z);
        }

        @Override // ft.im.gv
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            n7.i9(this, z);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i5, int i8, int i10, int i11, int i12, int i13, int i14) {
            PlayerView.xc((TextureView) view, PlayerView.this.j);
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
        public void onPlayWhenReadyChanged(boolean z, int i) {
            PlayerView.this.ud();
            PlayerView.this.x();
        }

        @Override // ft.im.gv
        public /* synthetic */ void onPlaybackParametersChanged(uo uoVar) {
            n7.p(this, uoVar);
        }

        @Override // ft.im.gv
        public void onPlaybackStateChanged(int i) {
            PlayerView.this.ud();
            PlayerView.this.b();
            PlayerView.this.x();
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
        public void onRenderedFirstFrame() {
            if (PlayerView.this.f1898fb != null) {
                PlayerView.this.f1898fb.setVisibility(4);
            }
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
        public void onTracksChanged(gi giVar) {
            im imVar = (im) v0.y.v(PlayerView.this.n);
            xq xqVarYt = imVar.yt();
            if (xqVarYt.r()) {
                this.f1908v = null;
            } else if (imVar.fh().zn()) {
                Object obj = this.f1908v;
                if (obj != null) {
                    int iA = xqVarYt.a(obj);
                    if (iA != -1) {
                        if (imVar.g3() == xqVarYt.i9(iA, this.y).f5172fb) {
                            return;
                        }
                    }
                    this.f1908v = null;
                }
            } else {
                this.f1908v = xqVarYt.f(imVar.y5(), this.y, true).f5175v;
            }
            PlayerView.this.k5(false);
        }

        @Override // ft.im.gv
        public void onVideoSizeChanged(mg mgVar) {
            PlayerView.this.ej();
        }

        @Override // ft.im.gv
        public /* synthetic */ void onVolumeChanged(float f3) {
            n7.b(this, f3);
        }

        @Override // com.google.android.exoplayer2.ui.zn.v
        public void y(int i) {
            PlayerView.this.a8();
        }

        @Override // ft.im.gv
        public void onCues(b0.a aVar) {
            if (PlayerView.this.w != null) {
                PlayerView.this.w.setCues(aVar.y);
            }
        }

        @Override // ft.im.gv
        public void onPositionDiscontinuity(im.v vVar, im.v vVar2, int i) {
            if (PlayerView.this.i4() && PlayerView.this.qn) {
                PlayerView.this.r();
            }
        }
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    public static void d(im imVar, @Nullable PlayerView playerView, @Nullable PlayerView playerView2) {
        if (playerView == playerView2) {
            return;
        }
        if (playerView2 != null) {
            playerView2.setPlayer(imVar);
        }
        if (playerView != null) {
            playerView.setPlayer(null);
        }
    }

    public static void fh(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public static void mt(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(ut.ut(context, resources, R$drawable.f1917s));
        imageView.setBackgroundColor(fb.y(resources, R$color.y, (Resources.Theme) null));
    }

    public static void p(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(ut.ut(context, resources, R$drawable.f1917s));
        imageView.setBackgroundColor(resources.getColor(R$color.y));
    }

    public static void xc(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f3 = width / 2.0f;
            float f4 = height / 2.0f;
            matrix.postRotate(i, f3, f4);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f3, f4);
        }
        textureView.setTransform(matrix);
    }

    public final void a8() {
        zn znVar = this.z;
        if (znVar == null || !this.c) {
            setContentDescription(null);
        } else if (znVar.getVisibility() == 0) {
            setContentDescription(this.o ? getResources().getString(R$string.n3) : null);
        } else {
            setContentDescription(getResources().getString(R$string.f1944f));
        }
    }

    public final void b() {
        TextView textView = this.f1894co;
        if (textView != null) {
            CharSequence charSequence = this.f1893b;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f1894co.setVisibility(0);
            } else {
                im imVar = this.n;
                if (imVar != null) {
                    imVar.a();
                }
                this.f1894co.setVisibility(8);
            }
        }
    }

    public final boolean c(qj qjVar) {
        byte[] bArr = qjVar.z;
        if (bArr == null) {
            return false;
        }
        return d0(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public boolean co(KeyEvent keyEvent) {
        return vl() && this.z.d0(keyEvent);
    }

    public final boolean d0(@Nullable Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                n(this.f1905v, intrinsicWidth / intrinsicHeight);
                this.f1904t.setImageDrawable(drawable);
                this.f1904t.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        im imVar = this.n;
        if (imVar != null && imVar.i9()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zX4 = x4(keyEvent.getKeyCode());
        if (zX4 && vl() && !this.z.ud()) {
            f3(true);
            return true;
        }
        if (co(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            f3(true);
            return true;
        }
        if (zX4 && vl()) {
            f3(true);
        }
        return false;
    }

    public final void ej() {
        im imVar = this.n;
        mg mgVarDm = imVar != null ? imVar.dm() : mg.f8899f;
        int i = mgVarDm.y;
        int i5 = mgVarDm.f8904v;
        int i8 = mgVarDm.f8902fb;
        float f3 = (i5 == 0 || i == 0) ? 0.0f : (i * mgVarDm.f8903s) / i5;
        View view = this.f1903s;
        if (view instanceof TextureView) {
            if (f3 > 0.0f && (i8 == 90 || i8 == 270)) {
                f3 = 1.0f / f3;
            }
            if (this.j != 0) {
                view.removeOnLayoutChangeListener(this.y);
            }
            this.j = i8;
            if (i8 != 0) {
                this.f1903s.addOnLayoutChangeListener(this.y);
            }
            xc((TextureView) this.f1903s, this.j);
        }
        n(this.f1905v, this.f1897f ? 0.0f : f3);
    }

    public final void f3(boolean z) {
        if (!(i4() && this.qn) && vl()) {
            boolean z5 = this.z.ud() && this.z.getShowTimeoutMs() <= 0;
            boolean zRz = rz();
            if (z || z5 || zRz) {
                ta(zRz);
            }
        }
    }

    public List<q0.y> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f3;
        if (frameLayout != null) {
            arrayList.add(new q0.y(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        zn znVar = this.z;
        if (znVar != null) {
            arrayList.add(new q0.y(znVar, 1));
        }
        return r.rz(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) v0.y.i9(this.f1902r, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f1900j5;
    }

    public boolean getControllerHideOnTouch() {
        return this.o;
    }

    public int getControllerShowTimeoutMs() {
        return this.f1899hw;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f1895d;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f3;
    }

    @Nullable
    public im getPlayer() {
        return this.n;
    }

    public int getResizeMode() {
        v0.y.c5(this.f1905v);
        return this.f1905v.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.w;
    }

    public boolean getUseArtwork() {
        return this.fh;
    }

    public boolean getUseController() {
        return this.c;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f1903s;
    }

    public final boolean i4() {
        im imVar = this.n;
        return imVar != null && imVar.i9() && this.n.k();
    }

    public final void k5(boolean z) {
        im imVar = this.n;
        if (imVar == null || !imVar.ud(30) || imVar.fh().zn()) {
            if (this.f1906x) {
                return;
            }
            z();
            w();
            return;
        }
        if (z && !this.f1906x) {
            w();
        }
        if (imVar.fh().gv(2)) {
            z();
            return;
        }
        w();
        if (yt() && (c(imVar.pz()) || d0(this.f1895d))) {
            return;
        }
        z();
    }

    public void mg() {
        ta(rz());
    }

    public void n(@Nullable AspectRatioFrameLayout aspectRatioFrameLayout, float f3) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f3);
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!vl() || this.n == null) {
            return false;
        }
        f3(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        z6();
        return super.performClick();
    }

    public void r() {
        zn znVar = this.z;
        if (znVar != null) {
            znVar.d();
        }
    }

    public final boolean rz() {
        im imVar = this.n;
        if (imVar == null) {
            return true;
        }
        int iN3 = imVar.n3();
        return this.f1900j5 && (iN3 == 1 || iN3 == 4 || !this.n.k());
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.n3 n3Var) {
        v0.y.c5(this.f1905v);
        this.f1905v.setAspectRatioListener(n3Var);
    }

    public void setControllerAutoShow(boolean z) {
        this.f1900j5 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.qn = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        v0.y.c5(this.z);
        this.o = z;
        a8();
    }

    public void setControllerShowTimeoutMs(int i) {
        v0.y.c5(this.z);
        this.f1899hw = i;
        if (this.z.ud()) {
            mg();
        }
    }

    public void setControllerVisibilityListener(@Nullable zn.v vVar) {
        v0.y.c5(this.z);
        zn.v vVar2 = this.d0;
        if (vVar2 == vVar) {
            return;
        }
        if (vVar2 != null) {
            this.z.a8(vVar2);
        }
        this.d0 = vVar;
        if (vVar != null) {
            this.z.n(vVar);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        v0.y.fb(this.f1894co != null);
        this.f1893b = charSequence;
        b();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f1895d != drawable) {
            this.f1895d = drawable;
            k5(false);
        }
    }

    public void setErrorMessageProvider(@Nullable t<? super bv> tVar) {
        if (tVar != null) {
            b();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f1906x != z) {
            this.f1906x = z;
            k5(false);
        }
    }

    public void setPlayer(@Nullable im imVar) {
        v0.y.fb(Looper.myLooper() == Looper.getMainLooper());
        v0.y.y(imVar == null || imVar.vl() == Looper.getMainLooper());
        im imVar2 = this.n;
        if (imVar2 == imVar) {
            return;
        }
        if (imVar2 != null) {
            imVar2.kp(this.y);
            if (imVar2.ud(27)) {
                View view = this.f1903s;
                if (view instanceof TextureView) {
                    imVar2.xg((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    imVar2.m((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.w;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.n = imVar;
        if (vl()) {
            this.z.setPlayer(imVar);
        }
        ud();
        b();
        k5(true);
        if (imVar == null) {
            r();
            return;
        }
        if (imVar.ud(27)) {
            View view2 = this.f1903s;
            if (view2 instanceof TextureView) {
                imVar.qn((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                imVar.co((SurfaceView) view2);
            }
            ej();
        }
        if (this.w != null && imVar.ud(28)) {
            this.w.setCues(imVar.d().y);
        }
        imVar.f(this.y);
        f3(false);
    }

    public void setRepeatToggleModes(int i) {
        v0.y.c5(this.z);
        this.z.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        v0.y.c5(this.f1905v);
        this.f1905v.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.f1896ej != i) {
            this.f1896ej = i;
            ud();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        v0.y.c5(this.z);
        this.z.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        v0.y.c5(this.z);
        this.z.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        v0.y.c5(this.z);
        this.z.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        v0.y.c5(this.z);
        this.z.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        v0.y.c5(this.z);
        this.z.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        v0.y.c5(this.z);
        this.z.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f1898fb;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        v0.y.fb((z && this.f1904t == null) ? false : true);
        if (this.fh != z) {
            this.fh = z;
            k5(false);
        }
    }

    public void setUseController(boolean z) {
        boolean z5 = true;
        v0.y.fb((z && this.z == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z5 = false;
        }
        setClickable(z5);
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (vl()) {
            this.z.setPlayer(this.n);
        } else {
            zn znVar = this.z;
            if (znVar != null) {
                znVar.d();
                this.z.setPlayer(null);
            }
        }
        a8();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f1903s;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public final void ta(boolean z) {
        if (vl()) {
            this.z.setShowTimeoutMs(z ? 0 : this.f1899hw);
            this.z.hw();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ud() {
        /*
            r4 = this;
            android.view.View r0 = r4.f1901p
            if (r0 == 0) goto L2b
            ft.im r0 = r4.n
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.n3()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f1896ej
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            ft.im r0 = r4.n
            boolean r0 = r0.k()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = 0
        L21:
            android.view.View r0 = r4.f1901p
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.ud():void");
    }

    public final boolean vl() {
        if (!this.c) {
            return false;
        }
        v0.y.c5(this.z);
        return true;
    }

    public final void w() {
        View view = this.f1898fb;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void x() {
        if (i4() && this.qn) {
            r();
        } else {
            f3(false);
        }
    }

    @SuppressLint({"InlinedApi"})
    public final boolean x4(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    public final boolean yt() {
        if (!this.fh) {
            return false;
        }
        v0.y.c5(this.f1904t);
        return true;
    }

    public final void z() {
        ImageView imageView = this.f1904t;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f1904t.setVisibility(4);
        }
    }

    public final void z6() {
        if (!vl() || this.n == null) {
            return;
        }
        if (!this.z.ud()) {
            f3(true);
        } else if (this.o) {
            this.z.d();
        }
    }

    public PlayerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        int i5;
        int i8;
        boolean z;
        boolean z5;
        int i10;
        boolean z7;
        int i11;
        boolean z8;
        int i12;
        boolean z9;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        super(context, attributeSet, i);
        y yVar = new y();
        this.y = yVar;
        if (isInEditMode()) {
            this.f1905v = null;
            this.f1898fb = null;
            this.f1903s = null;
            this.f1897f = false;
            this.f1904t = null;
            this.w = null;
            this.f1901p = null;
            this.f1894co = null;
            this.z = null;
            this.f1902r = null;
            this.f3 = null;
            ImageView imageView = new ImageView(context);
            if (ut.y >= 23) {
                mt(context, getResources(), imageView);
            } else {
                p(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i14 = R$layout.zn;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.f1965ej, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.qn);
                int color = typedArrayObtainStyledAttributes.getColor(R$styleable.qn, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f1989yt, i14);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.j, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f1960a8, 0);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.oz, true);
                int i15 = typedArrayObtainStyledAttributes.getInt(R$styleable.o, 1);
                int i16 = typedArrayObtainStyledAttributes.getInt(R$styleable.vl, 0);
                int i17 = typedArrayObtainStyledAttributes.getInt(R$styleable.f1972j5, 5000);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f1961b, true);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f1982ud, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.f1969hw, 0);
                this.f1906x = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f1974k5, this.f1906x);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f1986x, true);
                typedArrayObtainStyledAttributes.recycle();
                i14 = resourceId;
                z7 = z15;
                i5 = i17;
                z5 = z17;
                i10 = i16;
                z = z16;
                i8 = integer;
                z10 = z14;
                i13 = resourceId2;
                z9 = z13;
                i12 = color;
                z8 = zHasValue;
                i11 = i15;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i5 = 5000;
            i8 = 0;
            z = true;
            z5 = true;
            i10 = 0;
            z7 = true;
            i11 = 1;
            z8 = false;
            i12 = 0;
            z9 = true;
            i13 = 0;
            z10 = true;
        }
        LayoutInflater.from(context).inflate(i14, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R$id.f1928gv);
        this.f1905v = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            fh(aspectRatioFrameLayout, i10);
        }
        View viewFindViewById = findViewById(R$id.f1933r);
        this.f1898fb = viewFindViewById;
        if (viewFindViewById != null && z8) {
            viewFindViewById.setBackgroundColor(i12);
        }
        if (aspectRatioFrameLayout != null && i11 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i11 == 2) {
                this.f1903s = new TextureView(context);
            } else if (i11 == 3) {
                try {
                    int i18 = z0.t.n;
                    this.f1903s = (View) z0.t.class.getConstructor(Context.class).newInstance(context);
                    z12 = true;
                    this.f1903s.setLayoutParams(layoutParams);
                    this.f1903s.setOnClickListener(yVar);
                    this.f1903s.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f1903s, 0);
                    z11 = z12;
                } catch (Exception e4) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e4);
                }
            } else if (i11 != 4) {
                this.f1903s = new SurfaceView(context);
            } else {
                try {
                    this.f1903s = (View) Class.forName("w0.t").getConstructor(Context.class).newInstance(context);
                } catch (Exception e5) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e5);
                }
            }
            z12 = false;
            this.f1903s.setLayoutParams(layoutParams);
            this.f1903s.setOnClickListener(yVar);
            this.f1903s.setClickable(false);
            aspectRatioFrameLayout.addView(this.f1903s, 0);
            z11 = z12;
        } else {
            this.f1903s = null;
            z11 = false;
        }
        this.f1897f = z11;
        this.f1902r = (FrameLayout) findViewById(R$id.y);
        this.f3 = (FrameLayout) findViewById(R$id.f1926f);
        ImageView imageView2 = (ImageView) findViewById(R$id.n3);
        this.f1904t = imageView2;
        this.fh = z9 && imageView2 != null;
        if (i13 != 0) {
            this.f1895d = d.y.getDrawable(getContext(), i13);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R$id.f1939x4);
        this.w = subtitleView;
        if (subtitleView != null) {
            subtitleView.v();
            subtitleView.a();
        }
        View viewFindViewById2 = findViewById(R$id.zn);
        this.f1901p = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f1896ej = i8;
        TextView textView = (TextView) findViewById(R$id.f1934s);
        this.f1894co = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        zn znVar = (zn) findViewById(R$id.f1937v);
        View viewFindViewById3 = findViewById(R$id.f1923a);
        if (znVar != null) {
            this.z = znVar;
        } else if (viewFindViewById3 != null) {
            zn znVar2 = new zn(context, null, 0, attributeSet);
            this.z = znVar2;
            znVar2.setId(R$id.f1937v);
            znVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(znVar2, iIndexOfChild);
        } else {
            this.z = null;
        }
        zn znVar3 = this.z;
        this.f1899hw = znVar3 != null ? i5 : 0;
        this.o = z7;
        this.f1900j5 = z;
        this.qn = z5;
        this.c = z10 && znVar3 != null;
        if (znVar3 != null) {
            znVar3.d();
            this.z.n(yVar);
        }
        if (z10) {
            setClickable(true);
        }
        a8();
    }
}
