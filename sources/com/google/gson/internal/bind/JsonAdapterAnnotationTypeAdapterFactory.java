package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final TypeAdapterFactory f3062fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final TypeAdapterFactory f3063s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ConcurrentMap<Class<?>, TypeAdapterFactory> f3064v = new ConcurrentHashMap();
    public final ConstructorConstructor y;

    public static class DummyTypeAdapterFactory implements TypeAdapterFactory {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        f3062fb = new DummyTypeAdapterFactory();
        f3063s = new DummyTypeAdapterFactory();
    }

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.y = constructorConstructor;
    }

    public static JsonAdapter n3(Class<?> cls) {
        return (JsonAdapter) cls.getAnnotation(JsonAdapter.class);
    }

    public static Object y(ConstructorConstructor constructorConstructor, Class<?> cls) {
        return constructorConstructor.get(TypeToken.get((Class) cls)).construct();
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        JsonAdapter jsonAdapterN3 = n3(typeToken.getRawType());
        if (jsonAdapterN3 == null) {
            return null;
        }
        return (TypeAdapter<T>) zn(this.y, gson, typeToken, jsonAdapterN3, true);
    }

    public final TypeAdapterFactory gv(Class<?> cls, TypeAdapterFactory typeAdapterFactory) {
        TypeAdapterFactory typeAdapterFactoryPutIfAbsent = this.f3064v.putIfAbsent(cls, typeAdapterFactory);
        return typeAdapterFactoryPutIfAbsent != null ? typeAdapterFactoryPutIfAbsent : typeAdapterFactory;
    }

    public boolean isClassJsonAdapterFactory(TypeToken<?> typeToken, TypeAdapterFactory typeAdapterFactory) {
        Objects.requireNonNull(typeToken);
        Objects.requireNonNull(typeAdapterFactory);
        if (typeAdapterFactory == f3062fb) {
            return true;
        }
        Class<? super Object> rawType = typeToken.getRawType();
        TypeAdapterFactory typeAdapterFactory2 = this.f3064v.get(rawType);
        if (typeAdapterFactory2 != null) {
            return typeAdapterFactory2 == typeAdapterFactory;
        }
        JsonAdapter jsonAdapterN3 = n3(rawType);
        if (jsonAdapterN3 == null) {
            return false;
        }
        Class<?> clsValue = jsonAdapterN3.value();
        return TypeAdapterFactory.class.isAssignableFrom(clsValue) && gv(rawType, (TypeAdapterFactory) y(this.y, clsValue)) == typeAdapterFactory;
    }

    public TypeAdapter<?> zn(ConstructorConstructor constructorConstructor, Gson gson, TypeToken<?> typeToken, JsonAdapter jsonAdapter, boolean z) {
        TypeAdapter<?> treeTypeAdapter;
        Object objY = y(constructorConstructor, jsonAdapter.value());
        boolean zNullSafe = jsonAdapter.nullSafe();
        if (objY instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) objY;
        } else if (objY instanceof TypeAdapterFactory) {
            TypeAdapterFactory typeAdapterFactoryGv = (TypeAdapterFactory) objY;
            if (z) {
                typeAdapterFactoryGv = gv(typeToken.getRawType(), typeAdapterFactoryGv);
            }
            treeTypeAdapter = typeAdapterFactoryGv.create(gson, typeToken);
        } else {
            boolean z5 = objY instanceof JsonSerializer;
            if (!z5 && !(objY instanceof JsonDeserializer)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objY.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z5 ? (JsonSerializer) objY : null, objY instanceof JsonDeserializer ? (JsonDeserializer) objY : null, gson, typeToken, z ? f3062fb : f3063s, zNullSafe);
            zNullSafe = false;
        }
        return (treeTypeAdapter == null || !zNullSafe) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }
}
