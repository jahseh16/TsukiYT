package mj1;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vl<E> extends f3<E, Set<? extends E>, HashSet<E>> {
    public final kj1.a n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(ij1.zn<E> eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.n3 = new yt(eSerializer.getDescriptor());
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: co, reason: merged with bridge method [inline-methods] */
    public void zn(HashSet<E> hashSet, int i) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
    }

    @Override // mj1.i4, ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.n3;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: mt, reason: merged with bridge method [inline-methods] */
    public int n3(HashSet<E> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public HashSet<E> y() {
        return new HashSet<>();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public HashSet<E> f(Set<? extends E> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public Set<E> t(HashSet<E> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet;
    }

    @Override // mj1.i4
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void wz(HashSet<E> hashSet, int i, E e4) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        hashSet.add(e4);
    }
}
