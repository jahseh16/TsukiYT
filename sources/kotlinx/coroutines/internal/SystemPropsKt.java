package kotlinx.coroutines.internal;

/* JADX INFO: loaded from: classes.dex */
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(String str, int i, int i5, int i8) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, i, i5, i8);
    }

    public static final long systemProp(String str, long j, long j4, long j7) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, j, j4, j7);
    }

    public static final String systemProp(String str) {
        return SystemPropsKt__SystemPropsKt.systemProp(str);
    }

    public static final String systemProp(String str, String str2) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, str2);
    }

    public static final boolean systemProp(String str, boolean z) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, z);
    }
}
