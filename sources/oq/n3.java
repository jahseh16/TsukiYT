package oq;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public final List<y> n3;
    public final long y;

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final long f7185gv;
        public final String n3;
        public final String y;
        public final long zn;

        public y(String str, String str2, long j, long j4) {
            this.y = str;
            this.n3 = str2;
            this.zn = j;
            this.f7185gv = j4;
        }
    }

    public n3(long j, List<y> list) {
        this.y = j;
        this.n3 = list;
    }

    @Nullable
    public MotionPhotoMetadata y(long j) {
        long j4;
        if (this.n3.size() < 2) {
            return null;
        }
        long j7 = j;
        long j8 = -1;
        long j9 = -1;
        long j10 = -1;
        long j11 = -1;
        boolean z = false;
        for (int size = this.n3.size() - 1; size >= 0; size--) {
            y yVar = this.n3.get(size);
            boolean zEquals = "video/mp4".equals(yVar.y) | z;
            if (size == 0) {
                j7 -= yVar.f7185gv;
                j4 = 0;
            } else {
                j4 = j7 - yVar.zn;
            }
            long j12 = j7;
            j7 = j4;
            if (!zEquals || j7 == j12) {
                z = zEquals;
            } else {
                j11 = j12 - j7;
                j10 = j7;
                z = false;
            }
            if (size == 0) {
                j8 = j7;
                j9 = j12;
            }
        }
        if (j10 == -1 || j11 == -1 || j8 == -1 || j9 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j8, j9, this.y, j10, j11);
    }
}
