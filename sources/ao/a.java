package ao;

import android.net.Uri;
import androidx.annotation.Nullable;
import ao.fb;
import b1.d0;
import b1.f;
import b1.f3;
import b1.mt;
import b1.n;
import b1.p;
import b1.t;
import b1.ta;
import b1.tl;
import b1.wz;
import bp.n3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import ft.g;
import ft.q;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import mn.yt;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final mt f1152r = new mt() { // from class: ao.gv
        @Override // b1.mt
        public final t[] createExtractors() {
            return a.xc();
        }

        @Override // b1.mt
        public /* synthetic */ t[] y(Uri uri, Map map) {
            return p.y(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final n3.y f1153x4 = new n3.y() { // from class: ao.v
        @Override // bp.n3.y
        public final boolean evaluate(int i, int i5, int i8, int i10, int i11) {
            return a.w(i, i5, i8, i10, i11);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f1154a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public ta f1155c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f1156co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1157f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final ta f1158fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final yt.y f1159gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public ta f1160i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public boolean f1161mt;
    public final long n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public fb f1162p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public wz f1163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Metadata f1164t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f1165tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f3 f1166v;
    public int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public long f1167wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public long f1168xc;
    public final int y;
    public long z;
    public final d zn;

    public a() {
        this(0);
    }

    private void a() {
        v0.y.c5(this.f1155c5);
        ut.i9(this.f1163s);
    }

    @Nullable
    public static zn p(@Nullable Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int iV = metadata.v();
        for (int i = 0; i < iV; i++) {
            Metadata.Entry entryGv = metadata.gv(i);
            if (entryGv instanceof MlltFrame) {
                return zn.y(j, (MlltFrame) entryGv, t(metadata));
            }
        }
        return null;
    }

    private int r(tl tlVar) throws IOException {
        if (this.w == 0) {
            tlVar.s();
            if (co(tlVar)) {
                return -1;
            }
            this.zn.oz(0);
            int iP = this.zn.p();
            if (!wz(iP, this.f1157f) || yt.i9(iP) == -1) {
                tlVar.w(1);
                this.f1157f = 0;
                return 0;
            }
            this.f1159gv.y(iP);
            if (this.f1165tl == -9223372036854775807L) {
                this.f1165tl = this.f1162p.n3(tlVar.getPosition());
                if (this.n3 != -9223372036854775807L) {
                    this.f1165tl += this.n3 - this.f1162p.n3(0L);
                }
            }
            yt.y yVar = this.f1159gv;
            this.w = yVar.zn;
            fb fbVar = this.f1162p;
            if (fbVar instanceof n3) {
                n3 n3Var = (n3) fbVar;
                n3Var.zn(c5(this.f1167wz + ((long) yVar.f6703fb)), tlVar.getPosition() + ((long) this.f1159gv.zn));
                if (this.f1156co && n3Var.y(this.z)) {
                    this.f1156co = false;
                    this.f1160i9 = this.f1155c5;
                }
            }
        }
        int iV = this.f1160i9.v(tlVar, this.w, true);
        if (iV == -1) {
            return -1;
        }
        int i = this.w - iV;
        this.w = i;
        if (i > 0) {
            return 0;
        }
        this.f1160i9.a(c5(this.f1167wz), 1, this.f1159gv.zn, 0, null);
        this.f1167wz += (long) this.f1159gv.f6703fb;
        this.w = 0;
        return 0;
    }

    public static long t(@Nullable Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int iV = metadata.v();
        for (int i = 0; i < iV; i++) {
            Metadata.Entry entryGv = metadata.gv(i);
            if (entryGv instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryGv;
                if (textInformationFrame.y.equals("TLEN")) {
                    return ut.xb(Long.parseLong(textInformationFrame.f1630s.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int tl(d dVar, int i) {
        if (dVar.fb() >= i + 4) {
            dVar.oz(i);
            int iP = dVar.p();
            if (iP == 1483304551 || iP == 1231971951) {
                return iP;
            }
        }
        if (dVar.fb() < 40) {
            return 0;
        }
        dVar.oz(36);
        return dVar.p() == 1447187017 ? 1447187017 : 0;
    }

    public static /* synthetic */ boolean w(int i, int i5, int i8, int i10, int i11) {
        return (i5 == 67 && i8 == 79 && i10 == 77 && (i11 == 77 || i == 2)) || (i5 == 77 && i8 == 76 && i10 == 76 && (i11 == 84 || i == 2));
    }

    public static boolean wz(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t[] xc() {
        return new t[]{new a()};
    }

    public final long c5(long j) {
        return this.f1165tl + ((j * 1000000) / ((long) this.f1159gv.f6704gv));
    }

    public final boolean co(tl tlVar) throws IOException {
        fb fbVar = this.f1162p;
        if (fbVar != null) {
            long jA = fbVar.a();
            if (jA != -1 && tlVar.f() > jA - 4) {
                return true;
            }
        }
        try {
            return !tlVar.v(this.zn.v(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final fb f(tl tlVar, boolean z) throws IOException {
        tlVar.z(this.zn.v(), 0, 4);
        this.zn.oz(0);
        this.f1159gv.y(this.zn.p());
        return new y(tlVar.getLength(), tlVar.getPosition(), this.f1159gv, z);
    }

    @Override // b1.t
    public int fb(tl tlVar, d0 d0Var) throws IOException {
        a();
        int iZ = z(tlVar);
        if (iZ == -1 && (this.f1162p instanceof n3)) {
            long jC5 = c5(this.f1167wz);
            if (this.f1162p.c5() != jC5) {
                ((n3) this.f1162p).gv(jC5);
                this.f1163s.z(this.f1162p);
            }
        }
        return iZ;
    }

    @Override // b1.t
    public boolean gv(tl tlVar) throws IOException {
        return x4(tlVar, true);
    }

    public void i9() {
        this.f1161mt = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ao.fb mt(b1.tl r11) throws java.io.IOException {
        /*
            r10 = this;
            v0.d r5 = new v0.d
            mn.yt$y r0 = r10.f1159gv
            int r0 = r0.zn
            r5.<init>(r0)
            byte[] r0 = r5.v()
            mn.yt$y r1 = r10.f1159gv
            int r1 = r1.zn
            r6 = 0
            r11.z(r0, r6, r1)
            mn.yt$y r0 = r10.f1159gv
            int r1 = r0.y
            r2 = 1
            r1 = r1 & r2
            r3 = 21
            if (r1 == 0) goto L2b
            int r0 = r0.f6705v
            if (r0 == r2) goto L28
            r3 = 36
            r7 = 36
            goto L34
        L28:
            r7 = 21
            goto L34
        L2b:
            int r0 = r0.f6705v
            if (r0 == r2) goto L30
            goto L28
        L30:
            r3 = 13
            r7 = 13
        L34:
            int r8 = tl(r5, r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L63
            if (r8 != r9) goto L43
            goto L63
        L43:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L5e
            long r0 = r11.getLength()
            long r2 = r11.getPosition()
            mn.yt$y r4 = r10.f1159gv
            ao.s r0 = ao.s.y(r0, r2, r4, r5)
            mn.yt$y r1 = r10.f1159gv
            int r1 = r1.zn
            r11.w(r1)
            goto Lb3
        L5e:
            r11.s()
            r0 = 0
            goto Lb3
        L63:
            long r0 = r11.getLength()
            long r2 = r11.getPosition()
            mn.yt$y r4 = r10.f1159gv
            ao.c5 r0 = ao.c5.y(r0, r2, r4, r5)
            if (r0 == 0) goto L9d
            b1.f3 r1 = r10.f1166v
            boolean r1 = r1.y()
            if (r1 != 0) goto L9d
            r11.s()
            int r7 = r7 + 141
            r11.tl(r7)
            v0.d r1 = r10.zn
            byte[] r1 = r1.v()
            r2 = 3
            r11.z(r1, r6, r2)
            v0.d r1 = r10.zn
            r1.oz(r6)
            b1.f3 r1 = r10.f1166v
            v0.d r2 = r10.zn
            int r2 = r2.x()
            r1.gv(r2)
        L9d:
            mn.yt$y r1 = r10.f1159gv
            int r1 = r1.zn
            r11.w(r1)
            if (r0 == 0) goto Lb3
            boolean r1 = r0.s()
            if (r1 != 0) goto Lb3
            if (r8 != r9) goto Lb3
            ao.fb r11 = r10.f(r11, r6)
            return r11
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.a.mt(b1.tl):ao.fb");
    }

    public final fb s(tl tlVar) throws IOException {
        long jT;
        long jA;
        fb fbVarMt = mt(tlVar);
        zn znVarP = p(this.f1164t, tlVar.getPosition());
        if (this.f1161mt) {
            return new fb.y();
        }
        if ((this.y & 4) != 0) {
            if (znVarP != null) {
                jT = znVarP.c5();
                jA = znVarP.a();
            } else if (fbVarMt != null) {
                jT = fbVarMt.c5();
                jA = fbVarMt.a();
            } else {
                jT = t(this.f1164t);
                jA = -1;
            }
            fbVarMt = new n3(jT, tlVar.getPosition(), jA);
        } else if (znVarP != null) {
            fbVarMt = znVarP;
        } else if (fbVarMt == null) {
            fbVarMt = null;
        }
        if (fbVarMt == null || !(fbVarMt.s() || (this.y & 1) == 0)) {
            return f(tlVar, (this.y & 2) != 0);
        }
        return fbVarMt;
    }

    public final boolean x4(tl tlVar, boolean z) throws IOException {
        int i;
        int iF;
        int iI9;
        int i5 = z ? 32768 : 131072;
        tlVar.s();
        if (tlVar.getPosition() == 0) {
            Metadata metadataY = this.f1154a.y(tlVar, (this.y & 8) == 0 ? null : f1153x4);
            this.f1164t = metadataY;
            if (metadataY != null) {
                this.f1166v.zn(metadataY);
            }
            iF = (int) tlVar.f();
            if (!z) {
                tlVar.w(iF);
            }
            i = 0;
        } else {
            i = 0;
            iF = 0;
        }
        int i8 = 0;
        int i10 = 0;
        while (true) {
            if (!co(tlVar)) {
                this.zn.oz(0);
                int iP = this.zn.p();
                if ((i == 0 || wz(iP, i)) && (iI9 = yt.i9(iP)) != -1) {
                    i8++;
                    if (i8 != 1) {
                        if (i8 == 4) {
                            break;
                        }
                    } else {
                        this.f1159gv.y(iP);
                        i = iP;
                    }
                    tlVar.tl(iI9 - 4);
                } else {
                    int i11 = i10 + 1;
                    if (i10 == i5) {
                        if (z) {
                            return false;
                        }
                        throw q.y("Searched too many bytes.", null);
                    }
                    if (z) {
                        tlVar.s();
                        tlVar.tl(iF + i11);
                    } else {
                        tlVar.w(1);
                    }
                    i10 = i11;
                    i = 0;
                    i8 = 0;
                }
            } else if (i8 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            tlVar.w(iF + i10);
        } else {
            tlVar.s();
        }
        this.f1157f = i;
        return true;
    }

    @Override // b1.t
    public void y(long j, long j4) {
        this.f1157f = 0;
        this.f1165tl = -9223372036854775807L;
        this.f1167wz = 0L;
        this.w = 0;
        this.z = j4;
        fb fbVar = this.f1162p;
        if (!(fbVar instanceof n3) || ((n3) fbVar).y(j4)) {
            return;
        }
        this.f1156co = true;
        this.f1160i9 = this.f1158fb;
    }

    public final int z(tl tlVar) throws IOException {
        if (this.f1157f == 0) {
            try {
                x4(tlVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f1162p == null) {
            fb fbVarS = s(tlVar);
            this.f1162p = fbVarS;
            this.f1163s.z(fbVarS);
            this.f1160i9.y(new g.n3().o4(this.f1159gv.n3).f7(4096).a8(this.f1159gv.f6705v).rs(this.f1159gv.f6704gv).hw(this.f1166v.y).j5(this.f1166v.n3).en((this.y & 8) != 0 ? null : this.f1164t).z6());
            this.f1168xc = tlVar.getPosition();
        } else if (this.f1168xc != 0) {
            long position = tlVar.getPosition();
            long j = this.f1168xc;
            if (position < j) {
                tlVar.w((int) (j - position));
            }
        }
        return r(tlVar);
    }

    @Override // b1.t
    public void zn(wz wzVar) {
        this.f1163s = wzVar;
        ta taVarA = wzVar.a(0, 1);
        this.f1155c5 = taVarA;
        this.f1160i9 = taVarA;
        this.f1163s.p();
    }

    public a(int i) {
        this(i, -9223372036854775807L);
    }

    public a(int i, long j) {
        this.y = (i & 2) != 0 ? i | 1 : i;
        this.n3 = j;
        this.zn = new d(10);
        this.f1159gv = new yt.y();
        this.f1166v = new f3();
        this.f1165tl = -9223372036854775807L;
        this.f1154a = new n();
        f fVar = new f();
        this.f1158fb = fVar;
        this.f1160i9 = fVar;
    }

    @Override // b1.t
    public void release() {
    }
}
