package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeTypeAdapter<T>.GsonContextImpl f3088a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f3089fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final TypeToken<T> f3090gv;
    public final JsonDeserializer<T> n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile TypeAdapter<T> f3091s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TypeAdapterFactory f3092v;
    public final JsonSerializer<T> y;
    public final Gson zn;

    public final class GsonContextImpl implements JsonSerializationContext, JsonDeserializationContext {
        public GsonContextImpl() {
        }

        @Override // com.google.gson.JsonDeserializationContext
        public <R> R deserialize(JsonElement jsonElement, Type type) throws JsonParseException {
            return (R) TreeTypeAdapter.this.zn.fromJson(jsonElement, type);
        }

        @Override // com.google.gson.JsonSerializationContext
        public JsonElement serialize(Object obj) {
            return TreeTypeAdapter.this.zn.toJsonTree(obj);
        }

        @Override // com.google.gson.JsonSerializationContext
        public JsonElement serialize(Object obj, Type type) {
            return TreeTypeAdapter.this.zn.toJsonTree(obj, type);
        }
    }

    public static final class SingleTypeFactory implements TypeAdapterFactory {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final JsonDeserializer<?> f3093f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final Class<?> f3094fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final JsonSerializer<?> f3095s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f3096v;
        public final TypeToken<?> y;

        public SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            JsonSerializer<?> jsonSerializer = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
            this.f3095s = jsonSerializer;
            JsonDeserializer<?> jsonDeserializer = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : null;
            this.f3093f = jsonDeserializer;
            C$Gson$Preconditions.checkArgument((jsonSerializer == null && jsonDeserializer == null) ? false : true);
            this.y = typeToken;
            this.f3096v = z;
            this.f3094fb = cls;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            TypeToken<?> typeToken2 = this.y;
            if (typeToken2 != null ? typeToken2.equals(typeToken) || (this.f3096v && this.y.getType() == typeToken.getRawType()) : this.f3094fb.isAssignableFrom(typeToken.getRawType())) {
                return new TreeTypeAdapter(this.f3095s, this.f3093f, gson, typeToken, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory, boolean z) {
        this.f3088a = new GsonContextImpl();
        this.y = jsonSerializer;
        this.n3 = jsonDeserializer;
        this.zn = gson;
        this.f3090gv = typeToken;
        this.f3092v = typeAdapterFactory;
        this.f3089fb = z;
    }

    public static TypeAdapterFactory newFactory(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, false, null);
    }

    public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    private TypeAdapter<T> y() {
        TypeAdapter<T> typeAdapter = this.f3091s;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> delegateAdapter = this.zn.getDelegateAdapter(this.f3092v, this.f3090gv);
        this.f3091s = delegateAdapter;
        return delegateAdapter;
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter<T> getSerializationDelegate() {
        return this.y != null ? this : y();
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) throws IOException {
        if (this.n3 == null) {
            return y().read(jsonReader);
        }
        JsonElement jsonElement = Streams.parse(jsonReader);
        if (this.f3089fb && jsonElement.isJsonNull()) {
            return null;
        }
        return this.n3.deserialize(jsonElement, this.f3090gv.getType(), this.f3088a);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t3) throws IOException {
        JsonSerializer<T> jsonSerializer = this.y;
        if (jsonSerializer == null) {
            y().write(jsonWriter, t3);
        } else if (this.f3089fb && t3 == null) {
            jsonWriter.nullValue();
        } else {
            Streams.write(jsonSerializer.serialize(t3, this.f3090gv.getType(), this.f3088a), jsonWriter);
        }
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
        this(jsonSerializer, jsonDeserializer, gson, typeToken, typeAdapterFactory, true);
    }
}
