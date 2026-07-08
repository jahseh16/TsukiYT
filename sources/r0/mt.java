package r0;

import androidx.annotation.Nullable;
import java.util.Arrays;
import r0.n3;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class mt implements n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7514a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public y[] f7515fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f7516gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7517v;
    public final boolean y;

    @Nullable
    public final byte[] zn;

    public mt(boolean z, int i) {
        this(z, i, 0);
    }

    public synchronized int a() {
        return this.f7517v * this.n3;
    }

    public synchronized void fb() {
        if (this.y) {
            s(0);
        }
    }

    @Override // r0.n3
    public synchronized void gv(y yVar) {
        y[] yVarArr = this.f7515fb;
        int i = this.f7514a;
        this.f7514a = i + 1;
        yVarArr[i] = yVar;
        this.f7517v--;
        notifyAll();
    }

    @Override // r0.n3
    public synchronized y n3() {
        y yVar;
        try {
            this.f7517v++;
            int i = this.f7514a;
            if (i > 0) {
                y[] yVarArr = this.f7515fb;
                int i5 = i - 1;
                this.f7514a = i5;
                yVar = (y) v0.y.v(yVarArr[i5]);
                this.f7515fb[this.f7514a] = null;
            } else {
                yVar = new y(new byte[this.n3], 0);
                int i8 = this.f7517v;
                y[] yVarArr2 = this.f7515fb;
                if (i8 > yVarArr2.length) {
                    this.f7515fb = (y[]) Arrays.copyOf(yVarArr2, yVarArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return yVar;
    }

    public synchronized void s(int i) {
        boolean z = i < this.f7516gv;
        this.f7516gv = i;
        if (z) {
            zn();
        }
    }

    @Override // r0.n3
    public int v() {
        return this.n3;
    }

    @Override // r0.n3
    public synchronized void y(@Nullable n3.y yVar) {
        while (yVar != null) {
            try {
                y[] yVarArr = this.f7515fb;
                int i = this.f7514a;
                this.f7514a = i + 1;
                yVarArr[i] = yVar.y();
                this.f7517v--;
                yVar = yVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // r0.n3
    public synchronized void zn() {
        try {
            int i = 0;
            int iMax = Math.max(0, ut.t(this.f7516gv, this.n3) - this.f7517v);
            int i5 = this.f7514a;
            if (iMax >= i5) {
                return;
            }
            if (this.zn != null) {
                int i8 = i5 - 1;
                while (i <= i8) {
                    y yVar = (y) v0.y.v(this.f7515fb[i]);
                    if (yVar.y == this.zn) {
                        i++;
                    } else {
                        y yVar2 = (y) v0.y.v(this.f7515fb[i8]);
                        if (yVar2.y != this.zn) {
                            i8--;
                        } else {
                            y[] yVarArr = this.f7515fb;
                            yVarArr[i] = yVar2;
                            yVarArr[i8] = yVar;
                            i8--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.f7514a) {
                    return;
                }
            }
            Arrays.fill(this.f7515fb, iMax, this.f7514a, (Object) null);
            this.f7514a = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    public mt(boolean z, int i, int i5) {
        v0.y.y(i > 0);
        v0.y.y(i5 >= 0);
        this.y = z;
        this.n3 = i;
        this.f7514a = i5;
        this.f7515fb = new y[i5 + 100];
        if (i5 <= 0) {
            this.zn = null;
            return;
        }
        this.zn = new byte[i5 * i];
        for (int i8 = 0; i8 < i5; i8++) {
            this.f7515fb[i8] = new y(this.zn, i8 * i);
        }
    }
}
