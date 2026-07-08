package oj1;

import kj1.f;
import kj1.i9;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import mj1.rs;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn extends rs implements nj1.fb {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final nj1.s f7177gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final nj1.a f7178v;
    public final nj1.y zn;

    public /* synthetic */ zn(nj1.y yVar, nj1.s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, sVar);
    }

    @Override // mj1.qk
    /* JADX INFO: renamed from: ap, reason: merged with bridge method [inline-methods] */
    public long qn(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return nj1.i9.tl(kp(tag));
        } catch (IllegalArgumentException unused) {
            g3("long");
            throw new KotlinNothingValueException();
        }
    }

    public final nj1.s ct() {
        nj1.s sVarDm;
        String strOz = oz();
        return (strOz == null || (sVarDm = dm(strOz)) == null) ? rb() : sVarDm;
    }

    @Override // mj1.qk, lj1.v
    public boolean d0() {
        return !(ct() instanceof nj1.co);
    }

    public abstract nj1.s dm(String str);

    @Override // mj1.qk
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public lj1.v hw(String tag, kj1.a inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return oz.y(inlineDescriptor) ? new i4(new ut(kp(tag).y()), gv()) : super.hw(tag, inlineDescriptor);
    }

    @Override // mj1.qk
    /* JADX INFO: renamed from: eb, reason: merged with bridge method [inline-methods] */
    public char b(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return StringsKt.single(kp(tag).y());
        } catch (IllegalArgumentException unused) {
            g3("char");
            throw new KotlinNothingValueException();
        }
    }

    @Override // mj1.rs
    public String en(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // nj1.fb
    public nj1.s fb() {
        return ct();
    }

    public final Void g3(String str) {
        throw fh.a(-1, "Failed to parse '" + str + '\'', ct().toString());
    }

    @Override // nj1.fb
    public nj1.y gv() {
        return this.zn;
    }

    @Override // mj1.qk, lj1.v
    public <T> T i4(ij1.n3<T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) j5.gv(this, deserializer);
    }

    public final nj1.f3 kp(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        nj1.s sVarDm = dm(tag);
        nj1.f3 f3Var = sVarDm instanceof nj1.f3 ? (nj1.f3) sVarDm : null;
        if (f3Var != null) {
            return f3Var;
        }
        throw fh.a(-1, "Expected JsonPrimitive at " + tag + ", found " + sVarDm, ct().toString());
    }

    @Override // mj1.qk
    /* JADX INFO: renamed from: lc, reason: merged with bridge method [inline-methods] */
    public double k5(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            double dFb = nj1.i9.fb(kp(tag));
            if (gv().v().y() || !(Double.isInfinite(dFb) || Double.isNaN(dFb))) {
                return dFb;
            }
            throw fh.y(Double.valueOf(dFb), tag, ct().toString());
        } catch (IllegalArgumentException unused) {
            g3("double");
            throw new KotlinNothingValueException();
        }
    }

    @Override // lj1.v
    public lj1.zn n3(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        nj1.s sVarCt = ct();
        kj1.i9 kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, f.n3.y) ? true : kind instanceof kj1.gv) {
            nj1.y yVarGv = gv();
            if (sVarCt instanceof nj1.n3) {
                return new x(yVarGv, (nj1.n3) sVarCt);
            }
            throw fh.v(-1, "Expected " + Reflection.getOrCreateKotlinClass(nj1.n3.class) + " as the serialized body of " + descriptor.s() + ", but had " + Reflection.getOrCreateKotlinClass(sVarCt.getClass()));
        }
        if (!Intrinsics.areEqual(kind, f.zn.y)) {
            nj1.y yVarGv2 = gv();
            if (sVarCt instanceof nj1.r) {
                return new ud(yVarGv2, (nj1.r) sVarCt, null, null, 12, null);
            }
            throw fh.v(-1, "Expected " + Reflection.getOrCreateKotlinClass(nj1.r.class) + " as the serialized body of " + descriptor.s() + ", but had " + Reflection.getOrCreateKotlinClass(sVarCt.getClass()));
        }
        nj1.y yVarGv3 = gv();
        kj1.a aVarY = jz.y(descriptor.fb(0), yVarGv3.y());
        kj1.i9 kind2 = aVarY.getKind();
        if ((kind2 instanceof kj1.v) || Intrinsics.areEqual(kind2, i9.n3.y)) {
            nj1.y yVarGv4 = gv();
            if (sVarCt instanceof nj1.r) {
                return new k5(yVarGv4, (nj1.r) sVarCt);
            }
            throw fh.v(-1, "Expected " + Reflection.getOrCreateKotlinClass(nj1.r.class) + " as the serialized body of " + descriptor.s() + ", but had " + Reflection.getOrCreateKotlinClass(sVarCt.getClass()));
        }
        if (!yVarGv3.v().n3()) {
            throw fh.gv(aVarY);
        }
        nj1.y yVarGv5 = gv();
        if (sVarCt instanceof nj1.n3) {
            return new x(yVarGv5, (nj1.n3) sVarCt);
        }
        throw fh.v(-1, "Expected " + Reflection.getOrCreateKotlinClass(nj1.n3.class) + " as the serialized body of " + descriptor.s() + ", but had " + Reflection.getOrCreateKotlinClass(sVarCt.getClass()));
    }

    @Override // mj1.qk
    /* JADX INFO: renamed from: nf, reason: merged with bridge method [inline-methods] */
    public int yt(String tag, kj1.a enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return rz.a(enumDescriptor, gv(), kp(tag).y(), null, 4, null);
    }

    @Override // mj1.qk
    /* JADX INFO: renamed from: o4, reason: merged with bridge method [inline-methods] */
    public boolean a8(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        nj1.f3 f3VarKp = kp(tag);
        if (!gv().v().t() && xg(f3VarKp, "boolean").zn()) {
            throw fh.a(-1, "Boolean literal for key '" + tag + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", ct().toString());
        }
        try {
            Boolean boolV = nj1.i9.v(f3VarKp);
            if (boolV != null) {
                return boolV.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            g3("boolean");
            throw new KotlinNothingValueException();
        }
    }

    @Override // mj1.qk
    /* JADX INFO: renamed from: ra, reason: merged with bridge method [inline-methods] */
    public float vl(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            float fC5 = nj1.i9.c5(kp(tag));
            if (gv().v().y() || !(Float.isInfinite(fC5) || Float.isNaN(fC5))) {
                return fC5;
            }
            throw fh.y(Float.valueOf(fC5), tag, ct().toString());
        } catch (IllegalArgumentException unused) {
            g3("float");
            throw new KotlinNothingValueException();
        }
    }

    public abstract nj1.s rb();

    @Override // mj1.qk
    /* JADX INFO: renamed from: rs, reason: merged with bridge method [inline-methods] */
    public byte x(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int iI9 = nj1.i9.i9(kp(tag));
            Byte bValueOf = (-128 > iI9 || iI9 > 127) ? null : Byte.valueOf((byte) iI9);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            g3("byte");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            g3("byte");
            throw new KotlinNothingValueException();
        }
    }

    @Override // mj1.qk
    /* JADX INFO: renamed from: s8, reason: merged with bridge method [inline-methods] */
    public int j5(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return nj1.i9.i9(kp(tag));
        } catch (IllegalArgumentException unused) {
            g3("int");
            throw new KotlinNothingValueException();
        }
    }

    public final nj1.w xg(nj1.f3 f3Var, String str) {
        nj1.w wVar = f3Var instanceof nj1.w ? (nj1.w) f3Var : null;
        if (wVar != null) {
            return wVar;
        }
        throw fh.v(-1, "Unexpected 'null' when " + str + " was expected");
    }

    @Override // lj1.v, lj1.zn
    public pj1.zn y() {
        return gv().y();
    }

    @Override // mj1.qk
    /* JADX INFO: renamed from: yc, reason: merged with bridge method [inline-methods] */
    public String j(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        nj1.f3 f3VarKp = kp(tag);
        if (gv().v().t() || xg(f3VarKp, "string").zn()) {
            if (f3VarKp instanceof nj1.co) {
                throw fh.a(-1, "Unexpected 'null' value instead of string literal", ct().toString());
            }
            return f3VarKp.y();
        }
        throw fh.a(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", ct().toString());
    }

    @Override // mj1.qk
    /* JADX INFO: renamed from: yg, reason: merged with bridge method [inline-methods] */
    public short o(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int iI9 = nj1.i9.i9(kp(tag));
            Short shValueOf = (-32768 > iI9 || iI9 > 32767) ? null : Short.valueOf((short) iI9);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            g3("short");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            g3("short");
            throw new KotlinNothingValueException();
        }
    }

    public void zn(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    public zn(nj1.y yVar, nj1.s sVar) {
        this.zn = yVar;
        this.f7177gv = sVar;
        this.f7178v = gv().v();
    }
}
