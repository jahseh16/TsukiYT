package qk;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import ap.mt;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qk.y;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class zn {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final n3 f7475fb = new n3(null);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f7477gv;
    public boolean n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y.n3 f7478v;
    public Bundle zn;
    public final mt.n3<String, InterfaceC0151zn> y = new mt.n3<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7476a = true;

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public n3() {
        }
    }

    public interface y {
        void y(v vVar);
    }

    /* JADX INFO: renamed from: qk.zn$zn, reason: collision with other inner class name */
    public interface InterfaceC0151zn {
        Bundle y();
    }

    public static final void gv(zn this$0, mt mtVar, s.y event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mtVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == s.y.ON_START) {
            this$0.f7476a = true;
        } else if (event == s.y.ON_STOP) {
            this$0.f7476a = false;
        }
    }

    public final void a(Bundle bundle) {
        if (!this.n3) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f7477gv) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.zn = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f7477gv = true;
    }

    public final void c5(Class<? extends y> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f7476a) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        y.n3 n3Var = this.f7478v;
        if (n3Var == null) {
            n3Var = new y.n3(this);
        }
        this.f7478v = n3Var;
        try {
            clazz.getDeclaredConstructor(null);
            y.n3 n3Var2 = this.f7478v;
            if (n3Var2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                n3Var2.n3(name);
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }

    public final void fb(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.zn;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        mt.n3<String, InterfaceC0151zn>.gv gvVarZn = this.y.zn();
        Intrinsics.checkNotNullExpressionValue(gvVarZn, "this.components.iteratorWithAdditions()");
        while (gvVarZn.hasNext()) {
            Map.Entry next = gvVarZn.next();
            bundle.putBundle((String) next.getKey(), ((InterfaceC0151zn) next.getValue()).y());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final Bundle n3(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f7477gv) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.zn;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.zn;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.zn;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.zn = null;
        }
        return bundle2;
    }

    public final void s(String key, InterfaceC0151zn provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (this.y.a(key, provider) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void v(s lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.n3) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.y(new t() { // from class: qk.n3
            @Override // androidx.lifecycle.t
            public final void onStateChanged(mt mtVar, s.y yVar) {
                zn.gv(this.y, mtVar, yVar);
            }
        });
        this.n3 = true;
    }

    public final InterfaceC0151zn zn(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        for (Map.Entry<String, InterfaceC0151zn> components : this.y) {
            Intrinsics.checkNotNullExpressionValue(components, "components");
            String key2 = components.getKey();
            InterfaceC0151zn value = components.getValue();
            if (Intrinsics.areEqual(key2, key)) {
                return value;
            }
        }
        return null;
    }
}
