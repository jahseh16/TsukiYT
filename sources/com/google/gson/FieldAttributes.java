package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class FieldAttributes {
    public final Field y;

    public FieldAttributes(Field field) {
        Objects.requireNonNull(field);
        this.y = field;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.y.getAnnotation(cls);
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.y.getAnnotations());
    }

    public Class<?> getDeclaredClass() {
        return this.y.getType();
    }

    public Type getDeclaredType() {
        return this.y.getGenericType();
    }

    public Class<?> getDeclaringClass() {
        return this.y.getDeclaringClass();
    }

    public String getName() {
        return this.y.getName();
    }

    public boolean hasModifier(int i) {
        return (i & this.y.getModifiers()) != 0;
    }

    public String toString() {
        return this.y.toString();
    }
}
