package g4;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static String gv(String str) {
        return wz.zn(str);
    }

    public static String n3(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i5 = 0; i5 < objArr.length; i5++) {
                objArr[i5] = zn(objArr[i5]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i8 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i8)) != -1) {
            sb.append((CharSequence) strValueOf, i8, iIndexOf);
            sb.append(objArr[i]);
            i8 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i8, strValueOf.length());
        if (i < objArr.length) {
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

    public static String y(String str) {
        return wz.y(str);
    }

    public static String zn(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e4) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            String string = sb.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(string);
            logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e4);
            String name2 = e4.getClass().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 9 + name2.length());
            sb2.append("<");
            sb2.append(string);
            sb2.append(" threw ");
            sb2.append(name2);
            sb2.append(">");
            return sb2.toString();
        }
    }
}
