package hw;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class n3 {

    public static class y {
        public static Spanned n3(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        public static Spanned y(String str, int i) {
            return Html.fromHtml(str, i);
        }

        public static String zn(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    @NonNull
    public static Spanned n3(@NonNull String str, int i, @Nullable Html.ImageGetter imageGetter, @Nullable Html.TagHandler tagHandler) {
        return Build.VERSION.SDK_INT >= 24 ? y.n3(str, i, imageGetter, tagHandler) : Html.fromHtml(str, imageGetter, tagHandler);
    }

    @NonNull
    public static Spanned y(@NonNull String str, int i) {
        return Build.VERSION.SDK_INT >= 24 ? y.y(str, i) : Html.fromHtml(str);
    }
}
