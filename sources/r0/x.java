package r0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class x extends fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7562a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public InputStream f7563c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7564f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public Uri f7565fb;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public long f7566i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f7567s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Resources f7568v;

    public static class y extends wz {
        public y(@Nullable String str, @Nullable Throwable th, int i) {
            super(str, th, i);
        }
    }

    public x(Context context) {
        super(false);
        this.f7568v = context.getResources();
        this.f7562a = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // r0.tl
    public void close() throws y {
        this.f7565fb = null;
        try {
            try {
                InputStream inputStream = this.f7563c5;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f7563c5 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f7567s;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new y(null, e4, 2000);
                    }
                } finally {
                    this.f7567s = null;
                    if (this.f7564f) {
                        this.f7564f = false;
                        r();
                    }
                }
            } catch (IOException e5) {
                throw new y(null, e5, 2000);
            }
        } catch (Throwable th) {
            this.f7563c5 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f7567s;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f7567s = null;
                    if (this.f7564f) {
                        this.f7564f = false;
                        r();
                    }
                    throw th;
                } catch (IOException e6) {
                    throw new y(null, e6, 2000);
                }
            } finally {
                this.f7567s = null;
                if (this.f7564f) {
                    this.f7564f = false;
                    r();
                }
            }
        }
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        return this.f7565fb;
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) throws y {
        if (i5 == 0) {
            return 0;
        }
        long j = this.f7566i9;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i5 = (int) Math.min(j, i5);
            } catch (IOException e4) {
                throw new y(null, e4, 2000);
            }
        }
        int i8 = ((InputStream) ut.i9(this.f7563c5)).read(bArr, i, i5);
        if (i8 == -1) {
            if (this.f7566i9 == -1) {
                return -1;
            }
            throw new y("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j4 = this.f7566i9;
        if (j4 != -1) {
            this.f7566i9 = j4 - ((long) i8);
        }
        p(i8);
        return i8;
    }

    @Override // r0.tl
    public long y(p pVar) throws y {
        int identifier;
        String str;
        Uri uri = pVar.y;
        this.f7565fb = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) v0.y.v(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) v0.y.v(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new y("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new y("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String strSubstring = (String) v0.y.v(uri.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(strSubstring);
            identifier = this.f7568v.getIdentifier(sb.toString(), "raw", this.f7562a);
            if (identifier == 0) {
                throw new y("Resource not found.", null, 2005);
            }
        }
        x4(pVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f7568v.openRawResourceFd(identifier);
            this.f7567s = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new y("Resource is compressed: " + uri, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f7563c5 = fileInputStream;
            if (length != -1) {
                try {
                    if (pVar.f7521fb > length) {
                        throw new y(null, null, 2008);
                    }
                } catch (y e4) {
                    throw e4;
                } catch (IOException e5) {
                    throw new y(null, e5, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(pVar.f7521fb + startOffset) - startOffset;
            if (jSkip != pVar.f7521fb) {
                throw new y(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f7566i9 = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f7566i9 = size;
                    if (size < 0) {
                        throw new y(null, null, 2008);
                    }
                }
            } else {
                long j = length - jSkip;
                this.f7566i9 = j;
                if (j < 0) {
                    throw new wz(2008);
                }
            }
            long jMin = pVar.f7524s;
            if (jMin != -1) {
                long j4 = this.f7566i9;
                if (j4 != -1) {
                    jMin = Math.min(j4, jMin);
                }
                this.f7566i9 = jMin;
            }
            this.f7564f = true;
            i4(pVar);
            long j7 = pVar.f7524s;
            return j7 != -1 ? j7 : this.f7566i9;
        } catch (Resources.NotFoundException e6) {
            throw new y(null, e6, 2005);
        }
    }
}
