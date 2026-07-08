package ft;

import android.os.Bundle;
import androidx.annotation.Nullable;
import ft.gi;
import ft.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gi implements s {
    public final k4.r<y> y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final gi f4815v = new gi(k4.r.yt());

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final String f4813fb = v0.ut.g3(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s.y<gi> f4814s = new s.y() { // from class: ft.sw
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return gi.v(bundle);
        }
    };

    public static final class y implements s {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean[] f4819f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final boolean f4820fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int[] f4821s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final ur.rs f4822v;
        public final int y;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f4818t = v0.ut.g3(0);
        public static final String w = v0.ut.g3(1);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f4817p = v0.ut.g3(3);

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public static final String f4816co = v0.ut.g3(4);
        public static final s.y<y> z = new s.y() { // from class: ft.v1
            @Override // ft.s.y
            public final s fromBundle(Bundle bundle) {
                return gi.y.i9(bundle);
            }
        };

        public y(ur.rs rsVar, boolean z5, int[] iArr, boolean[] zArr) {
            int i = rsVar.y;
            this.y = i;
            boolean z7 = false;
            v0.y.y(i == iArr.length && i == zArr.length);
            this.f4822v = rsVar;
            if (z5 && i > 1) {
                z7 = true;
            }
            this.f4820fb = z7;
            this.f4821s = (int[]) iArr.clone();
            this.f4819f = (boolean[]) zArr.clone();
        }

        public static /* synthetic */ y i9(Bundle bundle) {
            ur.rs rsVar = (ur.rs) ur.rs.f8634p.fromBundle((Bundle) v0.y.v(bundle.getBundle(f4818t)));
            return new y(rsVar, bundle.getBoolean(f4816co, false), (int[]) g4.c5.y(bundle.getIntArray(w), new int[rsVar.y]), (boolean[]) g4.c5.y(bundle.getBooleanArray(f4817p), new boolean[rsVar.y]));
        }

        public boolean a() {
            return n4.y.n3(this.f4819f, true);
        }

        public boolean c5(int i, boolean z5) {
            int i5 = this.f4821s[i];
            return i5 == 4 || (z5 && i5 == 3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || y.class != obj.getClass()) {
                return false;
            }
            y yVar = (y) obj;
            return this.f4820fb == yVar.f4820fb && this.f4822v.equals(yVar.f4822v) && Arrays.equals(this.f4821s, yVar.f4821s) && Arrays.equals(this.f4819f, yVar.f4819f);
        }

        public boolean fb(int i) {
            return this.f4819f[i];
        }

        public int gv() {
            return this.f4822v.f8637fb;
        }

        public int hashCode() {
            return (((((this.f4822v.hashCode() * 31) + (this.f4820fb ? 1 : 0)) * 31) + Arrays.hashCode(this.f4821s)) * 31) + Arrays.hashCode(this.f4819f);
        }

        public ur.rs n3() {
            return this.f4822v;
        }

        public boolean s(int i) {
            return c5(i, false);
        }

        @Override // ft.s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f4818t, this.f4822v.toBundle());
            bundle.putIntArray(w, this.f4821s);
            bundle.putBooleanArray(f4817p, this.f4819f);
            bundle.putBoolean(f4816co, this.f4820fb);
            return bundle;
        }

        public boolean v() {
            return this.f4820fb;
        }

        public g zn(int i) {
            return this.f4822v.zn(i);
        }
    }

    public gi(List<y> list) {
        this.y = k4.r.rz(list);
    }

    public static /* synthetic */ gi v(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f4813fb);
        return new gi(parcelableArrayList == null ? k4.r.yt() : v0.gv.n3(y.z, parcelableArrayList));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gi.class != obj.getClass()) {
            return false;
        }
        return this.y.equals(((gi) obj).y);
    }

    public boolean gv(int i) {
        for (int i5 = 0; i5 < this.y.size(); i5++) {
            y yVar = this.y.get(i5);
            if (yVar.a() && yVar.gv() == i) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public k4.r<y> n3() {
        return this.y;
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f4813fb, v0.gv.gv(this.y));
        return bundle;
    }

    public boolean zn() {
        return this.y.isEmpty();
    }
}
