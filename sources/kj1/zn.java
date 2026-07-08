package kj1;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements a {
    public final KClass<?> n3;
    public final a y;
    public final String zn;

    public zn(a original, KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.y = original;
        this.n3 = kClass;
        this.zn = original.s() + '<' + kClass.getSimpleName() + '>';
    }

    @Override // kj1.a
    public List<Annotation> a(int i) {
        return this.y.a(i);
    }

    @Override // kj1.a
    public boolean c5(int i) {
        return this.y.c5(i);
    }

    public boolean equals(Object obj) {
        zn znVar = obj instanceof zn ? (zn) obj : null;
        return znVar != null && Intrinsics.areEqual(this.y, znVar.y) && Intrinsics.areEqual(znVar.n3, this.n3);
    }

    @Override // kj1.a
    public a fb(int i) {
        return this.y.fb(i);
    }

    @Override // kj1.a
    public List<Annotation> getAnnotations() {
        return this.y.getAnnotations();
    }

    @Override // kj1.a
    public i9 getKind() {
        return this.y.getKind();
    }

    @Override // kj1.a
    public int gv() {
        return this.y.gv();
    }

    public int hashCode() {
        return (this.n3.hashCode() * 31) + s().hashCode();
    }

    @Override // kj1.a
    public boolean isInline() {
        return this.y.isInline();
    }

    @Override // kj1.a
    public boolean n3() {
        return this.y.n3();
    }

    @Override // kj1.a
    public String s() {
        return this.zn;
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.n3 + ", original: " + this.y + ')';
    }

    @Override // kj1.a
    public String v(int i) {
        return this.y.v(i);
    }

    @Override // kj1.a
    public int zn(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.y.zn(name);
    }
}
