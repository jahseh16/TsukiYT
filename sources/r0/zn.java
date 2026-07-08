package r0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn extends fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Uri f7615a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f7616c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public InputStream f7617fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f7618s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AssetManager f7619v;

    public static final class y extends wz {
        public y(@Nullable Throwable th, int i) {
            super(th, i);
        }
    }

    public zn(Context context) {
        super(false);
        this.f7619v = context.getAssets();
    }

    @Override // r0.tl
    public void close() throws y {
        this.f7615a = null;
        try {
            try {
                InputStream inputStream = this.f7617fb;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e4) {
                throw new y(e4, 2000);
            }
        } finally {
            this.f7617fb = null;
            if (this.f7616c5) {
                this.f7616c5 = false;
                r();
            }
        }
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        return this.f7615a;
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) throws y {
        if (i5 == 0) {
            return 0;
        }
        long j = this.f7618s;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i5 = (int) Math.min(j, i5);
            } catch (IOException e4) {
                throw new y(e4, 2000);
            }
        }
        int i8 = ((InputStream) ut.i9(this.f7617fb)).read(bArr, i, i5);
        if (i8 == -1) {
            return -1;
        }
        long j4 = this.f7618s;
        if (j4 != -1) {
            this.f7618s = j4 - ((long) i8);
        }
        p(i8);
        return i8;
    }

    @Override // r0.tl
    public long y(p pVar) throws y {
        try {
            Uri uri = pVar.y;
            this.f7615a = uri;
            String strSubstring = (String) v0.y.v(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            x4(pVar);
            InputStream inputStreamOpen = this.f7619v.open(strSubstring, 1);
            this.f7617fb = inputStreamOpen;
            if (inputStreamOpen.skip(pVar.f7521fb) < pVar.f7521fb) {
                throw new y(null, 2008);
            }
            long j = pVar.f7524s;
            if (j != -1) {
                this.f7618s = j;
            } else {
                long jAvailable = this.f7617fb.available();
                this.f7618s = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f7618s = -1L;
                }
            }
            this.f7616c5 = true;
            i4(pVar);
            return this.f7618s;
        } catch (y e4) {
            throw e4;
        } catch (IOException e5) {
            throw new y(e5, e5 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }
}
