package hl1;

import cl1.gv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final Map<String, cl1.zn<?>> n3;
    public final xk1.y y;
    public final HashSet<gv<?>> zn;

    public y(xk1.y _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.y = _koin;
        this.n3 = ml1.y.y.gv();
        this.zn = new HashSet<>();
    }

    public static /* synthetic */ void c5(y yVar, boolean z, String str, cl1.zn znVar, boolean z5, int i, Object obj) throws bl1.n3 {
        if ((i & 8) != 0) {
            z5 = true;
        }
        yVar.s(z, str, znVar, z5);
    }

    public final cl1.zn<?> a(KClass<?> clazz, gl1.y yVar, gl1.y scopeQualifier) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        return this.n3.get(al1.n3.y(clazz, yVar, scopeQualifier));
    }

    public final <T> T fb(gl1.y yVar, KClass<?> clazz, gl1.y scopeQualifier, cl1.n3 instanceContext) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
        cl1.zn<?> znVarA = a(clazz, yVar, scopeQualifier);
        if (znVarA == null) {
            return null;
        }
        return (T) znVarA.n3(instanceContext);
    }

    public final void gv(el1.y yVar, boolean z) throws bl1.n3 {
        for (Map.Entry<String, cl1.zn<?>> entry : yVar.zn().entrySet()) {
            c5(this, z, entry.getKey(), entry.getValue(), false, 8, null);
        }
    }

    public final void n3(HashSet<gv<?>> hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        if (this.y.zn().fb(dl1.n3.DEBUG)) {
            this.y.zn().n3("Creating eager instances ...");
        }
        xk1.y yVar = this.y;
        cl1.n3 n3Var = new cl1.n3(yVar, yVar.v().n3(), null, 4, null);
        Iterator<T> it = hashSet.iterator();
        while (it.hasNext()) {
            ((gv) it.next()).n3(n3Var);
        }
    }

    public final void s(boolean z, String mapping, cl1.zn<?> factory, boolean z5) throws bl1.n3 {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(factory, "factory");
        if (this.n3.containsKey(mapping)) {
            if (!z) {
                el1.n3.y(factory, mapping);
            } else if (z5) {
                this.y.zn().a("Override Mapping '" + mapping + "' with " + factory.zn());
            }
        }
        if (this.y.zn().fb(dl1.n3.DEBUG) && z5) {
            this.y.zn().n3("add mapping '" + mapping + "' for " + factory.zn());
        }
        this.n3.put(mapping, factory);
    }

    public final void v(List<el1.y> modules, boolean z) throws bl1.n3 {
        Intrinsics.checkNotNullParameter(modules, "modules");
        for (el1.y yVar : modules) {
            gv(yVar, z);
            this.zn.addAll(yVar.n3());
        }
    }

    public final void y() {
        n3(this.zn);
        this.zn.clear();
    }

    public final <T> List<T> zn(KClass<?> clazz, cl1.n3 instanceContext) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
        Collection<cl1.zn<?>> collectionValues = this.n3.values();
        ArrayList arrayList = new ArrayList();
        for (T t3 : collectionValues) {
            if (Intrinsics.areEqual(((cl1.zn) t3).zn().gv(), instanceContext.zn().fb())) {
                arrayList.add(t3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t5 : arrayList) {
            cl1.zn znVar = (cl1.zn) t5;
            if (Intrinsics.areEqual(znVar.zn().n3(), clazz) || znVar.zn().v().contains(clazz)) {
                arrayList2.add(t5);
            }
        }
        List listDistinct = CollectionsKt.distinct(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDistinct, 10));
        Iterator<T> it = listDistinct.iterator();
        while (it.hasNext()) {
            arrayList3.add(((cl1.zn) it.next()).n3(instanceContext));
        }
        return arrayList3;
    }
}
