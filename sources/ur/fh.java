package ur;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class fh {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f8549gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8550v;
    public final Object y;
    public final int zn;

    public fh(Object obj) {
        this(obj, -1L);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh)) {
            return false;
        }
        fh fhVar = (fh) obj;
        return this.y.equals(fhVar.y) && this.n3 == fhVar.n3 && this.zn == fhVar.zn && this.f8549gv == fhVar.f8549gv && this.f8550v == fhVar.f8550v;
    }

    public int hashCode() {
        return ((((((((527 + this.y.hashCode()) * 31) + this.n3) * 31) + this.zn) * 31) + ((int) this.f8549gv)) * 31) + this.f8550v;
    }

    public boolean n3() {
        return this.n3 != -1;
    }

    public fh y(Object obj) {
        return this.y.equals(obj) ? this : new fh(obj, this.n3, this.zn, this.f8549gv, this.f8550v);
    }

    public fh(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public fh(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public fh(Object obj, int i, int i5, long j) {
        this(obj, i, i5, j, -1);
    }

    public fh(fh fhVar) {
        this.y = fhVar.y;
        this.n3 = fhVar.n3;
        this.zn = fhVar.zn;
        this.f8549gv = fhVar.f8549gv;
        this.f8550v = fhVar.f8550v;
    }

    public fh(Object obj, int i, int i5, long j, int i8) {
        this.y = obj;
        this.n3 = i;
        this.zn = i5;
        this.f8549gv = j;
        this.f8550v = i8;
    }
}
