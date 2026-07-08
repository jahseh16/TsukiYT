package os;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k4.c;
import k4.i4;
import k4.r;

/* JADX INFO: loaded from: classes.dex */
public final class fb extends c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7193a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final boolean f7194c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final List<n3> f7195co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7196f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f7197fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f7198gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final int f7199i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public final List<gv> f7200mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final DrmInitData f7201p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f7202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f7203s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7204t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final long f7205tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f7206v;
    public final boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final long f7207wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public final a f7208x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final boolean f7209xc;
    public final Map<Uri, zn> z;

    public static final class a {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final long f7210gv;
        public final boolean n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f7211v;
        public final long y;
        public final long zn;

        public a(long j, boolean z, long j4, long j7, boolean z5) {
            this.y = j;
            this.n3 = z;
            this.zn = j4;
            this.f7210gv = j7;
            this.f7211v = z5;
        }
    }

    public static final class n3 extends v {
        public final boolean f3;
        public final boolean n;

        public n3(String str, @Nullable gv gvVar, long j, int i, long j4, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j7, long j8, boolean z, boolean z5, boolean z7) {
            super(str, gvVar, j, i, j4, drmInitData, str2, str3, j7, j8, z);
            this.f3 = z5;
            this.n = z7;
        }

        public n3 n3(long j, int i) {
            return new n3(this.y, this.f7219v, this.f7214fb, i, j, this.f7218t, this.w, this.f7215p, this.f7212co, this.z, this.f7216r, this.f3, this.n);
        }
    }

    public static class v implements Comparable<Long> {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public final long f7212co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f7213f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final long f7214fb;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        public final String f7215p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f7216r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f7217s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public final DrmInitData f7218t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public final gv f7219v;

        @Nullable
        public final String w;
        public final String y;
        public final long z;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l3) {
            if (this.f7213f > l3.longValue()) {
                return 1;
            }
            return this.f7213f < l3.longValue() ? -1 : 0;
        }

        public v(String str, @Nullable gv gvVar, long j, int i, long j4, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j7, long j8, boolean z) {
            this.y = str;
            this.f7219v = gvVar;
            this.f7214fb = j;
            this.f7217s = i;
            this.f7213f = j4;
            this.f7218t = drmInitData;
            this.w = str2;
            this.f7215p = str3;
            this.f7212co = j7;
            this.z = j8;
            this.f7216r = z;
        }
    }

    public static final class zn {
        public final long n3;
        public final Uri y;
        public final int zn;

        public zn(Uri uri, long j, int i) {
            this.y = uri;
            this.n3 = j;
            this.zn = i;
        }
    }

    public fb(int i, String str, List<String> list, long j, boolean z, long j4, boolean z5, int i5, long j7, int i8, long j8, long j9, boolean z7, boolean z8, boolean z9, @Nullable DrmInitData drmInitData, List<gv> list2, List<n3> list3, a aVar, Map<Uri, zn> map) {
        super(str, list, z7);
        this.f7198gv = i;
        this.f7203s = j4;
        this.f7197fb = z;
        this.f7194c5 = z5;
        this.f7199i9 = i5;
        this.f7196f = j7;
        this.f7204t = i8;
        this.f7205tl = j8;
        this.f7207wz = j9;
        this.f7209xc = z8;
        this.w = z9;
        this.f7201p = drmInitData;
        this.f7200mt = r.rz(list2);
        this.f7195co = r.rz(list3);
        this.z = i4.f(map);
        if (!list3.isEmpty()) {
            n3 n3Var = (n3) c.gv(list3);
            this.f7202r = n3Var.f7213f + n3Var.f7214fb;
        } else if (list2.isEmpty()) {
            this.f7202r = 0L;
        } else {
            gv gvVar = (gv) c.gv(list2);
            this.f7202r = gvVar.f7213f + gvVar.f7214fb;
        }
        this.f7206v = j != -9223372036854775807L ? j >= 0 ? Math.min(this.f7202r, j) : Math.max(0L, this.f7202r + j) : -9223372036854775807L;
        this.f7193a = j >= 0;
        this.f7208x4 = aVar;
    }

    public boolean a(@Nullable fb fbVar) {
        if (fbVar == null) {
            return true;
        }
        long j = this.f7196f;
        long j4 = fbVar.f7196f;
        if (j > j4) {
            return true;
        }
        if (j < j4) {
            return false;
        }
        int size = this.f7200mt.size() - fbVar.f7200mt.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.f7195co.size();
        int size3 = fbVar.f7195co.size();
        if (size2 <= size3) {
            return size2 == size3 && this.f7209xc && !fbVar.f7209xc;
        }
        return true;
    }

    public fb gv() {
        return this.f7209xc ? this : new fb(this.f7198gv, this.y, this.n3, this.f7206v, this.f7197fb, this.f7203s, this.f7194c5, this.f7199i9, this.f7196f, this.f7204t, this.f7205tl, this.f7207wz, this.zn, true, this.w, this.f7201p, this.f7200mt, this.f7195co, this.f7208x4, this.z);
    }

    public long v() {
        return this.f7203s + this.f7202r;
    }

    public fb zn(long j, int i) {
        return new fb(this.f7198gv, this.y, this.n3, this.f7206v, this.f7197fb, j, true, i, this.f7196f, this.f7204t, this.f7205tl, this.f7207wz, this.zn, this.f7209xc, this.w, this.f7201p, this.f7200mt, this.f7195co, this.f7208x4, this.z);
    }

    public static final class gv extends v {
        public final String f3;
        public final List<n3> n;

        public gv(String str, long j, long j4, @Nullable String str2, @Nullable String str3) {
            this(str, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, 0L, -1, -9223372036854775807L, null, str2, str3, j, j4, false, r.yt());
        }

        public gv n3(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j4 = j;
            for (int i5 = 0; i5 < this.n.size(); i5++) {
                n3 n3Var = this.n.get(i5);
                arrayList.add(n3Var.n3(j4, i));
                j4 += n3Var.f7214fb;
            }
            return new gv(this.y, this.f7219v, this.f3, this.f7214fb, i, j, this.f7218t, this.w, this.f7215p, this.f7212co, this.z, this.f7216r, arrayList);
        }

        public gv(String str, @Nullable gv gvVar, String str2, long j, int i, long j4, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j7, long j8, boolean z, List<n3> list) {
            super(str, gvVar, j, i, j4, drmInitData, str3, str4, j7, j8, z);
            this.f3 = str2;
            this.n = r.rz(list);
        }
    }

    @Override // np.y
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public fb y(List<StreamKey> list) {
        return this;
    }
}
