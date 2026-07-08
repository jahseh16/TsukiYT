package ft;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import ft.s;

/* JADX INFO: loaded from: classes.dex */
public final class uo implements s {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f5060fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f5061v;
    public final float y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final uo f5058s = new uo(1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5057f = v0.ut.g3(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f5059t = v0.ut.g3(1);
    public static final s.y<uo> w = new s.y() { // from class: ft.br
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return uo.zn(bundle);
        }
    };

    public uo(float f3) {
        this(f3, 1.0f);
    }

    public static /* synthetic */ uo zn(Bundle bundle) {
        return new uo(bundle.getFloat(f5057f, 1.0f), bundle.getFloat(f5059t, 1.0f));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uo.class != obj.getClass()) {
            return false;
        }
        uo uoVar = (uo) obj;
        return this.y == uoVar.y && this.f5061v == uoVar.f5061v;
    }

    @CheckResult
    public uo gv(float f3) {
        return new uo(f3, this.f5061v);
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.y)) * 31) + Float.floatToRawIntBits(this.f5061v);
    }

    public long n3(long j) {
        return j * ((long) this.f5060fb);
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f5057f, this.y);
        bundle.putFloat(f5059t, this.f5061v);
        return bundle;
    }

    public String toString() {
        return v0.ut.rz("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.y), Float.valueOf(this.f5061v));
    }

    public uo(float f3, float f4) {
        v0.y.y(f3 > 0.0f);
        v0.y.y(f4 > 0.0f);
        this.y = f3;
        this.f5061v = f4;
        this.f5060fb = Math.round(f3 * 1000.0f);
    }
}
