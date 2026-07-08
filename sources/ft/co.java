package ft;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import ft.co;
import ft.i9;
import java.util.List;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public interface co extends im {

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g4.r<n0.ud> f4653a;
        public boolean c;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public g4.fb<v0.v, zo.y> f4654c5;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public boolean f4655co;
        public boolean d0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public v0.ej f4656f;
        public long f3;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public g4.r<cr> f4657fb;

        @Nullable
        public Looper fh;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public g4.r<vc> f4658gv;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        public pq f4659i4;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public Looper f4660i9;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public int f4661mt;
        public long n;
        public v0.v n3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f4662p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f4663r;
        public boolean rz;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public g4.r<r0.a> f4664s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public mn.v f4665t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public boolean f4666tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public g4.r<mg.y> f4667v;
        public boolean w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public int f4668wz;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public long f4669x4;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public boolean f4670xc;
        public final Context y;
        public p1 z;
        public long zn;

        public n3(final Context context) {
            this(context, new g4.r() { // from class: ft.x4
                @Override // g4.r
                public final Object get() {
                    return co.n3.f(context);
                }
            }, new g4.r() { // from class: ft.i4
                @Override // g4.r
                public final Object get() {
                    return co.n3.t(context);
                }
            });
        }

        public static /* synthetic */ vc f(Context context) {
            return new tl(context);
        }

        public static /* synthetic */ mg.y t(Context context) {
            return new ur.co(context, new b1.c5());
        }

        public static /* synthetic */ n0.ud tl(Context context) {
            return new n0.tl(context);
        }

        public static /* synthetic */ mg.y w(Context context) {
            return new ur.co(context, new b1.c5());
        }

        public n3 c(int i) {
            v0.y.fb(!this.rz);
            this.f4668wz = i;
            return this;
        }

        public n3 f3(boolean z) {
            v0.y.fb(!this.rz);
            this.c = z;
            return this;
        }

        public n3 i4(final cr crVar) {
            v0.y.fb(!this.rz);
            v0.y.v(crVar);
            this.f4657fb = new g4.r() { // from class: ft.z
                @Override // g4.r
                public final Object get() {
                    return co.n3.mt(crVar);
                }
            };
            return this;
        }

        public co i9() {
            v0.y.fb(!this.rz);
            this.rz = true;
            return new dm(this, null);
        }

        public n3 n(final n0.ud udVar) {
            v0.y.fb(!this.rz);
            v0.y.v(udVar);
            this.f4653a = new g4.r() { // from class: ft.n
                @Override // g4.r
                public final Object get() {
                    return co.n3.co(udVar);
                }
            };
            return this;
        }

        public n3 r(final r0.a aVar) {
            v0.y.fb(!this.rz);
            v0.y.v(aVar);
            this.f4664s = new g4.r() { // from class: ft.f3
                @Override // g4.r
                public final Object get() {
                    return co.n3.p(aVar);
                }
            };
            return this;
        }

        public n3 x4(boolean z) {
            v0.y.fb(!this.rz);
            this.f4670xc = z;
            return this;
        }

        public n3 z(mn.v vVar, boolean z) {
            v0.y.fb(!this.rz);
            this.f4665t = (mn.v) v0.y.v(vVar);
            this.f4666tl = z;
            return this;
        }

        public n3(final Context context, final vc vcVar) {
            this(context, new g4.r() { // from class: ft.c
                @Override // g4.r
                public final Object get() {
                    return co.n3.xc(vcVar);
                }
            }, new g4.r() { // from class: ft.d0
                @Override // g4.r
                public final Object get() {
                    return co.n3.w(context);
                }
            });
            v0.y.v(vcVar);
        }

        public n3(final Context context, g4.r<vc> rVar, g4.r<mg.y> rVar2) {
            this(context, rVar, rVar2, new g4.r() { // from class: ft.fh
                @Override // g4.r
                public final Object get() {
                    return co.n3.tl(context);
                }
            }, new g4.r() { // from class: ft.rz
                @Override // g4.r
                public final Object get() {
                    return new f();
                }
            }, new g4.r() { // from class: ft.mg
                @Override // g4.r
                public final Object get() {
                    return r0.z.wz(context);
                }
            }, new g4.fb() { // from class: ft.r
                @Override // g4.fb
                public final Object apply(Object obj) {
                    return new zo.yg((v0.v) obj);
                }
            });
        }

        public n3(Context context, g4.r<vc> rVar, g4.r<mg.y> rVar2, g4.r<n0.ud> rVar3, g4.r<cr> rVar4, g4.r<r0.a> rVar5, g4.fb<v0.v, zo.y> fbVar) {
            this.y = (Context) v0.y.v(context);
            this.f4658gv = rVar;
            this.f4667v = rVar2;
            this.f4653a = rVar3;
            this.f4657fb = rVar4;
            this.f4664s = rVar5;
            this.f4654c5 = fbVar;
            this.f4660i9 = v0.ut.j5();
            this.f4665t = mn.v.w;
            this.f4668wz = 0;
            this.f4662p = 1;
            this.f4661mt = 0;
            this.f4655co = true;
            this.z = p1.f4973fb;
            this.f4663r = 5000L;
            this.f4669x4 = 15000L;
            this.f4659i4 = new i9.n3().y();
            this.n3 = v0.v.y;
            this.f3 = 500L;
            this.n = 2000L;
            this.d0 = true;
        }

        public static /* synthetic */ n0.ud co(n0.ud udVar) {
            return udVar;
        }

        public static /* synthetic */ cr mt(cr crVar) {
            return crVar;
        }

        public static /* synthetic */ r0.a p(r0.a aVar) {
            return aVar;
        }

        public static /* synthetic */ vc xc(vc vcVar) {
            return vcVar;
        }
    }

    public interface y {
        void d0(boolean z);

        void z(boolean z);
    }

    @Override // ft.im
    @Nullable
    p a();

    void a8(List<ur.mg> list, int i, long j);

    void ct(zo.zn znVar);

    void eb(List<ur.mg> list);

    void ej(boolean z);

    int getAudioSessionId();

    void j();

    int jz();

    int o(int i);

    boolean rb();

    void rz(List<ur.mg> list, boolean z);

    void s(boolean z);

    void ta(zo.zn znVar);

    void tl(@Nullable p1 p1Var);

    @Nullable
    n0.ud w();
}
