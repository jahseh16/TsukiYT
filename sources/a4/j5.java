package a4;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public enum j5 implements ud {
    INSTANCE;


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicReference f35v = new AtomicReference(null);

    public final void y(a8 a8Var) {
        f35v.set(a8Var);
    }

    @Override // a4.ud
    @Nullable
    public final a8 zza() {
        return (a8) f35v.get();
    }
}
