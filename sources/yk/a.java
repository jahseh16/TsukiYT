package yk;

import android.app.Notification;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final int n3;
    public final int y;
    public final Notification zn;

    public a(int i, @NonNull Notification notification, int i5) {
        this.y = i;
        this.zn = notification;
        this.n3 = i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.y == aVar.y && this.n3 == aVar.n3) {
            return this.zn.equals(aVar.zn);
        }
        return false;
    }

    public int hashCode() {
        return (((this.y * 31) + this.n3) * 31) + this.zn.hashCode();
    }

    @NonNull
    public Notification n3() {
        return this.zn;
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.y + ", mForegroundServiceType=" + this.n3 + ", mNotification=" + this.zn + '}';
    }

    public int y() {
        return this.n3;
    }

    public int zn() {
        return this.y;
    }
}
