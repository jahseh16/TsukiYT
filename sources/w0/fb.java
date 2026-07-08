package w0;

import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class fb extends i7.tl {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public fb(Throwable th, @Nullable i7.z zVar, @Nullable Surface surface) {
        super(th, zVar);
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        this.isSurfaceValid = surface == null || surface.isValid();
    }
}
