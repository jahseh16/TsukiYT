package lf;

import androidx.annotation.Nullable;
import ft.g;
import java.util.Arrays;
import java.util.Collections;
import lf.ud;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class xc implements tl {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float[] f6424t = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n3 f6425a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public b1.ta f6426c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f6428fb;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f6430i9;

    @Nullable
    public final v0.d n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f6431s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final r f6432v;

    @Nullable
    public final x y;
    public final boolean[] zn = new boolean[4];

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final y f6429gv = new y(128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6427f = -9223372036854775807L;

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6433a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public long f6434fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f6435gv;
        public boolean n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f6436s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f6437v;
        public final b1.ta y;
        public boolean zn;

        public n3(b1.ta taVar) {
            this.y = taVar;
        }

        public void gv() {
            this.n3 = false;
            this.zn = false;
            this.f6435gv = false;
            this.f6437v = -1;
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
        public void n3(long j, int i, boolean z) {
            if (this.f6437v == 182 && z && this.n3) {
                long j4 = this.f6436s;
                if (j4 != -9223372036854775807L) {
                    this.y.a(j4, this.f6435gv ? 1 : 0, (int) (j - this.f6434fb), i, null);
                }
            }
            if (this.f6437v != 179) {
                this.f6434fb = j;
            }
        }

        public void y(byte[] bArr, int i, int i5) {
            if (this.zn) {
                int i8 = this.f6433a;
                int i10 = (i + 1) - i8;
                if (i10 >= i5) {
                    this.f6433a = i8 + (i5 - i);
                } else {
                    this.f6435gv = ((bArr[i10] & 192) >> 6) == 0;
                    this.zn = false;
                }
            }
        }

        public void zn(int i, long j) {
            this.f6437v = i;
            this.f6435gv = false;
            this.n3 = i == 182 || i == 179;
            this.zn = i == 182;
            this.f6433a = 0;
            this.f6436s = j;
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final byte[] f6438a = {0, 0, 1};

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f6439gv;
        public int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public byte[] f6440v;
        public boolean y;
        public int zn;

        public y(int i) {
            this.f6440v = new byte[i];
        }

        public boolean n3(int i, int i5) {
            int i8 = this.n3;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.zn -= i5;
                                this.y = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            v0.r.c5("H263Reader", "Unexpected start code value");
                            zn();
                        } else {
                            this.f6439gv = this.zn;
                            this.n3 = 4;
                        }
                    } else if (i > 31) {
                        v0.r.c5("H263Reader", "Unexpected start code value");
                        zn();
                    } else {
                        this.n3 = 3;
                    }
                } else if (i != 181) {
                    v0.r.c5("H263Reader", "Unexpected start code value");
                    zn();
                } else {
                    this.n3 = 2;
                }
            } else if (i == 176) {
                this.n3 = 1;
                this.y = true;
            }
            byte[] bArr = f6438a;
            y(bArr, 0, bArr.length);
            return false;
        }

        public void y(byte[] bArr, int i, int i5) {
            if (this.y) {
                int i8 = i5 - i;
                byte[] bArr2 = this.f6440v;
                int length = bArr2.length;
                int i10 = this.zn;
                if (length < i10 + i8) {
                    this.f6440v = Arrays.copyOf(bArr2, (i10 + i8) * 2);
                }
                System.arraycopy(bArr, i, this.f6440v, this.zn, i8);
                this.zn += i8;
            }
        }

        public void zn() {
            this.y = false;
            this.zn = 0;
            this.n3 = 0;
        }
    }

    public xc(@Nullable x xVar) {
        this.y = xVar;
        if (xVar != null) {
            this.f6432v = new r(178, 128);
            this.n3 = new v0.d();
        } else {
            this.f6432v = null;
            this.n3 = null;
        }
    }

    public static g n3(y yVar, int i, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(yVar.f6440v, yVar.zn);
        v0.ta taVar = new v0.ta(bArrCopyOf);
        taVar.co(i);
        taVar.co(4);
        taVar.p();
        taVar.mt(8);
        if (taVar.fb()) {
            taVar.mt(4);
            taVar.mt(3);
        }
        int iS = taVar.s(4);
        float f3 = 1.0f;
        if (iS == 15) {
            int iS2 = taVar.s(8);
            int iS3 = taVar.s(8);
            if (iS3 == 0) {
                v0.r.c5("H263Reader", "Invalid aspect ratio");
            } else {
                f3 = iS2 / iS3;
            }
        } else {
            float[] fArr = f6424t;
            if (iS < fArr.length) {
                f3 = fArr[iS];
            } else {
                v0.r.c5("H263Reader", "Invalid aspect ratio");
            }
        }
        if (taVar.fb()) {
            taVar.mt(2);
            taVar.mt(1);
            if (taVar.fb()) {
                taVar.mt(15);
                taVar.p();
                taVar.mt(15);
                taVar.p();
                taVar.mt(15);
                taVar.p();
                taVar.mt(3);
                taVar.mt(11);
                taVar.p();
                taVar.mt(15);
                taVar.p();
            }
        }
        if (taVar.s(2) != 0) {
            v0.r.c5("H263Reader", "Unhandled video object layer shape");
        }
        taVar.p();
        int iS4 = taVar.s(16);
        taVar.p();
        if (taVar.fb()) {
            if (iS4 == 0) {
                v0.r.c5("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i5 = 0;
                for (int i8 = iS4 - 1; i8 > 0; i8 >>= 1) {
                    i5++;
                }
                taVar.mt(i5);
            }
        }
        taVar.p();
        int iS5 = taVar.s(13);
        taVar.p();
        int iS6 = taVar.s(13);
        taVar.p();
        taVar.p();
        return new g.n3().oz(str).o4("video/mp4v-es").s8(iS5).o(iS6).y5(f3).ut(Collections.singletonList(bArrCopyOf)).z6();
    }

    @Override // lf.tl
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f6427f = j;
        }
    }

    @Override // lf.tl
    public void v(b1.wz wzVar, ud.gv gvVar) {
        gvVar.y();
        this.f6431s = gvVar.n3();
        b1.ta taVarA = wzVar.a(gvVar.zn(), 2);
        this.f6426c5 = taVarA;
        this.f6425a = new n3(taVarA);
        x xVar = this.y;
        if (xVar != null) {
            xVar.n3(wzVar, gvVar);
        }
    }

    @Override // lf.tl
    public void y(v0.d dVar) {
        v0.y.c5(this.f6425a);
        v0.y.c5(this.f6426c5);
        int iA = dVar.a();
        int iFb = dVar.fb();
        byte[] bArrV = dVar.v();
        this.f6428fb += (long) dVar.y();
        this.f6426c5.n3(dVar, dVar.y());
        while (true) {
            int iZn = v0.c.zn(bArrV, iA, iFb, this.zn);
            if (iZn == iFb) {
                break;
            }
            int i = iZn + 3;
            int i5 = dVar.v()[i] & 255;
            int i8 = iZn - iA;
            int i10 = 0;
            if (!this.f6430i9) {
                if (i8 > 0) {
                    this.f6429gv.y(bArrV, iA, iZn);
                }
                if (this.f6429gv.n3(i5, i8 < 0 ? -i8 : 0)) {
                    b1.ta taVar = this.f6426c5;
                    y yVar = this.f6429gv;
                    taVar.y(n3(yVar, yVar.f6439gv, (String) v0.y.v(this.f6431s)));
                    this.f6430i9 = true;
                }
            }
            this.f6425a.y(bArrV, iA, iZn);
            r rVar = this.f6432v;
            if (rVar != null) {
                if (i8 > 0) {
                    rVar.y(bArrV, iA, iZn);
                } else {
                    i10 = -i8;
                }
                if (this.f6432v.n3(i10)) {
                    r rVar2 = this.f6432v;
                    ((v0.d) ut.i9(this.n3)).o(this.f6432v.f6348gv, v0.c.p(rVar2.f6348gv, rVar2.f6349v));
                    ((x) ut.i9(this.y)).y(this.f6427f, this.n3);
                }
                if (i5 == 178 && dVar.v()[iZn + 2] == 1) {
                    this.f6432v.v(i5);
                }
            }
            int i11 = iFb - iZn;
            this.f6425a.n3(this.f6428fb - ((long) i11), i11, this.f6430i9);
            this.f6425a.zn(i5, this.f6427f);
            iA = i;
        }
        if (!this.f6430i9) {
            this.f6429gv.y(bArrV, iA, iFb);
        }
        this.f6425a.y(bArrV, iA, iFb);
        r rVar3 = this.f6432v;
        if (rVar3 != null) {
            rVar3.y(bArrV, iA, iFb);
        }
    }

    @Override // lf.tl
    public void zn() {
        v0.c.y(this.zn);
        this.f6429gv.zn();
        n3 n3Var = this.f6425a;
        if (n3Var != null) {
            n3Var.gv();
        }
        r rVar = this.f6432v;
        if (rVar != null) {
            rVar.gv();
        }
        this.f6428fb = 0L;
        this.f6427f = -9223372036854775807L;
    }

    @Override // lf.tl
    public void gv() {
    }
}
