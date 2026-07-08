package lb;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class wz extends w {
    public static final String[] n = new String[128];
    public String f3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f6159r = ":";
    public final hk1.a z;

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
    }

    public wz(hk1.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.z = aVar;
        rz(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ct(hk1.a r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = lb.wz.n
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.i4(r8, r4, r3)
        L2e:
            r7.z(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.i4(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.wz.ct(hk1.a, java.lang.String):void");
    }

    @Override // lb.w
    public w a() throws IOException {
        if (!this.f6155p) {
            rs();
            return u(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.z.close();
        int i = this.y;
        if (i > 1 || (i == 1 && this.f6158v[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.y = 0;
    }

    @Override // lb.w
    public w co(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.y == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iN = n();
        if ((iN != 3 && iN != 5) || this.f3 != null || this.f6155p) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f3 = str;
        this.f6154fb[this.y - 1] = str;
        return this;
    }

    @Override // lb.w
    public w d(long j) throws IOException {
        if (this.f6155p) {
            this.f6155p = false;
            return co(Long.toString(j));
        }
        rs();
        k();
        this.z.z(Long.toString(j));
        int[] iArr = this.f6156s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // lb.w
    public w ej(Number number) throws IOException {
        if (number == null) {
            return r();
        }
        String string = number.toString();
        if (!this.f6157t && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f6155p) {
            this.f6155p = false;
            return co(string);
        }
        rs();
        k();
        this.z.z(string);
        int[] iArr = this.f6156s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final w f7(int i, int i5, char c) throws IOException {
        int iN = n();
        if (iN != i5 && iN != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f3 != null) {
            throw new IllegalStateException("Dangling name: " + this.f3);
        }
        int i8 = this.y;
        int i10 = this.f6152co;
        if (i8 == (~i10)) {
            this.f6152co = ~i10;
            return this;
        }
        int i11 = i8 - 1;
        this.y = i11;
        this.f6154fb[i11] = null;
        int[] iArr = this.f6156s;
        int i12 = i8 - 2;
        iArr[i12] = iArr[i12] + 1;
        if (iN == i5) {
            jz();
        }
        this.z.writeByte(c);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.y == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.z.flush();
    }

    @Override // lb.w
    public w j(boolean z) throws IOException {
        if (this.f6155p) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        rs();
        k();
        this.z.z(z ? "true" : "false");
        int[] iArr = this.f6156s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void jz() throws IOException {
        if (this.f6153f == null) {
            return;
        }
        this.z.writeByte(10);
        int i = this.y;
        for (int i5 = 1; i5 < i; i5++) {
            this.z.z(this.f6153f);
        }
    }

    public final void k() throws IOException {
        int iN = n();
        int i = 2;
        if (iN == 1) {
            jz();
        } else if (iN == 2) {
            this.z.writeByte(44);
            jz();
        } else if (iN == 4) {
            this.z.z(this.f6159r);
            i = 5;
        } else {
            if (iN == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            i = 7;
            if (iN != 6) {
                if (iN != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f6157t) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        mg(i);
    }

    public final void oz() throws IOException {
        int iN = n();
        if (iN == 5) {
            this.z.writeByte(44);
        } else if (iN != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        jz();
        mg(4);
    }

    @Override // lb.w
    public w p() throws IOException {
        this.f6155p = false;
        return f7(3, 5, '}');
    }

    @Override // lb.w
    public w r() throws IOException {
        if (this.f6155p) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        if (this.f3 != null) {
            if (!this.w) {
                this.f3 = null;
                return this;
            }
            rs();
        }
        k();
        this.z.z("null");
        int[] iArr = this.f6156s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void rs() throws IOException {
        if (this.f3 != null) {
            oz();
            ct(this.z, this.f3);
            this.f3 = null;
        }
    }

    @Override // lb.w
    public w ta(double d4) throws IOException {
        if (!this.f6157t && (Double.isNaN(d4) || Double.isInfinite(d4))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
        if (this.f6155p) {
            this.f6155p = false;
            return co(Double.toString(d4));
        }
        rs();
        k();
        this.z.z(Double.toString(d4));
        int[] iArr = this.f6156s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final w u(int i, int i5, char c) throws IOException {
        int i8 = this.y;
        int i10 = this.f6152co;
        if (i8 == i10) {
            int[] iArr = this.f6158v;
            if (iArr[i8 - 1] == i || iArr[i8 - 1] == i5) {
                this.f6152co = ~i10;
                return this;
            }
        }
        k();
        t();
        rz(i);
        this.f6156s[this.y - 1] = 0;
        this.z.writeByte(c);
        return this;
    }

    @Override // lb.w
    public w w() throws IOException {
        return f7(1, 2, ']');
    }

    @Override // lb.w
    public w y() throws IOException {
        if (!this.f6155p) {
            rs();
            return u(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // lb.w
    public w yt(String str) throws IOException {
        if (str == null) {
            return r();
        }
        if (this.f6155p) {
            this.f6155p = false;
            return co(str);
        }
        rs();
        k();
        ct(this.z, str);
        int[] iArr = this.f6156s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
