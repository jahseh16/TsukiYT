package qk;

import android.os.Bundle;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import ap.mt;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qk.zn;

/* JADX INFO: loaded from: classes.dex */
public final class y implements t {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0150y f7474v = new C0150y(null);
    public final v y;

    public static final class n3 implements zn.InterfaceC0151zn {
        public final Set<String> y;

        public n3(zn registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.y = new LinkedHashSet();
            registry.s("androidx.savedstate.Restarter", this);
        }

        public final void n3(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.y.add(className);
        }

        @Override // qk.zn.InterfaceC0151zn
        public Bundle y() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.y));
            return bundle;
        }
    }

    /* JADX INFO: renamed from: qk.y$y, reason: collision with other inner class name */
    public static final class C0150y {
        public /* synthetic */ C0150y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0150y() {
        }
    }

    public y(v owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.y = owner;
    }

    @Override // androidx.lifecycle.t
    public void onStateChanged(mt source, s.y event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != s.y.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().gv(this);
        Bundle bundleN3 = this.y.getSavedStateRegistry().n3("androidx.savedstate.Restarter");
        if (bundleN3 == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleN3.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            y(it.next());
        }
    }

    public final void y(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, y.class.getClassLoader()).asSubclass(zn.y.class);
            Intrinsics.checkNotNullExpressionValue(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((zn.y) objNewInstance).y(this.y);
                } catch (Exception e4) {
                    throw new RuntimeException("Failed to instantiate " + str, e4);
                }
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("Class " + str + " wasn't found", e6);
        }
    }
}
