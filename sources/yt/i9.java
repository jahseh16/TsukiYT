package yt;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class i9 {

    public static class y {
        public static boolean n3(Handler handler, Runnable runnable, Object obj, long j) {
            return handler.postDelayed(runnable, obj, j);
        }

        public static Handler y(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static boolean n3(@NonNull Handler handler, @NonNull Runnable runnable, @Nullable Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return y.n3(handler, runnable, obj, j);
        }
        Message messageObtain = Message.obtain(handler, runnable);
        messageObtain.obj = obj;
        return handler.sendMessageDelayed(messageObtain, j);
    }

    @NonNull
    public static Handler y(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return y.y(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e5) {
            e = e5;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e6) {
            e = e6;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
