package ft;

import android.os.Bundle;
import androidx.annotation.Nullable;
import ft.s;

/* JADX INFO: loaded from: classes.dex */
public final class vh extends jr {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5062f = v0.ut.g3(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f5063t = v0.ut.g3(2);
    public static final s.y<vh> w = new s.y() { // from class: ft.cx
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return vh.gv(bundle);
        }
    };

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f5064fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f5065s;

    public vh() {
        this.f5064fb = false;
        this.f5065s = false;
    }

    public static vh gv(Bundle bundle) {
        v0.y.y(bundle.getInt(jr.y, -1) == 3);
        return bundle.getBoolean(f5062f, false) ? new vh(bundle.getBoolean(f5063t, false)) : new vh();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) obj;
        return this.f5065s == vhVar.f5065s && this.f5064fb == vhVar.f5064fb;
    }

    public int hashCode() {
        return g4.f.n3(Boolean.valueOf(this.f5064fb), Boolean.valueOf(this.f5065s));
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(jr.y, 3);
        bundle.putBoolean(f5062f, this.f5064fb);
        bundle.putBoolean(f5063t, this.f5065s);
        return bundle;
    }

    public vh(boolean z) {
        this.f5064fb = true;
        this.f5065s = z;
    }
}
