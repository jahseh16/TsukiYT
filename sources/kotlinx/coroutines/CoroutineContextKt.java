package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class CoroutineContextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final CoroutineContext foldCopies(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z) {
        boolean zHasCopyableElements = hasCopyableElements(coroutineContext);
        boolean zHasCopyableElements2 = hasCopyableElements(coroutineContext2);
        if (!zHasCopyableElements && !zHasCopyableElements2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // kotlin.jvm.functions.Function2
            public final CoroutineContext invoke(CoroutineContext coroutineContext4, CoroutineContext.Element element) {
                if (!(element instanceof CopyableThreadContextElement)) {
                    return coroutineContext4.plus(element);
                }
                CoroutineContext.Element element2 = ref$ObjectRef.element.get(element.getKey());
                if (element2 != null) {
                    Ref$ObjectRef<CoroutineContext> ref$ObjectRef2 = ref$ObjectRef;
                    ref$ObjectRef2.element = ref$ObjectRef2.element.minusKey(element.getKey());
                    return coroutineContext4.plus(((CopyableThreadContextElement) element).mergeForChild(element2));
                }
                CopyableThreadContextElement copyableThreadContextElementCopyForChild = (CopyableThreadContextElement) element;
                if (z) {
                    copyableThreadContextElementCopyForChild = copyableThreadContextElementCopyForChild.copyForChild();
                }
                return coroutineContext4.plus(copyableThreadContextElementCopyForChild);
            }
        });
        if (zHasCopyableElements2) {
            ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).fold(emptyCoroutineContext, new Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt.foldCopies.1
                @Override // kotlin.jvm.functions.Function2
                public final CoroutineContext invoke(CoroutineContext coroutineContext4, CoroutineContext.Element element) {
                    return element instanceof CopyableThreadContextElement ? coroutineContext4.plus(((CopyableThreadContextElement) element).copyForChild()) : coroutineContext4.plus(element);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) ref$ObjectRef.element);
    }

    public static final String getCoroutineName(CoroutineContext coroutineContext) {
        CoroutineId coroutineId;
        String name;
        if (!DebugKt.getDEBUG() || (coroutineId = (CoroutineId) coroutineContext.get(CoroutineId.Key)) == null) {
            return null;
        }
        CoroutineName coroutineName = (CoroutineName) coroutineContext.get(CoroutineName.Key);
        if (coroutineName == null || (name = coroutineName.getName()) == null) {
            name = "coroutine";
        }
        return name + '#' + coroutineId.getId();
    }

    private static final boolean hasCopyableElements(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2<Boolean, CoroutineContext.Element, Boolean>() { // from class: kotlinx.coroutines.CoroutineContextKt.hasCopyableElements.1
            public final Boolean invoke(boolean z, CoroutineContext.Element element) {
                return Boolean.valueOf(z || (element instanceof CopyableThreadContextElement));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.Element element) {
                return invoke(bool.booleanValue(), element);
            }
        })).booleanValue();
    }

    public static final CoroutineContext newCoroutineContext(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextFoldCopies = foldCopies(coroutineScope.getCoroutineContext(), coroutineContext, true);
        CoroutineContext coroutineContextPlus = DebugKt.getDEBUG() ? coroutineContextFoldCopies.plus(new CoroutineId(DebugKt.getCOROUTINE_ID().incrementAndGet())) : coroutineContextFoldCopies;
        return (coroutineContextFoldCopies == Dispatchers.getDefault() || coroutineContextFoldCopies.get(ContinuationInterceptor.Key) != null) ? coroutineContextPlus : coroutineContextPlus.plus(Dispatchers.getDefault());
    }

    public static final UndispatchedCoroutine<?> undispatchedCompletion(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof DispatchedCoroutine) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final UndispatchedCoroutine<?> updateUndispatchedCompletion(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.get(UndispatchedMarker.INSTANCE) == null) {
            return null;
        }
        UndispatchedCoroutine<?> undispatchedCoroutineUndispatchedCompletion = undispatchedCompletion((CoroutineStackFrame) continuation);
        if (undispatchedCoroutineUndispatchedCompletion != null) {
            undispatchedCoroutineUndispatchedCompletion.saveThreadContext(coroutineContext, obj);
        }
        return undispatchedCoroutineUndispatchedCompletion;
    }

    public static final CoroutineContext newCoroutineContext(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !hasCopyableElements(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : foldCopies(coroutineContext, coroutineContext2, false);
    }
}
