package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XC extends AbstractC0521Co {
    public static byte[] A05;
    public static String[] A06 = {"yJHQcBl4f4L", "G0ieIp3rn9VMbRQq", "FaSr", "diNTGhkPk6T4rZ0cbtlCtFUtzgnoDDOW", "ZsfK02RsUHO", "uQbwEIiYvgO", "fIpYaZEOmsgiiOCz2AK4PDqwDhI8GLBw", "t90Xt1PXy7A3GvR50K3KPdbeyD"};
    public int A00;
    public C0523Cq A01;
    public C0525Cs A02;
    public C0526Cu A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C0523Cq A02(C0645Hz c0645Hz) throws IOException {
        if (this.A03 == null) {
            this.A03 = AbstractC0527Cv.A04(c0645Hz);
            return null;
        }
        if (this.A02 == null) {
            this.A02 = AbstractC0527Cv.A03(c0645Hz);
            return null;
        }
        byte[] bArr = new byte[c0645Hz.A07()];
        System.arraycopy(c0645Hz.A00, 0, bArr, 0, c0645Hz.A07());
        return new C0523Cq(this.A03, this.A02, bArr, AbstractC0527Cv.A0C(c0645Hz, this.A03.A05), AbstractC0527Cv.A00(r4.length - 1));
    }

    public static String A03(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{88, 76, 93, 80, 86, 22, 79, 86, 75, 91, 80, 74};
    }

    static {
        A04();
    }

    public static int A00(byte b4, int i, int i5) {
        return (b4 >> i5) & (255 >>> (8 - i));
    }

    public static int A01(byte b4, C0523Cq c0523Cq) {
        if (!c0523Cq.A04[A00(b4, c0523Cq.A00, 1)].A03) {
            int modeNumber = c0523Cq.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c0523Cq.A02.A04;
        return modeNumber2;
    }

    public static void A05(C0645Hz c0645Hz, long j) {
        c0645Hz.A0X(c0645Hz.A07() + 4);
        c0645Hz.A00[c0645Hz.A07() - 4] = (byte) (j & 255);
        c0645Hz.A00[c0645Hz.A07() - 3] = (byte) ((j >>> 8) & 255);
        c0645Hz.A00[c0645Hz.A07() - 2] = (byte) ((j >>> 16) & 255);
        c0645Hz.A00[c0645Hz.A07() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C0645Hz c0645Hz) {
        try {
            return AbstractC0527Cv.A0A(1, c0645Hz, true);
        } catch (C04539v unused) {
            return false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0521Co
    public final long A07(C0645Hz c0645Hz) {
        int i = 0;
        if ((c0645Hz.A00[0] & 1) == 1) {
            return -1L;
        }
        int iA01 = A01(c0645Hz.A00[0], this.A01);
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + iA01) / 4;
        }
        A05(c0645Hz, i);
        this.A04 = true;
        int samplesInPacket = A06[2].length();
        if (samplesInPacket == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "lV1SPFBYbG5lxAnFlWta4jj5erMHhp00";
        strArr[3] = "grWENQhpkSsLY54DCH6OLJaVWIdWM4Dq";
        this.A00 = iA01;
        return i;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0521Co
    public final void A08(long j) {
        super.A08(j);
        this.A04 = j != 0;
        C0526Cu c0526Cu = this.A03;
        this.A00 = c0526Cu != null ? c0526Cu.A03 : 0;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0521Co
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0521Co
    public final boolean A0A(C0645Hz c0645Hz, long j, C0520Cn c0520Cn) throws InterruptedException, IOException {
        if (this.A01 == null) {
            C0523Cq c0523CqA02 = A02(c0645Hz);
            this.A01 = c0523CqA02;
            if (c0523CqA02 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.A01.A02.A09);
            arrayList.add(this.A01.A03);
            c0520Cn.A00 = Format.A07(null, A03(0, 12, 20), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
            return true;
        }
        return false;
    }
}
