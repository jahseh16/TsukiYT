package mj1;

import java.lang.annotation.Annotation;
import java.util.List;
import kj1.a;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y4 implements kj1.a {
    public final kj1.v n3;
    public final String y;

    public y4(String serialName, kj1.v kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.y = serialName;
        this.n3 = kind;
    }

    @Override // kj1.a
    public List<Annotation> a(int i) {
        y();
        throw new KotlinNothingValueException();
    }

    @Override // kj1.a
    public boolean c5(int i) {
        y();
        throw new KotlinNothingValueException();
    }

    @Override // kj1.a
    public kj1.a fb(int i) {
        y();
        throw new KotlinNothingValueException();
    }

    @Override // kj1.a
    public List<Annotation> getAnnotations() {
        return a.y.y(this);
    }

    @Override // kj1.a
    public int gv() {
        return 0;
    }

    @Override // kj1.a
    /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
    public kj1.v getKind() {
        return this.n3;
    }

    @Override // kj1.a
    public boolean isInline() {
        return a.y.n3(this);
    }

    @Override // kj1.a
    public boolean n3() {
        return a.y.zn(this);
    }

    @Override // kj1.a
    public String s() {
        return this.y;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + s() + ')';
    }

    @Override // kj1.a
    public String v(int i) {
        y();
        throw new KotlinNothingValueException();
    }

    public final Void y() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kj1.a
    public int zn(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        y();
        throw new KotlinNothingValueException();
    }
}
