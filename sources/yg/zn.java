package yg;

import androidx.lifecycle.rz;
import ap.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public final List<v<?>> y = new ArrayList();

    public final rz.n3 n3() {
        v[] vVarArr = (v[]) this.y.toArray(new v[0]);
        return new n3((v[]) Arrays.copyOf(vVarArr, vVarArr.length));
    }

    public final <T extends b> void y(KClass<T> clazz, Function1<? super y, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.y.add(new v<>(JvmClassMappingKt.getJavaClass(clazz), initializer));
    }
}
