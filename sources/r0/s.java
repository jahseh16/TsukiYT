package r0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class s extends fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Uri f7542a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f7543c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f7544fb;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f7545i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public FileInputStream f7546s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ContentResolver f7547v;

    public static class y extends wz {
        public y(@Nullable IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public s(Context context) {
        super(false);
        this.f7547v = context.getContentResolver();
    }

    @Override // r0.tl
    public void close() throws y {
        this.f7542a = null;
        try {
            try {
                FileInputStream fileInputStream = this.f7546s;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f7546s = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f7544fb;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new y(e4, 2000);
                    }
                } finally {
                    this.f7544fb = null;
                    if (this.f7545i9) {
                        this.f7545i9 = false;
                        r();
                    }
                }
            } catch (IOException e5) {
                throw new y(e5, 2000);
            }
        } catch (Throwable th) {
            this.f7546s = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f7544fb;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f7544fb = null;
                    if (this.f7545i9) {
                        this.f7545i9 = false;
                        r();
                    }
                    throw th;
                } catch (IOException e6) {
                    throw new y(e6, 2000);
                }
            } finally {
                this.f7544fb = null;
                if (this.f7545i9) {
                    this.f7545i9 = false;
                    r();
                }
            }
        }
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        return this.f7542a;
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) throws y {
        if (i5 == 0) {
            return 0;
        }
        long j = this.f7543c5;
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
        int i8 = ((FileInputStream) ut.i9(this.f7546s)).read(bArr, i, i5);
        if (i8 == -1) {
            return -1;
        }
        long j4 = this.f7543c5;
        if (j4 != -1) {
            this.f7543c5 = j4 - ((long) i8);
        }
        p(i8);
        return i8;
    }

    @Override // r0.tl
    public long y(p pVar) throws y {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = pVar.y;
            this.f7542a = uri;
            x4(pVar);
            if ("content".equals(pVar.y.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f7547v.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f7547v.openAssetFileDescriptor(uri, "r");
            }
            this.f7544fb = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new y(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f7546s = fileInputStream;
            if (length != -1 && pVar.f7521fb > length) {
                throw new y(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(pVar.f7521fb + startOffset) - startOffset;
            if (jSkip != pVar.f7521fb) {
                throw new y(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f7543c5 = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f7543c5 = jPosition;
                    if (jPosition < 0) {
                        throw new y(null, 2008);
                    }
                }
            } else {
                long j = length - jSkip;
                this.f7543c5 = j;
                if (j < 0) {
                    throw new y(null, 2008);
                }
            }
            long jMin = pVar.f7524s;
            if (jMin != -1) {
                long j4 = this.f7543c5;
                if (j4 != -1) {
                    jMin = Math.min(j4, jMin);
                }
                this.f7543c5 = jMin;
            }
            this.f7545i9 = true;
            i4(pVar);
            long j7 = pVar.f7524s;
            return j7 != -1 ? j7 : this.f7543c5;
        } catch (y e4) {
            throw e4;
        } catch (IOException e5) {
            throw new y(e5, e5 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }
}
