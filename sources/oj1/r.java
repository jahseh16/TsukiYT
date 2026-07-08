package oj1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final <K, V> Map<K, V> y(int i) {
        return new ConcurrentHashMap(i);
    }
}
