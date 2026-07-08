package ij1;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import mj1.ap;
import mj1.o0;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static final o0<? extends Object> y = mj1.xc.y(zn.y);
    public static final o0<Object> n3 = mj1.xc.y(gv.y);
    public static final ap<? extends Object> zn = mj1.xc.n3(y.y);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final ap<Object> f5714gv = mj1.xc.n3(n3.y);

    public static final class gv extends Lambda implements Function1<KClass<?>, ij1.zn<Object>> {
        public static final gv y = new gv();

        public gv() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final ij1.zn<Object> invoke(KClass<?> it) {
            ij1.zn<Object> znVarCo;
            Intrinsics.checkNotNullParameter(it, "it");
            ij1.zn znVarZn = tl.zn(it);
            if (znVarZn == null || (znVarCo = jj1.y.co(znVarZn)) == null) {
                return null;
            }
            return znVarCo;
        }
    }

    public static final class n3 extends Lambda implements Function2<KClass<Object>, List<? extends KType>, ij1.zn<Object>> {
        public static final n3 y = new n3();

        public n3() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final ij1.zn<Object> invoke(KClass<Object> clazz, List<? extends KType> types) {
            ij1.zn<Object> znVarCo;
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(types, "types");
            List<ij1.zn<Object>> listV = tl.v(pj1.gv.y(), types, true);
            Intrinsics.checkNotNull(listV);
            ij1.zn<? extends Object> znVarY = tl.y(clazz, types, listV);
            if (znVarY == null || (znVarCo = jj1.y.co(znVarY)) == null) {
                return null;
            }
            return znVarCo;
        }
    }

    public static final class y extends Lambda implements Function2<KClass<Object>, List<? extends KType>, ij1.zn<? extends Object>> {
        public static final y y = new y();

        public y() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final ij1.zn<? extends Object> invoke(KClass<Object> clazz, List<? extends KType> types) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(types, "types");
            List<ij1.zn<Object>> listV = tl.v(pj1.gv.y(), types, true);
            Intrinsics.checkNotNull(listV);
            return tl.y(clazz, types, listV);
        }
    }

    public static final class zn extends Lambda implements Function1<KClass<?>, ij1.zn<? extends Object>> {
        public static final zn y = new zn();

        public zn() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final ij1.zn<? extends Object> invoke(KClass<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return tl.zn(it);
        }
    }

    public static final Object n3(KClass<Object> clazz, List<? extends KType> types, boolean z) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        return !z ? zn.y(clazz, types) : f5714gv.y(clazz, types);
    }

    public static final ij1.zn<Object> y(KClass<Object> clazz, boolean z) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (z) {
            return n3.y(clazz);
        }
        ij1.zn<? extends Object> znVarY = y.y(clazz);
        if (znVarY != null) {
            return znVarY;
        }
        return null;
    }
}
