package yj1;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static final String[] n3;
    public static final y y = new y();
    public static final DateFormat[] zn;

    public static final class y extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(tj1.gv.f8210a);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        n3 = strArr;
        zn = new DateFormat[strArr.length];
    }

    public static final String n3(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String str = y.get().format(date);
        Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }

    public static final Date y(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = y.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = n3;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    int i5 = i + 1;
                    DateFormat[] dateFormatArr = zn;
                    DateFormat simpleDateFormat = dateFormatArr[i];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(n3[i], Locale.US);
                        simpleDateFormat.setTimeZone(tj1.gv.f8210a);
                        dateFormatArr[i] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                    i = i5;
                }
                Unit unit = Unit.INSTANCE;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
