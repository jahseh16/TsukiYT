package ft;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.im;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bk implements im {
    public final im y;

    public static final class y implements im.gv {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final im.gv f4645v;
        public final bk y;

        public y(bk bkVar, im.gv gvVar) {
            this.y = bkVar;
            this.f4645v = gvVar;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            if (this.y.equals(yVar.y)) {
                return this.f4645v.equals(yVar.f4645v);
            }
            return false;
        }

        public int hashCode() {
            return (this.y.hashCode() * 31) + this.f4645v.hashCode();
        }

        @Override // ft.im.gv
        public void onAvailableCommandsChanged(im.n3 n3Var) {
            this.f4645v.onAvailableCommandsChanged(n3Var);
        }

        @Override // ft.im.gv
        public void onCues(List<b0.n3> list) {
            this.f4645v.onCues(list);
        }

        @Override // ft.im.gv
        public void onDeviceInfoChanged(xc xcVar) {
            this.f4645v.onDeviceInfoChanged(xcVar);
        }

        @Override // ft.im.gv
        public void onDeviceVolumeChanged(int i, boolean z) {
            this.f4645v.onDeviceVolumeChanged(i, z);
        }

        @Override // ft.im.gv
        public void onEvents(im imVar, im.zn znVar) {
            this.f4645v.onEvents(this.y, znVar);
        }

        @Override // ft.im.gv
        public void onIsLoadingChanged(boolean z) {
            this.f4645v.onIsLoadingChanged(z);
        }

        @Override // ft.im.gv
        public void onIsPlayingChanged(boolean z) {
            this.f4645v.onIsPlayingChanged(z);
        }

        @Override // ft.im.gv
        public void onLoadingChanged(boolean z) {
            this.f4645v.onIsLoadingChanged(z);
        }

        @Override // ft.im.gv
        public void onMediaItemTransition(@Nullable xb xbVar, int i) {
            this.f4645v.onMediaItemTransition(xbVar, i);
        }

        @Override // ft.im.gv
        public void onMediaMetadataChanged(qj qjVar) {
            this.f4645v.onMediaMetadataChanged(qjVar);
        }

        @Override // ft.im.gv
        public void onMetadata(Metadata metadata) {
            this.f4645v.onMetadata(metadata);
        }

        @Override // ft.im.gv
        public void onPlayWhenReadyChanged(boolean z, int i) {
            this.f4645v.onPlayWhenReadyChanged(z, i);
        }

        @Override // ft.im.gv
        public void onPlaybackParametersChanged(uo uoVar) {
            this.f4645v.onPlaybackParametersChanged(uoVar);
        }

        @Override // ft.im.gv
        public void onPlaybackStateChanged(int i) {
            this.f4645v.onPlaybackStateChanged(i);
        }

        @Override // ft.im.gv
        public void onPlaybackSuppressionReasonChanged(int i) {
            this.f4645v.onPlaybackSuppressionReasonChanged(i);
        }

        @Override // ft.im.gv
        public void onPlayerError(bv bvVar) {
            this.f4645v.onPlayerError(bvVar);
        }

        @Override // ft.im.gv
        public void onPlayerErrorChanged(@Nullable bv bvVar) {
            this.f4645v.onPlayerErrorChanged(bvVar);
        }

        @Override // ft.im.gv
        public void onPlayerStateChanged(boolean z, int i) {
            this.f4645v.onPlayerStateChanged(z, i);
        }

        @Override // ft.im.gv
        public void onPositionDiscontinuity(int i) {
            this.f4645v.onPositionDiscontinuity(i);
        }

        @Override // ft.im.gv
        public void onRenderedFirstFrame() {
            this.f4645v.onRenderedFirstFrame();
        }

        @Override // ft.im.gv
        public void onRepeatModeChanged(int i) {
            this.f4645v.onRepeatModeChanged(i);
        }

        @Override // ft.im.gv
        public void onSeekProcessed() {
            this.f4645v.onSeekProcessed();
        }

        @Override // ft.im.gv
        public void onShuffleModeEnabledChanged(boolean z) {
            this.f4645v.onShuffleModeEnabledChanged(z);
        }

        @Override // ft.im.gv
        public void onSkipSilenceEnabledChanged(boolean z) {
            this.f4645v.onSkipSilenceEnabledChanged(z);
        }

        @Override // ft.im.gv
        public void onSurfaceSizeChanged(int i, int i5) {
            this.f4645v.onSurfaceSizeChanged(i, i5);
        }

        @Override // ft.im.gv
        public void onTimelineChanged(xq xqVar, int i) {
            this.f4645v.onTimelineChanged(xqVar, i);
        }

        @Override // ft.im.gv
        public void onTrackSelectionParametersChanged(n0.z6 z6Var) {
            this.f4645v.onTrackSelectionParametersChanged(z6Var);
        }

        @Override // ft.im.gv
        public void onTracksChanged(gi giVar) {
            this.f4645v.onTracksChanged(giVar);
        }

        @Override // ft.im.gv
        public void onVideoSizeChanged(w0.mg mgVar) {
            this.f4645v.onVideoSizeChanged(mgVar);
        }

        @Override // ft.im.gv
        public void onVolumeChanged(float f3) {
            this.f4645v.onVolumeChanged(f3);
        }

        @Override // ft.im.gv
        public void onCues(b0.a aVar) {
            this.f4645v.onCues(aVar);
        }

        @Override // ft.im.gv
        public void onPositionDiscontinuity(im.v vVar, im.v vVar2, int i) {
            this.f4645v.onPositionDiscontinuity(vVar, vVar2, i);
        }
    }

    public bk(im imVar) {
        this.y = imVar;
    }

    @Override // ft.im
    @Nullable
    public bv a() {
        return this.y.a();
    }

    @Override // ft.im
    public long ap() {
        return this.y.ap();
    }

    @Override // ft.im
    public boolean b() {
        return this.y.b();
    }

    @Override // ft.im
    public long bk() {
        return this.y.bk();
    }

    @Override // ft.im
    public void c(boolean z) {
        this.y.c(z);
    }

    @Override // ft.im
    public int c5() {
        return this.y.c5();
    }

    @Override // ft.im
    public void co(@Nullable SurfaceView surfaceView) {
        this.y.co(surfaceView);
    }

    @Override // ft.im
    public boolean cr() {
        return this.y.cr();
    }

    @Override // ft.im
    public b0.a d() {
        return this.y.d();
    }

    @Override // ft.im
    public w0.mg dm() {
        return this.y.dm();
    }

    @Override // ft.im
    public void e(int i) {
        this.y.e(i);
    }

    @Override // ft.im
    public void f(im.gv gvVar) {
        this.y.f(new y(this, gvVar));
    }

    @Override // ft.im
    public void f7(boolean z) {
        this.y.f7(z);
    }

    @Override // ft.im
    public void fb(long j) {
        this.y.fb(j);
    }

    @Override // ft.im
    public gi fh() {
        return this.y.fh();
    }

    @Override // ft.im
    public int g3() {
        return this.y.g3();
    }

    @Override // ft.im
    public long getCurrentPosition() {
        return this.y.getCurrentPosition();
    }

    @Override // ft.im
    public long getDuration() {
        return this.y.getDuration();
    }

    @Override // ft.im
    public float getVolume() {
        return this.y.getVolume();
    }

    @Override // ft.im
    public void gv(int i) {
        this.y.gv(i);
    }

    @Override // ft.im
    public n0.z6 hw() {
        return this.y.hw();
    }

    @Override // ft.im
    @Deprecated
    public int i4() {
        return this.y.i4();
    }

    @Override // ft.im
    public boolean i9() {
        return this.y.i9();
    }

    @Override // ft.im
    public boolean isPlaying() {
        return this.y.isPlaying();
    }

    @Override // ft.im
    public void j5() {
        this.y.j5();
    }

    @Override // ft.im
    public boolean k() {
        return this.y.k();
    }

    @Override // ft.im
    public int k5() {
        return this.y.k5();
    }

    @Override // ft.im
    public void kp(im.gv gvVar) {
        this.y.kp(new y(this, gvVar));
    }

    @Override // ft.im
    public void lc(n0.z6 z6Var) {
        this.y.lc(z6Var);
    }

    @Override // ft.im
    public void m(@Nullable SurfaceView surfaceView) {
        this.y.m(surfaceView);
    }

    @Override // ft.im
    public boolean mg() {
        return this.y.mg();
    }

    @Override // ft.im
    public void n() {
        this.y.n();
    }

    @Override // ft.im
    public int n3() {
        return this.y.n3();
    }

    @Override // ft.im
    public boolean o4() {
        return this.y.o4();
    }

    @Override // ft.im
    public void pause() {
        this.y.pause();
    }

    @Override // ft.im
    public void play() {
        this.y.play();
    }

    @Override // ft.im
    public void prepare() {
        this.y.prepare();
    }

    @Override // ft.im
    public qj pz() {
        return this.y.pz();
    }

    @Override // ft.im
    public void qn(@Nullable TextureView textureView) {
        this.y.qn(textureView);
    }

    @Override // ft.im
    public void release() {
        this.y.release();
    }

    @Override // ft.im
    public int rs() {
        return this.y.rs();
    }

    @Override // ft.im
    public void stop() {
        this.y.stop();
    }

    @Override // ft.im
    public long t() {
        return this.y.t();
    }

    @Override // ft.im
    public void tg() {
        this.y.tg();
    }

    @Override // ft.im
    public boolean u0() {
        return this.y.u0();
    }

    @Override // ft.im
    public boolean ud(int i) {
        return this.y.ud(i);
    }

    @Override // ft.im
    public void ut(int i, long j) {
        this.y.ut(i, j);
    }

    @Override // ft.im
    public uo v() {
        return this.y.v();
    }

    @Override // ft.im
    public Looper vl() {
        return this.y.vl();
    }

    @Override // ft.im
    public void wz() {
        this.y.wz();
    }

    @Override // ft.im
    @Nullable
    public xb xc() {
        return this.y.xc();
    }

    @Override // ft.im
    public void xg(@Nullable TextureView textureView) {
        this.y.xg(textureView);
    }

    @Override // ft.im
    public void y4() {
        this.y.y4();
    }

    @Override // ft.im
    public int y5() {
        return this.y.y5();
    }

    @Override // ft.im
    public boolean yc() {
        return this.y.yc();
    }

    @Override // ft.im
    public long yg() {
        return this.y.yg();
    }

    @Override // ft.im
    public xq yt() {
        return this.y.yt();
    }

    @Override // ft.im
    public int z6() {
        return this.y.z6();
    }

    @Override // ft.im
    public void zn(uo uoVar) {
        this.y.zn(uoVar);
    }
}
