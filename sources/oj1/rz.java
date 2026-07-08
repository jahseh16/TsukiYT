package oj1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import oj1.x4;

/* JADX INFO: loaded from: classes.dex */
public final class rz {
    public static final x4.y<Map<String, Integer>> y = new x4.y<>();

    public /* synthetic */ class y extends FunctionReferenceImpl implements Function0<Map<String, ? extends Integer>> {
        public y(Object obj) {
            super(0, obj, rz.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Map<String, Integer> invoke() {
            return rz.y((kj1.a) this.receiver);
        }
    }

    public static /* synthetic */ int a(kj1.a aVar, nj1.y yVar, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        return v(aVar, yVar, str, str2);
    }

    public static final int gv(kj1.a aVar, nj1.y json, String name) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        int iZn = aVar.zn(name);
        if (iZn != -3 || !json.v().i9()) {
            return iZn;
        }
        Integer num = (Integer) ((Map) nj1.c.y(json).n3(aVar, y, new y(aVar))).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final void n3(Map<String, Integer> map, kj1.a aVar, String str, int i) {
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        throw new d0("The suggested name '" + str + "' for property " + aVar.v(i) + " is already one of the names for property " + aVar.v(((Number) MapsKt.getValue(map, str)).intValue()) + " in " + aVar);
    }

    public static final int v(kj1.a aVar, nj1.y json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int iGv = gv(aVar, json, name);
        if (iGv != -3) {
            return iGv;
        }
        throw new ij1.i9(aVar.s() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final Map<String, Integer> y(kj1.a aVar) {
        String[] strArrNames;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int iGv = aVar.gv();
        Map<String, Integer> mapY = null;
        for (int i = 0; i < iGv; i++) {
            List<Annotation> listA = aVar.a(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (obj instanceof nj1.mt) {
                    arrayList.add(obj);
                }
            }
            nj1.mt mtVar = (nj1.mt) CollectionsKt.singleOrNull(arrayList);
            if (mtVar != null && (strArrNames = mtVar.names()) != null) {
                for (String str : strArrNames) {
                    if (mapY == null) {
                        mapY = r.y(aVar.gv());
                    }
                    Intrinsics.checkNotNull(mapY);
                    n3(mapY, aVar, str, i);
                }
            }
        }
        return mapY == null ? MapsKt.emptyMap() : mapY;
    }

    public static final x4.y<Map<String, Integer>> zn() {
        return y;
    }
}
