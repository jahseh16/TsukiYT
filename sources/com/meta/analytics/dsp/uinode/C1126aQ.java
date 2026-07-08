package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1126aQ implements AnonymousClass23 {
    public static byte[] A0A;
    public static String[] A0B = {"gd6Snq8TqC5qGLc", "5Vo8FrFWo5Fl4YG5W1yHT6ZfMsOXSACT", "HYpFHiAeuVvng5d4eXQK0awgijL0SEef", "zgL9OdntC9Jt", "c4pha1QVXZPHNWU", "oPtBq8V8zceab2K03f0YSkruz1vfGvQp", "tGZii7gSURWSZ1CI0FSKqsks", "YmWpveYB3lCv"};
    public static final String A0C;
    public long A02;
    public RewardedVideoAd A03;
    public C1F A04;
    public FG A05;
    public final C1064Yn A07;
    public final S2SRewardedVideoAdExtendedListener A08;
    public final C2F A09;
    public int A00 = 0;
    public boolean A06 = false;
    public long A01 = -1;

    public static String A09(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0A = new byte[]{120, 87, 25, 88, 93, 25, 85, 86, 88, 93, 25, 80, 74, 25, 88, 85, 75, 92, 88, 93, 64, 25, 80, 87, 25, 73, 75, 86, 94, 75, 92, 74, 74, 23, 25, 96, 86, 76, 25, 74, 81, 86, 76, 85, 93, 25, 78, 88, 80, 77, 25, 95, 86, 75, 25, 88, 93, 117, 86, 88, 93, 92, 93, 17, 16, 25, 77, 86, 25, 91, 92, 25, 90, 88, 85, 85, 92, 93, 47, 24, 24, 5, 24, 74, 6, 5, 11, 14, 3, 4, 13, 74, 24, 15, 29, 11, 24, 14, 15, 14, 74, 28, 3, 14, 15, 5, 74, 11, 14, 92, 77, 84};
        if (A0B[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[4] = "OGOVhUIoezz1oHK";
        strArr[0] = "xl2MkcRK0CWEWUY";
    }

    static {
        A0A();
        A0C = C1126aQ.class.getSimpleName();
    }

    public C1126aQ(C2F c2f, C2K c2k, String str) {
        this.A09 = c2f;
        this.A07 = c2f.A0B;
        this.A08 = new C1116aG(str, c2k, this, c2f);
    }

    private void A0C(String str, AdExperienceType adExperienceType, boolean z) {
        String strA02;
        if (!this.A06 && this.A05 != null) {
            Log.w(A0C, A09(0, 78, 100));
        }
        A0D(false);
        this.A06 = false;
        C02591u c02591u = new C02591u(this.A09.A0D, EnumC0674Jg.A06, AdPlacementType.REWARDED_VIDEO, EnumC0672Je.A07, 1, this.A09.A0C);
        c02591u.A08(z);
        if (C0653Ih.A28(this.A07) && (strA02 = C0716Kz.A02(this.A07, this.A09.A06)) != null) {
            C2F c2f = this.A09;
            String[] strArr = A0B;
            String extraHints = strArr[2];
            if (extraHints.charAt(28) != strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            A0B[6] = "NRWBzlFLQPOGySbiiYXSLDN6";
            c2f.A06 = strA02;
        }
        c02591u.A06(this.A09.A06);
        c02591u.A07(this.A09.A07);
        FG fg = new FG(this.A09.A0B, c02591u);
        this.A05 = fg;
        fg.A0P(new C1128aS(this));
        this.A05.A0U(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z) {
        FG fg = this.A05;
        if (fg != null) {
            fg.A0P(new C1127aR(this));
            this.A05.A0V(z);
            this.A05 = null;
        }
    }

    public final long A0F() {
        FG fg = this.A05;
        if (fg != null) {
            return fg.A0E();
        }
        return -1L;
    }

    public final C2F A0G() {
        return this.A09;
    }

    public final C1064Yn A0H() {
        return this.A07;
    }

    public final void A0I(RewardData rewardData) {
        FG fg;
        this.A09.A03 = rewardData;
        if (this.A06 && (fg = this.A05) != null) {
            fg.A0X(rewardData);
        }
    }

    public final void A0J(String str, AdExperienceType adExperienceType, boolean z) {
        this.A01 = System.currentTimeMillis();
        try {
            A0C(str, adExperienceType, z);
        } catch (Exception e4) {
            Log.e(A0C, A09(78, 31, 55), e4);
            this.A09.A0B.A07().A9a(A09(109, 3, 96), C8A.A0b, new C8B(e4));
            AdError adErrorInternalError = AdError.internalError(2004);
            this.A09.A0B.A0E().A2m(C0722Lf.A01(this.A01), adErrorInternalError.getErrorCode(), adErrorInternalError.getErrorMessage());
            this.A08.onError(this.A09.A00(), adErrorInternalError);
        }
    }

    public final boolean A0K() {
        FG fg = this.A05;
        return fg == null || fg.A0W();
    }

    public final boolean A0L() {
        return this.A06;
    }

    public final boolean A0M(int i, long j) {
        if (!this.A06) {
            this.A08.onError(this.A09.A00(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        }
        if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A07.A02(i);
            this.A05.A07.A03(j);
            this.A05.A0J();
            this.A06 = false;
            return true;
        }
        this.A06 = false;
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass23
    public final void destroy() {
        A0D(true);
    }
}
