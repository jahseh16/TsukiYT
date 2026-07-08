package mj1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a<E> extends f3<E, List<? extends E>, ArrayList<E>> {
    public final kj1.a n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ij1.zn<E> element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
        this.n3 = new v(element.getDescriptor());
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: co, reason: merged with bridge method [inline-methods] */
    public void zn(ArrayList<E> arrayList, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    @Override // mj1.i4, ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.n3;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: mt, reason: merged with bridge method [inline-methods] */
    public int n3(ArrayList<E> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> y() {
        return new ArrayList<>();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> f(List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public List<E> t(ArrayList<E> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }

    @Override // mj1.i4
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void wz(ArrayList<E> arrayList, int i, E e4) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, e4);
    }
}
