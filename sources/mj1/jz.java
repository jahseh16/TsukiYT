package mj1;

import java.lang.annotation.Annotation;
import java.util.List;
import kj1.a;
import kj1.f;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class jz implements kj1.a {
    public final int n3;
    public final kj1.a y;

    public /* synthetic */ jz(kj1.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // kj1.a
    public List<Annotation> a(int i) {
        if (i >= 0) {
            return CollectionsKt.emptyList();
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + s() + " expects only non-negative indices").toString());
    }

    @Override // kj1.a
    public boolean c5(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + s() + " expects only non-negative indices").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz)) {
            return false;
        }
        jz jzVar = (jz) obj;
        return Intrinsics.areEqual(this.y, jzVar.y) && Intrinsics.areEqual(s(), jzVar.s());
    }

    @Override // kj1.a
    public kj1.a fb(int i) {
        if (i >= 0) {
            return this.y;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + s() + " expects only non-negative indices").toString());
    }

    @Override // kj1.a
    public List<Annotation> getAnnotations() {
        return a.y.y(this);
    }

    @Override // kj1.a
    public kj1.i9 getKind() {
        return f.n3.y;
    }

    @Override // kj1.a
    public int gv() {
        return this.n3;
    }

    public int hashCode() {
        return (this.y.hashCode() * 31) + s().hashCode();
    }

    @Override // kj1.a
    public boolean isInline() {
        return a.y.n3(this);
    }

    @Override // kj1.a
    public boolean n3() {
        return a.y.zn(this);
    }

    public String toString() {
        return s() + '(' + this.y + ')';
    }

    @Override // kj1.a
    public String v(int i) {
        return String.valueOf(i);
    }

    @Override // kj1.a
    public int zn(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    public jz(kj1.a aVar) {
        this.y = aVar;
        this.n3 = 1;
    }
}
