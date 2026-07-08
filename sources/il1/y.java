package il1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5716a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f5717c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final ArrayList<Object> f5718fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final xk1.y f5719gv;
    public final String n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayDeque<fl1.y> f5720s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList<y> f5721v;
    public final gl1.y y;
    public final boolean zn;

    public static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ KClass<?> $clazz;
        final /* synthetic */ gl1.y $qualifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KClass<?> kClass, gl1.y yVar) {
            super(0);
            this.$clazz = kClass;
            this.$qualifier = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "- lookup? t:'" + ll1.y.y(this.$clazz) + "' - q:'" + this.$qualifier + "' look in other scopes";
        }
    }

    public static final class fb extends Lambda implements Function0<String> {
        public static final fb y = new fb();

        public fb() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "| clear parameter stack";
        }
    }

    public static final class gv extends Lambda implements Function0<String> {
        final /* synthetic */ KClass<?> $clazz;
        final /* synthetic */ gl1.y $qualifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gv(KClass<?> kClass, gl1.y yVar) {
            super(0);
            this.$clazz = kClass;
            this.$qualifier = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "- lookup? t:'" + ll1.y.y(this.$clazz) + "' - q:'" + this.$qualifier + "' look in injected parameters";
        }
    }

    public static final class n3 extends Lambda implements Function0<String> {
        final /* synthetic */ fl1.y $parameters;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(fl1.y yVar) {
            super(0);
            this.$parameters = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "| put parameters on stack " + this.$parameters + ' ';
        }
    }

    public static final class v extends Lambda implements Function0<String> {
        final /* synthetic */ KClass<?> $clazz;
        final /* synthetic */ gl1.y $qualifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(KClass<?> kClass, gl1.y yVar) {
            super(0);
            this.$clazz = kClass;
            this.$qualifier = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "- lookup? t:'" + ll1.y.y(this.$clazz) + "' - q:'" + this.$qualifier + "' look at scope source";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: il1.y$y, reason: collision with other inner class name */
    public static final class C0108y<T> extends Lambda implements Function0<T> {
        final /* synthetic */ KClass<?> $clazz;
        final /* synthetic */ Function0<fl1.y> $parameters;
        final /* synthetic */ gl1.y $qualifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0108y(gl1.y yVar, KClass<?> kClass, Function0<? extends fl1.y> function0) {
            super(0);
            this.$qualifier = yVar;
            this.$clazz = kClass;
            this.$parameters = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) y.this.f(this.$qualifier, this.$clazz, this.$parameters);
        }
    }

    public static final class zn extends Lambda implements Function0<String> {
        public static final zn y = new zn();

        public zn() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "| remove parameters from stack";
        }
    }

    public y(gl1.y scopeQualifier, String id, boolean z, xk1.y _koin) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.y = scopeQualifier;
        this.n3 = id;
        this.zn = z;
        this.f5719gv = _koin;
        this.f5721v = new ArrayList<>();
        this.f5718fb = new ArrayList<>();
        this.f5720s = new ArrayDeque<>();
    }

    public final <T> T a(KClass<?> clazz, gl1.y yVar, Function0<? extends fl1.y> function0) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        try {
            return (T) zn(clazz, yVar, function0);
        } catch (bl1.v unused) {
            this.f5719gv.zn().n3("|- No instance found for " + ll1.y.y(clazz) + " on scope " + this);
            return null;
        } catch (bl1.y unused2) {
            this.f5719gv.zn().n3("|- Scope closed - no instance found for " + ll1.y.y(clazz) + " on scope " + this);
            return null;
        }
    }

    public final ArrayDeque<fl1.y> c5() {
        return this.f5720s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.areEqual(this.y, yVar.y) && Intrinsics.areEqual(this.n3, yVar.n3) && this.zn == yVar.zn && Intrinsics.areEqual(this.f5719gv, yVar.f5719gv);
    }

    public final <T> T f(gl1.y yVar, KClass<?> kClass, Function0<? extends fl1.y> function0) throws bl1.y {
        if (this.f5717c5) {
            throw new bl1.y("Scope '" + this.n3 + "' is closed");
        }
        fl1.y yVarInvoke = function0 == null ? null : function0.invoke();
        if (yVarInvoke != null) {
            this.f5719gv.zn().c5(dl1.n3.DEBUG, new n3(yVarInvoke));
            this.f5720s.addFirst(yVarInvoke);
        }
        T t3 = (T) t(yVar, kClass, new cl1.n3(this.f5719gv, this, yVarInvoke), function0);
        if (yVarInvoke != null) {
            this.f5719gv.zn().c5(dl1.n3.DEBUG, zn.y);
            this.f5720s.removeFirstOrNull();
        }
        return t3;
    }

    public final gl1.y fb() {
        return this.y;
    }

    public final <T> List<T> gv(KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        List<T> listZn = this.f5719gv.n3().zn(clazz, new cl1.n3(this.f5719gv, this, null, 4, null));
        ArrayList<y> arrayList = this.f5721v;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((y) it.next()).gv(clazz));
        }
        return CollectionsKt.plus((Collection) listZn, (Iterable) arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((this.y.hashCode() * 31) + this.n3.hashCode()) * 31;
        boolean z = this.zn;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.f5719gv.hashCode();
    }

    public final Object i9() {
        return this.f5716a;
    }

    public final <T> T n3(KClass<?> kClass, gl1.y yVar, Function0<? extends fl1.y> function0) {
        Iterator<y> it = this.f5721v.iterator();
        T t3 = null;
        while (it.hasNext() && (t3 = (T) it.next().a(kClass, yVar, function0)) == null) {
        }
        return t3;
    }

    public final xk1.y s() {
        return this.f5719gv;
    }

    public final <T> T t(gl1.y yVar, KClass<?> kClass, cl1.n3 n3Var, Function0<? extends fl1.y> function0) throws bl1.v {
        Object objN3 = (T) this.f5719gv.n3().fb(yVar, kClass, this.y, n3Var);
        if (objN3 == null) {
            dl1.zn znVarZn = s().zn();
            dl1.n3 n3Var2 = dl1.n3.DEBUG;
            znVarZn.c5(n3Var2, new gv(kClass, yVar));
            fl1.y yVarFirstOrNull = c5().firstOrNull();
            Object objI9 = null;
            objN3 = yVarFirstOrNull == null ? (T) null : yVarFirstOrNull.n3(kClass);
            if (objN3 == null) {
                s().zn().c5(n3Var2, new v(kClass, yVar));
                Object objI92 = i9();
                if (objI92 != null && kClass.isInstance(objI92)) {
                    objI9 = i9();
                }
                objN3 = (T) objI9;
                if (objN3 == null) {
                    s().zn().c5(n3Var2, new a(kClass, yVar));
                    objN3 = (T) n3(kClass, yVar, function0);
                    if (objN3 == null) {
                        c5().clear();
                        s().zn().c5(n3Var2, fb.y);
                        tl(yVar, kClass);
                        throw new KotlinNothingValueException();
                    }
                }
            }
        }
        return (T) objN3;
    }

    public final Void tl(gl1.y yVar, KClass<?> kClass) throws bl1.v {
        String str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        if (yVar != null) {
            String str2 = " & qualifier:'" + yVar + '\'';
            if (str2 != null) {
                str = str2;
            }
        }
        throw new bl1.v("|- No definition found for class:'" + ll1.y.y(kClass) + '\'' + str + ". Check your definitions!");
    }

    public String toString() {
        return "['" + this.n3 + "']";
    }

    public final String v() {
        return this.n3;
    }

    public final <T> T zn(KClass<?> clazz, gl1.y yVar, Function0<? extends fl1.y> function0) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f5719gv.zn().fb(dl1.n3.DEBUG)) {
            return (T) f(yVar, clazz, function0);
        }
        String str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        if (yVar != null) {
            String str2 = " with qualifier '" + yVar + '\'';
            if (str2 != null) {
                str = str2;
            }
        }
        this.f5719gv.zn().n3("+- '" + ll1.y.y(clazz) + '\'' + str);
        Pair pairN3 = jl1.y.n3(new C0108y(yVar, clazz, function0));
        T t3 = (T) pairN3.component1();
        double dDoubleValue = ((Number) pairN3.component2()).doubleValue();
        this.f5719gv.zn().n3("|- '" + ll1.y.y(clazz) + "' in " + dDoubleValue + " ms");
        return t3;
    }
}
