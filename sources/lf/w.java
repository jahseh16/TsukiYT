package lf;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import ft.g;
import java.util.ArrayList;
import java.util.Arrays;
import lf.ud;
import v0.c;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class w implements tl {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public String f6372c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n3 f6373f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f6374fb;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public b1.ta f6376i9;
    public final boolean n3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6378t;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f6381wz;
    public final mg y;
    public final boolean zn;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean[] f6377s = new boolean[3];

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final r f6375gv = new r(7, 128);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r f6380v = new r(8, 128);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f6371a = new r(6, 128);

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f6379tl = -9223372036854775807L;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final v0.d f6382xc = new v0.d();

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v0.z6 f6383a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f6384c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f6385f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public byte[] f6386fb;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public long f6388i9;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public boolean f6389mt;
        public final boolean n3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f6390p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f6391s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f6392t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public y f6393tl;
        public long w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public y f6395wz;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public boolean f6396xc;
        public final b1.ta y;
        public final boolean zn;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final SparseArray<c.zn> f6387gv = new SparseArray<>();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final SparseArray<c.n3> f6394v = new SparseArray<>();

        public static final class y {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f6397a;

            /* JADX INFO: renamed from: c5, reason: collision with root package name */
            public boolean f6398c5;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f6399f;

            /* JADX INFO: renamed from: fb, reason: collision with root package name */
            public int f6400fb;

            /* JADX INFO: renamed from: gv, reason: collision with root package name */
            public int f6401gv;

            /* JADX INFO: renamed from: i9, reason: collision with root package name */
            public boolean f6402i9;
            public boolean n3;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public boolean f6403s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f6404t;

            /* JADX INFO: renamed from: tl, reason: collision with root package name */
            public int f6405tl;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f6406v;
            public int w;

            /* JADX INFO: renamed from: wz, reason: collision with root package name */
            public int f6407wz;

            /* JADX INFO: renamed from: xc, reason: collision with root package name */
            public int f6408xc;
            public boolean y;

            @Nullable
            public c.zn zn;

            public y() {
            }

            public void a(int i) {
                this.f6406v = i;
                this.n3 = true;
            }

            public boolean gv() {
                int i;
                return this.n3 && ((i = this.f6406v) == 7 || i == 2);
            }

            public void n3() {
                this.n3 = false;
                this.y = false;
            }

            public void v(c.zn znVar, int i, int i5, int i8, int i10, boolean z, boolean z5, boolean z7, boolean z8, int i11, int i12, int i13, int i14, int i15) {
                this.zn = znVar;
                this.f6401gv = i;
                this.f6406v = i5;
                this.f6397a = i8;
                this.f6400fb = i10;
                this.f6403s = z;
                this.f6398c5 = z5;
                this.f6402i9 = z7;
                this.f6399f = z8;
                this.f6404t = i11;
                this.f6405tl = i12;
                this.f6407wz = i13;
                this.f6408xc = i14;
                this.w = i15;
                this.y = true;
                this.n3 = true;
            }

            public final boolean zn(y yVar) {
                int i;
                int i5;
                int i8;
                boolean z;
                if (!this.y) {
                    return false;
                }
                if (!yVar.y) {
                    return true;
                }
                c.zn znVar = (c.zn) v0.y.c5(this.zn);
                c.zn znVar2 = (c.zn) v0.y.c5(yVar.zn);
                return (this.f6397a == yVar.f6397a && this.f6400fb == yVar.f6400fb && this.f6403s == yVar.f6403s && (!this.f6398c5 || !yVar.f6398c5 || this.f6402i9 == yVar.f6402i9) && (((i = this.f6401gv) == (i5 = yVar.f6401gv) || (i != 0 && i5 != 0)) && (((i8 = znVar.f8734t) != 0 || znVar2.f8734t != 0 || (this.f6405tl == yVar.f6405tl && this.f6407wz == yVar.f6407wz)) && ((i8 != 1 || znVar2.f8734t != 1 || (this.f6408xc == yVar.f6408xc && this.w == yVar.w)) && (z = this.f6399f) == yVar.f6399f && (!z || this.f6404t == yVar.f6404t))))) ? false : true;
            }
        }

        public n3(b1.ta taVar, boolean z, boolean z5) {
            this.y = taVar;
            this.n3 = z;
            this.zn = z5;
            this.f6393tl = new y();
            this.f6395wz = new y();
            byte[] bArr = new byte[128];
            this.f6386fb = bArr;
            this.f6383a = new v0.z6(bArr, 0, 0);
            fb();
        }

        public void a(c.zn znVar) {
            this.f6387gv.append(znVar.f8731gv, znVar);
        }

        public void fb() {
            this.f6385f = false;
            this.f6396xc = false;
            this.f6395wz.n3();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void gv(int i) {
            long j = this.f6390p;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.f6389mt;
            this.y.a(j, z ? 1 : 0, (int) (this.f6388i9 - this.w), i, null);
        }

        public boolean n3(long j, int i, boolean z, boolean z5) {
            boolean z7 = false;
            if (this.f6384c5 == 9 || (this.zn && this.f6395wz.zn(this.f6393tl))) {
                if (z && this.f6396xc) {
                    gv(i + ((int) (j - this.f6388i9)));
                }
                this.w = this.f6388i9;
                this.f6390p = this.f6392t;
                this.f6389mt = false;
                this.f6396xc = true;
            }
            if (this.n3) {
                z5 = this.f6395wz.gv();
            }
            boolean z8 = this.f6389mt;
            int i5 = this.f6384c5;
            if (i5 == 5 || (z5 && i5 == 1)) {
                z7 = true;
            }
            boolean z9 = z8 | z7;
            this.f6389mt = z9;
            return z9;
        }

        public void s(long j, int i, long j4) {
            this.f6384c5 = i;
            this.f6392t = j4;
            this.f6388i9 = j;
            if (!this.n3 || i != 1) {
                if (!this.zn) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            y yVar = this.f6393tl;
            this.f6393tl = this.f6395wz;
            this.f6395wz = yVar;
            yVar.n3();
            this.f6391s = 0;
            this.f6385f = true;
        }

        public void v(c.n3 n3Var) {
            this.f6394v.append(n3Var.y, n3Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0155  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void y(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 410
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lf.w.n3.y(byte[], int, int):void");
        }

        public boolean zn() {
            return this.zn;
        }
    }

    public w(mg mgVar, boolean z, boolean z5) {
        this.y = mgVar;
        this.n3 = z;
        this.zn = z5;
    }

    private void n3() {
        v0.y.c5(this.f6376i9);
        ut.i9(this.f6373f);
    }

    @Override // lf.tl
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f6379tl = j;
        }
        this.f6381wz |= (i & 2) != 0;
    }

    public final void c5(long j, int i, long j4) {
        if (!this.f6378t || this.f6373f.zn()) {
            this.f6375gv.v(i);
            this.f6380v.v(i);
        }
        this.f6371a.v(i);
        this.f6373f.s(j, i, j4);
    }

    public final void fb(long j, int i, int i5, long j4) {
        if (!this.f6378t || this.f6373f.zn()) {
            this.f6375gv.n3(i5);
            this.f6380v.n3(i5);
            if (this.f6378t) {
                if (this.f6375gv.zn()) {
                    r rVar = this.f6375gv;
                    this.f6373f.a(v0.c.t(rVar.f6348gv, 3, rVar.f6349v));
                    this.f6375gv.gv();
                } else if (this.f6380v.zn()) {
                    r rVar2 = this.f6380v;
                    this.f6373f.v(v0.c.i9(rVar2.f6348gv, 3, rVar2.f6349v));
                    this.f6380v.gv();
                }
            } else if (this.f6375gv.zn() && this.f6380v.zn()) {
                ArrayList arrayList = new ArrayList();
                r rVar3 = this.f6375gv;
                arrayList.add(Arrays.copyOf(rVar3.f6348gv, rVar3.f6349v));
                r rVar4 = this.f6380v;
                arrayList.add(Arrays.copyOf(rVar4.f6348gv, rVar4.f6349v));
                r rVar5 = this.f6375gv;
                c.zn znVarT = v0.c.t(rVar5.f6348gv, 3, rVar5.f6349v);
                r rVar6 = this.f6380v;
                c.n3 n3VarI9 = v0.c.i9(rVar6.f6348gv, 3, rVar6.f6349v);
                this.f6376i9.y(new g.n3().oz(this.f6372c5).o4("video/avc").x(v0.a.y(znVarT.y, znVarT.n3, znVarT.zn)).s8(znVarT.f8727a).o(znVarT.f8730fb).y5(znVarT.f8733s).ut(arrayList).z6());
                this.f6378t = true;
                this.f6373f.a(znVarT);
                this.f6373f.v(n3VarI9);
                this.f6375gv.gv();
                this.f6380v.gv();
            }
        }
        if (this.f6371a.n3(i5)) {
            r rVar7 = this.f6371a;
            this.f6382xc.o(this.f6371a.f6348gv, v0.c.p(rVar7.f6348gv, rVar7.f6349v));
            this.f6382xc.oz(4);
            this.y.y(j4, this.f6382xc);
        }
        if (this.f6373f.n3(j, i, this.f6378t, this.f6381wz)) {
            this.f6381wz = false;
        }
    }

    public final void s(byte[] bArr, int i, int i5) {
        if (!this.f6378t || this.f6373f.zn()) {
            this.f6375gv.y(bArr, i, i5);
            this.f6380v.y(bArr, i, i5);
        }
        this.f6371a.y(bArr, i, i5);
        this.f6373f.y(bArr, i, i5);
    }

    @Override // lf.tl
    public void v(b1.wz wzVar, ud.gv gvVar) {
        gvVar.y();
        this.f6372c5 = gvVar.n3();
        b1.ta taVarA = wzVar.a(gvVar.zn(), 2);
        this.f6376i9 = taVarA;
        this.f6373f = new n3(taVarA, this.n3, this.zn);
        this.y.n3(wzVar, gvVar);
    }

    @Override // lf.tl
    public void y(v0.d dVar) {
        n3();
        int iA = dVar.a();
        int iFb = dVar.fb();
        byte[] bArrV = dVar.v();
        this.f6374fb += (long) dVar.y();
        this.f6376i9.n3(dVar, dVar.y());
        while (true) {
            int iZn = v0.c.zn(bArrV, iA, iFb, this.f6377s);
            if (iZn == iFb) {
                s(bArrV, iA, iFb);
                return;
            }
            int iA2 = v0.c.a(bArrV, iZn);
            int i = iZn - iA;
            if (i > 0) {
                s(bArrV, iA, iZn);
            }
            int i5 = iFb - iZn;
            long j = this.f6374fb - ((long) i5);
            fb(j, i5, i < 0 ? -i : 0, this.f6379tl);
            c5(j, iA2, this.f6379tl);
            iA = iZn + 3;
        }
    }

    @Override // lf.tl
    public void zn() {
        this.f6374fb = 0L;
        this.f6381wz = false;
        this.f6379tl = -9223372036854775807L;
        v0.c.y(this.f6377s);
        this.f6375gv.gv();
        this.f6380v.gv();
        this.f6371a.gv();
        n3 n3Var = this.f6373f;
        if (n3Var != null) {
            n3Var.fb();
        }
    }

    @Override // lf.tl
    public void gv() {
    }
}
