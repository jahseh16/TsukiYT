package kotlinx.coroutines;

import i4.n3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeLinkedListKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes.dex */
public class JobSupport implements Job, ChildJob, ParentJob {
    private volatile Object _parentHandle;
    private volatile Object _state;
    private static final AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
    private static final AtomicReferenceFieldUpdater _parentHandle$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle");

    public static final class AwaitContinuation<T> extends CancellableContinuationImpl<T> {
        private final JobSupport job;

        public AwaitContinuation(Continuation<? super T> continuation, JobSupport jobSupport) {
            super(continuation, 1);
            this.job = jobSupport;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public Throwable getContinuationCancellationCause(Job job) {
            Throwable rootCause;
            Object state$kotlinx_coroutines_core = this.job.getState$kotlinx_coroutines_core();
            return (!(state$kotlinx_coroutines_core instanceof Finishing) || (rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause()) == null) ? state$kotlinx_coroutines_core instanceof CompletedExceptionally ? ((CompletedExceptionally) state$kotlinx_coroutines_core).cause : job.getCancellationException() : rootCause;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public String nameString() {
            return "AwaitContinuation";
        }
    }

    public static final class ChildCompletion extends JobNode {
        private final ChildHandleNode child;
        private final JobSupport parent;
        private final Object proposedUpdate;
        private final Finishing state;

        public ChildCompletion(JobSupport jobSupport, Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
            this.parent = jobSupport;
            this.state = finishing;
            this.child = childHandleNode;
            this.proposedUpdate = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(Throwable th) {
            this.parent.continueCompleting(this.state, this.child, this.proposedUpdate);
        }
    }

    public static final class Finishing implements Incomplete {
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;
        private final NodeList list;
        private static final AtomicIntegerFieldUpdater _isCompleting$FU = AtomicIntegerFieldUpdater.newUpdater(Finishing.class, "_isCompleting");
        private static final AtomicReferenceFieldUpdater _rootCause$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_rootCause");
        private static final AtomicReferenceFieldUpdater _exceptionsHolder$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_exceptionsHolder");

        public Finishing(NodeList nodeList, boolean z, Throwable th) {
            this.list = nodeList;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> allocateList() {
            return new ArrayList<>(4);
        }

        private final Object getExceptionsHolder() {
            return _exceptionsHolder$FU.get(this);
        }

        private final void setExceptionsHolder(Object obj) {
            _exceptionsHolder$FU.set(this, obj);
        }

        public final void addExceptionLocked(Throwable th) {
            Throwable rootCause = getRootCause();
            if (rootCause == null) {
                setRootCause(th);
                return;
            }
            if (th == rootCause) {
                return;
            }
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                setExceptionsHolder(th);
                return;
            }
            if (exceptionsHolder instanceof Throwable) {
                if (th == exceptionsHolder) {
                    return;
                }
                ArrayList<Throwable> arrayListAllocateList = allocateList();
                arrayListAllocateList.add(exceptionsHolder);
                arrayListAllocateList.add(th);
                setExceptionsHolder(arrayListAllocateList);
                return;
            }
            if (exceptionsHolder instanceof ArrayList) {
                ((ArrayList) exceptionsHolder).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + exceptionsHolder).toString());
        }

        @Override // kotlinx.coroutines.Incomplete
        public NodeList getList() {
            return this.list;
        }

        public final Throwable getRootCause() {
            return (Throwable) _rootCause$FU.get(this);
        }

        @Override // kotlinx.coroutines.Incomplete
        public boolean isActive() {
            return getRootCause() == null;
        }

        public final boolean isCancelling() {
            return getRootCause() != null;
        }

        public final boolean isCompleting() {
            return _isCompleting$FU.get(this) != 0;
        }

        public final boolean isSealed() {
            return getExceptionsHolder() == JobSupportKt.SEALED;
        }

        public final List<Throwable> sealLocked(Throwable th) {
            ArrayList<Throwable> arrayListAllocateList;
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                arrayListAllocateList = allocateList();
            } else if (exceptionsHolder instanceof Throwable) {
                ArrayList<Throwable> arrayListAllocateList2 = allocateList();
                arrayListAllocateList2.add(exceptionsHolder);
                arrayListAllocateList = arrayListAllocateList2;
            } else {
                if (!(exceptionsHolder instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + exceptionsHolder).toString());
                }
                arrayListAllocateList = (ArrayList) exceptionsHolder;
            }
            Throwable rootCause = getRootCause();
            if (rootCause != null) {
                arrayListAllocateList.add(0, rootCause);
            }
            if (th != null && !Intrinsics.areEqual(th, rootCause)) {
                arrayListAllocateList.add(th);
            }
            setExceptionsHolder(JobSupportKt.SEALED);
            return arrayListAllocateList;
        }

        public final void setCompleting(boolean z) {
            _isCompleting$FU.set(this, z ? 1 : 0);
        }

        public final void setRootCause(Throwable th) {
            _rootCause$FU.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + isCompleting() + ", rootCause=" + getRootCause() + ", exceptions=" + getExceptionsHolder() + ", list=" + getList() + ']';
        }
    }

    public final class SelectOnAwaitCompletionHandler extends JobNode {
        private final SelectInstance<?> select;

        public SelectOnAwaitCompletionHandler(SelectInstance<?> selectInstance) {
            this.select = selectInstance;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(Throwable th) {
            Object state$kotlinx_coroutines_core = JobSupport.this.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                state$kotlinx_coroutines_core = JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
            this.select.trySelect(JobSupport.this, state$kotlinx_coroutines_core);
        }
    }

    public JobSupport(boolean z) {
        this._state = z ? JobSupportKt.EMPTY_ACTIVE : JobSupportKt.EMPTY_NEW;
    }

    private final boolean addLastAtomic(final Object obj, NodeList nodeList, final JobNode jobNode) {
        int iTryCondAddNext;
        LockFreeLinkedListNode.CondAddOp condAddOp = new LockFreeLinkedListNode.CondAddOp(jobNode) { // from class: kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1
            @Override // kotlinx.coroutines.internal.AtomicOp
            public Object prepare(LockFreeLinkedListNode lockFreeLinkedListNode) {
                if (this.getState$kotlinx_coroutines_core() == obj) {
                    return null;
                }
                return LockFreeLinkedListKt.getCONDITION_FALSE();
            }
        };
        do {
            iTryCondAddNext = nodeList.getPrevNode().tryCondAddNext(jobNode, nodeList, condAddOp);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    private final void addSuppressedExceptions(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable thUnwrapImpl = !DebugKt.getRECOVER_STACK_TRACES() ? th : StackTraceRecoveryKt.unwrapImpl(th);
        for (Throwable thUnwrapImpl2 : list) {
            if (DebugKt.getRECOVER_STACK_TRACES()) {
                thUnwrapImpl2 = StackTraceRecoveryKt.unwrapImpl(thUnwrapImpl2);
            }
            if (thUnwrapImpl2 != th && thUnwrapImpl2 != thUnwrapImpl && !(thUnwrapImpl2 instanceof CancellationException) && setNewSetFromMap.add(thUnwrapImpl2)) {
                kotlin.ExceptionsKt.addSuppressed(th, thUnwrapImpl2);
            }
        }
    }

    private final Object awaitSuspend(Continuation<Object> continuation) {
        AwaitContinuation awaitContinuation = new AwaitContinuation(IntrinsicsKt.intercepted(continuation), this);
        awaitContinuation.initCancellability();
        CancellableContinuationKt.disposeOnCancellation(awaitContinuation, invokeOnCompletion(new ResumeAwaitOnCompletion(awaitContinuation)));
        Object result = awaitContinuation.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    private final Object cancelMakeCompleting(Object obj) {
        Object objTryMakeCompleting;
        do {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete) || ((state$kotlinx_coroutines_core instanceof Finishing) && ((Finishing) state$kotlinx_coroutines_core).isCompleting())) {
                return JobSupportKt.COMPLETING_ALREADY;
            }
            objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new CompletedExceptionally(createCauseException(obj), false, 2, null));
        } while (objTryMakeCompleting == JobSupportKt.COMPLETING_RETRY);
        return objTryMakeCompleting;
    }

    private final boolean cancelParent(Throwable th) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        return (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == NonDisposableHandle.INSTANCE) ? z : parentHandle$kotlinx_coroutines_core.childCancelled(th) || z;
    }

    private final void completeStateFinalization(Incomplete incomplete, Object obj) throws Throwable {
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        }
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        if (!(incomplete instanceof JobNode)) {
            NodeList list = incomplete.getList();
            if (list != null) {
                notifyCompletion(list, th);
                return;
            }
            return;
        }
        try {
            ((JobNode) incomplete).invoke(th);
        } catch (Throwable th2) {
            handleOnCompletionException$kotlinx_coroutines_core(new CompletionHandlerException("Exception in completion handler " + incomplete + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void continueCompleting(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        if (DebugKt.getASSERTIONS_ENABLED() && getState$kotlinx_coroutines_core() != finishing) {
            throw new AssertionError();
        }
        ChildHandleNode childHandleNodeNextChild = nextChild(childHandleNode);
        if (childHandleNodeNextChild == null || !tryWaitForChild(finishing, childHandleNodeNextChild, obj)) {
            afterCompletion(finalizeFinishingState(finishing, obj));
        }
    }

    private final Throwable createCauseException(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(cancellationExceptionMessage(), null, this) : th;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ParentJob) obj).getChildJobCancellationCause();
    }

    private final Object finalizeFinishingState(Finishing finishing, Object obj) throws Throwable {
        boolean zIsCancelling;
        Throwable finalRootCause;
        if (DebugKt.getASSERTIONS_ENABLED() && getState$kotlinx_coroutines_core() != finishing) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && finishing.isSealed()) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && !finishing.isCompleting()) {
            throw new AssertionError();
        }
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        synchronized (finishing) {
            zIsCancelling = finishing.isCancelling();
            List<Throwable> listSealLocked = finishing.sealLocked(th);
            finalRootCause = getFinalRootCause(finishing, listSealLocked);
            if (finalRootCause != null) {
                addSuppressedExceptions(finalRootCause, listSealLocked);
            }
        }
        if (finalRootCause != null && finalRootCause != th) {
            obj = new CompletedExceptionally(finalRootCause, false, 2, null);
        }
        if (finalRootCause != null && (cancelParent(finalRootCause) || handleJobException(finalRootCause))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((CompletedExceptionally) obj).makeHandled();
        }
        if (!zIsCancelling) {
            onCancelling(finalRootCause);
        }
        onCompletionInternal(obj);
        boolean zY = n3.y(_state$FU, this, finishing, JobSupportKt.boxIncomplete(obj));
        if (DebugKt.getASSERTIONS_ENABLED() && !zY) {
            throw new AssertionError();
        }
        completeStateFinalization(finishing, obj);
        return obj;
    }

    private final ChildHandleNode firstChild(Incomplete incomplete) {
        ChildHandleNode childHandleNode = incomplete instanceof ChildHandleNode ? (ChildHandleNode) incomplete : null;
        if (childHandleNode != null) {
            return childHandleNode;
        }
        NodeList list = incomplete.getList();
        if (list != null) {
            return nextChild(list);
        }
        return null;
    }

    private final Throwable getExceptionOrNull(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    private final Throwable getFinalRootCause(Finishing finishing, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (finishing.isCancelling()) {
                return new JobCancellationException(cancellationExceptionMessage(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final NodeList getOrPromoteCancellingList(Incomplete incomplete) {
        NodeList list = incomplete.getList();
        if (list != null) {
            return list;
        }
        if (incomplete instanceof Empty) {
            return new NodeList();
        }
        if (incomplete instanceof JobNode) {
            promoteSingleToNodeList((JobNode) incomplete);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + incomplete).toString());
    }

    private final boolean joinInternal() {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                return false;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return true;
    }

    private final Object joinSuspend(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl, invokeOnCompletion(new ResumeOnCompletion(cancellableContinuationImpl)));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    private final Object makeCancelling(Object obj) throws Throwable {
        Throwable thCreateCauseException = null;
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof Finishing) {
                synchronized (state$kotlinx_coroutines_core) {
                    if (((Finishing) state$kotlinx_coroutines_core).isSealed()) {
                        return JobSupportKt.TOO_LATE_TO_CANCEL;
                    }
                    boolean zIsCancelling = ((Finishing) state$kotlinx_coroutines_core).isCancelling();
                    if (obj != null || !zIsCancelling) {
                        if (thCreateCauseException == null) {
                            thCreateCauseException = createCauseException(obj);
                        }
                        ((Finishing) state$kotlinx_coroutines_core).addExceptionLocked(thCreateCauseException);
                    }
                    Throwable rootCause = zIsCancelling ? null : ((Finishing) state$kotlinx_coroutines_core).getRootCause();
                    if (rootCause != null) {
                        notifyCancelling(((Finishing) state$kotlinx_coroutines_core).getList(), rootCause);
                    }
                    return JobSupportKt.COMPLETING_ALREADY;
                }
            }
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                return JobSupportKt.TOO_LATE_TO_CANCEL;
            }
            if (thCreateCauseException == null) {
                thCreateCauseException = createCauseException(obj);
            }
            Incomplete incomplete = (Incomplete) state$kotlinx_coroutines_core;
            if (!incomplete.isActive()) {
                Object objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new CompletedExceptionally(thCreateCauseException, false, 2, null));
                if (objTryMakeCompleting == JobSupportKt.COMPLETING_ALREADY) {
                    throw new IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                }
                if (objTryMakeCompleting != JobSupportKt.COMPLETING_RETRY) {
                    return objTryMakeCompleting;
                }
            } else if (tryMakeCancelling(incomplete, thCreateCauseException)) {
                return JobSupportKt.COMPLETING_ALREADY;
            }
        }
    }

    private final JobNode makeNode(Function1<? super Throwable, Unit> function1, boolean z) {
        JobNode invokeOnCompletion;
        if (z) {
            invokeOnCompletion = function1 instanceof JobCancellingNode ? (JobCancellingNode) function1 : null;
            if (invokeOnCompletion == null) {
                invokeOnCompletion = new InvokeOnCancelling(function1);
            }
        } else {
            invokeOnCompletion = function1 instanceof JobNode ? (JobNode) function1 : null;
            if (invokeOnCompletion == null) {
                invokeOnCompletion = new InvokeOnCompletion(function1);
            } else if (DebugKt.getASSERTIONS_ENABLED() && (invokeOnCompletion instanceof JobCancellingNode)) {
                throw new AssertionError();
            }
        }
        invokeOnCompletion.setJob(this);
        return invokeOnCompletion;
    }

    private final ChildHandleNode nextChild(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                    return (ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof NodeList) {
                    return null;
                }
            }
        }
    }

    private final void notifyCancelling(NodeList nodeList, Throwable th) throws Throwable {
        onCancelling(th);
        Object next = nodeList.getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !Intrinsics.areEqual(nextNode, nodeList); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof JobCancellingNode) {
                JobNode jobNode = (JobNode) nextNode;
                try {
                    jobNode.invoke(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        kotlin.ExceptionsKt.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
        }
        cancelParent(th);
    }

    private final void notifyCompletion(NodeList nodeList, Throwable th) throws Throwable {
        Object next = nodeList.getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !Intrinsics.areEqual(nextNode, nodeList); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof JobNode) {
                JobNode jobNode = (JobNode) nextNode;
                try {
                    jobNode.invoke(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        kotlin.ExceptionsKt.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onAwaitInternalProcessResFunc(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) obj2).cause;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAwaitInternalRegFunc(SelectInstance<?> selectInstance, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                    state$kotlinx_coroutines_core = JobSupportKt.unboxState(state$kotlinx_coroutines_core);
                }
                selectInstance.selectInRegistrationPhase(state$kotlinx_coroutines_core);
                return;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        selectInstance.disposeOnCompletion(invokeOnCompletion(new SelectOnAwaitCompletionHandler(selectInstance)));
    }

    private final void promoteEmptyToNodeList(Empty empty) {
        NodeList nodeList = new NodeList();
        Object inactiveNodeList = nodeList;
        if (!empty.isActive()) {
            inactiveNodeList = new InactiveNodeList(nodeList);
        }
        n3.y(_state$FU, this, empty, inactiveNodeList);
    }

    private final void promoteSingleToNodeList(JobNode jobNode) {
        jobNode.addOneIfEmpty(new NodeList());
        n3.y(_state$FU, this, jobNode, jobNode.getNextNode());
    }

    private final int startInternal(Object obj) {
        if (obj instanceof Empty) {
            if (((Empty) obj).isActive()) {
                return 0;
            }
            if (!n3.y(_state$FU, this, obj, JobSupportKt.EMPTY_ACTIVE)) {
                return -1;
            }
            onStart();
            return 1;
        }
        if (!(obj instanceof InactiveNodeList)) {
            return 0;
        }
        if (!n3.y(_state$FU, this, obj, ((InactiveNodeList) obj).getList())) {
            return -1;
        }
        onStart();
        return 1;
    }

    private final String stateString(Object obj) {
        if (!(obj instanceof Finishing)) {
            return obj instanceof Incomplete ? ((Incomplete) obj).isActive() ? "Active" : "New" : obj instanceof CompletedExceptionally ? "Cancelled" : "Completed";
        }
        Finishing finishing = (Finishing) obj;
        return finishing.isCancelling() ? "Cancelling" : finishing.isCompleting() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException toCancellationException$default(JobSupport jobSupport, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return jobSupport.toCancellationException(th, str);
    }

    private final boolean tryFinalizeSimpleState(Incomplete incomplete, Object obj) throws Throwable {
        if (DebugKt.getASSERTIONS_ENABLED() && !(incomplete instanceof Empty) && !(incomplete instanceof JobNode)) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && (obj instanceof CompletedExceptionally)) {
            throw new AssertionError();
        }
        if (!n3.y(_state$FU, this, incomplete, JobSupportKt.boxIncomplete(obj))) {
            return false;
        }
        onCancelling(null);
        onCompletionInternal(obj);
        completeStateFinalization(incomplete, obj);
        return true;
    }

    private final boolean tryMakeCancelling(Incomplete incomplete, Throwable th) throws Throwable {
        if (DebugKt.getASSERTIONS_ENABLED() && (incomplete instanceof Finishing)) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && !incomplete.isActive()) {
            throw new AssertionError();
        }
        NodeList orPromoteCancellingList = getOrPromoteCancellingList(incomplete);
        if (orPromoteCancellingList == null) {
            return false;
        }
        if (!n3.y(_state$FU, this, incomplete, new Finishing(orPromoteCancellingList, false, th))) {
            return false;
        }
        notifyCancelling(orPromoteCancellingList, th);
        return true;
    }

    private final Object tryMakeCompleting(Object obj, Object obj2) {
        return !(obj instanceof Incomplete) ? JobSupportKt.COMPLETING_ALREADY : ((!(obj instanceof Empty) && !(obj instanceof JobNode)) || (obj instanceof ChildHandleNode) || (obj2 instanceof CompletedExceptionally)) ? tryMakeCompletingSlowPath((Incomplete) obj, obj2) : tryFinalizeSimpleState((Incomplete) obj, obj2) ? obj2 : JobSupportKt.COMPLETING_RETRY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object tryMakeCompletingSlowPath(Incomplete incomplete, Object obj) throws Throwable {
        NodeList orPromoteCancellingList = getOrPromoteCancellingList(incomplete);
        if (orPromoteCancellingList == null) {
            return JobSupportKt.COMPLETING_RETRY;
        }
        Finishing finishing = incomplete instanceof Finishing ? (Finishing) incomplete : null;
        if (finishing == null) {
            finishing = new Finishing(orPromoteCancellingList, false, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (finishing) {
            if (finishing.isCompleting()) {
                return JobSupportKt.COMPLETING_ALREADY;
            }
            finishing.setCompleting(true);
            if (finishing != incomplete && !n3.y(_state$FU, this, incomplete, finishing)) {
                return JobSupportKt.COMPLETING_RETRY;
            }
            if (DebugKt.getASSERTIONS_ENABLED() && finishing.isSealed()) {
                throw new AssertionError();
            }
            boolean zIsCancelling = finishing.isCancelling();
            CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
            if (completedExceptionally != null) {
                finishing.addExceptionLocked(completedExceptionally.cause);
            }
            ?? rootCause = zIsCancelling ? 0 : finishing.getRootCause();
            ref$ObjectRef.element = rootCause;
            Unit unit = Unit.INSTANCE;
            if (rootCause != 0) {
                notifyCancelling(orPromoteCancellingList, rootCause);
            }
            ChildHandleNode childHandleNodeFirstChild = firstChild(incomplete);
            return (childHandleNodeFirstChild == null || !tryWaitForChild(finishing, childHandleNodeFirstChild, obj)) ? finalizeFinishingState(finishing, obj) : JobSupportKt.COMPLETING_WAITING_CHILDREN;
        }
    }

    private final boolean tryWaitForChild(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        while (Job.DefaultImpls.invokeOnCompletion$default(childHandleNode.childJob, false, false, new ChildCompletion(this, finishing, childHandleNode, obj), 1, null) == NonDisposableHandle.INSTANCE) {
            childHandleNode = nextChild(childHandleNode);
            if (childHandleNode == null) {
                return false;
            }
        }
        return true;
    }

    public void afterCompletion(Object obj) {
    }

    @Override // kotlinx.coroutines.Job
    public final ChildHandle attachChild(ChildJob childJob) {
        DisposableHandle disposableHandleInvokeOnCompletion$default = Job.DefaultImpls.invokeOnCompletion$default(this, true, false, new ChildHandleNode(childJob), 2, null);
        Intrinsics.checkNotNull(disposableHandleInvokeOnCompletion$default, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (ChildHandle) disposableHandleInvokeOnCompletion$default;
    }

    public final Object awaitInternal(Continuation<Object> continuation) throws Throwable {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                    return JobSupportKt.unboxState(state$kotlinx_coroutines_core);
                }
                Throwable th = ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
                if (DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) {
                    throw StackTraceRecoveryKt.recoverFromStackFrame(th, (CoroutineStackFrame) continuation);
                }
                throw th;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return awaitSuspend(continuation);
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    public final boolean cancelCoroutine(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(Object obj) throws Throwable {
        Object objMakeCancelling = JobSupportKt.COMPLETING_ALREADY;
        if (getOnCancelComplete$kotlinx_coroutines_core() && (objMakeCancelling = cancelMakeCompleting(obj)) == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        if (objMakeCancelling == JobSupportKt.COMPLETING_ALREADY) {
            objMakeCancelling = makeCancelling(obj);
        }
        if (objMakeCancelling == JobSupportKt.COMPLETING_ALREADY || objMakeCancelling == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        if (objMakeCancelling == JobSupportKt.TOO_LATE_TO_CANCEL) {
            return false;
        }
        afterCompletion(objMakeCancelling);
        return true;
    }

    public void cancelInternal(Throwable th) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(th);
    }

    public String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    public boolean childCancelled(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th) && getHandlesException$kotlinx_coroutines_core();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r3, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) Job.DefaultImpls.fold(this, r3, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) Job.DefaultImpls.get(this, key);
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException getCancellationException() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof Finishing)) {
            if (state$kotlinx_coroutines_core instanceof Incomplete) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
                return toCancellationException$default(this, ((CompletedExceptionally) state$kotlinx_coroutines_core).cause, null, 1, null);
            }
            return new JobCancellationException(DebugStringsKt.getClassSimpleName(this) + " has completed normally", null, this);
        }
        Throwable rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause();
        if (rootCause != null) {
            CancellationException cancellationException = toCancellationException(rootCause, DebugStringsKt.getClassSimpleName(this) + " is cancelling");
            if (cancellationException != null) {
                return cancellationException;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kotlinx.coroutines.ParentJob
    public CancellationException getChildJobCancellationCause() {
        Throwable rootCause;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Finishing) {
            rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause();
        } else if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            rootCause = ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        } else {
            if (state$kotlinx_coroutines_core instanceof Incomplete) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
            }
            rootCause = null;
        }
        CancellationException cancellationException = rootCause instanceof CancellationException ? (CancellationException) rootCause : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + stateString(state$kotlinx_coroutines_core), rootCause, this);
    }

    public final Object getCompletedInternal$kotlinx_coroutines_core() throws Throwable {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        return JobSupportKt.unboxState(state$kotlinx_coroutines_core);
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return getExceptionOrNull(state$kotlinx_coroutines_core);
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key<?> getKey() {
        return Job.Key;
    }

    public final SelectClause1<?> getOnAwaitInternal() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$1, 3);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$2, 3), null, 8, null);
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    public final ChildHandle getParentHandle$kotlinx_coroutines_core() {
        return (ChildHandle) _parentHandle$FU.get(this);
    }

    public final Object getState$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    public boolean handleJobException(Throwable th) {
        return false;
    }

    public final void initParentJob(Job job) {
        if (DebugKt.getASSERTIONS_ENABLED() && getParentHandle$kotlinx_coroutines_core() != null) {
            throw new AssertionError();
        }
        if (job == null) {
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
            return;
        }
        job.start();
        ChildHandle childHandleAttachChild = job.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(childHandleAttachChild);
        if (isCompleted()) {
            childHandleAttachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(Function1<? super Throwable, Unit> function1) {
        return invokeOnCompletion(false, true, function1);
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof Incomplete) && ((Incomplete) state$kotlinx_coroutines_core).isActive();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof CompletedExceptionally) || ((state$kotlinx_coroutines_core instanceof Finishing) && ((Finishing) state$kotlinx_coroutines_core).isCancelling());
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof Incomplete);
    }

    public boolean isScopedCoroutine() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation<? super Unit> continuation) {
        if (joinInternal()) {
            Object objJoinSuspend = joinSuspend(continuation);
            return objJoinSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoinSuspend : Unit.INSTANCE;
        }
        JobKt.ensureActive(continuation.getContext());
        return Unit.INSTANCE;
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(Object obj) {
        Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            if (objTryMakeCompleting == JobSupportKt.COMPLETING_ALREADY) {
                return false;
            }
            if (objTryMakeCompleting == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
        } while (objTryMakeCompleting == JobSupportKt.COMPLETING_RETRY);
        afterCompletion(objTryMakeCompleting);
        return true;
    }

    public final Object makeCompletingOnce$kotlinx_coroutines_core(Object obj) {
        Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            if (objTryMakeCompleting == JobSupportKt.COMPLETING_ALREADY) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, getExceptionOrNull(obj));
            }
        } while (objTryMakeCompleting == JobSupportKt.COMPLETING_RETRY);
        return objTryMakeCompleting;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return Job.DefaultImpls.minusKey(this, key);
    }

    public String nameString$kotlinx_coroutines_core() {
        return DebugStringsKt.getClassSimpleName(this);
    }

    public void onCancelling(Throwable th) {
    }

    public void onCompletionInternal(Object obj) {
    }

    public void onStart() {
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(ParentJob parentJob) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(parentJob);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return Job.DefaultImpls.plus(this, coroutineContext);
    }

    public final void removeNode$kotlinx_coroutines_core(JobNode jobNode) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof JobNode)) {
                if (!(state$kotlinx_coroutines_core instanceof Incomplete) || ((Incomplete) state$kotlinx_coroutines_core).getList() == null) {
                    return;
                }
                jobNode.remove();
                return;
            }
            if (state$kotlinx_coroutines_core != jobNode) {
                return;
            }
        } while (!n3.y(_state$FU, this, state$kotlinx_coroutines_core, JobSupportKt.EMPTY_ACTIVE));
    }

    public final void setParentHandle$kotlinx_coroutines_core(ChildHandle childHandle) {
        _parentHandle$FU.set(this, childHandle);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int iStartInternal;
        do {
            iStartInternal = startInternal(getState$kotlinx_coroutines_core());
            if (iStartInternal == 0) {
                return false;
            }
        } while (iStartInternal != 1);
        return true;
    }

    public final CancellationException toCancellationException(Throwable th, String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = cancellationExceptionMessage();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    public final String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + stateString(getState$kotlinx_coroutines_core()) + '}';
    }

    public String toString() {
        return toDebugString() + '@' + DebugStringsKt.getHexAddress(this);
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(boolean z, boolean z5, Function1<? super Throwable, Unit> function1) {
        JobNode jobNodeMakeNode = makeNode(function1, z);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof Empty) {
                Empty empty = (Empty) state$kotlinx_coroutines_core;
                if (!empty.isActive()) {
                    promoteEmptyToNodeList(empty);
                } else if (n3.y(_state$FU, this, state$kotlinx_coroutines_core, jobNodeMakeNode)) {
                    return jobNodeMakeNode;
                }
            } else {
                if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                    if (z5) {
                        CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core instanceof CompletedExceptionally ? (CompletedExceptionally) state$kotlinx_coroutines_core : null;
                        function1.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                    }
                    return NonDisposableHandle.INSTANCE;
                }
                NodeList list = ((Incomplete) state$kotlinx_coroutines_core).getList();
                if (list == null) {
                    Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    promoteSingleToNodeList((JobNode) state$kotlinx_coroutines_core);
                } else {
                    DisposableHandle disposableHandle = NonDisposableHandle.INSTANCE;
                    if (z && (state$kotlinx_coroutines_core instanceof Finishing)) {
                        synchronized (state$kotlinx_coroutines_core) {
                            try {
                                rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause();
                                if (rootCause == null || ((function1 instanceof ChildHandleNode) && !((Finishing) state$kotlinx_coroutines_core).isCompleting())) {
                                    if (addLastAtomic(state$kotlinx_coroutines_core, list, jobNodeMakeNode)) {
                                        if (rootCause == null) {
                                            return jobNodeMakeNode;
                                        }
                                        disposableHandle = jobNodeMakeNode;
                                    }
                                }
                                Unit unit = Unit.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (rootCause != null) {
                        if (z5) {
                            function1.invoke(rootCause);
                        }
                        return disposableHandle;
                    }
                    if (addLastAtomic(state$kotlinx_coroutines_core, list, jobNodeMakeNode)) {
                        return jobNodeMakeNode;
                    }
                }
            }
        }
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) throws Throwable {
        throw th;
    }
}
