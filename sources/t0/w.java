package t0;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w implements wz {
    public static final w zn = new w(Collections.emptyMap());
    public final Map<String, byte[]> n3;
    public int y;

    public w() {
        this(Collections.emptyMap());
    }

    public static void c5(HashMap<String, byte[]> map, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            map.remove(list.get(i));
        }
    }

    public static byte[] fb(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(g4.v.zn);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public static Map<String, byte[]> gv(Map<String, byte[]> map, xc xcVar) {
        HashMap map2 = new HashMap(map);
        c5(map2, xcVar.zn());
        zn(map2, xcVar.n3());
        return map2;
    }

    public static boolean s(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static void zn(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), fb(entry.getValue()));
        }
    }

    public Set<Map.Entry<String, byte[]>> a() {
        return this.n3.entrySet();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        return s(this.n3, ((w) obj).n3);
    }

    public int hashCode() {
        if (this.y == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.n3.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.y = iHashCode;
        }
        return this.y;
    }

    @Override // t0.wz
    @Nullable
    public final String n3(String str, @Nullable String str2) {
        byte[] bArr = this.n3.get(str);
        return bArr != null ? new String(bArr, g4.v.zn) : str2;
    }

    public w v(xc xcVar) {
        Map<String, byte[]> mapGv = gv(this.n3, xcVar);
        return s(this.n3, mapGv) ? this : new w(mapGv);
    }

    @Override // t0.wz
    public final long y(String str, long j) {
        byte[] bArr = this.n3.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }

    public w(Map<String, byte[]> map) {
        this.n3 = Collections.unmodifiableMap(map);
    }
}
