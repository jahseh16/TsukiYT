package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class Gson {
    public static final Strictness c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Excluder f3007a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final boolean f3008c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final int f3009co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3010f;
    public final ToNumberStrategy f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final FieldNamingStrategy f3011fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f3012gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public final ToNumberStrategy f3013i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final boolean f3014i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public final int f3015mt;
    public final List<ReflectionAccessFilter> n;
    public final ConcurrentMap<TypeToken<?>, TypeAdapter<?>> n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f3016p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<TypeAdapterFactory> f3017r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map<Type, InstanceCreator<?>> f3018s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3019t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final FormattingStyle f3020tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<TypeAdapterFactory> f3021v;
    public final boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final Strictness f3022wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public final List<TypeAdapterFactory> f3023x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final boolean f3024xc;
    public final ThreadLocal<Map<TypeToken<?>, TypeAdapter<?>>> y;
    public final LongSerializationPolicy z;
    public final ConstructorConstructor zn;
    public static final FormattingStyle d0 = FormattingStyle.COMPACT;
    public static final String fh = null;
    public static final FieldNamingStrategy rz = FieldNamingPolicy.IDENTITY;
    public static final ToNumberStrategy mg = ToNumberPolicy.DOUBLE;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public static final ToNumberStrategy f3006ta = ToNumberPolicy.LAZILY_PARSED_NUMBER;

    public static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
        public TypeAdapter<T> y = null;

        private TypeAdapter<T> y() {
            TypeAdapter<T> typeAdapter = this.y;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public TypeAdapter<T> getSerializationDelegate() {
            return y();
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
            return y().read(jsonReader);
        }

        public void setDelegate(TypeAdapter<T> typeAdapter) {
            if (this.y != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.y = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t3) throws IOException {
            y().write(jsonWriter, t3);
        }
    }

    public Gson() {
        this(Excluder.DEFAULT, rz, Collections.emptyMap(), false, false, false, true, d0, c, false, true, LongSerializationPolicy.DEFAULT, fh, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), mg, f3006ta, Collections.emptyList());
    }

    public static TypeAdapter<Number> fb(LongSerializationPolicy longSerializationPolicy) {
        return longSerializationPolicy == LongSerializationPolicy.DEFAULT ? TypeAdapters.LONG : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Long.valueOf(jsonReader.nextLong());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.toString());
                }
            }
        };
    }

    public static void gv(double d4) {
        if (Double.isNaN(d4) || Double.isInfinite(d4)) {
            throw new IllegalArgumentException(d4 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static TypeAdapter<AtomicLong> n3(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            public AtomicLong read(JsonReader jsonReader) throws IOException {
                return new AtomicLong(((Number) typeAdapter.read(jsonReader)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
                typeAdapter.write(jsonWriter, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    public static void y(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e4) {
                throw new JsonSyntaxException(e4);
            } catch (IOException e5) {
                throw new JsonIOException(e5);
            }
        }
    }

    public static TypeAdapter<AtomicLongArray> zn(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            public AtomicLongArray read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) typeAdapter.read(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    typeAdapter.write(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
    }

    public final TypeAdapter<Number> a(boolean z) {
        return z ? TypeAdapters.FLOAT : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                float fFloatValue = number.floatValue();
                Gson.gv(fFloatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(fFloatValue);
                }
                jsonWriter.value(number);
            }
        };
    }

    @Deprecated
    public Excluder excluder() {
        return this.f3007a;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.f3011fb;
    }

    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) Primitives.wrap(cls).cast(fromJson(str, TypeToken.get((Class) cls)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2.setDelegate(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> com.google.gson.TypeAdapter<T> getAdapter(com.google.gson.reflect.TypeToken<T> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> r0 = r6.n3
            java.lang.Object r0 = r0.get(r7)
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>>> r0 = r6.y
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>>> r1 = r6.y
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            com.google.gson.TypeAdapter r1 = (com.google.gson.TypeAdapter) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            com.google.gson.Gson$FutureTypeAdapter r2 = new com.google.gson.Gson$FutureTypeAdapter     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.List<com.google.gson.TypeAdapterFactory> r3 = r6.f3021v     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L58
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L58
            com.google.gson.TypeAdapterFactory r4 = (com.google.gson.TypeAdapterFactory) r4     // Catch: java.lang.Throwable -> L58
            com.google.gson.TypeAdapter r4 = r4.create(r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3f
            r2.setDelegate(r4)     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r7 = move-exception
            goto L82
        L5a:
            if (r1 == 0) goto L61
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>>> r2 = r6.y
            r2.remove()
        L61:
            if (r4 == 0) goto L6b
            if (r1 == 0) goto L6a
            java.util.concurrent.ConcurrentMap<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> r7 = r6.n3
            r7.putAll(r0)
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GSON (2.11.0) cannot handle "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L82:
            if (r1 == 0) goto L89
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>>> r0 = r6.y
            r0.remove()
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.getAdapter(com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
    }

    public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory typeAdapterFactory, TypeToken<T> typeToken) {
        Objects.requireNonNull(typeAdapterFactory, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        if (this.f3012gv.isClassJsonAdapterFactory(typeToken, typeAdapterFactory)) {
            typeAdapterFactory = this.f3012gv;
        }
        boolean z = false;
        for (TypeAdapterFactory typeAdapterFactory2 : this.f3021v) {
            if (z) {
                TypeAdapter<T> typeAdapterCreate = typeAdapterFactory2.create(this, typeToken);
                if (typeAdapterCreate != null) {
                    return typeAdapterCreate;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z = true;
            }
        }
        if (!z) {
            return getAdapter(typeToken);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken);
    }

    public boolean htmlSafe() {
        return this.f3019t;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        Strictness strictness = this.f3022wz;
        if (strictness == null) {
            strictness = Strictness.LEGACY_STRICT;
        }
        jsonReader.setStrictness(strictness);
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer writer) throws IOException {
        if (this.f3010f) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.setFormattingStyle(this.f3020tl);
        jsonWriter.setHtmlSafe(this.f3019t);
        Strictness strictness = this.f3022wz;
        if (strictness == null) {
            strictness = Strictness.LEGACY_STRICT;
        }
        jsonWriter.setStrictness(strictness);
        jsonWriter.setSerializeNulls(this.f3008c5);
        return jsonWriter;
    }

    public boolean serializeNulls() {
        return this.f3008c5;
    }

    public String toJson(Object obj) {
        return obj == null ? toJson((JsonElement) JsonNull.INSTANCE) : toJson(obj, obj.getClass());
    }

    public JsonElement toJsonTree(Object obj) {
        return obj == null ? JsonNull.INSTANCE : toJsonTree(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.f3008c5 + ",factories:" + this.f3021v + ",instanceCreators:" + this.zn + "}";
    }

    public final TypeAdapter<Number> v(boolean z) {
        return z ? TypeAdapters.DOUBLE : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                Gson.gv(dDoubleValue);
                jsonWriter.value(dDoubleValue);
            }
        };
    }

    public <T> T fromJson(String str, Type type) throws JsonSyntaxException {
        return (T) fromJson(str, TypeToken.get(type));
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public JsonElement toJsonTree(Object obj, Type type) {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        toJson(obj, type, jsonTreeWriter);
        return jsonTreeWriter.get();
    }

    public <T> T fromJson(String str, TypeToken<T> typeToken) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new StringReader(str), typeToken);
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        return (T) Primitives.wrap(cls).cast(fromJson(reader, TypeToken.get((Class) cls)));
    }

    public void toJson(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((JsonElement) JsonNull.INSTANCE, appendable);
        }
    }

    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, InstanceCreator<?>> map, boolean z, boolean z5, boolean z7, boolean z8, FormattingStyle formattingStyle, Strictness strictness, boolean z9, boolean z10, LongSerializationPolicy longSerializationPolicy, String str, int i, int i5, List<TypeAdapterFactory> list, List<TypeAdapterFactory> list2, List<TypeAdapterFactory> list3, ToNumberStrategy toNumberStrategy, ToNumberStrategy toNumberStrategy2, List<ReflectionAccessFilter> list4) {
        this.y = new ThreadLocal<>();
        this.n3 = new ConcurrentHashMap();
        this.f3007a = excluder;
        this.f3011fb = fieldNamingStrategy;
        this.f3018s = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map, z10, list4);
        this.zn = constructorConstructor;
        this.f3008c5 = z;
        this.f3014i9 = z5;
        this.f3010f = z7;
        this.f3019t = z8;
        this.f3020tl = formattingStyle;
        this.f3022wz = strictness;
        this.f3024xc = z9;
        this.w = z10;
        this.z = longSerializationPolicy;
        this.f3016p = str;
        this.f3015mt = i;
        this.f3009co = i5;
        this.f3017r = list;
        this.f3023x4 = list2;
        this.f3013i4 = toNumberStrategy;
        this.f3 = toNumberStrategy2;
        this.n = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList.add(ObjectTypeAdapter.getFactory(toNumberStrategy));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.STRING_FACTORY);
        arrayList.add(TypeAdapters.INTEGER_FACTORY);
        arrayList.add(TypeAdapters.BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.BYTE_FACTORY);
        arrayList.add(TypeAdapters.SHORT_FACTORY);
        TypeAdapter<Number> typeAdapterFb = fb(longSerializationPolicy);
        arrayList.add(TypeAdapters.newFactory(Long.TYPE, Long.class, typeAdapterFb));
        arrayList.add(TypeAdapters.newFactory(Double.TYPE, Double.class, v(z9)));
        arrayList.add(TypeAdapters.newFactory(Float.TYPE, Float.class, a(z9)));
        arrayList.add(NumberTypeAdapter.getFactory(toNumberStrategy2));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.newFactory(AtomicLong.class, n3(typeAdapterFb)));
        arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, zn(typeAdapterFb)));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList.add(TypeAdapters.CHARACTER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
        arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
        arrayList.add(TypeAdapters.newFactory(LazilyParsedNumber.class, TypeAdapters.LAZILY_PARSED_NUMBER));
        arrayList.add(TypeAdapters.URL_FACTORY);
        arrayList.add(TypeAdapters.URI_FACTORY);
        arrayList.add(TypeAdapters.UUID_FACTORY);
        arrayList.add(TypeAdapters.CURRENCY_FACTORY);
        arrayList.add(TypeAdapters.LOCALE_FACTORY);
        arrayList.add(TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList.add(TypeAdapters.BIT_SET_FACTORY);
        arrayList.add(DefaultDateTypeAdapter.DEFAULT_STYLE_FACTORY);
        arrayList.add(TypeAdapters.CALENDAR_FACTORY);
        if (SqlTypesSupport.SUPPORTS_SQL_TYPES) {
            arrayList.add(SqlTypesSupport.TIME_FACTORY);
            arrayList.add(SqlTypesSupport.DATE_FACTORY);
            arrayList.add(SqlTypesSupport.TIMESTAMP_FACTORY);
        }
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CLASS_FACTORY);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor, z5));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.f3012gv = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.ENUM_FACTORY);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f3021v = Collections.unmodifiableList(arrayList);
    }

    public <T> T fromJson(Reader reader, Type type) throws JsonSyntaxException, JsonIOException {
        return (T) fromJson(reader, TypeToken.get(type));
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            toJson(obj, type, newJsonWriter(Streams.writerForAppendable(appendable)));
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        }
    }

    public <T> T fromJson(Reader reader, TypeToken<T> typeToken) throws JsonSyntaxException, JsonIOException {
        JsonReader jsonReaderNewJsonReader = newJsonReader(reader);
        T t3 = (T) fromJson(jsonReaderNewJsonReader, typeToken);
        y(t3, jsonReaderNewJsonReader);
        return t3;
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        TypeAdapter adapter = getAdapter(TypeToken.get(type));
        Strictness strictness = jsonWriter.getStrictness();
        Strictness strictness2 = this.f3022wz;
        if (strictness2 != null) {
            jsonWriter.setStrictness(strictness2);
        } else if (jsonWriter.getStrictness() == Strictness.LEGACY_STRICT) {
            jsonWriter.setStrictness(Strictness.LENIENT);
        }
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f3019t);
        jsonWriter.setSerializeNulls(this.f3008c5);
        try {
            try {
                try {
                    adapter.write(jsonWriter, obj);
                } catch (AssertionError e4) {
                    throw new AssertionError("AssertionError (GSON 2.11.0): " + e4.getMessage(), e4);
                }
            } catch (IOException e5) {
                throw new JsonIOException(e5);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) throws JsonSyntaxException, JsonIOException {
        return (T) fromJson(jsonReader, TypeToken.get(type));
    }

    public <T> T fromJson(JsonReader jsonReader, TypeToken<T> typeToken) throws JsonSyntaxException, JsonIOException {
        boolean z;
        Strictness strictness = jsonReader.getStrictness();
        Strictness strictness2 = this.f3022wz;
        if (strictness2 != null) {
            jsonReader.setStrictness(strictness2);
        } else if (jsonReader.getStrictness() == Strictness.LEGACY_STRICT) {
            jsonReader.setStrictness(Strictness.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        jsonReader.peek();
                        z = false;
                        try {
                            return getAdapter(typeToken).read(jsonReader);
                        } catch (EOFException e4) {
                            e = e4;
                            if (z) {
                                jsonReader.setStrictness(strictness);
                                return null;
                            }
                            throw new JsonSyntaxException(e);
                        }
                    } finally {
                        jsonReader.setStrictness(strictness);
                    }
                } catch (EOFException e5) {
                    e = e5;
                    z = true;
                }
            } catch (IOException e6) {
                throw new JsonSyntaxException(e6);
            }
        } catch (AssertionError e8) {
            throw new AssertionError("AssertionError (GSON 2.11.0): " + e8.getMessage(), e8);
        } catch (IllegalStateException e9) {
            throw new JsonSyntaxException(e9);
        }
    }

    public <T> TypeAdapter<T> getAdapter(Class<T> cls) {
        return getAdapter(TypeToken.get((Class) cls));
    }

    public <T> T fromJson(JsonElement jsonElement, Class<T> cls) throws JsonSyntaxException {
        return (T) Primitives.wrap(cls).cast(fromJson(jsonElement, TypeToken.get((Class) cls)));
    }

    public <T> T fromJson(JsonElement jsonElement, Type type) throws JsonSyntaxException {
        return (T) fromJson(jsonElement, TypeToken.get(type));
    }

    public String toJson(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        toJson(jsonElement, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public <T> T fromJson(JsonElement jsonElement, TypeToken<T> typeToken) throws JsonSyntaxException {
        if (jsonElement == null) {
            return null;
        }
        return (T) fromJson(new JsonTreeReader(jsonElement), typeToken);
    }

    public void toJson(JsonElement jsonElement, Appendable appendable) throws JsonIOException {
        try {
            toJson(jsonElement, newJsonWriter(Streams.writerForAppendable(appendable)));
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        }
    }

    public void toJson(JsonElement jsonElement, JsonWriter jsonWriter) throws JsonIOException {
        Strictness strictness = jsonWriter.getStrictness();
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f3019t);
        jsonWriter.setSerializeNulls(this.f3008c5);
        Strictness strictness2 = this.f3022wz;
        if (strictness2 != null) {
            jsonWriter.setStrictness(strictness2);
        } else if (jsonWriter.getStrictness() == Strictness.LEGACY_STRICT) {
            jsonWriter.setStrictness(Strictness.LENIENT);
        }
        try {
            try {
                Streams.write(jsonElement, jsonWriter);
            } catch (IOException e4) {
                throw new JsonIOException(e4);
            } catch (AssertionError e5) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e5.getMessage(), e5);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }
}
