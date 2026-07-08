package v3;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class xg {
    public static Context y(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
