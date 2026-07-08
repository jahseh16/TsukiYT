package v5;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    @Nullable
    public static Pair<Long, Long> n3(com.google.android.exoplayer2.drm.gv gvVar) {
        Map<String, String> mapA = gvVar.a();
        if (mapA == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(y(mapA, "LicenseDurationRemaining")), Long.valueOf(y(mapA, "PlaybackDurationRemaining")));
    }

    public static long y(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }
}
