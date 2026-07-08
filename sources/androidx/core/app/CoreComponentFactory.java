package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {

    public interface y {
        Object y();
    }

    public static <T> T checkCompatWrapper(T t3) {
        T t5;
        return (!(t3 instanceof y) || (t5 = (T) ((y) t3).y()) == null) ? t3 : t5;
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public Activity instantiateActivity(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) checkCompatWrapper(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public Application instantiateApplication(@NonNull ClassLoader classLoader, @NonNull String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) checkCompatWrapper(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public ContentProvider instantiateProvider(@NonNull ClassLoader classLoader, @NonNull String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) checkCompatWrapper(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public BroadcastReceiver instantiateReceiver(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) checkCompatWrapper(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public Service instantiateService(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) checkCompatWrapper(super.instantiateService(classLoader, str, intent));
    }
}
