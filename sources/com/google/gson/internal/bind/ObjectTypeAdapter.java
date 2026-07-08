package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {
    public static final TypeAdapterFactory zn = y(ToNumberPolicy.DOUBLE);
    public final ToNumberStrategy n3;
    public final Gson y;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[JsonToken.values().length];
            y = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                y[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                y[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                y[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                y[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                y[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static TypeAdapterFactory getFactory(ToNumberStrategy toNumberStrategy) {
        return toNumberStrategy == ToNumberPolicy.DOUBLE ? zn : y(toNumberStrategy);
    }

    private static TypeAdapterFactory y(final ToNumberStrategy toNumberStrategy) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(gson, toNumberStrategy);
                }
                return null;
            }
        };
    }

    public final Object n3(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = AnonymousClass2.y[jsonToken.ordinal()];
        if (i == 3) {
            return jsonReader.nextString();
        }
        if (i == 4) {
            return this.n3.readNumber(jsonReader);
        }
        if (i == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i == 6) {
            jsonReader.nextNull();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        Object objZn = zn(jsonReader, jsonTokenPeek);
        if (objZn == null) {
            return n3(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = objZn instanceof Map ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                Object objZn2 = zn(jsonReader, jsonTokenPeek2);
                boolean z = objZn2 != null;
                if (objZn2 == null) {
                    objZn2 = n3(jsonReader, jsonTokenPeek2);
                }
                if (objZn instanceof List) {
                    ((List) objZn).add(objZn2);
                } else {
                    ((Map) objZn).put(strNextName, objZn2);
                }
                if (z) {
                    arrayDeque.addLast(objZn);
                    objZn = objZn2;
                }
            } else {
                if (objZn instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return objZn;
                }
                objZn = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter adapter = this.y.getAdapter(obj.getClass());
        if (!(adapter instanceof ObjectTypeAdapter)) {
            adapter.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    public final Object zn(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = AnonymousClass2.y[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new LinkedTreeMap();
    }

    public ObjectTypeAdapter(Gson gson, ToNumberStrategy toNumberStrategy) {
        this.y = gson;
        this.n3 = toNumberStrategy;
    }
}
