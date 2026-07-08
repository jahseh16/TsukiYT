package wj1;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public static final String n3(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        return str2;
    }

    public static final void zn(y yVar, gv gvVar, String str) {
        Logger loggerY = v.f9021s.y();
        StringBuilder sb = new StringBuilder();
        sb.append(gvVar.a());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(yVar.n3());
        loggerY.fine(sb.toString());
    }
}
