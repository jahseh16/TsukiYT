package yc;

import androidx.annotation.NonNull;
import ap.j5;
import ap.mt;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    @NonNull
    public static <T extends mt & j5> y n3(@NonNull T t3) {
        return new n3(t3, t3.getViewModelStore());
    }

    @Deprecated
    public abstract void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void zn();
}
