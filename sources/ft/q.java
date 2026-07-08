package ft;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class q extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public q(@Nullable String str, @Nullable Throwable th, boolean z, int i) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = i;
    }

    public static q a(@Nullable String str, @Nullable Throwable th) {
        return new q(str, th, false, 4);
    }

    public static q f(@Nullable String str) {
        return new q(str, null, false, 1);
    }

    public static q gv(@Nullable String str, @Nullable Throwable th) {
        return new q(str, th, true, 4);
    }

    public static q n3(@Nullable String str, @Nullable Throwable th) {
        return new q(str, th, true, 0);
    }

    public static q y(@Nullable String str, @Nullable Throwable th) {
        return new q(str, th, true, 1);
    }
}
