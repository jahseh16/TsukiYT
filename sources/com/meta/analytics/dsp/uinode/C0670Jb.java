package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0670Jb {
    public final AdErrorType A00;
    public final String A01;

    public C0670Jb(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C0670Jb(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C0670Jb A00(AdErrorType adErrorType) {
        return new C0670Jb(adErrorType, (String) null);
    }

    public static C0670Jb A01(AdErrorType adErrorType, String str) {
        return new C0670Jb(adErrorType, str);
    }

    public static C0670Jb A02(C0671Jc c0671Jc) {
        return new C0670Jb(c0671Jc.A00(), c0671Jc.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
