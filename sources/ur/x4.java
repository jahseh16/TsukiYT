package ur;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x4 implements r0.tl {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final byte[] f8655gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8656v;
    public final r0.tl y;
    public final y zn;

    public interface y {
        void y(v0.d dVar);
    }

    public x4(r0.tl tlVar, int i, y yVar) {
        v0.y.y(i > 0);
        this.y = tlVar;
        this.n3 = i;
        this.zn = yVar;
        this.f8655gv = new byte[1];
        this.f8656v = i;
    }

    public final boolean a() throws IOException {
        if (this.y.read(this.f8655gv, 0, 1) == -1) {
            return false;
        }
        int i = (this.f8655gv[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i5 = i;
        int i8 = 0;
        while (i5 > 0) {
            int i10 = this.y.read(bArr, i8, i5);
            if (i10 == -1) {
                return false;
            }
            i8 += i10;
            i5 -= i10;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.zn.y(new v0.d(bArr, i));
        }
        return true;
    }

    @Override // r0.tl
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // r0.tl
    public void co(r0.o oVar) {
        v0.y.v(oVar);
        this.y.co(oVar);
    }

    @Override // r0.tl
    public Map<String, List<String>> fb() {
        return this.y.fb();
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        return this.y.n3();
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) throws IOException {
        if (this.f8656v == 0) {
            if (!a()) {
                return -1;
            }
            this.f8656v = this.n3;
        }
        int i8 = this.y.read(bArr, i, Math.min(this.f8656v, i5));
        if (i8 != -1) {
            this.f8656v -= i8;
        }
        return i8;
    }

    @Override // r0.tl
    public long y(r0.p pVar) {
        throw new UnsupportedOperationException();
    }
}
