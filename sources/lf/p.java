package lf;

import androidx.annotation.Nullable;
import ft.g;
import java.util.Collections;
import lf.ud;
import v0.c;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class p implements tl {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public y f6331gv;
    public String n3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6334t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6336v;
    public final mg y;
    public b1.ta zn;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean[] f6327a = new boolean[3];

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final r f6330fb = new r(32, 128);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f6333s = new r(33, 128);

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final r f6328c5 = new r(34, 128);

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final r f6332i9 = new r(39, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f6329f = new r(40, 128);

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f6335tl = -9223372036854775807L;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final v0.d f6337wz = new v0.d();

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6338a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public boolean f6339c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f6340f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f6341fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f6342gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public boolean f6343i9;
        public long n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f6344s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f6345t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public boolean f6346tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f6347v;
        public final b1.ta y;
        public boolean zn;

        public y(b1.ta taVar) {
            this.y = taVar;
        }

        public static boolean n3(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        public static boolean zn(int i) {
            return i < 32 || i == 40;
        }

        public void a() {
            this.f6338a = false;
            this.f6341fb = false;
            this.f6344s = false;
            this.f6339c5 = false;
            this.f6343i9 = false;
        }

        public void fb(long j, int i, int i5, long j4, boolean z) {
            this.f6341fb = false;
            this.f6344s = false;
            this.f6347v = j4;
            this.f6342gv = 0;
            this.n3 = j;
            if (!zn(i5)) {
                if (this.f6339c5 && !this.f6343i9) {
                    if (z) {
                        gv(i);
                    }
                    this.f6339c5 = false;
                }
                if (n3(i5)) {
                    this.f6344s = !this.f6343i9;
                    this.f6343i9 = true;
                }
            }
            boolean z5 = i5 >= 16 && i5 <= 21;
            this.zn = z5;
            this.f6338a = z5 || i5 <= 9;
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
            long j = this.f6345t;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.f6346tl;
            this.y.a(j, z ? 1 : 0, (int) (this.n3 - this.f6340f), i, null);
        }

        public void v(byte[] bArr, int i, int i5) {
            if (this.f6338a) {
                int i8 = this.f6342gv;
                int i10 = (i + 2) - i8;
                if (i10 >= i5) {
                    this.f6342gv = i8 + (i5 - i);
                } else {
                    this.f6341fb = (bArr[i10] & 128) != 0;
                    this.f6338a = false;
                }
            }
        }

        public void y(long j, int i, boolean z) {
            if (this.f6343i9 && this.f6341fb) {
                this.f6346tl = this.zn;
                this.f6343i9 = false;
            } else if (this.f6344s || this.f6341fb) {
                if (z && this.f6339c5) {
                    gv(i + ((int) (j - this.n3)));
                }
                this.f6340f = this.n3;
                this.f6345t = this.f6347v;
                this.f6346tl = this.zn;
                this.f6339c5 = true;
            }
        }
    }

    public p(mg mgVar) {
        this.y = mgVar;
    }

    public static g c5(@Nullable String str, r rVar, r rVar2, r rVar3) {
        int i = rVar.f6349v;
        byte[] bArr = new byte[rVar2.f6349v + i + rVar3.f6349v];
        System.arraycopy(rVar.f6348gv, 0, bArr, 0, i);
        System.arraycopy(rVar2.f6348gv, 0, bArr, rVar.f6349v, rVar2.f6349v);
        System.arraycopy(rVar3.f6348gv, 0, bArr, rVar.f6349v + rVar2.f6349v, rVar3.f6349v);
        c.y yVarS = v0.c.s(rVar2.f6348gv, 3, rVar2.f6349v);
        return new g.n3().oz(str).o4("video/hevc").x(v0.a.zn(yVarS.y, yVarS.n3, yVarS.zn, yVarS.f8721gv, yVarS.f8726v, yVarS.f8717a)).s8(yVarS.f8723s).o(yVarS.f8718c5).y5(yVarS.f8722i9).ut(Collections.singletonList(bArr)).z6();
    }

    private void fb(long j, int i, int i5, long j4) {
        this.f6331gv.y(j, i, this.f6336v);
        if (!this.f6336v) {
            this.f6330fb.n3(i5);
            this.f6333s.n3(i5);
            this.f6328c5.n3(i5);
            if (this.f6330fb.zn() && this.f6333s.zn() && this.f6328c5.zn()) {
                this.zn.y(c5(this.n3, this.f6330fb, this.f6333s, this.f6328c5));
                this.f6336v = true;
            }
        }
        if (this.f6332i9.n3(i5)) {
            r rVar = this.f6332i9;
            this.f6337wz.o(this.f6332i9.f6348gv, v0.c.p(rVar.f6348gv, rVar.f6349v));
            this.f6337wz.ut(5);
            this.y.y(j4, this.f6337wz);
        }
        if (this.f6329f.n3(i5)) {
            r rVar2 = this.f6329f;
            this.f6337wz.o(this.f6329f.f6348gv, v0.c.p(rVar2.f6348gv, rVar2.f6349v));
            this.f6337wz.ut(5);
            this.y.y(j4, this.f6337wz);
        }
    }

    private void n3() {
        v0.y.c5(this.zn);
        ut.i9(this.f6331gv);
    }

    private void s(byte[] bArr, int i, int i5) {
        this.f6331gv.v(bArr, i, i5);
        if (!this.f6336v) {
            this.f6330fb.y(bArr, i, i5);
            this.f6333s.y(bArr, i, i5);
            this.f6328c5.y(bArr, i, i5);
        }
        this.f6332i9.y(bArr, i, i5);
        this.f6329f.y(bArr, i, i5);
    }

    @Override // lf.tl
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f6335tl = j;
        }
    }

    public final void i9(long j, int i, int i5, long j4) {
        this.f6331gv.fb(j, i, i5, j4, this.f6336v);
        if (!this.f6336v) {
            this.f6330fb.v(i5);
            this.f6333s.v(i5);
            this.f6328c5.v(i5);
        }
        this.f6332i9.v(i5);
        this.f6329f.v(i5);
    }

    @Override // lf.tl
    public void v(b1.wz wzVar, ud.gv gvVar) {
        gvVar.y();
        this.n3 = gvVar.n3();
        b1.ta taVarA = wzVar.a(gvVar.zn(), 2);
        this.zn = taVarA;
        this.f6331gv = new y(taVarA);
        this.y.n3(wzVar, gvVar);
    }

    @Override // lf.tl
    public void y(v0.d dVar) {
        n3();
        while (dVar.y() > 0) {
            int iA = dVar.a();
            int iFb = dVar.fb();
            byte[] bArrV = dVar.v();
            this.f6334t += (long) dVar.y();
            this.zn.n3(dVar, dVar.y());
            while (iA < iFb) {
                int iZn = v0.c.zn(bArrV, iA, iFb, this.f6327a);
                if (iZn == iFb) {
                    s(bArrV, iA, iFb);
                    return;
                }
                int iV = v0.c.v(bArrV, iZn);
                int i = iZn - iA;
                if (i > 0) {
                    s(bArrV, iA, iZn);
                }
                int i5 = iFb - iZn;
                long j = this.f6334t - ((long) i5);
                fb(j, i5, i < 0 ? -i : 0, this.f6335tl);
                i9(j, i5, iV, this.f6335tl);
                iA = iZn + 3;
            }
        }
    }

    @Override // lf.tl
    public void zn() {
        this.f6334t = 0L;
        this.f6335tl = -9223372036854775807L;
        v0.c.y(this.f6327a);
        this.f6330fb.gv();
        this.f6333s.gv();
        this.f6328c5.gv();
        this.f6332i9.gv();
        this.f6329f.gv();
        y yVar = this.f6331gv;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // lf.tl
    public void gv() {
    }
}
