package androidx.room;

import kotlin.jvm.internal.Intrinsics;
import qj.c5;

/* JADX INFO: loaded from: classes.dex */
public final class AutoClosingRoomOpenHelperFactory implements c5.zn {
    private final AutoCloser autoCloser;
    private final c5.zn delegate;

    public AutoClosingRoomOpenHelperFactory(c5.zn delegate, AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
    }

    @Override // qj.c5.zn
    public AutoClosingRoomOpenHelper create(c5.n3 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new AutoClosingRoomOpenHelper(this.delegate.create(configuration), this.autoCloser);
    }
}
