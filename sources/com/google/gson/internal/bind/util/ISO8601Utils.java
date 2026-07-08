package com.google.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class ISO8601Utils {
    public static final TimeZone y = TimeZone.getTimeZone("UTC");

    public static String format(Date date) {
        return format(date, false, y);
    }

    public static int gv(String str, int i, int i5) throws NumberFormatException {
        int i8;
        int i10;
        if (i < 0 || i5 > str.length() || i > i5) {
            throw new NumberFormatException(str);
        }
        if (i < i5) {
            i10 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i5));
            }
            i8 = -iDigit;
        } else {
            i8 = 0;
            i10 = i;
        }
        while (i10 < i5) {
            int i11 = i10 + 1;
            int iDigit2 = Character.digit(str.charAt(i10), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i5));
            }
            i8 = (i8 * 10) - iDigit2;
            i10 = i11;
        }
        return -i8;
    }

    public static int n3(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static boolean y(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static void zn(StringBuilder sb, int i, int i5) {
        String string = Integer.toString(i);
        for (int length = i5 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    public static String format(Date date, boolean z) {
        return format(date, z, y);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        zn(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        zn(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        zn(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        zn(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        zn(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        zn(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            zn(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            zn(sb, iAbs, 2);
            sb.append(':');
            zn(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}
