package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MapTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f3073v;
    public final ConstructorConstructor y;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {
        public final TypeAdapter<V> n3;
        public final TypeAdapter<K> y;
        public final ObjectConstructor<? extends Map<K, V>> zn;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.y = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.n3 = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.zn = objectConstructor;
        }

        public final String y(JsonElement jsonElement) {
            if (!jsonElement.isJsonPrimitive()) {
                if (jsonElement.isJsonNull()) {
                    return "null";
                }
                throw new AssertionError();
            }
            JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                return String.valueOf(asJsonPrimitive.getAsNumber());
            }
            if (asJsonPrimitive.isBoolean()) {
                return Boolean.toString(asJsonPrimitive.getAsBoolean());
            }
            if (asJsonPrimitive.isString()) {
                return asJsonPrimitive.getAsString();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.TypeAdapter
        public Map<K, V> read(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> mapConstruct = this.zn.construct();
            if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K k3 = this.y.read(jsonReader);
                    if (mapConstruct.put(k3, this.n3.read(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + k3);
                    }
                    jsonReader.endArray();
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                    K k7 = this.y.read(jsonReader);
                    if (mapConstruct.put(k7, this.n3.read(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + k7);
                    }
                }
                jsonReader.endObject();
            }
            return mapConstruct;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.f3073v) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.n3.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                JsonElement jsonTree = this.y.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
            }
            if (!z) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i < size) {
                    jsonWriter.name(y((JsonElement) arrayList.get(i)));
                    this.n3.write(jsonWriter, (V) arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i < size2) {
                jsonWriter.beginArray();
                Streams.write((JsonElement) arrayList.get(i), jsonWriter);
                this.n3.write(jsonWriter, (V) arrayList2.get(i));
                jsonWriter.endArray();
                i++;
            }
            jsonWriter.endArray();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z) {
        this.y = constructorConstructor;
        this.f3073v = z;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] mapKeyAndValueTypes = C$Gson$Types.getMapKeyAndValueTypes(type, rawType);
        return new Adapter(gson, mapKeyAndValueTypes[0], y(gson, mapKeyAndValueTypes[0]), mapKeyAndValueTypes[1], gson.getAdapter(TypeToken.get(mapKeyAndValueTypes[1])), this.y.get(typeToken));
    }

    public final TypeAdapter<?> y(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.BOOLEAN_AS_STRING : gson.getAdapter(TypeToken.get(type));
    }
}
