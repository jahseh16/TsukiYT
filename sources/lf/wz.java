package lf;

import androidx.annotation.Nullable;
import java.util.Arrays;
import lf.ud;

/* JADX INFO: loaded from: classes.dex */
public final class wz implements tl {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final double[] f6409p = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean[] f6410a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f6411c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6412f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final y f6413fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public final v0.d f6414gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f6415i9;
    public b1.ta n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6417t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f6418tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final r f6419v;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public long f6420wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public boolean f6421xc;
    public String y;

    @Nullable
    public final x zn;

    public static final class y {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final byte[] f6422v = {0, 0, 1};

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public byte[] f6423gv;
        public int n3;
        public boolean y;
        public int zn;

        public y(int i) {
            this.f6423gv = new byte[i];
        }

        public boolean n3(int i, int i5) {
            if (this.y) {
                int i8 = this.n3 - i5;
                this.n3 = i8;
                if (this.zn != 0 || i != 181) {
                    this.y = false;
                    return true;
                }
                this.zn = i8;
            } else if (i == 179) {
                this.y = true;
            }
            byte[] bArr = f6422v;
            y(bArr, 0, bArr.length);
            return false;
        }

        public void y(byte[] bArr, int i, int i5) {
            if (this.y) {
                int i8 = i5 - i;
                byte[] bArr2 = this.f6423gv;
                int length = bArr2.length;
                int i10 = this.n3;
                if (length < i10 + i8) {
                    this.f6423gv = Arrays.copyOf(bArr2, (i10 + i8) * 2);
                }
                System.arraycopy(bArr, i, this.f6423gv, this.n3, i8);
                this.n3 += i8;
            }
        }

        public void zn() {
            this.y = false;
            this.n3 = 0;
            this.zn = 0;
        }
    }

    public wz() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<ft.g, java.lang.Long> n3(lf.wz.y r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f6423gv
            int r1 = r8.n3
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            ft.g$n3 r6 = new ft.g$n3
            r6.<init>()
            ft.g$n3 r9 = r6.oz(r9)
            java.lang.String r6 = "video/mpeg2"
            ft.g$n3 r9 = r9.o4(r6)
            ft.g$n3 r9 = r9.s8(r2)
            ft.g$n3 r9 = r9.o(r4)
            ft.g$n3 r9 = r9.y5(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            ft.g$n3 r9 = r9.ut(r1)
            ft.g r9 = r9.z6()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L99
            double[] r2 = lf.wz.f6409p
            int r4 = r2.length
            if (r1 >= r4) goto L99
            r1 = r2[r1]
            int r8 = r8.zn
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L91
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L91:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9b
        L99:
            r0 = 0
        L9b:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.wz.n3(lf.wz$y, java.lang.String):android.util.Pair");
    }

    @Override // lf.tl
    public void a(long j, int i) {
        this.f6417t = j;
    }

    @Override // lf.tl
    public void v(b1.wz wzVar, ud.gv gvVar) {
        gvVar.y();
        this.y = gvVar.n3();
        this.n3 = wzVar.a(gvVar.zn(), 2);
        x xVar = this.zn;
        if (xVar != null) {
            xVar.n3(wzVar, gvVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
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
    @Override // lf.tl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(v0.d r21) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.wz.y(v0.d):void");
    }

    @Override // lf.tl
    public void zn() {
        v0.c.y(this.f6410a);
        this.f6413fb.zn();
        r rVar = this.f6419v;
        if (rVar != null) {
            rVar.gv();
        }
        this.f6416s = 0L;
        this.f6411c5 = false;
        this.f6417t = -9223372036854775807L;
        this.f6420wz = -9223372036854775807L;
    }

    public wz(@Nullable x xVar) {
        this.zn = xVar;
        this.f6410a = new boolean[4];
        this.f6413fb = new y(128);
        if (xVar != null) {
            this.f6419v = new r(178, 128);
            this.f6414gv = new v0.d();
        } else {
            this.f6419v = null;
            this.f6414gv = null;
        }
        this.f6417t = -9223372036854775807L;
        this.f6420wz = -9223372036854775807L;
    }

    @Override // lf.tl
    public void gv() {
    }
}
