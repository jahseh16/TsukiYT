package oj1;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kj1.i9;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class ud extends zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj1.r f7165a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f7166c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final String f7167fb;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f7168i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kj1.a f7169s;

    public /* synthetic */ class y extends FunctionReferenceImpl implements Function0<Map<String, ? extends Integer>> {
        public y(Object obj) {
            super(0, obj, rz.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Map<String, Integer> invoke() {
            return rz.y((kj1.a) this.receiver);
        }
    }

    public /* synthetic */ ud(nj1.y yVar, nj1.r rVar, String str, kj1.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, rVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : aVar);
    }

    @Override // oj1.zn, mj1.qk, lj1.v
    public boolean d0() {
        return !this.f7168i9 && super.d0();
    }

    @Override // oj1.zn
    public nj1.s dm(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (nj1.s) MapsKt.getValue(rb(), tag);
    }

    public final boolean g(kj1.a aVar, int i, String str) {
        nj1.y yVarGv = gv();
        kj1.a aVarFb = aVar.fb(i);
        if (!aVarFb.n3() && (dm(str) instanceof nj1.co)) {
            return true;
        }
        if (Intrinsics.areEqual(aVarFb.getKind(), i9.n3.y)) {
            nj1.s sVarDm = dm(str);
            nj1.f3 f3Var = sVarDm instanceof nj1.f3 ? (nj1.f3) sVarDm : null;
            String strA = f3Var != null ? nj1.i9.a(f3Var) : null;
            if (strA != null && rz.gv(aVarFb, yVarGv, strA) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // mj1.rs
    public String jz(kj1.a desc, int i) {
        Object next;
        Intrinsics.checkNotNullParameter(desc, "desc");
        String strV = desc.v(i);
        if (!this.f7178v.i9() || rb().keySet().contains(strV)) {
            return strV;
        }
        Map map = (Map) nj1.c.y(gv()).n3(desc, rz.zn(), new y(desc));
        Iterator<T> it = rb().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) map.get((String) next);
            if (num != null && num.intValue() == i) {
                break;
            }
        }
        String str = (String) next;
        return str == null ? strV : str;
    }

    public final boolean m(kj1.a aVar, int i) {
        boolean z = (gv().v().a() || aVar.c5(i) || !aVar.fb(i).n3()) ? false : true;
        this.f7168i9 = z;
        return z;
    }

    @Override // oj1.zn, lj1.v
    public lj1.zn n3(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor == this.f7169s ? this : super.n3(descriptor);
    }

    @Override // oj1.zn
    /* JADX INFO: renamed from: u0 */
    public nj1.r rb() {
        return this.f7165a;
    }

    public int x4(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.f7166c5 < descriptor.gv()) {
            int i = this.f7166c5;
            this.f7166c5 = i + 1;
            String strUt = ut(descriptor, i);
            int i5 = this.f7166c5 - 1;
            this.f7168i9 = false;
            if (rb().containsKey(strUt) || m(descriptor, i5)) {
                if (!this.f7178v.gv() || !g(descriptor, i5, strUt)) {
                    return i5;
                }
            }
        }
        return -1;
    }

    @Override // oj1.zn, lj1.zn
    public void zn(kj1.a descriptor) {
        Set<String> setPlus;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f7178v.fb() || (descriptor.getKind() instanceof kj1.gv)) {
            return;
        }
        if (this.f7178v.i9()) {
            Set<String> setY = mj1.oz.y(descriptor);
            Map map = (Map) nj1.c.y(gv()).y(descriptor, rz.zn());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = SetsKt.emptySet();
            }
            setPlus = SetsKt.plus((Set) setY, (Iterable) setKeySet);
        } else {
            setPlus = mj1.oz.y(descriptor);
        }
        for (String str : rb().keySet()) {
            if (!setPlus.contains(str) && !Intrinsics.areEqual(str, this.f7167fb)) {
                throw fh.fb(str, rb().toString());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(nj1.y json, nj1.r value, String str, kj1.a aVar) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7165a = value;
        this.f7167fb = str;
        this.f7169s = aVar;
    }
}
