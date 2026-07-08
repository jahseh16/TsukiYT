package tn;

import androidx.annotation.Nullable;
import ft.g;

/* JADX INFO: loaded from: classes.dex */
public final class xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f8307a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public final long[] f8308c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final w[] f8309f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f8310fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f8311gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final int f8312i9;
    public final int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final long[] f8313s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f8314v;
    public final int y;
    public final long zn;

    public xc(int i, int i5, long j, long j4, long j7, g gVar, int i8, @Nullable w[] wVarArr, int i10, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.y = i;
        this.n3 = i5;
        this.zn = j;
        this.f8311gv = j4;
        this.f8314v = j7;
        this.f8307a = gVar;
        this.f8310fb = i8;
        this.f8309f = wVarArr;
        this.f8312i9 = i10;
        this.f8313s = jArr;
        this.f8308c5 = jArr2;
    }

    @Nullable
    public w y(int i) {
        w[] wVarArr = this.f8309f;
        if (wVarArr == null) {
            return null;
        }
        return wVarArr[i];
    }
}
