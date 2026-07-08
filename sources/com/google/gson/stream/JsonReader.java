package com.google.gson.stream;

import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.Strictness;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class JsonReader implements Closeable {
    public String[] c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f3105co;
    public int[] d0;
    public int[] f3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f3109r;
    public final Reader y;
    public int z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Strictness f3112v = Strictness.LEGACY_STRICT;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final char[] f3107fb = new char[UserMetadata.MAX_ATTRIBUTE_SIZE];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3110s = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3106f = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3111t = 0;
    public int w = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3108p = 0;
    public int n = 1;

    static {
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() { // from class: com.google.gson.stream.JsonReader.1
            @Override // com.google.gson.internal.JsonReaderInternalAccess
            public void promoteNameToValue(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader) jsonReader).promoteNameToValue();
                    return;
                }
                int iW = jsonReader.f3108p;
                if (iW == 0) {
                    iW = jsonReader.w();
                }
                if (iW == 13) {
                    jsonReader.f3108p = 9;
                } else if (iW == 12) {
                    jsonReader.f3108p = 8;
                } else {
                    if (iW != 14) {
                        throw jsonReader.jz("a name");
                    }
                    jsonReader.f3108p = 10;
                }
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.f3 = iArr;
        iArr[0] = 6;
        this.c = new String[32];
        this.d0 = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.y = reader;
    }

    private String co(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i5 = this.n;
            if (i >= i5) {
                return sb.toString();
            }
            int i8 = this.f3[i];
            switch (i8) {
                case 1:
                case 2:
                    int i10 = this.d0[i];
                    if (z && i10 > 0 && i == i5 - 1) {
                        i10--;
                    }
                    sb.append('[');
                    sb.append(i10);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.c[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i8);
            }
            i++;
        }
    }

    public final void a() throws MalformedJsonException {
        if (this.f3112v != Strictness.LENIENT) {
            throw f7("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    public void beginArray() throws IOException {
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 3) {
            throw jz("BEGIN_ARRAY");
        }
        d(1);
        this.d0[this.n - 1] = 0;
        this.f3108p = 0;
    }

    public void beginObject() throws IOException {
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 1) {
            throw jz("BEGIN_OBJECT");
        }
        d(3);
        this.f3108p = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.f3110s = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.f3107fb
            r1 = 0
        L3:
            int r2 = r10.f3110s
            int r3 = r10.f3106f
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L6c
            int r7 = r2 + 1
            char r2 = r0[r2]
            com.google.gson.Strictness r8 = r10.f3112v
            com.google.gson.Strictness r9 = com.google.gson.Strictness.STRICT
            if (r8 != r9) goto L24
            r8 = 32
            if (r2 < r8) goto L1d
            goto L24
        L1d:
            java.lang.String r11 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            com.google.gson.stream.MalformedJsonException r11 = r10.f7(r11)
            throw r11
        L24:
            if (r2 != r11) goto L3a
            r10.f3110s = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L32
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r3, r7)
            return r11
        L32:
            r1.append(r0, r3, r7)
            java.lang.String r11 = r1.toString()
            return r11
        L3a:
            r8 = 92
            if (r2 != r8) goto L5f
            r10.f3110s = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L50
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L50:
            r1.append(r0, r3, r2)
            char r2 = r10.ej()
            r1.append(r2)
            int r2 = r10.f3110s
            int r3 = r10.f3106f
            goto L7
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r10.f3111t
            int r2 = r2 + r6
            r10.f3111t = r2
            r10.w = r7
        L6a:
            r2 = r7
            goto L9
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r10.f3110s = r2
            boolean r2 = r10.p(r6)
            if (r2 == 0) goto L8b
            goto L3
        L8b:
            java.lang.String r11 = "Unterminated string"
            com.google.gson.stream.MalformedJsonException r11 = r10.f7(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.c(char):java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3108p = 0;
        this.f3[0] = 8;
        this.n = 1;
        this.y.close();
    }

    public final void d(int i) {
        int i5 = this.n;
        int[] iArr = this.f3;
        if (i5 == iArr.length) {
            int i8 = i5 * 2;
            this.f3 = Arrays.copyOf(iArr, i8);
            this.d0 = Arrays.copyOf(this.d0, i8);
            this.c = (String[]) Arrays.copyOf(this.c, i8);
        }
        int[] iArr2 = this.f3;
        int i10 = this.n;
        this.n = i10 + 1;
        iArr2[i10] = i;
    }

    public final char ej() throws IOException {
        int i;
        if (this.f3110s == this.f3106f && !p(1)) {
            throw f7("Unterminated escape sequence");
        }
        char[] cArr = this.f3107fb;
        int i5 = this.f3110s;
        int i8 = i5 + 1;
        this.f3110s = i8;
        char c = cArr[i5];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            throw f7("Invalid escape sequence");
                        }
                        if (i5 + 5 > this.f3106f && !p(4)) {
                            throw f7("Unterminated escape sequence");
                        }
                        int i10 = this.f3110s;
                        int i11 = i10 + 4;
                        int i12 = 0;
                        while (i10 < i11) {
                            char c3 = this.f3107fb[i10];
                            int i13 = i12 << 4;
                            if (c3 >= '0' && c3 <= '9') {
                                i = c3 - '0';
                            } else if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'W';
                            } else {
                                if (c3 < 'A' || c3 > 'F') {
                                    throw f7("Malformed Unicode escape \\u" + new String(this.f3107fb, this.f3110s, 4));
                                }
                                i = c3 - '7';
                            }
                            i12 = i13 + i;
                            i10++;
                        }
                        this.f3110s += 4;
                        return (char) i12;
                    }
                }
            }
            return c;
        }
        if (this.f3112v == Strictness.STRICT) {
            throw f7("Cannot escape a newline character in strict mode");
        }
        this.f3111t++;
        this.w = i8;
        if (this.f3112v == Strictness.STRICT) {
            throw f7("Invalid escaped character \"'\" in strict mode");
        }
        return c;
    }

    public void endArray() throws IOException {
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 4) {
            throw jz("END_ARRAY");
        }
        int i = this.n;
        this.n = i - 1;
        int[] iArr = this.d0;
        int i5 = i - 2;
        iArr[i5] = iArr[i5] + 1;
        this.f3108p = 0;
    }

    public void endObject() throws IOException {
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 2) {
            throw jz("END_OBJECT");
        }
        int i = this.n;
        int i5 = i - 1;
        this.n = i5;
        this.c[i5] = null;
        int[] iArr = this.d0;
        int i8 = i - 2;
        iArr[i8] = iArr[i8] + 1;
        this.f3108p = 0;
    }

    public String f3() {
        return " at line " + (this.f3111t + 1) + " column " + ((this.f3110s - this.w) + 1) + " path " + getPath();
    }

    public final MalformedJsonException f7(String str) throws MalformedJsonException {
        throw new MalformedJsonException(str + f3() + "\nSee " + TroubleshootingGuide.createUrl("malformed-json"));
    }

    public String getPath() {
        return co(false);
    }

    public String getPreviousPath() {
        return co(true);
    }

    public final Strictness getStrictness() {
        return this.f3112v;
    }

    public boolean hasNext() throws IOException {
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        return (iW == 2 || iW == 4 || iW == 17) ? false : true;
    }

    public final boolean isLenient() {
        return this.f3112v == Strictness.LENIENT;
    }

    public final boolean j(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f3110s + length > this.f3106f && !p(length)) {
                return false;
            }
            char[] cArr = this.f3107fb;
            int i = this.f3110s;
            if (cArr[i] != '\n') {
                for (int i5 = 0; i5 < length; i5++) {
                    if (this.f3107fb[this.f3110s + i5] != str.charAt(i5)) {
                        break;
                    }
                }
                return true;
            }
            this.f3111t++;
            this.w = i + 1;
            this.f3110s++;
        }
    }

    public final IllegalStateException jz(String str) throws IOException {
        return new IllegalStateException("Expected " + str + " but was " + peek() + f3() + "\nSee " + TroubleshootingGuide.createUrl(peek() == JsonToken.NULL ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f3110s
            int r2 = r1 + r0
            int r3 = r4.f3106f
            if (r2 >= r3) goto L51
            char[] r2 = r4.f3107fb
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.a()
        L4b:
            int r1 = r4.f3110s
            int r1 = r1 + r0
            r4.f3110s = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f3110s = r1
            r0 = 1
            boolean r0 = r4.p(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.k():void");
    }

    public final int mg() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.f3107fb[this.f3110s];
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        boolean z = this.f3112v != Strictness.STRICT;
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (this.f3110s + i5 >= this.f3106f && !p(i5 + 1)) {
                return 0;
            }
            char c3 = this.f3107fb[this.f3110s + i5];
            if (c3 != str.charAt(i5) && (!z || c3 != str2.charAt(i5))) {
                return 0;
            }
        }
        if ((this.f3110s + length < this.f3106f || p(length + 1)) && r(this.f3107fb[this.f3110s + length])) {
            return 0;
        }
        this.f3110s += length;
        this.f3108p = i;
        return i;
    }

    public final int n(boolean z) throws IOException {
        char[] cArr = this.f3107fb;
        int i = this.f3110s;
        int i5 = this.f3106f;
        while (true) {
            if (i == i5) {
                this.f3110s = i;
                if (!p(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + f3());
                }
                i = this.f3110s;
                i5 = this.f3106f;
            }
            int i8 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f3111t++;
                this.w = i8;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f3110s = i8;
                    if (i8 == i5) {
                        this.f3110s = i;
                        boolean zP = p(2);
                        this.f3110s++;
                        if (!zP) {
                            return c;
                        }
                    }
                    a();
                    int i10 = this.f3110s;
                    char c3 = cArr[i10];
                    if (c3 == '*') {
                        this.f3110s = i10 + 1;
                        if (!j("*/")) {
                            throw f7("Unterminated comment");
                        }
                        i = this.f3110s + 2;
                        i5 = this.f3106f;
                    } else {
                        if (c3 != '/') {
                            return c;
                        }
                        this.f3110s = i10 + 1;
                        oz();
                        i = this.f3110s;
                        i5 = this.f3106f;
                    }
                } else {
                    if (c != '#') {
                        this.f3110s = i8;
                        return c;
                    }
                    this.f3110s = i8;
                    a();
                    oz();
                    i = this.f3110s;
                    i5 = this.f3106f;
                }
            }
            i = i8;
        }
    }

    public boolean nextBoolean() throws IOException {
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 5) {
            this.f3108p = 0;
            int[] iArr = this.d0;
            int i = this.n - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iW != 6) {
            throw jz("a boolean");
        }
        this.f3108p = 0;
        int[] iArr2 = this.d0;
        int i5 = this.n - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 15) {
            this.f3108p = 0;
            int[] iArr = this.d0;
            int i = this.n - 1;
            iArr[i] = iArr[i] + 1;
            return this.f3105co;
        }
        if (iW == 16) {
            this.f3109r = new String(this.f3107fb, this.f3110s, this.z);
            this.f3110s += this.z;
        } else if (iW == 8 || iW == 9) {
            this.f3109r = c(iW == 8 ? '\'' : '\"');
        } else if (iW == 10) {
            this.f3109r = rz();
        } else if (iW != 11) {
            throw jz("a double");
        }
        this.f3108p = 11;
        double d4 = Double.parseDouble(this.f3109r);
        if (this.f3112v != Strictness.LENIENT && (Double.isNaN(d4) || Double.isInfinite(d4))) {
            throw f7("JSON forbids NaN and infinities: " + d4);
        }
        this.f3109r = null;
        this.f3108p = 0;
        int[] iArr2 = this.d0;
        int i5 = this.n - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return d4;
    }

    public int nextInt() throws IOException {
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 15) {
            long j = this.f3105co;
            int i = (int) j;
            if (j == i) {
                this.f3108p = 0;
                int[] iArr = this.d0;
                int i5 = this.n - 1;
                iArr[i5] = iArr[i5] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.f3105co + f3());
        }
        if (iW == 16) {
            this.f3109r = new String(this.f3107fb, this.f3110s, this.z);
            this.f3110s += this.z;
        } else {
            if (iW != 8 && iW != 9 && iW != 10) {
                throw jz("an int");
            }
            if (iW == 10) {
                this.f3109r = rz();
            } else {
                this.f3109r = c(iW == 8 ? '\'' : '\"');
            }
            try {
                int i8 = Integer.parseInt(this.f3109r);
                this.f3108p = 0;
                int[] iArr2 = this.d0;
                int i10 = this.n - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return i8;
            } catch (NumberFormatException unused) {
            }
        }
        this.f3108p = 11;
        double d4 = Double.parseDouble(this.f3109r);
        int i11 = (int) d4;
        if (i11 != d4) {
            throw new NumberFormatException("Expected an int but was " + this.f3109r + f3());
        }
        this.f3109r = null;
        this.f3108p = 0;
        int[] iArr3 = this.d0;
        int i12 = this.n - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return i11;
    }

    public long nextLong() throws IOException {
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 15) {
            this.f3108p = 0;
            int[] iArr = this.d0;
            int i = this.n - 1;
            iArr[i] = iArr[i] + 1;
            return this.f3105co;
        }
        if (iW == 16) {
            this.f3109r = new String(this.f3107fb, this.f3110s, this.z);
            this.f3110s += this.z;
        } else {
            if (iW != 8 && iW != 9 && iW != 10) {
                throw jz("a long");
            }
            if (iW == 10) {
                this.f3109r = rz();
            } else {
                this.f3109r = c(iW == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f3109r);
                this.f3108p = 0;
                int[] iArr2 = this.d0;
                int i5 = this.n - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f3108p = 11;
        double d4 = Double.parseDouble(this.f3109r);
        long j4 = (long) d4;
        if (j4 != d4) {
            throw new NumberFormatException("Expected a long but was " + this.f3109r + f3());
        }
        this.f3109r = null;
        this.f3108p = 0;
        int[] iArr3 = this.d0;
        int i8 = this.n - 1;
        iArr3[i8] = iArr3[i8] + 1;
        return j4;
    }

    public String nextName() throws IOException {
        String strC;
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 14) {
            strC = rz();
        } else if (iW == 12) {
            strC = c('\'');
        } else {
            if (iW != 13) {
                throw jz("a name");
            }
            strC = c('\"');
        }
        this.f3108p = 0;
        this.c[this.n - 1] = strC;
        return strC;
    }

    public void nextNull() throws IOException {
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 7) {
            throw jz("null");
        }
        this.f3108p = 0;
        int[] iArr = this.d0;
        int i = this.n - 1;
        iArr[i] = iArr[i] + 1;
    }

    public String nextString() throws IOException {
        String str;
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 10) {
            str = rz();
        } else if (iW == 8) {
            str = c('\'');
        } else if (iW == 9) {
            str = c('\"');
        } else if (iW == 11) {
            str = this.f3109r;
            this.f3109r = null;
        } else if (iW == 15) {
            str = Long.toString(this.f3105co);
        } else {
            if (iW != 16) {
                throw jz("a string");
            }
            str = new String(this.f3107fb, this.f3110s, this.z);
            this.f3110s += this.z;
        }
        this.f3108p = 0;
        int[] iArr = this.d0;
        int i = this.n - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public final void oz() throws IOException {
        char c;
        do {
            if (this.f3110s >= this.f3106f && !p(1)) {
                return;
            }
            char[] cArr = this.f3107fb;
            int i = this.f3110s;
            int i5 = i + 1;
            this.f3110s = i5;
            c = cArr[i];
            if (c == '\n') {
                this.f3111t++;
                this.w = i5;
                return;
            }
        } while (c != '\r');
    }

    public final boolean p(int i) throws IOException {
        int i5;
        int i8;
        char[] cArr = this.f3107fb;
        int i10 = this.w;
        int i11 = this.f3110s;
        this.w = i10 - i11;
        int i12 = this.f3106f;
        if (i12 != i11) {
            int i13 = i12 - i11;
            this.f3106f = i13;
            System.arraycopy(cArr, i11, cArr, 0, i13);
        } else {
            this.f3106f = 0;
        }
        this.f3110s = 0;
        do {
            Reader reader = this.y;
            int i14 = this.f3106f;
            int i15 = reader.read(cArr, i14, cArr.length - i14);
            if (i15 == -1) {
                return false;
            }
            i5 = this.f3106f + i15;
            this.f3106f = i5;
            if (this.f3111t == 0 && (i8 = this.w) == 0 && i5 > 0 && cArr[0] == 65279) {
                this.f3110s++;
                this.w = i8 + 1;
                i++;
            }
        } while (i5 < i);
        return true;
    }

    public JsonToken peek() throws IOException {
        int iW = this.f3108p;
        if (iW == 0) {
            iW = w();
        }
        switch (iW) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case Code.UNIMPLEMENTED /* 12 */:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final boolean r(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        a();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        a();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String rz() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f3110s
            int r4 = r3 + r2
            int r5 = r6.f3106f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f3107fb
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.a()
            goto L5c
        L4e:
            char[] r3 = r6.f3107fb
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.p(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f3107fb
            int r4 = r6.f3110s
            r0.append(r3, r4, r2)
            int r3 = r6.f3110s
            int r3 = r3 + r2
            r6.f3110s = r3
            r2 = 1
            boolean r2 = r6.p(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f3107fb
            int r3 = r6.f3110s
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f3107fb
            int r3 = r6.f3110s
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f3110s
            int r2 = r2 + r1
            r6.f3110s = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.rz():java.lang.String");
    }

    @Deprecated
    public final void setLenient(boolean z) {
        setStrictness(z ? Strictness.LENIENT : Strictness.LEGACY_STRICT);
    }

    public final void setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f3112v = strictness;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() throws IOException {
        int i = 0;
        do {
            int iW = this.f3108p;
            if (iW == 0) {
                iW = w();
            }
            switch (iW) {
                case 1:
                    d(3);
                    i++;
                    this.f3108p = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.c[this.n - 1] = null;
                    }
                    this.n--;
                    i--;
                    this.f3108p = 0;
                    break;
                case 3:
                    d(1);
                    i++;
                    this.f3108p = 0;
                    break;
                case 4:
                    this.n--;
                    i--;
                    this.f3108p = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f3108p = 0;
                    break;
                case 8:
                    yt('\'');
                    this.f3108p = 0;
                    break;
                case 9:
                    yt('\"');
                    this.f3108p = 0;
                    break;
                case 10:
                    k();
                    this.f3108p = 0;
                    break;
                case Code.UNIMPLEMENTED /* 12 */:
                    yt('\'');
                    if (i == 0) {
                        this.c[this.n - 1] = "<skipped>";
                    }
                    this.f3108p = 0;
                    break;
                case 13:
                    yt('\"');
                    if (i == 0) {
                        this.c[this.n - 1] = "<skipped>";
                    }
                    this.f3108p = 0;
                    break;
                case 14:
                    k();
                    if (i == 0) {
                        this.c[this.n - 1] = "<skipped>";
                    }
                    this.f3108p = 0;
                    break;
                case 16:
                    this.f3110s += this.z;
                    this.f3108p = 0;
                    break;
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.d0;
        int i5 = this.n - 1;
        iArr[i5] = iArr[i5] + 1;
    }

    public final void t() throws IOException {
        n(true);
        int i = this.f3110s;
        this.f3110s = i - 1;
        if (i + 4 <= this.f3106f || p(5)) {
            int i5 = this.f3110s;
            char[] cArr = this.f3107fb;
            if (cArr[i5] == ')' && cArr[i5 + 1] == ']' && cArr[i5 + 2] == '}' && cArr[i5 + 3] == '\'' && cArr[i5 + 4] == '\n') {
                this.f3110s = i5 + 5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        if (r(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        if (r10 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
    
        if (r13 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a5, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a7, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ac, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ad, code lost:
    
        r18.f3105co = r11;
        r18.f3110s += r8;
        r18.f3108p = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b8, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b9, code lost:
    
        if (r9 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bc, code lost:
    
        if (r9 == 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bf, code lost:
    
        if (r9 != 7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c4, code lost:
    
        r18.z = r8;
        r18.f3108p = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ca, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cb, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ta() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.ta():int");
    }

    public String toString() {
        return getClass().getSimpleName() + f3();
    }

    public int w() throws IOException {
        int iN;
        int[] iArr = this.f3;
        int i = this.n;
        int i5 = iArr[i - 1];
        if (i5 == 1) {
            iArr[i - 1] = 2;
        } else if (i5 == 2) {
            int iN2 = n(true);
            if (iN2 != 44) {
                if (iN2 != 59) {
                    if (iN2 != 93) {
                        throw f7("Unterminated array");
                    }
                    this.f3108p = 4;
                    return 4;
                }
                a();
            }
        } else {
            if (i5 == 3 || i5 == 5) {
                iArr[i - 1] = 4;
                if (i5 == 5 && (iN = n(true)) != 44) {
                    if (iN != 59) {
                        if (iN != 125) {
                            throw f7("Unterminated object");
                        }
                        this.f3108p = 2;
                        return 2;
                    }
                    a();
                }
                int iN3 = n(true);
                if (iN3 == 34) {
                    this.f3108p = 13;
                    return 13;
                }
                if (iN3 == 39) {
                    a();
                    this.f3108p = 12;
                    return 12;
                }
                if (iN3 == 125) {
                    if (i5 == 5) {
                        throw f7("Expected name");
                    }
                    this.f3108p = 2;
                    return 2;
                }
                a();
                this.f3110s--;
                if (!r((char) iN3)) {
                    throw f7("Expected name");
                }
                this.f3108p = 14;
                return 14;
            }
            if (i5 == 4) {
                iArr[i - 1] = 5;
                int iN4 = n(true);
                if (iN4 != 58) {
                    if (iN4 != 61) {
                        throw f7("Expected ':'");
                    }
                    a();
                    if (this.f3110s < this.f3106f || p(1)) {
                        char[] cArr = this.f3107fb;
                        int i8 = this.f3110s;
                        if (cArr[i8] == '>') {
                            this.f3110s = i8 + 1;
                        }
                    }
                }
            } else if (i5 == 6) {
                if (this.f3112v == Strictness.LENIENT) {
                    t();
                }
                this.f3[this.n - 1] = 7;
            } else if (i5 == 7) {
                if (n(false) == -1) {
                    this.f3108p = 17;
                    return 17;
                }
                a();
                this.f3110s--;
            } else if (i5 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iN5 = n(true);
        if (iN5 == 34) {
            this.f3108p = 9;
            return 9;
        }
        if (iN5 == 39) {
            a();
            this.f3108p = 8;
            return 8;
        }
        if (iN5 != 44 && iN5 != 59) {
            if (iN5 == 91) {
                this.f3108p = 3;
                return 3;
            }
            if (iN5 != 93) {
                if (iN5 == 123) {
                    this.f3108p = 1;
                    return 1;
                }
                this.f3110s--;
                int iMg = mg();
                if (iMg != 0) {
                    return iMg;
                }
                int iTa = ta();
                if (iTa != 0) {
                    return iTa;
                }
                if (!r(this.f3107fb[this.f3110s])) {
                    throw f7("Expected value");
                }
                a();
                this.f3108p = 10;
                return 10;
            }
            if (i5 == 1) {
                this.f3108p = 4;
                return 4;
            }
        }
        if (i5 != 1 && i5 != 2) {
            throw f7("Unexpected value");
        }
        a();
        this.f3110s--;
        this.f3108p = 7;
        return 7;
    }

    public final void yt(char c) throws IOException {
        char[] cArr = this.f3107fb;
        do {
            int i = this.f3110s;
            int i5 = this.f3106f;
            while (i < i5) {
                int i8 = i + 1;
                char c3 = cArr[i];
                if (c3 == c) {
                    this.f3110s = i8;
                    return;
                }
                if (c3 == '\\') {
                    this.f3110s = i8;
                    ej();
                    i = this.f3110s;
                    i5 = this.f3106f;
                } else {
                    if (c3 == '\n') {
                        this.f3111t++;
                        this.w = i8;
                    }
                    i = i8;
                }
            }
            this.f3110s = i;
        } while (p(1));
        throw f7("Unterminated string");
    }
}
