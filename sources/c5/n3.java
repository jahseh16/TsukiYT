package c5;

import android.content.Context;
import android.content.Intent;
import c5.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends c5.y<String[], Map<String, Boolean>> {
    public static final y y = new y(null);

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent y(String[] input) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        public y() {
        }
    }

    @Override // c5.y
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public y.C0046y<Map<String, Boolean>> getSynchronousResult(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return new y.C0046y<>(MapsKt.emptyMap());
        }
        for (String str : input) {
            if (d.y.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(input.length), 16));
        for (String str2 : input) {
            Pair pair = TuplesKt.to(str2, Boolean.TRUE);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return new y.C0046y<>(linkedHashMap);
    }

    @Override // c5.y
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return y.y(input);
    }

    @Override // c5.y
    /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> parseResult(int i, Intent intent) {
        if (i != -1) {
            return MapsKt.emptyMap();
        }
        if (intent == null) {
            return MapsKt.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return MapsKt.emptyMap();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i5 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i5 == 0));
        }
        return MapsKt.toMap(CollectionsKt.zip(ArraysKt.filterNotNull(stringArrayExtra), arrayList));
    }
}
