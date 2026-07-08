package kotlinx.coroutines;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ChildHandleNode extends JobCancellingNode implements ChildHandle {
    public final ChildJob childJob;

    public ChildHandleNode(ChildJob childJob) {
        this.childJob = childJob;
    }

    @Override // kotlinx.coroutines.ChildHandle
    public boolean childCancelled(Throwable th) {
        return getJob().childCancelled(th);
    }

    @Override // kotlinx.coroutines.ChildHandle
    public Job getParent() {
        return getJob();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(Throwable th) {
        this.childJob.parentCancelled(getJob());
    }
}
