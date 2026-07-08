package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.a;
import com.google.android.exoplayer2.drm.gv;
import com.google.android.exoplayer2.drm.i9;
import com.google.android.exoplayer2.drm.v;
import com.google.android.exoplayer2.drm.y;
import ft.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k4.k;
import k4.oz;
import k4.r;
import r0.mg;
import r0.n;
import v0.ut;
import v5.i4;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public class n3 implements com.google.android.exoplayer2.drm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f1518a;

    @Nullable
    public volatile gv c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final boolean f1519c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.drm.y f1520co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mg f1521f;

    @Nullable
    public byte[] f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f1522fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final i9.zn f1523gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public int f1524i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final fb f1525i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    @Nullable
    public i9 f1526mt;
    public gn n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1527p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Looper f1528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f1529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s f1530t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final long f1531tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final tl f1532v;
    public final Set<com.google.android.exoplayer2.drm.y> w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final List<com.google.android.exoplayer2.drm.y> f1533wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public Handler f1534x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final Set<a> f1535xc;

    @Nullable
    public com.google.android.exoplayer2.drm.y z;
    public final UUID zn;

    public class a implements a.n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f1536gv;

        @Nullable
        public final v.y n3;

        @Nullable
        public com.google.android.exoplayer2.drm.gv zn;

        public a(@Nullable v.y yVar) {
            this.n3 = yVar;
        }

        public final /* synthetic */ void gv(g gVar) {
            if (n3.this.f1527p == 0 || this.f1536gv) {
                return;
            }
            n3 n3Var = n3.this;
            this.zn = n3Var.co((Looper) v0.y.v(n3Var.f1528r), this.n3, gVar, false);
            n3.this.f1535xc.add(this);
        }

        @Override // com.google.android.exoplayer2.drm.a.n3
        public void release() {
            ut.oa((Handler) v0.y.v(n3.this.f1534x4), new Runnable() { // from class: v5.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.y.v();
                }
            });
        }

        public final /* synthetic */ void v() {
            if (this.f1536gv) {
                return;
            }
            com.google.android.exoplayer2.drm.gv gvVar = this.zn;
            if (gvVar != null) {
                gvVar.n3(this.n3);
            }
            n3.this.f1535xc.remove(this);
            this.f1536gv = true;
        }

        public void zn(final g gVar) {
            ((Handler) v0.y.v(n3.this.f1534x4)).post(new Runnable() { // from class: v5.fb
                @Override // java.lang.Runnable
                public final void run() {
                    this.y.gv(gVar);
                }
            });
        }
    }

    public class fb implements y.InterfaceC0051y {

        @Nullable
        public com.google.android.exoplayer2.drm.y n3;
        public final Set<com.google.android.exoplayer2.drm.y> y = new HashSet();

        public fb(n3 n3Var) {
        }

        public void gv(com.google.android.exoplayer2.drm.y yVar) {
            this.y.remove(yVar);
            if (this.n3 == yVar) {
                this.n3 = null;
                if (this.y.isEmpty()) {
                    return;
                }
                com.google.android.exoplayer2.drm.y next = this.y.iterator().next();
                this.n3 = next;
                next.z6();
            }
        }

        @Override // com.google.android.exoplayer2.drm.y.InterfaceC0051y
        public void n3(com.google.android.exoplayer2.drm.y yVar) {
            this.y.add(yVar);
            if (this.n3 != null) {
                return;
            }
            this.n3 = yVar;
            yVar.z6();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.y.InterfaceC0051y
        public void y(Exception exc, boolean z) {
            this.n3 = null;
            r rVarRz = r.rz(this.y);
            this.y.clear();
            k it = rVarRz.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.drm.y) it.next()).rz(exc, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.y.InterfaceC0051y
        public void zn() {
            this.n3 = null;
            r rVarRz = r.rz(this.y);
            this.y.clear();
            k it = rVarRz.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.drm.y) it.next()).fh();
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class gv extends Handler {
        public gv(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (com.google.android.exoplayer2.drm.y yVar : n3.this.f1533wz) {
                if (yVar.co(bArr)) {
                    yVar.d0(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.n3$n3, reason: collision with other inner class name */
    public static final class C0049n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1538a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f1540gv;
        public final HashMap<String, String> y = new HashMap<>();
        public UUID n3 = ft.c5.f4651gv;
        public i9.zn zn = f.f1517gv;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public mg f1539fb = new n();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int[] f1542v = new int[0];

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f1541s = 300000;

        public C0049n3 gv(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                v0.y.y(z);
            }
            this.f1542v = (int[]) iArr.clone();
            return this;
        }

        public C0049n3 n3(boolean z) {
            this.f1540gv = z;
            return this;
        }

        public C0049n3 v(UUID uuid, i9.zn znVar) {
            this.n3 = (UUID) v0.y.v(uuid);
            this.zn = (i9.zn) v0.y.v(znVar);
            return this;
        }

        public n3 y(tl tlVar) {
            return new n3(this.n3, this.zn, tlVar, this.y, this.f1540gv, this.f1542v, this.f1538a, this.f1539fb, this.f1541s);
        }

        public C0049n3 zn(boolean z) {
            this.f1538a = z;
            return this;
        }
    }

    public class s implements y.n3 {
        public s() {
        }

        @Override // com.google.android.exoplayer2.drm.y.n3
        public void n3(final com.google.android.exoplayer2.drm.y yVar, int i) {
            if (i == 1 && n3.this.f1527p > 0 && n3.this.f1531tl != -9223372036854775807L) {
                n3.this.w.add(yVar);
                ((Handler) v0.y.v(n3.this.f1534x4)).postAtTime(new Runnable() { // from class: v5.c5
                    @Override // java.lang.Runnable
                    public final void run() {
                        yVar.n3(null);
                    }
                }, yVar, SystemClock.uptimeMillis() + n3.this.f1531tl);
            } else if (i == 0) {
                n3.this.f1533wz.remove(yVar);
                if (n3.this.f1520co == yVar) {
                    n3.this.f1520co = null;
                }
                if (n3.this.z == yVar) {
                    n3.this.z = null;
                }
                n3.this.f1525i9.gv(yVar);
                if (n3.this.f1531tl != -9223372036854775807L) {
                    ((Handler) v0.y.v(n3.this.f1534x4)).removeCallbacksAndMessages(yVar);
                    n3.this.w.remove(yVar);
                }
            }
            n3.this.fh();
        }

        @Override // com.google.android.exoplayer2.drm.y.n3
        public void y(com.google.android.exoplayer2.drm.y yVar, int i) {
            if (n3.this.f1531tl != -9223372036854775807L) {
                n3.this.w.remove(yVar);
                ((Handler) v0.y.v(n3.this.f1534x4)).removeCallbacksAndMessages(yVar);
            }
        }
    }

    public static final class v extends Exception {
        public v(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public class zn implements i9.n3 {
        public zn() {
        }

        @Override // com.google.android.exoplayer2.drm.i9.n3
        public void y(i9 i9Var, @Nullable byte[] bArr, int i, int i5, @Nullable byte[] bArr2) {
            ((gv) v0.y.v(n3.this.c)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    public static List<DrmInitData.SchemeData> f3(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.f1511s);
        for (int i = 0; i < drmInitData.f1511s; i++) {
            DrmInitData.SchemeData schemeDataV = drmInitData.v(i);
            if ((schemeDataV.gv(uuid) || (ft.c5.zn.equals(uuid) && schemeDataV.gv(ft.c5.n3))) && (schemeDataV.f1513f != null || z)) {
                arrayList.add(schemeDataV);
            }
        }
        return arrayList;
    }

    public static boolean z(com.google.android.exoplayer2.drm.gv gvVar) {
        return gvVar.getState() == 1 && (ut.y < 19 || (((gv.y) v0.y.v(gvVar.getError())).getCause() instanceof ResourceBusyException));
    }

    @Nullable
    public final com.google.android.exoplayer2.drm.gv c(int i, boolean z) {
        i9 i9Var = (i9) v0.y.v(this.f1526mt);
        if ((i9Var.s() == 2 && i4.f8799gv) || ut.pq(this.f1529s, i) == -1 || i9Var.s() == 1) {
            return null;
        }
        com.google.android.exoplayer2.drm.y yVar = this.f1520co;
        if (yVar == null) {
            com.google.android.exoplayer2.drm.y yVarI4 = i4(r.yt(), true, null, z);
            this.f1533wz.add(yVarI4);
            this.f1520co = yVarI4;
        } else {
            yVar.y(null);
        }
        return this.f1520co;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final com.google.android.exoplayer2.drm.gv co(Looper looper, @Nullable v.y yVar, g gVar, boolean z) {
        List<DrmInitData.SchemeData> listF3;
        d0(looper);
        DrmInitData drmInitData = gVar.d0;
        if (drmInitData == null) {
            return c(v0.n.f(gVar.f3), z);
        }
        com.google.android.exoplayer2.drm.y yVarI4 = null;
        Object[] objArr = 0;
        if (this.f3 == null) {
            listF3 = f3((DrmInitData) v0.y.v(drmInitData), this.zn, false);
            if (listF3.isEmpty()) {
                v vVar = new v(this.zn);
                v0.r.gv("DefaultDrmSessionMgr", "DRM error", vVar);
                if (yVar != null) {
                    yVar.t(vVar);
                }
                return new c5(new gv.y(vVar, 6003));
            }
        } else {
            listF3 = null;
        }
        if (this.f1522fb) {
            Iterator<com.google.android.exoplayer2.drm.y> it = this.f1533wz.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.exoplayer2.drm.y next = it.next();
                if (ut.zn(next.y, listF3)) {
                    yVarI4 = next;
                    break;
                }
            }
        } else {
            yVarI4 = this.z;
        }
        if (yVarI4 == null) {
            yVarI4 = i4(listF3, false, yVar, z);
            if (!this.f1522fb) {
                this.z = yVarI4;
            }
            this.f1533wz.add(yVarI4);
        } else {
            yVarI4.y(yVar);
        }
        return yVarI4;
    }

    public final void d(com.google.android.exoplayer2.drm.gv gvVar, @Nullable v.y yVar) {
        gvVar.n3(yVar);
        if (this.f1531tl != -9223372036854775807L) {
            gvVar.n3(null);
        }
    }

    public final void d0(Looper looper) {
        if (this.c == null) {
            this.c = new gv(looper);
        }
    }

    public final void fh() {
        if (this.f1526mt != null && this.f1527p == 0 && this.f1533wz.isEmpty() && this.f1535xc.isEmpty()) {
            ((i9) v0.y.v(this.f1526mt)).release();
            this.f1526mt = null;
        }
    }

    @Override // com.google.android.exoplayer2.drm.a
    @Nullable
    public com.google.android.exoplayer2.drm.gv gv(@Nullable v.y yVar, g gVar) {
        z6(false);
        v0.y.fb(this.f1527p > 0);
        v0.y.c5(this.f1528r);
        return co(this.f1528r, yVar, gVar, true);
    }

    public final com.google.android.exoplayer2.drm.y i4(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable v.y yVar, boolean z5) {
        com.google.android.exoplayer2.drm.y yVarX4 = x4(list, z, yVar);
        if (z(yVarX4) && !this.w.isEmpty()) {
            rz();
            d(yVarX4, yVar);
            yVarX4 = x4(list, z, yVar);
        }
        if (!z(yVarX4) || !z5 || this.f1535xc.isEmpty()) {
            return yVarX4;
        }
        mg();
        if (!this.w.isEmpty()) {
            rz();
        }
        d(yVarX4, yVar);
        return x4(list, z, yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mg() {
        k it = k4.n.n(this.f1535xc).iterator();
        while (it.hasNext()) {
            ((a) it.next()).release();
        }
    }

    public final synchronized void n(Looper looper) {
        try {
            Looper looper2 = this.f1528r;
            if (looper2 == null) {
                this.f1528r = looper;
                this.f1534x4 = new Handler(looper);
            } else {
                v0.y.fb(looper2 == looper);
                v0.y.v(this.f1534x4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.drm.a
    public void n3(Looper looper, gn gnVar) {
        n(looper);
        this.n = gnVar;
    }

    @Override // com.google.android.exoplayer2.drm.a
    public final void prepare() {
        z6(true);
        int i = this.f1527p;
        this.f1527p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f1526mt == null) {
            i9 i9VarAcquireExoMediaDrm = this.f1523gv.acquireExoMediaDrm(this.zn);
            this.f1526mt = i9VarAcquireExoMediaDrm;
            i9VarAcquireExoMediaDrm.a(new zn());
        } else if (this.f1531tl != -9223372036854775807L) {
            for (int i5 = 0; i5 < this.f1533wz.size(); i5++) {
                this.f1533wz.get(i5).y(null);
            }
        }
    }

    public final boolean r(DrmInitData drmInitData) {
        if (this.f3 != null) {
            return true;
        }
        if (f3(drmInitData, this.zn, true).isEmpty()) {
            if (drmInitData.f1511s != 1 || !drmInitData.v(0).gv(ft.c5.n3)) {
                return false;
            }
            v0.r.c5("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.zn);
        }
        String str = drmInitData.f1510fb;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? ut.y >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    @Override // com.google.android.exoplayer2.drm.a
    public final void release() {
        z6(true);
        int i = this.f1527p - 1;
        this.f1527p = i;
        if (i != 0) {
            return;
        }
        if (this.f1531tl != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f1533wz);
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((com.google.android.exoplayer2.drm.y) arrayList.get(i5)).n3(null);
            }
        }
        mg();
        fh();
    }

    public final void rz() {
        k it = k4.n.n(this.w).iterator();
        while (it.hasNext()) {
            ((com.google.android.exoplayer2.drm.gv) it.next()).n3(null);
        }
    }

    public void ta(int i, @Nullable byte[] bArr) {
        v0.y.fb(this.f1533wz.isEmpty());
        if (i == 1 || i == 3) {
            v0.y.v(bArr);
        }
        this.f1524i4 = i;
        this.f3 = bArr;
    }

    public final com.google.android.exoplayer2.drm.y x4(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable v.y yVar) {
        v0.y.v(this.f1526mt);
        com.google.android.exoplayer2.drm.y yVar2 = new com.google.android.exoplayer2.drm.y(this.zn, this.f1526mt, this.f1525i9, this.f1530t, list, this.f1524i4, this.f1519c5 | z, z, this.f3, this.f1518a, this.f1532v, (Looper) v0.y.v(this.f1528r), this.f1521f, (gn) v0.y.v(this.n));
        yVar2.y(yVar);
        if (this.f1531tl != -9223372036854775807L) {
            yVar2.y(null);
        }
        return yVar2;
    }

    @Override // com.google.android.exoplayer2.drm.a
    public a.n3 y(@Nullable v.y yVar, g gVar) {
        v0.y.fb(this.f1527p > 0);
        v0.y.c5(this.f1528r);
        a aVar = new a(yVar);
        aVar.zn(gVar);
        return aVar;
    }

    public final void z6(boolean z) {
        if (z && this.f1528r == null) {
            v0.r.i9("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) v0.y.v(this.f1528r)).getThread()) {
            v0.r.i9("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f1528r.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // com.google.android.exoplayer2.drm.a
    public int zn(g gVar) {
        z6(false);
        int iS = ((i9) v0.y.v(this.f1526mt)).s();
        DrmInitData drmInitData = gVar.d0;
        if (drmInitData != null) {
            if (r(drmInitData)) {
                return iS;
            }
            return 1;
        }
        if (ut.pq(this.f1529s, v0.n.f(gVar.f3)) != -1) {
            return iS;
        }
        return 0;
    }

    public n3(UUID uuid, i9.zn znVar, tl tlVar, HashMap<String, String> map, boolean z, int[] iArr, boolean z5, mg mgVar, long j) {
        v0.y.v(uuid);
        v0.y.n3(!ft.c5.n3.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.zn = uuid;
        this.f1523gv = znVar;
        this.f1532v = tlVar;
        this.f1518a = map;
        this.f1522fb = z;
        this.f1529s = iArr;
        this.f1519c5 = z5;
        this.f1521f = mgVar;
        this.f1525i9 = new fb(this);
        this.f1530t = new s();
        this.f1524i4 = 0;
        this.f1533wz = new ArrayList();
        this.f1535xc = oz.s();
        this.w = oz.s();
        this.f1531tl = j;
    }
}
