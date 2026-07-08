package z0;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import ft.g;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import v0.r;
import v0.vl;
import v0.w;
import w0.wz;

/* JADX INFO: loaded from: classes.dex */
public final class c5 implements wz, y {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f9368co;

    @Nullable
    public byte[] n;
    public SurfaceTexture z;
    public final AtomicBoolean y = new AtomicBoolean();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f9375v = new AtomicBoolean(true);

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final fb f9370fb = new fb();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zn f9373s = new zn();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vl<Long> f9369f = new vl<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vl<v> f9374t = new vl<>();
    public final float[] w = new float[16];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f9371p = new float[16];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile int f9372r = 0;
    public int f3 = -1;

    public SurfaceTexture a() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            w.n3();
            this.f9370fb.n3();
            w.n3();
            this.f9368co = w.a();
        } catch (w.y e4) {
            r.gv("SceneRenderer", "Failed to initialize the renderer", e4);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9368co);
        this.z = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: z0.s
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.y.fb(surfaceTexture2);
            }
        });
        return this.z;
    }

    public final void c5(@Nullable byte[] bArr, int i, long j) {
        byte[] bArr2 = this.n;
        int i5 = this.f3;
        this.n = bArr;
        if (i == -1) {
            i = this.f9372r;
        }
        this.f3 = i;
        if (i5 == i && Arrays.equals(bArr2, this.n)) {
            return;
        }
        byte[] bArr3 = this.n;
        v vVarY = bArr3 != null ? a.y(bArr3, this.f3) : null;
        if (vVarY == null || !fb.zn(vVarY)) {
            vVarY = v.n3(this.f3);
        }
        this.f9374t.y(j, vVarY);
    }

    public final /* synthetic */ void fb(SurfaceTexture surfaceTexture) {
        this.y.set(true);
    }

    public void gv(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        try {
            w.n3();
        } catch (w.y e4) {
            r.gv("SceneRenderer", "Failed to draw a frame", e4);
        }
        if (this.y.compareAndSet(true, false)) {
            ((SurfaceTexture) v0.y.v(this.z)).updateTexImage();
            try {
                w.n3();
            } catch (w.y e5) {
                r.gv("SceneRenderer", "Failed to draw a frame", e5);
            }
            if (this.f9375v.compareAndSet(true, false)) {
                w.i9(this.w);
            }
            long timestamp = this.z.getTimestamp();
            Long lFb = this.f9369f.fb(timestamp);
            if (lFb != null) {
                this.f9373s.zn(this.w, lFb.longValue());
            }
            v vVarI9 = this.f9374t.i9(timestamp);
            if (vVarI9 != null) {
                this.f9370fb.gv(vVarI9);
            }
        }
        Matrix.multiplyMM(this.f9371p, 0, fArr, 0, this.w, 0);
        this.f9370fb.y(this.f9368co, this.f9371p, z);
    }

    @Override // w0.wz
    public void n3(long j, long j4, g gVar, @Nullable MediaFormat mediaFormat) {
        this.f9369f.y(j4, Long.valueOf(j));
        c5(gVar.f4784j5, gVar.qn, j4);
    }

    public void s(int i) {
        this.f9372r = i;
    }

    @Override // z0.y
    public void v() {
        this.f9369f.zn();
        this.f9373s.gv();
        this.f9375v.set(true);
    }

    @Override // z0.y
    public void zn(long j, float[] fArr) {
        this.f9373s.v(j, fArr);
    }
}
