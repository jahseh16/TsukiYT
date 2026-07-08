package h2;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class gv {
    public static String gv(long j) {
        return v(j, Locale.getDefault());
    }

    public static String n3(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? xc.n3(locale).format(new Date(j)) : xc.a(locale).format(new Date(j));
    }

    public static String v(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? xc.tl(locale).format(new Date(j)) : xc.a(locale).format(new Date(j));
    }

    public static String y(long j) {
        return n3(j, Locale.getDefault());
    }

    public static String zn(Context context, long j) {
        return DateUtils.formatDateTime(context, j - ((long) TimeZone.getDefault().getOffset(j)), 36);
    }
}
