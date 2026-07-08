package al1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class y<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<? extends KClass<?>> f201a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public zn<T> f202fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Function2<il1.y, fl1.y, T> f203gv;
    public final KClass<?> n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final gv f204v;
    public final gl1.y y;
    public final gl1.y zn;

    /* JADX INFO: renamed from: al1.y$y, reason: collision with other inner class name */
    public static final class C0006y extends Lambda implements Function1<KClass<?>, CharSequence> {
        public static final C0006y y = new C0006y();

        public C0006y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(KClass<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ll1.y.y(it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(gl1.y scopeQualifier, KClass<?> primaryType, gl1.y yVar, Function2<? super il1.y, ? super fl1.y, ? extends T> definition, gv kind, List<? extends KClass<?>> secondaryTypes) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(primaryType, "primaryType");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        this.y = scopeQualifier;
        this.n3 = primaryType;
        this.zn = yVar;
        this.f203gv = definition;
        this.f204v = kind;
        this.f201a = secondaryTypes;
        this.f202fb = new zn<>(null, 1, null);
    }

    public final void a(List<? extends KClass<?>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f201a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        }
        y yVar = (y) obj;
        return Intrinsics.areEqual(this.n3, yVar.n3) && Intrinsics.areEqual(this.zn, yVar.zn) && Intrinsics.areEqual(this.y, yVar.y);
    }

    public final gl1.y gv() {
        return this.y;
    }

    public int hashCode() {
        gl1.y yVar = this.zn;
        return ((((yVar == null ? 0 : yVar.hashCode()) * 31) + this.n3.hashCode()) * 31) + this.y.hashCode();
    }

    public final KClass<?> n3() {
        return this.n3;
    }

    public String toString() {
        String strStringPlus;
        String string = this.f204v.toString();
        String str = '\'' + ll1.y.y(this.n3) + '\'';
        gl1.y yVar = this.zn;
        String strStringPlus2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        if (yVar == null || (strStringPlus = Intrinsics.stringPlus(",qualifier:", zn())) == null) {
            strStringPlus = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        String strStringPlus3 = Intrinsics.areEqual(this.y, hl1.zn.f5343v.y()) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : Intrinsics.stringPlus(",scope:", gv());
        if (!this.f201a.isEmpty()) {
            strStringPlus2 = Intrinsics.stringPlus(",binds:", CollectionsKt.joinToString$default(this.f201a, ",", null, null, 0, null, C0006y.y, 30, null));
        }
        return '[' + string + ':' + str + strStringPlus + strStringPlus3 + strStringPlus2 + ']';
    }

    public final List<KClass<?>> v() {
        return this.f201a;
    }

    public final Function2<il1.y, fl1.y, T> y() {
        return this.f203gv;
    }

    public final gl1.y zn() {
        return this.zn;
    }
}
