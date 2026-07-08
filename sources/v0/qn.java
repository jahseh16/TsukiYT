package v0;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class qn {
    public static String gv(@Nullable String str, @Nullable String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        if (str2 == null) {
            str2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        int[] iArrY = y(str2);
        if (iArrY[0] != -1) {
            sb.append(str2);
            zn(sb, iArrY[1], iArrY[2]);
            return sb.toString();
        }
        int[] iArrY2 = y(str);
        if (iArrY[3] == 0) {
            sb.append((CharSequence) str, 0, iArrY2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrY[2] == 0) {
            sb.append((CharSequence) str, 0, iArrY2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrY[1];
        if (i != 0) {
            int i5 = iArrY2[0] + 1;
            sb.append((CharSequence) str, 0, i5);
            sb.append(str2);
            return zn(sb, iArrY[1] + i5, i5 + iArrY[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrY2[1]);
            sb.append(str2);
            int i8 = iArrY2[1];
            return zn(sb, i8, iArrY[2] + i8);
        }
        int i10 = iArrY2[0] + 2;
        int i11 = iArrY2[1];
        if (i10 >= i11 || i11 != iArrY2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrY2[2] - 1);
            int i12 = iLastIndexOf == -1 ? iArrY2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i12);
            sb.append(str2);
            return zn(sb, iArrY2[1], i12 + iArrY[2]);
        }
        sb.append((CharSequence) str, 0, i11);
        sb.append('/');
        sb.append(str2);
        int i13 = iArrY2[1];
        return zn(sb, i13, iArrY[2] + i13 + 1);
    }

    public static boolean n3(@Nullable String str) {
        return (str == null || y(str)[0] == -1) ? false : true;
    }

    public static Uri v(@Nullable String str, @Nullable String str2) {
        return Uri.parse(gv(str, str2));
    }

    public static int[] y(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static String zn(StringBuilder sb, int i, int i5) {
        int i8;
        int iLastIndexOf;
        if (i >= i5) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i10 = i;
        int i11 = i10;
        while (i10 <= i5) {
            if (i10 == i5) {
                i8 = i10;
            } else if (sb.charAt(i10) == '/') {
                i8 = i10 + 1;
            } else {
                i10++;
            }
            int i12 = i11 + 1;
            if (i10 == i12 && sb.charAt(i11) == '.') {
                sb.delete(i11, i8);
                i5 -= i8 - i11;
            } else {
                if (i10 == i11 + 2 && sb.charAt(i11) == '.' && sb.charAt(i12) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i11 - 2) + 1;
                    int i13 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i13, i8);
                    i5 -= i8 - i13;
                } else {
                    iLastIndexOf = i10 + 1;
                }
                i11 = iLastIndexOf;
            }
            i10 = i11;
        }
        return sb.toString();
    }
}
