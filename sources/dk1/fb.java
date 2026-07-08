package dk1;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes.dex */
public final class fb {
    public static final int n3(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }
}
