package mj1;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lj1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class qj<Tag> implements lj1.a, lj1.gv {
    public final ArrayList<Tag> y = new ArrayList<>();

    private final boolean ej(kj1.a aVar, int i) {
        en(k(aVar, i));
        return true;
    }

    @Override // lj1.a
    public final void a(double d4) {
        k5(f7(), d4);
    }

    public abstract void a8(Tag tag, boolean z);

    public abstract void b(Tag tag, char c);

    @Override // lj1.a
    public final void c(char c) {
        b(f7(), c);
    }

    @Override // lj1.a
    public abstract <T> void c5(ij1.f<? super T> fVar, T t3);

    @Override // lj1.gv
    public final void d(kj1.a descriptor, int i, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        j5(k(descriptor, i), i5);
    }

    public final void en(Tag tag) {
        this.y.add(tag);
    }

    @Override // lj1.gv
    public final void f(kj1.a descriptor, int i, char c) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b(k(descriptor, i), c);
    }

    @Override // lj1.a
    public final void f3(float f3) {
        vl(f7(), f3);
    }

    public final Tag f7() {
        if (this.y.isEmpty()) {
            throw new ij1.i9("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.y;
        return arrayList.remove(CollectionsKt.getLastIndex(arrayList));
    }

    @Override // lj1.a
    public final void fb(byte b4) {
        x(f7(), b4);
    }

    @Override // lj1.gv
    public final void fh(kj1.a descriptor, int i, float f3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        vl(k(descriptor, i), f3);
    }

    public lj1.a hw(Tag tag, kj1.a inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        en(tag);
        return this;
    }

    @Override // lj1.gv
    public <T> void i4(kj1.a descriptor, int i, ij1.f<? super T> serializer, T t3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (ej(descriptor, i)) {
            ud(serializer, t3);
        }
    }

    public abstract void j(Tag tag, String str);

    public abstract void j5(Tag tag, int i);

    public abstract Tag k(kj1.a aVar, int i);

    public abstract void k5(Tag tag, double d4);

    @Override // lj1.a
    public final void mg(int i) {
        j5(f7(), i);
    }

    @Override // lj1.gv
    public final void mt(kj1.a descriptor, int i, long j) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        qn(k(descriptor, i), j);
    }

    @Override // lj1.gv
    public <T> void n(kj1.a descriptor, int i, ij1.f<? super T> serializer, T t3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (ej(descriptor, i)) {
            c5(serializer, t3);
        }
    }

    public abstract void o(Tag tag, short s3);

    public abstract void oz(kj1.a aVar);

    @Override // lj1.a
    public final void p(short s3) {
        o(f7(), s3);
    }

    public final Tag q9() {
        return (Tag) CollectionsKt.lastOrNull(this.y);
    }

    public abstract void qn(Tag tag, long j);

    @Override // lj1.a
    public final void r(kj1.a enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        yt(f7(), enumDescriptor, i);
    }

    @Override // lj1.gv
    public final void rz(kj1.a descriptor, int i, byte b4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        x(k(descriptor, i), b4);
    }

    @Override // lj1.gv
    public final void s(kj1.a descriptor, int i, short s3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        o(k(descriptor, i), s3);
    }

    @Override // lj1.a
    public lj1.gv t(kj1.a aVar, int i) {
        return a.y.y(this, aVar, i);
    }

    @Override // lj1.gv
    public final lj1.a ta(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return hw(k(descriptor, i), descriptor.fb(i));
    }

    @Override // lj1.gv
    public final void tl(kj1.a descriptor, int i, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        a8(k(descriptor, i), z);
    }

    public <T> void ud(ij1.f<? super T> fVar, T t3) {
        a.y.zn(this, fVar, t3);
    }

    public final Tag ut() {
        return (Tag) CollectionsKt.last((List) this.y);
    }

    @Override // lj1.gv
    public final void v(kj1.a descriptor, int i, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        j(k(descriptor, i), value);
    }

    public abstract void vl(Tag tag, float f3);

    @Override // lj1.a
    public final void wz(long j) {
        qn(f7(), j);
    }

    public abstract void x(Tag tag, byte b4);

    @Override // lj1.gv
    public final void x4(kj1.a descriptor, int i, double d4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        k5(k(descriptor, i), d4);
    }

    @Override // lj1.a
    public final lj1.a xc(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return hw(f7(), descriptor);
    }

    public abstract void yt(Tag tag, kj1.a aVar, int i);

    @Override // lj1.a
    public final void z(boolean z) {
        a8(f7(), z);
    }

    @Override // lj1.a
    public final void z6(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        j(f7(), value);
    }

    @Override // lj1.gv
    public final void zn(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.y.isEmpty()) {
            f7();
        }
        oz(descriptor);
    }
}
