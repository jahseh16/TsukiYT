package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1197bZ extends AbstractC02210h {
    public static String A03;
    public static String A04;
    public static String A05;
    public static byte[] A06;
    public static String[] A07 = {"1", "OJ2IOsbUnCKybSqk53zM3JXcifahO", "e4RldewFXKwYCBzcZ5CwWZ5XjhlRHNiJ", "729G42gqUNiz5ZAUAxRhvFZ2YWMhTd0L", "J1Ql0tv9onNfDvsMKNTgjNyaDa6Pnzub", "9fBm", "mbPUpspz4Nj5AFGqwEe2w9x9WWs", "2uSYGuFAJgr"};
    public final boolean A00;
    public final C02270o A01;
    public final boolean A02;

    public static String A0A(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 30);
            if (A07[3].charAt(0) != '7') {
                throw new RuntimeException();
            }
            A07[5] = "PWjD";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{93, 114, 119, 125, 117, 62, 114, 113, 121, 121, 123, 122, 68, 75, 65, 87, 74, 76, 65, 11, 76, 75, 81, 64, 75, 81, 11, 68, 70, 81, 76, 74, 75, 11, 115, 108, 96, 114, 24, 27, 25, 17, 37, 14, 19, 23, 31, 46, 39, 35, 52, 39, 29, 54, 43, 47, 39, 11, 17, 16, 7, 11, 9, 1, 37, 35, 53, 53, 51, 37, 37, 76, 87, 80, 79, 92, 75, 74, 88, 85, 102, 85, 80, 87, 82, 89, 95, 73, 94, 115, 88, 94, 77, 79, 71, 73, 94, 115, 69, 95, 115, 66, 67, 88, 115, 66, 89, 64, 64, 75, 93, 72, 95, 84, 99, 93, 82, 88, 99, 94, 78, 83, 75, 79, 89};
    }

    public abstract EnumC02200g A0D();

    static {
        A0B();
        A03 = A0A(64, 7, 72);
        A04 = A0A(85, 24, 50);
        A05 = A0A(109, 16, 34);
    }

    public AbstractC1197bZ(C1064Yn c1064Yn, J2 j22, String str, C02270o c02270o, boolean z) {
        this(c1064Yn, j22, str, c02270o, z, false);
    }

    public AbstractC1197bZ(C1064Yn c1064Yn, J2 j22, String str, C02270o c02270o, boolean z, boolean z5) {
        super(c1064Yn, j22, str);
        this.A01 = c02270o;
        this.A02 = z;
        this.A00 = z5;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02210h
    public final EnumC02200g A0C() {
        C02270o c02270o = this.A01;
        if (c02270o != null) {
            c02270o.A07(super.A02);
        }
        if (C0786Nr.A03(super.A00)) {
            return EnumC02200g.A05;
        }
        return A0D();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(java.util.Map<java.lang.String, java.lang.String> r8, com.meta.analytics.dsp.uinode.EnumC02200g r9) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AbstractC1197bZ.A0E(java.util.Map, com.facebook.ads.redexgen.X.0g):void");
    }

    public final boolean A0F(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0A(71, 14, 39));
            boolean redirectedToApp = TextUtils.isEmpty(queryParameter);
            if (redirectedToApp) {
                return false;
            }
            Intent intent = new Intent(A0A(12, 26, 59), AbstractC0715Ky.A00(queryParameter));
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(UserMetadata.MAX_ATTRIBUTE_SIZE);
            }
            return C0702Kj.A0C(super.A00, intent);
        } catch (C0700Kh unused) {
            return false;
        }
    }
}
