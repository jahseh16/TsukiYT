package s6;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import ft.s;
import java.util.ArrayList;
import java.util.Arrays;
import s6.zn;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7788f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final long f7789fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f7790s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y[] f7791t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f7792v;

    @Nullable
    public final Object y;
    public static final zn w = new zn(null, new y[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final y f7786p = new y(0).c5(0);

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final String f7785co = ut.g3(1);
    public static final String z = ut.g3(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f7787r = ut.g3(3);
    public static final String f3 = ut.g3(4);
    public static final s.y<zn> n = new s.y() { // from class: s6.y
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return zn.n3(bundle);
        }
    };

    public static final class y implements s {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f7796f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f7797fb;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f7798p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Uri[] f7799s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long[] f7800t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f7801v;
        public final long w;
        public final long y;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public static final String f7793co = ut.g3(0);
        public static final String z = ut.g3(1);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f7795r = ut.g3(2);
        public static final String f3 = ut.g3(3);
        public static final String n = ut.g3(4);
        public static final String c = ut.g3(5);
        public static final String d0 = ut.g3(6);
        public static final String fh = ut.g3(7);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final s.y<y> f7794d = new s.y() { // from class: s6.n3
            @Override // ft.s.y
            public final s fromBundle(Bundle bundle) {
                return zn.y.gv(bundle);
            }
        };

        public y(long j) {
            this(j, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public static y gv(Bundle bundle) {
            long j = bundle.getLong(f7793co);
            int i = bundle.getInt(z);
            int i5 = bundle.getInt(fh);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f7795r);
            int[] intArray = bundle.getIntArray(f3);
            long[] longArray = bundle.getLongArray(n);
            long j4 = bundle.getLong(c);
            boolean z5 = bundle.getBoolean(d0);
            if (intArray == null) {
                intArray = new int[0];
            }
            return new y(j, i, i5, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j4, z5);
        }

        @CheckResult
        public static long[] n3(long[] jArr, int i) {
            int length = jArr.length;
            int iMax = Math.max(i, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        @CheckResult
        public static int[] zn(int[] iArr, int i) {
            int length = iArr.length;
            int iMax = Math.max(i, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public int a(int i) {
            int i5;
            int i8 = i + 1;
            while (true) {
                int[] iArr = this.f7796f;
                if (i8 >= iArr.length || this.f7798p || (i5 = iArr[i8]) == 0 || i5 == 1) {
                    break;
                }
                i8++;
            }
            return i8;
        }

        @CheckResult
        public y c5(int i) {
            int[] iArrZn = zn(this.f7796f, i);
            long[] jArrN3 = n3(this.f7800t, i);
            return new y(this.y, i, this.f7797fb, iArrZn, (Uri[]) Arrays.copyOf(this.f7799s, i), jArrN3, this.w, this.f7798p);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || y.class != obj.getClass()) {
                return false;
            }
            y yVar = (y) obj;
            return this.y == yVar.y && this.f7801v == yVar.f7801v && this.f7797fb == yVar.f7797fb && Arrays.equals(this.f7799s, yVar.f7799s) && Arrays.equals(this.f7796f, yVar.f7796f) && Arrays.equals(this.f7800t, yVar.f7800t) && this.w == yVar.w && this.f7798p == yVar.f7798p;
        }

        public boolean fb() {
            if (this.f7801v == -1) {
                return true;
            }
            for (int i = 0; i < this.f7801v; i++) {
                int i5 = this.f7796f[i];
                if (i5 == 0 || i5 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f7801v * 31) + this.f7797fb) * 31;
            long j = this.y;
            int iHashCode = (((((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f7799s)) * 31) + Arrays.hashCode(this.f7796f)) * 31) + Arrays.hashCode(this.f7800t)) * 31;
            long j4 = this.w;
            return ((iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f7798p ? 1 : 0);
        }

        public boolean s() {
            return this.f7801v == -1 || v() < this.f7801v;
        }

        @Override // ft.s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f7793co, this.y);
            bundle.putInt(z, this.f7801v);
            bundle.putInt(fh, this.f7797fb);
            bundle.putParcelableArrayList(f7795r, new ArrayList<>(Arrays.asList(this.f7799s)));
            bundle.putIntArray(f3, this.f7796f);
            bundle.putLongArray(n, this.f7800t);
            bundle.putLong(c, this.w);
            bundle.putBoolean(d0, this.f7798p);
            return bundle;
        }

        public int v() {
            return a(-1);
        }

        public y(long j, int i, int i5, int[] iArr, Uri[] uriArr, long[] jArr, long j4, boolean z5) {
            v0.y.y(iArr.length == uriArr.length);
            this.y = j;
            this.f7801v = i;
            this.f7797fb = i5;
            this.f7796f = iArr;
            this.f7799s = uriArr;
            this.f7800t = jArr;
            this.w = j4;
            this.f7798p = z5;
        }
    }

    public zn(@Nullable Object obj, y[] yVarArr, long j, long j4, int i) {
        this.y = obj;
        this.f7789fb = j;
        this.f7790s = j4;
        this.f7792v = yVarArr.length + i;
        this.f7791t = yVarArr;
        this.f7788f = i;
    }

    public static zn n3(Bundle bundle) {
        y[] yVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f7785co);
        if (parcelableArrayList == null) {
            yVarArr = new y[0];
        } else {
            y[] yVarArr2 = new y[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                yVarArr2[i] = (y) y.f7794d.fromBundle((Bundle) parcelableArrayList.get(i));
            }
            yVarArr = yVarArr2;
        }
        String str = z;
        zn znVar = w;
        return new zn(null, yVarArr, bundle.getLong(str, znVar.f7789fb), bundle.getLong(f7787r, znVar.f7790s), bundle.getInt(f3, znVar.f7788f));
    }

    public final boolean a(long j, long j4, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j7 = zn(i).y;
        return j7 == Long.MIN_VALUE ? j4 == -9223372036854775807L || j < j4 : j < j7;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zn.class != obj.getClass()) {
            return false;
        }
        zn znVar = (zn) obj;
        return ut.zn(this.y, znVar.y) && this.f7792v == znVar.f7792v && this.f7789fb == znVar.f7789fb && this.f7790s == znVar.f7790s && this.f7788f == znVar.f7788f && Arrays.equals(this.f7791t, znVar.f7791t);
    }

    public int gv(long j, long j4) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j4 != -9223372036854775807L && j >= j4) {
            return -1;
        }
        int i = this.f7788f;
        while (i < this.f7792v && ((zn(i).y != Long.MIN_VALUE && zn(i).y <= j) || !zn(i).s())) {
            i++;
        }
        if (i < this.f7792v) {
            return i;
        }
        return -1;
    }

    public int hashCode() {
        int i = this.f7792v * 31;
        Object obj = this.y;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f7789fb)) * 31) + ((int) this.f7790s)) * 31) + this.f7788f) * 31) + Arrays.hashCode(this.f7791t);
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (y yVar : this.f7791t) {
            arrayList.add(yVar.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f7785co, arrayList);
        }
        long j = this.f7789fb;
        zn znVar = w;
        if (j != znVar.f7789fb) {
            bundle.putLong(z, j);
        }
        long j4 = this.f7790s;
        if (j4 != znVar.f7790s) {
            bundle.putLong(f7787r, j4);
        }
        int i = this.f7788f;
        if (i != znVar.f7788f) {
            bundle.putInt(f3, i);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.y);
        sb.append(", adResumePositionUs=");
        sb.append(this.f7789fb);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f7791t.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f7791t[i].y);
            sb.append(", ads=[");
            for (int i5 = 0; i5 < this.f7791t[i].f7796f.length; i5++) {
                sb.append("ad(state=");
                int i8 = this.f7791t[i].f7796f[i5];
                if (i8 == 0) {
                    sb.append('_');
                } else if (i8 == 1) {
                    sb.append('R');
                } else if (i8 == 2) {
                    sb.append('S');
                } else if (i8 == 3) {
                    sb.append('P');
                } else if (i8 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f7791t[i].f7800t[i5]);
                sb.append(')');
                if (i5 < this.f7791t[i].f7796f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f7791t.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public int v(long j, long j4) {
        int i = this.f7792v - 1;
        while (i >= 0 && a(j, j4, i)) {
            i--;
        }
        if (i < 0 || !zn(i).fb()) {
            return -1;
        }
        return i;
    }

    public y zn(int i) {
        int i5 = this.f7788f;
        return i < i5 ? f7786p : this.f7791t[i - i5];
    }
}
