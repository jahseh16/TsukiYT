package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mt {

    public static final class y extends xc {
        public final /* synthetic */ Function1<xc, Unit> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(boolean z, Function1<? super xc, Unit> function1) {
            super(z);
            this.y = function1;
        }

        @Override // a.xc
        public void handleOnBackPressed() {
            this.y.invoke(this);
        }
    }

    public static /* synthetic */ xc n3(w wVar, ap.mt mtVar, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            mtVar = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return y(wVar, mtVar, z, function1);
    }

    public static final xc y(w wVar, ap.mt mtVar, boolean z, Function1<? super xc, Unit> onBackPressed) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        y yVar = new y(z, onBackPressed);
        if (mtVar != null) {
            wVar.zn(mtVar, yVar);
        } else {
            wVar.n3(yVar);
        }
        return yVar;
    }
}
