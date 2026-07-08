package np;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import np.y;
import r0.z6;

/* JADX INFO: loaded from: classes.dex */
public final class n3<T extends y<T>> implements z6.y<T> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final List<StreamKey> f6975v;
    public final z6.y<? extends T> y;

    public n3(z6.y<? extends T> yVar, @Nullable List<StreamKey> list) {
        this.y = yVar;
        this.f6975v = list;
    }

    @Override // r0.z6.y
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public T y(Uri uri, InputStream inputStream) throws IOException {
        T tY = this.y.y(uri, inputStream);
        List<StreamKey> list = this.f6975v;
        return (list == null || list.isEmpty()) ? tY : (T) tY.y(this.f6975v);
    }
}
