package dk1;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sj1.n;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final Map<String, String> zn;
    public static final v y = new v();
    public static final CopyOnWriteArraySet<Logger> n3 = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = n.class.getPackage();
        String name = r22 == null ? null : r22.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = n.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = ak1.v.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = wj1.v.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        zn = MapsKt.toMap(linkedHashMap);
    }

    public final String gv(String str) {
        String str2 = zn.get(str);
        return str2 == null ? StringsKt.take(str, 23) : str2;
    }

    public final void n3() {
        for (Map.Entry<String, String> entry : zn.entrySet()) {
            zn(entry.getKey(), entry.getValue());
        }
    }

    public final void y(String loggerName, int i, String message, Throwable th) {
        int iMin;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strGv = gv(loggerName);
        if (Log.isLoggable(strGv, i)) {
            if (th != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(th));
            }
            int length = message.length();
            int i5 = 0;
            while (i5 < length) {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) message, '\n', i5, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf$default, i5 + 4000);
                    String strSubstring = message.substring(i5, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, strGv, strSubstring);
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i5 = iMin;
                    }
                }
                i5 = iMin + 1;
            }
        }
    }

    public final void zn(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (n3.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(a.y);
        }
    }
}
