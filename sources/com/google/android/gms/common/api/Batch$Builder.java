package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Batch$Builder {
    private final List zaa = new ArrayList();
    private final GoogleApiClient zab;

    public Batch$Builder(@NonNull GoogleApiClient googleApiClient) {
        this.zab = googleApiClient;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <R extends Result> BatchResultToken<R> add(@NonNull PendingResult<R> pendingResult) {
        BatchResultToken<R> batchResultToken = new BatchResultToken<>(this.zaa.size());
        this.zaa.add(pendingResult);
        return batchResultToken;
    }

    @NonNull
    public Batch build() {
        return new Batch(this.zaa, this.zab, (zac) null);
    }
}
