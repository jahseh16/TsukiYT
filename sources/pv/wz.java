package pv;

import androidx.annotation.Nullable;
import ft.g;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class wz {
    public final long n3;

    @Nullable
    public final t y;
    public final long zn;

    public static final class gv {
        public final long n3;
        public final long y;

        public gv(long j, long j4) {
            this.y = j;
            this.n3 = j4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || gv.class != obj.getClass()) {
                return false;
            }
            gv gvVar = (gv) obj;
            return this.y == gvVar.y && this.n3 == gvVar.n3;
        }

        public int hashCode() {
            return (((int) this.y) * 31) + ((int) this.n3);
        }
    }

    public static final class n3 extends y {

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        @Nullable
        public final List<t> f7408i9;

        public n3(t tVar, long j, long j4, long j7, long j8, @Nullable List<gv> list, long j9, @Nullable List<t> list2, long j10, long j11) {
            super(tVar, j, j4, j7, j8, list, j9, j10, j11);
            this.f7408i9 = list2;
        }

        @Override // pv.wz.y
        public t f(tl tlVar, long j) {
            return this.f7408i9.get((int) (j - this.f7414gv));
        }

        @Override // pv.wz.y
        public long fb(long j) {
            return this.f7408i9.size();
        }

        @Override // pv.wz.y
        public boolean t() {
            return true;
        }
    }

    public static abstract class y extends wz {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<gv> f7411a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final long f7412c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final long f7413fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final long f7414gv;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final long f7415s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f7416v;

        public y(@Nullable t tVar, long j, long j4, long j7, long j8, @Nullable List<gv> list, long j9, long j10, long j11) {
            super(tVar, j, j4);
            this.f7414gv = j7;
            this.f7416v = j8;
            this.f7411a = list;
            this.f7412c5 = j9;
            this.f7413fb = j10;
            this.f7415s = j11;
        }

        public long a(long j, long j4) {
            if (this.f7411a != null) {
                return -9223372036854775807L;
            }
            long jGv = gv(j, j4) + zn(j, j4);
            return (i9(jGv) + s(jGv, j)) - this.f7412c5;
        }

        public long c5(long j, long j4) {
            long jV = v();
            long jFb = fb(j4);
            if (jFb == 0) {
                return jV;
            }
            if (this.f7411a == null) {
                long j7 = this.f7414gv + (j / ((this.f7416v * 1000000) / this.n3));
                return j7 < jV ? jV : jFb == -1 ? j7 : Math.min(j7, (jV + jFb) - 1);
            }
            long j8 = (jFb + jV) - 1;
            long j9 = jV;
            while (j9 <= j8) {
                long j10 = ((j8 - j9) / 2) + j9;
                long jI9 = i9(j10);
                if (jI9 < j) {
                    j9 = j10 + 1;
                } else {
                    if (jI9 <= j) {
                        return j10;
                    }
                    j8 = j10 - 1;
                }
            }
            return j9 == jV ? j9 : j8;
        }

        public abstract t f(tl tlVar, long j);

        public abstract long fb(long j);

        public long gv(long j, long j4) {
            if (fb(j) == -1) {
                long j7 = this.f7413fb;
                if (j7 != -9223372036854775807L) {
                    return Math.max(v(), c5((j4 - this.f7415s) - j7, j));
                }
            }
            return v();
        }

        public final long i9(long j) {
            List<gv> list = this.f7411a;
            return ut.x5(list != null ? list.get((int) (j - this.f7414gv)).y - this.zn : (j - this.f7414gv) * this.f7416v, 1000000L, this.n3);
        }

        public final long s(long j, long j4) {
            List<gv> list = this.f7411a;
            if (list != null) {
                return (list.get((int) (j - this.f7414gv)).n3 * 1000000) / this.n3;
            }
            long jFb = fb(j4);
            return (jFb == -1 || j != (v() + jFb) - 1) ? (this.f7416v * 1000000) / this.n3 : j4 - i9(j);
        }

        public boolean t() {
            return this.f7411a != null;
        }

        public long v() {
            return this.f7414gv;
        }

        public long zn(long j, long j4) {
            long jFb = fb(j);
            return jFb != -1 ? jFb : (int) (c5((j4 - this.f7415s) + this.f7412c5, j) - gv(j, j4));
        }
    }

    public static final class zn extends y {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final p f7417f;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        @Nullable
        public final p f7418i9;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long f7419t;

        public zn(t tVar, long j, long j4, long j7, long j8, long j9, @Nullable List<gv> list, long j10, @Nullable p pVar, @Nullable p pVar2, long j11, long j12) {
            super(tVar, j, j4, j7, j9, list, j10, j11, j12);
            this.f7418i9 = pVar;
            this.f7417f = pVar2;
            this.f7419t = j8;
        }

        @Override // pv.wz.y
        public t f(tl tlVar, long j) {
            List<gv> list = this.f7411a;
            long j4 = list != null ? list.get((int) (j - this.f7414gv)).y : (j - this.f7414gv) * this.f7416v;
            p pVar = this.f7417f;
            g gVar = tlVar.n3;
            return new t(pVar.y(gVar.y, j, gVar.f4786p, j4), 0L, -1L);
        }

        @Override // pv.wz.y
        public long fb(long j) {
            if (this.f7411a != null) {
                return r0.size();
            }
            long j4 = this.f7419t;
            if (j4 != -1) {
                return (j4 - this.f7414gv) + 1;
            }
            if (j != -9223372036854775807L) {
                return m4.y.y(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.n3)), BigInteger.valueOf(this.f7416v).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // pv.wz
        @Nullable
        public t y(tl tlVar) {
            p pVar = this.f7418i9;
            if (pVar == null) {
                return super.y(tlVar);
            }
            g gVar = tlVar.n3;
            return new t(pVar.y(gVar.y, 0L, gVar.f4786p, 0L), 0L, -1L);
        }
    }

    public wz(@Nullable t tVar, long j, long j4) {
        this.y = tVar;
        this.n3 = j;
        this.zn = j4;
    }

    public long n3() {
        return ut.x5(this.zn, 1000000L, this.n3);
    }

    @Nullable
    public t y(tl tlVar) {
        return this.y;
    }

    public static class v extends wz {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final long f7409gv;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f7410v;

        public v(@Nullable t tVar, long j, long j4, long j7, long j8) {
            super(tVar, j, j4);
            this.f7409gv = j7;
            this.f7410v = j8;
        }

        @Nullable
        public t zn() {
            long j = this.f7410v;
            if (j <= 0) {
                return null;
            }
            return new t(null, this.f7409gv, j);
        }

        public v() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
