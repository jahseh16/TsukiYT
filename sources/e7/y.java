package e7;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import ft.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import tn.w;
import v0.qn;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class y implements np.y<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3[] f3283a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final long f3284fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final boolean f3285gv;
    public final int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f3286s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final C0084y f3287v;
    public final int y;
    public final int zn;

    /* JADX INFO: renamed from: e7.y$y, reason: collision with other inner class name */
    public static class C0084y {
        public final byte[] n3;
        public final UUID y;
        public final w[] zn;

        public C0084y(UUID uuid, byte[] bArr, w[] wVarArr) {
            this.y = uuid;
            this.n3 = bArr;
            this.zn = wVarArr;
        }
    }

    public y(int i, int i5, long j, long j4, long j7, int i8, boolean z, @Nullable C0084y c0084y, n3[] n3VarArr) {
        this(i, i5, j4 == 0 ? -9223372036854775807L : ut.x5(j4, 1000000L, j), j7 != 0 ? ut.x5(j7, 1000000L, j) : -9223372036854775807L, i8, z, c0084y, n3VarArr);
    }

    @Override // np.y
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public final y y(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        n3 n3Var = null;
        int i = 0;
        while (i < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i);
            n3 n3Var2 = this.f3283a[streamKey.f1672v];
            if (n3Var2 != n3Var && n3Var != null) {
                arrayList2.add(n3Var.n3((g[]) arrayList3.toArray(new g[0])));
                arrayList3.clear();
            }
            arrayList3.add(n3Var2.f3293i9[streamKey.f1670fb]);
            i++;
            n3Var = n3Var2;
        }
        if (n3Var != null) {
            arrayList2.add(n3Var.n3((g[]) arrayList3.toArray(new g[0])));
        }
        return new y(this.y, this.n3, this.f3284fb, this.f3286s, this.zn, this.f3285gv, this.f3287v, (n3[]) arrayList2.toArray(new n3[0]));
    }

    public static class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3288a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @Nullable
        public final String f3289c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f3290f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f3291fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final String f3292gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final g[] f3293i9;
        public final String n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f3294s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final String f3295t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public final String f3296tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f3297v;
        public final long w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public final List<Long> f3298wz;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public final long[] f3299xc;
        public final int y;
        public final long zn;

        public n3(String str, String str2, int i, String str3, long j, String str4, int i5, int i8, int i10, int i11, @Nullable String str5, g[] gVarArr, List<Long> list, long j4) {
            this(str, str2, i, str3, j, str4, i5, i8, i10, i11, str5, gVarArr, list, ut.q5(list, 1000000L, j), ut.x5(j4, 1000000L, j));
        }

        public int gv(long j) {
            return ut.c5(this.f3299xc, j, true, true);
        }

        public n3 n3(g[] gVarArr) {
            return new n3(this.f3295t, this.f3296tl, this.y, this.n3, this.zn, this.f3292gv, this.f3297v, this.f3288a, this.f3291fb, this.f3294s, this.f3289c5, gVarArr, this.f3298wz, this.f3299xc, this.w);
        }

        public long v(int i) {
            return this.f3299xc[i];
        }

        public Uri y(int i, int i5) {
            v0.y.fb(this.f3293i9 != null);
            v0.y.fb(this.f3298wz != null);
            v0.y.fb(i5 < this.f3298wz.size());
            String string = Integer.toString(this.f3293i9[i].f4786p);
            String string2 = this.f3298wz.get(i5).toString();
            return qn.v(this.f3295t, this.f3296tl.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        public long zn(int i) {
            if (i == this.f3290f - 1) {
                return this.w;
            }
            long[] jArr = this.f3299xc;
            return jArr[i + 1] - jArr[i];
        }

        public n3(String str, String str2, int i, String str3, long j, String str4, int i5, int i8, int i10, int i11, @Nullable String str5, g[] gVarArr, List<Long> list, long[] jArr, long j4) {
            this.f3295t = str;
            this.f3296tl = str2;
            this.y = i;
            this.n3 = str3;
            this.zn = j;
            this.f3292gv = str4;
            this.f3297v = i5;
            this.f3288a = i8;
            this.f3291fb = i10;
            this.f3294s = i11;
            this.f3289c5 = str5;
            this.f3293i9 = gVarArr;
            this.f3298wz = list;
            this.f3299xc = jArr;
            this.w = j4;
            this.f3290f = list.size();
        }
    }

    public y(int i, int i5, long j, long j4, int i8, boolean z, @Nullable C0084y c0084y, n3[] n3VarArr) {
        this.y = i;
        this.n3 = i5;
        this.f3284fb = j;
        this.f3286s = j4;
        this.zn = i8;
        this.f3285gv = z;
        this.f3287v = c0084y;
        this.f3283a = n3VarArr;
    }
}
