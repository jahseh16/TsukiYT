package nr;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final LinkedHashMap<Uri, byte[]> y;

    public class y extends LinkedHashMap<Uri, byte[]> {
        final /* synthetic */ int val$maxSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(v vVar, int i, float f3, boolean z, int i5) {
            super(i, f3, z);
            this.val$maxSize = i5;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.val$maxSize;
        }
    }

    public v(int i) {
        this.y = new y(this, i + 1, 1.0f, false, i);
    }

    @Nullable
    public byte[] n3(Uri uri, byte[] bArr) {
        return this.y.put((Uri) v0.y.v(uri), (byte[]) v0.y.v(bArr));
    }

    @Nullable
    public byte[] y(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.y.get(uri);
    }

    @Nullable
    public byte[] zn(Uri uri) {
        return this.y.remove(v0.y.v(uri));
    }
}
