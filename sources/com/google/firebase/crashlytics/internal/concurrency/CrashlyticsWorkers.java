package com.google.firebase.crashlytics.internal.concurrency;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CrashlyticsWorkers {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static boolean enforcement;
    public final CrashlyticsWorker common;
    public final CrashlyticsWorker dataCollect;
    public final CrashlyticsWorker diskWrite;
    public final CrashlyticsWorker network;

    public CrashlyticsWorkers(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(blockingExecutorService, "blockingExecutorService");
        this.common = new CrashlyticsWorker(backgroundExecutorService);
        this.diskWrite = new CrashlyticsWorker(backgroundExecutorService);
        this.dataCollect = new CrashlyticsWorker(backgroundExecutorService);
        this.network = new CrashlyticsWorker(blockingExecutorService);
    }

    public static final void checkBackgroundThread() {
        Companion.checkBackgroundThread();
    }

    public static final void checkBlockingThread() {
        Companion.checkBlockingThread();
    }

    public static final void checkNotMainThread() {
        Companion.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return Companion.getEnforcement();
    }

    public static final void setEnforcement(boolean z) {
        Companion.setEnforcement(z);
    }
}
