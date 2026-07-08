package com.meta.analytics.dsp.uinode;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0970Uu extends KT {
    public static byte[] A02;
    public final /* synthetic */ K1 A00;
    public final /* synthetic */ K4 A01;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, 11, 69, 78, 95, 92, 68, 89, 64, 11, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (AbstractC0720Ld.A00(this.A01.A04) == EnumC0719Lc.A07) {
            this.A01.A09();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String strA00 = A00(13, 21, 92);
            this.A01.A04.A0E().A2v(C0722Lf.A01(this.A01.A00), adErrorType.getErrorCode(), strA00, adErrorType.isPublicError());
            this.A01.A0D(new C0670Jb(adErrorType, strA00));
            return;
        }
        C8J.A08(this.A01.A04);
        C6E.A07(this.A01.A04);
        boolean z = true;
        Map<String, String> mapA09 = this.A00.A09(C04198l.A00().A01(this.A01.A04, true).A6w(this.A00.A05()));
        this.A01.A02 = mapA09;
        try {
            PackageManager packageManager = this.A01.A04.getPackageManager();
            if (packageManager != null) {
                mapA09.put(A00(1, 12, 113), new String(Base64.encode((this.A01.A04.getPackageName() + A00(0, 1, 93) + packageManager.getInstallerPackageName(this.A01.A04.getPackageName())).getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A06() != EnumC0674Jg.A03 && this.A00.A06() != EnumC0674Jg.A05 && this.A00.A06() != EnumC0674Jg.A04 && this.A00.A06() != null) {
                z = false;
            }
            C0875Rc.A02(z, this.A01.A04).AE0(this.A01.A06, new RY().A05(this.A01.A02).A08(), this.A01.A02(C0722Lf.A00(), this.A00));
        } catch (Exception e4) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e4.getMessage();
            this.A01.A04.A0E().A2v(C0722Lf.A01(this.A01.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            this.A01.A0D(C0670Jb.A01(adErrorType2, message));
        }
    }

    public C0970Uu(K4 k42, K1 k12) {
        this.A01 = k42;
        this.A00 = k12;
    }
}
