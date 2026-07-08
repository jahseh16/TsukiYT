package b0;

import android.os.Bundle;
import ft.s;
import java.util.ArrayList;
import java.util.List;
import k4.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ft.s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f1188v;
    public final r<n3> y;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final a f1185fb = new a(r.yt(), 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f1186s = ut.g3(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1184f = ut.g3(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s.y<a> f1187t = new s.y() { // from class: b0.v
        @Override // ft.s.y
        public final ft.s fromBundle(Bundle bundle) {
            return a.zn(bundle);
        }
    };

    public a(List<n3> list, long j) {
        this.y = r.rz(list);
        this.f1188v = j;
    }

    public static r<n3> n3(List<n3> list) {
        r.y yVarN = r.n();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f1206s == null) {
                yVarN.y(list.get(i));
            }
        }
        return yVarN.f();
    }

    public static final a zn(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f1186s);
        return new a(parcelableArrayList == null ? r.yt() : v0.gv.n3(n3.dm, parcelableArrayList), bundle.getLong(f1184f));
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f1186s, v0.gv.gv(n3(this.y)));
        bundle.putLong(f1184f, this.f1188v);
        return bundle;
    }
}
