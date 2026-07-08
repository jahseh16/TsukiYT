package k4;

import g4.xc;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class vl<E> extends r<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r<Object> f6060f = new vl(new Object[0], 0);

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final transient Object[] f6061fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int f6062s;

    public vl(Object[] objArr, int i) {
        this.f6061fb = objArr;
        this.f6062s = i;
    }

    @Override // java.util.List
    public E get(int i) {
        xc.i9(i, this.f6062s);
        E e4 = (E) this.f6061fb[i];
        Objects.requireNonNull(e4);
        return e4;
    }

    @Override // k4.co
    public Object[] gv() {
        return this.f6061fb;
    }

    @Override // k4.r, k4.co
    public int n3(Object[] objArr, int i) {
        System.arraycopy(this.f6061fb, 0, objArr, i, this.f6062s);
        return i + this.f6062s;
    }

    @Override // k4.co
    public boolean p() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6062s;
    }

    @Override // k4.co
    public int t() {
        return this.f6062s;
    }

    @Override // k4.co
    public int w() {
        return 0;
    }
}
