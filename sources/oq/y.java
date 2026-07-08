package oq;

import androidx.annotation.Nullable;
import b1.d0;
import b1.fh;
import b1.t;
import b1.tl;
import b1.wz;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ft.g;
import java.io.IOException;
import tn.f;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class y implements t {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public zn f7187c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public MotionPhotoMetadata f7188fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f7189gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public f f7190i9;
    public wz n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public tl f7191s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7192v;
    public int zn;
    public final d y = new d(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7186a = -1;

    @Nullable
    public static MotionPhotoMetadata a(String str, long j) throws IOException {
        n3 n3VarY;
        if (j == -1 || (n3VarY = v.y(str)) == null) {
            return null;
        }
        return n3VarY.y(j);
    }

    public final int c5(tl tlVar) throws IOException {
        this.y.j5(2);
        tlVar.z(this.y.v(), 0, 2);
        return this.y.yt();
    }

    public final void f(tl tlVar) throws IOException {
        String strFh;
        if (this.f7189gv == 65505) {
            d dVar = new d(this.f7192v);
            tlVar.readFully(dVar.v(), 0, this.f7192v);
            if (this.f7188fb == null && "http://ns.adobe.com/xap/1.0/".equals(dVar.fh()) && (strFh = dVar.fh()) != null) {
                MotionPhotoMetadata motionPhotoMetadataA = a(strFh, tlVar.getLength());
                this.f7188fb = motionPhotoMetadataA;
                if (motionPhotoMetadataA != null) {
                    this.f7186a = motionPhotoMetadataA.f1639s;
                }
            }
        } else {
            tlVar.w(this.f7192v);
        }
        this.zn = 0;
    }

    @Override // b1.t
    public int fb(tl tlVar, d0 d0Var) throws IOException {
        int i = this.zn;
        if (i == 0) {
            i9(tlVar);
            return 0;
        }
        if (i == 1) {
            t(tlVar);
            return 0;
        }
        if (i == 2) {
            f(tlVar);
            return 0;
        }
        if (i == 4) {
            long position = tlVar.getPosition();
            long j = this.f7186a;
            if (position != j) {
                d0Var.y = j;
                return 1;
            }
            tl(tlVar);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f7187c5 == null || tlVar != this.f7191s) {
            this.f7191s = tlVar;
            this.f7187c5 = new zn(tlVar, this.f7186a);
        }
        int iFb = ((f) v0.y.v(this.f7190i9)).fb(this.f7187c5, d0Var);
        if (iFb == 1) {
            d0Var.y += this.f7186a;
        }
        return iFb;
    }

    @Override // b1.t
    public boolean gv(tl tlVar) throws IOException {
        if (c5(tlVar) != 65496) {
            return false;
        }
        int iC5 = c5(tlVar);
        this.f7189gv = iC5;
        if (iC5 == 65504) {
            n3(tlVar);
            this.f7189gv = c5(tlVar);
        }
        if (this.f7189gv != 65505) {
            return false;
        }
        tlVar.tl(2);
        this.y.j5(6);
        tlVar.z(this.y.v(), 0, 6);
        return this.y.a8() == 1165519206 && this.y.yt() == 0;
    }

    public final void i9(tl tlVar) throws IOException {
        this.y.j5(2);
        tlVar.readFully(this.y.v(), 0, 2);
        int iYt = this.y.yt();
        this.f7189gv = iYt;
        if (iYt == 65498) {
            if (this.f7186a != -1) {
                this.zn = 4;
                return;
            } else {
                v();
                return;
            }
        }
        if ((iYt < 65488 || iYt > 65497) && iYt != 65281) {
            this.zn = 1;
        }
    }

    public final void n3(tl tlVar) throws IOException {
        this.y.j5(2);
        tlVar.z(this.y.v(), 0, 2);
        tlVar.tl(this.y.yt() - 2);
    }

    @Override // b1.t
    public void release() {
        f fVar = this.f7190i9;
        if (fVar != null) {
            fVar.release();
        }
    }

    public final void s(Metadata.Entry... entryArr) {
        ((wz) v0.y.v(this.n3)).a(UserMetadata.MAX_ATTRIBUTE_SIZE, 4).y(new g.n3().k5("image/jpeg").en(new Metadata(entryArr)).z6());
    }

    public final void t(tl tlVar) throws IOException {
        this.y.j5(2);
        tlVar.readFully(this.y.v(), 0, 2);
        this.f7192v = this.y.yt() - 2;
        this.zn = 2;
    }

    public final void tl(tl tlVar) throws IOException {
        if (!tlVar.v(this.y.v(), 0, 1, true)) {
            v();
            return;
        }
        tlVar.s();
        if (this.f7190i9 == null) {
            this.f7190i9 = new f();
        }
        zn znVar = new zn(tlVar, this.f7186a);
        this.f7187c5 = znVar;
        if (!this.f7190i9.gv(znVar)) {
            v();
        } else {
            this.f7190i9.zn(new gv(this.f7186a, (wz) v0.y.v(this.n3)));
            wz();
        }
    }

    public final void v() {
        s(new Metadata.Entry[0]);
        ((wz) v0.y.v(this.n3)).p();
        this.n3.z(new fh.n3(-9223372036854775807L));
        this.zn = 6;
    }

    public final void wz() {
        s((Metadata.Entry) v0.y.v(this.f7188fb));
        this.zn = 5;
    }

    @Override // b1.t
    public void y(long j, long j4) {
        if (j == 0) {
            this.zn = 0;
            this.f7190i9 = null;
        } else if (this.zn == 5) {
            ((f) v0.y.v(this.f7190i9)).y(j, j4);
        }
    }

    @Override // b1.t
    public void zn(wz wzVar) {
        this.n3 = wzVar;
    }
}
