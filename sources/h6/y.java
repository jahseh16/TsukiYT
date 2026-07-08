package h6;

import androidx.annotation.Nullable;
import ft.g;
import r0.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class y extends wz {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5336f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f5337t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public zn f5338tl;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int[] f5339wz;

    public y(r0.tl tlVar, p pVar, g gVar, int i, @Nullable Object obj, long j, long j4, long j7, long j8, long j9) {
        super(tlVar, pVar, gVar, i, obj, j, j4, j9);
        this.f5336f = j7;
        this.f5337t = j8;
    }

    public void c5(zn znVar) {
        this.f5338tl = znVar;
        this.f5339wz = znVar.y();
    }

    public final int fb(int i) {
        return ((int[]) v0.y.c5(this.f5339wz))[i];
    }

    public final zn s() {
        return (zn) v0.y.c5(this.f5338tl);
    }
}
