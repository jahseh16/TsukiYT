package kotlinx.coroutines.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.ThreadLocalEventLoop;

/* JADX INFO: loaded from: classes.dex */
public final class DispatchedContinuationKt {
    private static final Symbol UNDEFINED = new Symbol("UNDEFINED");
    public static final Symbol REUSABLE_CLAIMED = new Symbol("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[Catch: all -> 0x006b, DONT_GENERATE, TryCatch #1 {all -> 0x006b, blocks: (B:11:0x0042, B:13:0x0050, B:15:0x0056, B:28:0x0095, B:18:0x006d, B:20:0x007d, B:25:0x008c, B:27:0x0092, B:33:0x00a2, B:36:0x00ab, B:35:0x00a8, B:23:0x0083), top: B:46:0x0042, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void resumeCancellableWith(kotlin.coroutines.Continuation<? super T> r6, java.lang.Object r7, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto Lb5
            kotlinx.coroutines.internal.DispatchedContinuation r6 = (kotlinx.coroutines.internal.DispatchedContinuation) r6
            java.lang.Object r8 = kotlinx.coroutines.CompletionStateKt.toState(r7, r8)
            kotlinx.coroutines.CoroutineDispatcher r0 = r6.dispatcher
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6._state = r8
            r6.resumeMode = r1
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.dispatcher
            kotlin.coroutines.CoroutineContext r8 = r6.getContext()
            r7.mo210dispatch(r8, r6)
            goto Lb8
        L26:
            kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r2 = r0.isUnconfinedLoopActive()
            if (r2 == 0) goto L3e
            r6._state = r8
            r6.resumeMode = r1
            r0.dispatchUnconfined(r6)
            goto Lb8
        L3e:
            r0.incrementUseCount(r1)
            r2 = 0
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()     // Catch: java.lang.Throwable -> L6b
            kotlinx.coroutines.Job$Key r4 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L6b
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L6b
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L6d
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L6b
            if (r4 != 0) goto L6d
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L6b
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch: java.lang.Throwable -> L6b
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r7 = kotlin.Result.m31constructorimpl(r7)     // Catch: java.lang.Throwable -> L6b
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L6b
            goto L95
        L6b:
            r7 = move-exception
            goto Lac
        L6d:
            kotlin.coroutines.Continuation<T> r8 = r6.continuation     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> L6b
            kotlin.coroutines.CoroutineContext r4 = r8.getContext()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L6b
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L6b
            if (r3 == r5) goto L82
            kotlinx.coroutines.UndispatchedCoroutine r8 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r8, r4, r3)     // Catch: java.lang.Throwable -> L6b
            goto L83
        L82:
            r8 = r2
        L83:
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L9f
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9f
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto L92
            boolean r7 = r8.clearThreadContext()     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L95
        L92:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L6b
        L95:
            boolean r7 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L6b
            if (r7 != 0) goto L95
        L9b:
            r0.decrementUseCount(r1)
            goto Lb8
        L9f:
            r7 = move-exception
            if (r8 == 0) goto La8
            boolean r8 = r8.clearThreadContext()     // Catch: java.lang.Throwable -> L6b
            if (r8 == 0) goto Lab
        La8:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L6b
        Lab:
            throw r7     // Catch: java.lang.Throwable -> L6b
        Lac:
            r6.handleFatalException$kotlinx_coroutines_core(r7, r2)     // Catch: java.lang.Throwable -> Lb0
            goto L9b
        Lb0:
            r6 = move-exception
            r0.decrementUseCount(r1)
            throw r6
        Lb5:
            r6.resumeWith(r7)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(kotlin.coroutines.Continuation, java.lang.Object, kotlin.jvm.functions.Function1):void");
    }

    public static /* synthetic */ void resumeCancellableWith$default(Continuation continuation, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        resumeCancellableWith(continuation, obj, function1);
    }

    public static final boolean yieldUndispatched(DispatchedContinuation<? super Unit> dispatchedContinuation) {
        Unit unit = Unit.INSTANCE;
        DebugKt.getASSERTIONS_ENABLED();
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = unit;
            dispatchedContinuation.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            dispatchedContinuation.run();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}
