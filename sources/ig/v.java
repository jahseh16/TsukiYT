package ig;

import b1.tl;
import b1.xc;
import java.io.IOException;
import java.util.Arrays;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f5703gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5704v;
    public final a y = new a();
    public final d n3 = new d(new byte[65025], 0);
    public int zn = -1;

    public void a() {
        if (this.n3.v().length == 65025) {
            return;
        }
        d dVar = this.n3;
        dVar.o(Arrays.copyOf(dVar.v(), Math.max(65025, this.n3.fb())), this.n3.fb());
    }

    public boolean gv(tl tlVar) throws IOException {
        int i;
        v0.y.fb(tlVar != null);
        if (this.f5704v) {
            this.f5704v = false;
            this.n3.j5(0);
        }
        while (!this.f5704v) {
            if (this.zn < 0) {
                if (!this.y.zn(tlVar) || !this.y.y(tlVar, true)) {
                    return false;
                }
                a aVar = this.y;
                int iY = aVar.f5679s;
                if ((aVar.n3 & 1) == 1 && this.n3.fb() == 0) {
                    iY += y(0);
                    i = this.f5703gv;
                } else {
                    i = 0;
                }
                if (!xc.v(tlVar, iY)) {
                    return false;
                }
                this.zn = i;
            }
            int iY2 = y(this.zn);
            int i5 = this.zn + this.f5703gv;
            if (iY2 > 0) {
                d dVar = this.n3;
                dVar.zn(dVar.fb() + iY2);
                if (!xc.gv(tlVar, this.n3.v(), this.n3.fb(), iY2)) {
                    return false;
                }
                d dVar2 = this.n3;
                dVar2.j(dVar2.fb() + iY2);
                this.f5704v = this.y.f5678i9[i5 + (-1)] != 255;
            }
            if (i5 == this.y.f5676fb) {
                i5 = -1;
            }
            this.zn = i5;
        }
        return true;
    }

    public a n3() {
        return this.y;
    }

    public void v() {
        this.y.n3();
        this.n3.j5(0);
        this.zn = -1;
        this.f5704v = false;
    }

    public final int y(int i) {
        int i5;
        int i8 = 0;
        this.f5703gv = 0;
        do {
            int i10 = this.f5703gv;
            int i11 = i + i10;
            a aVar = this.y;
            if (i11 >= aVar.f5676fb) {
                break;
            }
            int[] iArr = aVar.f5678i9;
            this.f5703gv = i10 + 1;
            i5 = iArr[i10 + i];
            i8 += i5;
        } while (i5 == 255);
        return i8;
    }

    public d zn() {
        return this.n3;
    }
}
