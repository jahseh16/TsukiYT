package lj1;

import ij1.f;
import ij1.i9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lj1.a;
import lj1.gv;
import mj1.lc;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3 implements a, gv {
    @Override // lj1.a
    public void a(double d4) {
        a8(Double.valueOf(d4));
    }

    public void a8(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new i9("Non-serializable " + Reflection.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    @Override // lj1.a
    public void c(char c) {
        a8(Character.valueOf(c));
    }

    @Override // lj1.a
    public <T> void c5(f<? super T> fVar, T t3) {
        a.y.gv(this, fVar, t3);
    }

    @Override // lj1.gv
    public boolean co(kj1.a aVar, int i) {
        return gv.y.y(this, aVar, i);
    }

    @Override // lj1.gv
    public final void d(kj1.a descriptor, int i, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (ej(descriptor, i)) {
            mg(i5);
        }
    }

    @Override // lj1.a
    public void d0() {
        a.y.n3(this);
    }

    public boolean ej(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    @Override // lj1.gv
    public final void f(kj1.a descriptor, int i, char c) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (ej(descriptor, i)) {
            c(c);
        }
    }

    @Override // lj1.a
    public void f3(float f3) {
        a8(Float.valueOf(f3));
    }

    @Override // lj1.a
    public abstract void fb(byte b4);

    @Override // lj1.gv
    public final void fh(kj1.a descriptor, int i, float f3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (ej(descriptor, i)) {
            f3(f3);
        }
    }

    @Override // lj1.gv
    public <T> void i4(kj1.a descriptor, int i, f<? super T> serializer, T t3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (ej(descriptor, i)) {
            ud(serializer, t3);
        }
    }

    @Override // lj1.a
    public abstract void mg(int i);

    @Override // lj1.gv
    public final void mt(kj1.a descriptor, int i, long j) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (ej(descriptor, i)) {
            wz(j);
        }
    }

    @Override // lj1.gv
    public <T> void n(kj1.a descriptor, int i, f<? super T> serializer, T t3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (ej(descriptor, i)) {
            c5(serializer, t3);
        }
    }

    @Override // lj1.a
    public gv n3(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // lj1.a
    public abstract void p(short s3);

    @Override // lj1.a
    public void r(kj1.a enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        a8(Integer.valueOf(i));
    }

    @Override // lj1.gv
    public final void rz(kj1.a descriptor, int i, byte b4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (ej(descriptor, i)) {
            fb(b4);
        }
    }

    @Override // lj1.gv
    public final void s(kj1.a descriptor, int i, short s3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (ej(descriptor, i)) {
            p(s3);
        }
    }

    @Override // lj1.a
    public gv t(kj1.a aVar, int i) {
        return a.y.y(this, aVar, i);
    }

    @Override // lj1.gv
    public final a ta(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return ej(descriptor, i) ? xc(descriptor.fb(i)) : lc.y;
    }

    @Override // lj1.gv
    public final void tl(kj1.a descriptor, int i, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (ej(descriptor, i)) {
            z(z);
        }
    }

    public <T> void ud(f<? super T> fVar, T t3) {
        a.y.zn(this, fVar, t3);
    }

    @Override // lj1.gv
    public final void v(kj1.a descriptor, int i, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (ej(descriptor, i)) {
            z6(value);
        }
    }

    @Override // lj1.a
    public void w() {
        throw new i9("'null' is not supported by default");
    }

    @Override // lj1.a
    public abstract void wz(long j);

    @Override // lj1.gv
    public final void x4(kj1.a descriptor, int i, double d4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (ej(descriptor, i)) {
            a(d4);
        }
    }

    @Override // lj1.a
    public a xc(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // lj1.a
    public void z(boolean z) {
        a8(Boolean.valueOf(z));
    }

    @Override // lj1.a
    public void z6(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        a8(value);
    }

    @Override // lj1.gv
    public void zn(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }
}
