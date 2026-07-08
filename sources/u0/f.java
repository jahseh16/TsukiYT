package u0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final androidx.navigation.t y(Function1<? super androidx.navigation.tl, Unit> optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        androidx.navigation.tl tlVar = new androidx.navigation.tl();
        optionsBuilder.invoke(tlVar);
        return tlVar.n3();
    }
}
