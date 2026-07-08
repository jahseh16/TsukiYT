package s4;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static void y(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}
