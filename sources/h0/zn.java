package h0;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n4.a;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5254a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final boolean f5255c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f5256fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public final Integer f5257gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final int f5258i9;
    public final int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f5259s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f5260v;
    public final String y;

    @Nullable
    public final Integer zn;

    public static final class n3 {

        @Nullable
        public final PointF n3;
        public final int y;
        public static final Pattern zn = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public static final Pattern f5262gv = Pattern.compile(ut.rz("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final Pattern f5263v = Pattern.compile(ut.rz("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pattern f5261a = Pattern.compile("\\\\an(\\d+)");

        public n3(int i, @Nullable PointF pointF) {
            this.y = i;
            this.n3 = pointF;
        }

        public static String gv(String str) {
            return zn.matcher(str).replaceAll(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        }

        public static n3 n3(String str) {
            Matcher matcher = zn.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) v0.y.v(matcher.group(1));
                try {
                    PointF pointFZn = zn(str2);
                    if (pointFZn != null) {
                        pointF = pointFZn;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iY = y(str2);
                    if (iY != -1) {
                        i = iY;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new n3(i, pointF);
        }

        public static int y(String str) {
            Matcher matcher = f5261a.matcher(str);
            if (matcher.find()) {
                return zn.v((String) v0.y.v(matcher.group(1)));
            }
            return -1;
        }

        @Nullable
        public static PointF zn(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f5262gv.matcher(str);
            Matcher matcher2 = f5263v.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    r.a("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) v0.y.v(strGroup)).trim()), Float.parseFloat(((String) v0.y.v(strGroup2)).trim()));
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5264a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final int f5265c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f5266f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f5267fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f5268gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final int f5269i9;
        public final int n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f5270s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f5271v;
        public final int y;
        public final int zn;

        public y(int i, int i5, int i8, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.y = i;
            this.n3 = i5;
            this.zn = i8;
            this.f5268gv = i10;
            this.f5271v = i11;
            this.f5264a = i12;
            this.f5267fb = i13;
            this.f5270s = i14;
            this.f5265c5 = i15;
            this.f5269i9 = i16;
            this.f5266f = i17;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
        @androidx.annotation.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static h0.zn.y y(java.lang.String r18) {
            /*
                Method dump skipped, instruction units count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.zn.y.y(java.lang.String):h0.zn$y");
        }
    }

    public zn(String str, int i, @Nullable Integer num, @Nullable Integer num2, float f3, boolean z, boolean z5, boolean z7, boolean z8, int i5) {
        this.y = str;
        this.n3 = i;
        this.zn = num;
        this.f5257gv = num2;
        this.f5260v = f3;
        this.f5254a = z;
        this.f5256fb = z5;
        this.f5259s = z7;
        this.f5255c5 = z8;
        this.f5258i9 = i5;
    }

    public static boolean a(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e4) {
            r.i9("SsaStyle", "Failed to parse boolean value: '" + str + "'", e4);
            return false;
        }
    }

    public static float c5(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e4) {
            r.i9("SsaStyle", "Failed to parse font size: '" + str + "'", e4);
            return -3.4028235E38f;
        }
    }

    public static int fb(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (gv(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        r.c5("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static boolean gv(int i) {
        return i == 1 || i == 3;
    }

    @Nullable
    public static zn n3(String str, y yVar) {
        v0.y.y(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i = yVar.f5266f;
        if (length != i) {
            r.c5("SsaStyle", ut.rz("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[yVar.y].trim();
            int i5 = yVar.n3;
            int iV = i5 != -1 ? v(strArrSplit[i5].trim()) : -1;
            int i8 = yVar.zn;
            Integer numS = i8 != -1 ? s(strArrSplit[i8].trim()) : null;
            int i10 = yVar.f5268gv;
            Integer numS2 = i10 != -1 ? s(strArrSplit[i10].trim()) : null;
            int i11 = yVar.f5271v;
            float fC5 = i11 != -1 ? c5(strArrSplit[i11].trim()) : -3.4028235E38f;
            int i12 = yVar.f5264a;
            boolean z = i12 != -1 && a(strArrSplit[i12].trim());
            int i13 = yVar.f5267fb;
            boolean z5 = i13 != -1 && a(strArrSplit[i13].trim());
            int i14 = yVar.f5270s;
            boolean z7 = i14 != -1 && a(strArrSplit[i14].trim());
            int i15 = yVar.f5265c5;
            boolean z8 = i15 != -1 && a(strArrSplit[i15].trim());
            int i16 = yVar.f5269i9;
            return new zn(strTrim, iV, numS, numS2, fC5, z, z5, z7, z8, i16 != -1 ? fb(strArrSplit[i16].trim()) : -1);
        } catch (RuntimeException e4) {
            r.i9("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e4);
            return null;
        }
    }

    @Nullable
    public static Integer s(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            v0.y.y(j <= 4294967295L);
            return Integer.valueOf(Color.argb(a.gv(((j >> 24) & 255) ^ 255), a.gv(j & 255), a.gv((j >> 8) & 255), a.gv((j >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            r.i9("SsaStyle", "Failed to parse color expression: '" + str + "'", e4);
            return null;
        }
    }

    public static int v(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (zn(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        r.c5("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static boolean zn(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }
}
