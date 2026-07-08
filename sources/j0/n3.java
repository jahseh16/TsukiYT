package j0;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import k4.n;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public final int n3;
    public final int y;
    public final int zn;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final Pattern f5782gv = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n<String> f5784v = n.b("auto", "none");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n<String> f5780a = n.yt("dot", "sesame", "circle");

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final n<String> f5781fb = n.b("filled", "open");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n<String> f5783s = n.yt("after", "before", "outside");

    public n3(int i, int i5, int i8) {
        this.y = i;
        this.n3 = i5;
        this.zn = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j0.n3 n3(k4.n<java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.n3.n3(k4.n):j0.n3");
    }

    @Nullable
    public static n3 y(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String strV = g4.zn.v(str.trim());
        if (strV.isEmpty()) {
            return null;
        }
        return n3(n.c(TextUtils.split(strV, f5782gv)));
    }
}
