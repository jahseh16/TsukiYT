package kotlin.coroutines.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public final class Boxing {
    public static final Boolean boxBoolean(boolean z) {
        return Boolean.valueOf(z);
    }

    public static final Float boxFloat(float f3) {
        return new Float(f3);
    }

    public static final Integer boxInt(int i) {
        return new Integer(i);
    }

    public static final Long boxLong(long j) {
        return new Long(j);
    }
}
