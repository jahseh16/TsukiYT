package g3;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public zn y;

    public n3(@NonNull String str, int i, int i5) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = new s(str, i, i5);
        } else {
            this.y = new c5(str, i, i5);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n3) {
            return this.y.equals(((n3) obj).y);
        }
        return false;
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public n3(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strY = s.y(remoteUserInfo);
        if (strY != null) {
            if (!TextUtils.isEmpty(strY)) {
                this.y = new s(remoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
