package b0;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import k4.r;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public r<n3> y(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return v0.gv.n3(n3.dm, (ArrayList) v0.y.v(bundle.getParcelableArrayList("c")));
    }
}
