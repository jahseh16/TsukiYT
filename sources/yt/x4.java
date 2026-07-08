package yt;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class x4 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static Method f9364gv;
    public static Method n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Method f9365v;
    public static long y;
    public static Method zn;

    public static class y {
        public static void n3() {
            Trace.endSection();
        }

        public static void y(String str) {
            Trace.beginSection(str);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                y = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                n3 = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                zn = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f9364gv = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f9365v = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e4) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e4);
            }
        }
    }

    public static void n3() {
        y.n3();
    }

    public static void y(@NonNull String str) {
        y.y(str);
    }
}
