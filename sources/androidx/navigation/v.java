package androidx.navigation;

import androidx.lifecycle.rz;
import ap.b;
import ap.hw;
import ap.yt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v extends b implements u0.t {
    public final Map<String, hw> y = new LinkedHashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n3 f1001v = new n3(null);

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final rz.n3 f1000fb = new y();

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v y(hw viewModelStore) {
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            return (v) new rz(viewModelStore, v.f1000fb, null, 4, null).y(v.class);
        }

        public n3() {
        }
    }

    public static final class y implements rz.n3 {
        @Override // androidx.lifecycle.rz.n3
        public /* synthetic */ b create(Class cls, yg.y yVar) {
            return yt.n3(this, cls, yVar);
        }

        @Override // androidx.lifecycle.rz.n3
        public <T extends b> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new v();
        }
    }

    @Override // ap.b
    public void onCleared() {
        Iterator<hw> it = this.y.values().iterator();
        while (it.hasNext()) {
            it.next().y();
        }
        this.y.clear();
    }

    public final void t6(String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        hw hwVarRemove = this.y.remove(backStackEntryId);
        if (hwVarRemove != null) {
            hwVarRemove.y();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<String> it = this.y.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    @Override // u0.t
    public hw yt(String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        hw hwVar = this.y.get(backStackEntryId);
        if (hwVar != null) {
            return hwVar;
        }
        hw hwVar2 = new hw();
        this.y.put(backStackEntryId, hwVar2);
        return hwVar2;
    }
}
