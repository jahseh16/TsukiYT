package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import v0.f;
import v0.r;
import v0.w;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2066f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f2067s;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f2068fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n3 f2069v;
    public final boolean y;

    public static class n3 extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public PlaceholderSurface f2070f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public Error f2071fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public RuntimeException f2072s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Handler f2073v;
        public f y;

        public n3() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public final void gv() {
            v0.y.v(this.y);
            this.y.c5();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        gv();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    n3(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e4) {
                    r.gv("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.f2071fb = e4;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e5) {
                    r.gv("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                    this.f2072s = e5;
                    synchronized (this) {
                        notify();
                    }
                } catch (w.y e6) {
                    r.gv("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                    this.f2072s = new IllegalStateException(e6);
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        public final void n3(int i) throws w.y {
            v0.y.v(this.y);
            this.y.s(i);
            this.f2070f = new PlaceholderSurface(this, this.y.fb(), i != 0);
        }

        public PlaceholderSurface y(int i) {
            boolean z;
            start();
            this.f2073v = new Handler(getLooper(), this);
            this.y = new f(this.f2073v);
            synchronized (this) {
                z = false;
                this.f2073v.obtainMessage(1, i, 0).sendToTarget();
                while (this.f2070f == null && this.f2072s == null && this.f2071fb == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f2072s;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f2071fb;
            if (error == null) {
                return (PlaceholderSurface) v0.y.v(this.f2070f);
            }
            throw error;
        }

        public void zn() {
            v0.y.v(this.f2073v);
            this.f2073v.sendEmptyMessage(2);
        }
    }

    public static synchronized boolean n3(Context context) {
        try {
            if (!f2066f) {
                f2067s = y(context);
                f2066f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2067s != 0;
    }

    public static int y(Context context) {
        if (w.s(context)) {
            return w.c5() ? 1 : 2;
        }
        return 0;
    }

    public static PlaceholderSurface zn(Context context, boolean z) {
        v0.y.fb(!z || n3(context));
        return new n3().y(z ? f2067s : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f2069v) {
            try {
                if (!this.f2068fb) {
                    this.f2069v.zn();
                    this.f2068fb = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PlaceholderSurface(n3 n3Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f2069v = n3Var;
        this.y = z;
    }
}
