package r0;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import java.util.HashMap;
import java.util.Map;
import r0.a;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class z implements a, o {

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    @Nullable
    public static z f7597x4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7598a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f7599c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7600f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f7601fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final v0.v f7602gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public long f7603i9;
    public final a.y.C0152y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f7604s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f7605t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f7606tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f7607v;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f7608wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public int f7609xc;
    public final k4.i4<Integer, Long> y;
    public final hw zn;
    public static final k4.r<Long> w = k4.r.jz(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k4.r<Long> f7595p = k4.r.jz(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public static final k4.r<Long> f7594mt = k4.r.jz(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final k4.r<Long> f7593co = k4.r.jz(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final k4.r<Long> z = k4.r.jz(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k4.r<Long> f7596r = k4.r.jz(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    public static final class n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public v0.v f7610gv;
        public Map<Integer, Long> n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f7611v;

        @Nullable
        public final Context y;
        public int zn;

        public n3(Context context) {
            this.y = context == null ? null : context.getApplicationContext();
            this.n3 = n3(ut.yt(context));
            this.zn = 2000;
            this.f7610gv = v0.v.y;
            this.f7611v = true;
        }

        public static Map<Integer, Long> n3(String str) {
            int[] iArrT = z.t(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            k4.r<Long> rVar = z.w;
            map.put(2, rVar.get(iArrT[0]));
            map.put(3, z.f7595p.get(iArrT[1]));
            map.put(4, z.f7594mt.get(iArrT[2]));
            map.put(5, z.f7593co.get(iArrT[3]));
            map.put(10, z.z.get(iArrT[4]));
            map.put(9, z.f7596r.get(iArrT[5]));
            map.put(7, rVar.get(iArrT[0]));
            return map;
        }

        public z y() {
            return new z(this.y, this.n3, this.zn, this.f7610gv, this.f7611v);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] t(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 8436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.z.t(java.lang.String):int[]");
    }

    public static synchronized z wz(Context context) {
        try {
            if (f7597x4 == null) {
                f7597x4 = new n3(context).y();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7597x4;
    }

    public static boolean xc(p pVar, boolean z5) {
        return z5 && !pVar.gv(8);
    }

    @Override // r0.o
    public synchronized void c5(tl tlVar, p pVar, boolean z5) {
        try {
            if (xc(pVar, z5)) {
                v0.y.fb(this.f7598a > 0);
                long jElapsedRealtime = this.f7602gv.elapsedRealtime();
                int i = (int) (jElapsedRealtime - this.f7601fb);
                this.f7603i9 += (long) i;
                long j = this.f7600f;
                long j4 = this.f7604s;
                this.f7600f = j + j4;
                if (i > 0) {
                    this.zn.zn((int) Math.sqrt(j4), (j4 * 8000.0f) / i);
                    if (this.f7603i9 >= 2000 || this.f7600f >= 524288) {
                        this.f7605t = (long) this.zn.a(0.5f);
                    }
                    w(i, this.f7604s, this.f7605t);
                    this.f7601fb = jElapsedRealtime;
                    this.f7604s = 0L;
                }
                this.f7598a--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // r0.o
    public synchronized void fb(tl tlVar, p pVar, boolean z5, int i) {
        if (xc(pVar, z5)) {
            this.f7604s += (long) i;
        }
    }

    @Override // r0.a
    public /* synthetic */ long n3() {
        return gv.y(this);
    }

    public final synchronized void p(int i) {
        int i5 = this.f7599c5;
        if (i5 == 0 || this.f7607v) {
            if (this.f7608wz) {
                i = this.f7609xc;
            }
            if (i5 == i) {
                return;
            }
            this.f7599c5 = i;
            if (i != 1 && i != 0 && i != 8) {
                this.f7605t = tl(i);
                long jElapsedRealtime = this.f7602gv.elapsedRealtime();
                w(this.f7598a > 0 ? (int) (jElapsedRealtime - this.f7601fb) : 0, this.f7604s, this.f7605t);
                this.f7601fb = jElapsedRealtime;
                this.f7604s = 0L;
                this.f7600f = 0L;
                this.f7603i9 = 0L;
                this.zn.c5();
            }
        }
    }

    @Override // r0.a
    public void s(Handler handler, a.y yVar) {
        v0.y.v(handler);
        v0.y.v(yVar);
        this.n3.n3(handler, yVar);
    }

    public final long tl(int i) {
        Long l3 = this.y.get(Integer.valueOf(i));
        if (l3 == null) {
            l3 = this.y.get(0);
        }
        if (l3 == null) {
            l3 = 1000000L;
        }
        return l3.longValue();
    }

    @Override // r0.a
    public synchronized long v() {
        return this.f7605t;
    }

    public final void w(int i, long j, long j4) {
        if (i == 0 && j == 0 && j4 == this.f7606tl) {
            return;
        }
        this.f7606tl = j4;
        this.n3.zn(i, j, j4);
    }

    @Override // r0.o
    public synchronized void y(tl tlVar, p pVar, boolean z5) {
        try {
            if (xc(pVar, z5)) {
                if (this.f7598a == 0) {
                    this.f7601fb = this.f7602gv.elapsedRealtime();
                }
                this.f7598a++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // r0.a
    public void zn(a.y yVar) {
        this.n3.v(yVar);
    }

    public z(@Nullable Context context, Map<Integer, Long> map, int i, v0.v vVar, boolean z5) {
        this.y = k4.i4.f(map);
        this.n3 = new a.y.C0152y();
        this.zn = new hw(i);
        this.f7602gv = vVar;
        this.f7607v = z5;
        if (context == null) {
            this.f7599c5 = 0;
            this.f7605t = tl(0);
            return;
        }
        NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
        int networkType = networkTypeObserver.getNetworkType();
        this.f7599c5 = networkType;
        this.f7605t = tl(networkType);
        networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: r0.co
            @Override // com.google.android.exoplayer2.util.NetworkTypeObserver.Listener
            public final void onNetworkTypeChanged(int i5) {
                this.y.p(i5);
            }
        });
    }

    @Override // r0.a
    public o gv() {
        return this;
    }

    @Override // r0.o
    public void a(tl tlVar, p pVar, boolean z5) {
    }
}
