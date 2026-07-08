package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import qk.zn;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f851a = new y(null);

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final Class<? extends Object>[] f852fb = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Map<String, MutableStateFlow<Object>> f853gv;
    public final Map<String, zn.InterfaceC0151zn> n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final zn.InterfaceC0151zn f854v;
    public final Map<String, Object> y;
    public final Map<String, n3<?>> zn;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean n3(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : r.f852fb) {
                Intrinsics.checkNotNull(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public final r y(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new r();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new r(map);
            }
            ClassLoader classLoader = r.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(UserMetadata.KEYDATA_FILENAME);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new r(linkedHashMap);
        }

        public y() {
        }
    }

    public r(Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.y = linkedHashMap;
        this.n3 = new LinkedHashMap();
        this.zn = new LinkedHashMap();
        this.f853gv = new LinkedHashMap();
        this.f854v = new zn.InterfaceC0151zn() { // from class: ap.d
            @Override // qk.zn.InterfaceC0151zn
            public final Bundle y() {
                return androidx.lifecycle.r.i9(this.y);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    public static final Bundle i9(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : MapsKt.toMap(this$0.n3).entrySet()) {
            this$0.f((String) entry.getKey(), ((zn.InterfaceC0151zn) entry.getValue()).y());
        }
        Set<String> setKeySet = this$0.y.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.y.get(str));
        }
        return yt.v.y(TuplesKt.to(UserMetadata.KEYDATA_FILENAME, arrayList), TuplesKt.to("values", arrayList2));
    }

    public final <T> ap.d0<T> a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ap.d0<T> d0VarFb = fb(key, false, null);
        Intrinsics.checkNotNull(d0VarFb, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return d0VarFb;
    }

    public final zn.InterfaceC0151zn c5() {
        return this.f854v;
    }

    public final <T> void f(String key, T t3) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!f851a.n3(t3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            Intrinsics.checkNotNull(t3);
            sb.append(t3.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        n3<?> n3Var = this.zn.get(key);
        n3<?> n3Var2 = n3Var instanceof ap.d0 ? n3Var : null;
        if (n3Var2 != null) {
            n3Var2.setValue(t3);
        } else {
            this.y.put(key, t3);
        }
        MutableStateFlow<Object> mutableStateFlow = this.f853gv.get(key);
        if (mutableStateFlow == null) {
            return;
        }
        mutableStateFlow.setValue(t3);
    }

    public final <T> ap.d0<T> fb(String str, boolean z, T t3) {
        n3<?> n3Var;
        n3<?> n3Var2 = this.zn.get(str);
        n3<?> n3Var3 = n3Var2 instanceof ap.d0 ? n3Var2 : null;
        if (n3Var3 != null) {
            return n3Var3;
        }
        if (this.y.containsKey(str)) {
            n3Var = new n3<>(this, str, this.y.get(str));
        } else if (z) {
            this.y.put(str, t3);
            n3Var = new n3<>(this, str, t3);
        } else {
            n3Var = new n3<>(this, str);
        }
        this.zn.put(str, n3Var);
        return n3Var;
    }

    public final <T> T s(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t3 = (T) this.y.remove(key);
        n3<?> n3VarRemove = this.zn.remove(key);
        if (n3VarRemove != null) {
            n3VarRemove.y();
        }
        this.f853gv.remove(key);
        return t3;
    }

    public final <T> T v(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (T) this.y.get(key);
        } catch (ClassCastException unused) {
            s(key);
            return null;
        }
    }

    public static final class n3<T> extends ap.d0<T> {
        public r n3;
        public String y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(r rVar, String key, T t3) {
            super(t3);
            Intrinsics.checkNotNullParameter(key, "key");
            this.y = key;
            this.n3 = rVar;
        }

        @Override // ap.d0, androidx.lifecycle.xc
        public void setValue(T t3) {
            r rVar = this.n3;
            if (rVar != null) {
                rVar.y.put(this.y, t3);
                MutableStateFlow mutableStateFlow = (MutableStateFlow) rVar.f853gv.get(this.y);
                if (mutableStateFlow != null) {
                    mutableStateFlow.setValue(t3);
                }
            }
            super.setValue(t3);
        }

        public final void y() {
            this.n3 = null;
        }

        public n3(r rVar, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.y = key;
            this.n3 = rVar;
        }
    }

    public r() {
        this.y = new LinkedHashMap();
        this.n3 = new LinkedHashMap();
        this.zn = new LinkedHashMap();
        this.f853gv = new LinkedHashMap();
        this.f854v = new zn.InterfaceC0151zn() { // from class: ap.d
            @Override // qk.zn.InterfaceC0151zn
            public final Bundle y() {
                return androidx.lifecycle.r.i9(this.y);
            }
        };
    }
}
