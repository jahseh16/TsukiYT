package tn;

import android.net.Uri;
import android.util.Pair;
import androidx.annotation.Nullable;
import b1.d0;
import b1.f3;
import b1.fh;
import b1.ta;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import ft.g;
import ft.q;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tn.y;
import v0.c;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class f implements b1.t, fh {
    public static final b1.mt n = new b1.mt() { // from class: tn.i9
        @Override // b1.mt
        public final b1.t[] createExtractors() {
            return f.co();
        }

        @Override // b1.mt
        public /* synthetic */ b1.t[] y(Uri uri, Map map) {
            return b1.p.y(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<y.C0180y> f8217a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f8218c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public y[] f8219co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8220f;

    @Nullable
    public MotionPhotoMetadata f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final tl f8221fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final d f8222gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public int f8223i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f8224i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public b1.wz f8225mt;
    public final d n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8226p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<Metadata.Entry> f8228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8229t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    @Nullable
    public d f8230tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f8231v;
    public int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int f8232wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public long f8233x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public int f8234xc;
    public final int y;
    public long[][] z;
    public final d zn;

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public final b1.d f8235gv;
        public final mt n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8236v;
        public final xc y;
        public final ta zn;

        public y(xc xcVar, mt mtVar, ta taVar) {
            this.y = xcVar;
            this.n3 = mtVar;
            this.zn = taVar;
            this.f8235gv = "audio/true-hd".equals(xcVar.f8307a.f3) ? new b1.d() : null;
        }
    }

    public f() {
        this(0);
    }

    public static /* synthetic */ b1.t[] co() {
        return new b1.t[]{new f()};
    }

    public static boolean d(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    public static int f3(d dVar) {
        dVar.oz(8);
        int iT = t(dVar.p());
        if (iT != 0) {
            return iT;
        }
        dVar.ut(4);
        while (dVar.y() > 0) {
            int iT2 = t(dVar.p());
            if (iT2 != 0) {
                return iT2;
            }
        }
        return 0;
    }

    public static int t(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static boolean ta(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    public static long[][] tl(y[] yVarArr) {
        long[][] jArr = new long[yVarArr.length][];
        int[] iArr = new int[yVarArr.length];
        long[] jArr2 = new long[yVarArr.length];
        boolean[] zArr = new boolean[yVarArr.length];
        for (int i = 0; i < yVarArr.length; i++) {
            jArr[i] = new long[yVarArr[i].n3.n3];
            jArr2[i] = yVarArr[i].n3.f8274a[0];
        }
        long j = 0;
        int i5 = 0;
        while (i5 < yVarArr.length) {
            long j4 = Long.MAX_VALUE;
            int i8 = -1;
            for (int i10 = 0; i10 < yVarArr.length; i10++) {
                if (!zArr[i10]) {
                    long j7 = jArr2[i10];
                    if (j7 <= j4) {
                        i8 = i10;
                        j4 = j7;
                    }
                }
            }
            int i11 = iArr[i8];
            long[] jArr3 = jArr[i8];
            jArr3[i11] = j;
            mt mtVar = yVarArr[i8].n3;
            j += (long) mtVar.f8276gv[i11];
            int i12 = i11 + 1;
            iArr[i8] = i12;
            if (i12 < jArr3.length) {
                jArr2[i8] = mtVar.f8274a[i12];
            } else {
                zArr[i8] = true;
                i5++;
            }
        }
        return jArr;
    }

    public static int w(mt mtVar, long j) {
        int iY = mtVar.y(j);
        return iY == -1 ? mtVar.n3(j) : iY;
    }

    public static long z(mt mtVar, long j, long j4) {
        int iW = w(mtVar, j);
        return iW == -1 ? j4 : Math.min(mtVar.zn[iW], j4);
    }

    public final void c(long j) {
        if (this.f8224i9 == 1836086884) {
            int i = this.f8229t;
            this.f3 = new MotionPhotoMetadata(0L, j, -9223372036854775807L, j + ((long) i), this.f8220f - ((long) i));
        }
    }

    @Override // b1.fh
    public long c5() {
        return this.f8233x4;
    }

    public final boolean d0(b1.tl tlVar) throws IOException {
        y.C0180y c0180yPeek;
        if (this.f8229t == 0) {
            if (!tlVar.i9(this.f8231v.v(), 0, 8, true)) {
                i4();
                return false;
            }
            this.f8229t = 8;
            this.f8231v.oz(0);
            this.f8220f = this.f8231v.a8();
            this.f8224i9 = this.f8231v.p();
        }
        long j = this.f8220f;
        if (j == 1) {
            tlVar.readFully(this.f8231v.v(), 8, 8);
            this.f8229t += 8;
            this.f8220f = this.f8231v.k5();
        } else if (j == 0) {
            long length = tlVar.getLength();
            if (length == -1 && (c0180yPeek = this.f8217a.peek()) != null) {
                length = c0180yPeek.n3;
            }
            if (length != -1) {
                this.f8220f = (length - tlVar.getPosition()) + ((long) this.f8229t);
            }
        }
        if (this.f8220f < this.f8229t) {
            throw q.f("Atom size less than header length (unsupported).");
        }
        if (ta(this.f8224i9)) {
            long position = tlVar.getPosition();
            long j4 = this.f8220f;
            int i = this.f8229t;
            long j7 = (position + j4) - ((long) i);
            if (j4 != i && this.f8224i9 == 1835365473) {
                r(tlVar);
            }
            this.f8217a.push(new y.C0180y(this.f8224i9, j7));
            if (this.f8220f == this.f8229t) {
                x4(j7);
            } else {
                wz();
            }
        } else if (d(this.f8224i9)) {
            v0.y.fb(this.f8229t == 8);
            v0.y.fb(this.f8220f <= 2147483647L);
            d dVar = new d((int) this.f8220f);
            System.arraycopy(this.f8231v.v(), 0, dVar.v(), 0, 8);
            this.f8230tl = dVar;
            this.f8218c5 = 1;
        } else {
            c(tlVar.getPosition() - ((long) this.f8229t));
            this.f8230tl = null;
            this.f8218c5 = 1;
        }
        return true;
    }

    @Override // b1.t
    public int fb(b1.tl tlVar, d0 d0Var) throws IOException {
        while (true) {
            int i = this.f8218c5;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return rz(tlVar, d0Var);
                    }
                    if (i == 3) {
                        return mg(tlVar, d0Var);
                    }
                    throw new IllegalStateException();
                }
                if (fh(tlVar, d0Var)) {
                    return 1;
                }
            } else if (!d0(tlVar)) {
                return -1;
            }
        }
    }

    public final boolean fh(b1.tl tlVar, d0 d0Var) throws IOException {
        boolean z;
        long j = this.f8220f - ((long) this.f8229t);
        long position = tlVar.getPosition() + j;
        d dVar = this.f8230tl;
        if (dVar != null) {
            tlVar.readFully(dVar.v(), this.f8229t, (int) j);
            if (this.f8224i9 == 1718909296) {
                this.f8223i4 = f3(dVar);
            } else if (!this.f8217a.isEmpty()) {
                this.f8217a.peek().v(new y.n3(this.f8224i9, dVar));
            }
        } else {
            if (j >= 262144) {
                d0Var.y = tlVar.getPosition() + j;
                z = true;
                x4(position);
                return (z || this.f8218c5 == 2) ? false : true;
            }
            tlVar.w((int) j);
        }
        z = false;
        x4(position);
        if (z) {
        }
    }

    @Override // b1.t
    public boolean gv(b1.tl tlVar) throws IOException {
        return wz.gv(tlVar, (this.y & 2) != 0);
    }

    public final void i4() {
        if (this.f8223i4 != 2 || (this.y & 2) == 0) {
            return;
        }
        this.f8225mt.a(0, 4).y(new g.n3().en(this.f3 == null ? null : new Metadata(this.f3)).z6());
        this.f8225mt.p();
        this.f8225mt.z(new fh.n3(-9223372036854775807L));
    }

    public final int mg(b1.tl tlVar, d0 d0Var) throws IOException {
        int iZn = this.f8221fb.zn(tlVar, d0Var, this.f8228s);
        if (iZn == 1 && d0Var.y == 0) {
            wz();
        }
        return iZn;
    }

    public final void n(y.C0180y c0180y) throws q {
        Metadata metadata;
        Metadata metadata2;
        List<mt> list;
        int i;
        Metadata metadata3;
        ArrayList arrayList;
        int i5;
        int i8;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.f8223i4 == 1;
        f3 f3Var = new f3();
        y.n3 n3VarFb = c0180y.fb(1969517665);
        if (n3VarFb != null) {
            Pair<Metadata, Metadata> pairFh = n3.fh(n3VarFb);
            Metadata metadata4 = (Metadata) pairFh.first;
            Metadata metadata5 = (Metadata) pairFh.second;
            if (metadata4 != null) {
                f3Var.zn(metadata4);
            }
            metadata2 = metadata5;
            metadata = metadata4;
        } else {
            metadata = null;
            metadata2 = null;
        }
        y.C0180y c0180yA = c0180y.a(1835365473);
        Metadata metadataWz = c0180yA != null ? n3.wz(c0180yA) : null;
        Metadata metadata6 = metadata;
        List<mt> listD0 = n3.d0(c0180y, f3Var, -9223372036854775807L, null, (this.y & 1) != 0, z, new g4.fb() { // from class: tn.c5
            @Override // g4.fb
            public final Object apply(Object obj) {
                return f.mt((xc) obj);
            }
        });
        int size = listD0.size();
        long j = -9223372036854775807L;
        long jMax = -9223372036854775807L;
        int i10 = 0;
        int size2 = -1;
        while (i10 < size) {
            mt mtVar = listD0.get(i10);
            if (mtVar.n3 == 0) {
                list = listD0;
                i = size;
                arrayList = arrayList2;
                metadata3 = metadata6;
                i5 = 1;
            } else {
                xc xcVar = mtVar.y;
                ArrayList arrayList3 = arrayList2;
                long j4 = xcVar.f8314v;
                if (j4 == j) {
                    j4 = mtVar.f8277s;
                }
                jMax = Math.max(jMax, j4);
                list = listD0;
                y yVar = new y(xcVar, mtVar, this.f8225mt.a(i10, xcVar.n3));
                int i11 = "audio/true-hd".equals(xcVar.f8307a.f3) ? mtVar.f8278v * 16 : mtVar.f8278v + 30;
                g.n3 n3VarN3 = xcVar.f8307a.n3();
                n3VarN3.f7(i11);
                i = size;
                if (xcVar.n3 == 2 && j4 > 0 && (i8 = mtVar.n3) > 1) {
                    n3VarN3.qn(i8 / (j4 / 1000000.0f));
                }
                s.f(xcVar.n3, f3Var, n3VarN3);
                metadata3 = metadata6;
                s.t(xcVar.n3, metadata3, metadataWz, n3VarN3, metadata2, this.f8228s.isEmpty() ? null : new Metadata(this.f8228s));
                yVar.zn.y(n3VarN3.z6());
                if (xcVar.n3 == 2 && size2 == -1) {
                    size2 = arrayList3.size();
                }
                arrayList = arrayList3;
                arrayList.add(yVar);
                i5 = 1;
            }
            i10 += i5;
            metadata6 = metadata3;
            arrayList2 = arrayList;
            listD0 = list;
            size = i;
            j = -9223372036854775807L;
        }
        this.f8227r = size2;
        this.f8233x4 = jMax;
        y[] yVarArr = (y[]) arrayList2.toArray(new y[0]);
        this.f8219co = yVarArr;
        this.z = tl(yVarArr);
        this.f8225mt.p();
        this.f8225mt.z(this);
    }

    public final int p(long j) {
        int i = -1;
        int i5 = -1;
        int i8 = 0;
        long j4 = Long.MAX_VALUE;
        boolean z = true;
        long j7 = Long.MAX_VALUE;
        boolean z5 = true;
        long j8 = Long.MAX_VALUE;
        while (true) {
            y[] yVarArr = this.f8219co;
            if (i8 >= yVarArr.length) {
                break;
            }
            y yVar = yVarArr[i8];
            int i10 = yVar.f8236v;
            mt mtVar = yVar.n3;
            if (i10 != mtVar.n3) {
                long j9 = mtVar.zn[i10];
                long j10 = ((long[][]) ut.i9(this.z))[i8][i10];
                long j11 = j9 - j;
                boolean z7 = j11 < 0 || j11 >= 262144;
                if ((!z7 && z5) || (z7 == z5 && j11 < j8)) {
                    z5 = z7;
                    j8 = j11;
                    i5 = i8;
                    j7 = j10;
                }
                if (j10 < j4) {
                    z = z7;
                    i = i8;
                    j4 = j10;
                }
            }
            i8++;
        }
        return (j4 == Long.MAX_VALUE || !z || j7 < j4 + 10485760) ? i5 : i;
    }

    public final void r(b1.tl tlVar) throws IOException {
        this.f8222gv.j5(8);
        tlVar.z(this.f8222gv.v(), 0, 8);
        n3.v(this.f8222gv);
        tlVar.w(this.f8222gv.a());
        tlVar.s();
    }

    public final int rz(b1.tl tlVar, d0 d0Var) throws IOException {
        int i;
        d0 d0Var2;
        long position = tlVar.getPosition();
        if (this.f8232wz == -1) {
            int iP = p(position);
            this.f8232wz = iP;
            if (iP == -1) {
                return -1;
            }
        }
        y yVar = this.f8219co[this.f8232wz];
        ta taVar = yVar.zn;
        int i5 = yVar.f8236v;
        mt mtVar = yVar.n3;
        long j = mtVar.zn[i5];
        int i8 = mtVar.f8276gv[i5];
        b1.d dVar = yVar.f8235gv;
        long j4 = (j - position) + ((long) this.f8234xc);
        if (j4 < 0) {
            i = 1;
            d0Var2 = d0Var;
        } else {
            if (j4 < 262144) {
                if (yVar.y.f8310fb == 1) {
                    j4 += 8;
                    i8 -= 8;
                }
                tlVar.w((int) j4);
                xc xcVar = yVar.y;
                if (xcVar.f8312i9 == 0) {
                    if ("audio/ac4".equals(xcVar.f8307a.f3)) {
                        if (this.w == 0) {
                            mn.zn.y(i8, this.f8222gv);
                            taVar.n3(this.f8222gv, 7);
                            this.w += 7;
                        }
                        i8 += 7;
                    } else if (dVar != null) {
                        dVar.gv(tlVar);
                    }
                    while (true) {
                        int i10 = this.w;
                        if (i10 >= i8) {
                            break;
                        }
                        int iV = taVar.v(tlVar, i8 - i10, false);
                        this.f8234xc += iV;
                        this.w += iV;
                        this.f8226p -= iV;
                    }
                } else {
                    byte[] bArrV = this.zn.v();
                    bArrV[0] = 0;
                    bArrV[1] = 0;
                    bArrV[2] = 0;
                    int i11 = yVar.y.f8312i9;
                    int i12 = 4 - i11;
                    while (this.w < i8) {
                        int i13 = this.f8226p;
                        if (i13 == 0) {
                            tlVar.readFully(bArrV, i12, i11);
                            this.f8234xc += i11;
                            this.zn.oz(0);
                            int iP2 = this.zn.p();
                            if (iP2 < 0) {
                                throw q.y("Invalid NAL length", null);
                            }
                            this.f8226p = iP2;
                            this.n3.oz(0);
                            taVar.n3(this.n3, 4);
                            this.w += 4;
                            i8 += i12;
                        } else {
                            int iV2 = taVar.v(tlVar, i13, false);
                            this.f8234xc += iV2;
                            this.w += iV2;
                            this.f8226p -= iV2;
                        }
                    }
                }
                int i14 = i8;
                mt mtVar2 = yVar.n3;
                long j7 = mtVar2.f8274a[i5];
                int i15 = mtVar2.f8275fb[i5];
                if (dVar != null) {
                    dVar.zn(taVar, j7, i15, i14, 0, null);
                    if (i5 + 1 == yVar.n3.n3) {
                        dVar.y(taVar, null);
                    }
                } else {
                    taVar.a(j7, i15, i14, 0, null);
                }
                yVar.f8236v++;
                this.f8232wz = -1;
                this.f8234xc = 0;
                this.w = 0;
                this.f8226p = 0;
                return 0;
            }
            d0Var2 = d0Var;
            i = 1;
        }
        d0Var2.y = j;
        return i;
    }

    @Override // b1.fh
    public boolean s() {
        return true;
    }

    @Override // b1.fh
    public fh.y v(long j) {
        return xc(j, -1);
    }

    public final void wz() {
        this.f8218c5 = 0;
        this.f8229t = 0;
    }

    public final void x4(long j) throws q {
        while (!this.f8217a.isEmpty() && this.f8217a.peek().n3 == j) {
            y.C0180y c0180yPop = this.f8217a.pop();
            if (c0180yPop.y == 1836019574) {
                n(c0180yPop);
                this.f8217a.clear();
                this.f8218c5 = 2;
            } else if (!this.f8217a.isEmpty()) {
                this.f8217a.peek().gv(c0180yPop);
            }
        }
        if (this.f8218c5 != 2) {
            wz();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b1.fh.y xc(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            tn.f$y[] r4 = r0.f8219co
            int r5 = r4.length
            if (r5 != 0) goto L13
            b1.fh$y r1 = new b1.fh$y
            b1.rz r2 = b1.rz.zn
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f8227r
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            tn.mt r4 = r4.n3
            int r6 = w(r4, r1)
            if (r6 != r5) goto L35
            b1.fh$y r1 = new b1.fh$y
            b1.rz r2 = b1.rz.zn
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f8274a
            r12 = r11[r6]
            long[] r11 = r4.zn
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.n3
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.n3(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f8274a
            r9 = r2[r1]
            long[] r2 = r4.zn
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            tn.f$y[] r4 = r0.f8219co
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.f8227r
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            tn.mt r4 = r4.n3
            long r5 = z(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = z(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            b1.rz r3 = new b1.rz
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            b1.fh$y r1 = new b1.fh$y
            r1.<init>(r3)
            return r1
        L8f:
            b1.rz r4 = new b1.rz
            r4.<init>(r9, r1)
            b1.fh$y r1 = new b1.fh$y
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.f.xc(long, int):b1.fh$y");
    }

    @Override // b1.t
    public void y(long j, long j4) {
        this.f8217a.clear();
        this.f8229t = 0;
        this.f8232wz = -1;
        this.f8234xc = 0;
        this.w = 0;
        this.f8226p = 0;
        if (j == 0) {
            if (this.f8218c5 != 3) {
                wz();
                return;
            } else {
                this.f8221fb.fb();
                this.f8228s.clear();
                return;
            }
        }
        for (y yVar : this.f8219co) {
            z6(yVar, j4);
            b1.d dVar = yVar.f8235gv;
            if (dVar != null) {
                dVar.n3();
            }
        }
    }

    public final void z6(y yVar, long j) {
        mt mtVar = yVar.n3;
        int iY = mtVar.y(j);
        if (iY == -1) {
            iY = mtVar.n3(j);
        }
        yVar.f8236v = iY;
    }

    @Override // b1.t
    public void zn(b1.wz wzVar) {
        this.f8225mt = wzVar;
    }

    public f(int i) {
        this.y = i;
        this.f8218c5 = (i & 4) != 0 ? 3 : 0;
        this.f8221fb = new tl();
        this.f8228s = new ArrayList();
        this.f8231v = new d(16);
        this.f8217a = new ArrayDeque<>();
        this.n3 = new d(c.y);
        this.zn = new d(4);
        this.f8222gv = new d();
        this.f8232wz = -1;
        this.f8225mt = b1.wz.f1283c5;
        this.f8219co = new y[0];
    }

    @Override // b1.t
    public void release() {
    }

    public static /* synthetic */ xc mt(xc xcVar) {
        return xcVar;
    }
}
