package ft;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class f implements cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4725a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final boolean f4726c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4727f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f4728fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f4729gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f4730i9;
    public final long n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f4731s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f4732v;
    public final r0.mt y;
    public final long zn;

    public static final class y {

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public boolean f4737i9;

        @Nullable
        public r0.mt y;
        public int n3 = 50000;
        public int zn = 50000;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f4736gv = 2500;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f4739v = 5000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4733a = -1;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f4735fb = false;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f4738s = 0;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public boolean f4734c5 = false;

        public y n3(int i, int i5, int i8, int i10) {
            v0.y.fb(!this.f4737i9);
            f.i9(i8, 0, "bufferForPlaybackMs", "0");
            f.i9(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
            f.i9(i, i8, "minBufferMs", "bufferForPlaybackMs");
            f.i9(i, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            f.i9(i5, i, "maxBufferMs", "minBufferMs");
            this.n3 = i;
            this.zn = i5;
            this.f4736gv = i8;
            this.f4739v = i10;
            return this;
        }

        public f y() {
            v0.y.fb(!this.f4737i9);
            this.f4737i9 = true;
            if (this.y == null) {
                this.y = new r0.mt(true, 65536);
            }
            return new f(this.y, this.n3, this.zn, this.f4736gv, this.f4739v, this.f4733a, this.f4735fb, this.f4738s, this.f4734c5);
        }
    }

    public f() {
        this(new r0.mt(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public static void i9(int i, int i5, String str, String str2) {
        v0.y.n3(i >= i5, str + " cannot be less than " + str2);
    }

    public static int t(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // ft.cr
    public void a(hk[] hkVarArr, ur.lc lcVar, n0.c[] cVarArr) {
        int iF = this.f4725a;
        if (iF == -1) {
            iF = f(hkVarArr, cVarArr);
        }
        this.f4730i9 = iF;
        this.y.s(iF);
    }

    public int f(hk[] hkVarArr, n0.c[] cVarArr) {
        int iT = 0;
        for (int i = 0; i < hkVarArr.length; i++) {
            if (cVarArr[i] != null) {
                iT += t(hkVarArr[i].s());
            }
        }
        return Math.max(13107200, iT);
    }

    @Override // ft.cr
    public void fb() {
        tl(true);
    }

    @Override // ft.cr
    public r0.n3 gv() {
        return this.y;
    }

    @Override // ft.cr
    public long n3() {
        return this.f4731s;
    }

    @Override // ft.cr
    public void onPrepared() {
        tl(false);
    }

    @Override // ft.cr
    public boolean s(long j, long j4, float f3) {
        boolean z = true;
        boolean z5 = this.y.a() >= this.f4730i9;
        long jMin = this.n3;
        if (f3 > 1.0f) {
            jMin = Math.min(v0.ut.u(jMin, f3), this.zn);
        }
        if (j4 < Math.max(jMin, 500000L)) {
            if (!this.f4728fb && z5) {
                z = false;
            }
            this.f4727f = z;
            if (!z && j4 < 500000) {
                v0.r.c5("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j4 >= this.zn || z5) {
            this.f4727f = false;
        }
        return this.f4727f;
    }

    public final void tl(boolean z) {
        int i = this.f4725a;
        if (i == -1) {
            i = 13107200;
        }
        this.f4730i9 = i;
        this.f4727f = false;
        if (z) {
            this.y.fb();
        }
    }

    @Override // ft.cr
    public void v() {
        tl(true);
    }

    @Override // ft.cr
    public boolean y() {
        return this.f4726c5;
    }

    @Override // ft.cr
    public boolean zn(long j, float f3, boolean z, long j4) {
        long jO4 = v0.ut.o4(j, f3);
        long jMin = z ? this.f4732v : this.f4729gv;
        if (j4 != -9223372036854775807L) {
            jMin = Math.min(j4 / 2, jMin);
        }
        return jMin <= 0 || jO4 >= jMin || (!this.f4728fb && this.y.a() >= this.f4730i9);
    }

    public f(r0.mt mtVar, int i, int i5, int i8, int i10, int i11, boolean z, int i12, boolean z5) {
        i9(i8, 0, "bufferForPlaybackMs", "0");
        i9(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i9(i, i8, "minBufferMs", "bufferForPlaybackMs");
        i9(i, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i9(i5, i, "maxBufferMs", "minBufferMs");
        i9(i12, 0, "backBufferDurationMs", "0");
        this.y = mtVar;
        this.n3 = v0.ut.xb(i);
        this.zn = v0.ut.xb(i5);
        this.f4729gv = v0.ut.xb(i8);
        this.f4732v = v0.ut.xb(i10);
        this.f4725a = i11;
        this.f4730i9 = i11 == -1 ? 13107200 : i11;
        this.f4728fb = z;
        this.f4731s = v0.ut.xb(i12);
        this.f4726c5 = z5;
    }
}
