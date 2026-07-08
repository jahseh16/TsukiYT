package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0968Us implements RL {
    public static byte[] A03;
    public final /* synthetic */ long A00;
    public final /* synthetic */ K1 A01;
    public final /* synthetic */ K4 A02;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{103, 54, 102, 103, 100, 53, 105, 101, 109, 116, 104, 105, 98, 95, 68, 66, 87, 83, 78, 72, 73, 29, 7, 24, 46, 57, 61, 46, 57, 107, 46, 57, 57, 36, 57, 107, 36, 40, 40, 62, 57, 57, 46, 47, 108, 90, 77, 73, 90, 77, 31, 77, 90, 79, 83, 86, 90, 91, 31, 76, 74, 92, 92, 90, 76, 76, 89, 74, 83, 83, 70, 122, 123, 32, 124, 123, 41, 47, 75, 74, 103, 75, 73, 84, 72, 65, 80, 65, 95, 94, 117, 66, 66, 95, 66};
    }

    public C0968Us(K4 k42, K1 k12, long j) {
        this.A02 = k42;
        this.A01 = k12;
        this.A00 = j;
    }

    private final void A02(RX rx) {
        K0.A06(this.A01);
        try {
            RJ response = rx.A00();
            if (response != null) {
                String strA69 = response.A69();
                K7 serverResponse = this.A02.A05.A06(this.A02.A04, strA69, this.A00);
                if (serverResponse.A01() == K6.A03) {
                    C0965Uo c0965Uo = (C0965Uo) serverResponse;
                    String strA04 = c0965Uo.A04();
                    AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c0965Uo.A03(), AdErrorType.ERROR_MESSAGE);
                    if (strA04 != null) {
                        strA69 = strA04;
                    }
                    this.A02.A04.A0E().A2v(C0722Lf.A01(this.A02.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA69, adErrorTypeAdErrorTypeFromCode.isPublicError());
                    this.A02.A0D(C0670Jb.A01(adErrorTypeAdErrorTypeFromCode, strA69));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String errorMessage = rx.getMessage();
            this.A02.A04.A0E().A2v(C0722Lf.A01(this.A02.A00), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
            this.A02.A0D(C0670Jb.A01(adErrorType, errorMessage));
        } catch (JSONException e4) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage2 = rx.getMessage();
            this.A02.A04.A0E().A2v(C0722Lf.A01(this.A02.A00), adErrorType2.getErrorCode(), A00(8, 15, 45) + e4.getMessage(), adErrorType2.isPublicError());
            this.A02.A0D(C0670Jb.A01(adErrorType2, errorMessage2));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.RL
    public final void AB9(RJ rj) {
        AbstractC0683Jp.A05(A00(78, 10, 46), A00(44, 27, 53), A00(0, 8, 90));
        if (rj != null) {
            String strA69 = rj.A69();
            K0.A06(this.A01);
            this.A02.A0N(strA69, this.A00, this.A01);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.RL
    public final void ABS(Exception exc) {
        AbstractC0683Jp.A05(A00(88, 7, 58), A00(23, 21, 65), A00(71, 7, 18));
        if (RX.class.equals(exc.getClass())) {
            A02((RX) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        this.A02.A04.A0E().A2v(C0722Lf.A01(this.A02.A00), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0D(C0670Jb.A01(adErrorType, errorMessage));
    }
}
