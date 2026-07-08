package ft;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import ft.s;
import ft.xb;
import ft.xq;
import java.util.ArrayList;
import k4.r;
import s6.zn;

/* JADX INFO: loaded from: classes.dex */
public abstract class xq implements s {
    public static final xq y = new y();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f5151v = v0.ut.g3(0);

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final String f5149fb = v0.ut.g3(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f5150s = v0.ut.g3(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s.y<xq> f5148f = new s.y() { // from class: ft.hy
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return xq.n3(bundle);
        }
    };

    public static final class gv implements s {
        public long c;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public boolean f5159co;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f5160d;
        public int d0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f5161f;
        public boolean f3;
        public int fh;
        public long n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f5163p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        public xb.fb f5164r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public Object f5165s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f5166t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        @Deprecated
        public Object f5167v;
        public long w;

        @Deprecated
        public boolean z;

        /* JADX INFO: renamed from: ej, reason: collision with root package name */
        public static final Object f5153ej = new Object();

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final Object f5158x = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final xb f5152b = new xb.zn().gv("com.google.android.exoplayer2.Timeline").s(Uri.EMPTY).y();

        /* JADX INFO: renamed from: hw, reason: collision with root package name */
        public static final String f5154hw = v0.ut.g3(1);

        /* JADX INFO: renamed from: j5, reason: collision with root package name */
        public static final String f5155j5 = v0.ut.g3(2);
        public static final String qn = v0.ut.g3(3);
        public static final String o = v0.ut.g3(4);
        public static final String j = v0.ut.g3(5);
        public static final String oz = v0.ut.g3(6);

        /* JADX INFO: renamed from: ut, reason: collision with root package name */
        public static final String f5157ut = v0.ut.g3(7);
        public static final String q9 = v0.ut.g3(8);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f5156k = v0.ut.g3(9);
        public static final String f7 = v0.ut.g3(10);
        public static final String en = v0.ut.g3(11);
        public static final String jz = v0.ut.g3(12);
        public static final String u = v0.ut.g3(13);
        public static final s.y<gv> y5 = new s.y() { // from class: ft.jb
            @Override // ft.s.y
            public final s fromBundle(Bundle bundle) {
                return xq.gv.n3(bundle);
            }
        };
        public Object y = f5153ej;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public xb f5162fb = f5152b;

        public static gv n3(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f5154hw);
            xb xbVar = bundle2 != null ? (xb) xb.d0.fromBundle(bundle2) : xb.f5073co;
            long j4 = bundle.getLong(f5155j5, -9223372036854775807L);
            long j7 = bundle.getLong(qn, -9223372036854775807L);
            long j8 = bundle.getLong(o, -9223372036854775807L);
            boolean z = bundle.getBoolean(j, false);
            boolean z5 = bundle.getBoolean(oz, false);
            Bundle bundle3 = bundle.getBundle(f5157ut);
            xb.fb fbVar = bundle3 != null ? (xb.fb) xb.fb.f3.fromBundle(bundle3) : null;
            boolean z7 = bundle.getBoolean(q9, false);
            long j9 = bundle.getLong(f5156k, 0L);
            long j10 = bundle.getLong(f7, -9223372036854775807L);
            int i = bundle.getInt(en, 0);
            int i5 = bundle.getInt(jz, 0);
            long j11 = bundle.getLong(u, 0L);
            gv gvVar = new gv();
            gvVar.c5(f5158x, xbVar, null, j4, j7, j8, z, z5, fbVar, j9, j10, i, i5, j11);
            gvVar.f3 = z7;
            return gvVar;
        }

        public long a() {
            return v0.ut.gf(this.c);
        }

        public gv c5(Object obj, @Nullable xb xbVar, @Nullable Object obj2, long j4, long j7, long j8, boolean z, boolean z5, @Nullable xb.fb fbVar, long j9, long j10, int i, int i5, long j11) {
            xb.s sVar;
            this.y = obj;
            this.f5162fb = xbVar != null ? xbVar : f5152b;
            this.f5167v = (xbVar == null || (sVar = xbVar.f5080v) == null) ? null : sVar.f5123s;
            this.f5165s = obj2;
            this.f5161f = j4;
            this.f5166t = j7;
            this.w = j8;
            this.f5163p = z;
            this.f5159co = z5;
            this.z = fbVar != null;
            this.f5164r = fbVar;
            this.n = j9;
            this.c = j10;
            this.d0 = i;
            this.fh = i5;
            this.f5160d = j11;
            this.f3 = false;
            return this;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !gv.class.equals(obj.getClass())) {
                return false;
            }
            gv gvVar = (gv) obj;
            return v0.ut.zn(this.y, gvVar.y) && v0.ut.zn(this.f5162fb, gvVar.f5162fb) && v0.ut.zn(this.f5165s, gvVar.f5165s) && v0.ut.zn(this.f5164r, gvVar.f5164r) && this.f5161f == gvVar.f5161f && this.f5166t == gvVar.f5166t && this.w == gvVar.w && this.f5163p == gvVar.f5163p && this.f5159co == gvVar.f5159co && this.f3 == gvVar.f3 && this.n == gvVar.n && this.c == gvVar.c && this.d0 == gvVar.d0 && this.fh == gvVar.fh && this.f5160d == gvVar.f5160d;
        }

        public long fb() {
            return this.f5160d;
        }

        public long gv() {
            return v0.ut.gf(this.n);
        }

        public int hashCode() {
            int iHashCode = (((217 + this.y.hashCode()) * 31) + this.f5162fb.hashCode()) * 31;
            Object obj = this.f5165s;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            xb.fb fbVar = this.f5164r;
            int iHashCode3 = (iHashCode2 + (fbVar != null ? fbVar.hashCode() : 0)) * 31;
            long j4 = this.f5161f;
            int i = (iHashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j7 = this.f5166t;
            int i5 = (i + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.w;
            int i8 = (((((((i5 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f5163p ? 1 : 0)) * 31) + (this.f5159co ? 1 : 0)) * 31) + (this.f3 ? 1 : 0)) * 31;
            long j9 = this.n;
            int i10 = (i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.c;
            int i11 = (((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.d0) * 31) + this.fh) * 31;
            long j11 = this.f5160d;
            return i11 + ((int) (j11 ^ (j11 >>> 32)));
        }

        public boolean s() {
            v0.y.fb(this.z == (this.f5164r != null));
            return this.f5164r != null;
        }

        @Override // ft.s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!xb.f5073co.equals(this.f5162fb)) {
                bundle.putBundle(f5154hw, this.f5162fb.toBundle());
            }
            long j4 = this.f5161f;
            if (j4 != -9223372036854775807L) {
                bundle.putLong(f5155j5, j4);
            }
            long j7 = this.f5166t;
            if (j7 != -9223372036854775807L) {
                bundle.putLong(qn, j7);
            }
            long j8 = this.w;
            if (j8 != -9223372036854775807L) {
                bundle.putLong(o, j8);
            }
            boolean z = this.f5163p;
            if (z) {
                bundle.putBoolean(j, z);
            }
            boolean z5 = this.f5159co;
            if (z5) {
                bundle.putBoolean(oz, z5);
            }
            xb.fb fbVar = this.f5164r;
            if (fbVar != null) {
                bundle.putBundle(f5157ut, fbVar.toBundle());
            }
            boolean z7 = this.f3;
            if (z7) {
                bundle.putBoolean(q9, z7);
            }
            long j9 = this.n;
            if (j9 != 0) {
                bundle.putLong(f5156k, j9);
            }
            long j10 = this.c;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f7, j10);
            }
            int i = this.d0;
            if (i != 0) {
                bundle.putInt(en, i);
            }
            int i5 = this.fh;
            if (i5 != 0) {
                bundle.putInt(jz, i5);
            }
            long j11 = this.f5160d;
            if (j11 != 0) {
                bundle.putLong(u, j11);
            }
            return bundle;
        }

        public long v() {
            return this.n;
        }

        public long zn() {
            return v0.ut.y5(this.w);
        }
    }

    public static final class n3 implements s {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f5171f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f5172fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f5173s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f5174t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public Object f5175v;
        public s6.zn w = s6.zn.w;

        @Nullable
        public Object y;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f5169p = v0.ut.g3(0);

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public static final String f5168co = v0.ut.g3(1);
        public static final String z = v0.ut.g3(2);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f5170r = v0.ut.g3(3);
        public static final String f3 = v0.ut.g3(4);
        public static final s.y<n3> n = new s.y() { // from class: ft.jt
            @Override // ft.s.y
            public final s fromBundle(Bundle bundle) {
                return xq.n3.zn(bundle);
            }
        };

        public static n3 zn(Bundle bundle) {
            int i = bundle.getInt(f5169p, 0);
            long j = bundle.getLong(f5168co, -9223372036854775807L);
            long j4 = bundle.getLong(z, 0L);
            boolean z5 = bundle.getBoolean(f5170r, false);
            Bundle bundle2 = bundle.getBundle(f3);
            s6.zn znVar = bundle2 != null ? (s6.zn) s6.zn.n.fromBundle(bundle2) : s6.zn.w;
            n3 n3Var = new n3();
            n3Var.x4(null, null, i, j, j4, znVar, z5);
            return n3Var;
        }

        public int a() {
            return this.w.f7792v;
        }

        public long c5(int i) {
            return this.w.zn(i).y;
        }

        public boolean co(int i) {
            return !this.w.zn(i).fb();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !n3.class.equals(obj.getClass())) {
                return false;
            }
            n3 n3Var = (n3) obj;
            return v0.ut.zn(this.y, n3Var.y) && v0.ut.zn(this.f5175v, n3Var.f5175v) && this.f5172fb == n3Var.f5172fb && this.f5173s == n3Var.f5173s && this.f5171f == n3Var.f5171f && this.f5174t == n3Var.f5174t && v0.ut.zn(this.w, n3Var.w);
        }

        public int f(int i, int i5) {
            zn.y yVarZn = this.w.zn(i);
            if (yVarZn.f7801v != -1) {
                return yVarZn.f7796f[i5];
            }
            return 0;
        }

        public int fb(long j) {
            return this.w.gv(j, this.f5173s);
        }

        public int gv(int i) {
            return this.w.zn(i).f7801v;
        }

        public int hashCode() {
            Object obj = this.y;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f5175v;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f5172fb) * 31;
            long j = this.f5173s;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j4 = this.f5171f;
            return ((((i + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f5174t ? 1 : 0)) * 31) + this.w.hashCode();
        }

        public long i9() {
            return this.w.f7789fb;
        }

        public int mt() {
            return this.w.f7788f;
        }

        public long p() {
            return this.f5171f;
        }

        public n3 r(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j4) {
            return x4(obj, obj2, i, j, j4, s6.zn.w, false);
        }

        public int s(long j) {
            return this.w.v(j, this.f5173s);
        }

        public long t(int i) {
            return this.w.zn(i).w;
        }

        public long tl() {
            return this.f5173s;
        }

        @Override // ft.s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i = this.f5172fb;
            if (i != 0) {
                bundle.putInt(f5169p, i);
            }
            long j = this.f5173s;
            if (j != -9223372036854775807L) {
                bundle.putLong(f5168co, j);
            }
            long j4 = this.f5171f;
            if (j4 != 0) {
                bundle.putLong(z, j4);
            }
            boolean z5 = this.f5174t;
            if (z5) {
                bundle.putBoolean(f5170r, z5);
            }
            if (!this.w.equals(s6.zn.w)) {
                bundle.putBundle(f3, this.w.toBundle());
            }
            return bundle;
        }

        public long v(int i, int i5) {
            zn.y yVarZn = this.w.zn(i);
            if (yVarZn.f7801v != -1) {
                return yVarZn.f7800t[i5];
            }
            return -9223372036854775807L;
        }

        public long w() {
            return v0.ut.gf(this.f5171f);
        }

        public int wz(int i) {
            return this.w.zn(i).v();
        }

        public n3 x4(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j4, s6.zn znVar, boolean z5) {
            this.y = obj;
            this.f5175v = obj2;
            this.f5172fb = i;
            this.f5173s = j;
            this.f5171f = j4;
            this.w = znVar;
            this.f5174t = z5;
            return this;
        }

        public int xc(int i, int i5) {
            return this.w.zn(i).a(i5);
        }

        public boolean z(int i) {
            return this.w.zn(i).f7798p;
        }
    }

    public class y extends xq {
        @Override // ft.xq
        public int a(Object obj) {
            return -1;
        }

        @Override // ft.xq
        public gv co(int i, gv gvVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // ft.xq
        public n3 f(int i, n3 n3Var, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // ft.xq
        public Object p(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // ft.xq
        public int tl() {
            return 0;
        }

        @Override // ft.xq
        public int z() {
            return 0;
        }
    }

    public static final class zn extends xq {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public final int[] f5176co;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int[] f5177p;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final k4.r<gv> f5178t;
        public final k4.r<n3> w;

        public zn(k4.r<gv> rVar, k4.r<n3> rVar2, int[] iArr) {
            v0.y.y(rVar.size() == iArr.length);
            this.f5178t = rVar;
            this.w = rVar2;
            this.f5177p = iArr;
            this.f5176co = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f5176co[iArr[i]] = i;
            }
        }

        @Override // ft.xq
        public int a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // ft.xq
        public int c5(int i, int i5, boolean z) {
            if (i5 == 1) {
                return i;
            }
            if (i != fb(z)) {
                return z ? this.f5177p[this.f5176co[i] + 1] : i + 1;
            }
            if (i5 == 2) {
                return v(z);
            }
            return -1;
        }

        @Override // ft.xq
        public gv co(int i, gv gvVar, long j) {
            gv gvVar2 = this.f5178t.get(i);
            gvVar.c5(gvVar2.y, gvVar2.f5162fb, gvVar2.f5165s, gvVar2.f5161f, gvVar2.f5166t, gvVar2.w, gvVar2.f5163p, gvVar2.f5159co, gvVar2.f5164r, gvVar2.n, gvVar2.c, gvVar2.d0, gvVar2.fh, gvVar2.f5160d);
            gvVar.f3 = gvVar2.f3;
            return gvVar;
        }

        @Override // ft.xq
        public n3 f(int i, n3 n3Var, boolean z) {
            n3 n3Var2 = this.w.get(i);
            n3Var.x4(n3Var2.y, n3Var2.f5175v, n3Var2.f5172fb, n3Var2.f5173s, n3Var2.f5171f, n3Var2.w, n3Var2.f5174t);
            return n3Var;
        }

        @Override // ft.xq
        public int fb(boolean z) {
            if (r()) {
                return -1;
            }
            return z ? this.f5177p[z() - 1] : z() - 1;
        }

        @Override // ft.xq
        public Object p(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // ft.xq
        public int tl() {
            return this.w.size();
        }

        @Override // ft.xq
        public int v(boolean z) {
            if (r()) {
                return -1;
            }
            if (z) {
                return this.f5177p[0];
            }
            return 0;
        }

        @Override // ft.xq
        public int w(int i, int i5, boolean z) {
            if (i5 == 1) {
                return i;
            }
            if (i != v(z)) {
                return z ? this.f5177p[this.f5176co[i] - 1] : i - 1;
            }
            if (i5 == 2) {
                return fb(z);
            }
            return -1;
        }

        @Override // ft.xq
        public int z() {
            return this.f5178t.size();
        }
    }

    public static int[] gv(int i) {
        int[] iArr = new int[i];
        for (int i5 = 0; i5 < i; i5++) {
            iArr[i5] = i5;
        }
        return iArr;
    }

    public static xq n3(Bundle bundle) {
        k4.r rVarZn = zn(gv.y5, v0.zn.y(bundle, f5151v));
        k4.r rVarZn2 = zn(n3.n, v0.zn.y(bundle, f5149fb));
        int[] intArray = bundle.getIntArray(f5150s);
        if (intArray == null) {
            intArray = gv(rVarZn.size());
        }
        return new zn(rVarZn, rVarZn2, intArray);
    }

    public static <T extends s> k4.r<T> zn(s.y<T> yVar, @Nullable IBinder iBinder) {
        if (iBinder == null) {
            return k4.r.yt();
        }
        r.y yVar2 = new r.y();
        k4.r<Bundle> rVarY = fb.y(iBinder);
        for (int i = 0; i < rVarY.size(); i++) {
            yVar2.y(yVar.fromBundle(rVarY.get(i)));
        }
        return yVar2.f();
    }

    public abstract int a(Object obj);

    public int c5(int i, int i5, boolean z) {
        if (i5 == 0) {
            if (i == fb(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i5 == 1) {
            return i;
        }
        if (i5 == 2) {
            return i == fb(z) ? v(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public abstract gv co(int i, gv gvVar, long j);

    public boolean equals(@Nullable Object obj) {
        int iFb;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq)) {
            return false;
        }
        xq xqVar = (xq) obj;
        if (xqVar.z() != z() || xqVar.tl() != tl()) {
            return false;
        }
        gv gvVar = new gv();
        n3 n3Var = new n3();
        gv gvVar2 = new gv();
        n3 n3Var2 = new n3();
        for (int i = 0; i < z(); i++) {
            if (!mt(i, gvVar).equals(xqVar.mt(i, gvVar2))) {
                return false;
            }
        }
        for (int i5 = 0; i5 < tl(); i5++) {
            if (!f(i5, n3Var, true).equals(xqVar.f(i5, n3Var2, true))) {
                return false;
            }
        }
        int iV = v(true);
        if (iV != xqVar.v(true) || (iFb = fb(true)) != xqVar.fb(true)) {
            return false;
        }
        while (iV != iFb) {
            int iC5 = c5(iV, 0, true);
            if (iC5 != xqVar.c5(iV, 0, true)) {
                return false;
            }
            iV = iC5;
        }
        return true;
    }

    public abstract n3 f(int i, n3 n3Var, boolean z);

    public int fb(boolean z) {
        if (r()) {
            return -1;
        }
        return z() - 1;
    }

    public int hashCode() {
        gv gvVar = new gv();
        n3 n3Var = new n3();
        int iZ = 217 + z();
        for (int i = 0; i < z(); i++) {
            iZ = (iZ * 31) + mt(i, gvVar).hashCode();
        }
        int iTl = (iZ * 31) + tl();
        for (int i5 = 0; i5 < tl(); i5++) {
            iTl = (iTl * 31) + f(i5, n3Var, true).hashCode();
        }
        int iV = v(true);
        while (iV != -1) {
            iTl = (iTl * 31) + iV;
            iV = c5(iV, 0, true);
        }
        return iTl;
    }

    public final n3 i9(int i, n3 n3Var) {
        return f(i, n3Var, false);
    }

    public final gv mt(int i, gv gvVar) {
        return co(i, gvVar, 0L);
    }

    public abstract Object p(int i);

    public final boolean r() {
        return z() == 0;
    }

    public final int s(int i, n3 n3Var, gv gvVar, int i5, boolean z) {
        int i8 = i9(i, n3Var).f5172fb;
        if (mt(i8, gvVar).fh != i) {
            return i + 1;
        }
        int iC5 = c5(i8, i5, z);
        if (iC5 == -1) {
            return -1;
        }
        return mt(iC5, gvVar).d0;
    }

    public n3 t(Object obj, n3 n3Var) {
        return f(a(obj), n3Var, true);
    }

    public abstract int tl();

    @Override // ft.s
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int iZ = z();
        gv gvVar = new gv();
        for (int i = 0; i < iZ; i++) {
            arrayList.add(co(i, gvVar, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int iTl = tl();
        n3 n3Var = new n3();
        for (int i5 = 0; i5 < iTl; i5++) {
            arrayList2.add(f(i5, n3Var, false).toBundle());
        }
        int[] iArr = new int[iZ];
        if (iZ > 0) {
            iArr[0] = v(true);
        }
        for (int i8 = 1; i8 < iZ; i8++) {
            iArr[i8] = c5(iArr[i8 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        v0.zn.zn(bundle, f5151v, new fb(arrayList));
        v0.zn.zn(bundle, f5149fb, new fb(arrayList2));
        bundle.putIntArray(f5150s, iArr);
        return bundle;
    }

    public int v(boolean z) {
        return r() ? -1 : 0;
    }

    public int w(int i, int i5, boolean z) {
        if (i5 == 0) {
            if (i == v(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i5 == 1) {
            return i;
        }
        if (i5 == 2) {
            return i == v(z) ? fb(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public final Pair<Object, Long> wz(gv gvVar, n3 n3Var, int i, long j) {
        return (Pair) v0.y.v(xc(gvVar, n3Var, i, j, 0L));
    }

    public final boolean x4(int i, n3 n3Var, gv gvVar, int i5, boolean z) {
        return s(i, n3Var, gvVar, i5, z) == -1;
    }

    @Nullable
    public final Pair<Object, Long> xc(gv gvVar, n3 n3Var, int i, long j, long j4) {
        v0.y.zn(i, 0, z());
        co(i, gvVar, j4);
        if (j == -9223372036854775807L) {
            j = gvVar.v();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i5 = gvVar.d0;
        i9(i5, n3Var);
        while (i5 < gvVar.fh && n3Var.f5171f != j) {
            int i8 = i5 + 1;
            if (i9(i8, n3Var).f5171f > j) {
                break;
            }
            i5 = i8;
        }
        f(i5, n3Var, true);
        long jMin = j - n3Var.f5171f;
        long j7 = n3Var.f5173s;
        if (j7 != -9223372036854775807L) {
            jMin = Math.min(jMin, j7 - 1);
        }
        return Pair.create(v0.y.v(n3Var.f5175v), Long.valueOf(Math.max(0L, jMin)));
    }

    public abstract int z();
}
