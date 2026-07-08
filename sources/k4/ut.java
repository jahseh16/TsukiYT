package k4;

import g4.xc;

/* JADX INFO: loaded from: classes.dex */
public final class ut<E> extends n<E> {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final transient E f6059fb;

    public ut(E e4) {
        this.f6059fb = (E) xc.t(e4);
    }

    @Override // k4.n, k4.co, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: co */
    public k<E> iterator() {
        return d0.mt(this.f6059fb);
    }

    @Override // k4.co, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f6059fb.equals(obj);
    }

    @Override // k4.n, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f6059fb.hashCode();
    }

    @Override // k4.co
    public int n3(Object[] objArr, int i) {
        objArr[i] = this.f6059fb;
        return i + 1;
    }

    @Override // k4.co
    public boolean p() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f6059fb.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }

    @Override // k4.n, k4.co
    public r<E> y() {
        return r.j(this.f6059fb);
    }
}
