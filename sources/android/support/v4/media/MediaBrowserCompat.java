package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {
    public static final boolean n3 = Log.isLoggable("MediaBrowserCompat", 3);
    public final gv y;

    public static class zn {
        public n3 n3;
        public final MediaBrowser.ConnectionCallback y = new y(this);

        public void gv(n3 n3Var) {
            this.n3 = n3Var;
        }

        public void n3() {
            throw null;
        }

        public void y() {
            throw null;
        }

        public void zn() {
            throw null;
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, zn znVar, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.y = new fb(context, componentName, znVar, bundle);
        } else if (i >= 23) {
            this.y = new a(context, componentName, znVar, bundle);
        } else {
            this.y = new v(context, componentName, znVar, bundle);
        }
    }

    public void n3() {
        this.y.disconnect();
    }

    public void y() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.y.zn();
    }

    @NonNull
    public MediaSessionCompat.Token zn() {
        return this.y.y();
    }
}
