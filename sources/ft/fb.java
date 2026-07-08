package ft;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.List;
import k4.r;

/* JADX INFO: loaded from: classes.dex */
public final class fb extends Binder {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f4740v;
    public final k4.r<Bundle> y;

    static {
        f4740v = v0.ut.y >= 30 ? dp.ta.y() : 65536;
    }

    public fb(List<Bundle> list) {
        this.y = k4.r.rz(list);
    }

    public static k4.r<Bundle> y(IBinder iBinder) {
        int i;
        r.y yVarN = k4.r.n();
        int i5 = 1;
        int i8 = 0;
        while (i5 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i8);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            yVarN.y((Bundle) v0.y.v(parcelObtain2.readBundle()));
                            i8++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i5 = i;
                } catch (RemoteException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return yVarN.f();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, @Nullable Parcel parcel2, int i5) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i5);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.y.size();
        int i8 = parcel.readInt();
        while (i8 < size && parcel2.dataSize() < f4740v) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.y.get(i8));
            i8++;
        }
        parcel2.writeInt(i8 < size ? 2 : 0);
        return true;
    }
}
