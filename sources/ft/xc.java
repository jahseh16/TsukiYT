package ft;

import android.os.Bundle;
import androidx.annotation.Nullable;
import ft.s;

/* JADX INFO: loaded from: classes.dex */
public final class xc implements s {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f5146fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5147v;
    public final int y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final xc f5144s = new xc(0, 0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5142f = v0.ut.g3(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f5145t = v0.ut.g3(1);
    public static final String w = v0.ut.g3(2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s.y<xc> f5143p = new s.y() { // from class: ft.wz
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return xc.n3(bundle);
        }
    };

    public xc(int i, int i5, int i8) {
        this.y = i;
        this.f5147v = i5;
        this.f5146fb = i8;
    }

    public static /* synthetic */ xc n3(Bundle bundle) {
        return new xc(bundle.getInt(f5142f, 0), bundle.getInt(f5145t, 0), bundle.getInt(w, 0));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc)) {
            return false;
        }
        xc xcVar = (xc) obj;
        return this.y == xcVar.y && this.f5147v == xcVar.f5147v && this.f5146fb == xcVar.f5146fb;
    }

    public int hashCode() {
        return ((((527 + this.y) * 31) + this.f5147v) * 31) + this.f5146fb;
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f5142f, this.y);
        bundle.putInt(f5145t, this.f5147v);
        bundle.putInt(w, this.f5146fb);
        return bundle;
    }
}
