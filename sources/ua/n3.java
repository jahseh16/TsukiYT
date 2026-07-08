package ua;

import androidx.annotation.Nullable;
import b1.d0;
import b1.fh;
import b1.i9;
import b1.t;
import b1.ta;
import b1.tl;
import b1.wz;
import ft.g;
import ft.q;
import java.io.IOException;
import java.util.ArrayList;
import k4.k;
import v0.d;
import v0.n;
import v0.r;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements t {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public v f8371c5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f8376s;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f8378tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ua.zn f8379v;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f8380wz;
    public int zn;
    public final d y = new d(12);
    public final zn n3 = new zn();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public wz f8374gv = new i9();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public v[] f8373fb = new v[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8372f = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f8377t = -1;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f8375i9 = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8370a = -9223372036854775807L;

    /* JADX INFO: renamed from: ua.n3$n3, reason: collision with other inner class name */
    public class C0182n3 implements fh {
        public final long y;

        public C0182n3(long j) {
            this.y = j;
        }

        @Override // b1.fh
        public long c5() {
            return this.y;
        }

        @Override // b1.fh
        public boolean s() {
            return true;
        }

        @Override // b1.fh
        public fh.y v(long j) {
            fh.y yVarC5 = n3.this.f8373fb[0].c5(j);
            for (int i = 1; i < n3.this.f8373fb.length; i++) {
                fh.y yVarC52 = n3.this.f8373fb[i].c5(j);
                if (yVarC52.y.n3 < yVarC5.y.n3) {
                    yVarC5 = yVarC52;
                }
            }
            return yVarC5;
        }
    }

    public static class zn {
        public int n3;
        public int y;
        public int zn;

        public zn() {
        }

        public void n3(d dVar) throws q {
            y(dVar);
            if (this.y == 1414744396) {
                this.zn = dVar.r();
                return;
            }
            throw q.y("LIST expected, found: " + this.y, null);
        }

        public void y(d dVar) {
            this.y = dVar.r();
            this.n3 = dVar.r();
            this.zn = 0;
        }
    }

    public static void v(tl tlVar) throws IOException {
        if ((tlVar.getPosition() & 1) == 1) {
            tlVar.w(1);
        }
    }

    @Nullable
    public final v a(int i) {
        for (v vVar : this.f8373fb) {
            if (vVar.i9(i)) {
                return vVar;
            }
        }
        return null;
    }

    public final void c5(d dVar) {
        long jI9 = i9(dVar);
        while (dVar.y() >= 16) {
            int iR = dVar.r();
            int iR2 = dVar.r();
            long jR = ((long) dVar.r()) + jI9;
            dVar.r();
            v vVarA = a(iR);
            if (vVarA != null) {
                if ((iR2 & 16) == 16) {
                    vVarA.n3(jR);
                }
                vVarA.f();
            }
        }
        for (v vVar : this.f8373fb) {
            vVar.zn();
        }
        this.f8380wz = true;
        this.f8374gv.z(new C0182n3(this.f8370a));
    }

    @Nullable
    public final v f(a aVar, int i) {
        gv gvVar = (gv) aVar.n3(gv.class);
        fb fbVar = (fb) aVar.n3(fb.class);
        if (gvVar == null) {
            r.c5("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (fbVar == null) {
            r.c5("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jY = gvVar.y();
        g gVar = fbVar.y;
        g.n3 n3VarN3 = gVar.n3();
        n3VarN3.j(i);
        int i5 = gvVar.f8367a;
        if (i5 != 0) {
            n3VarN3.f7(i5);
        }
        s sVar = (s) aVar.n3(s.class);
        if (sVar != null) {
            n3VarN3.q9(sVar.y);
        }
        int iF = n.f(gVar.f3);
        if (iF != 1 && iF != 2) {
            return null;
        }
        ta taVarA = this.f8374gv.a(i, iF);
        taVarA.y(n3VarN3.z6());
        v vVar = new v(i, iF, jY, gvVar.f8369v, taVarA);
        this.f8370a = jY;
        return vVar;
    }

    @Override // b1.t
    public int fb(tl tlVar, d0 d0Var) throws IOException {
        if (tl(tlVar, d0Var)) {
            return 1;
        }
        switch (this.zn) {
            case 0:
                if (!gv(tlVar)) {
                    throw q.y("AVI Header List not found", null);
                }
                tlVar.w(12);
                this.zn = 1;
                return 0;
            case 1:
                tlVar.readFully(this.y.v(), 0, 12);
                this.y.oz(0);
                this.n3.n3(this.y);
                zn znVar = this.n3;
                if (znVar.zn == 1819436136) {
                    this.f8375i9 = znVar.n3;
                    this.zn = 2;
                    return 0;
                }
                throw q.y("hdrl expected, found: " + this.n3.zn, null);
            case 2:
                int i = this.f8375i9 - 4;
                d dVar = new d(i);
                tlVar.readFully(dVar.v(), 0, i);
                s(dVar);
                this.zn = 3;
                return 0;
            case 3:
                if (this.f8372f != -1) {
                    long position = tlVar.getPosition();
                    long j = this.f8372f;
                    if (position != j) {
                        this.f8376s = j;
                        return 0;
                    }
                }
                tlVar.z(this.y.v(), 0, 12);
                tlVar.s();
                this.y.oz(0);
                this.n3.y(this.y);
                int iR = this.y.r();
                int i5 = this.n3.y;
                if (i5 == 1179011410) {
                    tlVar.w(12);
                    return 0;
                }
                if (i5 != 1414744396 || iR != 1769369453) {
                    this.f8376s = tlVar.getPosition() + ((long) this.n3.n3) + 8;
                    return 0;
                }
                long position2 = tlVar.getPosition();
                this.f8372f = position2;
                this.f8377t = position2 + ((long) this.n3.n3) + 8;
                if (!this.f8380wz) {
                    if (((ua.zn) v0.y.v(this.f8379v)).y()) {
                        this.zn = 4;
                        this.f8376s = this.f8377t;
                        return 0;
                    }
                    this.f8374gv.z(new fh.n3(this.f8370a));
                    this.f8380wz = true;
                }
                this.f8376s = tlVar.getPosition() + 12;
                this.zn = 6;
                return 0;
            case 4:
                tlVar.readFully(this.y.v(), 0, 8);
                this.y.oz(0);
                int iR2 = this.y.r();
                int iR3 = this.y.r();
                if (iR2 == 829973609) {
                    this.zn = 5;
                    this.f8378tl = iR3;
                } else {
                    this.f8376s = tlVar.getPosition() + ((long) iR3);
                }
                return 0;
            case 5:
                d dVar2 = new d(this.f8378tl);
                tlVar.readFully(dVar2.v(), 0, this.f8378tl);
                c5(dVar2);
                this.zn = 6;
                this.f8376s = this.f8372f;
                return 0;
            case 6:
                return t(tlVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // b1.t
    public boolean gv(tl tlVar) throws IOException {
        tlVar.z(this.y.v(), 0, 12);
        this.y.oz(0);
        if (this.y.r() != 1179011410) {
            return false;
        }
        this.y.ut(4);
        return this.y.r() == 541677121;
    }

    public final long i9(d dVar) {
        if (dVar.y() < 16) {
            return 0L;
        }
        int iA = dVar.a();
        dVar.ut(8);
        long jR = dVar.r();
        long j = this.f8372f;
        long j4 = jR <= j ? j + 8 : 0L;
        dVar.oz(iA);
        return j4;
    }

    public final void s(d dVar) throws IOException {
        a aVarZn = a.zn(1819436136, dVar);
        if (aVarZn.getType() != 1819436136) {
            throw q.y("Unexpected header list type " + aVarZn.getType(), null);
        }
        ua.zn znVar = (ua.zn) aVarZn.n3(ua.zn.class);
        if (znVar == null) {
            throw q.y("AviHeader not found", null);
        }
        this.f8379v = znVar;
        this.f8370a = ((long) znVar.zn) * ((long) znVar.y);
        ArrayList arrayList = new ArrayList();
        k<ua.y> it = aVarZn.y.iterator();
        int i = 0;
        while (it.hasNext()) {
            ua.y next = it.next();
            if (next.getType() == 1819440243) {
                int i5 = i + 1;
                v vVarF = f((a) next, i);
                if (vVarF != null) {
                    arrayList.add(vVarF);
                }
                i = i5;
            }
        }
        this.f8373fb = (v[]) arrayList.toArray(new v[0]);
        this.f8374gv.p();
    }

    public final int t(tl tlVar) throws IOException {
        if (tlVar.getPosition() >= this.f8377t) {
            return -1;
        }
        v vVar = this.f8371c5;
        if (vVar == null) {
            v(tlVar);
            tlVar.z(this.y.v(), 0, 12);
            this.y.oz(0);
            int iR = this.y.r();
            if (iR == 1414744396) {
                this.y.oz(8);
                tlVar.w(this.y.r() != 1769369453 ? 8 : 12);
                tlVar.s();
                return 0;
            }
            int iR2 = this.y.r();
            if (iR == 1263424842) {
                this.f8376s = tlVar.getPosition() + ((long) iR2) + 8;
                return 0;
            }
            tlVar.w(8);
            tlVar.s();
            v vVarA = a(iR);
            if (vVarA == null) {
                this.f8376s = tlVar.getPosition() + ((long) iR2);
                return 0;
            }
            vVarA.wz(iR2);
            this.f8371c5 = vVarA;
        } else if (vVar.tl(tlVar)) {
            this.f8371c5 = null;
        }
        return 0;
    }

    public final boolean tl(tl tlVar, d0 d0Var) throws IOException {
        boolean z;
        if (this.f8376s != -1) {
            long position = tlVar.getPosition();
            long j = this.f8376s;
            if (j < position || j > 262144 + position) {
                d0Var.y = j;
                z = true;
            } else {
                tlVar.w((int) (j - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.f8376s = -1L;
        return z;
    }

    @Override // b1.t
    public void y(long j, long j4) {
        this.f8376s = -1L;
        this.f8371c5 = null;
        for (v vVar : this.f8373fb) {
            vVar.xc(j);
        }
        if (j != 0) {
            this.zn = 6;
        } else if (this.f8373fb.length == 0) {
            this.zn = 0;
        } else {
            this.zn = 3;
        }
    }

    @Override // b1.t
    public void zn(wz wzVar) {
        this.zn = 0;
        this.f8374gv = wzVar;
        this.f8376s = -1L;
    }

    @Override // b1.t
    public void release() {
    }
}
