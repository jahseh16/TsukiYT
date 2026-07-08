package r0;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class fh {
    public static final Pattern y = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    public static final Pattern n3 = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long n3(@Nullable String str, @Nullable String str2) {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                v0.r.zn("HttpUtil", "Unexpected Content-Length [" + str + "]");
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = y.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j4 = (Long.parseLong((String) v0.y.v(matcher.group(2))) - Long.parseLong((String) v0.y.v(matcher.group(1)))) + 1;
            if (j < 0) {
                return j4;
            }
            if (j == j4) {
                return j;
            }
            v0.r.c5("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j, j4);
        } catch (NumberFormatException unused2) {
            v0.r.zn("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j;
        }
    }

    @Nullable
    public static String y(long j, long j4) {
        if (j == 0 && j4 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j);
        sb.append("-");
        if (j4 != -1) {
            sb.append((j + j4) - 1);
        }
        return sb.toString();
    }

    public static long zn(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = n3.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) v0.y.v(matcher.group(1)));
        }
        return -1L;
    }
}
