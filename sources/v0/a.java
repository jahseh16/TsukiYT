package v0;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final byte[] y = {0, 0, 0, 1};
    public static final String[] n3 = {FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "A", "B", "C"};

    public static Pair<Integer, Integer> a(byte[] bArr) {
        boolean z;
        d dVar = new d(bArr);
        int i = 0;
        int i5 = 0;
        while (true) {
            int i8 = i5 + 3;
            if (i8 >= bArr.length) {
                z = false;
                break;
            }
            if (dVar.x() == 1 && (bArr[i8] & 240) == 32) {
                z = true;
                break;
            }
            dVar.oz(dVar.a() - 2);
            i5++;
        }
        y.n3(z, "Invalid input: VOL not found.");
        ta taVar = new ta(bArr);
        taVar.mt((i5 + 4) * 8);
        taVar.mt(1);
        taVar.mt(8);
        if (taVar.fb()) {
            taVar.mt(4);
            taVar.mt(3);
        }
        if (taVar.s(4) == 15) {
            taVar.mt(8);
            taVar.mt(8);
        }
        if (taVar.fb()) {
            taVar.mt(2);
            taVar.mt(1);
            if (taVar.fb()) {
                taVar.mt(79);
            }
        }
        y.n3(taVar.s(2) == 0, "Only supports rectangular video object layer shape.");
        y.y(taVar.fb());
        int iS = taVar.s(16);
        y.y(taVar.fb());
        if (taVar.fb()) {
            y.y(iS > 0);
            for (int i10 = iS - 1; i10 > 0; i10 >>= 1) {
                i++;
            }
            taVar.mt(i);
        }
        y.y(taVar.fb());
        int iS2 = taVar.s(13);
        y.y(taVar.fb());
        int iS3 = taVar.s(13);
        y.y(taVar.fb());
        taVar.mt(1);
        return Pair.create(Integer.valueOf(iS2), Integer.valueOf(iS3));
    }

    public static boolean c5(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static boolean fb(byte[] bArr, int i) {
        if (bArr.length - i <= y.length) {
            return false;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr2 = y;
            if (i5 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i5] != bArr2[i5]) {
                return false;
            }
            i5++;
        }
    }

    public static byte[] gv(byte[] bArr, int i, int i5) {
        byte[] bArr2 = y;
        byte[] bArr3 = new byte[bArr2.length + i5];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i5);
        return bArr3;
    }

    @Nullable
    public static byte[][] i9(byte[] bArr) {
        if (!fb(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iV = 0;
        do {
            arrayList.add(Integer.valueOf(iV));
            iV = v(bArr, iV + y.length);
        } while (iV != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i = 0;
        while (i < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            int iIntValue2 = (i < arrayList.size() + (-1) ? ((Integer) arrayList.get(i + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i] = bArr3;
            i++;
        }
        return bArr2;
    }

    public static List<byte[]> n3(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static Pair<Integer, Integer> s(byte[] bArr) {
        d dVar = new d(bArr);
        dVar.oz(9);
        int iEj = dVar.ej();
        dVar.oz(20);
        return Pair.create(Integer.valueOf(dVar.b()), Integer.valueOf(iEj));
    }

    public static int v(byte[] bArr, int i) {
        int length = bArr.length - y.length;
        while (i <= length) {
            if (fb(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String y(int i, int i5, int i8) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i8));
    }

    public static String zn(int i, boolean z, int i5, int i8, int[] iArr, int i10) {
        StringBuilder sb = new StringBuilder(ut.rz("hvc1.%s%d.%X.%c%d", n3[i], Integer.valueOf(i5), Integer.valueOf(i8), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i10)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i11 = 0; i11 < length; i11++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i11])));
        }
        return sb.toString();
    }
}
