package com.google.gson.internal;

/* JADX INFO: loaded from: classes.dex */
public final class JavaVersion {
    public static final int y = y();

    public static int getMajorJavaVersion() {
        return y;
    }

    public static int gv(String str) {
        int iZn = zn(str);
        if (iZn == -1) {
            iZn = n3(str);
        }
        if (iZn == -1) {
            return 6;
        }
        return iZn;
    }

    public static boolean isJava9OrLater() {
        return y >= 9;
    }

    public static int n3(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int y() {
        return gv(System.getProperty("java.version"));
    }

    public static int zn(String str) {
        try {
            String[] strArrSplit = str.split("[._]", 3);
            int i = Integer.parseInt(strArrSplit[0]);
            return (i != 1 || strArrSplit.length <= 1) ? i : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
