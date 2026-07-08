package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DebugKt;
import y.n3;
import y.y;

/* JADX INFO: loaded from: classes.dex */
public final class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME = new y().y();
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClassName;

    static {
        Object objM31constructorimpl;
        Object objM31constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m34exceptionOrNullimpl(objM31constructorimpl) != null) {
            objM31constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) objM31constructorimpl;
        try {
            objM31constructorimpl2 = Result.m31constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            objM31constructorimpl2 = Result.m31constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m34exceptionOrNullimpl(objM31constructorimpl2) != null) {
            objM31constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) objM31constructorimpl2;
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> causeAndStacktrace(E e4) {
        Throwable cause = e4.getCause();
        if (cause == null || !Intrinsics.areEqual(cause.getClass(), e4.getClass())) {
            return TuplesKt.to(e4, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e4.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (isArtificial(stackTraceElement)) {
                return TuplesKt.to(cause, stackTrace);
            }
        }
        return TuplesKt.to(e4, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E createFinalException(E e4, E e5, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(ARTIFICIAL_FRAME);
        StackTraceElement[] stackTrace = e4.getStackTrace();
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i = 0;
        if (iFirstFrameIndex == -1) {
            e5.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e5;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iFirstFrameIndex];
        for (int i5 = 0; i5 < iFirstFrameIndex; i5++) {
            stackTraceElementArr[i5] = stackTrace[i5];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i8 = i + 1;
            stackTraceElementArr[i + iFirstFrameIndex] = it.next();
            i = i8;
        }
        e5.setStackTrace(stackTraceElementArr);
        return e5;
    }

    private static final ArrayDeque<StackTraceElement> createStackTrace(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean elementWiseEquals(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && Intrinsics.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && Intrinsics.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && Intrinsics.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int firstFrameIndex(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.areEqual(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement) {
        return StringsKt.startsWith$default(stackTraceElement.getClassName(), n3.zn(), false, 2, (Object) null);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i5 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i5 > length2) {
            return;
        }
        while (true) {
            if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i5) {
                return;
            } else {
                length2--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E recoverFromStackFrame(E e4, CoroutineStackFrame coroutineStackFrame) {
        Pair pairCauseAndStacktrace = causeAndStacktrace(e4);
        Throwable th = (Throwable) pairCauseAndStacktrace.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pairCauseAndStacktrace.component2();
        Throwable thTryCopyException = ExceptionsConstructorKt.tryCopyException(th);
        if (thTryCopyException == null) {
            return e4;
        }
        ArrayDeque<StackTraceElement> arrayDequeCreateStackTrace = createStackTrace(coroutineStackFrame);
        if (arrayDequeCreateStackTrace.isEmpty()) {
            return e4;
        }
        if (th != e4) {
            mergeRecoveredTraces(stackTraceElementArr, arrayDequeCreateStackTrace);
        }
        return (E) createFinalException(th, thTryCopyException, arrayDequeCreateStackTrace);
    }

    public static final <E extends Throwable> E recoverStackTrace(E e4) {
        Throwable thTryCopyException;
        return (DebugKt.getRECOVER_STACK_TRACES() && (thTryCopyException = ExceptionsConstructorKt.tryCopyException(e4)) != null) ? (E) sanitizeStackTrace(thTryCopyException) : e4;
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E e4) {
        StackTraceElement[] stackTrace = e4.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i = length2 - 1;
                if (Intrinsics.areEqual(stackTraceRecoveryClassName, stackTrace[length2].getClassName())) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length2 = i;
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        int i5 = length2 + 1;
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i8 = 0;
        int i10 = (length - length2) - (iFirstFrameIndex == -1 ? 0 : length - iFirstFrameIndex);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i10];
        while (i8 < i10) {
            stackTraceElementArr[i8] = i8 == 0 ? ARTIFICIAL_FRAME : stackTrace[(i5 + i8) - 1];
            i8++;
        }
        e4.setStackTrace(stackTraceElementArr);
        return e4;
    }

    public static final <E extends Throwable> E unwrapImpl(E e4) {
        E e5 = (E) e4.getCause();
        if (e5 != null && Intrinsics.areEqual(e5.getClass(), e4.getClass())) {
            for (StackTraceElement stackTraceElement : e4.getStackTrace()) {
                if (isArtificial(stackTraceElement)) {
                    return e5;
                }
            }
        }
        return e4;
    }
}
