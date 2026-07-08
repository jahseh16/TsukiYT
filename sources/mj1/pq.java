package mj1;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pq implements kj1.a, wz {
    public final String n3;
    public final kj1.a y;
    public final Set<String> zn;

    public pq(kj1.a original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.y = original;
        this.n3 = original.s() + '?';
        this.zn = yc.y(original);
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
        if (this == obj) {
            return true;
        }
        return (obj instanceof pq) && Intrinsics.areEqual(this.y, ((pq) obj).y);
    }

    @Override // kj1.a
    public kj1.a fb(int i) {
        return this.y.fb(i);
    }

    @Override // kj1.a
    public List<Annotation> getAnnotations() {
        return this.y.getAnnotations();
    }

    @Override // kj1.a
    public kj1.i9 getKind() {
        return this.y.getKind();
    }

    @Override // kj1.a
    public int gv() {
        return this.y.gv();
    }

    public int hashCode() {
        return this.y.hashCode() * 31;
    }

    public final kj1.a i9() {
        return this.y;
    }

    @Override // kj1.a
    public boolean isInline() {
        return this.y.isInline();
    }

    @Override // kj1.a
    public boolean n3() {
        return true;
    }

    @Override // kj1.a
    public String s() {
        return this.n3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.y);
        sb.append('?');
        return sb.toString();
    }

    @Override // kj1.a
    public String v(int i) {
        return this.y.v(i);
    }

    @Override // mj1.wz
    public Set<String> y() {
        return this.zn;
    }

    @Override // kj1.a
    public int zn(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.y.zn(name);
    }
}
