package w0;

import android.os.Bundle;
import androidx.annotation.Nullable;
import ft.s;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class mg implements ft.s {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f8902fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f8903s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8904v;
    public final int y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mg f8899f = new mg(0, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f8901t = ut.g3(0);
    public static final String w = ut.g3(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f8900p = ut.g3(2);

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final String f8898co = ut.g3(3);
    public static final s.y<mg> z = new s.y() { // from class: w0.rz
        @Override // ft.s.y
        public final ft.s fromBundle(Bundle bundle) {
            return mg.n3(bundle);
        }
    };

    public mg(int i, int i5) {
        this(i, i5, 0, 1.0f);
    }

    public static /* synthetic */ mg n3(Bundle bundle) {
        return new mg(bundle.getInt(f8901t, 0), bundle.getInt(w, 0), bundle.getInt(f8900p, 0), bundle.getFloat(f8898co, 1.0f));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg)) {
            return false;
        }
        mg mgVar = (mg) obj;
        return this.y == mgVar.y && this.f8904v == mgVar.f8904v && this.f8902fb == mgVar.f8902fb && this.f8903s == mgVar.f8903s;
    }

    public int hashCode() {
        return ((((((217 + this.y) * 31) + this.f8904v) * 31) + this.f8902fb) * 31) + Float.floatToRawIntBits(this.f8903s);
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f8901t, this.y);
        bundle.putInt(w, this.f8904v);
        bundle.putInt(f8900p, this.f8902fb);
        bundle.putFloat(f8898co, this.f8903s);
        return bundle;
    }

    public mg(int i, int i5, int i8, float f3) {
        this.y = i;
        this.f8904v = i5;
        this.f8902fb = i8;
        this.f8903s = f3;
    }
}
