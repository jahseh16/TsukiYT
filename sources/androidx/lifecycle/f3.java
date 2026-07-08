package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.rz;
import androidx.lifecycle.s;
import ap.b;
import ap.ej;
import ap.j5;
import ap.yt;
import ap.z6;
import kotlin.jvm.internal.Intrinsics;
import qk.zn;
import yg.y;

/* JADX INFO: loaded from: classes.dex */
public final class f3 {
    public static final y.n3<qk.v> y = new n3();
    public static final y.n3<j5> n3 = new zn();
    public static final y.n3<Bundle> zn = new y();

    public static final class gv implements rz.n3 {
        @Override // androidx.lifecycle.rz.n3
        public /* synthetic */ b create(Class cls) {
            return yt.y(this, cls);
        }

        @Override // androidx.lifecycle.rz.n3
        public <T extends b> T create(Class<T> modelClass, yg.y extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new ej();
        }
    }

    public static final class n3 implements y.n3<qk.v> {
    }

    public static final class y implements y.n3<Bundle> {
    }

    public static final class zn implements y.n3<j5> {
    }

    public static final z6 gv(qk.v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        zn.InterfaceC0151zn interfaceC0151znZn = vVar.getSavedStateRegistry().zn("androidx.lifecycle.internal.SavedStateHandlesProvider");
        z6 z6Var = interfaceC0151znZn instanceof z6 ? (z6) interfaceC0151znZn : null;
        if (z6Var != null) {
            return z6Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final r n3(yg.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        qk.v vVar = (qk.v) yVar.y(y);
        if (vVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        j5 j5Var = (j5) yVar.y(n3);
        if (j5Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) yVar.y(zn);
        String str = (String) yVar.y(rz.zn.zn);
        if (str != null) {
            return y(vVar, j5Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final ej v(j5 j5Var) {
        Intrinsics.checkNotNullParameter(j5Var, "<this>");
        return (ej) new rz(j5Var, new gv()).n3("androidx.lifecycle.internal.SavedStateHandlesVM", ej.class);
    }

    public static final r y(qk.v vVar, j5 j5Var, String str, Bundle bundle) {
        z6 z6VarGv = gv(vVar);
        ej ejVarV = v(j5Var);
        r rVar = ejVarV.y0().get(str);
        if (rVar != null) {
            return rVar;
        }
        r rVarY = r.f851a.y(z6VarGv.n3(str), bundle);
        ejVarV.y0().put(str, rVarY);
        return rVarY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends qk.v & j5> void zn(T t3) {
        Intrinsics.checkNotNullParameter(t3, "<this>");
        s.n3 n3VarN3 = t3.getLifecycle().n3();
        if (n3VarN3 != s.n3.INITIALIZED && n3VarN3 != s.n3.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t3.getSavedStateRegistry().zn("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            z6 z6Var = new z6(t3.getSavedStateRegistry(), t3);
            t3.getSavedStateRegistry().s("androidx.lifecycle.internal.SavedStateHandlesProvider", z6Var);
            t3.getLifecycle().y(new x4(z6Var));
        }
    }
}
