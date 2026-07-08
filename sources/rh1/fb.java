package rh1;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class fb {
    public static final SpannableString y(String str, int i, boolean z, String... mates) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mates, "mates");
        SpannableString spannableString = new SpannableString(str);
        int i5 = 0;
        for (String str2 : mates) {
            Integer numValueOf = Integer.valueOf(StringsKt.indexOf$default((CharSequence) spannableString, str2, i5, false, 4, (Object) null));
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                int length = str2.length() + iIntValue;
                spannableString.setSpan(new ForegroundColorSpan(i), iIntValue, length, 17);
                if (z) {
                    spannableString.setSpan(new StyleSpan(1), iIntValue, length, 17);
                }
                i5 = length;
            }
        }
        return spannableString;
    }
}
