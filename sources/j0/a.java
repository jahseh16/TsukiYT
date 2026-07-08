package j0;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Map;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    @Nullable
    public static fb a(@Nullable fb fbVar, @Nullable String[] strArr, Map<String, fb> map) {
        int i = 0;
        if (fbVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                fb fbVar2 = new fb();
                int length = strArr.length;
                while (i < length) {
                    fbVar2.y(map.get(strArr[i]));
                    i++;
                }
                return fbVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return fbVar.y(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    fbVar.y(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return fbVar;
    }

    @Nullable
    public static gv gv(@Nullable gv gvVar, Map<String, fb> map) {
        while (gvVar != null) {
            fb fbVarA = a(gvVar.f5770a, gvVar.t(), map);
            if (fbVarA != null && fbVarA.i9() == 1) {
                return gvVar;
            }
            gvVar = gvVar.f5775i9;
        }
        return null;
    }

    public static String n3(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    @Nullable
    public static gv v(gv gvVar, Map<String, fb> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gvVar);
        while (!arrayDeque.isEmpty()) {
            gv gvVar2 = (gv) arrayDeque.pop();
            fb fbVarA = a(gvVar2.f5770a, gvVar2.t(), map);
            if (fbVarA != null && fbVarA.i9() == 3) {
                return gvVar2;
            }
            for (int iFb = gvVar2.fb() - 1; iFb >= 0; iFb--) {
                arrayDeque.push(gvVar2.a(iFb));
            }
        }
        return null;
    }

    public static void y(Spannable spannable, int i, int i5, fb fbVar, @Nullable gv gvVar, Map<String, fb> map, int i8) {
        gv gvVarV;
        fb fbVarA;
        int i10;
        if (fbVar.t() != -1) {
            spannable.setSpan(new StyleSpan(fbVar.t()), i, i5, 33);
        }
        if (fbVar.co()) {
            spannable.setSpan(new StrikethroughSpan(), i, i5, 33);
        }
        if (fbVar.z()) {
            spannable.setSpan(new UnderlineSpan(), i, i5, 33);
        }
        if (fbVar.p()) {
            g0.gv.y(spannable, new ForegroundColorSpan(fbVar.zn()), i, i5, 33);
        }
        if (fbVar.w()) {
            g0.gv.y(spannable, new BackgroundColorSpan(fbVar.n3()), i, i5, 33);
        }
        if (fbVar.gv() != null) {
            g0.gv.y(spannable, new TypefaceSpan(fbVar.gv()), i, i5, 33);
        }
        if (fbVar.xc() != null) {
            n3 n3Var = (n3) v0.y.v(fbVar.xc());
            int i11 = n3Var.y;
            if (i11 == -1) {
                i11 = (i8 == 2 || i8 == 1) ? 3 : 1;
                i10 = 1;
            } else {
                i10 = n3Var.n3;
            }
            int i12 = n3Var.zn;
            if (i12 == -2) {
                i12 = 1;
            }
            g0.gv.y(spannable, new g0.v(i11, i10, i12), i, i5, 33);
        }
        int iI9 = fbVar.i9();
        if (iI9 == 2) {
            gv gvVarGv = gv(gvVar, map);
            if (gvVarGv != null && (gvVarV = v(gvVarGv, map)) != null) {
                if (gvVarV.fb() != 1 || gvVarV.a(0).n3 == null) {
                    r.a("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) ut.i9(gvVarV.a(0).n3);
                    fb fbVarA2 = a(gvVarV.f5770a, gvVarV.t(), map);
                    int iC5 = fbVarA2 != null ? fbVarA2.c5() : -1;
                    if (iC5 == -1 && (fbVarA = a(gvVarGv.f5770a, gvVarGv.t(), map)) != null) {
                        iC5 = fbVarA.c5();
                    }
                    spannable.setSpan(new g0.zn(str, iC5), i, i5, 33);
                }
            }
        } else if (iI9 == 3 || iI9 == 4) {
            spannable.setSpan(new y(), i, i5, 33);
        }
        if (fbVar.wz()) {
            g0.gv.y(spannable, new g0.y(), i, i5, 33);
        }
        int iA = fbVar.a();
        if (iA == 1) {
            g0.gv.y(spannable, new AbsoluteSizeSpan((int) fbVar.v(), true), i, i5, 33);
        } else if (iA == 2) {
            g0.gv.y(spannable, new RelativeSizeSpan(fbVar.v()), i, i5, 33);
        } else {
            if (iA != 3) {
                return;
            }
            g0.gv.y(spannable, new RelativeSizeSpan(fbVar.v() / 100.0f), i, i5, 33);
        }
    }

    public static void zn(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }
}
