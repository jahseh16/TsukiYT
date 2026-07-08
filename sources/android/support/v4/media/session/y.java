package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.internal.Code;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface y extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.media.session.y$y, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0009y extends Binder implements y {
        public AbstractBinderC0009y() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static y ix() {
            return y.v;
        }

        public static y z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof y)) ? new y(iBinder) : (y) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onEvent(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    yt();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    cs(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    hw(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    i4(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    wf(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    m(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    lc(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onRepeatModeChanged(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    xb(parcel.readInt() != 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    pz(parcel.readInt() != 0);
                    return true;
                case Code.UNIMPLEMENTED /* 12 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    f7(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    x4();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i5);
            }
        }
    }

    void cs(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void f7(int i) throws RemoteException;

    void hw(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void i4(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    void lc(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    void m(Bundle bundle) throws RemoteException;

    void onEvent(String str, Bundle bundle) throws RemoteException;

    void onRepeatModeChanged(int i) throws RemoteException;

    void pz(boolean z) throws RemoteException;

    void wf(CharSequence charSequence) throws RemoteException;

    void x4() throws RemoteException;

    void xb(boolean z) throws RemoteException;

    void yt() throws RemoteException;
}
