package dk1;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Handler {
    public static final a y = new a();

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        v vVar = v.y;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int iN3 = fb.n3(record);
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        vVar.y(loggerName, iN3, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
