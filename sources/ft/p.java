package ft;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import ft.s;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends bv {
    final boolean isRecoverable;

    @Nullable
    public final ur.fh mediaPeriodId;

    @Nullable
    public final g rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;

    @Nullable
    public final String rendererName;
    public final int type;
    public static final s.y<p> w = new s.y() { // from class: ft.w
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return p.p(bundle);
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f4970p = v0.ut.g3(1001);

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final String f4969co = v0.ut.g3(1002);
    public static final String z = v0.ut.g3(1003);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f4971r = v0.ut.g3(1004);
    public static final String f3 = v0.ut.g3(1005);
    public static final String n = v0.ut.g3(1006);

    public p(int i, Throwable th, int i5) {
        this(i, th, null, i5, null, -1, null, 4, false);
    }

    public static String c(int i, @Nullable String str, @Nullable String str2, int i5, @Nullable g gVar, int i8) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i5 + ", format=" + gVar + ", format_supported=" + v0.ut.f7(i8);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @Deprecated
    public static p f3(RuntimeException runtimeException) {
        return n(runtimeException, 1000);
    }

    public static p n(RuntimeException runtimeException, int i) {
        return new p(2, runtimeException, i);
    }

    public static /* synthetic */ p p(Bundle bundle) {
        return new p(bundle);
    }

    public static p r(IOException iOException, int i) {
        return new p(0, iOException, i);
    }

    public static p z(Throwable th, String str, int i, @Nullable g gVar, int i5, boolean z5, int i8) {
        return new p(1, th, null, i8, str, i, gVar, gVar == null ? 4 : i5, z5);
    }

    @CheckResult
    public p co(@Nullable ur.fh fhVar) {
        return new p((String) v0.ut.i9(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, fhVar, this.timestampMs, this.isRecoverable);
    }

    public IOException rz() {
        v0.y.fb(this.type == 0);
        return (IOException) v0.y.v(getCause());
    }

    @Override // ft.bv, ft.s
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(f4970p, this.type);
        bundle.putString(f4969co, this.rendererName);
        bundle.putInt(z, this.rendererIndex);
        g gVar = this.rendererFormat;
        if (gVar != null) {
            bundle.putBundle(f4971r, gVar.toBundle());
        }
        bundle.putInt(f3, this.rendererFormatSupport);
        bundle.putBoolean(n, this.isRecoverable);
        return bundle;
    }

    public p(int i, @Nullable Throwable th, @Nullable String str, int i5, @Nullable String str2, int i8, @Nullable g gVar, int i10, boolean z5) {
        this(c(i, str, str2, i8, gVar, i10), th, i5, i, str2, i8, gVar, i10, null, SystemClock.elapsedRealtime(), z5);
    }

    public p(Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(f4970p, 2);
        this.rendererName = bundle.getString(f4969co);
        this.rendererIndex = bundle.getInt(z, -1);
        Bundle bundle2 = bundle.getBundle(f4971r);
        this.rendererFormat = bundle2 == null ? null : (g) g.f4765l.fromBundle(bundle2);
        this.rendererFormatSupport = bundle.getInt(f3, 4);
        this.isRecoverable = bundle.getBoolean(n, false);
        this.mediaPeriodId = null;
    }

    public p(String str, @Nullable Throwable th, int i, int i5, @Nullable String str2, int i8, @Nullable g gVar, int i10, @Nullable ur.fh fhVar, long j, boolean z5) {
        super(str, th, i, j);
        v0.y.y(!z5 || i5 == 1);
        v0.y.y(th != null || i5 == 3);
        this.type = i5;
        this.rendererName = str2;
        this.rendererIndex = i8;
        this.rendererFormat = gVar;
        this.rendererFormatSupport = i10;
        this.mediaPeriodId = fhVar;
        this.isRecoverable = z5;
    }
}
