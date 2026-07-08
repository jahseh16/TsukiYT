package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class JsonTreeReader extends JsonReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Reader f3065b = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i5) {
            throw new AssertionError();
        }
    };

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public static final Object f3066hw = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3067d;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public String[] f3068ej;
    public Object[] fh;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f3069x;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonTreeReader$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[JsonToken.values().length];
            y = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                y[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                y[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                y[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(f3065b);
        this.fh = new Object[32];
        this.f3067d = 0;
        this.f3068ej = new String[32];
        this.f3069x = new int[32];
        ap(jsonElement);
    }

    private String f3() {
        return " at path " + getPath();
    }

    public final void ap(Object obj) {
        int i = this.f3067d;
        Object[] objArr = this.fh;
        if (i == objArr.length) {
            int i5 = i * 2;
            this.fh = Arrays.copyOf(objArr, i5);
            this.f3069x = Arrays.copyOf(this.f3069x, i5);
            this.f3068ej = (String[]) Arrays.copyOf(this.f3068ej, i5);
        }
        Object[] objArr2 = this.fh;
        int i8 = this.f3067d;
        this.f3067d = i8 + 1;
        objArr2[i8] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        u(JsonToken.BEGIN_ARRAY);
        ap(((JsonArray) eb()).iterator());
        this.f3069x[this.f3067d - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        u(JsonToken.BEGIN_OBJECT);
        ap(((JsonObject) eb()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.fh = new Object[]{f3066hw};
        this.f3067d = 1;
    }

    public final String co(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i5 = this.f3067d;
            if (i >= i5) {
                return sb.toString();
            }
            Object[] objArr = this.fh;
            Object obj = objArr[i];
            if (obj instanceof JsonArray) {
                i++;
                if (i < i5 && (objArr[i] instanceof Iterator)) {
                    int i8 = this.f3069x[i];
                    if (z && i8 > 0 && (i == i5 - 1 || i == i5 - 2)) {
                        i8--;
                    }
                    sb.append('[');
                    sb.append(i8);
                    sb.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i = i + 1) < i5 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.f3068ej[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public JsonElement ct() throws IOException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.NAME && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_DOCUMENT) {
            JsonElement jsonElement = (JsonElement) eb();
            skipValue();
            return jsonElement;
        }
        throw new IllegalStateException("Unexpected " + jsonTokenPeek + " when reading a JsonElement.");
    }

    public final Object eb() {
        return this.fh[this.f3067d - 1];
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        u(JsonToken.END_ARRAY);
        lc();
        lc();
        int i = this.f3067d;
        if (i > 0) {
            int[] iArr = this.f3069x;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        u(JsonToken.END_OBJECT);
        this.f3068ej[this.f3067d - 1] = null;
        lc();
        lc();
        int i = this.f3067d;
        if (i > 0) {
            int[] iArr = this.f3069x;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return co(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return co(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken jsonTokenPeek = peek();
        return (jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_DOCUMENT) ? false : true;
    }

    public final Object lc() {
        Object[] objArr = this.fh;
        int i = this.f3067d - 1;
        this.f3067d = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        u(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) lc()).getAsBoolean();
        int i = this.f3067d;
        if (i > 0) {
            int[] iArr = this.f3069x;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + f3());
        }
        double asDouble = ((JsonPrimitive) eb()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + asDouble);
        }
        lc();
        int i = this.f3067d;
        if (i > 0) {
            int[] iArr = this.f3069x;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + f3());
        }
        int asInt = ((JsonPrimitive) eb()).getAsInt();
        lc();
        int i = this.f3067d;
        if (i > 0) {
            int[] iArr = this.f3069x;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return asInt;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + f3());
        }
        long asLong = ((JsonPrimitive) eb()).getAsLong();
        lc();
        int i = this.f3067d;
        if (i > 0) {
            int[] iArr = this.f3069x;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        return rs(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        u(JsonToken.NULL);
        lc();
        int i = this.f3067d;
        if (i > 0) {
            int[] iArr = this.f3069x;
            int i5 = i - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek == jsonToken || jsonTokenPeek == JsonToken.NUMBER) {
            String asString = ((JsonPrimitive) lc()).getAsString();
            int i = this.f3067d;
            if (i > 0) {
                int[] iArr = this.f3069x;
                int i5 = i - 1;
                iArr[i5] = iArr[i5] + 1;
            }
            return asString;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + f3());
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f3067d == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objEb = eb();
        if (objEb instanceof Iterator) {
            boolean z = this.fh[this.f3067d - 2] instanceof JsonObject;
            Iterator it = (Iterator) objEb;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            ap(it.next());
            return peek();
        }
        if (objEb instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objEb instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (objEb instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) objEb;
            if (jsonPrimitive.isString()) {
                return JsonToken.STRING;
            }
            if (jsonPrimitive.isBoolean()) {
                return JsonToken.BOOLEAN;
            }
            if (jsonPrimitive.isNumber()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (objEb instanceof JsonNull) {
            return JsonToken.NULL;
        }
        if (objEb == f3066hw) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objEb.getClass().getName() + " is not supported");
    }

    public void promoteNameToValue() throws IOException {
        u(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) eb()).next();
        ap(entry.getValue());
        ap(new JsonPrimitive((String) entry.getKey()));
    }

    public final String rs(boolean z) throws IOException {
        u(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) eb()).next();
        String str = (String) entry.getKey();
        this.f3068ej[this.f3067d - 1] = z ? "<skipped>" : str;
        ap(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        int i = AnonymousClass2.y[peek().ordinal()];
        if (i == 1) {
            rs(true);
            return;
        }
        if (i == 2) {
            endArray();
            return;
        }
        if (i == 3) {
            endObject();
            return;
        }
        if (i != 4) {
            lc();
            int i5 = this.f3067d;
            if (i5 > 0) {
                int[] iArr = this.f3069x;
                int i8 = i5 - 1;
                iArr[i8] = iArr[i8] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return JsonTreeReader.class.getSimpleName() + f3();
    }

    public final void u(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + f3());
    }
}
