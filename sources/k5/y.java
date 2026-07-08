package k5;

import android.net.ConnectivityManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: k5.y$y, reason: collision with other inner class name */
    public static class C0116y {
        public static boolean y(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean y(@NonNull ConnectivityManager connectivityManager) {
        return C0116y.y(connectivityManager);
    }
}
