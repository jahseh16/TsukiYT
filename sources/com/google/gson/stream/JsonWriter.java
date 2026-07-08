package com.google.gson.stream;

import com.google.gson.FormattingStyle;
import com.google.gson.Strictness;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class JsonWriter implements Closeable, Flushable {
    public static final String[] c;
    public static final Pattern f3 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] n = new String[128];

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f3113co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3114f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Strictness f3116p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FormattingStyle f3118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f3119t;
    public boolean w;
    public final Writer y;
    public String z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f3120v = new int[32];

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f3115fb = 0;

    static {
        for (int i = 0; i <= 31; i++) {
            n[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        c = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        f3(6);
        this.f3116p = Strictness.LEGACY_STRICT;
        this.f3117r = true;
        Objects.requireNonNull(writer, "out == null");
        this.y = writer;
        setFormattingStyle(FormattingStyle.COMPACT);
    }

    public static boolean w(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    public final void a() throws IOException {
        int iR = r();
        if (iR == 1) {
            n(2);
            p();
            return;
        }
        if (iR == 2) {
            this.y.append((CharSequence) this.f3119t);
            p();
        } else {
            if (iR == 4) {
                this.y.append((CharSequence) this.f3114f);
                n(5);
                return;
            }
            if (iR != 6) {
                if (iR != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f3116p != Strictness.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            n(7);
        }
    }

    public JsonWriter beginArray() throws IOException {
        rz();
        return co(1, '[');
    }

    public JsonWriter beginObject() throws IOException {
        rz();
        return co(3, '{');
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f3113co
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.c
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.n
        L9:
            java.io.Writer r1 = r8.y
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.y
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.y
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.y
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.y
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonWriter.c(java.lang.String):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.y.close();
        int i = this.f3115fb;
        if (i > 1 || (i == 1 && this.f3120v[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f3115fb = 0;
    }

    public final JsonWriter co(int i, char c3) throws IOException {
        a();
        f3(i);
        this.y.write(c3);
        return this;
    }

    public JsonWriter endArray() throws IOException {
        return t(1, 2, ']');
    }

    public JsonWriter endObject() throws IOException {
        return t(3, 5, '}');
    }

    public final void f3(int i) {
        int i5 = this.f3115fb;
        int[] iArr = this.f3120v;
        if (i5 == iArr.length) {
            this.f3120v = Arrays.copyOf(iArr, i5 * 2);
        }
        int[] iArr2 = this.f3120v;
        int i8 = this.f3115fb;
        this.f3115fb = i8 + 1;
        iArr2[i8] = i;
    }

    public void flush() throws IOException {
        if (this.f3115fb == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.y.flush();
    }

    public final FormattingStyle getFormattingStyle() {
        return this.f3118s;
    }

    public final boolean getSerializeNulls() {
        return this.f3117r;
    }

    public final Strictness getStrictness() {
        return this.f3116p;
    }

    public final boolean isHtmlSafe() {
        return this.f3113co;
    }

    public boolean isLenient() {
        return this.f3116p == Strictness.LENIENT;
    }

    public JsonWriter jsonValue(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        rz();
        a();
        this.y.append((CharSequence) str);
        return this;
    }

    public final void n(int i) {
        this.f3120v[this.f3115fb - 1] = i;
    }

    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.z != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iR = r();
        if (iR != 3 && iR != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.z = str;
        return this;
    }

    public JsonWriter nullValue() throws IOException {
        if (this.z != null) {
            if (!this.f3117r) {
                this.z = null;
                return this;
            }
            rz();
        }
        a();
        this.y.write("null");
        return this;
    }

    public final void p() throws IOException {
        if (this.w) {
            return;
        }
        this.y.write(this.f3118s.getNewline());
        int i = this.f3115fb;
        for (int i5 = 1; i5 < i; i5++) {
            this.y.write(this.f3118s.getIndent());
        }
    }

    public final int r() {
        int i = this.f3115fb;
        if (i != 0) {
            return this.f3120v[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void rz() throws IOException {
        if (this.z != null) {
            y();
            c(this.z);
            this.z = null;
        }
    }

    public final void setFormattingStyle(FormattingStyle formattingStyle) {
        Objects.requireNonNull(formattingStyle);
        this.f3118s = formattingStyle;
        this.f3119t = ",";
        if (formattingStyle.usesSpaceAfterSeparators()) {
            this.f3114f = ": ";
            if (this.f3118s.getNewline().isEmpty()) {
                this.f3119t = ", ";
            }
        } else {
            this.f3114f = ":";
        }
        this.w = this.f3118s.getNewline().isEmpty() && this.f3118s.getIndent().isEmpty();
    }

    public final void setHtmlSafe(boolean z) {
        this.f3113co = z;
    }

    public final void setIndent(String str) {
        if (str.isEmpty()) {
            setFormattingStyle(FormattingStyle.COMPACT);
        } else {
            setFormattingStyle(FormattingStyle.PRETTY.withIndent(str));
        }
    }

    @Deprecated
    public final void setLenient(boolean z) {
        setStrictness(z ? Strictness.LENIENT : Strictness.LEGACY_STRICT);
    }

    public final void setSerializeNulls(boolean z) {
        this.f3117r = z;
    }

    public final void setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f3116p = strictness;
    }

    public final JsonWriter t(int i, int i5, char c3) throws IOException {
        int iR = r();
        if (iR != i5 && iR != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.z != null) {
            throw new IllegalStateException("Dangling name: " + this.z);
        }
        this.f3115fb--;
        if (iR == i5) {
            p();
        }
        this.y.write(c3);
        return this;
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        rz();
        a();
        c(str);
        return this;
    }

    public final void y() throws IOException {
        int iR = r();
        if (iR == 5) {
            this.y.write(this.f3119t);
        } else if (iR != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        p();
        n(4);
    }

    public JsonWriter value(boolean z) throws IOException {
        rz();
        a();
        this.y.write(z ? "true" : "false");
        return this;
    }

    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        rz();
        a();
        this.y.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public JsonWriter value(float f4) throws IOException {
        rz();
        if (this.f3116p != Strictness.LENIENT && (Float.isNaN(f4) || Float.isInfinite(f4))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f4);
        }
        a();
        this.y.append((CharSequence) Float.toString(f4));
        return this;
    }

    public JsonWriter value(double d4) throws IOException {
        rz();
        if (this.f3116p != Strictness.LENIENT && (Double.isNaN(d4) || Double.isInfinite(d4))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
        a();
        this.y.append((CharSequence) Double.toString(d4));
        return this;
    }

    public JsonWriter value(long j) throws IOException {
        rz();
        a();
        this.y.write(Long.toString(j));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        rz();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!w(cls) && !f3.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (this.f3116p != Strictness.LENIENT) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
        }
        a();
        this.y.append((CharSequence) string);
        return this;
    }
}
