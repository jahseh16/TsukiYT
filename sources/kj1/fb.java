package kj1;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kj1.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import mj1.g3;
import mj1.wz;
import mj1.yc;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements a, wz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f6066a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final boolean[] f6067c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a[] f6068f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final a[] f6069fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final List<Annotation> f6070gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final Map<String, Integer> f6071i9;
    public final i9 n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<Annotation>[] f6072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy f6073t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Set<String> f6074v;
    public final String y;
    public final int zn;

    public static final class n3 extends Lambda implements Function1<Integer, CharSequence> {
        public n3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return y(num.intValue());
        }

        public final CharSequence y(int i) {
            return fb.this.v(i) + ": " + fb.this.fb(i).s();
        }
    }

    public static final class y extends Lambda implements Function0<Integer> {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            fb fbVar = fb.this;
            return Integer.valueOf(g3.y(fbVar, fbVar.f6068f));
        }
    }

    public fb(String serialName, i9 kind, int i, List<? extends a> typeParameters, kj1.y builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.y = serialName;
        this.n3 = kind;
        this.zn = i;
        this.f6070gv = builder.zn();
        this.f6074v = CollectionsKt.toHashSet(builder.a());
        Object[] array = builder.a().toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        this.f6066a = strArr;
        this.f6069fb = yc.n3(builder.v());
        Object[] array2 = builder.gv().toArray(new List[0]);
        Intrinsics.checkNotNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f6072s = (List[]) array2;
        this.f6067c5 = CollectionsKt.toBooleanArray(builder.fb());
        Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            arrayList.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        this.f6071i9 = MapsKt.toMap(arrayList);
        this.f6068f = yc.n3(typeParameters);
        this.f6073t = LazyKt.lazy(new y());
    }

    @Override // kj1.a
    public List<Annotation> a(int i) {
        return this.f6072s[i];
    }

    @Override // kj1.a
    public boolean c5(int i) {
        return this.f6067c5[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fb) {
            a aVar = (a) obj;
            if (Intrinsics.areEqual(s(), aVar.s()) && Arrays.equals(this.f6068f, ((fb) obj).f6068f) && gv() == aVar.gv()) {
                int iGv = gv();
                for (int i = 0; i < iGv; i++) {
                    if (Intrinsics.areEqual(fb(i).s(), aVar.fb(i).s()) && Intrinsics.areEqual(fb(i).getKind(), aVar.fb(i).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return ((Number) this.f6073t.getValue()).intValue();
    }

    @Override // kj1.a
    public a fb(int i) {
        return this.f6069fb[i];
    }

    @Override // kj1.a
    public List<Annotation> getAnnotations() {
        return this.f6070gv;
    }

    @Override // kj1.a
    public i9 getKind() {
        return this.n3;
    }

    @Override // kj1.a
    public int gv() {
        return this.zn;
    }

    public int hashCode() {
        return f();
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
        return CollectionsKt.joinToString$default(RangesKt.until(0, gv()), ", ", s() + '(', ")", 0, null, new n3(), 24, null);
    }

    @Override // kj1.a
    public String v(int i) {
        return this.f6066a[i];
    }

    @Override // mj1.wz
    public Set<String> y() {
        return this.f6074v;
    }

    @Override // kj1.a
    public int zn(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.f6071i9.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }
}
