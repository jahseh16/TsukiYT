package ft;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.im;
import ft.s;
import java.util.ArrayList;
import java.util.List;
import v0.wz;

/* JADX INFO: loaded from: classes.dex */
public interface im {

    public interface gv {
        void onAvailableCommandsChanged(n3 n3Var);

        void onCues(b0.a aVar);

        @Deprecated
        void onCues(List<b0.n3> list);

        void onDeviceInfoChanged(xc xcVar);

        void onDeviceVolumeChanged(int i, boolean z);

        void onEvents(im imVar, zn znVar);

        void onIsLoadingChanged(boolean z);

        void onIsPlayingChanged(boolean z);

        @Deprecated
        void onLoadingChanged(boolean z);

        void onMediaItemTransition(@Nullable xb xbVar, int i);

        void onMediaMetadataChanged(qj qjVar);

        void onMetadata(Metadata metadata);

        void onPlayWhenReadyChanged(boolean z, int i);

        void onPlaybackParametersChanged(uo uoVar);

        void onPlaybackStateChanged(int i);

        void onPlaybackSuppressionReasonChanged(int i);

        void onPlayerError(bv bvVar);

        void onPlayerErrorChanged(@Nullable bv bvVar);

        @Deprecated
        void onPlayerStateChanged(boolean z, int i);

        @Deprecated
        void onPositionDiscontinuity(int i);

        void onPositionDiscontinuity(v vVar, v vVar2, int i);

        void onRenderedFirstFrame();

        void onRepeatModeChanged(int i);

        @Deprecated
        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z);

        void onSkipSilenceEnabledChanged(boolean z);

        void onSurfaceSizeChanged(int i, int i5);

        void onTimelineChanged(xq xqVar, int i);

        void onTrackSelectionParametersChanged(n0.z6 z6Var);

        void onTracksChanged(gi giVar);

        void onVideoSizeChanged(w0.mg mgVar);

        void onVolumeChanged(float f3);
    }

    public static final class n3 implements s {
        public final v0.wz y;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final n3 f4877v = new y().v();

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public static final String f4875fb = v0.ut.g3(0);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final s.y<n3> f4876s = new s.y() { // from class: ft.mh
            @Override // ft.s.y
            public final s fromBundle(Bundle bundle) {
                return im.n3.gv(bundle);
            }
        };

        public static final class y {
            public static final int[] n3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
            public final wz.n3 y = new wz.n3();

            public y gv(int i, boolean z) {
                this.y.gv(i, z);
                return this;
            }

            public y n3(n3 n3Var) {
                this.y.n3(n3Var.y);
                return this;
            }

            public n3 v() {
                return new n3(this.y.v());
            }

            public y y(int i) {
                this.y.y(i);
                return this;
            }

            public y zn(int... iArr) {
                this.y.zn(iArr);
                return this;
            }
        }

        public static n3 gv(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f4875fb);
            if (integerArrayList == null) {
                return f4877v;
            }
            y yVar = new y();
            for (int i = 0; i < integerArrayList.size(); i++) {
                yVar.y(integerArrayList.get(i).intValue());
            }
            return yVar.v();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n3) {
                return this.y.equals(((n3) obj).y);
            }
            return false;
        }

        public int hashCode() {
            return this.y.hashCode();
        }

        @Override // ft.s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < this.y.gv(); i++) {
                arrayList.add(Integer.valueOf(this.y.zn(i)));
            }
            bundle.putIntegerArrayList(f4875fb, arrayList);
            return bundle;
        }

        public boolean zn(int i) {
            return this.y.y(i);
        }

        public n3(v0.wz wzVar) {
            this.y = wzVar;
        }
    }

    public static final class v implements s {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public final int f4881co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Object f4882f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f4883fb;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f4884p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public final xb f4885s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f4886t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Deprecated
        public final int f4887v;
        public final long w;

        @Nullable
        public final Object y;
        public final int z;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f4880r = v0.ut.g3(0);
        public static final String f3 = v0.ut.g3(1);
        public static final String n = v0.ut.g3(2);
        public static final String c = v0.ut.g3(3);
        public static final String d0 = v0.ut.g3(4);
        public static final String fh = v0.ut.g3(5);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f4878d = v0.ut.g3(6);

        /* JADX INFO: renamed from: ej, reason: collision with root package name */
        public static final s.y<v> f4879ej = new s.y() { // from class: ft.c8
            @Override // ft.s.y
            public final s fromBundle(Bundle bundle) {
                return im.v.n3(bundle);
            }
        };

        public v(@Nullable Object obj, int i, @Nullable xb xbVar, @Nullable Object obj2, int i5, long j, long j4, int i8, int i10) {
            this.y = obj;
            this.f4887v = i;
            this.f4883fb = i;
            this.f4885s = xbVar;
            this.f4882f = obj2;
            this.f4886t = i5;
            this.w = j;
            this.f4884p = j4;
            this.f4881co = i8;
            this.z = i10;
        }

        public static v n3(Bundle bundle) {
            int i = bundle.getInt(f4880r, 0);
            Bundle bundle2 = bundle.getBundle(f3);
            return new v(null, i, bundle2 == null ? null : (xb) xb.d0.fromBundle(bundle2), null, bundle.getInt(n, 0), bundle.getLong(c, 0L), bundle.getLong(d0, 0L), bundle.getInt(fh, -1), bundle.getInt(f4878d, -1));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || v.class != obj.getClass()) {
                return false;
            }
            v vVar = (v) obj;
            return this.f4883fb == vVar.f4883fb && this.f4886t == vVar.f4886t && this.w == vVar.w && this.f4884p == vVar.f4884p && this.f4881co == vVar.f4881co && this.z == vVar.z && g4.f.y(this.y, vVar.y) && g4.f.y(this.f4882f, vVar.f4882f) && g4.f.y(this.f4885s, vVar.f4885s);
        }

        public int hashCode() {
            return g4.f.n3(this.y, Integer.valueOf(this.f4883fb), this.f4885s, this.f4882f, Integer.valueOf(this.f4886t), Long.valueOf(this.w), Long.valueOf(this.f4884p), Integer.valueOf(this.f4881co), Integer.valueOf(this.z));
        }

        @Override // ft.s
        public Bundle toBundle() {
            return zn(true, true);
        }

        public Bundle zn(boolean z, boolean z5) {
            Bundle bundle = new Bundle();
            bundle.putInt(f4880r, z5 ? this.f4883fb : 0);
            xb xbVar = this.f4885s;
            if (xbVar != null && z) {
                bundle.putBundle(f3, xbVar.toBundle());
            }
            bundle.putInt(n, z5 ? this.f4886t : 0);
            bundle.putLong(c, z ? this.w : 0L);
            bundle.putLong(d0, z ? this.f4884p : 0L);
            bundle.putInt(fh, z ? this.f4881co : -1);
            bundle.putInt(f4878d, z ? this.z : -1);
            return bundle;
        }
    }

    public static final class zn {
        public final v0.wz y;

        public zn(v0.wz wzVar) {
            this.y = wzVar;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof zn) {
                return this.y.equals(((zn) obj).y);
            }
            return false;
        }

        public int hashCode() {
            return this.y.hashCode();
        }

        public boolean n3(int... iArr) {
            return this.y.n3(iArr);
        }

        public boolean y(int i) {
            return this.y.y(i);
        }
    }

    @Nullable
    bv a();

    long ap();

    boolean b();

    long bk();

    void c(boolean z);

    int c5();

    void co(@Nullable SurfaceView surfaceView);

    boolean cr();

    b0.a d();

    w0.mg dm();

    void e(int i);

    @Deprecated
    void en(boolean z);

    void f(gv gvVar);

    void f7(boolean z);

    void fb(long j);

    gi fh();

    @Deprecated
    boolean g();

    int g3();

    long getCurrentPosition();

    long getDuration();

    float getVolume();

    void gv(int i);

    n0.z6 hw();

    @Deprecated
    int i4();

    boolean i9();

    boolean isPlaying();

    void j5();

    boolean k();

    int k5();

    void kp(gv gvVar);

    void lc(n0.z6 z6Var);

    void m(@Nullable SurfaceView surfaceView);

    boolean mg();

    void mt(List<xb> list, boolean z);

    void n();

    int n3();

    boolean o4();

    void oz(xb xbVar);

    void p();

    void pause();

    void play();

    long pq();

    void prepare();

    qj pz();

    n3 q9();

    void qn(@Nullable TextureView textureView);

    int r();

    void ra();

    void release();

    int rs();

    long s8();

    void setVolume(float f3);

    void stop();

    long t();

    void tg();

    long u();

    boolean u0();

    boolean ud(int i);

    void ut(int i, long j);

    uo v();

    Looper vl();

    void wz();

    void x4(int i, int i5);

    @Nullable
    xb xc();

    void xg(@Nullable TextureView textureView);

    boolean y();

    void y4();

    int y5();

    boolean yc();

    long yg();

    xq yt();

    int z6();

    void zn(uo uoVar);
}
