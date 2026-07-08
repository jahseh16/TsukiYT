package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ta.i4;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentTransition {
    public static final FragmentTransition INSTANCE;
    public static final FragmentTransitionImpl PLATFORM_IMPL;
    public static final FragmentTransitionImpl SUPPORT_IMPL;

    static {
        FragmentTransition fragmentTransition = new FragmentTransition();
        INSTANCE = fragmentTransition;
        PLATFORM_IMPL = new FragmentTransitionCompat21();
        SUPPORT_IMPL = fragmentTransition.resolveSupportImpl();
    }

    private FragmentTransition() {
    }

    public static final void callSharedElementStartEnd(Fragment inFragment, Fragment outFragment, boolean z, x4.y<String, View> sharedElements, boolean z5) {
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        i4 enterTransitionCallback = z ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (z5) {
                enterTransitionCallback.fb(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.a(arrayList2, arrayList, null);
            }
        }
    }

    public static final String findKeyForValue(x4.y<String, String> yVar, String value) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : yVar.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) CollectionsKt.firstOrNull((List) arrayList);
    }

    private final FragmentTransitionImpl resolveSupportImpl() {
        try {
            Intrinsics.checkNotNull(w2.v.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (FragmentTransitionImpl) w2.v.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void retainValues(x4.y<String, String> yVar, x4.y<String, View> namedViews) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        int size = yVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey(yVar.xc(size))) {
                yVar.tl(size);
            }
        }
    }

    public static final void setViewVisibility(List<? extends View> views, int i) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }

    public static final boolean supportsTransition() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }
}
