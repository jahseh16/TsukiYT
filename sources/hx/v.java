package hx;

import androidx.annotation.Nullable;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f5401t = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f5402a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final int f5403c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f5404f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f5405fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final byte f5406gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final byte[] f5407i9;
    public final boolean n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f5408s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f5409v;
    public final byte y;
    public final boolean zn;

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5410a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f5412gv;
        public boolean n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f5414v;
        public boolean y;
        public byte zn;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public byte[] f5411fb = v.f5401t;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public byte[] f5413s = v.f5401t;

        public v c5() {
            return new v(this);
        }

        public n3 f(boolean z) {
            this.n3 = z;
            return this;
        }

        public n3 i9(byte[] bArr) {
            v0.y.v(bArr);
            this.f5411fb = bArr;
            return this;
        }

        public n3 p(long j) {
            this.f5414v = j;
            return this;
        }

        public n3 t(boolean z) {
            this.y = z;
            return this;
        }

        public n3 tl(byte[] bArr) {
            v0.y.v(bArr);
            this.f5413s = bArr;
            return this;
        }

        public n3 w(int i) {
            this.f5410a = i;
            return this;
        }

        public n3 wz(byte b4) {
            this.zn = b4;
            return this;
        }

        public n3 xc(int i) {
            v0.y.y(i >= 0 && i <= 65535);
            this.f5412gv = i & 65535;
            return this;
        }
    }

    @Nullable
    public static v gv(d dVar) {
        byte[] bArr;
        if (dVar.y() < 12) {
            return null;
        }
        int iEj = dVar.ej();
        byte b4 = (byte) (iEj >> 6);
        boolean z = ((iEj >> 5) & 1) == 1;
        byte b6 = (byte) (iEj & 15);
        if (b4 != 2) {
            return null;
        }
        int iEj2 = dVar.ej();
        boolean z5 = ((iEj2 >> 7) & 1) == 1;
        byte b7 = (byte) (iEj2 & 127);
        int iYt = dVar.yt();
        long jA8 = dVar.a8();
        int iP = dVar.p();
        if (b6 > 0) {
            bArr = new byte[b6 * 4];
            for (int i = 0; i < b6; i++) {
                dVar.t(bArr, i * 4, 4);
            }
        } else {
            bArr = f5401t;
        }
        byte[] bArr2 = new byte[dVar.y()];
        dVar.t(bArr2, 0, dVar.y());
        return new n3().t(z).f(z5).wz(b7).xc(iYt).p(jA8).w(iP).i9(bArr).tl(bArr2).c5();
    }

    public static int n3(int i) {
        return m4.n3.n3(i + 1, 65536);
    }

    public static int zn(int i) {
        return m4.n3.n3(i - 1, 65536);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f5402a == vVar.f5402a && this.f5405fb == vVar.f5405fb && this.f5409v == vVar.f5409v && this.f5408s == vVar.f5408s && this.f5403c5 == vVar.f5403c5;
    }

    public int hashCode() {
        int i = (((((527 + this.f5402a) * 31) + this.f5405fb) * 31) + (this.f5409v ? 1 : 0)) * 31;
        long j = this.f5408s;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.f5403c5;
    }

    public String toString() {
        return ut.rz("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f5402a), Integer.valueOf(this.f5405fb), Long.valueOf(this.f5408s), Integer.valueOf(this.f5403c5), Boolean.valueOf(this.f5409v));
    }

    public v(n3 n3Var) {
        this.y = (byte) 2;
        this.n3 = n3Var.y;
        this.zn = false;
        this.f5409v = n3Var.n3;
        this.f5402a = n3Var.zn;
        this.f5405fb = n3Var.f5412gv;
        this.f5408s = n3Var.f5414v;
        this.f5403c5 = n3Var.f5410a;
        byte[] bArr = n3Var.f5411fb;
        this.f5407i9 = bArr;
        this.f5406gv = (byte) (bArr.length / 4);
        this.f5404f = n3Var.f5413s;
    }
}
