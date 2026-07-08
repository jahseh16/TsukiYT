package pv;

import android.net.Uri;
import androidx.annotation.Nullable;
import ft.g;
import java.util.Collections;
import java.util.List;
import k4.r;
import pv.wz;

/* JADX INFO: loaded from: classes.dex */
public abstract class tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<fb> f7397a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final List<fb> f7398fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f7399gv;
    public final g n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f7400s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<fb> f7401v;
    public final long y;
    public final r<pv.n3> zn;

    public static class zn extends tl {

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final Uri f7403c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f7404f;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final long f7405i9;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public final t f7406t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        @Nullable
        public final w f7407tl;

        public zn(long j, g gVar, List<pv.n3> list, wz.v vVar, @Nullable List<fb> list2, List<fb> list3, List<fb> list4, @Nullable String str, long j4) {
            super(j, gVar, list, vVar, list2, list3, list4);
            this.f7403c5 = Uri.parse(list.get(0).y);
            t tVarZn = vVar.zn();
            this.f7406t = tVarZn;
            this.f7404f = str;
            this.f7405i9 = j4;
            this.f7407tl = tVarZn != null ? null : new w(new t(null, 0L, j4));
        }

        public static zn p(long j, g gVar, String str, long j4, long j7, long j8, long j9, List<fb> list, @Nullable String str2, long j10) {
            return new zn(j, gVar, r.j(new pv.n3(str)), new wz.v(new t(null, j4, (j7 - j4) + 1), 1L, 0L, j8, (j9 - j8) + 1), list, r.yt(), r.yt(), str2, j10);
        }

        @Override // pv.tl
        @Nullable
        public String f() {
            return this.f7404f;
        }

        @Override // pv.tl
        @Nullable
        public sd.t t() {
            return this.f7407tl;
        }

        @Override // pv.tl
        @Nullable
        public t tl() {
            return this.f7406t;
        }
    }

    public static tl w(long j, g gVar, List<pv.n3> list, wz wzVar, @Nullable List<fb> list2, List<fb> list3, List<fb> list4, @Nullable String str) {
        if (wzVar instanceof wz.v) {
            return new zn(j, gVar, list, (wz.v) wzVar, list2, list3, list4, str, -1L);
        }
        if (wzVar instanceof wz.y) {
            return new n3(j, gVar, list, (wz.y) wzVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public static tl xc(long j, g gVar, List<pv.n3> list, wz wzVar) {
        return w(j, gVar, list, wzVar, null, r.yt(), r.yt(), null);
    }

    @Nullable
    public abstract String f();

    @Nullable
    public abstract sd.t t();

    @Nullable
    public abstract t tl();

    @Nullable
    public t wz() {
        return this.f7400s;
    }

    public tl(long j, g gVar, List<pv.n3> list, wz wzVar, @Nullable List<fb> list2, List<fb> list3, List<fb> list4) {
        v0.y.y(!list.isEmpty());
        this.y = j;
        this.n3 = gVar;
        this.zn = r.rz(list);
        this.f7401v = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f7397a = list3;
        this.f7398fb = list4;
        this.f7400s = wzVar.y(this);
        this.f7399gv = wzVar.n3();
    }

    public static class n3 extends tl implements sd.t {

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final wz.y f7402c5;

        public n3(long j, g gVar, List<pv.n3> list, wz.y yVar, @Nullable List<fb> list2, List<fb> list3, List<fb> list4) {
            super(j, gVar, list, yVar, list2, list3, list4);
            this.f7402c5 = yVar;
        }

        @Override // sd.t
        public long a(long j, long j4) {
            return this.f7402c5.c5(j, j4);
        }

        @Override // sd.t
        public long c5() {
            return this.f7402c5.v();
        }

        @Override // pv.tl
        @Nullable
        public String f() {
            return null;
        }

        @Override // sd.t
        public long fb(long j) {
            return this.f7402c5.fb(j);
        }

        @Override // sd.t
        public long gv(long j, long j4) {
            return this.f7402c5.a(j, j4);
        }

        @Override // sd.t
        public long i9(long j, long j4) {
            return this.f7402c5.zn(j, j4);
        }

        @Override // sd.t
        public long n3(long j) {
            return this.f7402c5.i9(j);
        }

        @Override // sd.t
        public boolean s() {
            return this.f7402c5.t();
        }

        @Override // pv.tl
        @Nullable
        public t tl() {
            return null;
        }

        @Override // sd.t
        public t v(long j) {
            return this.f7402c5.f(this, j);
        }

        @Override // sd.t
        public long y(long j, long j4) {
            return this.f7402c5.s(j, j4);
        }

        @Override // sd.t
        public long zn(long j, long j4) {
            return this.f7402c5.gv(j, j4);
        }

        @Override // pv.tl
        public sd.t t() {
            return this;
        }
    }
}
