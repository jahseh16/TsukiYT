package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.n3;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediaSessionCompat {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static int f226gv;
    public final MediaControllerCompat n3;
    public final zn y;
    public final ArrayList<s> zn;

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new y();

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public MediaSession.QueueItem f227fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f228v;
        public final MediaDescriptionCompat y;

        public static class n3 {
            public static MediaDescription n3(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static MediaSession.QueueItem y(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            public static long zn(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public class y implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        public static List<QueueItem> n3(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(y(it.next()));
            }
            return arrayList;
        }

        public static QueueItem y(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.y(n3.n3(queueItem)), n3.zn(queueItem));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public long gv() {
            return this.f228v;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.y + ", Id=" + this.f228v + " }";
        }

        public Object v() {
            MediaSession.QueueItem queueItem = this.f227fb;
            if (queueItem != null) {
                return queueItem;
            }
            MediaSession.QueueItem queueItemY = n3.y((MediaDescription) this.y.fb(), this.f228v);
            this.f227fb = queueItemY;
            return queueItemY;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.y.writeToParcel(parcel, i);
            parcel.writeLong(this.f228v);
        }

        public MediaDescriptionCompat zn() {
            return this.y;
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.y = mediaDescriptionCompat;
            this.f228v = j;
            this.f227fb = queueItem;
        }

        public QueueItem(Parcel parcel) {
            this.y = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f228v = parcel.readLong();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new y();
        public ResultReceiver y;

        public ResultReceiverWrapper(Parcel parcel) {
            this.y = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.y.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new y();

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public android.support.v4.media.session.n3 f229fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public q5.gv f230s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Object f231v;
        public final Object y;

        public class y implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i) {
                return new Token[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }
        }

        public Token(Object obj) {
            this(obj, null, null);
        }

        public static Token n3(Object obj, android.support.v4.media.session.n3 n3Var) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, n3Var);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public static Token y(Object obj) {
            return n3(obj, null);
        }

        public void a(android.support.v4.media.session.n3 n3Var) {
            synchronized (this.y) {
                this.f229fb = n3Var;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f231v;
            if (obj2 == null) {
                return token.f231v == null;
            }
            Object obj3 = token.f231v;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public void fb(q5.gv gvVar) {
            synchronized (this.y) {
                this.f230s = gvVar;
            }
        }

        public q5.gv gv() {
            q5.gv gvVar;
            synchronized (this.y) {
                gvVar = this.f230s;
            }
            return gvVar;
        }

        public int hashCode() {
            Object obj = this.f231v;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public Object v() {
            return this.f231v;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f231v, i);
        }

        public android.support.v4.media.session.n3 zn() {
            android.support.v4.media.session.n3 n3Var;
            synchronized (this.y) {
                n3Var = this.f229fb;
            }
            return n3Var;
        }

        public Token(Object obj, android.support.v4.media.session.n3 n3Var) {
            this(obj, n3Var, null);
        }

        public Token(Object obj, android.support.v4.media.session.n3 n3Var, q5.gv gvVar) {
            this.y = new Object();
            this.f231v = obj;
            this.f229fb = n3Var;
            this.f230s = gvVar;
        }
    }

    public static class fb extends a {
        public fb(Context context, String str, q5.gv gvVar, Bundle bundle) {
            super(context, str, gvVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.gv
        public MediaSession w(Context context, String str, Bundle bundle) {
            return v.n3.y(context, str, bundle);
        }
    }

    public static class gv implements zn {

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public MediaMetadataCompat f233c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f234f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public PlaybackStateCompat f235fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public Bundle f236gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public int f237i9;
        public final Token n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List<QueueItem> f238s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f239t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public int f240tl;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public n3 f242wz;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public g3.n3 f243xc;
        public final MediaSession y;
        public final Object zn = new Object();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f241v = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RemoteCallbackList<android.support.v4.media.session.y> f232a = new RemoteCallbackList<>();

        public class y extends n3.y {
            public y() {
            }

            @Override // android.support.v4.media.session.n3
            public void ap(int i, int i5, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void bk(android.support.v4.media.session.y yVar) {
                gv.this.f232a.unregister(yVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (gv.this.zn) {
                    gv.this.getClass();
                }
            }

            @Override // android.support.v4.media.session.n3
            public int c5() {
                return gv.this.f239t;
            }

            @Override // android.support.v4.media.session.n3
            public void cy(int i, int i5, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void d(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void d0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void dm(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.n3
            public void e(android.support.v4.media.session.y yVar) {
                if (gv.this.f241v) {
                    return;
                }
                gv.this.f232a.register(yVar, new g3.n3("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (gv.this.zn) {
                    gv.this.getClass();
                }
            }

            @Override // android.support.v4.media.session.n3
            public void ej(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void fb(long j) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public Bundle fh() {
                if (gv.this.f236gv == null) {
                    return null;
                }
                return new Bundle(gv.this.f236gv);
            }

            @Override // android.support.v4.media.session.n3
            public void g3(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public String getTag() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void gv(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void i9(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void jz(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void k5(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public boolean kp() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public PendingIntent mt() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public PlaybackStateCompat n3() {
                gv gvVar = gv.this;
                return MediaSessionCompat.gv(gvVar.f235fb, gvVar.f233c5);
            }

            @Override // android.support.v4.media.session.n3
            public void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void o0(float f3) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public int oz() {
                return gv.this.f240tl;
            }

            @Override // android.support.v4.media.session.n3
            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void play() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void prepare() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public boolean q9() {
                return gv.this.f234f;
            }

            @Override // android.support.v4.media.session.n3
            public void qj(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public int r() {
                return gv.this.f237i9;
            }

            @Override // android.support.v4.media.session.n3
            public void rb(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public long s() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void s8(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public boolean t() {
                return false;
            }

            @Override // android.support.v4.media.session.n3
            public void u() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public CharSequence u0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void ut(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void v(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void vl(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public ParcelableVolumeInfo vp() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public boolean x(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void xc(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void xg(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void y4() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void yc(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public void z6(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.n3
            public List<QueueItem> zn() {
                return null;
            }
        }

        public gv(Context context, String str, q5.gv gvVar, Bundle bundle) {
            MediaSession mediaSessionW = w(context, str, bundle);
            this.y = mediaSessionW;
            this.n3 = new Token(mediaSessionW.getSessionToken(), new y(), gvVar);
            this.f236gv = bundle;
            zn(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public void a(n3 n3Var, Handler handler) {
            synchronized (this.zn) {
                try {
                    this.f242wz = n3Var;
                    this.y.setCallback(n3Var == null ? null : n3Var.f247v, handler);
                    if (n3Var != null) {
                        n3Var.jz(this, handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public void c5(PlaybackStateCompat playbackStateCompat) {
            this.f235fb = playbackStateCompat;
            synchronized (this.zn) {
                for (int iBeginBroadcast = this.f232a.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.y) this.f232a.getBroadcastItem(iBeginBroadcast)).cs(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f232a.finishBroadcast();
            }
            this.y.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.fb());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public String f() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.y.getClass().getMethod("getCallingPackage", null).invoke(this.y, null);
            } catch (Exception e4) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e4);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public void fb(MediaMetadataCompat mediaMetadataCompat) {
            this.f233c5 = mediaMetadataCompat;
            this.y.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.fb());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public void gv(int i) {
            if (this.f239t != i) {
                this.f239t = i;
                synchronized (this.zn) {
                    for (int iBeginBroadcast = this.f232a.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.y) this.f232a.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f232a.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public void i9(g3.n3 n3Var) {
            synchronized (this.zn) {
                this.f243xc = n3Var;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public boolean isActive() {
            return this.y.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public PlaybackStateCompat n3() {
            return this.f235fb;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public void release() {
            this.f241v = true;
            this.f232a.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.y.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.y);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e4) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e4);
                }
            }
            this.y.setCallback(null);
            this.y.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public void s(List<QueueItem> list) {
            this.f238s = list;
            if (list == null) {
                this.y.setQueue(null);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<QueueItem> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((MediaSession.QueueItem) it.next().v());
            }
            this.y.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public n3 t() {
            n3 n3Var;
            synchronized (this.zn) {
                n3Var = this.f242wz;
            }
            return n3Var;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public void tl(PendingIntent pendingIntent) {
            this.y.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public void v(int i) {
            if (this.f240tl != i) {
                this.f240tl = i;
                synchronized (this.zn) {
                    for (int iBeginBroadcast = this.f232a.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.y) this.f232a.getBroadcastItem(iBeginBroadcast)).f7(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f232a.finishBroadcast();
                }
            }
        }

        public MediaSession w(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public void wz(boolean z) {
            this.y.setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public g3.n3 xc() {
            g3.n3 n3Var;
            synchronized (this.zn) {
                n3Var = this.f243xc;
            }
            return n3Var;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        public Token y() {
            return this.n3;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.zn
        @SuppressLint({"WrongConstant"})
        public void zn(int i) {
            this.y.setFlags(i | 3);
        }
    }

    public static abstract class n3 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public y f244f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f245fb;
        public final Object y = new Object();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final MediaSession.Callback f247v = new C0007n3();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public WeakReference<zn> f246s = new WeakReference<>(null);

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$n3$n3, reason: collision with other inner class name */
        public class C0007n3 extends MediaSession.Callback {
            public C0007n3() {
            }

            public final gv n3() {
                gv gvVar;
                synchronized (n3.this.y) {
                    gvVar = (gv) n3.this.f246s.get();
                }
                if (gvVar == null || n3.this != gvVar.t()) {
                    return null;
                }
                return gvVar;
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                MediaSessionCompat.y(bundle);
                zn(gvVarN3);
                try {
                    QueueItem queueItem = null;
                    IBinder iBinderAsBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token tokenY = gvVarN3.y();
                        android.support.v4.media.session.n3 n3VarZn = tokenY.zn();
                        if (n3VarZn != null) {
                            iBinderAsBinder = n3VarZn.asBinder();
                        }
                        ta.s.n3(bundle2, "android.support.v4.media.session.EXTRA_BINDER", iBinderAsBinder);
                        q5.y.zn(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", tokenY.gv());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        n3.this.zn((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        n3.this.a((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        n3.this.k5((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        n3.this.xc(str, bundle, resultReceiver);
                    } else if (gvVarN3.f238s != null) {
                        int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                        if (i >= 0 && i < gvVarN3.f238s.size()) {
                            queueItem = gvVarN3.f238s.get(i);
                        }
                        if (queueItem != null) {
                            n3.this.k5(queueItem.zn());
                        }
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                MediaSessionCompat.y(bundle);
                zn(gvVarN3);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.y(bundle2);
                        n3.this.z6(uri, bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        n3.this.ej();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.y(bundle3);
                        n3.this.ud(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.y(bundle4);
                        n3.this.a8(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.y(bundle5);
                        n3.this.x(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        n3.this.hw(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        n3.this.oz(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        n3.this.ut(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.y(bundle6);
                        n3.this.j(ratingCompat, bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        n3.this.j5(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        n3.this.w(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                zn(gvVarN3);
                n3.this.z();
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return false;
                }
                zn(gvVarN3);
                boolean zC = n3.this.c(intent);
                y(gvVarN3);
                return zC || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                zn(gvVarN3);
                n3.this.d0();
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                zn(gvVarN3);
                n3.this.fh();
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                MediaSessionCompat.y(bundle);
                zn(gvVarN3);
                n3.this.mg(str, bundle);
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                MediaSessionCompat.y(bundle);
                zn(gvVarN3);
                n3.this.d(str, bundle);
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                MediaSessionCompat.y(bundle);
                zn(gvVarN3);
                n3.this.z6(uri, bundle);
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                zn(gvVarN3);
                n3.this.ej();
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                MediaSessionCompat.y(bundle);
                zn(gvVarN3);
                n3.this.ud(str, bundle);
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                MediaSessionCompat.y(bundle);
                zn(gvVarN3);
                n3.this.a8(str, bundle);
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                MediaSessionCompat.y(bundle);
                zn(gvVarN3);
                n3.this.x(uri, bundle);
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                zn(gvVarN3);
                n3.this.yt();
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                zn(gvVarN3);
                n3.this.vl(j);
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f3) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                zn(gvVarN3);
                n3.this.j5(f3);
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                zn(gvVarN3);
                n3.this.o(RatingCompat.y(rating));
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                zn(gvVarN3);
                n3.this.q9();
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                zn(gvVarN3);
                n3.this.k();
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j) {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                zn(gvVarN3);
                n3.this.f7(j);
                y(gvVarN3);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                gv gvVarN3 = n3();
                if (gvVarN3 == null) {
                    return;
                }
                zn(gvVarN3);
                n3.this.en();
                y(gvVarN3);
            }

            public final void y(zn znVar) {
                znVar.i9(null);
            }

            public final void zn(zn znVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String strF = znVar.f();
                if (TextUtils.isEmpty(strF)) {
                    strF = "android.media.session.MediaController";
                }
                znVar.i9(new g3.n3(strF, -1, -1));
            }
        }

        public class y extends Handler {
            public y(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                zn znVar;
                n3 n3Var;
                y yVar;
                if (message.what == 1) {
                    synchronized (n3.this.y) {
                        znVar = n3.this.f246s.get();
                        n3Var = n3.this;
                        yVar = n3Var.f244f;
                    }
                    if (znVar == null || n3Var != znVar.t() || yVar == null) {
                        return;
                    }
                    znVar.i9((g3.n3) message.obj);
                    n3.this.y(znVar, yVar);
                    znVar.i9(null);
                }
            }
        }

        public void a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void a8(String str, Bundle bundle) {
        }

        public boolean c(Intent intent) {
            zn znVar;
            y yVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.y) {
                znVar = this.f246s.get();
                yVar = this.f244f;
            }
            if (znVar == null || yVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            g3.n3 n3VarXc = znVar.xc();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                y(znVar, yVar);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                y(znVar, yVar);
            } else if (this.f245fb) {
                yVar.removeMessages(1);
                this.f245fb = false;
                PlaybackStateCompat playbackStateCompatN3 = znVar.n3();
                if (((playbackStateCompatN3 == null ? 0L : playbackStateCompatN3.n3()) & 32) != 0) {
                    q9();
                }
            } else {
                this.f245fb = true;
                yVar.sendMessageDelayed(yVar.obtainMessage(1, n3VarXc), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void d(String str, Bundle bundle) {
        }

        public void d0() {
        }

        public void ej() {
        }

        public void en() {
        }

        public void f7(long j) {
        }

        public void fh() {
        }

        public void hw(boolean z) {
        }

        public void j(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void j5(float f3) {
        }

        public void jz(zn znVar, Handler handler) {
            synchronized (this.y) {
                try {
                    this.f246s = new WeakReference<>(znVar);
                    y yVar = this.f244f;
                    y yVar2 = null;
                    if (yVar != null) {
                        yVar.removeCallbacksAndMessages(null);
                    }
                    if (znVar != null && handler != null) {
                        yVar2 = new y(handler.getLooper());
                    }
                    this.f244f = yVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void k() {
        }

        public void k5(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void mg(String str, Bundle bundle) {
        }

        public void o(RatingCompat ratingCompat) {
        }

        public void oz(int i) {
        }

        public void q9() {
        }

        public void ud(String str, Bundle bundle) {
        }

        public void ut(int i) {
        }

        public void vl(long j) {
        }

        public void w(String str, Bundle bundle) {
        }

        public void x(Uri uri, Bundle bundle) {
        }

        public void xc(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void y(zn znVar, Handler handler) {
            if (this.f245fb) {
                this.f245fb = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackStateCompatN3 = znVar.n3();
                long jN3 = playbackStateCompatN3 == null ? 0L : playbackStateCompatN3.n3();
                boolean z = playbackStateCompatN3 != null && playbackStateCompatN3.c5() == 3;
                boolean z5 = (516 & jN3) != 0;
                boolean z7 = (jN3 & 514) != 0;
                if (z && z7) {
                    d0();
                } else {
                    if (z || !z5) {
                        return;
                    }
                    fh();
                }
            }
        }

        public void yt() {
        }

        public void z() {
        }

        public void z6(Uri uri, Bundle bundle) {
        }

        public void zn(MediaDescriptionCompat mediaDescriptionCompat) {
        }
    }

    public interface s {
        void y();
    }

    public static class v extends gv {
        public v(Context context, String str, q5.gv gvVar, Bundle bundle) {
            super(context, str, gvVar, bundle);
        }
    }

    public class y extends n3 {
        public y() {
        }
    }

    public interface zn {
        void a(n3 n3Var, Handler handler);

        void c5(PlaybackStateCompat playbackStateCompat);

        String f();

        void fb(MediaMetadataCompat mediaMetadataCompat);

        void gv(int i);

        void i9(g3.n3 n3Var);

        boolean isActive();

        PlaybackStateCompat n3();

        void release();

        void s(List<QueueItem> list);

        n3 t();

        void tl(PendingIntent pendingIntent);

        void v(int i);

        void wz(boolean z);

        g3.n3 xc();

        Token y();

        void zn(int i);
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String str) {
        this(context, str, null, null);
    }

    public static PlaybackStateCompat gv(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long jV = -1;
        if (playbackStateCompat.s() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.c5() != 3 && playbackStateCompat.c5() != 4 && playbackStateCompat.c5() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.gv() <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jV2 = ((long) (playbackStateCompat.v() * (jElapsedRealtime - r0))) + playbackStateCompat.s();
        if (mediaMetadataCompat != null && mediaMetadataCompat.y("android.media.metadata.DURATION")) {
            jV = mediaMetadataCompat.v("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.gv(playbackStateCompat).c5(playbackStateCompat.c5(), (jV < 0 || jV2 <= jV) ? jV2 < 0 ? 0L : jV2 : jV, playbackStateCompat.v(), jElapsedRealtime).n3();
    }

    @Nullable
    public static Bundle p(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        y(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void y(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public void a() {
        this.y.release();
    }

    public void c5(n3 n3Var, Handler handler) {
        if (n3Var == null) {
            this.y.a(null, null);
            return;
        }
        zn znVar = this.y;
        if (handler == null) {
            handler = new Handler();
        }
        znVar.a(n3Var, handler);
    }

    public void f(PendingIntent pendingIntent) {
        this.y.tl(pendingIntent);
    }

    public void fb(boolean z) {
        this.y.wz(z);
        Iterator<s> it = this.zn.iterator();
        while (it.hasNext()) {
            it.next().y();
        }
    }

    public void i9(int i) {
        this.y.zn(i);
    }

    public MediaControllerCompat n3() {
        return this.n3;
    }

    public void s(n3 n3Var) {
        c5(n3Var, null);
    }

    public void t(MediaMetadataCompat mediaMetadataCompat) {
        this.y.fb(mediaMetadataCompat);
    }

    public void tl(PlaybackStateCompat playbackStateCompat) {
        this.y.c5(playbackStateCompat);
    }

    public boolean v() {
        return this.y.isActive();
    }

    public void w(int i) {
        this.y.v(i);
    }

    public void wz(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(Long.valueOf(queueItem.gv()))) {
                    Log.e("MediaSessionCompat", "Found duplicate queue id: " + queueItem.gv(), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(queueItem.gv()));
            }
        }
        this.y.s(list);
    }

    public void xc(int i) {
        this.y.gv(i);
    }

    public Token zn() {
        return this.y.y();
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String str, @Nullable ComponentName componentName, @Nullable PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String str, @Nullable ComponentName componentName, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String str, @Nullable ComponentName componentName, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable q5.gv gvVar) {
        this.zn = new ArrayList<>();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null && (componentName = g.y.y(context)) == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    this.y = new fb(context, str, gvVar, bundle);
                } else if (i >= 28) {
                    this.y = new a(context, str, gvVar, bundle);
                } else if (i >= 22) {
                    this.y = new v(context, str, gvVar, bundle);
                } else {
                    this.y = new gv(context, str, gvVar, bundle);
                }
                c5(new y(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.y.tl(pendingIntent);
                this.n3 = new MediaControllerCompat(context, this);
                if (f226gv == 0) {
                    f226gv = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public static class a extends v {
        public a(Context context, String str, q5.gv gvVar, Bundle bundle) {
            super(context, str, gvVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.gv, android.support.v4.media.session.MediaSessionCompat.zn
        @NonNull
        public final g3.n3 xc() {
            return new g3.n3(this.y.getCurrentControllerInfo());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.gv, android.support.v4.media.session.MediaSessionCompat.zn
        public void i9(g3.n3 n3Var) {
        }
    }
}
