package ft;

import androidx.annotation.Nullable;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public final class gq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4823a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final boolean f4824c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f4825fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f4826gv;
    public final long n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f4827s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f4828v;
    public final mg.n3 y;
    public final long zn;

    public gq(mg.n3 n3Var, long j, long j4, long j7, long j8, boolean z, boolean z5, boolean z7, boolean z8) {
        boolean z9 = true;
        v0.y.y(!z8 || z5);
        v0.y.y(!z7 || z5);
        if (z && (z5 || z7 || z8)) {
            z9 = false;
        }
        v0.y.y(z9);
        this.y = n3Var;
        this.n3 = j;
        this.zn = j4;
        this.f4826gv = j7;
        this.f4828v = j8;
        this.f4823a = z;
        this.f4825fb = z5;
        this.f4827s = z7;
        this.f4824c5 = z8;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gq.class != obj.getClass()) {
            return false;
        }
        gq gqVar = (gq) obj;
        return this.n3 == gqVar.n3 && this.zn == gqVar.zn && this.f4826gv == gqVar.f4826gv && this.f4828v == gqVar.f4828v && this.f4823a == gqVar.f4823a && this.f4825fb == gqVar.f4825fb && this.f4827s == gqVar.f4827s && this.f4824c5 == gqVar.f4824c5 && v0.ut.zn(this.y, gqVar.y);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.y.hashCode()) * 31) + ((int) this.n3)) * 31) + ((int) this.zn)) * 31) + ((int) this.f4826gv)) * 31) + ((int) this.f4828v)) * 31) + (this.f4823a ? 1 : 0)) * 31) + (this.f4825fb ? 1 : 0)) * 31) + (this.f4827s ? 1 : 0)) * 31) + (this.f4824c5 ? 1 : 0);
    }

    public gq n3(long j) {
        return j == this.n3 ? this : new gq(this.y, j, this.zn, this.f4826gv, this.f4828v, this.f4823a, this.f4825fb, this.f4827s, this.f4824c5);
    }

    public gq y(long j) {
        return j == this.zn ? this : new gq(this.y, this.n3, j, this.f4826gv, this.f4828v, this.f4823a, this.f4825fb, this.f4827s, this.f4824c5);
    }
}
