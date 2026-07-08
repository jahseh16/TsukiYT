package r0;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import r0.tl;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class c extends fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Uri f7487a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f7488fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7489s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public RandomAccessFile f7490v;

    public static final class n3 implements tl.y {

        @Nullable
        public o y;

        @Override // r0.tl.y
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public c y() {
            c cVar = new c();
            o oVar = this.y;
            if (oVar != null) {
                cVar.co(oVar);
            }
            return cVar;
        }
    }

    public static final class y {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n3(@Nullable Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static class zn extends wz {
        public zn(Throwable th, int i) {
            super(th, i);
        }

        public zn(@Nullable String str, @Nullable Throwable th, int i) {
            super(str, th, i);
        }
    }

    public c() {
        super(false);
    }

    public static RandomAccessFile f3(Uri uri) throws zn {
        try {
            return new RandomAccessFile((String) v0.y.v(uri.getPath()), "r");
        } catch (FileNotFoundException e4) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zn(e4, (ut.y < 21 || !y.n3(e4.getCause())) ? 2005 : 2006);
            }
            throw new zn(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e4, 1004);
        } catch (SecurityException e5) {
            throw new zn(e5, 2006);
        } catch (RuntimeException e6) {
            throw new zn(e6, 2000);
        }
    }

    @Override // r0.tl
    public void close() throws zn {
        this.f7487a = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f7490v;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e4) {
                throw new zn(e4, 2000);
            }
        } finally {
            this.f7490v = null;
            if (this.f7489s) {
                this.f7489s = false;
                r();
            }
        }
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        return this.f7487a;
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) throws zn {
        if (i5 == 0) {
            return 0;
        }
        if (this.f7488fb == 0) {
            return -1;
        }
        try {
            int i8 = ((RandomAccessFile) ut.i9(this.f7490v)).read(bArr, i, (int) Math.min(this.f7488fb, i5));
            if (i8 > 0) {
                this.f7488fb -= (long) i8;
                p(i8);
            }
            return i8;
        } catch (IOException e4) {
            throw new zn(e4, 2000);
        }
    }

    @Override // r0.tl
    public long y(p pVar) throws zn {
        Uri uri = pVar.y;
        this.f7487a = uri;
        x4(pVar);
        RandomAccessFile randomAccessFileF3 = f3(uri);
        this.f7490v = randomAccessFileF3;
        try {
            randomAccessFileF3.seek(pVar.f7521fb);
            long length = pVar.f7524s;
            if (length == -1) {
                length = this.f7490v.length() - pVar.f7521fb;
            }
            this.f7488fb = length;
            if (length < 0) {
                throw new zn(null, null, 2008);
            }
            this.f7489s = true;
            i4(pVar);
            return this.f7488fb;
        } catch (IOException e4) {
            throw new zn(e4, 2000);
        }
    }
}
