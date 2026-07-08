package ft;

import android.os.Bundle;
import androidx.annotation.Nullable;
import ft.s;

/* JADX INFO: loaded from: classes.dex */
public final class rv extends jr {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5038f = v0.ut.g3(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f5039t = v0.ut.g3(2);
    public static final s.y<rv> w = new s.y() { // from class: ft.i
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return rv.gv(bundle);
        }
    };

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f5040fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f5041s;

    public rv(int i) {
        v0.y.n3(i > 0, "maxStars must be a positive integer");
        this.f5040fb = i;
        this.f5041s = -1.0f;
    }

    public static rv gv(Bundle bundle) {
        v0.y.y(bundle.getInt(jr.y, -1) == 2);
        int i = bundle.getInt(f5038f, 5);
        float f3 = bundle.getFloat(f5039t, -1.0f);
        return f3 == -1.0f ? new rv(i) : new rv(i, f3);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof rv)) {
            return false;
        }
        rv rvVar = (rv) obj;
        return this.f5040fb == rvVar.f5040fb && this.f5041s == rvVar.f5041s;
    }

    public int hashCode() {
        return g4.f.n3(Integer.valueOf(this.f5040fb), Float.valueOf(this.f5041s));
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(jr.y, 2);
        bundle.putInt(f5038f, this.f5040fb);
        bundle.putFloat(f5039t, this.f5041s);
        return bundle;
    }

    public rv(int i, float f3) {
        boolean z = false;
        v0.y.n3(i > 0, "maxStars must be a positive integer");
        if (f3 >= 0.0f && f3 <= i) {
            z = true;
        }
        v0.y.n3(z, "starRating is out of range [0, maxStars]");
        this.f5040fb = i;
        this.f5041s = f3;
    }
}
