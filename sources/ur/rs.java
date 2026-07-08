package ur;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.g;
import ft.s;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rs implements ft.s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8636f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f8637fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g[] f8638s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f8639v;
    public final int y;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f8635t = v0.ut.g3(0);
    public static final String w = v0.ut.g3(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s.y<rs> f8634p = new s.y() { // from class: ur.o4
        @Override // ft.s.y
        public final ft.s fromBundle(Bundle bundle) {
            return rs.v(bundle);
        }
    };

    public rs(g... gVarArr) {
        this(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, gVarArr);
    }

    public static void a(String str, @Nullable String str2, @Nullable String str3, int i) {
        v0.r.gv("TrackGroup", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public static String fb(@Nullable String str) {
        return (str == null || str.equals("und")) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : str;
    }

    public static int s(int i) {
        return i | 16384;
    }

    public static /* synthetic */ rs v(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f8635t);
        return new rs(bundle.getString(w, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), (g[]) (parcelableArrayList == null ? k4.r.yt() : v0.gv.n3(g.f4765l, parcelableArrayList)).toArray(new g[0]));
    }

    public final void c5() {
        String strFb = fb(this.f8638s[0].f4782fb);
        int iS = s(this.f8638s[0].f4781f);
        int i = 1;
        while (true) {
            g[] gVarArr = this.f8638s;
            if (i >= gVarArr.length) {
                return;
            }
            if (!strFb.equals(fb(gVarArr[i].f4782fb))) {
                g[] gVarArr2 = this.f8638s;
                a("languages", gVarArr2[0].f4782fb, gVarArr2[i].f4782fb, i);
                return;
            } else {
                if (iS != s(this.f8638s[i].f4781f)) {
                    a("role flags", Integer.toBinaryString(this.f8638s[0].f4781f), Integer.toBinaryString(this.f8638s[i].f4781f), i);
                    return;
                }
                i++;
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rs.class != obj.getClass()) {
            return false;
        }
        rs rsVar = (rs) obj;
        return this.f8639v.equals(rsVar.f8639v) && Arrays.equals(this.f8638s, rsVar.f8638s);
    }

    public int gv(g gVar) {
        int i = 0;
        while (true) {
            g[] gVarArr = this.f8638s;
            if (i >= gVarArr.length) {
                return -1;
            }
            if (gVar == gVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public int hashCode() {
        if (this.f8636f == 0) {
            this.f8636f = ((527 + this.f8639v.hashCode()) * 31) + Arrays.hashCode(this.f8638s);
        }
        return this.f8636f;
    }

    @CheckResult
    public rs n3(String str) {
        return new rs(str, this.f8638s);
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f8638s.length);
        for (g gVar : this.f8638s) {
            arrayList.add(gVar.c5(true));
        }
        bundle.putParcelableArrayList(f8635t, arrayList);
        bundle.putString(w, this.f8639v);
        return bundle;
    }

    public g zn(int i) {
        return this.f8638s[i];
    }

    public rs(String str, g... gVarArr) {
        v0.y.y(gVarArr.length > 0);
        this.f8639v = str;
        this.f8638s = gVarArr;
        this.y = gVarArr.length;
        int iF = v0.n.f(gVarArr[0].f3);
        this.f8637fb = iF == -1 ? v0.n.f(gVarArr[0].f4787r) : iF;
        c5();
    }
}
