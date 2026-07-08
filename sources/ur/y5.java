package ur;

import android.net.Uri;
import androidx.annotation.Nullable;
import ft.xb;
import ft.xq;

/* JADX INFO: loaded from: classes.dex */
public final class y5 extends xq {
    public final boolean c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final long f8676co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final xb f8677d;
    public final boolean d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    @Nullable
    public final xb.fb f8678ej;
    public final long f3;

    @Nullable
    public final Object fh;
    public final boolean n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f8679p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f8680r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f8681t;
    public final long w;
    public final long z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f8675x = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xb f8674b = new xb.zn().gv("SinglePeriodTimeline").s(Uri.EMPTY).y();

    public y5(long j, boolean z, boolean z5, boolean z7, @Nullable Object obj, xb xbVar) {
        this(j, j, 0L, 0L, z, z5, z7, obj, xbVar);
    }

    @Override // ft.xq
    public int a(Object obj) {
        return f8675x.equals(obj) ? 0 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ft.xq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ft.xq.gv co(int r25, ft.xq.gv r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            v0.y.zn(r3, r1, r2)
            long r1 = r0.f3
            boolean r14 = r0.c
            if (r14 == 0) goto L2e
            boolean r3 = r0.d0
            if (r3 != 0) goto L2e
            r3 = 0
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 == 0) goto L2e
            long r3 = r0.z
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = ft.xq.gv.f5153ej
            ft.xb r5 = r0.f8677d
            java.lang.Object r6 = r0.fh
            long r7 = r0.f8681t
            long r9 = r0.w
            long r11 = r0.f8679p
            boolean r13 = r0.n
            ft.xb$fb r15 = r0.f8678ej
            long r1 = r0.z
            r18 = r1
            r21 = 0
            long r1 = r0.f8680r
            r22 = r1
            r20 = 0
            r3 = r26
            ft.xq$gv r1 = r3.c5(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.y5.co(int, ft.xq$gv, long):ft.xq$gv");
    }

    @Override // ft.xq
    public xq.n3 f(int i, xq.n3 n3Var, boolean z) {
        v0.y.zn(i, 0, 1);
        return n3Var.r(null, z ? f8675x : null, 0, this.f8676co, -this.f8680r);
    }

    @Override // ft.xq
    public Object p(int i) {
        v0.y.zn(i, 0, 1);
        return f8675x;
    }

    @Override // ft.xq
    public int tl() {
        return 1;
    }

    @Override // ft.xq
    public int z() {
        return 1;
    }

    public y5(long j, long j4, long j7, long j8, boolean z, boolean z5, boolean z7, @Nullable Object obj, xb xbVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j4, j7, j8, z, z5, false, obj, xbVar, z7 ? xbVar.f5078s : null);
    }

    public y5(long j, long j4, long j7, long j8, long j9, long j10, long j11, boolean z, boolean z5, boolean z7, @Nullable Object obj, xb xbVar, @Nullable xb.fb fbVar) {
        this.f8681t = j;
        this.w = j4;
        this.f8679p = j7;
        this.f8676co = j8;
        this.z = j9;
        this.f8680r = j10;
        this.f3 = j11;
        this.n = z;
        this.c = z5;
        this.d0 = z7;
        this.fh = obj;
        this.f8677d = (xb) v0.y.v(xbVar);
        this.f8678ej = fbVar;
    }
}
