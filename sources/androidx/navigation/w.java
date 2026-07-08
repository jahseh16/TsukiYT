package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.xc;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"TypeParameterUnusedInFormals"})
public class w {
    public static final y n3 = new y(null);
    public static final Map<Class<?>, String> zn = new LinkedHashMap();
    public final Map<String, xc<? extends s>> y = new LinkedHashMap();

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean n3(String str) {
            return str != null && str.length() > 0;
        }

        public final String y(Class<? extends xc<?>> navigatorClass) {
            Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
            String strValue = (String) w.zn.get(navigatorClass);
            if (strValue == null) {
                xc.n3 n3Var = (xc.n3) navigatorClass.getAnnotation(xc.n3.class);
                strValue = n3Var != null ? n3Var.value() : null;
                if (!n3(strValue)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
                w.zn.put(navigatorClass, strValue);
            }
            Intrinsics.checkNotNull(strValue);
            return strValue;
        }

        public y() {
        }
    }

    public <T extends xc<?>> T gv(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!n3.n3(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        xc<? extends s> xcVar = this.y.get(name);
        if (xcVar != null) {
            return xcVar;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final xc<? extends s> n3(xc<? extends s> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return zn(n3.y(navigator.getClass()), navigator);
    }

    public final Map<String, xc<? extends s>> v() {
        return MapsKt.toMap(this.y);
    }

    public xc<? extends s> zn(String name, xc<? extends s> navigator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (!n3.n3(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        xc<? extends s> xcVar = this.y.get(name);
        if (Intrinsics.areEqual(xcVar, navigator)) {
            return navigator;
        }
        boolean z = false;
        if (xcVar != null && xcVar.zn()) {
            z = true;
        }
        if (z) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + xcVar).toString());
        }
        if (!navigator.zn()) {
            return this.y.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }
}
