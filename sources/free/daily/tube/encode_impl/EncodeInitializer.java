package free.daily.tube.encode_impl;

import android.content.Context;
import bl1.n3;
import el1.y;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kw.a;
import kw.zn;
import y7.gv;

/* JADX INFO: loaded from: classes.dex */
public final class EncodeInitializer implements gv<Unit> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit create$lambda$1(y module) throws n3 {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        zn znVar = new zn();
        gl1.zn znVarY = hl1.zn.f5343v.y();
        al1.y yVar = new al1.y(znVarY, Reflection.getOrCreateKotlinClass(a.class), null, znVar, al1.gv.Factory, CollectionsKt.emptyList());
        String strY = al1.n3.y(yVar.n3(), null, znVarY);
        cl1.y yVar2 = new cl1.y(yVar);
        y.a(module, strY, yVar2, false, 4, null);
        kl1.y.y(new Pair(module, yVar2), Reflection.getOrCreateKotlinClass(rw.zn.class));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a create$lambda$1$lambda$0(il1.y factory, fl1.y it) {
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new a();
    }

    @Override // y7.gv
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        create2(context);
        return Unit.INSTANCE;
    }

    @Override // y7.gv
    public List<Class<? extends gv<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        zk1.y.y(kl1.n3.n3(false, new kw.n3(), 1, null));
    }
}
