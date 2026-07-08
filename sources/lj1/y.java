package lj1;

import ij1.i9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lj1.v;
import lj1.zn;

/* JADX INFO: loaded from: classes.dex */
public abstract class y implements v, zn {
    @Override // lj1.zn
    public final float a(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return w();
    }

    public Object a8() {
        throw new i9(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // lj1.zn
    public final double c(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mt();
    }

    @Override // lj1.zn
    public final byte c5(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return z6();
    }

    @Override // lj1.zn
    public final int co(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return s();
    }

    @Override // lj1.zn
    public <T> T d(kj1.a descriptor, int i, ij1.n3<T> deserializer, T t3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) ud(deserializer, t3);
    }

    @Override // lj1.v
    public boolean d0() {
        return true;
    }

    @Override // lj1.zn
    public final <T> T ej(kj1.a descriptor, int i, ij1.n3<T> deserializer, T t3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (deserializer.getDescriptor().n3() || d0()) ? (T) ud(deserializer, t3) : (T) i9();
    }

    @Override // lj1.zn
    public v f(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return v(descriptor.fb(i));
    }

    @Override // lj1.zn
    public final short f3(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return xc();
    }

    @Override // lj1.v
    public int fh(kj1.a enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object objA8 = a8();
        Intrinsics.checkNotNull(objA8, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objA8).intValue();
    }

    @Override // lj1.v
    public <T> T i4(ij1.n3<T> n3Var) {
        return (T) v.y.y(this, n3Var);
    }

    @Override // lj1.v
    public Void i9() {
        return null;
    }

    @Override // lj1.zn
    public final String mg(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return n();
    }

    @Override // lj1.v
    public double mt() {
        Object objA8 = a8();
        Intrinsics.checkNotNull(objA8, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objA8).doubleValue();
    }

    @Override // lj1.v
    public String n() {
        Object objA8 = a8();
        Intrinsics.checkNotNull(objA8, "null cannot be cast to non-null type kotlin.String");
        return (String) objA8;
    }

    @Override // lj1.v
    public zn n3(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // lj1.zn
    public int p(kj1.a aVar) {
        return zn.y.y(this, aVar);
    }

    @Override // lj1.v
    public char r() {
        Object objA8 = a8();
        Intrinsics.checkNotNull(objA8, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objA8).charValue();
    }

    @Override // lj1.zn
    public final char rz(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return r();
    }

    @Override // lj1.v
    public abstract int s();

    @Override // lj1.v
    public abstract long t();

    @Override // lj1.zn
    public final boolean ta(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return z();
    }

    @Override // lj1.zn
    public boolean tl() {
        return zn.y.n3(this);
    }

    public <T> T ud(ij1.n3<T> deserializer, T t3) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) i4(deserializer);
    }

    @Override // lj1.v
    public v v(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // lj1.v
    public float w() {
        Object objA8 = a8();
        Intrinsics.checkNotNull(objA8, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objA8).floatValue();
    }

    @Override // lj1.zn
    public final long wz(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return t();
    }

    @Override // lj1.v
    public abstract short xc();

    @Override // lj1.v
    public boolean z() {
        Object objA8 = a8();
        Intrinsics.checkNotNull(objA8, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objA8).booleanValue();
    }

    @Override // lj1.v
    public abstract byte z6();

    @Override // lj1.zn
    public void zn(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }
}
