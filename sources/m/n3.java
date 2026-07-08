package m;

import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import ta.tl;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends NotificationCompat.xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaSessionCompat.Token f6459a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f6460v = null;

    public n3 c5(int... iArr) {
        this.f6460v = iArr;
        return this;
    }

    @Override // androidx.core.app.NotificationCompat.xc
    public RemoteViews gv(tl tlVar) {
        return null;
    }

    @Override // androidx.core.app.NotificationCompat.xc
    public void n3(tl tlVar) {
        y.gv(tlVar.y(), y.n3(y.y(), this.f6460v, this.f6459a));
    }

    public n3 s(MediaSessionCompat.Token token) {
        this.f6459a = token;
        return this;
    }

    @Override // androidx.core.app.NotificationCompat.xc
    public RemoteViews v(tl tlVar) {
        return null;
    }
}
