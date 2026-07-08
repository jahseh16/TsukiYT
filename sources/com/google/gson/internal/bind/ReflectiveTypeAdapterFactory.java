package com.google.gson.internal.bind;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f3075f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Excluder f3076fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f3077s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FieldNamingStrategy f3078v;
    public final ConstructorConstructor y;

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {
        public final FieldsData y;

        public Adapter(FieldsData fieldsData) {
            this.y = fieldsData;
        }

        public abstract T n3(A a6);

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            A aY = y();
            Map<String, BoundField> map = this.y.deserializedFields;
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    BoundField boundField = map.get(jsonReader.nextName());
                    if (boundField == null) {
                        jsonReader.skipValue();
                    } else {
                        zn(aY, jsonReader, boundField);
                    }
                }
                jsonReader.endObject();
                return n3(aY);
            } catch (IllegalAccessException e4) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e4);
            } catch (IllegalStateException e5) {
                throw new JsonSyntaxException(e5);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t3) throws IOException {
            if (t3 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator<BoundField> it = this.y.serializedFields.iterator();
                while (it.hasNext()) {
                    it.next().zn(jsonWriter, t3);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e4) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e4);
            }
        }

        public abstract A y();

        public abstract void zn(A a6, JsonReader jsonReader, BoundField boundField) throws IllegalAccessException, IOException;
    }

    public static abstract class BoundField {
        public final Field n3;
        public final String y;
        public final String zn;

        public BoundField(String str, Field field) {
            this.y = str;
            this.n3 = field;
            this.zn = field.getName();
        }

        public abstract void n3(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

        public abstract void y(JsonReader jsonReader, int i, Object[] objArr) throws JsonParseException, IOException;

        public abstract void zn(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {
        public final ObjectConstructor<T> n3;

        public FieldReflectionAdapter(ObjectConstructor<T> objectConstructor, FieldsData fieldsData) {
            super(fieldsData);
            this.n3 = objectConstructor;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T n3(T t3) {
            return t3;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T y() {
            return this.n3.construct();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void zn(T t3, JsonReader jsonReader, BoundField boundField) throws IllegalAccessException, IOException {
            boundField.n3(jsonReader, t3);
        }
    }

    public static class FieldsData {
        public static final FieldsData EMPTY = new FieldsData(Collections.emptyMap(), Collections.emptyList());
        public final Map<String, BoundField> deserializedFields;
        public final List<BoundField> serializedFields;

        public FieldsData(Map<String, BoundField> map, List<BoundField> list) {
            this.deserializedFields = map;
            this.serializedFields = list;
        }
    }

    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final Map<Class<?>, Object> f3086v = a();

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final Map<String, Integer> f3087gv;
        public final Constructor<T> n3;
        public final Object[] zn;

        public RecordAdapter(Class<T> cls, FieldsData fieldsData, boolean z) {
            super(fieldsData);
            this.f3087gv = new HashMap();
            Constructor<T> canonicalRecordConstructor = ReflectionHelper.getCanonicalRecordConstructor(cls);
            this.n3 = canonicalRecordConstructor;
            if (z) {
                ReflectiveTypeAdapterFactory.n3(null, canonicalRecordConstructor);
            } else {
                ReflectionHelper.makeAccessible(canonicalRecordConstructor);
            }
            String[] recordComponentNames = ReflectionHelper.getRecordComponentNames(cls);
            for (int i = 0; i < recordComponentNames.length; i++) {
                this.f3087gv.put(recordComponentNames[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.n3.getParameterTypes();
            this.zn = new Object[parameterTypes.length];
            for (int i5 = 0; i5 < parameterTypes.length; i5++) {
                this.zn[i5] = f3086v.get(parameterTypes[i5]);
            }
        }

        public static Map<Class<?>, Object> a() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* JADX INFO: renamed from: fb, reason: merged with bridge method [inline-methods] */
        public void zn(Object[] objArr, JsonReader jsonReader, BoundField boundField) throws IOException {
            Integer num = this.f3087gv.get(boundField.zn);
            if (num != null) {
                boundField.y(jsonReader, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + ReflectionHelper.constructorToString(this.n3) + "' for field with name '" + boundField.zn + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public Object[] y() {
            return (Object[]) this.zn.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public T n3(Object[] objArr) {
            try {
                return this.n3.newInstance(objArr);
            } catch (IllegalAccessException e4) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e4);
            } catch (IllegalArgumentException e5) {
                e = e5;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.n3) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e6) {
                e = e6;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.n3) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.n3) + "' with args " + Arrays.toString(objArr), e8.getCause());
            }
        }
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<ReflectionAccessFilter> list) {
        this.y = constructorConstructor;
        this.f3078v = fieldNamingStrategy;
        this.f3076fb = excluder;
        this.f3077s = jsonAdapterAnnotationTypeAdapterFactory;
        this.f3075f = list;
    }

    public static IllegalArgumentException gv(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ReflectionHelper.fieldToString(field) + " and " + ReflectionHelper.fieldToString(field2) + "\nSee " + TroubleshootingGuide.createUrl("duplicate-fields"));
    }

    public static <M extends AccessibleObject & Member> void n3(Object obj, M m5) {
        if (Modifier.isStatic(m5.getModifiers())) {
            obj = null;
        }
        if (ReflectionAccessFilterHelper.canAccess(m5, obj)) {
            return;
        }
        throw new JsonIOException(ReflectionHelper.getAccessibleObjectDescription(m5, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    public final List<String> a(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.f3078v.translateName(field));
        }
        String strValue = serializedName.value();
        String[] strArrAlternate = serializedName.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (ReflectionHelper.isAnonymousOrNonStaticLocal(rawType)) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                @Override // com.google.gson.TypeAdapter
                public T read(JsonReader jsonReader) throws IOException {
                    jsonReader.skipValue();
                    return null;
                }

                public String toString() {
                    return "AnonymousOrNonStaticLocalClassAdapter";
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t3) throws IOException {
                    jsonWriter.nullValue();
                }
            };
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.f3075f, rawType);
        if (filterResult != ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
            boolean z = filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
            return ReflectionHelper.isRecord(rawType) ? new RecordAdapter(rawType, v(gson, typeToken, rawType, z, true), z) : new FieldReflectionAdapter(this.y.get(typeToken), v(gson, typeToken, rawType, z, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    public final boolean fb(Field field, boolean z) {
        return !this.f3076fb.excludeField(field, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData v(com.google.gson.Gson r24, com.google.gson.reflect.TypeToken<?> r25, java.lang.Class<?> r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.v(com.google.gson.Gson, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldsData");
    }

    public final BoundField zn(Gson gson, Field field, final Method method, String str, TypeToken<?> typeToken, boolean z, final boolean z5) {
        final TypeAdapter<?> typeAdapterRuntimeTypeWrapper;
        final boolean zIsPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        int modifiers = field.getModifiers();
        boolean z7 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        TypeAdapter<?> typeAdapterZn = jsonAdapter != null ? this.f3077s.zn(this.y, gson, typeToken, jsonAdapter, false) : null;
        boolean z8 = typeAdapterZn != null;
        if (typeAdapterZn == null) {
            typeAdapterZn = gson.getAdapter(typeToken);
        }
        final TypeAdapter<?> typeAdapter = typeAdapterZn;
        if (z) {
            typeAdapterRuntimeTypeWrapper = z8 ? typeAdapter : new TypeAdapterRuntimeTypeWrapper<>(gson, typeAdapter, typeToken.getType());
        } else {
            typeAdapterRuntimeTypeWrapper = typeAdapter;
        }
        final boolean z9 = z7;
        return new BoundField(str, field) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.2
            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void n3(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
                Object obj2 = typeAdapter.read(jsonReader);
                if (obj2 == null && zIsPrimitive) {
                    return;
                }
                if (z5) {
                    ReflectiveTypeAdapterFactory.n3(obj, this.n3);
                } else if (z9) {
                    throw new JsonIOException("Cannot set value of 'static final' " + ReflectionHelper.getAccessibleObjectDescription(this.n3, false));
                }
                this.n3.set(obj, obj2);
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void y(JsonReader jsonReader, int i, Object[] objArr) throws JsonParseException, IOException {
                Object obj = typeAdapter.read(jsonReader);
                if (obj != null || !zIsPrimitive) {
                    objArr[i] = obj;
                    return;
                }
                throw new JsonParseException("null is not allowed as value for record component '" + this.zn + "' of primitive type; at path " + jsonReader.getPath());
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void zn(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
                Object objInvoke;
                if (z5) {
                    Method method2 = method;
                    if (method2 == null) {
                        ReflectiveTypeAdapterFactory.n3(obj, this.n3);
                    } else {
                        ReflectiveTypeAdapterFactory.n3(obj, method2);
                    }
                }
                Method method3 = method;
                if (method3 != null) {
                    try {
                        objInvoke = method3.invoke(obj, null);
                    } catch (InvocationTargetException e4) {
                        throw new JsonIOException("Accessor " + ReflectionHelper.getAccessibleObjectDescription(method, false) + " threw exception", e4.getCause());
                    }
                } else {
                    objInvoke = this.n3.get(obj);
                }
                if (objInvoke == obj) {
                    return;
                }
                jsonWriter.name(this.y);
                typeAdapterRuntimeTypeWrapper.write(jsonWriter, objInvoke);
            }
        };
    }
}
