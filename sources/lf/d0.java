package lf;

import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import b1.fh;
import ft.q;
import java.io.IOException;
import java.util.Map;
import lf.ud;
import v0.hw;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements b1.t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b1.mt f6270t = new b1.mt() { // from class: lf.c
        @Override // b1.mt
        public final b1.t[] createExtractors() {
            return d0.v();
        }

        @Override // b1.mt
        public /* synthetic */ b1.t[] y(Uri uri, Map map) {
            return b1.p.y(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6271a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public f3 f6272c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6273f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f6274fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final n f6275gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public b1.wz f6276i9;
    public final SparseArray<y> n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6277s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6278v;
    public final hw y;
    public final v0.d zn;

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6279a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f6280fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f6281gv;
        public final hw n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f6282s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f6283v;
        public final tl y;
        public final v0.ta zn = new v0.ta(new byte[64]);

        public y(tl tlVar, hw hwVar) {
            this.y = tlVar;
            this.n3 = hwVar;
        }

        public void gv() {
            this.f6279a = false;
            this.y.zn();
        }

        public final void n3() {
            this.zn.mt(8);
            this.f6281gv = this.zn.fb();
            this.f6283v = this.zn.fb();
            this.zn.mt(6);
            this.f6280fb = this.zn.s(8);
        }

        public void y(v0.d dVar) throws q {
            dVar.t(this.zn.y, 0, 3);
            this.zn.w(0);
            n3();
            dVar.t(this.zn.y, 0, this.f6280fb);
            this.zn.w(0);
            zn();
            this.y.a(this.f6282s, 4);
            this.y.y(dVar);
            this.y.gv();
        }

        public final void zn() {
            this.f6282s = 0L;
            if (this.f6281gv) {
                this.zn.mt(4);
                long jS = ((long) this.zn.s(3)) << 30;
                this.zn.mt(1);
                long jS2 = jS | ((long) (this.zn.s(15) << 15));
                this.zn.mt(1);
                long jS3 = jS2 | ((long) this.zn.s(15));
                this.zn.mt(1);
                if (!this.f6279a && this.f6283v) {
                    this.zn.mt(4);
                    long jS4 = ((long) this.zn.s(3)) << 30;
                    this.zn.mt(1);
                    long jS5 = jS4 | ((long) (this.zn.s(15) << 15));
                    this.zn.mt(1);
                    long jS6 = jS5 | ((long) this.zn.s(15));
                    this.zn.mt(1);
                    this.n3.n3(jS6);
                    this.f6279a = true;
                }
                this.f6282s = this.n3.n3(jS3);
            }
        }
    }

    public d0() {
        this(new hw(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b1.t[] v() {
        return new b1.t[]{new d0()};
    }

    public final void a(long j) {
        if (this.f6273f) {
            return;
        }
        this.f6273f = true;
        if (this.f6275gv.zn() == -9223372036854775807L) {
            this.f6276i9.z(new fh.n3(this.f6275gv.zn()));
            return;
        }
        f3 f3Var = new f3(this.f6275gv.gv(), this.f6275gv.zn(), j);
        this.f6272c5 = f3Var;
        this.f6276i9.z(f3Var.n3());
    }

    @Override // b1.t
    public int fb(b1.tl tlVar, b1.d0 d0Var) throws IOException {
        tl wzVar;
        v0.y.c5(this.f6276i9);
        long length = tlVar.getLength();
        if (length != -1 && !this.f6275gv.v()) {
            return this.f6275gv.fb(tlVar, d0Var);
        }
        a(length);
        f3 f3Var = this.f6272c5;
        if (f3Var != null && f3Var.gv()) {
            return this.f6272c5.zn(tlVar, d0Var);
        }
        tlVar.s();
        long jF = length != -1 ? length - tlVar.f() : -1L;
        if ((jF != -1 && jF < 4) || !tlVar.v(this.zn.v(), 0, 4, true)) {
            return -1;
        }
        this.zn.oz(0);
        int iP = this.zn.p();
        if (iP == 441) {
            return -1;
        }
        if (iP == 442) {
            tlVar.z(this.zn.v(), 0, 10);
            this.zn.oz(9);
            tlVar.w((this.zn.ej() & 7) + 14);
            return 0;
        }
        if (iP == 443) {
            tlVar.z(this.zn.v(), 0, 2);
            this.zn.oz(0);
            tlVar.w(this.zn.yt() + 6);
            return 0;
        }
        if (((iP & (-256)) >> 8) != 1) {
            tlVar.w(1);
            return 0;
        }
        int i = iP & 255;
        y yVar = this.n3.get(i);
        if (!this.f6278v) {
            if (yVar == null) {
                if (i == 189) {
                    wzVar = new zn();
                    this.f6271a = true;
                    this.f6277s = tlVar.getPosition();
                } else if ((iP & 224) == 192) {
                    wzVar = new z();
                    this.f6271a = true;
                    this.f6277s = tlVar.getPosition();
                } else if ((iP & 240) == 224) {
                    wzVar = new wz();
                    this.f6274fb = true;
                    this.f6277s = tlVar.getPosition();
                } else {
                    wzVar = null;
                }
                if (wzVar != null) {
                    wzVar.v(this.f6276i9, new ud.gv(i, NotificationCompat.FLAG_LOCAL_ONLY));
                    yVar = new y(wzVar, this.y);
                    this.n3.put(i, yVar);
                }
            }
            if (tlVar.getPosition() > ((this.f6271a && this.f6274fb) ? this.f6277s + 8192 : 1048576L)) {
                this.f6278v = true;
                this.f6276i9.p();
            }
        }
        tlVar.z(this.zn.v(), 0, 2);
        this.zn.oz(0);
        int iYt = this.zn.yt() + 6;
        if (yVar == null) {
            tlVar.w(iYt);
        } else {
            this.zn.j5(iYt);
            tlVar.readFully(this.zn.v(), 0, iYt);
            this.zn.oz(6);
            yVar.y(this.zn);
            v0.d dVar = this.zn;
            dVar.j(dVar.n3());
        }
        return 0;
    }

    @Override // b1.t
    public boolean gv(b1.tl tlVar) throws IOException {
        byte[] bArr = new byte[14];
        tlVar.z(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        tlVar.tl(bArr[13] & 7);
        tlVar.z(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // b1.t
    public void y(long j, long j4) {
        boolean z = this.y.v() == -9223372036854775807L;
        if (!z) {
            long jZn = this.y.zn();
            z = (jZn == -9223372036854775807L || jZn == 0 || jZn == j4) ? false : true;
        }
        if (z) {
            this.y.fb(j4);
        }
        f3 f3Var = this.f6272c5;
        if (f3Var != null) {
            f3Var.s(j4);
        }
        for (int i = 0; i < this.n3.size(); i++) {
            this.n3.valueAt(i).gv();
        }
    }

    @Override // b1.t
    public void zn(b1.wz wzVar) {
        this.f6276i9 = wzVar;
    }

    public d0(hw hwVar) {
        this.y = hwVar;
        this.zn = new v0.d(4096);
        this.n3 = new SparseArray<>();
        this.f6275gv = new n();
    }

    @Override // b1.t
    public void release() {
    }
}
