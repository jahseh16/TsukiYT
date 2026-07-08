package b0;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends di.i9<wz, xc, f> implements i9 {

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final String f1230wz;

    public class y extends xc {
        public y() {
        }

        @Override // di.s
        public void p() {
            s.this.mt(this);
        }
    }

    public s(String str) {
        super(new wz[2], new xc[2]);
        this.f1230wz = str;
        r(UserMetadata.MAX_ATTRIBUTE_SIZE);
    }

    public abstract c5 c(byte[] bArr, int i, boolean z) throws f;

    @Override // di.i9
    @Nullable
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final f i9(wz wzVar, xc xcVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) v0.y.v(wzVar.f3179fb);
            xcVar.mt(wzVar.f3178f, c(byteBuffer.array(), byteBuffer.limit(), z), wzVar.f1240co);
            xcVar.fb(Integer.MIN_VALUE);
            return null;
        } catch (f e4) {
            return e4;
        }
    }

    @Override // di.i9
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final xc s() {
        return new y();
    }

    @Override // di.i9
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public final wz fb() {
        return new wz();
    }

    @Override // di.i9
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final f c5(Throwable th) {
        return new f("Unexpected decode error", th);
    }

    @Override // b0.i9
    public void y(long j) {
    }
}
