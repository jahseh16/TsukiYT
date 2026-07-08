package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class L1 {
    public static AdError A00(C0670Jb c0670Jb) {
        if (c0670Jb.A03().isPublicError()) {
            return new AdError(c0670Jb.A03().getErrorCode(), c0670Jb.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
