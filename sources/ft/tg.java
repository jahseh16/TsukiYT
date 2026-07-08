package ft;

import android.os.Bundle;
import androidx.annotation.Nullable;
import ft.s;

/* JADX INFO: loaded from: classes.dex */
public final class tg extends jr {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5047f = v0.ut.g3(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f5048t = v0.ut.g3(2);
    public static final s.y<tg> w = new s.y() { // from class: ft.y4
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return tg.gv(bundle);
        }
    };

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f5049fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f5050s;

    public tg() {
        this.f5049fb = false;
        this.f5050s = false;
    }

    public static tg gv(Bundle bundle) {
        v0.y.y(bundle.getInt(jr.y, -1) == 0);
        return bundle.getBoolean(f5047f, false) ? new tg(bundle.getBoolean(f5048t, false)) : new tg();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        return this.f5050s == tgVar.f5050s && this.f5049fb == tgVar.f5049fb;
    }

    public int hashCode() {
        return g4.f.n3(Boolean.valueOf(this.f5049fb), Boolean.valueOf(this.f5050s));
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(jr.y, 0);
        bundle.putBoolean(f5047f, this.f5049fb);
        bundle.putBoolean(f5048t, this.f5050s);
        return bundle;
    }

    public tg(boolean z) {
        this.f5049fb = true;
        this.f5050s = z;
    }
}
