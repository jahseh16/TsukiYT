package lf;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ft.g;
import ft.q;
import java.util.Collections;
import lf.ud;
import mn.y;

/* JADX INFO: loaded from: classes.dex */
public final class co implements tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f6248a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f6249c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f6250co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6251f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f6252fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public b1.ta f6253gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f6254i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public int f6255mt;
    public final v0.d n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6256p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public String f6257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6259t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f6260tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f6261v;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int f6262wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public int f6263xc;

    @Nullable
    public final String y;
    public int z;
    public final v0.ta zn;

    public co(@Nullable String str) {
        this.y = str;
        v0.d dVar = new v0.d(UserMetadata.MAX_ATTRIBUTE_SIZE);
        this.n3 = dVar;
        this.zn = new v0.ta(dVar.v());
        this.f6251f = -9223372036854775807L;
    }

    public static long n3(v0.ta taVar) {
        return taVar.s((taVar.s(2) + 1) * 8);
    }

    @Override // lf.tl
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f6251f = j;
        }
    }

    public final void c5(v0.ta taVar) {
        int iS = taVar.s(3);
        this.f6263xc = iS;
        if (iS == 0) {
            taVar.mt(8);
            return;
        }
        if (iS == 1) {
            taVar.mt(9);
            return;
        }
        if (iS == 3 || iS == 4 || iS == 5) {
            taVar.mt(6);
        } else {
            if (iS != 6 && iS != 7) {
                throw new IllegalStateException();
            }
            taVar.mt(1);
        }
    }

    public final void f(v0.ta taVar, int i) {
        int iV = taVar.v();
        if ((iV & 7) == 0) {
            this.n3.oz(iV >> 3);
        } else {
            taVar.c5(this.n3.v(), 0, i * 8);
            this.n3.oz(0);
        }
        this.f6253gv.n3(this.n3, i);
        long j = this.f6251f;
        if (j != -9223372036854775807L) {
            this.f6253gv.a(j, 1, i, 0, null);
            this.f6251f += this.f6250co;
        }
    }

    public final void fb(v0.ta taVar) throws q {
        if (!taVar.fb()) {
            this.f6259t = true;
            t(taVar);
        } else if (!this.f6259t) {
            return;
        }
        if (this.f6260tl != 0) {
            throw q.y(null, null);
        }
        if (this.f6262wz != 0) {
            throw q.y(null, null);
        }
        f(taVar, i9(taVar));
        if (this.w) {
            taVar.mt((int) this.f6256p);
        }
    }

    public final int i9(v0.ta taVar) throws q {
        int iS;
        if (this.f6263xc != 0) {
            throw q.y(null, null);
        }
        int i = 0;
        do {
            iS = taVar.s(8);
            i += iS;
        } while (iS == 255);
        return i;
    }

    public final int s(v0.ta taVar) throws q {
        int iN3 = taVar.n3();
        y.n3 n3VarV = mn.y.v(taVar, true);
        this.f6257r = n3VarV.zn;
        this.f6255mt = n3VarV.y;
        this.z = n3VarV.n3;
        return iN3 - taVar.n3();
    }

    public final void t(v0.ta taVar) throws q {
        boolean zFb;
        int iS = taVar.s(1);
        int iS2 = iS == 1 ? taVar.s(1) : 0;
        this.f6260tl = iS2;
        if (iS2 != 0) {
            throw q.y(null, null);
        }
        if (iS == 1) {
            n3(taVar);
        }
        if (!taVar.fb()) {
            throw q.y(null, null);
        }
        this.f6262wz = taVar.s(6);
        int iS3 = taVar.s(4);
        int iS4 = taVar.s(3);
        if (iS3 != 0 || iS4 != 0) {
            throw q.y(null, null);
        }
        if (iS == 0) {
            int iV = taVar.v();
            int iS5 = s(taVar);
            taVar.w(iV);
            byte[] bArr = new byte[(iS5 + 7) / 8];
            taVar.c5(bArr, 0, iS5);
            g gVarZ6 = new g.n3().oz(this.f6261v).o4("audio/mp4a-latm").x(this.f6257r).a8(this.z).rs(this.f6255mt).ut(Collections.singletonList(bArr)).k(this.y).z6();
            if (!gVarZ6.equals(this.f6248a)) {
                this.f6248a = gVarZ6;
                this.f6250co = 1024000000 / ((long) gVarZ6.oz);
                this.f6253gv.y(gVarZ6);
            }
        } else {
            taVar.mt(((int) n3(taVar)) - s(taVar));
        }
        c5(taVar);
        boolean zFb2 = taVar.fb();
        this.w = zFb2;
        this.f6256p = 0L;
        if (zFb2) {
            if (iS == 1) {
                this.f6256p = n3(taVar);
            } else {
                do {
                    zFb = taVar.fb();
                    this.f6256p = (this.f6256p << 8) + ((long) taVar.s(8));
                } while (zFb);
            }
        }
        if (taVar.fb()) {
            taVar.mt(8);
        }
    }

    public final void tl(int i) {
        this.n3.j5(i);
        this.zn.wz(this.n3.v());
    }

    @Override // lf.tl
    public void v(b1.wz wzVar, ud.gv gvVar) {
        gvVar.y();
        this.f6253gv = wzVar.a(gvVar.zn(), 1);
        this.f6261v = gvVar.n3();
    }

    @Override // lf.tl
    public void y(v0.d dVar) throws q {
        v0.y.c5(this.f6253gv);
        while (dVar.y() > 0) {
            int i = this.f6252fb;
            if (i != 0) {
                if (i == 1) {
                    int iEj = dVar.ej();
                    if ((iEj & 224) == 224) {
                        this.f6254i9 = iEj;
                        this.f6252fb = 2;
                    } else if (iEj != 86) {
                        this.f6252fb = 0;
                    }
                } else if (i == 2) {
                    int iEj2 = ((this.f6254i9 & (-225)) << 8) | dVar.ej();
                    this.f6249c5 = iEj2;
                    if (iEj2 > this.n3.v().length) {
                        tl(this.f6249c5);
                    }
                    this.f6258s = 0;
                    this.f6252fb = 3;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(dVar.y(), this.f6249c5 - this.f6258s);
                    dVar.t(this.zn.y, this.f6258s, iMin);
                    int i5 = this.f6258s + iMin;
                    this.f6258s = i5;
                    if (i5 == this.f6249c5) {
                        this.zn.w(0);
                        fb(this.zn);
                        this.f6252fb = 0;
                    }
                }
            } else if (dVar.ej() == 86) {
                this.f6252fb = 1;
            }
        }
    }

    @Override // lf.tl
    public void zn() {
        this.f6252fb = 0;
        this.f6251f = -9223372036854775807L;
        this.f6259t = false;
    }

    @Override // lf.tl
    public void gv() {
    }
}
