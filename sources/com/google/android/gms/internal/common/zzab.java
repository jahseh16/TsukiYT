package com.google.android.gms.internal.common;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes.dex */
@NullMarked
public final class zzab {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e4) {
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e4);
                    string = "<" + str2 + " threw " + e4.getClass().getName() + ">";
                }
            }
            objArr[i5] = string;
            i5++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i8 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i8)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i8, iIndexOf);
            sb.append(objArr[i]);
            i8 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i8, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i10 = i + 1; i10 < objArr.length; i10++) {
                sb.append(", ");
                sb.append(objArr[i10]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
