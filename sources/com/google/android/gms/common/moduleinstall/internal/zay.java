package com.google.android.gms.common.moduleinstall.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.internal.base.zav;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zay extends GoogleApi implements ModuleInstallClient {
    public static final /* synthetic */ int zab = 0;
    private static final Api.ClientKey zac;
    private static final Api.AbstractClientBuilder zad;
    private static final Api zae;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zac = clientKey;
        zaq zaqVar = new zaq();
        zad = zaqVar;
        zae = new Api("ModuleInstall.API", zaqVar, clientKey);
    }

    public zay(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) zae, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static final ApiFeatureRequest zad(boolean z, OptionalModuleApi... optionalModuleApiArr) {
        Preconditions.checkNotNull(optionalModuleApiArr, "Requested APIs must not be null.");
        Preconditions.checkArgument(optionalModuleApiArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (OptionalModuleApi optionalModuleApi : optionalModuleApiArr) {
            Preconditions.checkNotNull(optionalModuleApi, "Requested API must not be null.");
        }
        return ApiFeatureRequest.zaa(Arrays.asList(optionalModuleApiArr), z);
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final Task<ModuleAvailabilityResponse> areModulesAvailable(OptionalModuleApi... optionalModuleApiArr) {
        ApiFeatureRequest apiFeatureRequestZad = zad(false, optionalModuleApiArr);
        if (apiFeatureRequestZad.getApiFeatures().isEmpty()) {
            return Tasks.forResult(new ModuleAvailabilityResponse(true, 0));
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(new Feature[]{zav.zaa});
        builder.setMethodKey(27301);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new zal(this, apiFeatureRequestZad));
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final Task<Void> deferredInstall(OptionalModuleApi... optionalModuleApiArr) {
        ApiFeatureRequest apiFeatureRequestZad = zad(false, optionalModuleApiArr);
        if (apiFeatureRequestZad.getApiFeatures().isEmpty()) {
            return Tasks.forResult(null);
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(new Feature[]{zav.zaa});
        builder.setMethodKey(27302);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new zap(this, apiFeatureRequestZad));
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final Task<ModuleInstallIntentResponse> getInstallModulesIntent(OptionalModuleApi... optionalModuleApiArr) {
        ApiFeatureRequest apiFeatureRequestZad = zad(true, optionalModuleApiArr);
        if (apiFeatureRequestZad.getApiFeatures().isEmpty()) {
            return Tasks.forResult(new ModuleInstallIntentResponse((PendingIntent) null));
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(new Feature[]{zav.zaa});
        builder.setMethodKey(27307);
        builder.run(new zan(this, apiFeatureRequestZad));
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final Task<ModuleInstallResponse> installModules(ModuleInstallRequest moduleInstallRequest) {
        ApiFeatureRequest apiFeatureRequestFromModuleInstallRequest = ApiFeatureRequest.fromModuleInstallRequest(moduleInstallRequest);
        InstallStatusListener listener = moduleInstallRequest.getListener();
        Executor listenerExecutor = moduleInstallRequest.getListenerExecutor();
        if (apiFeatureRequestFromModuleInstallRequest.getApiFeatures().isEmpty()) {
            return Tasks.forResult(new ModuleInstallResponse(0));
        }
        if (listener == null) {
            TaskApiCall.Builder builder = TaskApiCall.builder();
            builder.setFeatures(new Feature[]{zav.zaa});
            builder.setAutoResolveMissingFeatures(true);
            builder.setMethodKey(27304);
            builder.run(new zao(this, apiFeatureRequestFromModuleInstallRequest));
            return doRead(builder.build());
        }
        Preconditions.checkNotNull(listener);
        ListenerHolder listenerHolderRegisterListener = listenerExecutor == null ? registerListener(listener, InstallStatusListener.class.getSimpleName()) : ListenerHolders.createListenerHolder(listener, listenerExecutor, InstallStatusListener.class.getSimpleName());
        zaab zaabVar = new zaab(listenerHolderRegisterListener);
        AtomicReference atomicReference = new AtomicReference();
        zai zaiVar = new zai(this, atomicReference, listener, apiFeatureRequestFromModuleInstallRequest, zaabVar);
        zaj zajVar = new zaj(this, zaabVar);
        RegistrationMethods.Builder builder2 = RegistrationMethods.builder();
        builder2.withHolder(listenerHolderRegisterListener);
        builder2.setFeatures(new Feature[]{zav.zaa});
        builder2.setAutoResolveMissingFeatures(true);
        builder2.register(zaiVar);
        builder2.unregister(zajVar);
        builder2.setMethodKey(27305);
        return doRegisterEventListener(builder2.build()).onSuccessTask(new zak(atomicReference));
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final Task<Void> releaseModules(OptionalModuleApi... optionalModuleApiArr) {
        ApiFeatureRequest apiFeatureRequestZad = zad(false, optionalModuleApiArr);
        if (apiFeatureRequestZad.getApiFeatures().isEmpty()) {
            return Tasks.forResult(null);
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(new Feature[]{zav.zaa});
        builder.setMethodKey(27303);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new zam(this, apiFeatureRequestZad));
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    @ResultIgnorabilityUnspecified
    public final Task<Boolean> unregisterListener(InstallStatusListener installStatusListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(installStatusListener, InstallStatusListener.class.getSimpleName()), 27306);
    }

    public zay(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) zae, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
