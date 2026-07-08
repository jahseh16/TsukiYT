package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class fb {
    public final String n3;
    public final Uri y;
    public final String zn;

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public static final C0021y f929gv = new C0021y(null);
        public String n3;
        public Uri y;
        public String zn;

        /* JADX INFO: renamed from: androidx.navigation.fb$y$y, reason: collision with other inner class name */
        public static final class C0021y {
            public /* synthetic */ C0021y(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final y y(Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                y yVar = new y(null);
                yVar.n3(uri);
                return yVar;
            }

            public C0021y() {
            }
        }

        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y n3(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.y = uri;
            return this;
        }

        public final fb y() {
            return new fb(this.y, this.n3, this.zn);
        }

        public y() {
        }
    }

    public fb(Uri uri, String str, String str2) {
        this.y = uri;
        this.n3 = str;
        this.zn = str2;
    }

    public String n3() {
        return this.zn;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (zn() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(zn()));
        }
        if (y() != null) {
            sb.append(" action=");
            sb.append(y());
        }
        if (n3() != null) {
            sb.append(" mimetype=");
            sb.append(n3());
        }
        sb.append(" }");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public String y() {
        return this.n3;
    }

    public Uri zn() {
        return this.y;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fb(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        Intrinsics.checkNotNullParameter(intent, "intent");
    }
}
