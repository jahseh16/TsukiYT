package h2;

import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static final f zn = new f(null, null);

    @Nullable
    public final TimeZone n3;

    @Nullable
    public final Long y;

    public f(@Nullable Long l3, @Nullable TimeZone timeZone) {
        this.y = l3;
        this.n3 = timeZone;
    }

    public static f zn() {
        return zn;
    }

    public Calendar n3(@Nullable TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l3 = this.y;
        if (l3 != null) {
            calendar.setTimeInMillis(l3.longValue());
        }
        return calendar;
    }

    public Calendar y() {
        return n3(this.n3);
    }
}
