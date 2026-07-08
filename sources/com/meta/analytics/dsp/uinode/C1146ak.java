package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1146ak implements AnonymousClass10 {
    public static byte[] A02;
    public static String[] A03 = {"CodBKn6Rx4Nd2NCJ9VlYeJoUvBmT0K9p", "5Rf8WjvcJZOUdeEvkpnEyeT6h0OK8cqO", "9H9umRBAwWbsUQsHVAjP1GvoefoGWKiv", "nqryT6E7", "BkgpBj4q", "vUmBCwuwnOwC6wDkIlhiKnb32h6Srhe1", "47HB5bdSxtP74yDXUEGozfNjn4WOkRGN", "xids5JFtyjlo4uGEh5DI8Wwgi7h0jVQM"};
    public final /* synthetic */ FQ A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            int i11 = (bArrCopyOfRange[i10] ^ i8) ^ 34;
            String[] strArr = A03;
            if (strArr[5].charAt(5) == strArr[1].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "sVZQ6Ml9fBzEITS5ybXWTtwXQoWqWbAN";
            strArr2[1] = "MwEMOJFXQFuJpU8zWQ85tYeWswvxAO3B";
            bArrCopyOfRange[i10] = (byte) i11;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{104, 104, 62, 99, 105, 111, 108, 63, 15, 42, 47, 62, 58, 43, 60, 110, 39, 61, 110, 32, 59, 34, 34, 110, 33, 32, 110, 34, 33, 47, 42, 7, 32, 58, 43, 60, 61, 58, 39, 58, 39, 47, 34, 15, 42, 93, 122, 96, 113, 102, 103, 96, 125, 96, 125, 117, 120, 52, 125, 121, 100, 102, 113, 103, 103, 125, 123, 122, 52, 114, 125, 102, 113, 112, 106, 101, 84, 106, 104, 127, 98, 125, 98, 127, 114, 47, 32, 42, 60, 33, 39, 42, 96, 39, 32, 58, 43, 32, 58, 96, 47, 45, 58, 39, 33, 32, 96, 24, 7, 11, 25, 110, 127, 102, 11, 10, 45, 10, 16, 1, 22, 23, 16, 13, 16, 13, 5, 8, 40, 11, 3, 3, 13, 10, 3, 45, 9, 20, 22, 1, 23, 23, 13, 11, 10};
    }

    static {
        A01();
    }

    public C1146ak(FQ fq, Runnable runnable) {
        this.A00 = fq;
        this.A01 = runnable;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass10
    public final void ABl(C1184bM c1184bM, String str, boolean z) {
        this.A00.A06.A0C();
        boolean z5 = !TextUtils.isEmpty(str);
        if (z && z5) {
            try {
                Intent intent = new Intent(A00(85, 26, 108));
                intent.setData(AbstractC0715Ky.A00(str));
                C0702Kj.A0C(this.A00.A0B, intent);
            } catch (C0700Kh e4) {
                Throwable cause = e4.getCause();
                C0700Kh cause2 = e4;
                if (cause != null) {
                    cause2 = e4.getCause();
                }
                this.A00.A0B.A07().A9a(A00(74, 11, 41), C8A.A04, new C8B(cause2));
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass10
    public final void ABm(C1184bM c1184bM) {
        this.A00.A06.A04();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass10
    public final void ABn(C1184bM c1184bM) {
        this.A00.A06.A05();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass10
    public final void ABo(C1184bM c1184bM) {
        if (c1184bM != this.A00.A00) {
            return;
        }
        if (c1184bM == null) {
            this.A00.A0B.A07().A9a(A00(111, 3, 45), C8A.A0X, new C8B(A00(8, 37, 108)));
            ABp(c1184bM, AdError.internalError(2004));
            return;
        }
        this.A00.A0F().removeCallbacks(this.A01);
        this.A00.A01 = c1184bM;
        this.A00.A0I();
        this.A00.A06.A0F(c1184bM);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass10
    public final void ABp(C1184bM c1184bM, AdError adError) {
        if (c1184bM != this.A00.A00) {
            return;
        }
        this.A00.A0F().removeCallbacks(this.A01);
        this.A00.A0N(c1184bM);
        this.A00.A0B.A0E().A4t(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A06.A0G(new C0670Jb(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass10
    public final void ABq(C1184bM c1184bM) {
        AbstractC0683Jp.A05(A00(114, 31, 70), A00(45, 29, 54), A00(0, 8, 121));
        this.A00.A06.A0D();
        this.A00.A0L();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass10
    public final void ABr() {
        this.A00.A06.A08();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass10
    public final void ABs() {
        this.A00.A06.A06();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass10
    public final void ABt() {
        this.A00.A06.A07();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass10
    public final void onInterstitialActivityDestroyed() {
        this.A00.A06.A02();
    }
}
