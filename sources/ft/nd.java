package ft;

import android.os.Bundle;
import androidx.annotation.Nullable;
import ft.s;

/* JADX INFO: loaded from: classes.dex */
public final class nd extends jr {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final float f4945fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f4944s = v0.ut.g3(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s.y<nd> f4943f = new s.y() { // from class: ft.wm
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return nd.gv(bundle);
        }
    };

    public nd() {
        this.f4945fb = -1.0f;
    }

    public static nd gv(Bundle bundle) {
        v0.y.y(bundle.getInt(jr.y, -1) == 1);
        float f3 = bundle.getFloat(f4944s, -1.0f);
        return f3 == -1.0f ? new nd() : new nd(f3);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof nd) && this.f4945fb == ((nd) obj).f4945fb;
    }

    public int hashCode() {
        return g4.f.n3(Float.valueOf(this.f4945fb));
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(jr.y, 1);
        bundle.putFloat(f4944s, this.f4945fb);
        return bundle;
    }

    public nd(float f3) {
        v0.y.n3(f3 >= 0.0f && f3 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f4945fb = f3;
    }
}
