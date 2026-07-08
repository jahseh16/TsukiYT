package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.y;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.internal.Code;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface n3 extends IInterface {

    public static abstract class y extends Binder implements n3 {

        /* JADX INFO: renamed from: android.support.v4.media.session.n3$y$y, reason: collision with other inner class name */
        public static class C0008y implements n3 {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static n3 f273v;
            public IBinder y;

            public C0008y(IBinder iBinder) {
                this.y = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.y;
            }

            @Override // android.support.v4.media.session.n3
            public void e(android.support.v4.media.session.y yVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(yVar != null ? yVar.asBinder() : null);
                    if (this.y.transact(3, parcelObtain, parcelObtain2, 0) || y.ix() == null) {
                        parcelObtain2.readException();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } else {
                        y.ix().e(yVar);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.n3
            public MediaMetadataCompat getMetadata() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.y.transact(27, parcelObtain, parcelObtain2, 0) && y.ix() != null) {
                        return y.ix().getMetadata();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.n3
            public PlaybackStateCompat n3() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.y.transact(28, parcelObtain, parcelObtain2, 0) && y.ix() != null) {
                        return y.ix().n3();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.n3
            public boolean x(KeyEvent keyEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (keyEvent != null) {
                        parcelObtain.writeInt(1);
                        keyEvent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.y.transact(2, parcelObtain, parcelObtain2, 0) && y.ix() != null) {
                        boolean zX = y.ix().x(keyEvent);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zX;
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.n3
            public List<MediaSessionCompat.QueueItem> zn() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.y.transact(29, parcelObtain, parcelObtain2, 0) && y.ix() != null) {
                        return y.ix().zn();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public y() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static n3 ix() {
            return C0008y.f273v;
        }

        public static n3 z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n3)) ? new C0008y(iBinder) : (n3) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    jz(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zX = x(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zX ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    e(y.AbstractBinderC0009y.z(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    bk(y.AbstractBinderC0009y.z(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zKp = kp();
                    parcel2.writeNoException();
                    parcel2.writeInt(zKp ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String packageName = getPackageName();
                    parcel2.writeNoException();
                    parcel2.writeString(packageName);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent pendingIntentMt = mt();
                    parcel2.writeNoException();
                    if (pendingIntentMt != null) {
                        parcel2.writeInt(1);
                        pendingIntentMt.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long jS = s();
                    parcel2.writeNoException();
                    parcel2.writeLong(jS);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ParcelableVolumeInfo parcelableVolumeInfoVp = vp();
                    parcel2.writeNoException();
                    if (parcelableVolumeInfoVp != null) {
                        parcel2.writeInt(1);
                        parcelableVolumeInfoVp.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    cy(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case Code.UNIMPLEMENTED /* 12 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ap(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    play();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    d(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    z6(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ej(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    xg(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    parcel2.writeNoException();
                    return true;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    parcel2.writeNoException();
                    return true;
                case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    parcel2.writeNoException();
                    return true;
                case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    y4();
                    parcel2.writeNoException();
                    return true;
                case ConnectionResult.API_DISABLED /* 23 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    u();
                    parcel2.writeNoException();
                    return true;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    fb(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    s8(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    i9(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaMetadataCompat metadata = getMetadata();
                    parcel2.writeNoException();
                    if (metadata != null) {
                        parcel2.writeInt(1);
                        metadata.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat playbackStateCompatN3 = n3();
                    parcel2.writeNoException();
                    if (playbackStateCompatN3 != null) {
                        parcel2.writeInt(1);
                        playbackStateCompatN3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    List<MediaSessionCompat.QueueItem> listZn = zn();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(listZn);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence charSequenceU0 = u0();
                    parcel2.writeNoException();
                    if (charSequenceU0 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(charSequenceU0, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    if (extras != null) {
                        parcel2.writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iR = r();
                    parcel2.writeNoException();
                    parcel2.writeInt(iR);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepare();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    d0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    g3(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    xc(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iC5 = c5();
                    parcel2.writeNoException();
                    parcel2.writeInt(iC5);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zT = t();
                    parcel2.writeNoException();
                    parcel2.writeInt(zT ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    gv(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    dm(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    rb(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    vl(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    yc(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ut(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zQ9 = q9();
                    parcel2.writeNoException();
                    parcel2.writeInt(zQ9 ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    qj(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iOz = oz();
                    parcel2.writeNoException();
                    parcel2.writeInt(iOz);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    v(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    o0(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle bundleFh = fh();
                    parcel2.writeNoException();
                    if (bundleFh != null) {
                        parcel2.writeInt(1);
                        bundleFh.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    k5(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i5);
            }
        }
    }

    void ap(int i, int i5, String str) throws RemoteException;

    void bk(android.support.v4.media.session.y yVar) throws RemoteException;

    int c5() throws RemoteException;

    void cy(int i, int i5, String str) throws RemoteException;

    void d(String str, Bundle bundle) throws RemoteException;

    void d0(String str, Bundle bundle) throws RemoteException;

    void dm(boolean z) throws RemoteException;

    void e(android.support.v4.media.session.y yVar) throws RemoteException;

    void ej(Uri uri, Bundle bundle) throws RemoteException;

    void fb(long j) throws RemoteException;

    Bundle fh() throws RemoteException;

    void g3(String str, Bundle bundle) throws RemoteException;

    Bundle getExtras() throws RemoteException;

    MediaMetadataCompat getMetadata() throws RemoteException;

    String getPackageName() throws RemoteException;

    String getTag() throws RemoteException;

    void gv(int i) throws RemoteException;

    void i9(String str, Bundle bundle) throws RemoteException;

    void jz(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    void k5(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    boolean kp() throws RemoteException;

    PendingIntent mt() throws RemoteException;

    PlaybackStateCompat n3() throws RemoteException;

    void next() throws RemoteException;

    void o0(float f3) throws RemoteException;

    int oz() throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    void prepare() throws RemoteException;

    void previous() throws RemoteException;

    boolean q9() throws RemoteException;

    void qj(boolean z) throws RemoteException;

    int r() throws RemoteException;

    void rb(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    long s() throws RemoteException;

    void s8(RatingCompat ratingCompat) throws RemoteException;

    void stop() throws RemoteException;

    boolean t() throws RemoteException;

    void u() throws RemoteException;

    CharSequence u0() throws RemoteException;

    void ut(int i) throws RemoteException;

    void v(int i) throws RemoteException;

    void vl(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    ParcelableVolumeInfo vp() throws RemoteException;

    boolean x(KeyEvent keyEvent) throws RemoteException;

    void xc(Uri uri, Bundle bundle) throws RemoteException;

    void xg(long j) throws RemoteException;

    void y4() throws RemoteException;

    void yc(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void z6(String str, Bundle bundle) throws RemoteException;

    List<MediaSessionCompat.QueueItem> zn() throws RemoteException;
}
