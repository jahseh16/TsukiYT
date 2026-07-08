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
public abstract class ct implements kj1.a {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f6501gv;
    public final kj1.a n3;
    public final String y;
    public final kj1.a zn;

    public /* synthetic */ ct(String str, kj1.a aVar, kj1.a aVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aVar, aVar2);
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
        if (!(obj instanceof ct)) {
            return false;
        }
        ct ctVar = (ct) obj;
        return Intrinsics.areEqual(s(), ctVar.s()) && Intrinsics.areEqual(this.n3, ctVar.n3) && Intrinsics.areEqual(this.zn, ctVar.zn);
    }

    @Override // kj1.a
    public kj1.a fb(int i) {
        if (i >= 0) {
            int i5 = i % 2;
            if (i5 == 0) {
                return this.n3;
            }
            if (i5 == 1) {
                return this.zn;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + s() + " expects only non-negative indices").toString());
    }

    @Override // kj1.a
    public List<Annotation> getAnnotations() {
        return a.y.y(this);
    }

    @Override // kj1.a
    public kj1.i9 getKind() {
        return f.zn.y;
    }

    @Override // kj1.a
    public int gv() {
        return this.f6501gv;
    }

    public int hashCode() {
        return (((s().hashCode() * 31) + this.n3.hashCode()) * 31) + this.zn.hashCode();
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
        return s() + '(' + this.n3 + ", " + this.zn + ')';
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    public ct(String str, kj1.a aVar, kj1.a aVar2) {
        this.y = str;
        this.n3 = aVar;
        this.zn = aVar2;
        this.f6501gv = 2;
    }
}
