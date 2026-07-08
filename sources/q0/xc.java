package q0;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import b0.n3;

/* JADX INFO: loaded from: classes.dex */
public final class xc {
    public static void a(n3.C0034n3 c0034n3) {
        c0034n3.p(-3.4028235E38f, Integer.MIN_VALUE);
        if (c0034n3.v() instanceof Spanned) {
            if (!(c0034n3.v() instanceof Spannable)) {
                c0034n3.xc(SpannableString.valueOf(c0034n3.v()));
            }
            fb((Spannable) v0.y.v(c0034n3.v()), new g4.w() { // from class: q0.wz
                @Override // g4.w
                public final boolean apply(Object obj) {
                    return xc.gv(obj);
                }
            });
        }
    }

    public static void fb(Spannable spannable, g4.w<Object> wVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (wVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static /* synthetic */ boolean gv(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static float s(int i, float f3, int i5, int i8) {
        float f4;
        if (f3 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f4 = i8;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f3;
            }
            f4 = i5;
        }
        return f3 * f4;
    }

    public static void v(n3.C0034n3 c0034n3) {
        c0034n3.n3();
        if (c0034n3.v() instanceof Spanned) {
            if (!(c0034n3.v() instanceof Spannable)) {
                c0034n3.xc(SpannableString.valueOf(c0034n3.v()));
            }
            fb((Spannable) v0.y.v(c0034n3.v()), new g4.w() { // from class: q0.tl
                @Override // g4.w
                public final boolean apply(Object obj) {
                    return xc.zn(obj);
                }
            });
        }
        a(c0034n3);
    }

    public static /* synthetic */ boolean zn(Object obj) {
        return !(obj instanceof g0.n3);
    }
}
