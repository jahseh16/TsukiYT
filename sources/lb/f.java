package lb;

import hk1.yt;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6116f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6119t;
    public int y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f6120v = new int[32];

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public String[] f6117fb = new String[32];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f6118s = new int[32];

    public enum n3 {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public static final class y {
        public final yt n3;
        public final String[] y;

        public y(String[] strArr, yt ytVar) {
            this.y = strArr;
            this.n3 = ytVar;
        }

        public static y y(String... strArr) {
            try {
                hk1.s[] sVarArr = new hk1.s[strArr.length];
                hk1.v vVar = new hk1.v();
                for (int i = 0; i < strArr.length; i++) {
                    wz.ct(vVar, strArr[i]);
                    vVar.readByte();
                    sVarArr[i] = vVar.s8();
                }
                return new y((String[]) strArr.clone(), yt.z(sVarArr));
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    public static f ta(hk1.fb fbVar) {
        return new tl(fbVar);
    }

    public abstract void a() throws IOException;

    public abstract long c() throws IOException;

    public final boolean co() {
        return this.f6116f;
    }

    public abstract n3 d() throws IOException;

    public abstract void ej() throws IOException;

    public abstract double f3() throws IOException;

    public abstract void f7() throws IOException;

    public final String getPath() {
        return t.y(this.y, this.f6120v, this.f6117fb, this.f6118s);
    }

    public abstract int j(y yVar) throws IOException;

    public final c5 jz(String str) throws c5 {
        throw new c5(str + " at path " + getPath());
    }

    public abstract void k() throws IOException;

    public abstract String mg() throws IOException;

    public abstract int n() throws IOException;

    public abstract int oz(y yVar) throws IOException;

    public abstract boolean p() throws IOException;

    public abstract boolean r() throws IOException;

    public abstract <T> T rz() throws IOException;

    public abstract void t() throws IOException;

    public abstract void w() throws IOException;

    public abstract void y() throws IOException;

    public final void yt(int i) {
        int i5 = this.y;
        int[] iArr = this.f6120v;
        if (i5 == iArr.length) {
            if (i5 == 256) {
                throw new s("Nesting too deep at " + getPath());
            }
            this.f6120v = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f6117fb;
            this.f6117fb = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f6118s;
            this.f6118s = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f6120v;
        int i8 = this.y;
        this.y = i8 + 1;
        iArr3[i8] = i;
    }
}
