package sj1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.Reader;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7932a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final int f7933c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7934f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f7935fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f7936gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final boolean f7937i9;
    public final boolean n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f7939t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public String f7940tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f7941v;
    public final boolean y;
    public final int zn;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public static final n3 f7930wz = new n3(null);

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public static final gv f7931xc = new y().gv().y();
    public static final gv w = new y().v().zn(Reader.READ_DONE, TimeUnit.SECONDS).y();

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final sj1.gv n3(sj1.z r31) {
            /*
                Method dump skipped, instruction units count: 409
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sj1.gv.n3.n3(sj1.z):sj1.gv");
        }

        public final int y(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                int i5 = i + 1;
                if (StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i = i5;
            }
            return str.length();
        }

        public n3() {
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7942a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f7943fb;
        public boolean n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f7945s;
        public boolean y;
        public int zn = -1;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f7944gv = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f7946v = -1;

        public final y gv() {
            this.y = true;
            return this;
        }

        public final int n3(long j) {
            return j > 2147483647L ? Reader.READ_DONE : (int) j;
        }

        public final y v() {
            this.f7942a = true;
            return this;
        }

        public final gv y() {
            return new gv(this.y, this.n3, this.zn, -1, false, false, false, this.f7944gv, this.f7946v, this.f7942a, this.f7943fb, this.f7945s, null, null);
        }

        public final y zn(int i, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i < 0) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("maxStale < 0: ", Integer.valueOf(i)).toString());
            }
            this.f7944gv = n3(timeUnit.toSeconds(i));
            return this;
        }
    }

    public /* synthetic */ gv(boolean z, boolean z5, int i, int i5, boolean z7, boolean z8, boolean z9, int i8, int i10, boolean z10, boolean z11, boolean z12, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z5, i, i5, z7, z8, z9, i8, i10, z10, z11, z12, str);
    }

    public final int a() {
        return this.f7933c5;
    }

    public final boolean c5() {
        return this.n3;
    }

    public final boolean f() {
        return this.f7937i9;
    }

    public final boolean fb() {
        return this.f7935fb;
    }

    public final int gv() {
        return this.zn;
    }

    public final boolean i9() {
        return this.f7934f;
    }

    public final boolean n3() {
        return this.f7941v;
    }

    public final boolean s() {
        return this.y;
    }

    public final int t() {
        return this.f7936gv;
    }

    public String toString() {
        String str = this.f7940tl;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (s()) {
            sb.append("no-cache, ");
        }
        if (c5()) {
            sb.append("no-store, ");
        }
        if (gv() != -1) {
            sb.append("max-age=");
            sb.append(gv());
            sb.append(", ");
        }
        if (t() != -1) {
            sb.append("s-maxage=");
            sb.append(t());
            sb.append(", ");
        }
        if (n3()) {
            sb.append("private, ");
        }
        if (zn()) {
            sb.append("public, ");
        }
        if (fb()) {
            sb.append("must-revalidate, ");
        }
        if (v() != -1) {
            sb.append("max-stale=");
            sb.append(v());
            sb.append(", ");
        }
        if (a() != -1) {
            sb.append("min-fresh=");
            sb.append(a());
            sb.append(", ");
        }
        if (f()) {
            sb.append("only-if-cached, ");
        }
        if (i9()) {
            sb.append("no-transform, ");
        }
        if (y()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.f7940tl = string;
        return string;
    }

    public final int v() {
        return this.f7938s;
    }

    public final boolean y() {
        return this.f7939t;
    }

    public final boolean zn() {
        return this.f7932a;
    }

    public gv(boolean z, boolean z5, int i, int i5, boolean z7, boolean z8, boolean z9, int i8, int i10, boolean z10, boolean z11, boolean z12, String str) {
        this.y = z;
        this.n3 = z5;
        this.zn = i;
        this.f7936gv = i5;
        this.f7941v = z7;
        this.f7932a = z8;
        this.f7935fb = z9;
        this.f7938s = i8;
        this.f7933c5 = i10;
        this.f7937i9 = z10;
        this.f7934f = z11;
        this.f7939t = z12;
        this.f7940tl = str;
    }
}
