package v3;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public final String y;

    public zn(String str) {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(iMyUid);
        sb.append("]  PID: [");
        sb.append(iMyPid);
        sb.append("] ");
        String string = sb.toString();
        String strValueOf = String.valueOf(str);
        this.y = strValueOf.length() != 0 ? string.concat(strValueOf) : new String(string);
    }

    public static String a(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e4) {
                String strValueOf = String.valueOf(str2);
                Log.e("PlayCore", strValueOf.length() != 0 ? "Unable to format ".concat(strValueOf) : new String("Unable to format "), e4);
                String strJoin = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(strJoin).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(strJoin);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    public final int gv(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", a(this.y, str, objArr));
        }
        return 0;
    }

    public final int n3(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", a(this.y, str, objArr));
        }
        return 0;
    }

    public final int v(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", a(this.y, str, objArr));
        }
        return 0;
    }

    public final int y(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", a(this.y, str, objArr));
        }
        return 0;
    }

    public final int zn(Throwable th, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", a(this.y, str, objArr), th);
        }
        return 0;
    }
}
