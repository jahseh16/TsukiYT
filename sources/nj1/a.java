package nj1;

import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6945a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final boolean f6946c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6947f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final String f6948fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final boolean f6949gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final String f6950i9;
    public final boolean n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f6951s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f6952t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f6953v;
    public final boolean y;
    public final boolean zn;

    public a(boolean z, boolean z5, boolean z7, boolean z8, boolean z9, boolean z10, String prettyPrintIndent, boolean z11, boolean z12, String classDiscriminator, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        this.y = z;
        this.n3 = z5;
        this.zn = z7;
        this.f6949gv = z8;
        this.f6953v = z9;
        this.f6945a = z10;
        this.f6948fb = prettyPrintIndent;
        this.f6951s = z11;
        this.f6946c5 = z12;
        this.f6950i9 = classDiscriminator;
        this.f6947f = z13;
        this.f6952t = z14;
    }

    public final boolean a() {
        return this.f6945a;
    }

    public final String c5() {
        return this.f6948fb;
    }

    public final boolean f() {
        return this.f6946c5;
    }

    public final boolean fb() {
        return this.n3;
    }

    public final boolean gv() {
        return this.f6951s;
    }

    public final boolean i9() {
        return this.f6952t;
    }

    public final boolean n3() {
        return this.f6949gv;
    }

    public final boolean s() {
        return this.f6953v;
    }

    public final boolean t() {
        return this.zn;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.y + ", ignoreUnknownKeys=" + this.n3 + ", isLenient=" + this.zn + ", allowStructuredMapKeys=" + this.f6949gv + ", prettyPrint=" + this.f6953v + ", explicitNulls=" + this.f6945a + ", prettyPrintIndent='" + this.f6948fb + "', coerceInputValues=" + this.f6951s + ", useArrayPolymorphism=" + this.f6946c5 + ", classDiscriminator='" + this.f6950i9 + "', allowSpecialFloatingPointValues=" + this.f6947f + ')';
    }

    public final boolean v() {
        return this.y;
    }

    public final boolean y() {
        return this.f6947f;
    }

    public final String zn() {
        return this.f6950i9;
    }

    public /* synthetic */ a(boolean z, boolean z5, boolean z7, boolean z8, boolean z9, boolean z10, String str, boolean z11, boolean z12, String str2, boolean z13, boolean z14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z5, (i & 4) != 0 ? false : z7, (i & 8) != 0 ? false : z8, (i & 16) != 0 ? false : z9, (i & 32) != 0 ? true : z10, (i & 64) != 0 ? "    " : str, (i & 128) != 0 ? false : z11, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? false : z12, (i & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? "type" : str2, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 ? z13 : false, (i & 2048) == 0 ? z14 : true);
    }
}
