package androidx.lifecycle;

import androidx.lifecycle.rz;
import ap.b;
import ap.hw;
import kotlin.Lazy;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class fh<VM extends b> implements Lazy<VM> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VM f829f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Function0<rz.n3> f830fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Function0<yg.y> f831s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Function0<hw> f832v;
    public final KClass<VM> y;

    /* JADX WARN: Multi-variable type inference failed */
    public fh(KClass<VM> viewModelClass, Function0<? extends hw> storeProducer, Function0<? extends rz.n3> factoryProducer, Function0<? extends yg.y> extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.y = viewModelClass;
        this.f832v = storeProducer;
        this.f830fb = factoryProducer;
        this.f831s = extrasProducer;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f829f != null;
    }

    @Override // kotlin.Lazy
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm = this.f829f;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new rz(this.f832v.invoke(), this.f830fb.invoke(), this.f831s.invoke()).y(JvmClassMappingKt.getJavaClass(this.y));
        this.f829f = vm2;
        return vm2;
    }
}
