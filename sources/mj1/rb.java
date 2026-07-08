package mj1;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kj1.a;
import kj1.f;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public class rb implements kj1.a, wz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Annotation>[] f6507a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public Map<String, Integer> f6508c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f6509f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public List<Annotation> f6510fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f6511gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final Lazy f6512i9;
    public final x<?> n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean[] f6513s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy f6514t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String[] f6515v;
    public final String y;
    public final int zn;

    public static final class gv extends Lambda implements Function0<kj1.a[]> {
        public gv() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final kj1.a[] invoke() {
            ArrayList arrayList;
            ij1.zn<?>[] znVarArrTypeParametersSerializers;
            x xVar = rb.this.n3;
            if (xVar == null || (znVarArrTypeParametersSerializers = xVar.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(znVarArrTypeParametersSerializers.length);
                for (ij1.zn<?> znVar : znVarArrTypeParametersSerializers) {
                    arrayList.add(znVar.getDescriptor());
                }
            }
            return yc.n3(arrayList);
        }
    }

    public static final class n3 extends Lambda implements Function0<ij1.zn<?>[]> {
        public n3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final ij1.zn<?>[] invoke() {
            ij1.zn<?>[] znVarArrChildSerializers;
            x xVar = rb.this.n3;
            return (xVar == null || (znVarArrChildSerializers = xVar.childSerializers()) == null) ? m.y : znVarArrChildSerializers;
        }
    }

    public static final class y extends Lambda implements Function0<Integer> {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            rb rbVar = rb.this;
            return Integer.valueOf(g3.y(rbVar, rbVar.xc()));
        }
    }

    public static final class zn extends Lambda implements Function1<Integer, CharSequence> {
        public zn() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return y(num.intValue());
        }

        public final CharSequence y(int i) {
            return rb.this.v(i) + ": " + rb.this.fb(i).s();
        }
    }

    public rb(String serialName, x<?> xVar, int i) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.y = serialName;
        this.n3 = xVar;
        this.zn = i;
        this.f6511gv = -1;
        String[] strArr = new String[i];
        for (int i5 = 0; i5 < i; i5++) {
            strArr[i5] = "[UNINITIALIZED]";
        }
        this.f6515v = strArr;
        int i8 = this.zn;
        this.f6507a = new List[i8];
        this.f6513s = new boolean[i8];
        this.f6508c5 = MapsKt.emptyMap();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f6512i9 = LazyKt.lazy(lazyThreadSafetyMode, new n3());
        this.f6509f = LazyKt.lazy(lazyThreadSafetyMode, new gv());
        this.f6514t = LazyKt.lazy(lazyThreadSafetyMode, new y());
    }

    public static /* synthetic */ void t(rb rbVar, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        rbVar.f(str, z);
    }

    private final int w() {
        return ((Number) this.f6514t.getValue()).intValue();
    }

    @Override // kj1.a
    public List<Annotation> a(int i) {
        List<Annotation> list = this.f6507a[i];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // kj1.a
    public boolean c5(int i) {
        return this.f6513s[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rb) {
            kj1.a aVar = (kj1.a) obj;
            if (Intrinsics.areEqual(s(), aVar.s()) && Arrays.equals(xc(), ((rb) obj).xc()) && gv() == aVar.gv()) {
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

    public final void f(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f6515v;
        int i = this.f6511gv + 1;
        this.f6511gv = i;
        strArr[i] = name;
        this.f6513s[i] = z;
        this.f6507a[i] = null;
        if (i == this.zn - 1) {
            this.f6508c5 = tl();
        }
    }

    @Override // kj1.a
    public kj1.a fb(int i) {
        return wz()[i].getDescriptor();
    }

    @Override // kj1.a
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.f6510fb;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // kj1.a
    public kj1.i9 getKind() {
        return f.y.y;
    }

    @Override // kj1.a
    public final int gv() {
        return this.zn;
    }

    public int hashCode() {
        return w();
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

    public final Map<String, Integer> tl() {
        HashMap map = new HashMap();
        int length = this.f6515v.length;
        for (int i = 0; i < length; i++) {
            map.put(this.f6515v[i], Integer.valueOf(i));
        }
        return map;
    }

    public String toString() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, this.zn), ", ", s() + '(', ")", 0, null, new zn(), 24, null);
    }

    @Override // kj1.a
    public String v(int i) {
        return this.f6515v[i];
    }

    public final ij1.zn<?>[] wz() {
        return (ij1.zn[]) this.f6512i9.getValue();
    }

    public final kj1.a[] xc() {
        return (kj1.a[]) this.f6509f.getValue();
    }

    @Override // mj1.wz
    public Set<String> y() {
        return this.f6508c5.keySet();
    }

    @Override // kj1.a
    public int zn(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.f6508c5.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public /* synthetic */ rb(String str, x xVar, int i, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? null : xVar, i);
    }
}
