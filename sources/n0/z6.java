package n0;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import com.google.protobuf.Reader;
import ft.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import k4.r;
import ur.rs;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class z6 implements ft.s {

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public static final String f6854ap;

    /* JADX INFO: renamed from: bk, reason: collision with root package name */
    @Deprecated
    public static final s.y<z6> f6855bk;
    public static final String ct;
    public static final String dm;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f6856e;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public static final String f6857eb;
    public static final String en;
    public static final String f7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f6858g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final String f6859g3;
    public static final String jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f6860k;

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    public static final String f6861kp;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public static final String f6862lc;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f6863m;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public static final String f6864nf;
    public static final String o4;

    @Deprecated
    public static final z6 q9;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public static final String f6865ra;

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public static final String f6866rb;
    public static final String rs;
    public static final String s8;
    public static final String u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f6867u0;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public static final z6 f6868ut;
    public static final String xg;
    public static final String y5;

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public static final String f6869yc;

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public static final String f6870yg;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6871b;
    public final k4.r<String> c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final int f6872co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6873d;
    public final int d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final k4.r<String> f6874ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6875f;
    public final k4.r<String> f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f6876fb;
    public final int fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public final int f6877hw;
    public final k4.i4<rs, ta> j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public final boolean f6878j5;
    public final int n;
    public final boolean o;
    public final k4.n<Integer> oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6879p;
    public final boolean qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f6880r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6881s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6882t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6883v;
    public final int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k4.r<String> f6884x;
    public final int y;
    public final int z;

    static {
        z6 z6VarD0 = new y().d0();
        f6868ut = z6VarD0;
        q9 = z6VarD0;
        f6860k = ut.g3(1);
        f7 = ut.g3(2);
        en = ut.g3(3);
        jz = ut.g3(4);
        u = ut.g3(5);
        y5 = ut.g3(6);
        xg = ut.g3(7);
        dm = ut.g3(8);
        ct = ut.g3(9);
        o4 = ut.g3(10);
        rs = ut.g3(11);
        f6857eb = ut.g3(12);
        f6862lc = ut.g3(13);
        f6864nf = ut.g3(14);
        f6865ra = ut.g3(15);
        f6856e = ut.g3(16);
        s8 = ut.g3(17);
        f6854ap = ut.g3(18);
        f6870yg = ut.g3(19);
        f6869yc = ut.g3(20);
        f6861kp = ut.g3(21);
        f6866rb = ut.g3(22);
        f6859g3 = ut.g3(23);
        f6863m = ut.g3(24);
        f6858g = ut.g3(25);
        f6867u0 = ut.g3(26);
        f6855bk = new s.y() { // from class: n0.d
            @Override // ft.s.y
            public final ft.s fromBundle(Bundle bundle) {
                return z6.fh(bundle);
            }
        };
    }

    public z6(y yVar) {
        this.y = yVar.y;
        this.f6883v = yVar.n3;
        this.f6876fb = yVar.zn;
        this.f6881s = yVar.f6890gv;
        this.f6875f = yVar.f6899v;
        this.f6882t = yVar.f6885a;
        this.w = yVar.f6889fb;
        this.f6879p = yVar.f6896s;
        this.f6872co = yVar.f6886c5;
        this.z = yVar.f6892i9;
        this.f6880r = yVar.f6888f;
        this.f3 = yVar.f6897t;
        this.n = yVar.f6898tl;
        this.c = yVar.f6900wz;
        this.d0 = yVar.f6902xc;
        this.fh = yVar.w;
        this.f6873d = yVar.f6894p;
        this.f6874ej = yVar.f6893mt;
        this.f6884x = yVar.f6887co;
        this.f6871b = yVar.z;
        this.f6877hw = yVar.f6895r;
        this.f6878j5 = yVar.f6901x4;
        this.qn = yVar.f6891i4;
        this.o = yVar.f3;
        this.j = k4.i4.f(yVar.n);
        this.oz = k4.n.n(yVar.c);
    }

    public static z6 fh(Bundle bundle) {
        return new y(bundle).d0();
    }

    public y d0() {
        return new y(this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return this.y == z6Var.y && this.f6883v == z6Var.f6883v && this.f6876fb == z6Var.f6876fb && this.f6881s == z6Var.f6881s && this.f6875f == z6Var.f6875f && this.f6882t == z6Var.f6882t && this.w == z6Var.w && this.f6879p == z6Var.f6879p && this.f6880r == z6Var.f6880r && this.f6872co == z6Var.f6872co && this.z == z6Var.z && this.f3.equals(z6Var.f3) && this.n == z6Var.n && this.c.equals(z6Var.c) && this.d0 == z6Var.d0 && this.fh == z6Var.fh && this.f6873d == z6Var.f6873d && this.f6874ej.equals(z6Var.f6874ej) && this.f6884x.equals(z6Var.f6884x) && this.f6871b == z6Var.f6871b && this.f6877hw == z6Var.f6877hw && this.f6878j5 == z6Var.f6878j5 && this.qn == z6Var.qn && this.o == z6Var.o && this.j.equals(z6Var.j) && this.oz.equals(z6Var.oz);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.y + 31) * 31) + this.f6883v) * 31) + this.f6876fb) * 31) + this.f6881s) * 31) + this.f6875f) * 31) + this.f6882t) * 31) + this.w) * 31) + this.f6879p) * 31) + (this.f6880r ? 1 : 0)) * 31) + this.f6872co) * 31) + this.z) * 31) + this.f3.hashCode()) * 31) + this.n) * 31) + this.c.hashCode()) * 31) + this.d0) * 31) + this.fh) * 31) + this.f6873d) * 31) + this.f6874ej.hashCode()) * 31) + this.f6884x.hashCode()) * 31) + this.f6871b) * 31) + this.f6877hw) * 31) + (this.f6878j5 ? 1 : 0)) * 31) + (this.qn ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + this.j.hashCode()) * 31) + this.oz.hashCode();
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(y5, this.y);
        bundle.putInt(xg, this.f6883v);
        bundle.putInt(dm, this.f6876fb);
        bundle.putInt(ct, this.f6881s);
        bundle.putInt(o4, this.f6875f);
        bundle.putInt(rs, this.f6882t);
        bundle.putInt(f6857eb, this.w);
        bundle.putInt(f6862lc, this.f6879p);
        bundle.putInt(f6864nf, this.f6872co);
        bundle.putInt(f6865ra, this.z);
        bundle.putBoolean(f6856e, this.f6880r);
        bundle.putStringArray(s8, (String[]) this.f3.toArray(new String[0]));
        bundle.putInt(f6858g, this.n);
        bundle.putStringArray(f6860k, (String[]) this.c.toArray(new String[0]));
        bundle.putInt(f7, this.d0);
        bundle.putInt(f6854ap, this.fh);
        bundle.putInt(f6870yg, this.f6873d);
        bundle.putStringArray(f6869yc, (String[]) this.f6874ej.toArray(new String[0]));
        bundle.putStringArray(en, (String[]) this.f6884x.toArray(new String[0]));
        bundle.putInt(jz, this.f6871b);
        bundle.putInt(f6867u0, this.f6877hw);
        bundle.putBoolean(u, this.f6878j5);
        bundle.putBoolean(f6861kp, this.qn);
        bundle.putBoolean(f6866rb, this.o);
        bundle.putParcelableArrayList(f6859g3, v0.gv.gv(this.j.values()));
        bundle.putIntArray(f6863m, n4.a.wz(this.oz));
        return bundle;
    }

    public static class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6885a;
        public HashSet<Integer> c;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f6886c5;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public k4.r<String> f6887co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f6888f;
        public boolean f3;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f6889fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f6890gv;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        public boolean f6891i4;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public int f6892i9;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public k4.r<String> f6893mt;
        public HashMap<rs, ta> n;
        public int n3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f6894p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f6895r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f6896s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public k4.r<String> f6897t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public int f6898tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f6899v;
        public int w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public k4.r<String> f6900wz;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public boolean f6901x4;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public int f6902xc;
        public int y;
        public int z;
        public int zn;

        @Deprecated
        public y() {
            this.y = Reader.READ_DONE;
            this.n3 = Reader.READ_DONE;
            this.zn = Reader.READ_DONE;
            this.f6890gv = Reader.READ_DONE;
            this.f6886c5 = Reader.READ_DONE;
            this.f6892i9 = Reader.READ_DONE;
            this.f6888f = true;
            this.f6897t = k4.r.yt();
            this.f6898tl = 0;
            this.f6900wz = k4.r.yt();
            this.f6902xc = 0;
            this.w = Reader.READ_DONE;
            this.f6894p = Reader.READ_DONE;
            this.f6893mt = k4.r.yt();
            this.f6887co = k4.r.yt();
            this.z = 0;
            this.f6895r = 0;
            this.f6901x4 = false;
            this.f6891i4 = false;
            this.f3 = false;
            this.n = new HashMap<>();
            this.c = new HashSet<>();
        }

        public static k4.r<String> rz(String[] strArr) {
            r.y yVarN = k4.r.n();
            for (String str : (String[]) v0.y.v(strArr)) {
                yVarN.y(ut.ad((String) v0.y.v(str)));
            }
            return yVarN.f();
        }

        public y a8(@Nullable String str) {
            return str == null ? x(new String[0]) : x(str);
        }

        public y b(Context context) {
            if (ut.y >= 19) {
                k5(context);
            }
            return this;
        }

        public y d(int i) {
            this.f6894p = i;
            return this;
        }

        public z6 d0() {
            return new z6(this);
        }

        public y ej(int i) {
            this.zn = i;
            return this;
        }

        public final void fh(z6 z6Var) {
            this.y = z6Var.y;
            this.n3 = z6Var.f6883v;
            this.zn = z6Var.f6876fb;
            this.f6890gv = z6Var.f6881s;
            this.f6899v = z6Var.f6875f;
            this.f6885a = z6Var.f6882t;
            this.f6889fb = z6Var.w;
            this.f6896s = z6Var.f6879p;
            this.f6886c5 = z6Var.f6872co;
            this.f6892i9 = z6Var.z;
            this.f6888f = z6Var.f6880r;
            this.f6897t = z6Var.f3;
            this.f6898tl = z6Var.n;
            this.f6900wz = z6Var.c;
            this.f6902xc = z6Var.d0;
            this.w = z6Var.fh;
            this.f6894p = z6Var.f6873d;
            this.f6893mt = z6Var.f6874ej;
            this.f6887co = z6Var.f6884x;
            this.z = z6Var.f6871b;
            this.f6895r = z6Var.f6877hw;
            this.f6901x4 = z6Var.f6878j5;
            this.f6891i4 = z6Var.qn;
            this.f3 = z6Var.o;
            this.c = new HashSet<>(z6Var.oz);
            this.n = new HashMap<>(z6Var.j);
        }

        public y hw(int i, int i5, boolean z) {
            this.f6886c5 = i;
            this.f6892i9 = i5;
            this.f6888f = z;
            return this;
        }

        public y j5(Context context, boolean z) {
            Point pointVl = ut.vl(context);
            return hw(pointVl.x, pointVl.y, z);
        }

        public final void k5(Context context) {
            CaptioningManager captioningManager;
            if ((ut.y >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.z = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f6887co = k4.r.j(ut.en(locale));
                }
            }
        }

        public y mg(z6 z6Var) {
            fh(z6Var);
            return this;
        }

        @Deprecated
        public y ta(Set<Integer> set) {
            this.c.clear();
            this.c.addAll(set);
            return this;
        }

        public y ud(int i, int i5) {
            this.y = i;
            this.n3 = i5;
            return this;
        }

        public y vl(String... strArr) {
            this.f6897t = k4.r.mg(strArr);
            return this;
        }

        public y x(String... strArr) {
            this.f6893mt = k4.r.mg(strArr);
            return this;
        }

        public y yt(@Nullable String str) {
            return str == null ? vl(new String[0]) : vl(str);
        }

        public y z6(int i) {
            this.f6890gv = i;
            return this;
        }

        public y(Context context) {
            this();
            b(context);
            j5(context, true);
        }

        public y(z6 z6Var) {
            fh(z6Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public y(Bundle bundle) {
            k4.r rVarN3;
            String str = z6.y5;
            z6 z6Var = z6.f6868ut;
            this.y = bundle.getInt(str, z6Var.y);
            this.n3 = bundle.getInt(z6.xg, z6Var.f6883v);
            this.zn = bundle.getInt(z6.dm, z6Var.f6876fb);
            this.f6890gv = bundle.getInt(z6.ct, z6Var.f6881s);
            this.f6899v = bundle.getInt(z6.o4, z6Var.f6875f);
            this.f6885a = bundle.getInt(z6.rs, z6Var.f6882t);
            this.f6889fb = bundle.getInt(z6.f6857eb, z6Var.w);
            this.f6896s = bundle.getInt(z6.f6862lc, z6Var.f6879p);
            this.f6886c5 = bundle.getInt(z6.f6864nf, z6Var.f6872co);
            this.f6892i9 = bundle.getInt(z6.f6865ra, z6Var.z);
            this.f6888f = bundle.getBoolean(z6.f6856e, z6Var.f6880r);
            this.f6897t = k4.r.mg((String[]) g4.c5.y(bundle.getStringArray(z6.s8), new String[0]));
            this.f6898tl = bundle.getInt(z6.f6858g, z6Var.n);
            this.f6900wz = rz((String[]) g4.c5.y(bundle.getStringArray(z6.f6860k), new String[0]));
            this.f6902xc = bundle.getInt(z6.f7, z6Var.d0);
            this.w = bundle.getInt(z6.f6854ap, z6Var.fh);
            this.f6894p = bundle.getInt(z6.f6870yg, z6Var.f6873d);
            this.f6893mt = k4.r.mg((String[]) g4.c5.y(bundle.getStringArray(z6.f6869yc), new String[0]));
            this.f6887co = rz((String[]) g4.c5.y(bundle.getStringArray(z6.en), new String[0]));
            this.z = bundle.getInt(z6.jz, z6Var.f6871b);
            this.f6895r = bundle.getInt(z6.f6867u0, z6Var.f6877hw);
            this.f6901x4 = bundle.getBoolean(z6.u, z6Var.f6878j5);
            this.f6891i4 = bundle.getBoolean(z6.f6861kp, z6Var.qn);
            this.f3 = bundle.getBoolean(z6.f6866rb, z6Var.o);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(z6.f6859g3);
            if (parcelableArrayList == null) {
                rVarN3 = k4.r.yt();
            } else {
                rVarN3 = v0.gv.n3(ta.f6754f, parcelableArrayList);
            }
            this.n = new HashMap<>();
            for (int i = 0; i < rVarN3.size(); i++) {
                ta taVar = (ta) rVarN3.get(i);
                this.n.put(taVar.y, taVar);
            }
            int[] iArr = (int[]) g4.c5.y(bundle.getIntArray(z6.f6863m), new int[0]);
            this.c = new HashSet<>();
            for (int i5 : iArr) {
                this.c.add(Integer.valueOf(i5));
            }
        }
    }
}
