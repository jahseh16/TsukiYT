package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class JsonTreeWriter extends JsonWriter {

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public static final Writer f3070ej = new Writer() { // from class: com.google.gson.internal.bind.JsonTreeWriter.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i5) {
            throw new AssertionError();
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final JsonPrimitive f3071x = new JsonPrimitive("closed");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JsonElement f3072d;
    public final List<JsonElement> d0;
    public String fh;

    public JsonTreeWriter() {
        super(f3070ej);
        this.d0 = new ArrayList();
        this.f3072d = JsonNull.INSTANCE;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        JsonArray jsonArray = new JsonArray();
        ta(jsonArray);
        this.d0.add(jsonArray);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        JsonObject jsonObject = new JsonObject();
        ta(jsonObject);
        this.d0.add(jsonObject);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.d0.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.d0.add(f3071x);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (this.d0.isEmpty() || this.fh != null) {
            throw new IllegalStateException();
        }
        if (!(mg() instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        this.d0.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (this.d0.isEmpty() || this.fh != null) {
            throw new IllegalStateException();
        }
        if (!(mg() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        this.d0.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    public JsonElement get() {
        if (this.d0.isEmpty()) {
            return this.f3072d;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.d0);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) throws IOException {
        throw new UnsupportedOperationException();
    }

    public final JsonElement mg() {
        return this.d0.get(r0.size() - 1);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.d0.isEmpty() || this.fh != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(mg() instanceof JsonObject)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.fh = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        ta(JsonNull.INSTANCE);
        return this;
    }

    public final void ta(JsonElement jsonElement) {
        if (this.fh != null) {
            if (!jsonElement.isJsonNull() || getSerializeNulls()) {
                ((JsonObject) mg()).add(this.fh, jsonElement);
            }
            this.fh = null;
            return;
        }
        if (this.d0.isEmpty()) {
            this.f3072d = jsonElement;
            return;
        }
        JsonElement jsonElementMg = mg();
        if (!(jsonElementMg instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        ((JsonArray) jsonElementMg).add(jsonElement);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        ta(new JsonPrimitive(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z) throws IOException {
        ta(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        ta(new JsonPrimitive(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(float f3) throws IOException {
        if (!isLenient() && (Float.isNaN(f3) || Float.isInfinite(f3))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f3);
        }
        ta(new JsonPrimitive(Float.valueOf(f3)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d4) throws IOException {
        if (!isLenient() && (Double.isNaN(d4) || Double.isInfinite(d4))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d4);
        }
        ta(new JsonPrimitive(Double.valueOf(d4)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j) throws IOException {
        ta(new JsonPrimitive(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        ta(new JsonPrimitive(number));
        return this;
    }
}
