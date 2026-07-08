package g;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class y extends BroadcastReceiver {

    /* JADX INFO: renamed from: g.y$y, reason: collision with other inner class name */
    public static class C0093y extends MediaBrowserCompat.zn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MediaBrowserCompat f5186a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final Intent f5187gv;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f5188v;
        public final Context zn;

        public C0093y(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.zn = context;
            this.f5187gv = intent;
            this.f5188v = pendingResult;
        }

        public void a(MediaBrowserCompat mediaBrowserCompat) {
            this.f5186a = mediaBrowserCompat;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.zn
        public void n3() {
            v();
        }

        public final void v() {
            this.f5186a.n3();
            this.f5188v.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.zn
        public void y() {
            new MediaControllerCompat(this.zn, this.f5186a.zn()).y((KeyEvent) this.f5187gv.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            v();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.zn
        public void zn() {
            v();
        }
    }

    public static ComponentName n3(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + listQueryIntentServices.size());
    }

    public static ComponentName y(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() <= 1) {
            return null;
        }
        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }

    public static KeyEvent zn(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.n3().y(keyEvent);
        return keyEvent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameN3 = n3(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameN3 != null) {
            intent.setComponent(componentNameN3);
            d.y.startForegroundService(context, intent);
            return;
        }
        ComponentName componentNameN32 = n3(context, "android.media.browse.MediaBrowserService");
        if (componentNameN32 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C0093y c0093y = new C0093y(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameN32, c0093y, null);
        c0093y.a(mediaBrowserCompat);
        mediaBrowserCompat.y();
    }
}
