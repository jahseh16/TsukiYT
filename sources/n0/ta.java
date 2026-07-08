package n0;

import android.os.Bundle;
import androidx.annotation.Nullable;
import ft.s;
import java.util.Collections;
import java.util.List;
import ur.rs;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class ta implements ft.s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k4.r<Integer> f6757v;
    public final rs y;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final String f6755fb = ut.g3(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f6756s = ut.g3(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s.y<ta> f6754f = new s.y() { // from class: n0.mg
        @Override // ft.s.y
        public final ft.s fromBundle(Bundle bundle) {
            return ta.zn(bundle);
        }
    };

    public ta(rs rsVar, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= rsVar.y)) {
            throw new IndexOutOfBoundsException();
        }
        this.y = rsVar;
        this.f6757v = k4.r.rz(list);
    }

    public static /* synthetic */ ta zn(Bundle bundle) {
        return new ta((rs) rs.f8634p.fromBundle((Bundle) v0.y.v(bundle.getBundle(f6755fb))), n4.a.zn((int[]) v0.y.v(bundle.getIntArray(f6756s))));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ta.class != obj.getClass()) {
            return false;
        }
        ta taVar = (ta) obj;
        return this.y.equals(taVar.y) && this.f6757v.equals(taVar.f6757v);
    }

    public int hashCode() {
        return this.y.hashCode() + (this.f6757v.hashCode() * 31);
    }

    public int n3() {
        return this.y.f8637fb;
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f6755fb, this.y.toBundle());
        bundle.putIntArray(f6756s, n4.a.wz(this.f6757v));
        return bundle;
    }
}
