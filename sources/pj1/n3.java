package pj1;

import ij1.f;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import mj1.yg;
import pj1.y;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends zn {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Map<KClass<?>, Map<String, ij1.zn<?>>> f7292gv;
    public final Map<KClass<?>, Map<KClass<?>, ij1.zn<?>>> n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map<KClass<?>, Function1<String, ij1.n3<?>>> f7293v;
    public final Map<KClass<?>, y> y;
    public final Map<KClass<?>, Function1<?, f<?>>> zn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n3(Map<KClass<?>, ? extends y> class2ContextualFactory, Map<KClass<?>, ? extends Map<KClass<?>, ? extends ij1.zn<?>>> polyBase2Serializers, Map<KClass<?>, ? extends Function1<?, ? extends f<?>>> polyBase2DefaultSerializerProvider, Map<KClass<?>, ? extends Map<String, ? extends ij1.zn<?>>> polyBase2NamedSerializers, Map<KClass<?>, ? extends Function1<? super String, ? extends ij1.n3<?>>> polyBase2DefaultDeserializerProvider) {
        super(null);
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.y = class2ContextualFactory;
        this.n3 = polyBase2Serializers;
        this.zn = polyBase2DefaultSerializerProvider;
        this.f7292gv = polyBase2NamedSerializers;
        this.f7293v = polyBase2DefaultDeserializerProvider;
    }

    @Override // pj1.zn
    public <T> ij1.n3<? extends T> gv(KClass<? super T> baseClass, String str) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map<String, ij1.zn<?>> map = this.f7292gv.get(baseClass);
        ij1.zn<?> znVar = map != null ? map.get(str) : null;
        if (!(znVar instanceof ij1.zn)) {
            znVar = null;
        }
        if (znVar != null) {
            return znVar;
        }
        Function1<String, ij1.n3<?>> function1 = this.f7293v.get(baseClass);
        Function1<String, ij1.n3<?>> function12 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function12 != null) {
            return (ij1.n3) function12.invoke(str);
        }
        return null;
    }

    @Override // pj1.zn
    public <T> ij1.zn<T> n3(KClass<T> kClass, List<? extends ij1.zn<?>> typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        y yVar = this.y.get(kClass);
        ij1.zn<?> znVarY = yVar != null ? yVar.y(typeArgumentsSerializers) : null;
        if (znVarY instanceof ij1.zn) {
            return (ij1.zn<T>) znVarY;
        }
        return null;
    }

    @Override // pj1.zn
    public <T> f<T> v(KClass<? super T> baseClass, T value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!yg.c5(value, baseClass)) {
            return null;
        }
        Map<KClass<?>, ij1.zn<?>> map = this.n3.get(baseClass);
        ij1.zn<?> znVar = map != null ? map.get(Reflection.getOrCreateKotlinClass(value.getClass())) : null;
        if (!(znVar instanceof f)) {
            znVar = null;
        }
        if (znVar != null) {
            return znVar;
        }
        Function1<?, f<?>> function1 = this.zn.get(baseClass);
        Function1<?, f<?>> function12 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function12 != null) {
            return (f) function12.invoke(value);
        }
        return null;
    }

    @Override // pj1.zn
    public void y(v collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        for (Map.Entry<KClass<?>, y> entry : this.y.entrySet()) {
            KClass<?> key = entry.getKey();
            y value = entry.getValue();
            if (value instanceof y.C0144y) {
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                ij1.zn<?> znVarN3 = ((y.C0144y) value).n3();
                Intrinsics.checkNotNull(znVarN3, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.n3(key, znVarN3);
            } else if (value instanceof y.n3) {
                collector.v(key, ((y.n3) value).n3());
            }
        }
        for (Map.Entry<KClass<?>, Map<KClass<?>, ij1.zn<?>>> entry2 : this.n3.entrySet()) {
            KClass<?> key2 = entry2.getKey();
            for (Map.Entry<KClass<?>, ij1.zn<?>> entry3 : entry2.getValue().entrySet()) {
                KClass<?> key3 = entry3.getKey();
                ij1.zn<?> value2 = entry3.getValue();
                Intrinsics.checkNotNull(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.zn(key2, key3, value2);
            }
        }
        for (Map.Entry<KClass<?>, Function1<?, f<?>>> entry4 : this.zn.entrySet()) {
            KClass<?> key4 = entry4.getKey();
            Function1<?, f<?>> value3 = entry4.getValue();
            Intrinsics.checkNotNull(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.gv(key4, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(value3, 1));
        }
        for (Map.Entry<KClass<?>, Function1<String, ij1.n3<?>>> entry5 : this.f7293v.entrySet()) {
            KClass<?> key5 = entry5.getKey();
            Function1<String, ij1.n3<?>> value4 = entry5.getValue();
            Intrinsics.checkNotNull(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.y(key5, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(value4, 1));
        }
    }
}
