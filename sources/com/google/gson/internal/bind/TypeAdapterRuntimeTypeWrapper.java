package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {
    public final TypeAdapter<T> n3;
    public final Gson y;
    public final Type zn;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.y = gson;
        this.n3 = typeAdapter;
        this.zn = type;
    }

    public static boolean n3(TypeAdapter<?> typeAdapter) {
        TypeAdapter<?> serializationDelegate;
        while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (serializationDelegate = ((SerializationDelegatingTypeAdapter) typeAdapter).getSerializationDelegate()) != typeAdapter) {
            typeAdapter = serializationDelegate;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    public static Type y(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) throws IOException {
        return this.n3.read(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t3) throws IOException {
        TypeAdapter<T> adapter = this.n3;
        Type typeY = y(this.zn, t3);
        if (typeY != this.zn) {
            adapter = this.y.getAdapter(TypeToken.get(typeY));
            if ((adapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !n3(this.n3)) {
                adapter = this.n3;
            }
        }
        adapter.write(jsonWriter, t3);
    }
}
