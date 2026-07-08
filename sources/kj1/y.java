package kj1;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<List<Annotation>> f6077a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final List<Boolean> f6078fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Set<String> f6079gv;
    public List<? extends Annotation> n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<a> f6080v;
    public final String y;
    public final List<String> zn;

    public y(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.y = serialName;
        this.n3 = CollectionsKt.emptyList();
        this.zn = new ArrayList();
        this.f6079gv = new HashSet();
        this.f6080v = new ArrayList();
        this.f6077a = new ArrayList();
        this.f6078fb = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void n3(y yVar, String str, a aVar, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        yVar.y(str, aVar, list, z);
    }

    public final List<String> a() {
        return this.zn;
    }

    public final List<Boolean> fb() {
        return this.f6078fb;
    }

    public final List<List<Annotation>> gv() {
        return this.f6077a;
    }

    public final void s(List<? extends Annotation> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.n3 = list;
    }

    public final List<a> v() {
        return this.f6080v;
    }

    public final void y(String elementName, a descriptor, List<? extends Annotation> annotations, boolean z) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!this.f6079gv.add(elementName)) {
            throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered").toString());
        }
        this.zn.add(elementName);
        this.f6080v.add(descriptor);
        this.f6077a.add(annotations);
        this.f6078fb.add(Boolean.valueOf(z));
    }

    public final List<Annotation> zn() {
        return this.n3;
    }
}
