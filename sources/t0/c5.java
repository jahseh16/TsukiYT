package t0;

import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class c5 implements Comparable<c5> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final File f8116f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final long f8117fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f8119t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f8120v;
    public final String y;

    public c5(String str, long j, long j4, long j7, @Nullable File file) {
        this.y = str;
        this.f8120v = j;
        this.f8117fb = j4;
        this.f8118s = file != null;
        this.f8116f = file;
        this.f8119t = j7;
    }

    public boolean n3() {
        return !this.f8118s;
    }

    public String toString() {
        return "[" + this.f8120v + ", " + this.f8117fb + "]";
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public int compareTo(c5 c5Var) {
        if (!this.y.equals(c5Var.y)) {
            return this.y.compareTo(c5Var.y);
        }
        long j = this.f8120v - c5Var.f8120v;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public boolean zn() {
        return this.f8117fb == -1;
    }
}
