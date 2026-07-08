package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.f3;
import androidx.lifecycle.n;
import androidx.lifecycle.r;
import androidx.lifecycle.rz;
import androidx.lifecycle.s;
import ap.b;
import ap.hw;
import ap.j5;
import ap.mt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements mt, j5, androidx.lifecycle.a, qk.v {
    public static final y d0 = new y(null);
    public final rz.n3 c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final qk.gv f1019co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u0.t f1020f;
    public final Lazy f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Bundle f1021fb;
    public s.n3 n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.lifecycle.wz f1022p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f1023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s.n3 f1024s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f1025t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s f1026v;
    public final Bundle w;
    public final Context y;
    public boolean z;

    public static final class gv extends Lambda implements Function0<n> {
        public gv() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            Context context = zn.this.y;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            zn znVar = zn.this;
            return new n(application, znVar, znVar.zn());
        }
    }

    public static final class n3 extends androidx.lifecycle.y {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(qk.v owner) {
            super(owner, null);
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.y
        public <T extends b> T zn(String key, Class<T> modelClass, r handle) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            return new C0027zn(handle);
        }
    }

    public static final class v extends Lambda implements Function0<r> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            if (!zn.this.z) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            }
            if (zn.this.getLifecycle().n3() != s.n3.DESTROYED) {
                return ((C0027zn) new rz(zn.this, new n3(zn.this)).y(C0027zn.class)).y0();
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ zn n3(y yVar, Context context, s sVar, Bundle bundle, s.n3 n3Var, u0.t tVar, String str, Bundle bundle2, int i, Object obj) {
            String str2;
            Bundle bundle3 = (i & 4) != 0 ? null : bundle;
            s.n3 n3Var2 = (i & 8) != 0 ? s.n3.CREATED : n3Var;
            u0.t tVar2 = (i & 16) != 0 ? null : tVar;
            if ((i & 32) != 0) {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                str2 = string;
            } else {
                str2 = str;
            }
            return yVar.y(context, sVar, bundle3, n3Var2, tVar2, str2, (i & 64) != 0 ? null : bundle2);
        }

        public final zn y(Context context, s destination, Bundle bundle, s.n3 hostLifecycleState, u0.t tVar, String id, Bundle bundle2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
            Intrinsics.checkNotNullParameter(id, "id");
            return new zn(context, destination, bundle, hostLifecycleState, tVar, id, bundle2, null);
        }

        public y() {
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.zn$zn, reason: collision with other inner class name */
    public static final class C0027zn extends b {
        public final r y;

        public C0027zn(r handle) {
            Intrinsics.checkNotNullParameter(handle, "handle");
            this.y = handle;
        }

        public final r y0() {
            return this.y;
        }
    }

    public /* synthetic */ zn(Context context, s sVar, Bundle bundle, s.n3 n3Var, u0.t tVar, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, sVar, bundle, n3Var, tVar, str, bundle2);
    }

    public final String a() {
        return this.f1025t;
    }

    public boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj == null || !(obj instanceof zn)) {
            return false;
        }
        zn znVar = (zn) obj;
        if (!Intrinsics.areEqual(this.f1025t, znVar.f1025t) || !Intrinsics.areEqual(this.f1026v, znVar.f1026v) || !Intrinsics.areEqual(getLifecycle(), znVar.getLifecycle()) || !Intrinsics.areEqual(getSavedStateRegistry(), znVar.getSavedStateRegistry())) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f1021fb, znVar.f1021fb)) {
            Bundle bundle = this.f1021fb;
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = setKeySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    Object obj2 = this.f1021fb.get(str);
                    Bundle bundle2 = znVar.f1021fb;
                    if (!Intrinsics.areEqual(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void f(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        this.f1026v = sVar;
    }

    public final s.n3 fb() {
        return this.n;
    }

    @Override // androidx.lifecycle.a
    public yg.y getDefaultViewModelCreationExtras() {
        yg.gv gvVar = new yg.gv(null, 1, null);
        Context context = this.y;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            gvVar.zn(rz.y.f856fb, application);
        }
        gvVar.zn(f3.y, this);
        gvVar.zn(f3.n3, this);
        Bundle bundleZn = zn();
        if (bundleZn != null) {
            gvVar.zn(f3.zn, bundleZn);
        }
        return gvVar;
    }

    @Override // androidx.lifecycle.a
    public rz.n3 getDefaultViewModelProviderFactory() {
        return this.c;
    }

    @Override // ap.mt
    public androidx.lifecycle.s getLifecycle() {
        return this.f1022p;
    }

    @Override // qk.v
    public qk.zn getSavedStateRegistry() {
        return this.f1019co.n3();
    }

    @Override // ap.j5
    public hw getViewModelStore() {
        if (!this.z) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (getLifecycle().n3() == s.n3.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        u0.t tVar = this.f1020f;
        if (tVar != null) {
            return tVar.yt(this.f1025t);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final n gv() {
        return (n) this.f1023r.getValue();
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.f1025t.hashCode() * 31) + this.f1026v.hashCode();
        Bundle bundle = this.f1021fb;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = this.f1021fb.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final void i9(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f1019co.v(outBundle);
    }

    public final void s(s.y event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f1024s = event.gv();
        tl();
    }

    public final void t(s.n3 maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.n = maxState;
        tl();
    }

    public final void tl() {
        if (!this.z) {
            this.f1019co.zn();
            this.z = true;
            if (this.f1020f != null) {
                f3.zn(this);
            }
            this.f1019co.gv(this.w);
        }
        if (this.f1024s.ordinal() < this.n.ordinal()) {
            this.f1022p.xc(this.f1024s);
        } else {
            this.f1022p.xc(this.n);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(zn.class.getSimpleName());
        sb.append('(' + this.f1025t + ')');
        sb.append(" destination=");
        sb.append(this.f1026v);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final s v() {
        return this.f1026v;
    }

    public final Bundle zn() {
        if (this.f1021fb == null) {
            return null;
        }
        return new Bundle(this.f1021fb);
    }

    public zn(Context context, s sVar, Bundle bundle, s.n3 n3Var, u0.t tVar, String str, Bundle bundle2) {
        this.y = context;
        this.f1026v = sVar;
        this.f1021fb = bundle;
        this.f1024s = n3Var;
        this.f1020f = tVar;
        this.f1025t = str;
        this.w = bundle2;
        this.f1022p = new androidx.lifecycle.wz(this);
        this.f1019co = qk.gv.f7473gv.y(this);
        this.f1023r = LazyKt.lazy(new gv());
        this.f3 = LazyKt.lazy(new v());
        this.n = s.n3.INITIALIZED;
        this.c = gv();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zn(zn entry, Bundle bundle) {
        this(entry.y, entry.f1026v, bundle, entry.f1024s, entry.f1020f, entry.f1025t, entry.w);
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f1024s = entry.f1024s;
        t(entry.n);
    }
}
