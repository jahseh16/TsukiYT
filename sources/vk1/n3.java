package vk1;

import android.os.Bundle;
import ap.j5;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import qk.v;

/* JADX INFO: loaded from: classes.dex */
public final class n3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f8853a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Function0<fl1.y> f8854gv;
    public final gl1.y n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j5 f8855v;
    public final KClass<T> y;
    public final Function0<Bundle> zn;

    /* JADX WARN: Multi-variable type inference failed */
    public n3(KClass<T> clazz, gl1.y yVar, Function0<Bundle> function0, Function0<? extends fl1.y> function02, j5 viewModelStoreOwner, v vVar) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.y = clazz;
        this.n3 = yVar;
        this.zn = function0;
        this.f8854gv = function02;
        this.f8855v = viewModelStoreOwner;
        this.f8853a = vVar;
    }

    public final v gv() {
        return this.f8853a;
    }

    public final Function0<fl1.y> n3() {
        return this.f8854gv;
    }

    public final Function0<Bundle> v() {
        return this.zn;
    }

    public final KClass<T> y() {
        return this.y;
    }

    public final gl1.y zn() {
        return this.n3;
    }
}
