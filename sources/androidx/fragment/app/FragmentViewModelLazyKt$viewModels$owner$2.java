package androidx.fragment.app;

import ap.j5;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentViewModelLazyKt$viewModels$owner$2 extends Lambda implements Function0<j5> {
    final /* synthetic */ Function0<j5> $ownerProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$owner$2(Function0<? extends j5> function0) {
        super(0);
        this.$ownerProducer = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final j5 invoke() {
        return this.$ownerProducer.invoke();
    }
}
