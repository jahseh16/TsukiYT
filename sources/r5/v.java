package r5;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f7717a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final v f7718c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f7719f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final v f7720fb;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final v f7722i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v f7723s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final v f7724v;
    public n3 n3;
    public y y;
    public static final v zn = new v(null, null);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final v f7721gv = new v(y.y, null);

    static {
        y yVar = y.t;
        n3 n3Var = n3.y;
        f7724v = new v(yVar, n3Var);
        y yVar2 = y.v;
        f7717a = new v(yVar2, n3Var);
        f7720fb = new v(y.z, n3Var);
        f7723s = new v(y.fb, n3Var);
        f7718c5 = new v(y.co, n3Var);
        n3 n3Var2 = n3.v;
        f7722i9 = new v(yVar, n3Var2);
        f7719f = new v(yVar2, n3Var2);
    }

    public v(y yVar, n3 n3Var) {
        this.y = yVar;
        this.n3 = n3Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.y == vVar.y && this.n3 == vVar.n3;
    }

    public n3 n3() {
        return this.n3;
    }

    public String toString() {
        return this.y + " " + this.n3;
    }

    public y y() {
        return this.y;
    }
}
