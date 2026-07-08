package ak1;

import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f190v;
    public static final v y = new v();
    public static final hk1.s n3 = hk1.s.fb.gv("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] zn = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final String[] f189gv = new String[64];

    static {
        String[] strArr = new String[NotificationCompat.FLAG_LOCAL_ONLY];
        int i = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            String binaryString = Integer.toBinaryString(i5);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i5] = StringsKt.replace$default(tj1.gv.z("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f190v = strArr;
        String[] strArr2 = f189gv;
        strArr2[0] = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i8 = iArr[0];
        strArr2[i8 | 8] = Intrinsics.stringPlus(strArr2[i8], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i10 = 0;
        while (i10 < 3) {
            int i11 = iArr2[i10];
            i10++;
            int i12 = iArr[0];
            String[] strArr3 = f189gv;
            int i13 = i12 | i11;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i12]);
            sb.append('|');
            sb.append((Object) strArr3[i11]);
            strArr3[i13] = sb.toString();
            strArr3[i13 | 8] = ((Object) strArr3[i12]) + '|' + ((Object) strArr3[i11]) + "|PADDED";
        }
        int length = f189gv.length;
        while (i < length) {
            int i14 = i + 1;
            String[] strArr4 = f189gv;
            if (strArr4[i] == null) {
                strArr4[i] = f190v[i];
            }
            i = i14;
        }
    }

    public final String n3(int i) {
        String[] strArr = zn;
        return i < strArr.length ? strArr[i] : tj1.gv.z("0x%02x", Integer.valueOf(i));
    }

    public final String y(int i, int i5) {
        String str;
        if (i5 == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 6) {
                return i5 == 1 ? "ACK" : f190v[i5];
            }
            if (i != 7 && i != 8) {
                String[] strArr = f189gv;
                if (i5 < strArr.length) {
                    str = strArr[i5];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = f190v[i5];
                }
                String str2 = str;
                return (i != 5 || (i5 & 4) == 0) ? (i != 0 || (i5 & 32) == 0) ? str2 : StringsKt.replace$default(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : StringsKt.replace$default(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
            }
        }
        return f190v[i5];
    }

    public final String zn(boolean z, int i, int i5, int i8, int i10) {
        return tj1.gv.z("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i5), n3(i8), y(i8, i10));
    }
}
