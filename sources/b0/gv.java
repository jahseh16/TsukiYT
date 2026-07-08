package b0;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gv {
    public byte[] y(List<n3> list) {
        ArrayList<Bundle> arrayListGv = v0.gv.gv(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListGv);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
