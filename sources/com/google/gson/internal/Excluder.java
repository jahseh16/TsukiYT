package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = new Excluder();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3042s;
    public double y = -1.0d;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3044v = 136;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f3041fb = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<ExclusionStrategy> f3040f = Collections.emptyList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List<ExclusionStrategy> f3043t = Collections.emptyList();

    public static boolean zn(Class<?> cls) {
        return cls.isMemberClass() && !ReflectionHelper.isStatic(cls);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        final boolean zExcludeClass = excludeClass(rawType, true);
        final boolean zExcludeClass2 = excludeClass(rawType, false);
        if (zExcludeClass || zExcludeClass2) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
                public volatile TypeAdapter<T> y;

                @Override // com.google.gson.TypeAdapter
                public T read(JsonReader jsonReader) throws IOException {
                    if (!zExcludeClass2) {
                        return y().read(jsonReader);
                    }
                    jsonReader.skipValue();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t3) throws IOException {
                    if (zExcludeClass) {
                        jsonWriter.nullValue();
                    } else {
                        y().write(jsonWriter, t3);
                    }
                }

                public final TypeAdapter<T> y() {
                    TypeAdapter<T> typeAdapter = this.y;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(Excluder.this, typeToken);
                    this.y = delegateAdapter;
                    return delegateAdapter;
                }
            };
        }
        return null;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluderClone = clone();
        excluderClone.f3041fb = false;
        return excluderClone;
    }

    public boolean excludeClass(Class<?> cls, boolean z) {
        if (this.y != -1.0d && !fb((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return true;
        }
        if (!this.f3041fb && zn(cls)) {
            return true;
        }
        if (!z && !Enum.class.isAssignableFrom(cls) && ReflectionHelper.isAnonymousOrNonStaticLocal(cls)) {
            return true;
        }
        Iterator<ExclusionStrategy> it = (z ? this.f3040f : this.f3043t).iterator();
        while (it.hasNext()) {
            if (it.next().shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean excludeField(Field field, boolean z) {
        Expose expose;
        if ((this.f3044v & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.y != -1.0d && !fb((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f3042s && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z ? expose.deserialize() : expose.serialize()))) || excludeClass(field.getType(), z)) {
            return true;
        }
        List<ExclusionStrategy> list = z ? this.f3040f : this.f3043t;
        if (list.isEmpty()) {
            return false;
        }
        FieldAttributes fieldAttributes = new FieldAttributes(field);
        Iterator<ExclusionStrategy> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().shouldSkipField(fieldAttributes)) {
                return true;
            }
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluderClone = clone();
        excluderClone.f3042s = true;
        return excluderClone;
    }

    public final boolean fb(Since since, Until until) {
        return gv(since) && v(until);
    }

    public final boolean gv(Since since) {
        if (since != null) {
            return this.y >= since.value();
        }
        return true;
    }

    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public final boolean v(Until until) {
        if (until != null) {
            return this.y < until.value();
        }
        return true;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z, boolean z5) {
        Excluder excluderClone = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.f3040f);
            excluderClone.f3040f = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z5) {
            ArrayList arrayList2 = new ArrayList(this.f3043t);
            excluderClone.f3043t = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return excluderClone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder excluderClone = clone();
        excluderClone.f3044v = 0;
        for (int i : iArr) {
            excluderClone.f3044v = i | excluderClone.f3044v;
        }
        return excluderClone;
    }

    public Excluder withVersion(double d4) {
        Excluder excluderClone = clone();
        excluderClone.y = d4;
        return excluderClone;
    }
}
