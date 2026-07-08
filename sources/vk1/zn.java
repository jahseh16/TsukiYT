package vk1;

import androidx.lifecycle.rz;
import ap.a8;
import ap.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static final <T extends b> rz.n3 y(il1.y yVar, n3<T> viewModelParameters) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(viewModelParameters, "viewModelParameters");
        return viewModelParameters.gv() != null ? new a8(yVar, viewModelParameters) : new wk1.y(yVar, viewModelParameters);
    }
}
