package ft;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.internal.Code;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4829a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f4830c5;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public mn.v f4832gv;
    public final y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AudioFocusRequest f4833s;
    public final AudioManager y;

    @Nullable
    public n3 zn;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public float f4831fb = 1.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4834v = 0;

    public interface n3 {
        void fh(float f3);

        void rz(int i);
    }

    public class y implements AudioManager.OnAudioFocusChangeListener {
        public final Handler y;

        public y(Handler handler) {
            this.y = handler;
        }

        public final /* synthetic */ void n3(int i) {
            gv.this.s(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.y.post(new Runnable() { // from class: ft.zn
                @Override // java.lang.Runnable
                public final void run() {
                    this.y.n3(i);
                }
            });
        }
    }

    public gv(Context context, Handler handler, n3 n3Var) {
        this.y = (AudioManager) v0.y.v((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.zn = n3Var;
        this.n3 = new y(handler);
    }

    public static int v(@Nullable mn.v vVar) {
        if (vVar == null) {
            return 0;
        }
        switch (vVar.f6689fb) {
            case 0:
                v0.r.c5("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (vVar.y == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case Code.UNIMPLEMENTED /* 12 */:
            case 13:
                return 3;
            case 15:
            default:
                v0.r.c5("AudioFocusManager", "Unidentified audio usage: " + vVar.f6689fb);
                return 0;
            case 16:
                return v0.ut.y >= 19 ? 4 : 2;
        }
    }

    public final void a(int i) {
        n3 n3Var = this.zn;
        if (n3Var != null) {
            n3Var.rz(i);
        }
    }

    public void c5() {
        this.zn = null;
        n3();
    }

    public final int f() {
        return this.y.requestAudioFocus(this.n3, v0.ut.rs(((mn.v) v0.y.v(this.f4832gv)).f6689fb), this.f4829a);
    }

    public float fb() {
        return this.f4831fb;
    }

    public final int i9() {
        if (this.f4834v == 1) {
            return 1;
        }
        if ((v0.ut.y >= 26 ? t() : f()) == 1) {
            wz(1);
            return 1;
        }
        wz(0);
        return -1;
    }

    public final void n3() {
        if (this.f4834v == 0) {
            return;
        }
        if (v0.ut.y >= 26) {
            zn();
        } else {
            y();
        }
        wz(0);
    }

    public final boolean p() {
        mn.v vVar = this.f4832gv;
        return vVar != null && vVar.y == 1;
    }

    public final void s(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !p()) {
                wz(3);
                return;
            } else {
                a(0);
                wz(2);
                return;
            }
        }
        if (i == -1) {
            a(-1);
            n3();
        } else if (i == 1) {
            wz(1);
            a(1);
        } else {
            v0.r.c5("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    public final int t() {
        AudioFocusRequest.Builder builderY;
        AudioFocusRequest audioFocusRequest = this.f4833s;
        if (audioFocusRequest == null || this.f4830c5) {
            if (audioFocusRequest == null) {
                dp.mg.y();
                builderY = dp.fh.y(this.f4829a);
            } else {
                dp.mg.y();
                builderY = dp.rz.y(this.f4833s);
            }
            this.f4833s = dp.n.y(dp.f3.y(dp.i4.y(dp.x4.y(builderY, ((mn.v) v0.y.v(this.f4832gv)).n3().y), p()), this.n3));
            this.f4830c5 = false;
        }
        return dp.c.y(this.y, this.f4833s);
    }

    public void tl(@Nullable mn.v vVar) {
        if (v0.ut.zn(this.f4832gv, vVar)) {
            return;
        }
        this.f4832gv = vVar;
        int iV = v(vVar);
        this.f4829a = iV;
        boolean z = true;
        if (iV != 1 && iV != 0) {
            z = false;
        }
        v0.y.n3(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int w(boolean z, int i) {
        if (xc(i)) {
            n3();
            return z ? 1 : -1;
        }
        if (z) {
            return i9();
        }
        return -1;
    }

    public final void wz(int i) {
        if (this.f4834v == i) {
            return;
        }
        this.f4834v = i;
        float f3 = i == 3 ? 0.2f : 1.0f;
        if (this.f4831fb == f3) {
            return;
        }
        this.f4831fb = f3;
        n3 n3Var = this.zn;
        if (n3Var != null) {
            n3Var.fh(f3);
        }
    }

    public final boolean xc(int i) {
        return i == 1 || this.f4829a != 1;
    }

    public final void y() {
        this.y.abandonAudioFocus(this.n3);
    }

    public final void zn() {
        AudioFocusRequest audioFocusRequest = this.f4833s;
        if (audioFocusRequest != null) {
            dp.d0.y(this.y, audioFocusRequest);
        }
    }
}
