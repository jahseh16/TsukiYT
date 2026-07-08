package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {
    public final ConstructorConstructor y;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        public final ObjectConstructor<? extends Collection<E>> n3;
        public final TypeAdapter<E> y;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.y = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.n3 = objectConstructor;
        }

        @Override // com.google.gson.TypeAdapter
        public Collection<E> read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collectionConstruct = this.n3.construct();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collectionConstruct.add(this.y.read(jsonReader));
            }
            jsonReader.endArray();
            return collectionConstruct;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.y.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.y = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type collectionElementType = C$Gson$Types.getCollectionElementType(type, rawType);
        return new Adapter(gson, collectionElementType, gson.getAdapter(TypeToken.get(collectionElementType)), this.y.get(typeToken));
    }
}
