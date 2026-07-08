package mn;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.g;
import ft.uo;
import java.nio.ByteBuffer;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public interface i4 {

    public static final class gv extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public gv(long j, long j4) {
            super("Unexpected audio track timestamp discontinuity: expected " + j4 + ", got " + j);
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j4;
        }
    }

    public static final class n3 extends Exception {
        public final int audioTrackState;
        public final g format;
        public final boolean isRecoverable;

        public n3(int i, int i5, int i8, int i10, g gVar, boolean z, @Nullable Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i5);
            sb.append(", ");
            sb.append(i8);
            sb.append(", ");
            sb.append(i10);
            sb.append(")");
            sb.append(" ");
            sb.append(gVar);
            sb.append(z ? " (recoverable)" : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
            super(sb.toString(), exc);
            this.audioTrackState = i;
            this.isRecoverable = z;
            this.format = gVar;
        }
    }

    public static final class v extends Exception {
        public final int errorCode;
        public final g format;
        public final boolean isRecoverable;

        public v(int i, g gVar, boolean z) {
            super("AudioTrack write failed: " + i);
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = gVar;
        }
    }

    public interface zn {
        void c(int i, long j, long j4);

        void fb(long j);

        void fh();

        void gv(Exception exc);

        void onSkipSilenceEnabledChanged(boolean z);

        void rz();

        void t();
    }

    boolean a();

    void c5(@Nullable AudioDeviceInfo audioDeviceInfo);

    int co(g gVar);

    void d0();

    void f(int i);

    void f3(long j);

    void flush();

    long i4(boolean z);

    boolean i9();

    void mt(@Nullable gn gnVar);

    void n();

    boolean n3(g gVar);

    void p(mn.v vVar);

    void pause();

    void play();

    void r(zn znVar);

    void s(boolean z);

    void setVolume(float f3);

    void tl();

    uo v();

    void w();

    boolean wz(ByteBuffer byteBuffer, long j, int i) throws n3, v;

    void x4(c cVar);

    void xc(g gVar, int i, @Nullable int[] iArr) throws y;

    void y();

    void z() throws v;

    void zn(uo uoVar);

    public static final class y extends Exception {
        public final g format;

        public y(Throwable th, g gVar) {
            super(th);
            this.format = gVar;
        }

        public y(String str, g gVar) {
            super(str);
            this.format = gVar;
        }
    }
}
