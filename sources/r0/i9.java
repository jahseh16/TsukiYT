package r0;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import ft.q;
import java.io.IOException;
import java.net.URLDecoder;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class i9 extends fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public byte[] f7498a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f7499fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7500s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public p f7501v;

    public i9() {
        super(false);
    }

    @Override // r0.tl
    public void close() {
        if (this.f7498a != null) {
            this.f7498a = null;
            r();
        }
        this.f7501v = null;
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        p pVar = this.f7501v;
        if (pVar != null) {
            return pVar.y;
        }
        return null;
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i8 = this.f7500s;
        if (i8 == 0) {
            return -1;
        }
        int iMin = Math.min(i5, i8);
        System.arraycopy(ut.i9(this.f7498a), this.f7499fb, bArr, i, iMin);
        this.f7499fb += iMin;
        this.f7500s -= iMin;
        p(iMin);
        return iMin;
    }

    @Override // r0.tl
    public long y(p pVar) throws IOException {
        x4(pVar);
        this.f7501v = pVar;
        Uri uri = pVar.y;
        String scheme = uri.getScheme();
        v0.y.n3("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrRo = ut.ro(uri.getSchemeSpecificPart(), ",");
        if (strArrRo.length != 2) {
            throw q.n3("Unexpected URI format: " + uri, null);
        }
        String str = strArrRo[1];
        if (strArrRo[0].contains(";base64")) {
            try {
                this.f7498a = Base64.decode(str, 0);
            } catch (IllegalArgumentException e4) {
                throw q.n3("Error while parsing Base64 encoded string: " + str, e4);
            }
        } else {
            this.f7498a = ut.ap(URLDecoder.decode(str, g4.v.y.name()));
        }
        long j = pVar.f7521fb;
        byte[] bArr = this.f7498a;
        if (j > bArr.length) {
            this.f7498a = null;
            throw new wz(2008);
        }
        int i = (int) j;
        this.f7499fb = i;
        int length = bArr.length - i;
        this.f7500s = length;
        long j4 = pVar.f7524s;
        if (j4 != -1) {
            this.f7500s = (int) Math.min(length, j4);
        }
        i4(pVar);
        long j7 = pVar.f7524s;
        return j7 != -1 ? j7 : this.f7500s;
    }
}
