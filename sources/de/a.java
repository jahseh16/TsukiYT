package de;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements n3 {
    @Nullable
    public abstract Metadata n3(gv gvVar, ByteBuffer byteBuffer);

    @Override // de.n3
    @Nullable
    public final Metadata y(gv gvVar) {
        ByteBuffer byteBuffer = (ByteBuffer) v0.y.v(gvVar.f3179fb);
        v0.y.y(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (gvVar.i9()) {
            return null;
        }
        return n3(gvVar, byteBuffer);
    }
}
