package com.meta.analytics.dsp.uinode;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1023Wy implements InterfaceC0528Cy {
    public static byte[] A0K;
    public static String[] A0L = {"UXkay4rUGskktYzxNvudWKkCsEVxw", "TbZCK2AobFbud3dzlhL4ME6xz6dWV35u", "g54hQOaX", "Hzwenjp7P2fY81mJ8QBm2GDgQOuz90wV", "pL9ldBQtoqrc20elRWolxWe4zjdgoW6T", "TPLjBFOallz6251M1W6TB1HqEI4wd", "DLwQdeQQFfiBx7iMVYuUh1sumwfdr4oM", "y7d3scFL40rvPqI5TaUsSswOsLgzDZPi"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Format A0C;
    public C4 A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public final C0644Hy A0H;
    public final C0645Hz A0I;
    public final String A0J;

    public static String A03(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0L[1].charAt(8) != 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[6] = "y88DdvbFX6MPRa9z5ZeTPeJlbkGd2RA6";
            strArr[4] = "7eDKdIkFThzm8wa04NY5bFVXWVarNGHW";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 112);
            i10++;
        }
    }

    public static void A04() {
        A0K = new byte[]{57, 45, 60, 49, 55, 119, 53, 40, 108, 57, 117, 52, 57, 44, 53};
    }

    static {
        A04();
    }

    public C1023Wy(String str) {
        this.A0J = str;
        C0645Hz c0645Hz = new C0645Hz(UserMetadata.MAX_ATTRIBUTE_SIZE);
        this.A0I = c0645Hz;
        this.A0H = new C0644Hy(c0645Hz.A00);
    }

    private int A00(C0644Hy c0644Hy) throws C04539v {
        int iA01 = c0644Hy.A01();
        Pair<Integer, Integer> config = AbstractC0624He.A02(c0644Hy, true);
        int bitsLeft = ((Integer) config.first).intValue();
        this.A05 = bitsLeft;
        int bitsLeft2 = ((Integer) config.second).intValue();
        this.A02 = bitsLeft2;
        int bitsLeft3 = c0644Hy.A01();
        return iA01 - bitsLeft3;
    }

    private int A01(C0644Hy c0644Hy) throws C04539v {
        int tmp;
        int i = 0;
        int muxSlotLengthBytes = this.A03;
        if (muxSlotLengthBytes == 0) {
            do {
                tmp = c0644Hy.A04(8);
                i += tmp;
            } while (tmp == 255);
            return i;
        }
        throw new C04539v();
    }

    public static long A02(C0644Hy c0644Hy) {
        int bytesForValue = c0644Hy.A04(2);
        return c0644Hy.A04((bytesForValue + 1) * 8);
    }

    private void A05(int i) {
        this.A0I.A0W(i);
        this.A0H.A0B(this.A0I.A00);
    }

    private void A06(C0644Hy c0644Hy) throws C04539v {
        boolean useSameStreamMux = c0644Hy.A0F();
        if (!useSameStreamMux) {
            this.A0G = true;
            A08(c0644Hy);
        } else {
            boolean useSameStreamMux2 = this.A0G;
            if (!useSameStreamMux2) {
                return;
            }
        }
        int i = this.A00;
        if (A0L[2].length() != 8) {
            throw new RuntimeException();
        }
        A0L[1] = "yEjpzXBGbjL6zW81s4nwg5Kx41FgkglX";
        if (i == 0) {
            if (this.A04 == 0) {
                A09(c0644Hy, A01(c0644Hy));
                boolean useSameStreamMux3 = this.A0F;
                if (useSameStreamMux3) {
                    c0644Hy.A08((int) this.A09);
                    return;
                }
                return;
            }
            throw new C04539v();
        }
        throw new C04539v();
    }

    private void A07(C0644Hy c0644Hy) {
        int iA04 = c0644Hy.A04(3);
        this.A03 = iA04;
        switch (iA04) {
            case 0:
                c0644Hy.A08(8);
                break;
            case 1:
                c0644Hy.A08(9);
                break;
            case 3:
            case 4:
            case 5:
                c0644Hy.A08(6);
                break;
            case 6:
            case 7:
                c0644Hy.A08(1);
                break;
        }
    }

    private void A08(C0644Hy c0644Hy) throws C04539v {
        boolean otherDataLenEsc;
        int iA04 = c0644Hy.A04(1);
        int iA042 = iA04 == 1 ? c0644Hy.A04(1) : 0;
        this.A00 = iA042;
        if (iA042 == 0) {
            if (iA04 == 1) {
                A02(c0644Hy);
            }
            if (c0644Hy.A0F()) {
                this.A04 = c0644Hy.A04(6);
                int iA043 = c0644Hy.A04(4);
                int iA044 = c0644Hy.A04(3);
                if (iA043 == 0 && iA044 == 0) {
                    if (iA04 == 0) {
                        int iA03 = c0644Hy.A03();
                        int iA00 = A00(c0644Hy);
                        c0644Hy.A07(iA03);
                        byte[] bArr = new byte[(iA00 + 7) / 8];
                        c0644Hy.A0D(bArr, 0, iA00);
                        Format formatA07 = Format.A07(this.A0E, A03(0, 15, 40), null, -1, -1, this.A02, this.A05, Collections.singletonList(bArr), null, 0, this.A0J);
                        if (!formatA07.equals(this.A0C)) {
                            this.A0C = formatA07;
                            this.A0A = 1024000000 / ((long) formatA07.A0C);
                            this.A0D.A5n(formatA07);
                        }
                    } else {
                        c0644Hy.A08(((int) A02(c0644Hy)) - A00(c0644Hy));
                    }
                    A07(c0644Hy);
                    boolean zA0F = c0644Hy.A0F();
                    this.A0F = zA0F;
                    this.A09 = 0L;
                    if (zA0F) {
                        if (iA04 == 1) {
                            this.A09 = A02(c0644Hy);
                        } else {
                            do {
                                otherDataLenEsc = c0644Hy.A0F();
                                this.A09 = (this.A09 << 8) + ((long) c0644Hy.A04(8));
                            } while (otherDataLenEsc);
                        }
                    }
                    if (c0644Hy.A0F()) {
                        c0644Hy.A08(8);
                        return;
                    }
                    return;
                }
                throw new C04539v();
            }
            throw new C04539v();
        }
        throw new C04539v();
    }

    private void A09(C0644Hy c0644Hy, int i) {
        int iA03 = c0644Hy.A03();
        int bitPosition = iA03 & 7;
        if (bitPosition == 0) {
            int bitPosition2 = iA03 >> 3;
            this.A0I.A0Y(bitPosition2);
        } else {
            int bitPosition3 = i * 8;
            c0644Hy.A0D(this.A0I.A00, 0, bitPosition3);
            C0645Hz c0645Hz = this.A0I;
            String[] strArr = A0L;
            String str = strArr[6];
            String str2 = strArr[4];
            int iCharAt = str.charAt(4);
            int bitPosition4 = str2.charAt(4);
            if (iCharAt != bitPosition4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[6] = "hISKdmFcBvkt3UkKbTRUxOfzbLN5RWYH";
            strArr2[4] = "PVNedBTwWz01jOulB5OdqyWGI6cUIeHW";
            c0645Hz.A0Y(0);
        }
        this.A0D.AFR(this.A0I, i);
        this.A0D.AFS(this.A0B, 1, i, 0, null);
        this.A0B += this.A0A;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0528Cy
    public final void A4R(C0645Hz c0645Hz) throws C04539v {
        while (true) {
            int iA04 = c0645Hz.A04();
            if (A0L[1].charAt(8) != 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[3] = "OUH24t4ef0Bd1TNZZrzghovIx2sIzWi9";
            strArr[7] = "WHKixNlsxExZUks5bFrxsUMqOnC83dmQ";
            if (iA04 > 0) {
                switch (this.A08) {
                    case 0:
                        int iA0E = c0645Hz.A0E();
                        if (A0L[2].length() == 8) {
                            A0L[2] = "lkshyeX1";
                            if (iA0E == 86) {
                                this.A08 = 1;
                            }
                        } else {
                            A0L[2] = "GS3bIWmA";
                            if (iA0E == 86) {
                                this.A08 = 1;
                            }
                        }
                        break;
                    case 1:
                        int iA0E2 = c0645Hz.A0E();
                        if ((iA0E2 & 224) == 224) {
                            this.A07 = iA0E2;
                            if (A0L[2].length() != 8) {
                                throw new RuntimeException();
                            }
                            A0L[2] = "GLemk9OP";
                            this.A08 = 2;
                        } else if (iA0E2 != 86) {
                            this.A08 = 0;
                        }
                        break;
                    case 2:
                        int bytesToRead = this.A07;
                        int iA0E3 = ((bytesToRead & (-225)) << 8) | c0645Hz.A0E();
                        this.A06 = iA0E3;
                        if (iA0E3 > this.A0I.A00.length) {
                            A05(this.A06);
                        }
                        this.A01 = 0;
                        this.A08 = 3;
                        break;
                    case 3:
                        int iMin = Math.min(c0645Hz.A04(), this.A06 - this.A01);
                        byte[] bArr = this.A0H.A00;
                        int bytesToRead2 = this.A01;
                        c0645Hz.A0c(bArr, bytesToRead2, iMin);
                        int i = this.A01 + iMin;
                        this.A01 = i;
                        int bytesToRead3 = this.A06;
                        if (i == bytesToRead3) {
                            this.A0H.A07(0);
                            A06(this.A0H);
                            this.A08 = 0;
                        }
                        break;
                }
            } else {
                return;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0528Cy
    public final void A4p(InterfaceC0504Bu interfaceC0504Bu, DC dc) {
        dc.A05();
        this.A0D = interfaceC0504Bu.AGi(dc.A03(), 1);
        this.A0E = dc.A04();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0528Cy
    public final void ADs() {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0528Cy
    public final void ADt(long j, boolean z) {
        this.A0B = j;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0528Cy
    public final void AFg() {
        this.A08 = 0;
        this.A0G = false;
    }
}
