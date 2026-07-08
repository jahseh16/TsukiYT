package ur;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lc implements ft.s {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f8606fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k4.r<rs> f8607v;
    public final int y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final lc f8604s = new lc(new rs[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f8603f = v0.ut.g3(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s.y<lc> f8605t = new s.y() { // from class: ur.eb
        @Override // ft.s.y
        public final ft.s fromBundle(Bundle bundle) {
            return lc.v(bundle);
        }
    };

    public lc(rs... rsVarArr) {
        this.f8607v = k4.r.mg(rsVarArr);
        this.y = rsVarArr.length;
        a();
    }

    private void a() {
        int i = 0;
        while (i < this.f8607v.size()) {
            int i5 = i + 1;
            for (int i8 = i5; i8 < this.f8607v.size(); i8++) {
                if (this.f8607v.get(i).equals(this.f8607v.get(i8))) {
                    v0.r.gv("TrackGroupArray", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i5;
        }
    }

    public static /* synthetic */ lc v(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f8603f);
        return parcelableArrayList == null ? new lc(new rs[0]) : new lc((rs[]) v0.gv.n3(rs.f8634p, parcelableArrayList).toArray(new rs[0]));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lc.class != obj.getClass()) {
            return false;
        }
        lc lcVar = (lc) obj;
        return this.y == lcVar.y && this.f8607v.equals(lcVar.f8607v);
    }

    public boolean gv() {
        return this.y == 0;
    }

    public int hashCode() {
        if (this.f8606fb == 0) {
            this.f8606fb = this.f8607v.hashCode();
        }
        return this.f8606fb;
    }

    public rs n3(int i) {
        return this.f8607v.get(i);
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f8603f, v0.gv.gv(this.f8607v));
        return bundle;
    }

    public int zn(rs rsVar) {
        int iIndexOf = this.f8607v.indexOf(rsVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }
}
