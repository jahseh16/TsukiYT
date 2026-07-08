package oj1;

import kj1.i9;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class o extends lj1.y implements nj1.fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f7159a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final nj1.a f7160fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final pj1.zn f7161gv;
    public final en n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f7162s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7163v;
    public final nj1.y y;
    public final oj1.y zn;

    public /* synthetic */ class n3 {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[en.values().length];
            try {
                iArr[en.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[en.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[en.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[en.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            y = iArr;
        }
    }

    public static final class y {
        public String y;

        public y(String str) {
            this.y = str;
        }
    }

    public o(nj1.y json, en mode, oj1.y lexer, kj1.a descriptor, y yVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.y = json;
        this.n3 = mode;
        this.zn = lexer;
        this.f7161gv = json.y();
        this.f7163v = -1;
        this.f7159a = yVar;
        nj1.a aVarV = json.v();
        this.f7160fb = aVarV;
        this.f7162s = aVarV.a() ? null : new n(descriptor);
    }

    public final boolean b(kj1.a aVar, int i) {
        String strD;
        nj1.y yVar = this.y;
        kj1.a aVarFb = aVar.fb(i);
        if (!aVarFb.n3() && !this.zn.k5()) {
            return true;
        }
        if (!Intrinsics.areEqual(aVarFb.getKind(), i9.n3.y) || (strD = this.zn.d(this.f7160fb.t())) == null || rz.gv(aVarFb, yVar, strD) != -3) {
            return false;
        }
        this.zn.p();
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // lj1.y, lj1.zn
    public <T> T d(kj1.a descriptor, int i, ij1.n3<T> deserializer, T t3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z = this.n3 == en.MAP && (i & 1) == 0;
        if (z) {
            this.zn.n3.gv();
        }
        T t5 = (T) super.d(descriptor, i, deserializer, t3);
        if (z) {
            this.zn.n3.a(t5);
        }
        return t5;
    }

    @Override // lj1.y, lj1.v
    public boolean d0() {
        n nVar = this.f7162s;
        return !(nVar != null ? nVar.n3() : false) && this.zn.k5();
    }

    @Override // nj1.fb
    public nj1.s fb() {
        return new vl(this.y.v(), this.zn).v();
    }

    @Override // lj1.y, lj1.v
    public int fh(kj1.a enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return rz.v(enumDescriptor, this.y, n(), " at path " + this.zn.n3.y());
    }

    @Override // nj1.fb
    public final nj1.y gv() {
        return this.y;
    }

    public final String hw() {
        return this.f7160fb.t() ? this.zn.z() : this.zn.f();
    }

    @Override // lj1.y, lj1.v
    public <T> T i4(ij1.n3<T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            if ((deserializer instanceof mj1.n3) && !this.y.v().f()) {
                String strZn = j5.zn(deserializer.getDescriptor(), this.y);
                String strT = this.zn.t(strZn, this.f7160fb.t());
                ij1.n3<? extends T> n3VarZn = strT != null ? ((mj1.n3) deserializer).zn(this, strT) : null;
                if (n3VarZn == null) {
                    return (T) j5.gv(this, deserializer);
                }
                this.f7159a = new y(strZn);
                return n3VarZn.deserialize(this);
            }
            return deserializer.deserialize(this);
        } catch (ij1.gv e4) {
            throw new ij1.gv(e4.y(), e4.getMessage() + " at path: " + this.zn.n3.y(), e4);
        }
    }

    @Override // lj1.y, lj1.v
    public Void i9() {
        return null;
    }

    public final boolean j5(String str) {
        if (this.f7160fb.fb() || o(this.f7159a, str)) {
            this.zn.ej(this.f7160fb.t());
        } else {
            this.zn.d0(str);
        }
        return this.zn.b();
    }

    public final int k5() {
        boolean zB = this.zn.b();
        if (!this.zn.a()) {
            if (!zB) {
                return -1;
            }
            oj1.y.n(this.zn, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i = this.f7163v;
        if (i != -1 && !zB) {
            oj1.y.n(this.zn, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i5 = i + 1;
        this.f7163v = i5;
        return i5;
    }

    @Override // lj1.y, lj1.v
    public double mt() {
        oj1.y yVar = this.zn;
        String strCo = yVar.co();
        try {
            double d4 = Double.parseDouble(strCo);
            if (this.y.v().y() || !(Double.isInfinite(d4) || Double.isNaN(d4))) {
                return d4;
            }
            fh.i9(this.zn, Double.valueOf(d4));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            oj1.y.n(yVar, "Failed to parse type 'double' for input '" + strCo + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // lj1.y, lj1.v
    public String n() {
        return this.f7160fb.t() ? this.zn.z() : this.zn.p();
    }

    @Override // lj1.y, lj1.v
    public lj1.zn n3(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        en enVarN3 = jz.n3(this.y, descriptor);
        this.zn.n3.zn(descriptor);
        this.zn.xc(enVarN3.begin);
        x();
        int i = n3.y[enVarN3.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? new o(this.y, enVarN3, this.zn, descriptor, this.f7159a) : (this.n3 == enVarN3 && this.y.v().a()) ? this : new o(this.y, enVarN3, this.zn, descriptor, this.f7159a);
    }

    public final boolean o(y yVar, String str) {
        if (yVar == null || !Intrinsics.areEqual(yVar.y, str)) {
            return false;
        }
        yVar.y = null;
        return true;
    }

    public final void qn(kj1.a aVar) {
        while (x4(aVar) != -1) {
        }
    }

    @Override // lj1.y, lj1.v
    public char r() {
        String strCo = this.zn.co();
        if (strCo.length() == 1) {
            return strCo.charAt(0);
        }
        oj1.y.n(this.zn, "Expected single char, but got '" + strCo + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // lj1.y, lj1.v
    public int s() {
        long jW = this.zn.w();
        int i = (int) jW;
        if (jW == i) {
            return i;
        }
        oj1.y.n(this.zn, "Failed to parse int for input '" + jW + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // lj1.y, lj1.v
    public long t() {
        return this.zn.w();
    }

    @Override // lj1.y, lj1.v
    public lj1.v v(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return oz.y(descriptor) ? new i4(this.zn, this.y) : super.v(descriptor);
    }

    public final int vl(kj1.a aVar) {
        boolean zB;
        boolean zB2 = this.zn.b();
        while (this.zn.a()) {
            String strHw = hw();
            this.zn.xc(':');
            int iGv = rz.gv(aVar, this.y, strHw);
            boolean z = false;
            if (iGv == -3) {
                zB = false;
                z = true;
            } else {
                if (!this.f7160fb.gv() || !b(aVar, iGv)) {
                    n nVar = this.f7162s;
                    if (nVar != null) {
                        nVar.zn(iGv);
                    }
                    return iGv;
                }
                zB = this.zn.b();
            }
            zB2 = z ? j5(strHw) : zB;
        }
        if (zB2) {
            oj1.y.n(this.zn, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        n nVar2 = this.f7162s;
        if (nVar2 != null) {
            return nVar2.gv();
        }
        return -1;
    }

    @Override // lj1.y, lj1.v
    public float w() {
        oj1.y yVar = this.zn;
        String strCo = yVar.co();
        try {
            float f3 = Float.parseFloat(strCo);
            if (this.y.v().y() || !(Float.isInfinite(f3) || Float.isNaN(f3))) {
                return f3;
            }
            fh.i9(this.zn, Float.valueOf(f3));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            oj1.y.n(yVar, "Failed to parse type 'float' for input '" + strCo + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    public final void x() {
        if (this.zn.ta() != 4) {
            return;
        }
        oj1.y.n(this.zn, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // lj1.zn
    public int x4(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = n3.y[this.n3.ordinal()];
        int iK5 = i != 2 ? i != 4 ? k5() : vl(descriptor) : yt();
        if (this.n3 != en.MAP) {
            this.zn.n3.fb(iK5);
        }
        return iK5;
    }

    @Override // lj1.y, lj1.v
    public short xc() {
        long jW = this.zn.w();
        short s3 = (short) jW;
        if (jW == s3) {
            return s3;
        }
        oj1.y.n(this.zn, "Failed to parse short for input '" + jW + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // lj1.v, lj1.zn
    public pj1.zn y() {
        return this.f7161gv;
    }

    public final int yt() {
        int i = this.f7163v;
        boolean zB = false;
        boolean z = i % 2 != 0;
        if (!z) {
            this.zn.xc(':');
        } else if (i != -1) {
            zB = this.zn.b();
        }
        if (!this.zn.a()) {
            if (!zB) {
                return -1;
            }
            oj1.y.n(this.zn, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z) {
            if (this.f7163v == -1) {
                oj1.y yVar = this.zn;
                int i5 = yVar.y;
                if (zB) {
                    oj1.y.n(yVar, "Unexpected trailing comma", i5, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                oj1.y yVar2 = this.zn;
                int i8 = yVar2.y;
                if (!zB) {
                    oj1.y.n(yVar2, "Expected comma after the key-value pair", i8, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i10 = this.f7163v + 1;
        this.f7163v = i10;
        return i10;
    }

    @Override // lj1.y, lj1.v
    public boolean z() {
        return this.f7160fb.t() ? this.zn.c5() : this.zn.fb();
    }

    @Override // lj1.y, lj1.v
    public byte z6() {
        long jW = this.zn.w();
        byte b4 = (byte) jW;
        if (jW == b4) {
            return b4;
        }
        oj1.y.n(this.zn, "Failed to parse byte for input '" + jW + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // lj1.y, lj1.zn
    public void zn(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.y.v().fb() && descriptor.gv() == 0) {
            qn(descriptor);
        }
        this.zn.xc(this.n3.end);
        this.zn.n3.n3();
    }
}
