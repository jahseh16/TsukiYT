package t0;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8123a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public volatile boolean f8124c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f8125fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final String f8126gv;
    public final t0.y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f8127s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f8128v;
    public final zn y;
    public final r0.p zn;

    public interface y {
    }

    public i9(zn znVar, r0.p pVar, @Nullable byte[] bArr, @Nullable y yVar) {
        this.y = znVar;
        this.n3 = znVar.c5();
        this.zn = pVar;
        this.f8128v = bArr == null ? new byte[131072] : bArr;
        this.f8126gv = znVar.p().buildCacheKey(pVar);
        this.f8123a = pVar.f7521fb;
    }

    public final void a() throws InterruptedIOException {
        if (this.f8124c5) {
            throw new InterruptedIOException();
        }
    }

    public final void gv(long j) {
        if (this.f8125fb == j) {
            return;
        }
        this.f8125fb = j;
    }

    public void n3() {
        this.f8124c5 = true;
    }

    public final long v(long j, long j4) throws IOException {
        long jY;
        boolean z = true;
        boolean z5 = j + j4 == this.f8125fb || j4 == -1;
        if (j4 != -1) {
            try {
                jY = this.y.y(this.zn.y().s(j).fb(j4).y());
            } catch (IOException unused) {
                r0.w.y(this.y);
                jY = -1;
                z = false;
            }
        } else {
            jY = -1;
            z = false;
        }
        if (!z) {
            a();
            try {
                jY = this.y.y(this.zn.y().s(j).fb(-1L).y());
            } catch (IOException e4) {
                r0.w.y(this.y);
                throw e4;
            }
        }
        if (z5 && jY != -1) {
            try {
                gv(jY + j);
            } catch (IOException e5) {
                r0.w.y(this.y);
                throw e5;
            }
        }
        int i = 0;
        int i5 = 0;
        while (i != -1) {
            a();
            zn znVar = this.y;
            byte[] bArr = this.f8128v;
            i = znVar.read(bArr, 0, bArr.length);
            if (i != -1) {
                zn(i);
                i5 += i;
            }
        }
        if (z5) {
            gv(j + ((long) i5));
        }
        this.y.close();
        return i5;
    }

    public void y() throws IOException {
        a();
        t0.y yVar = this.n3;
        String str = this.f8126gv;
        r0.p pVar = this.zn;
        this.f8127s = yVar.zn(str, pVar.f7521fb, pVar.f7524s);
        r0.p pVar2 = this.zn;
        long j = pVar2.f7524s;
        if (j != -1) {
            this.f8125fb = pVar2.f7521fb + j;
        } else {
            long jY = tl.y(this.n3.n3(this.f8126gv));
            if (jY == -1) {
                jY = -1;
            }
            this.f8125fb = jY;
        }
        while (true) {
            long j4 = this.f8125fb;
            if (j4 != -1 && this.f8123a >= j4) {
                return;
            }
            a();
            long j7 = this.f8125fb;
            long jV = this.n3.v(this.f8126gv, this.f8123a, j7 == -1 ? Long.MAX_VALUE : j7 - this.f8123a);
            if (jV > 0) {
                this.f8123a += jV;
            } else {
                long j8 = -jV;
                if (j8 == Long.MAX_VALUE) {
                    j8 = -1;
                }
                long j9 = this.f8123a;
                this.f8123a = j9 + v(j9, j8);
            }
        }
    }

    public final void zn(long j) {
        this.f8127s += j;
    }
}
