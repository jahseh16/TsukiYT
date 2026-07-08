package gk;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n0.z6;
import v0.ut;
import w0.mg;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public static final MediaMetadataCompat f5221mt;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v[] f5222a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public im f5223c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Bundle f5224f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Map<String, v> f5225fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final ArrayList<zn> f5226gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public Pair<Integer, CharSequence> f5227i9;
    public final Looper n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5228p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public s f5229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public f f5230t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f5231tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList<zn> f5232v;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f5233wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public boolean f5234xc;
    public final MediaSessionCompat y;
    public final gv zn;

    public static final class a implements s {
        public final String n3;
        public final MediaControllerCompat y;

        public a(MediaControllerCompat mediaControllerCompat, @Nullable String str) {
            this.y = mediaControllerCompat;
            this.n3 = str == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : str;
        }

        @Override // gk.y.s
        public /* synthetic */ boolean n3(MediaMetadataCompat mediaMetadataCompat, MediaMetadataCompat mediaMetadataCompat2) {
            return gk.n3.y(this, mediaMetadataCompat, mediaMetadataCompat2);
        }

        @Override // gk.y.s
        public MediaMetadataCompat y(im imVar) {
            if (imVar.yt().r()) {
                return y.f5221mt;
            }
            MediaMetadataCompat.n3 n3Var = new MediaMetadataCompat.n3();
            if (imVar.i9()) {
                n3Var.zn("android.media.metadata.ADVERTISEMENT", 1L);
            }
            n3Var.zn("android.media.metadata.DURATION", (imVar.b() || imVar.getDuration() == -9223372036854775807L) ? -1L : imVar.getDuration());
            long jZn = this.y.zn().zn();
            if (jZn != -1) {
                List<MediaSessionCompat.QueueItem> listGv = this.y.gv();
                int i = 0;
                while (true) {
                    if (listGv == null || i >= listGv.size()) {
                        break;
                    }
                    MediaSessionCompat.QueueItem queueItem = listGv.get(i);
                    if (queueItem.gv() == jZn) {
                        MediaDescriptionCompat mediaDescriptionCompatZn = queueItem.zn();
                        Bundle bundleZn = mediaDescriptionCompatZn.zn();
                        if (bundleZn != null) {
                            for (String str : bundleZn.keySet()) {
                                Object obj = bundleZn.get(str);
                                if (obj instanceof String) {
                                    n3Var.v(this.n3 + str, (String) obj);
                                } else if (obj instanceof CharSequence) {
                                    n3Var.a(this.n3 + str, (CharSequence) obj);
                                } else if (obj instanceof Long) {
                                    n3Var.zn(this.n3 + str, ((Long) obj).longValue());
                                } else if (obj instanceof Integer) {
                                    n3Var.zn(this.n3 + str, ((Integer) obj).intValue());
                                } else if (obj instanceof Bitmap) {
                                    n3Var.n3(this.n3 + str, (Bitmap) obj);
                                } else if (obj instanceof RatingCompat) {
                                    n3Var.gv(this.n3 + str, (RatingCompat) obj);
                                }
                            }
                        }
                        CharSequence charSequenceF = mediaDescriptionCompatZn.f();
                        if (charSequenceF != null) {
                            String strValueOf = String.valueOf(charSequenceF);
                            n3Var.v("android.media.metadata.TITLE", strValueOf);
                            n3Var.v("android.media.metadata.DISPLAY_TITLE", strValueOf);
                        }
                        CharSequence charSequenceI9 = mediaDescriptionCompatZn.i9();
                        if (charSequenceI9 != null) {
                            n3Var.v("android.media.metadata.DISPLAY_SUBTITLE", String.valueOf(charSequenceI9));
                        }
                        CharSequence charSequenceN3 = mediaDescriptionCompatZn.n3();
                        if (charSequenceN3 != null) {
                            n3Var.v("android.media.metadata.DISPLAY_DESCRIPTION", String.valueOf(charSequenceN3));
                        }
                        Bitmap bitmapGv = mediaDescriptionCompatZn.gv();
                        if (bitmapGv != null) {
                            n3Var.n3("android.media.metadata.DISPLAY_ICON", bitmapGv);
                        }
                        Uri uriV = mediaDescriptionCompatZn.v();
                        if (uriV != null) {
                            n3Var.v("android.media.metadata.DISPLAY_ICON_URI", String.valueOf(uriV));
                        }
                        String strS = mediaDescriptionCompatZn.s();
                        if (strS != null) {
                            n3Var.v("android.media.metadata.MEDIA_ID", strS);
                        }
                        Uri uriC5 = mediaDescriptionCompatZn.c5();
                        if (uriC5 != null) {
                            n3Var.v("android.media.metadata.MEDIA_URI", String.valueOf(uriC5));
                        }
                    } else {
                        i++;
                    }
                }
            }
            return n3Var.y();
        }
    }

    public interface c5 extends zn {
    }

    public interface f extends zn {
        void a(im imVar);

        void fb(im imVar);

        void gv(im imVar);

        long n3(im imVar);

        void s(im imVar, long j);

        long v(@Nullable im imVar);

        void zn(im imVar);
    }

    public interface fb {
    }

    public class gv extends MediaSessionCompat.n3 implements im.gv {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5236t;
        public int w;

        public gv() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (y.this.n()) {
                y.s(y.this);
                im unused = y.this.f5223c5;
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void a8(String str, @Nullable Bundle bundle) {
            if (y.this.fh(65536L)) {
                y.w(y.this);
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public boolean c(Intent intent) {
            if (!y.this.i4()) {
                return super.c(intent);
            }
            y.tl(y.this);
            im unused = y.this.f5223c5;
            throw null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void d(String str, @Nullable Bundle bundle) {
            if (y.this.fh(2048L)) {
                y.w(y.this);
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void d0() {
            if (y.this.f3(2L)) {
                y.this.f5223c5.pause();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void ej() {
            if (y.this.fh(16384L)) {
                y.w(y.this);
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void en() {
            if (y.this.f3(1L)) {
                y.this.f5223c5.stop();
                if (y.this.w) {
                    y.this.f5223c5.wz();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void f7(long j) {
            if (y.this.rz(4096L)) {
                y.this.f5230t.s(y.this.f5223c5, j);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void fh() {
            if (y.this.f3(4L)) {
                if (y.this.f5223c5.n3() == 1) {
                    y.w(y.this);
                    y.this.f5223c5.prepare();
                } else if (y.this.f5223c5.n3() == 4) {
                    y yVar = y.this;
                    yVar.ud(yVar.f5223c5, y.this.f5223c5.g3(), -9223372036854775807L);
                }
                ((im) v0.y.v(y.this.f5223c5)).play();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void hw(boolean z) {
            if (y.this.c()) {
                y.i9(y.this);
                im unused = y.this.f5223c5;
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void j(RatingCompat ratingCompat, @Nullable Bundle bundle) {
            if (y.this.d0()) {
                y.a(y.this);
                im unused = y.this.f5223c5;
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void j5(float f3) {
            if (!y.this.f3(4194304L) || f3 <= 0.0f) {
                return;
            }
            y.this.f5223c5.zn(y.this.f5223c5.v().gv(f3));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void k() {
            if (y.this.rz(16L)) {
                y.this.f5230t.gv(y.this.f5223c5);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void k5(MediaDescriptionCompat mediaDescriptionCompat) {
            if (y.this.n()) {
                y.s(y.this);
                im unused = y.this.f5223c5;
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void mg(String str, @Nullable Bundle bundle) {
            if (y.this.fh(1024L)) {
                y.w(y.this);
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void o(RatingCompat ratingCompat) {
            if (y.this.d0()) {
                y.a(y.this);
                im unused = y.this.f5223c5;
                throw null;
            }
        }

        @Override // ft.im.gv
        public /* synthetic */ void onAvailableCommandsChanged(im.n3 n3Var) {
            n7.zn(this, n3Var);
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
            boolean z;
            boolean z5;
            boolean z7 = true;
            if (znVar.y(11)) {
                if (this.f5236t != imVar.g3()) {
                    if (y.this.f5230t != null) {
                        y.this.f5230t.zn(imVar);
                    }
                    z = true;
                } else {
                    z = false;
                }
                z5 = true;
            } else {
                z = false;
                z5 = false;
            }
            if (znVar.y(0)) {
                int iZ = imVar.yt().z();
                int iG3 = imVar.g3();
                if (y.this.f5230t != null) {
                    y.this.f5230t.a(imVar);
                } else {
                    if (this.w != iZ || this.f5236t != iG3) {
                    }
                    this.w = iZ;
                    z = true;
                }
                z5 = true;
                this.w = iZ;
                z = true;
            }
            this.f5236t = imVar.g3();
            if (znVar.n3(4, 5, 7, 8, 12)) {
                z5 = true;
            }
            if (znVar.n3(9)) {
                y.this.z6();
            } else {
                z7 = z5;
            }
            if (z7) {
                y.this.d();
            }
            if (z) {
                y.this.ta();
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

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void oz(int i) {
            if (y.this.f3(262144L)) {
                int i5 = 1;
                if (i != 1) {
                    i5 = 2;
                    if (i != 2 && i != 3) {
                        i5 = 0;
                    }
                }
                y.this.f5223c5.gv(i5);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void q9() {
            if (y.this.rz(32L)) {
                y.this.f5230t.fb(y.this.f5223c5);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void ud(String str, @Nullable Bundle bundle) {
            if (y.this.fh(32768L)) {
                y.w(y.this);
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void ut(int i) {
            if (y.this.f3(2097152L)) {
                boolean z = true;
                if (i != 1 && i != 2) {
                    z = false;
                }
                y.this.f5223c5.f7(z);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void vl(long j) {
            if (y.this.f3(256L)) {
                y yVar = y.this;
                yVar.ud(yVar.f5223c5, y.this.f5223c5.g3(), j);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void w(String str, @Nullable Bundle bundle) {
            if (y.this.f5223c5 == null || !y.this.f5225fb.containsKey(str)) {
                return;
            }
            ((v) y.this.f5225fb.get(str)).y(y.this.f5223c5, str, bundle);
            y.this.d();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void x(Uri uri, @Nullable Bundle bundle) {
            if (y.this.fh(131072L)) {
                y.w(y.this);
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void xc(String str, @Nullable Bundle bundle, @Nullable ResultReceiver resultReceiver) {
            if (y.this.f5223c5 != null) {
                for (int i = 0; i < y.this.f5226gv.size(); i++) {
                    if (((zn) y.this.f5226gv.get(i)).y(y.this.f5223c5, str, bundle, resultReceiver)) {
                        return;
                    }
                }
                for (int i5 = 0; i5 < y.this.f5232v.size() && !((zn) y.this.f5232v.get(i5)).y(y.this.f5223c5, str, bundle, resultReceiver); i5++) {
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void yt() {
            if (y.this.f3(8L)) {
                y.this.f5223c5.tg();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void z() {
            if (y.this.f3(64L)) {
                y.this.f5223c5.y4();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void z6(Uri uri, @Nullable Bundle bundle) {
            if (y.this.fh(8192L)) {
                y.w(y.this);
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.n3
        public void zn(MediaDescriptionCompat mediaDescriptionCompat) {
            if (y.this.n()) {
                y.s(y.this);
                im unused = y.this.f5223c5;
                throw null;
            }
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

    public interface i9 extends zn {
    }

    public interface n3 extends zn {
    }

    public interface s {
        boolean n3(MediaMetadataCompat mediaMetadataCompat, MediaMetadataCompat mediaMetadataCompat2);

        MediaMetadataCompat y(im imVar);
    }

    public interface t extends zn {
    }

    public interface v {
        @Nullable
        PlaybackStateCompat.CustomAction n3(im imVar);

        void y(im imVar, String str, @Nullable Bundle bundle);
    }

    public interface zn {
        boolean y(im imVar, String str, @Nullable Bundle bundle, @Nullable ResultReceiver resultReceiver);
    }

    static {
        rb.y("goog.exo.mediasession");
        f5221mt = new MediaMetadataCompat.n3().y();
    }

    public y(MediaSessionCompat mediaSessionCompat) {
        this.y = mediaSessionCompat;
        Looper looperJ5 = ut.j5();
        this.n3 = looperJ5;
        gv gvVar = new gv();
        this.zn = gvVar;
        this.f5226gv = new ArrayList<>();
        this.f5232v = new ArrayList<>();
        this.f5222a = new v[0];
        this.f5225fb = Collections.emptyMap();
        this.f5229s = new a(mediaSessionCompat.n3(), null);
        this.f5231tl = 2360143L;
        mediaSessionCompat.i9(3);
        mediaSessionCompat.c5(gvVar, new Handler(looperJ5));
        this.w = true;
    }

    public static /* synthetic */ t a(y yVar) {
        yVar.getClass();
        return null;
    }

    public static /* synthetic */ n3 i9(y yVar) {
        yVar.getClass();
        return null;
    }

    public static /* synthetic */ i9 s(y yVar) {
        yVar.getClass();
        return null;
    }

    public static /* synthetic */ fb tl(y yVar) {
        yVar.getClass();
        return null;
    }

    public static /* synthetic */ c5 w(y yVar) {
        yVar.getClass();
        return null;
    }

    public void a8(@Nullable im imVar) {
        v0.y.y(imVar == null || imVar.vl() == this.n3);
        im imVar2 = this.f5223c5;
        if (imVar2 != null) {
            imVar2.kp(this.zn);
        }
        this.f5223c5 = imVar;
        if (imVar != null) {
            imVar.f(this.zn);
        }
        d();
        ta();
    }

    public final void b(@Nullable zn znVar) {
        if (znVar != null) {
            this.f5226gv.remove(znVar);
        }
    }

    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d() {
        PlaybackStateCompat.gv gvVar = new PlaybackStateCompat.gv();
        im imVar = this.f5223c5;
        int i = 0;
        if (imVar == null) {
            gvVar.zn(x4()).c5(0, 0L, 0.0f, SystemClock.elapsedRealtime());
            this.y.xc(0);
            this.y.w(0);
            this.y.tl(gvVar.n3());
            return;
        }
        HashMap map = new HashMap();
        for (v vVar : this.f5222a) {
            PlaybackStateCompat.CustomAction customActionN3 = vVar.n3(imVar);
            if (customActionN3 != null) {
                map.put(customActionN3.n3(), vVar);
                gvVar.y(customActionN3);
            }
        }
        this.f5225fb = Collections.unmodifiableMap(map);
        Bundle bundle = new Bundle();
        int iMg = (imVar.a() == null && this.f5227i9 == null) ? mg(imVar.n3(), imVar.k()) : 7;
        Pair<Integer, CharSequence> pair = this.f5227i9;
        if (pair != null) {
            gvVar.a(((Integer) pair.first).intValue(), (CharSequence) this.f5227i9.second);
            Bundle bundle2 = this.f5224f;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        }
        f fVar = this.f5230t;
        long jV = fVar != null ? fVar.v(imVar) : -1L;
        float f3 = imVar.v().y;
        bundle.putFloat("EXO_SPEED", f3);
        float f4 = imVar.isPlaying() ? f3 : 0.0f;
        xb xbVarXc = imVar.xc();
        if (xbVarXc != null && !FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(xbVarXc.y)) {
            bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", xbVarXc.y);
        }
        gvVar.zn(x4() | r(imVar)).gv(jV).v(imVar.yg()).c5(iMg, imVar.getCurrentPosition(), f4, SystemClock.elapsedRealtime()).fb(bundle);
        int iC5 = imVar.c5();
        MediaSessionCompat mediaSessionCompat = this.y;
        if (iC5 == 1) {
            i = 1;
        } else if (iC5 == 2) {
            i = 2;
        }
        mediaSessionCompat.xc(i);
        this.y.w(imVar.u0() ? 1 : 0);
        this.y.tl(gvVar.n3());
    }

    public final boolean d0() {
        return false;
    }

    public final void ej(@Nullable zn znVar) {
        if (znVar == null || this.f5226gv.contains(znVar)) {
            return;
        }
        this.f5226gv.add(znVar);
    }

    public final boolean f3(long j) {
        return this.f5223c5 != null && ((j & this.f5231tl) != 0 || this.f5234xc);
    }

    public final boolean fh(long j) {
        return false;
    }

    public final boolean i4() {
        return false;
    }

    public final int mg(int i, boolean z) {
        if (i == 2) {
            return z ? 6 : 2;
        }
        if (i == 3) {
            return z ? 3 : 2;
        }
        if (i != 4) {
            return this.f5228p ? 1 : 0;
        }
        return 1;
    }

    public final boolean n() {
        return false;
    }

    public final long r(im imVar) {
        boolean zUd = imVar.ud(5);
        boolean zUd2 = imVar.ud(11);
        boolean zUd3 = imVar.ud(12);
        if (!imVar.yt().r()) {
            imVar.i9();
        }
        long j = zUd ? 6554375L : 6554119L;
        if (zUd3) {
            j |= 64;
        }
        if (zUd2) {
            j |= 8;
        }
        long j4 = this.f5231tl & j;
        f fVar = this.f5230t;
        return fVar != null ? j4 | (fVar.n3(imVar) & 4144) : j4;
    }

    public final boolean rz(long j) {
        f fVar;
        im imVar = this.f5223c5;
        return (imVar == null || (fVar = this.f5230t) == null || ((j & fVar.n3(imVar)) == 0 && !this.f5234xc)) ? false : true;
    }

    public final void ta() {
        MediaMetadataCompat mediaMetadataCompatN3;
        im imVar;
        s sVar = this.f5229s;
        MediaMetadataCompat mediaMetadataCompatY = (sVar == null || (imVar = this.f5223c5) == null) ? f5221mt : sVar.y(imVar);
        s sVar2 = this.f5229s;
        if (!this.f5233wz || sVar2 == null || (mediaMetadataCompatN3 = this.y.n3().n3()) == null || !sVar2.n3(mediaMetadataCompatN3, mediaMetadataCompatY)) {
            this.y.t(mediaMetadataCompatY);
        }
    }

    public final void ud(im imVar, int i, long j) {
        imVar.ut(i, j);
    }

    public void x(@Nullable f fVar) {
        f fVar2 = this.f5230t;
        if (fVar2 != fVar) {
            b(fVar2);
            this.f5230t = fVar;
            ej(fVar);
        }
    }

    public final long x4() {
        return 0L;
    }

    public final void z6() {
        im imVar;
        f fVar = this.f5230t;
        if (fVar == null || (imVar = this.f5223c5) == null) {
            return;
        }
        fVar.a(imVar);
    }
}
