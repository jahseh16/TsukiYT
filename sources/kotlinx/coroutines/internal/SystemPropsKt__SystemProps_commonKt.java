package kotlinx.coroutines.internal;

import com.google.protobuf.Reader;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SystemPropsKt__SystemProps_commonKt {
    public static final boolean systemProp(String str, boolean z) {
        String strSystemProp = SystemPropsKt.systemProp(str);
        return strSystemProp != null ? Boolean.parseBoolean(strSystemProp) : z;
    }

    public static /* synthetic */ int systemProp$default(String str, int i, int i5, int i8, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i5 = 1;
        }
        if ((i10 & 8) != 0) {
            i8 = Reader.READ_DONE;
        }
        return SystemPropsKt.systemProp(str, i, i5, i8);
    }

    public static final int systemProp(String str, int i, int i5, int i8) {
        return (int) SystemPropsKt.systemProp(str, i, i5, i8);
    }

    public static /* synthetic */ long systemProp$default(String str, long j, long j4, long j7, int i, Object obj) {
        if ((i & 4) != 0) {
            j4 = 1;
        }
        long j8 = j4;
        if ((i & 8) != 0) {
            j7 = Long.MAX_VALUE;
        }
        return SystemPropsKt.systemProp(str, j, j8, j7);
    }

    public static final long systemProp(String str, long j, long j4, long j7) {
        String strSystemProp = SystemPropsKt.systemProp(str);
        if (strSystemProp == null) {
            return j;
        }
        Long longOrNull = StringsKt.toLongOrNull(strSystemProp);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strSystemProp + '\'').toString());
        }
        long jLongValue = longOrNull.longValue();
        if (j4 <= jLongValue && jLongValue <= j7) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j7 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String systemProp(String str, String str2) {
        String strSystemProp = SystemPropsKt.systemProp(str);
        return strSystemProp == null ? str2 : strSystemProp;
    }
}
