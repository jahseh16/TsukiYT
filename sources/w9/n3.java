package w9;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public static Method n3;
    public static long y;

    @SuppressLint({"NewApi"})
    public static boolean gv() {
        try {
            if (n3 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return v();
    }

    public static void n3() {
        zn.n3();
    }

    public static boolean v() {
        try {
            if (n3 == null) {
                y = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                n3 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) n3.invoke(null, Long.valueOf(y))).booleanValue();
        } catch (Exception e4) {
            zn("isTagEnabled", e4);
            return false;
        }
    }

    public static void y(@NonNull String str) {
        zn.y(str);
    }

    public static void zn(@NonNull String str, @NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }
}
