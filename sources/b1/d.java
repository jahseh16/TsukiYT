package b1;

import androidx.annotation.Nullable;
import b1.ta;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1261a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f1262fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f1263gv;
    public boolean n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1264v;
    public final byte[] y = new byte[10];
    public int zn;

    public void gv(tl tlVar) throws IOException {
        if (this.n3) {
            return;
        }
        tlVar.z(this.y, 0, 10);
        tlVar.s();
        if (mn.n3.i9(this.y) == 0) {
            return;
        }
        this.n3 = true;
    }

    public void n3() {
        this.n3 = false;
        this.zn = 0;
    }

    public void y(ta taVar, @Nullable ta.y yVar) {
        if (this.zn > 0) {
            taVar.a(this.f1263gv, this.f1264v, this.f1261a, this.f1262fb, yVar);
            this.zn = 0;
        }
    }

    public void zn(ta taVar, long j, int i, int i5, int i8, @Nullable ta.y yVar) {
        v0.y.s(this.f1262fb <= i5 + i8, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.n3) {
            int i10 = this.zn;
            int i11 = i10 + 1;
            this.zn = i11;
            if (i10 == 0) {
                this.f1263gv = j;
                this.f1264v = i;
                this.f1261a = 0;
            }
            this.f1261a += i5;
            this.f1262fb = i8;
            if (i11 >= 16) {
                y(taVar, yVar);
            }
        }
    }
}
