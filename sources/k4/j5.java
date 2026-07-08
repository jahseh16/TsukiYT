package k4;

/* JADX INFO: loaded from: classes.dex */
public final class j5<E> extends n<E> {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final j5<Object> f6042co;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object[] f6043p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f6044f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final transient Object[] f6045fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int f6046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient int f6047t;
    public final transient int w;

    static {
        Object[] objArr = new Object[0];
        f6043p = objArr;
        f6042co = new j5<>(objArr, 0, objArr, 0, 0);
    }

    public j5(Object[] objArr, int i, Object[] objArr2, int i5, int i8) {
        this.f6045fb = objArr;
        this.f6046s = i;
        this.f6044f = objArr2;
        this.f6047t = i5;
        this.w = i8;
    }

    @Override // k4.n, k4.co, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: co */
    public k<E> iterator() {
        return y().iterator();
    }

    @Override // k4.co, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f6044f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iZn = mt.zn(obj);
        while (true) {
            int i = iZn & this.f6047t;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iZn = i + 1;
        }
    }

    @Override // k4.co
    public Object[] gv() {
        return this.f6045fb;
    }

    @Override // k4.n, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f6046s;
    }

    @Override // k4.n
    public boolean mg() {
        return true;
    }

    @Override // k4.co
    public int n3(Object[] objArr, int i) {
        System.arraycopy(this.f6045fb, 0, objArr, i, this.w);
        return i + this.w;
    }

    @Override // k4.co
    public boolean p() {
        return false;
    }

    @Override // k4.n
    public r<E> rz() {
        return r.r(this.f6045fb, this.w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.w;
    }

    @Override // k4.co
    public int t() {
        return this.w;
    }

    @Override // k4.co
    public int w() {
        return 0;
    }
}
