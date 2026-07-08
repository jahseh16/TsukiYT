package i7;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class tl extends di.a {

    @Nullable
    public final z codecInfo;

    @Nullable
    public final String diagnosticInfo;

    public tl(Throwable th, @Nullable z zVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(zVar == null ? null : zVar.y);
        super(sb.toString(), th);
        this.codecInfo = zVar;
        this.diagnosticInfo = ut.y >= 21 ? y(th) : null;
    }

    @Nullable
    public static String y(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
