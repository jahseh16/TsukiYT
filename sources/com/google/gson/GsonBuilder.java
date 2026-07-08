package com.google.gson;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class GsonBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<TypeAdapterFactory> f3025a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f3026c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public ToNumberStrategy f3027co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3028f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f3029fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Map<Type, InstanceCreator<?>> f3030gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f3031i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public ToNumberStrategy f3032mt;
    public LongSerializationPolicy n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3033p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f3034s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3035t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public boolean f3036tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<TypeAdapterFactory> f3037v;
    public Strictness w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public FormattingStyle f3038wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public boolean f3039xc;
    public Excluder y;
    public final ArrayDeque<ReflectionAccessFilter> z;
    public FieldNamingStrategy zn;

    public GsonBuilder() {
        this.y = Excluder.DEFAULT;
        this.n3 = LongSerializationPolicy.DEFAULT;
        this.zn = FieldNamingPolicy.IDENTITY;
        this.f3030gv = new HashMap();
        this.f3037v = new ArrayList();
        this.f3025a = new ArrayList();
        this.f3029fb = false;
        this.f3034s = Gson.fh;
        this.f3026c5 = 2;
        this.f3031i9 = 2;
        this.f3028f = false;
        this.f3035t = false;
        this.f3036tl = true;
        this.f3038wz = Gson.d0;
        this.f3039xc = false;
        this.w = Gson.c;
        this.f3033p = true;
        this.f3032mt = Gson.mg;
        this.f3027co = Gson.f3006ta;
        this.z = new ArrayDeque<>();
    }

    public static int n3(int i) {
        if (i >= 0 && i <= 3) {
            return i;
        }
        throw new IllegalArgumentException("Invalid style: " + i);
    }

    public static void y(String str, int i, int i5, List<TypeAdapterFactory> list) {
        TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory;
        TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory2;
        boolean z = SqlTypesSupport.SUPPORTS_SQL_TYPES;
        TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory3 = null;
        if (str != null && !str.trim().isEmpty()) {
            typeAdapterFactoryCreateAdapterFactory = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(str);
            if (z) {
                typeAdapterFactoryCreateAdapterFactory3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(str);
                typeAdapterFactoryCreateAdapterFactory2 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(str);
            } else {
                typeAdapterFactoryCreateAdapterFactory2 = null;
            }
        } else {
            if (i == 2 && i5 == 2) {
                return;
            }
            TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory4 = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(i, i5);
            if (z) {
                typeAdapterFactoryCreateAdapterFactory3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(i, i5);
                TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory5 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(i, i5);
                typeAdapterFactoryCreateAdapterFactory = typeAdapterFactoryCreateAdapterFactory4;
                typeAdapterFactoryCreateAdapterFactory2 = typeAdapterFactoryCreateAdapterFactory5;
            } else {
                typeAdapterFactoryCreateAdapterFactory = typeAdapterFactoryCreateAdapterFactory4;
                typeAdapterFactoryCreateAdapterFactory2 = null;
            }
        }
        list.add(typeAdapterFactoryCreateAdapterFactory);
        if (z) {
            list.add(typeAdapterFactoryCreateAdapterFactory3);
            list.add(typeAdapterFactoryCreateAdapterFactory2);
        }
    }

    public static boolean zn(Type type) {
        return (type instanceof Class) && (type == Object.class || JsonElement.class.isAssignableFrom((Class) type));
    }

    public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
        Objects.requireNonNull(exclusionStrategy);
        this.y = this.y.withExclusionStrategy(exclusionStrategy, false, true);
        return this;
    }

    public GsonBuilder addReflectionAccessFilter(ReflectionAccessFilter reflectionAccessFilter) {
        Objects.requireNonNull(reflectionAccessFilter);
        this.z.addFirst(reflectionAccessFilter);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
        Objects.requireNonNull(exclusionStrategy);
        this.y = this.y.withExclusionStrategy(exclusionStrategy, true, false);
        return this;
    }

    public Gson create() {
        ArrayList arrayList = new ArrayList(this.f3037v.size() + this.f3025a.size() + 3);
        arrayList.addAll(this.f3037v);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f3025a);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        y(this.f3034s, this.f3026c5, this.f3031i9, arrayList);
        return new Gson(this.y, this.zn, new HashMap(this.f3030gv), this.f3029fb, this.f3028f, this.f3039xc, this.f3036tl, this.f3038wz, this.w, this.f3035t, this.f3033p, this.n3, this.f3034s, this.f3026c5, this.f3031i9, new ArrayList(this.f3037v), new ArrayList(this.f3025a), arrayList, this.f3032mt, this.f3027co, new ArrayList(this.z));
    }

    public GsonBuilder disableHtmlEscaping() {
        this.f3036tl = false;
        return this;
    }

    public GsonBuilder disableInnerClassSerialization() {
        this.y = this.y.disableInnerClassSerialization();
        return this;
    }

    public GsonBuilder disableJdkUnsafe() {
        this.f3033p = false;
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.f3028f = true;
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        Objects.requireNonNull(iArr);
        this.y = this.y.withModifiers(iArr);
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.y = this.y.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    public GsonBuilder generateNonExecutableJson() {
        this.f3039xc = true;
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type type, Object obj) {
        Objects.requireNonNull(type);
        boolean z = obj instanceof JsonSerializer;
        C$Gson$Preconditions.checkArgument(z || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator) || (obj instanceof TypeAdapter));
        if (zn(type)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        if (obj instanceof InstanceCreator) {
            this.f3030gv.put(type, (InstanceCreator) obj);
        }
        if (z || (obj instanceof JsonDeserializer)) {
            this.f3037v.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.f3037v.add(TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter) obj));
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeAdapterFactory) {
        Objects.requireNonNull(typeAdapterFactory);
        this.f3037v.add(typeAdapterFactory);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        Objects.requireNonNull(cls);
        boolean z = obj instanceof JsonSerializer;
        C$Gson$Preconditions.checkArgument(z || (obj instanceof JsonDeserializer) || (obj instanceof TypeAdapter));
        if (JsonElement.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + cls);
        }
        if ((obj instanceof JsonDeserializer) || z) {
            this.f3025a.add(TreeTypeAdapter.newTypeHierarchyFactory(cls, obj));
        }
        if (obj instanceof TypeAdapter) {
            this.f3037v.add(TypeAdapters.newTypeHierarchyFactory(cls, (TypeAdapter) obj));
        }
        return this;
    }

    public GsonBuilder serializeNulls() {
        this.f3029fb = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.f3035t = true;
        return this;
    }

    public GsonBuilder setDateFormat(String str) {
        if (str != null) {
            try {
                new SimpleDateFormat(str);
            } catch (IllegalArgumentException e4) {
                throw new IllegalArgumentException("The date pattern '" + str + "' is not valid", e4);
            }
        }
        this.f3034s = str;
        return this;
    }

    public GsonBuilder setExclusionStrategies(ExclusionStrategy... exclusionStrategyArr) {
        Objects.requireNonNull(exclusionStrategyArr);
        for (ExclusionStrategy exclusionStrategy : exclusionStrategyArr) {
            this.y = this.y.withExclusionStrategy(exclusionStrategy, true, true);
        }
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldNamingPolicy) {
        return setFieldNamingStrategy(fieldNamingPolicy);
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        Objects.requireNonNull(fieldNamingStrategy);
        this.zn = fieldNamingStrategy;
        return this;
    }

    public GsonBuilder setFormattingStyle(FormattingStyle formattingStyle) {
        Objects.requireNonNull(formattingStyle);
        this.f3038wz = formattingStyle;
        return this;
    }

    @Deprecated
    public GsonBuilder setLenient() {
        return setStrictness(Strictness.LENIENT);
    }

    public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longSerializationPolicy) {
        Objects.requireNonNull(longSerializationPolicy);
        this.n3 = longSerializationPolicy;
        return this;
    }

    public GsonBuilder setNumberToNumberStrategy(ToNumberStrategy toNumberStrategy) {
        Objects.requireNonNull(toNumberStrategy);
        this.f3027co = toNumberStrategy;
        return this;
    }

    public GsonBuilder setObjectToNumberStrategy(ToNumberStrategy toNumberStrategy) {
        Objects.requireNonNull(toNumberStrategy);
        this.f3032mt = toNumberStrategy;
        return this;
    }

    public GsonBuilder setPrettyPrinting() {
        return setFormattingStyle(FormattingStyle.PRETTY);
    }

    public GsonBuilder setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.w = strictness;
        return this;
    }

    public GsonBuilder setVersion(double d4) {
        if (!Double.isNaN(d4) && d4 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.y = this.y.withVersion(d4);
            return this;
        }
        throw new IllegalArgumentException("Invalid version: " + d4);
    }

    @Deprecated
    public GsonBuilder setDateFormat(int i) {
        this.f3026c5 = n3(i);
        this.f3034s = null;
        return this;
    }

    public GsonBuilder setDateFormat(int i, int i5) {
        this.f3026c5 = n3(i);
        this.f3031i9 = n3(i5);
        this.f3034s = null;
        return this;
    }

    public GsonBuilder(Gson gson) {
        this.y = Excluder.DEFAULT;
        this.n3 = LongSerializationPolicy.DEFAULT;
        this.zn = FieldNamingPolicy.IDENTITY;
        HashMap map = new HashMap();
        this.f3030gv = map;
        ArrayList arrayList = new ArrayList();
        this.f3037v = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f3025a = arrayList2;
        this.f3029fb = false;
        this.f3034s = Gson.fh;
        this.f3026c5 = 2;
        this.f3031i9 = 2;
        this.f3028f = false;
        this.f3035t = false;
        this.f3036tl = true;
        this.f3038wz = Gson.d0;
        this.f3039xc = false;
        this.w = Gson.c;
        this.f3033p = true;
        this.f3032mt = Gson.mg;
        this.f3027co = Gson.f3006ta;
        ArrayDeque<ReflectionAccessFilter> arrayDeque = new ArrayDeque<>();
        this.z = arrayDeque;
        this.y = gson.f3007a;
        this.zn = gson.f3011fb;
        map.putAll(gson.f3018s);
        this.f3029fb = gson.f3008c5;
        this.f3028f = gson.f3014i9;
        this.f3039xc = gson.f3010f;
        this.f3036tl = gson.f3019t;
        this.f3038wz = gson.f3020tl;
        this.w = gson.f3022wz;
        this.f3035t = gson.f3024xc;
        this.n3 = gson.z;
        this.f3034s = gson.f3016p;
        this.f3026c5 = gson.f3015mt;
        this.f3031i9 = gson.f3009co;
        arrayList.addAll(gson.f3017r);
        arrayList2.addAll(gson.f3023x4);
        this.f3033p = gson.w;
        this.f3032mt = gson.f3013i4;
        this.f3027co = gson.f3;
        arrayDeque.addAll(gson.n);
    }
}
