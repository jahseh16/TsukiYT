package lb;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements Closeable, Flushable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6153f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6155p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6157t;
    public boolean w;
    public int y = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f6158v = new int[32];

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public String[] f6154fb = new String[32];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f6156s = new int[32];

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f6152co = -1;

    public static w f3(hk1.a aVar) {
        return new wz(aVar);
    }

    public abstract w a() throws IOException;

    public final void c() throws IOException {
        int iN = n();
        if (iN != 5 && iN != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f6155p = true;
    }

    public abstract w co(String str) throws IOException;

    public abstract w d(long j) throws IOException;

    public abstract w ej(Number number) throws IOException;

    public final String getPath() {
        return t.y(this.y, this.f6158v, this.f6154fb, this.f6156s);
    }

    public abstract w j(boolean z) throws IOException;

    public final void mg(int i) {
        this.f6158v[this.y - 1] = i;
    }

    public final int n() {
        int i = this.y;
        if (i != 0) {
            return this.f6158v[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract w p() throws IOException;

    public abstract w r() throws IOException;

    public final void rz(int i) {
        int[] iArr = this.f6158v;
        int i5 = this.y;
        this.y = i5 + 1;
        iArr[i5] = i;
    }

    public final boolean t() {
        int i = this.y;
        int[] iArr = this.f6158v;
        if (i != iArr.length) {
            return false;
        }
        if (i == 256) {
            throw new s("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.f6158v = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f6154fb;
        this.f6154fb = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f6156s;
        this.f6156s = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof xc)) {
            return true;
        }
        xc xcVar = (xc) this;
        Object[] objArr = xcVar.z;
        xcVar.z = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    public abstract w ta(double d4) throws IOException;

    public abstract w w() throws IOException;

    public abstract w y() throws IOException;

    public abstract w yt(String str) throws IOException;
}
