package mj1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class pz<ElementKlass, Element extends ElementKlass> extends i4<Element, Element[], ArrayList<Element>> {
    public final KClass<ElementKlass> n3;
    public final kj1.a zn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz(KClass<ElementKlass> kClass, ij1.zn<Element> eSerializer) {
        super(eSerializer, null);
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.n3 = kClass;
        this.zn = new gv(eSerializer.getDescriptor());
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: co, reason: merged with bridge method [inline-methods] */
    public int v(Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return elementArr.length;
    }

    @Override // mj1.i4, ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.zn;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: mt, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> gv(Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return ArrayIteratorKt.iterator(elementArr);
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void zn(ArrayList<Element> arrayList, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> f(Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return new ArrayList<>(ArraysKt.asList(elementArr));
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int n3(ArrayList<Element> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public Element[] t(ArrayList<Element> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return (Element[]) yg.wz(arrayList, this.n3);
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: xc, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> y() {
        return new ArrayList<>();
    }

    @Override // mj1.i4
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void wz(ArrayList<Element> arrayList, int i, Element element) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, element);
    }
}
