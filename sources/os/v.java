package os;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.List;
import r0.z6;

/* JADX INFO: loaded from: classes.dex */
public final class v implements f {
    public final List<StreamKey> n3;
    public final f y;

    public v(f fVar, List<StreamKey> list) {
        this.y = fVar;
        this.n3 = list;
    }

    @Override // os.f
    public z6.y<c5> n3() {
        return new np.n3(this.y.n3(), this.n3);
    }

    @Override // os.f
    public z6.y<c5> y(s sVar, @Nullable fb fbVar) {
        return new np.n3(this.y.y(sVar, fbVar), this.n3);
    }
}
