package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Streams {
    public Streams() {
        throw new UnsupportedOperationException();
    }

    public static JsonElement parse(JsonReader jsonReader) throws JsonParseException {
        boolean z;
        try {
            try {
                jsonReader.peek();
                z = false;
                try {
                    return TypeAdapters.JSON_ELEMENT.read(jsonReader);
                } catch (EOFException e4) {
                    e = e4;
                    if (z) {
                        return JsonNull.INSTANCE;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (EOFException e5) {
                e = e5;
                z = true;
            }
        } catch (MalformedJsonException e6) {
            throw new JsonSyntaxException(e6);
        } catch (IOException e8) {
            throw new JsonIOException(e8);
        } catch (NumberFormatException e9) {
            throw new JsonSyntaxException(e9);
        }
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }

    public static final class AppendableWriter extends Writer {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final CurrentWrite f3060v = new CurrentWrite();
        public final Appendable y;

        public static class CurrentWrite implements CharSequence {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public String f3061v;
            public char[] y;

            public CurrentWrite() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.y[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.y.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i5) {
                return new String(this.y, i, i5 - i);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f3061v == null) {
                    this.f3061v = new String(this.y);
                }
                return this.f3061v;
            }

            public void y(char[] cArr) {
                this.y = cArr;
                this.f3061v = null;
            }
        }

        public AppendableWriter(Appendable appendable) {
            this.y = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i5) throws IOException {
            this.f3060v.y(cArr);
            this.y.append(this.f3060v, i, i5 + i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.y.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.y.append((char) i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i, int i5) throws IOException {
            this.y.append(charSequence, i, i5);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i5) throws IOException {
            Objects.requireNonNull(str);
            this.y.append(str, i, i5 + i);
        }
    }
}
