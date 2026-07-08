package lb;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xc extends w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f6160r;
    public Object[] z = new Object[32];

    public xc() {
        rz(6);
    }

    @Override // lb.w
    public w a() throws IOException {
        if (this.f6155p) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
        }
        int i = this.y;
        int i5 = this.f6152co;
        if (i == i5 && this.f6158v[i - 1] == 3) {
            this.f6152co = ~i5;
            return this;
        }
        t();
        p pVar = new p();
        oz(pVar);
        this.z[this.y] = pVar;
        rz(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
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
        if (n() != 3 || this.f6160r != null || this.f6155p) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f6160r = str;
        this.f6154fb[this.y - 1] = str;
        return this;
    }

    @Override // lb.w
    public w d(long j) throws IOException {
        if (this.f6155p) {
            this.f6155p = false;
            return co(Long.toString(j));
        }
        oz(Long.valueOf(j));
        int[] iArr = this.f6156s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // lb.w
    public w ej(Number number) throws IOException {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return d(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return ta(number.doubleValue());
        }
        if (number == null) {
            return r();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f6155p) {
            this.f6155p = false;
            return co(bigDecimal.toString());
        }
        oz(bigDecimal);
        int[] iArr = this.f6156s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.y == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // lb.w
    public w j(boolean z) throws IOException {
        if (this.f6155p) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        oz(Boolean.valueOf(z));
        int[] iArr = this.f6156s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final xc oz(Object obj) {
        String str;
        Object objPut;
        int iN = n();
        int i = this.y;
        if (i == 1) {
            if (iN != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.f6158v[i - 1] = 7;
            this.z[i - 1] = obj;
        } else if (iN != 3 || (str = this.f6160r) == null) {
            if (iN != 1) {
                if (iN == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                throw new IllegalStateException("Nesting problem.");
            }
            ((List) this.z[i - 1]).add(obj);
        } else {
            if ((obj != null || this.w) && (objPut = ((Map) this.z[i - 1]).put(str, obj)) != null) {
                throw new IllegalArgumentException("Map key '" + this.f6160r + "' has multiple values at path " + getPath() + ": " + objPut + " and " + obj);
            }
            this.f6160r = null;
        }
        return this;
    }

    @Override // lb.w
    public w p() throws IOException {
        if (n() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f6160r != null) {
            throw new IllegalStateException("Dangling name: " + this.f6160r);
        }
        int i = this.y;
        int i5 = this.f6152co;
        if (i == (~i5)) {
            this.f6152co = ~i5;
            return this;
        }
        this.f6155p = false;
        int i8 = i - 1;
        this.y = i8;
        this.z[i8] = null;
        this.f6154fb[i8] = null;
        int[] iArr = this.f6156s;
        int i10 = i - 2;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // lb.w
    public w r() throws IOException {
        if (this.f6155p) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        oz(null);
        int[] iArr = this.f6156s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // lb.w
    public w ta(double d4) throws IOException {
        if (!this.f6157t && (Double.isNaN(d4) || d4 == Double.NEGATIVE_INFINITY || d4 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
        if (this.f6155p) {
            this.f6155p = false;
            return co(Double.toString(d4));
        }
        oz(Double.valueOf(d4));
        int[] iArr = this.f6156s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // lb.w
    public w w() throws IOException {
        if (n() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i = this.y;
        int i5 = this.f6152co;
        if (i == (~i5)) {
            this.f6152co = ~i5;
            return this;
        }
        int i8 = i - 1;
        this.y = i8;
        this.z[i8] = null;
        int[] iArr = this.f6156s;
        int i10 = i - 2;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // lb.w
    public w y() throws IOException {
        if (this.f6155p) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
        }
        int i = this.y;
        int i5 = this.f6152co;
        if (i == i5 && this.f6158v[i - 1] == 1) {
            this.f6152co = ~i5;
            return this;
        }
        t();
        ArrayList arrayList = new ArrayList();
        oz(arrayList);
        Object[] objArr = this.z;
        int i8 = this.y;
        objArr[i8] = arrayList;
        this.f6156s[i8] = 0;
        rz(1);
        return this;
    }

    @Override // lb.w
    public w yt(String str) throws IOException {
        if (this.f6155p) {
            this.f6155p = false;
            return co(str);
        }
        oz(str);
        int[] iArr = this.f6156s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
