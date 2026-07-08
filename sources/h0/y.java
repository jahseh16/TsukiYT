package h0;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import b0.c5;
import b0.n3;
import b0.s;
import g4.v;
import h0.zn;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class y extends s {
    public static final Pattern z = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public float f5250co;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public float f5251mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map<String, zn> f5252p;

    @Nullable
    public final n3 w;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final boolean f5253xc;

    public y(@Nullable List<byte[]> list) {
        super("SsaDecoder");
        this.f5251mt = -3.4028235E38f;
        this.f5250co = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f5253xc = false;
            this.w = null;
            return;
        }
        this.f5253xc = true;
        String strMg = ut.mg(list.get(0));
        v0.y.y(strMg.startsWith("Format:"));
        this.w = (n3) v0.y.v(n3.y(strMg));
        ej(new d(list.get(1)), v.zn);
    }

    public static Map<String, zn> a8(d dVar, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zn.y yVarY = null;
        while (true) {
            String strZ = dVar.z(charset);
            if (strZ == null || (dVar.y() != 0 && dVar.s(charset) == '[')) {
                break;
            }
            if (strZ.startsWith("Format:")) {
                yVarY = zn.y.y(strZ);
            } else if (strZ.startsWith("Style:")) {
                if (yVarY == null) {
                    r.c5("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + strZ);
                } else {
                    zn znVarN3 = zn.n3(strZ, yVarY);
                    if (znVarN3 != null) {
                        linkedHashMap.put(znVarN3.y, znVarN3);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static int b(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                r.c5("SsaDecoder", "Unknown alignment: " + i);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static int fh(long j, List<Long> list, List<List<b0.n3>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }

    public static int k5(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                r.c5("SsaDecoder", "Unknown alignment: " + i);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static b0.n3 mg(String str, @Nullable zn znVar, zn.n3 n3Var, float f3, float f4) {
        SpannableString spannableString = new SpannableString(str);
        n3.C0034n3 c0034n3Xc = new n3.C0034n3().xc(spannableString);
        if (znVar != null) {
            if (znVar.zn != null) {
                spannableString.setSpan(new ForegroundColorSpan(znVar.zn.intValue()), 0, spannableString.length(), 33);
            }
            if (znVar.f5258i9 == 3 && znVar.f5257gv != null) {
                spannableString.setSpan(new BackgroundColorSpan(znVar.f5257gv.intValue()), 0, spannableString.length(), 33);
            }
            float f5 = znVar.f5260v;
            if (f5 != -3.4028235E38f && f4 != -3.4028235E38f) {
                c0034n3Xc.p(f5 / f4, 1);
            }
            boolean z5 = znVar.f5254a;
            if (z5 && znVar.f5256fb) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z5) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (znVar.f5256fb) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (znVar.f5259s) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (znVar.f5255c5) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = n3Var.y;
        if (i == -1) {
            i = znVar != null ? znVar.n3 : -1;
        }
        c0034n3Xc.w(yt(i)).t(k5(i)).c5(b(i));
        PointF pointF = n3Var.n3;
        if (pointF == null || f4 == -3.4028235E38f || f3 == -3.4028235E38f) {
            c0034n3Xc.f(rz(c0034n3Xc.gv()));
            c0034n3Xc.s(rz(c0034n3Xc.zn()), 0);
        } else {
            c0034n3Xc.f(pointF.x / f3);
            c0034n3Xc.s(n3Var.n3.y / f4, 0);
        }
        return c0034n3Xc.y();
    }

    public static float rz(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static long x(String str) {
        Matcher matcher = z.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) ut.i9(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) ut.i9(matcher.group(2))) * 60000000) + (Long.parseLong((String) ut.i9(matcher.group(3))) * 1000000) + (Long.parseLong((String) ut.i9(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    @Nullable
    public static Layout.Alignment yt(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                r.c5("SsaDecoder", "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // b0.s
    public c5 c(byte[] bArr, int i, boolean z5) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        d dVar = new d(bArr, i);
        Charset charsetTa = ta(dVar);
        if (!this.f5253xc) {
            ej(dVar, charsetTa);
        }
        z6(dVar, arrayList, arrayList2, charsetTa);
        return new gv(arrayList, arrayList2);
    }

    public final void d(String str, n3 n3Var, List<List<b0.n3>> list, List<Long> list2) {
        int i;
        v0.y.y(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", n3Var.f5249v);
        if (strArrSplit.length != n3Var.f5249v) {
            r.c5("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jX = x(strArrSplit[n3Var.y]);
        if (jX == -9223372036854775807L) {
            r.c5("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long jX2 = x(strArrSplit[n3Var.n3]);
        if (jX2 == -9223372036854775807L) {
            r.c5("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, zn> map = this.f5252p;
        zn znVar = (map == null || (i = n3Var.zn) == -1) ? null : map.get(strArrSplit[i].trim());
        String str2 = strArrSplit[n3Var.f5248gv];
        b0.n3 n3VarMg = mg(zn.n3.gv(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), znVar, zn.n3.n3(str2), this.f5251mt, this.f5250co);
        int iFh = fh(jX2, list2, list);
        for (int iFh2 = fh(jX, list2, list); iFh2 < iFh; iFh2++) {
            list.get(iFh2).add(n3VarMg);
        }
    }

    public final void ej(d dVar, Charset charset) {
        while (true) {
            String strZ = dVar.z(charset);
            if (strZ == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZ)) {
                ud(dVar, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZ)) {
                this.f5252p = a8(dVar, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strZ)) {
                r.a("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZ)) {
                return;
            }
        }
    }

    public final Charset ta(d dVar) {
        Charset charsetHw = dVar.hw();
        return charsetHw != null ? charsetHw : v.zn;
    }

    public final void ud(d dVar, Charset charset) {
        while (true) {
            String strZ = dVar.z(charset);
            if (strZ == null) {
                return;
            }
            if (dVar.y() != 0 && dVar.s(charset) == '[') {
                return;
            }
            String[] strArrSplit = strZ.split(":");
            if (strArrSplit.length == 2) {
                String strV = g4.zn.v(strArrSplit[0].trim());
                strV.hashCode();
                if (strV.equals("playresx")) {
                    this.f5251mt = Float.parseFloat(strArrSplit[1].trim());
                } else if (strV.equals("playresy")) {
                    try {
                        this.f5250co = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    public final void z6(d dVar, List<List<b0.n3>> list, List<Long> list2, Charset charset) {
        n3 n3VarY = this.f5253xc ? this.w : null;
        while (true) {
            String strZ = dVar.z(charset);
            if (strZ == null) {
                return;
            }
            if (strZ.startsWith("Format:")) {
                n3VarY = n3.y(strZ);
            } else if (strZ.startsWith("Dialogue:")) {
                if (n3VarY == null) {
                    r.c5("SsaDecoder", "Skipping dialogue line before complete format: " + strZ);
                } else {
                    d(strZ, n3VarY, list, list2);
                }
            }
        }
    }
}
