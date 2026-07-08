package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.fb;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface y extends r0.tl {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.y$y, reason: collision with other inner class name */
    public interface InterfaceC0057y {
        @Nullable
        InterfaceC0057y n3();

        y y(int i) throws IOException;
    }

    int gv();

    @Nullable
    fb.n3 t();

    String zn();
}
