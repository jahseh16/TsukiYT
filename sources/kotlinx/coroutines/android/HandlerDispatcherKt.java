package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HandlerDispatcherKt {
    public static final HandlerDispatcher Main;
    private static volatile Choreographer choreographer;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object objM31constructorimpl;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(new HandlerContext(asHandler(Looper.getMainLooper(), true), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        Main = (HandlerDispatcher) (Result.m36isFailureimpl(objM31constructorimpl) ? null : objM31constructorimpl);
    }

    public static final Handler asHandler(Looper looper, boolean z) throws IllegalAccessException, InvocationTargetException {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    public static final HandlerDispatcher from(Handler handler, String str) {
        return new HandlerContext(handler, str);
    }

    public static /* synthetic */ HandlerDispatcher from$default(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }
}
