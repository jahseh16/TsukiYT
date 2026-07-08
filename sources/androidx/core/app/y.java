package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import d.zn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ta.tl;
import ta.z;
import x4.n3;

/* JADX INFO: loaded from: classes.dex */
public class y implements tl {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public RemoteViews f776c5;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public RemoteViews f778gv;
    public final Notification.Builder n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f779s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RemoteViews f780v;
    public final Context y;
    public final NotificationCompat.tl zn;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Bundle> f775a = new ArrayList();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Bundle f777fb = new Bundle();

    public y(NotificationCompat.tl tlVar) {
        int i;
        Object obj;
        this.zn = tlVar;
        Context context = tlVar.y;
        this.y = context;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            this.n3 = s.y(context, tlVar.f760x);
        } else {
            this.n3 = new Notification.Builder(tlVar.y);
        }
        Notification notification = tlVar.j;
        this.n3.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, tlVar.f737c5).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(tlVar.f758v).setContentText(tlVar.f734a).setContentInfo(tlVar.f741f).setContentIntent(tlVar.f742fb).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(tlVar.f752s, (notification.flags & 128) != 0).setNumber(tlVar.f753t).setProgress(tlVar.z, tlVar.f751r, tlVar.f761x4);
        if (i5 < 23) {
            Notification.Builder builder = this.n3;
            IconCompat iconCompat = tlVar.f746i9;
            builder.setLargeIcon(iconCompat == null ? null : iconCompat.t());
        } else {
            Notification.Builder builder2 = this.n3;
            IconCompat iconCompat2 = tlVar.f746i9;
            a.n3(builder2, iconCompat2 == null ? null : iconCompat2.x4(context));
        }
        y.n3(y.gv(y.zn(this.n3, tlVar.f750p), tlVar.f762xc), tlVar.f755tl);
        NotificationCompat.wz wzVar = tlVar.w;
        if (wzVar instanceof NotificationCompat.wz) {
            Iterator it = wzVar.s().iterator();
            while (it.hasNext()) {
                n3((NotificationCompat.n3) it.next());
            }
        } else {
            Iterator<NotificationCompat.n3> it2 = tlVar.n3.iterator();
            while (it2.hasNext()) {
                n3(it2.next());
            }
        }
        Bundle bundle = tlVar.mg;
        if (bundle != null) {
            this.f777fb.putAll(bundle);
        }
        int i8 = Build.VERSION.SDK_INT;
        this.f778gv = tlVar.f740ej;
        this.f780v = tlVar.f756ud;
        n3.y(this.n3, tlVar.f759wz);
        gv.c5(this.n3, tlVar.c);
        gv.fb(this.n3, tlVar.f745i4);
        gv.i9(this.n3, tlVar.n);
        gv.s(this.n3, tlVar.f3);
        this.f779s = tlVar.f744hw;
        v.n3(this.n3, tlVar.rz);
        v.zn(this.n3, tlVar.f754ta);
        v.a(this.n3, tlVar.f739d);
        v.gv(this.n3, tlVar.f764z6);
        v.v(this.n3, notification.sound, notification.audioAttributes);
        List listV = i8 < 28 ? v(fb(tlVar.zn), tlVar.q9) : tlVar.q9;
        if (listV != null && !listV.isEmpty()) {
            Iterator it3 = listV.iterator();
            while (it3.hasNext()) {
                v.y(this.n3, (String) it3.next());
            }
        }
        this.f776c5 = tlVar.f735a8;
        if (tlVar.f743gv.size() > 0) {
            Bundle bundle2 = tlVar.v().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i10 = 0; i10 < tlVar.f743gv.size(); i10++) {
                bundle4.putBundle(Integer.toString(i10), n3.v(tlVar.f743gv.get(i10)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            tlVar.v().putBundle("android.car.EXTENSIONS", bundle2);
            this.f777fb.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && (obj = tlVar.f757ut) != null) {
            a.zn(this.n3, obj);
        }
        if (i11 >= 24) {
            zn.y(this.n3, tlVar.mg);
            fb.v(this.n3, tlVar.f738co);
            RemoteViews remoteViews = tlVar.f740ej;
            if (remoteViews != null) {
                fb.zn(this.n3, remoteViews);
            }
            RemoteViews remoteViews2 = tlVar.f756ud;
            if (remoteViews2 != null) {
                fb.n3(this.n3, remoteViews2);
            }
            RemoteViews remoteViews3 = tlVar.f735a8;
            if (remoteViews3 != null) {
                fb.gv(this.n3, remoteViews3);
            }
        }
        if (i11 >= 26) {
            s.n3(this.n3, tlVar.f736b);
            s.v(this.n3, tlVar.f749mt);
            s.a(this.n3, tlVar.f748k5);
            s.fb(this.n3, tlVar.vl);
            s.gv(this.n3, tlVar.f744hw);
            if (tlVar.fh) {
                s.zn(this.n3, tlVar.d0);
            }
            if (!TextUtils.isEmpty(tlVar.f760x)) {
                this.n3.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i11 >= 28) {
            Iterator<zn> it4 = tlVar.zn.iterator();
            while (it4.hasNext()) {
                c5.y(this.n3, it4.next().i9());
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            i9.y(this.n3, tlVar.qn);
            i9.n3(this.n3, NotificationCompat.t.f(tlVar.o));
            zn znVar = tlVar.f763yt;
            if (znVar != null) {
                i9.gv(this.n3, znVar.zn());
            }
        }
        if (i12 >= 31 && (i = tlVar.f747j5) != 0) {
            f.n3(this.n3, i);
        }
        if (tlVar.oz) {
            if (this.zn.f3) {
                this.f779s = 2;
            } else {
                this.f779s = 1;
            }
            this.n3.setVibrate(null);
            this.n3.setSound(null);
            int i13 = notification.defaults & (-4);
            notification.defaults = i13;
            this.n3.setDefaults(i13);
            if (i12 >= 26) {
                if (TextUtils.isEmpty(this.zn.f745i4)) {
                    gv.fb(this.n3, NotificationCompat.GROUP_KEY_SILENT);
                }
                s.gv(this.n3, this.f779s);
            }
        }
    }

    @Nullable
    public static List<String> fb(@Nullable List<zn> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<zn> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c5());
        }
        return arrayList;
    }

    @Nullable
    public static List<String> v(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        n3 n3Var = new n3(list.size() + list2.size());
        n3Var.addAll(list);
        n3Var.addAll(list2);
        return new ArrayList(n3Var);
    }

    public Context a() {
        return this.y;
    }

    public Notification gv() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return y.y(this.n3);
        }
        if (i >= 24) {
            Notification notificationY = y.y(this.n3);
            if (this.f779s != 0) {
                if (gv.a(notificationY) != null && (notificationY.flags & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 && this.f779s == 2) {
                    s(notificationY);
                }
                if (gv.a(notificationY) != null && (notificationY.flags & NotificationCompat.FLAG_GROUP_SUMMARY) == 0 && this.f779s == 1) {
                    s(notificationY);
                }
            }
            return notificationY;
        }
        zn.y(this.n3, this.f777fb);
        Notification notificationY2 = y.y(this.n3);
        RemoteViews remoteViews = this.f778gv;
        if (remoteViews != null) {
            notificationY2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f780v;
        if (remoteViews2 != null) {
            notificationY2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f776c5;
        if (remoteViews3 != null) {
            notificationY2.headsUpContentView = remoteViews3;
        }
        if (this.f779s != 0) {
            if (gv.a(notificationY2) != null && (notificationY2.flags & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 && this.f779s == 2) {
                s(notificationY2);
            }
            if (gv.a(notificationY2) != null && (notificationY2.flags & NotificationCompat.FLAG_GROUP_SUMMARY) == 0 && this.f779s == 1) {
                s(notificationY2);
            }
        }
        return notificationY2;
    }

    public final void n3(NotificationCompat.n3 n3Var) {
        int i = Build.VERSION.SDK_INT;
        IconCompat iconCompatGv = n3Var.gv();
        Notification.Action.Builder builderY = i >= 23 ? a.y(iconCompatGv != null ? iconCompatGv.r() : null, n3Var.s(), n3Var.y()) : gv.v(iconCompatGv != null ? iconCompatGv.tl() : 0, n3Var.s(), n3Var.y());
        if (n3Var.v() != null) {
            for (RemoteInput remoteInput : z.n3(n3Var.v())) {
                gv.zn(builderY, remoteInput);
            }
        }
        Bundle bundle = n3Var.zn() != null ? new Bundle(n3Var.zn()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", n3Var.n3());
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24) {
            fb.y(builderY, n3Var.n3());
        }
        bundle.putInt("android.support.action.semanticAction", n3Var.a());
        if (i5 >= 28) {
            c5.n3(builderY, n3Var.a());
        }
        if (i5 >= 29) {
            i9.zn(builderY, n3Var.i9());
        }
        if (i5 >= 31) {
            f.y(builderY, n3Var.c5());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", n3Var.fb());
        gv.n3(builderY, bundle);
        gv.y(this.n3, gv.gv(builderY));
    }

    public final void s(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // ta.tl
    public Notification.Builder y() {
        return this.n3;
    }

    public Notification zn() {
        Bundle extras;
        RemoteViews remoteViewsA;
        RemoteViews remoteViewsGv;
        NotificationCompat.xc xcVar = this.zn.w;
        if (xcVar != null) {
            xcVar.n3(this);
        }
        RemoteViews remoteViewsV = xcVar != null ? xcVar.v(this) : null;
        Notification notificationGv = gv();
        if (remoteViewsV != null) {
            notificationGv.contentView = remoteViewsV;
        } else {
            RemoteViews remoteViews = this.zn.f740ej;
            if (remoteViews != null) {
                notificationGv.contentView = remoteViews;
            }
        }
        if (xcVar != null && (remoteViewsGv = xcVar.gv(this)) != null) {
            notificationGv.bigContentView = remoteViewsGv;
        }
        if (xcVar != null && (remoteViewsA = this.zn.w.a(this)) != null) {
            notificationGv.headsUpContentView = remoteViewsA;
        }
        if (xcVar != null && (extras = NotificationCompat.getExtras(notificationGv)) != null) {
            xcVar.y(extras);
        }
        return notificationGv;
    }
}
