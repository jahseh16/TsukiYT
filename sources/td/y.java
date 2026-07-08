package td;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import de.a;
import de.gv;
import g4.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import v0.ta;

/* JADX INFO: loaded from: classes.dex */
public final class y extends a {
    @Nullable
    public static Metadata zn(ta taVar) {
        taVar.mt(12);
        int iGv = (taVar.gv() + taVar.s(12)) - 4;
        taVar.mt(44);
        taVar.co(taVar.s(12));
        taVar.mt(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strT = null;
            if (taVar.gv() >= iGv) {
                break;
            }
            taVar.mt(48);
            int iS = taVar.s(8);
            taVar.mt(4);
            int iGv2 = taVar.gv() + taVar.s(12);
            String strT2 = null;
            while (taVar.gv() < iGv2) {
                int iS2 = taVar.s(8);
                int iS3 = taVar.s(8);
                int iGv3 = taVar.gv() + iS3;
                if (iS2 == 2) {
                    int iS4 = taVar.s(16);
                    taVar.mt(8);
                    if (iS4 == 3) {
                        while (taVar.gv() < iGv3) {
                            strT = taVar.t(taVar.s(8), v.y);
                            int iS5 = taVar.s(8);
                            for (int i = 0; i < iS5; i++) {
                                taVar.co(taVar.s(8));
                            }
                        }
                    }
                } else if (iS2 == 21) {
                    strT2 = taVar.t(iS3, v.y);
                }
                taVar.w(iGv3 * 8);
            }
            taVar.w(iGv2 * 8);
            if (strT != null && strT2 != null) {
                arrayList.add(new AppInfoTable(iS, strT + strT2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // de.a
    @Nullable
    public Metadata n3(gv gvVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return zn(new ta(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
