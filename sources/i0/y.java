package i0;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import b0.c5;
import b0.s;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import g4.v;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0.d;
import v0.r;
import v0.x4;

/* JADX INFO: loaded from: classes.dex */
public final class y extends s {
    public final ArrayList<String> w;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final StringBuilder f5434xc;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f5433p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public static final Pattern f5432mt = Pattern.compile("\\{\\\\.*?\\}");

    public y() {
        super("SubripDecoder");
        this.f5434xc = new StringBuilder();
        this.w = new ArrayList<>();
    }

    public static float mg(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private Charset rz(d dVar) {
        Charset charsetHw = dVar.hw();
        return charsetHw != null ? charsetHw : v.zn;
    }

    public static long ta(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) v0.y.v(matcher.group(i + 2))) * 60000) + (Long.parseLong((String) v0.y.v(matcher.group(i + 3))) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    @Override // b0.s
    public c5 c(byte[] bArr, int i, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        x4 x4Var = new x4();
        d dVar = new d(bArr, i);
        Charset charsetRz = rz(dVar);
        while (true) {
            String strZ = dVar.z(charsetRz);
            int i5 = 0;
            if (strZ == null) {
                break;
            }
            if (strZ.length() != 0) {
                try {
                    Integer.parseInt(strZ);
                    String strZ2 = dVar.z(charsetRz);
                    if (strZ2 == null) {
                        r.c5("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f5433p.matcher(strZ2);
                    if (matcher.matches()) {
                        x4Var.y(ta(matcher, 1));
                        x4Var.y(ta(matcher, 6));
                        this.f5434xc.setLength(0);
                        this.w.clear();
                        for (String strZ3 = dVar.z(charsetRz); !TextUtils.isEmpty(strZ3); strZ3 = dVar.z(charsetRz)) {
                            if (this.f5434xc.length() > 0) {
                                this.f5434xc.append("<br>");
                            }
                            this.f5434xc.append(d(strZ3, this.w));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f5434xc.toString());
                        while (true) {
                            if (i5 >= this.w.size()) {
                                str = null;
                                break;
                            }
                            str = this.w.get(i5);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i5++;
                        }
                        arrayList.add(fh(spannedFromHtml, str));
                        arrayList.add(b0.n3.f1194ej);
                    } else {
                        r.c5("SubripDecoder", "Skipping invalid timing: " + strZ2);
                    }
                } catch (NumberFormatException unused) {
                    r.c5("SubripDecoder", "Skipping invalid index: " + strZ);
                }
            }
        }
        return new n3((b0.n3[]) arrayList.toArray(new b0.n3[0]), x4Var.gv());
    }

    public final String d(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = f5432mt.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
            i += length;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b0.n3 fh(android.text.Spanned r17, @androidx.annotation.Nullable java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.y.fh(android.text.Spanned, java.lang.String):b0.n3");
    }
}
