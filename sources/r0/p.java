package r0;

import android.net.Uri;
import androidx.annotation.Nullable;
import ft.rb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public final long f7518a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public final String f7519c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Object f7520f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final long f7521fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public final byte[] f7522gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final int f7523i9;
    public final long n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f7524s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map<String, String> f7525v;
    public final Uri y;
    public final int zn;

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7526a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f7527c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public long f7528fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public byte[] f7529gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        @Nullable
        public Object f7530i9;
        public long n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public String f7531s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Map<String, String> f7532v;

        @Nullable
        public Uri y;
        public int zn;

        public n3 a(@Nullable String str) {
            this.f7531s = str;
            return this;
        }

        public n3 c5(Uri uri) {
            this.y = uri;
            return this;
        }

        public n3 f(long j) {
            this.n3 = j;
            return this;
        }

        public n3 fb(long j) {
            this.f7528fb = j;
            return this;
        }

        public n3 gv(int i) {
            this.zn = i;
            return this;
        }

        public n3 i9(String str) {
            this.y = Uri.parse(str);
            return this;
        }

        public n3 n3(int i) {
            this.f7527c5 = i;
            return this;
        }

        public n3 s(long j) {
            this.f7526a = j;
            return this;
        }

        public n3 v(Map<String, String> map) {
            this.f7532v = map;
            return this;
        }

        public p y() {
            v0.y.i9(this.y, "The uri must be set.");
            return new p(this.y, this.n3, this.zn, this.f7529gv, this.f7532v, this.f7526a, this.f7528fb, this.f7531s, this.f7527c5, this.f7530i9);
        }

        public n3 zn(@Nullable byte[] bArr) {
            this.f7529gv = bArr;
            return this;
        }

        public n3() {
            this.zn = 1;
            this.f7532v = Collections.emptyMap();
            this.f7528fb = -1L;
        }

        public n3(p pVar) {
            this.y = pVar.y;
            this.n3 = pVar.n3;
            this.zn = pVar.zn;
            this.f7529gv = pVar.f7522gv;
            this.f7532v = pVar.f7525v;
            this.f7526a = pVar.f7521fb;
            this.f7528fb = pVar.f7524s;
            this.f7531s = pVar.f7519c5;
            this.f7527c5 = pVar.f7523i9;
            this.f7530i9 = pVar.f7520f;
        }
    }

    static {
        rb.y("goog.exo.datasource");
    }

    public static String zn(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public p a(long j, long j4) {
        return (j == 0 && this.f7524s == j4) ? this : new p(this.y, this.n3, this.zn, this.f7522gv, this.f7525v, this.f7521fb + j, j4, this.f7519c5, this.f7523i9, this.f7520f);
    }

    public p fb(Uri uri) {
        return new p(uri, this.n3, this.zn, this.f7522gv, this.f7525v, this.f7521fb, this.f7524s, this.f7519c5, this.f7523i9, this.f7520f);
    }

    public boolean gv(int i) {
        return (this.f7523i9 & i) == i;
    }

    public final String n3() {
        return zn(this.zn);
    }

    public String toString() {
        return "DataSpec[" + n3() + " " + this.y + ", " + this.f7521fb + ", " + this.f7524s + ", " + this.f7519c5 + ", " + this.f7523i9 + "]";
    }

    public p v(long j) {
        long j4 = this.f7524s;
        return a(j, j4 != -1 ? j4 - j : -1L);
    }

    public n3 y() {
        return new n3();
    }

    public p(Uri uri) {
        this(uri, 0L, -1L);
    }

    public p(Uri uri, long j, long j4) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j4, null, 0, null);
    }

    public p(Uri uri, long j, int i, @Nullable byte[] bArr, Map<String, String> map, long j4, long j7, @Nullable String str, int i5, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        long j8 = j + j4;
        v0.y.y(j8 >= 0);
        v0.y.y(j4 >= 0);
        v0.y.y(j7 > 0 || j7 == -1);
        this.y = uri;
        this.n3 = j;
        this.zn = i;
        this.f7522gv = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f7525v = Collections.unmodifiableMap(new HashMap(map));
        this.f7521fb = j4;
        this.f7518a = j8;
        this.f7524s = j7;
        this.f7519c5 = str;
        this.f7523i9 = i5;
        this.f7520f = obj;
    }
}
