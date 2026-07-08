package hx;

import ft.q;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class i4 {
    public final long n3;
    public final long y;
    public static final i4 zn = new i4(0, -9223372036854775807L);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final Pattern f5376gv = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    public i4(long j, long j4) {
        this.y = j;
        this.n3 = j4;
    }

    public static i4 gv(String str) throws q {
        long j;
        Matcher matcher = f5376gv.matcher(str);
        com.google.android.exoplayer2.source.rtsp.s.y(matcher.matches(), str);
        String strGroup = matcher.group(1);
        com.google.android.exoplayer2.source.rtsp.s.y(strGroup != null, str);
        long j4 = ((String) ut.i9(strGroup)).equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                com.google.android.exoplayer2.source.rtsp.s.y(j >= j4, str);
            } catch (NumberFormatException e4) {
                throw q.gv(strGroup2, e4);
            }
        } else {
            j = -9223372036854775807L;
        }
        return new i4(j4, j);
    }

    public static String n3(long j) {
        return ut.rz("npt=%.3f-", Double.valueOf(j / 1000.0d));
    }

    public long y() {
        return this.n3 - this.y;
    }

    public boolean zn() {
        return this.n3 == -9223372036854775807L;
    }
}
