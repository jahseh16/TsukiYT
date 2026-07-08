package h2;

import android.annotation.TargetApi;
import android.icu.util.TimeZone;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class xc {
    public static AtomicReference<f> y = new AtomicReference<>();

    public static DateFormat a(Locale locale) {
        return v(0, locale);
    }

    public static Calendar c5() {
        Calendar calendarY = fb().y();
        calendarY.set(11, 0);
        calendarY.set(12, 0);
        calendarY.set(13, 0);
        calendarY.set(14, 0);
        calendarY.setTimeZone(s());
        return calendarY;
    }

    public static Calendar f() {
        return t(null);
    }

    public static f fb() {
        f fVar = y.get();
        return fVar == null ? f.zn() : fVar;
    }

    public static Calendar gv(Calendar calendar) {
        Calendar calendarT = t(calendar);
        Calendar calendarF = f();
        calendarF.set(calendarT.get(1), calendarT.get(2), calendarT.get(5));
        return calendarF;
    }

    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    public static TimeZone i9() {
        return TimeZone.getTimeZone("UTC");
    }

    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    public static android.icu.text.DateFormat n3(Locale locale) {
        return zn("MMMEd", locale);
    }

    public static java.util.TimeZone s() {
        return java.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar t(@Nullable Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(s());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    public static android.icu.text.DateFormat tl(Locale locale) {
        return zn("yMMMEd", locale);
    }

    public static DateFormat v(int i, Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(s());
        return dateInstance;
    }

    public static long y(long j) {
        Calendar calendarF = f();
        calendarF.setTimeInMillis(j);
        return gv(calendarF).getTimeInMillis();
    }

    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    public static android.icu.text.DateFormat zn(String str, Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(i9());
        return instanceForSkeleton;
    }
}
