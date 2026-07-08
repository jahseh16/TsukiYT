package mj1;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class en<E> extends f3<E, Set<? extends E>, LinkedHashSet<E>> {
    public final kj1.a n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(ij1.zn<E> eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.n3 = new f7(eSerializer.getDescriptor());
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: co, reason: merged with bridge method [inline-methods] */
    public void zn(LinkedHashSet<E> linkedHashSet, int i) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
    }

    @Override // mj1.i4, ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.n3;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: mt, reason: merged with bridge method [inline-methods] */
    public int n3(LinkedHashSet<E> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> y() {
        return new LinkedHashSet<>();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> f(Set<? extends E> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public Set<E> t(LinkedHashSet<E> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // mj1.i4
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void wz(LinkedHashSet<E> linkedHashSet, int i, E e4) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        linkedHashSet.add(e4);
    }
}
