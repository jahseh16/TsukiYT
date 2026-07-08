package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.gv;
import com.google.android.exoplayer2.drm.i9;
import com.google.android.exoplayer2.drm.v;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import r0.mg;
import ur.c;
import ur.i4;
import v0.r;
import v0.ut;
import v5.d;
import v5.rz;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public class y implements com.google.android.exoplayer2.drm.gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1544a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final v0.i9<v.y> f1545c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public zn f1546co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gn f1547f;

    @Nullable
    public i9.y f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f1548fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final n3 f1549gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public byte[] f1550i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final mg f1551i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    @Nullable
    public HandlerThread f1552mt;

    @Nullable
    public i9.gv n;
    public final i9 n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1553p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public gv.y f1554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap<String, String> f1555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tl f1556t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final UUID f1557tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f1558v;
    public int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final Looper f1559wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    @Nullable
    public byte[] f1560x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final v f1561xc;

    @Nullable
    public final List<DrmInitData.SchemeData> y;

    @Nullable
    public di.n3 z;
    public final InterfaceC0051y zn;

    public static final class a extends IOException {
        public a(@Nullable Throwable th) {
            super(th);
        }
    }

    public static final class gv {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final Object f1562gv;
        public final boolean n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1563v;
        public final long y;
        public final long zn;

        public gv(long j, boolean z, long j4, Object obj) {
            this.y = j;
            this.n3 = z;
            this.zn = j4;
            this.f1562gv = obj;
        }
    }

    public interface n3 {
        void n3(y yVar, int i);

        void y(y yVar, int i);
    }

    @SuppressLint({"HandlerLeak"})
    public class v extends Handler {
        public v(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                y.this.mg(obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                y.this.f3(obj, obj2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.y$y, reason: collision with other inner class name */
    public interface InterfaceC0051y {
        void n3(y yVar);

        void y(Exception exc, boolean z);

        void zn();
    }

    @SuppressLint({"HandlerLeak"})
    public class zn extends Handler {
        public boolean y;

        public zn(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objY;
            gv gvVar = (gv) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    objY = y.this.f1556t.y(y.this.f1557tl, (i9.gv) gvVar.f1562gv);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    objY = y.this.f1556t.n3(y.this.f1557tl, (i9.y) gvVar.f1562gv);
                }
            } catch (v5.mg e4) {
                boolean zY = y(message, e4);
                objY = e4;
                if (zY) {
                    return;
                }
            } catch (Exception e5) {
                r.i9("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e5);
                objY = e5;
            }
            y.this.f1551i9.gv(gvVar.y);
            synchronized (this) {
                try {
                    if (!this.y) {
                        y.this.f1561xc.obtainMessage(message.what, Pair.create(gvVar.f1562gv, objY)).sendToTarget();
                    }
                } finally {
                }
            }
        }

        public void n3(int i, Object obj, boolean z) {
            obtainMessage(i, new gv(i4.y(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public final boolean y(Message message, v5.mg mgVar) {
            gv gvVar = (gv) message.obj;
            if (!gvVar.n3) {
                return false;
            }
            int i = gvVar.f1563v + 1;
            gvVar.f1563v = i;
            if (i > y.this.f1551i9.zn(3)) {
                return false;
            }
            long jY = y.this.f1551i9.y(new mg.zn(new i4(gvVar.y, mgVar.dataSpec, mgVar.uriAfterRedirects, mgVar.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - gvVar.zn, mgVar.bytesLoaded), new c(3), mgVar.getCause() instanceof IOException ? (IOException) mgVar.getCause() : new a(mgVar.getCause()), gvVar.f1563v));
            if (jY == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.y) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jY);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public synchronized void zn() {
            removeCallbacksAndMessages(null);
            this.y = true;
        }
    }

    public y(UUID uuid, i9 i9Var, InterfaceC0051y interfaceC0051y, n3 n3Var, @Nullable List<DrmInitData.SchemeData> list, int i, boolean z, boolean z5, @Nullable byte[] bArr, HashMap<String, String> map, tl tlVar, Looper looper, mg mgVar, gn gnVar) {
        if (i == 1 || i == 3) {
            v0.y.v(bArr);
        }
        this.f1557tl = uuid;
        this.zn = interfaceC0051y;
        this.f1549gv = n3Var;
        this.n3 = i9Var;
        this.f1558v = i;
        this.f1544a = z;
        this.f1548fb = z5;
        if (bArr != null) {
            this.f1550i4 = bArr;
            this.y = null;
        } else {
            this.y = Collections.unmodifiableList((List) v0.y.v(list));
        }
        this.f1555s = map;
        this.f1556t = tlVar;
        this.f1545c5 = new v0.i9<>();
        this.f1551i9 = mgVar;
        this.f1547f = gnVar;
        this.w = 2;
        this.f1559wz = looper;
        this.f1561xc = new v(looper);
    }

    @Override // com.google.android.exoplayer2.drm.gv
    @Nullable
    public Map<String, String> a() {
        ud();
        byte[] bArr = this.f1560x4;
        if (bArr == null) {
            return null;
        }
        return this.n3.y(bArr);
    }

    public final void c() {
        if (this.f1558v == 0 && this.w == 4) {
            ut.i9(this.f1560x4);
            p(false);
        }
    }

    public boolean co(byte[] bArr) {
        ud();
        return Arrays.equals(this.f1560x4, bArr);
    }

    public final void d(byte[] bArr, int i, boolean z) {
        try {
            this.f3 = this.n3.tl(bArr, this.y, i, this.f1555s);
            ((zn) ut.i9(this.f1546co)).n3(1, v0.y.v(this.f3), z);
        } catch (Exception e4) {
            n(e4, true);
        }
    }

    public void d0(int i) {
        if (i != 2) {
            return;
        }
        c();
    }

    public final boolean ej() {
        try {
            this.n3.gv(this.f1560x4, this.f1550i4);
            return true;
        } catch (Exception e4) {
            i4(e4, 1);
            return false;
        }
    }

    public final void f3(Object obj, Object obj2) {
        if (obj == this.f3 && z()) {
            this.f3 = null;
            if (obj2 instanceof Exception) {
                n((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f1558v == 3) {
                    this.n3.t((byte[]) ut.i9(this.f1550i4), bArr);
                    w(new v0.c5() { // from class: v5.v
                        @Override // v0.c5
                        public final void accept(Object obj3) {
                            ((v.y) obj3).c5();
                        }
                    });
                    return;
                }
                byte[] bArrT = this.n3.t(this.f1560x4, bArr);
                int i = this.f1558v;
                if ((i == 2 || (i == 0 && this.f1550i4 != null)) && bArrT != null && bArrT.length != 0) {
                    this.f1550i4 = bArrT;
                }
                this.w = 4;
                w(new v0.c5() { // from class: v5.a
                    @Override // v0.c5
                    public final void accept(Object obj3) {
                        ((v.y) obj3).s();
                    }
                });
            } catch (Exception e4) {
                n(e4, true);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.gv
    public boolean fb(String str) {
        ud();
        return this.n3.i9((byte[]) v0.y.c5(this.f1560x4), str);
    }

    public void fh() {
        if (ta()) {
            p(true);
        }
    }

    @Override // com.google.android.exoplayer2.drm.gv
    @Nullable
    public final gv.y getError() {
        ud();
        if (this.w == 1) {
            return this.f1554r;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.gv
    public final int getState() {
        ud();
        return this.w;
    }

    @Override // com.google.android.exoplayer2.drm.gv
    public boolean gv() {
        ud();
        return this.f1544a;
    }

    public final void i4(final Exception exc, int i) {
        this.f1554r = new gv.y(exc, fb.y(exc, i));
        r.gv("DefaultDrmSession", "DRM session error", exc);
        w(new v0.c5() { // from class: v5.gv
            @Override // v0.c5
            public final void accept(Object obj) {
                ((v.y) obj).t(exc);
            }
        });
        if (this.w != 4) {
            this.w = 1;
        }
    }

    public final void mg(Object obj, Object obj2) {
        if (obj == this.n) {
            if (this.w == 2 || z()) {
                this.n = null;
                if (obj2 instanceof Exception) {
                    this.zn.y((Exception) obj2, false);
                    return;
                }
                try {
                    this.n3.fb((byte[]) obj2);
                    this.zn.zn();
                } catch (Exception e4) {
                    this.zn.y(e4, true);
                }
            }
        }
    }

    public final long mt() {
        if (!ft.c5.f4651gv.equals(this.f1557tl)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) v0.y.v(d.n3(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public final void n(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.zn.n3(this);
        } else {
            i4(exc, z ? 1 : 2);
        }
    }

    @Override // com.google.android.exoplayer2.drm.gv
    public void n3(@Nullable v.y yVar) {
        ud();
        int i = this.f1553p;
        if (i <= 0) {
            r.zn("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i5 = i - 1;
        this.f1553p = i5;
        if (i5 == 0) {
            this.w = 0;
            ((v) ut.i9(this.f1561xc)).removeCallbacksAndMessages(null);
            ((zn) ut.i9(this.f1546co)).zn();
            this.f1546co = null;
            ((HandlerThread) ut.i9(this.f1552mt)).quit();
            this.f1552mt = null;
            this.z = null;
            this.f1554r = null;
            this.f3 = null;
            this.n = null;
            byte[] bArr = this.f1560x4;
            if (bArr != null) {
                this.n3.f(bArr);
                this.f1560x4 = null;
            }
        }
        if (yVar != null) {
            this.f1545c5.zn(yVar);
            if (this.f1545c5.n3(yVar) == 0) {
                yVar.tl();
            }
        }
        this.f1549gv.n3(this, this.f1553p);
    }

    public final void p(boolean z) {
        if (this.f1548fb) {
            return;
        }
        byte[] bArr = (byte[]) ut.i9(this.f1560x4);
        int i = this.f1558v;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.f1550i4 == null || ej()) {
                    d(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            v0.y.v(this.f1550i4);
            v0.y.v(this.f1560x4);
            d(this.f1550i4, 3, z);
            return;
        }
        if (this.f1550i4 == null) {
            d(bArr, 1, z);
            return;
        }
        if (this.w == 4 || ej()) {
            long jMt = mt();
            if (this.f1558v != 0 || jMt > 60) {
                if (jMt <= 0) {
                    i4(new rz(), 2);
                    return;
                } else {
                    this.w = 4;
                    w(new v0.c5() { // from class: v5.zn
                        @Override // v0.c5
                        public final void accept(Object obj) {
                            ((v.y) obj).i9();
                        }
                    });
                    return;
                }
            }
            r.n3("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMt);
            d(bArr, 2, z);
        }
    }

    public void rz(Exception exc, boolean z) {
        i4(exc, z ? 1 : 3);
    }

    public final boolean ta() {
        if (z()) {
            return true;
        }
        try {
            byte[] bArrZn = this.n3.zn();
            this.f1560x4 = bArrZn;
            this.n3.v(bArrZn, this.f1547f);
            this.z = this.n3.c5(this.f1560x4);
            final int i = 3;
            this.w = 3;
            w(new v0.c5() { // from class: v5.n3
                @Override // v0.c5
                public final void accept(Object obj) {
                    ((v.y) obj).f(i);
                }
            });
            v0.y.v(this.f1560x4);
            return true;
        } catch (NotProvisionedException unused) {
            this.zn.n3(this);
            return false;
        } catch (Exception e4) {
            i4(e4, 1);
            return false;
        }
    }

    public final void ud() {
        if (Thread.currentThread() != this.f1559wz.getThread()) {
            r.i9("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f1559wz.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // com.google.android.exoplayer2.drm.gv
    @Nullable
    public final di.n3 v() {
        ud();
        return this.z;
    }

    public final void w(v0.c5<v.y> c5Var) {
        Iterator<v.y> it = this.f1545c5.f7().iterator();
        while (it.hasNext()) {
            c5Var.accept(it.next());
        }
    }

    @Override // com.google.android.exoplayer2.drm.gv
    public void y(@Nullable v.y yVar) {
        ud();
        if (this.f1553p < 0) {
            r.zn("DefaultDrmSession", "Session reference count less than zero: " + this.f1553p);
            this.f1553p = 0;
        }
        if (yVar != null) {
            this.f1545c5.y(yVar);
        }
        int i = this.f1553p + 1;
        this.f1553p = i;
        if (i == 1) {
            v0.y.fb(this.w == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f1552mt = handlerThread;
            handlerThread.start();
            this.f1546co = new zn(this.f1552mt.getLooper());
            if (ta()) {
                p(true);
            }
        } else if (yVar != null && z() && this.f1545c5.n3(yVar) == 1) {
            yVar.f(this.w);
        }
        this.f1549gv.y(this, this.f1553p);
    }

    public final boolean z() {
        int i = this.w;
        return i == 3 || i == 4;
    }

    public void z6() {
        this.n = this.n3.n3();
        ((zn) ut.i9(this.f1546co)).n3(0, v0.y.v(this.n), true);
    }

    @Override // com.google.android.exoplayer2.drm.gv
    public final UUID zn() {
        ud();
        return this.f1557tl;
    }
}
