package yk;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class r {
    @NonNull
    @Deprecated
    public static r a() {
        i2.i9 i9VarWz = i2.i9.wz();
        if (i9VarWz != null) {
            return i9VarWz;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    @NonNull
    public static r fb(@NonNull Context context) {
        return i2.i9.xc(context);
    }

    public static void s(@NonNull Context context, @NonNull androidx.work.y yVar) {
        i2.i9.s(context, yVar);
    }

    @NonNull
    public final wz gv(@NonNull x4 x4Var) {
        return zn(Collections.singletonList(x4Var));
    }

    @NonNull
    public abstract wz n3(@NonNull String str);

    @NonNull
    public abstract wz v(@NonNull String str, @NonNull gv gvVar, @NonNull w wVar);

    @NonNull
    public abstract wz y(@NonNull String str);

    @NonNull
    public abstract wz zn(@NonNull List<? extends x4> list);
}
