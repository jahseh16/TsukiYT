package z6;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static long y(@NonNull PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? y.n3(packageInfo) : packageInfo.versionCode;
    }
}
