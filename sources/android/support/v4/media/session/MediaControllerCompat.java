package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.n3;
import android.support.v4.media.session.y;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ta.s;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {
    public final MediaSessionCompat.Token n3;
    public final n3 y;

    @SuppressLint({"BanConcurrentHashMap"})
    public final ConcurrentHashMap<y, Boolean> zn = new ConcurrentHashMap<>();

    public static class MediaControllerImplApi21 implements n3 {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final MediaSessionCompat.Token f225v;
        public final MediaController y;
        public final Object n3 = new Object();
        public final List<y> zn = new ArrayList();

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public HashMap<y, y> f224gv = new HashMap<>();

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            public WeakReference<MediaControllerImplApi21> y;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.y = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.y.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.n3) {
                    mediaControllerImplApi21.f225v.a(n3.y.z(s.y(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.f225v.fb(q5.y.n3(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.gv();
                }
            }
        }

        public static class y extends y.n3 {
            public y(y yVar) {
                super(yVar);
            }

            @Override // android.support.v4.media.session.y
            public void hw(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.y
            public void i4(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.y
            public void lc(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.y
            public void m(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.y
            public void wf(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.y
            public void yt() throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f225v = token;
            this.y = new MediaController(context, (MediaSession.Token) token.v());
            if (token.zn() == null) {
                v();
            }
        }

        public void a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.y.sendCommand(str, bundle, resultReceiver);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.n3
        public MediaMetadataCompat getMetadata() {
            MediaMetadata metadata = this.y.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.n3(metadata);
            }
            return null;
        }

        public void gv() {
            if (this.f225v.zn() == null) {
                return;
            }
            for (y yVar : this.zn) {
                y yVar2 = new y(yVar);
                this.f224gv.put(yVar, yVar2);
                yVar.n3 = yVar2;
                try {
                    this.f225v.zn().e(yVar2);
                    yVar.c5(13, null, null);
                } catch (RemoteException e4) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e4);
                }
            }
            this.zn.clear();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.n3
        public PlaybackStateCompat n3() {
            if (this.f225v.zn() != null) {
                try {
                    return this.f225v.zn().n3();
                } catch (RemoteException e4) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e4);
                }
            }
            PlaybackState playbackState = this.y.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.y(playbackState);
            }
            return null;
        }

        public final void v() {
            a("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.n3
        public boolean y(KeyEvent keyEvent) {
            return this.y.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.n3
        public List<MediaSessionCompat.QueueItem> zn() {
            List<MediaSession.QueueItem> queue = this.y.getQueue();
            if (queue != null) {
                return MediaSessionCompat.QueueItem.n3(queue);
            }
            return null;
        }
    }

    public interface n3 {
        MediaMetadataCompat getMetadata();

        PlaybackStateCompat n3();

        boolean y(KeyEvent keyEvent);

        List<MediaSessionCompat.QueueItem> zn();
    }

    public static abstract class y implements IBinder.DeathRecipient {
        public android.support.v4.media.session.y n3;
        public final MediaController.Callback y = new y(this);

        public static class n3 extends y.AbstractBinderC0009y {
            public final WeakReference<y> y;

            public n3(y yVar) {
                this.y = new WeakReference<>(yVar);
            }

            @Override // android.support.v4.media.session.y
            public void cs(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                y yVar = this.y.get();
                if (yVar != null) {
                    yVar.c5(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.y
            public void f7(int i) throws RemoteException {
                y yVar = this.y.get();
                if (yVar != null) {
                    yVar.c5(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.y
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                y yVar = this.y.get();
                if (yVar != null) {
                    yVar.c5(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.y
            public void onRepeatModeChanged(int i) throws RemoteException {
                y yVar = this.y.get();
                if (yVar != null) {
                    yVar.c5(9, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.y
            public void pz(boolean z) throws RemoteException {
                y yVar = this.y.get();
                if (yVar != null) {
                    yVar.c5(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.v4.media.session.y
            public void x4() throws RemoteException {
                y yVar = this.y.get();
                if (yVar != null) {
                    yVar.c5(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.y
            public void xb(boolean z) throws RemoteException {
            }
        }

        public void a(CharSequence charSequence) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            c5(8, null, null);
        }

        public void c5(int i, Object obj, Bundle bundle) {
        }

        public void fb() {
        }

        public void gv(PlaybackStateCompat playbackStateCompat) {
        }

        public void n3(Bundle bundle) {
        }

        public void s(String str, Bundle bundle) {
        }

        public void v(List<MediaSessionCompat.QueueItem> list) {
        }

        public void y(gv gvVar) {
        }

        public void zn(MediaMetadataCompat mediaMetadataCompat) {
        }
    }

    public static class zn extends MediaControllerImplApi21 {
        public zn(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat.Token tokenZn = mediaSessionCompat.zn();
        this.n3 = tokenZn;
        if (Build.VERSION.SDK_INT >= 29) {
            this.y = new zn(context, tokenZn);
        } else {
            this.y = new MediaControllerImplApi21(context, tokenZn);
        }
    }

    public List<MediaSessionCompat.QueueItem> gv() {
        return this.y.zn();
    }

    public MediaMetadataCompat n3() {
        return this.y.getMetadata();
    }

    public boolean y(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.y.y(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public PlaybackStateCompat zn() {
        return this.y.n3();
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) {
        if (token != null) {
            this.n3 = token;
            this.y = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
