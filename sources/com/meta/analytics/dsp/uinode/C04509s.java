package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04509s {
    public static byte[] A0F;
    public long A00;
    public C04509s A01;
    public C04519t A02;
    public TrackGroupArray A03;
    public C0605Gk A04;
    public boolean A05;
    public boolean A06;
    public C0605Gk A07;
    public final WP A08;
    public final Object A09;
    public final FB[] A0A;
    public final boolean[] A0B;
    public final InterfaceC0562Eq A0C;
    public final AbstractC0604Gj A0D;
    public final AA[] A0E;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0F = new byte[]{79, 103, 102, 107, 99, 82, 103, 112, 107, 109, 102, 74, 109, 110, 102, 103, 112, 81, 100, 115, 104, 110, 101, 33, 115, 100, 109, 100, 96, 114, 100, 33, 103, 96, 104, 109, 100, 101, 47};
    }

    public C04509s(AA[] aaArr, long j, AbstractC0604Gj abstractC0604Gj, InterfaceC0607Gm interfaceC0607Gm, InterfaceC0562Eq interfaceC0562Eq, Object obj, C04519t c04519t) {
        this.A0E = aaArr;
        this.A00 = j - c04519t.A03;
        this.A0D = abstractC0604Gj;
        this.A0C = interfaceC0562Eq;
        this.A09 = AbstractC0620Ha.A01(obj);
        this.A02 = c04519t;
        this.A0A = new FB[aaArr.length];
        this.A0B = new boolean[aaArr.length];
        WP wpA4k = interfaceC0562Eq.A4k(c04519t.A04, interfaceC0607Gm);
        this.A08 = c04519t.A02 != Long.MIN_VALUE ? new CI(wpA4k, true, 0L, c04519t.A02) : wpA4k;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(com.meta.analytics.dsp.uinode.C0605Gk r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            int r0 = r4.A00
            if (r2 >= r0) goto L19
            boolean r1 = r4.A00(r2)
            com.facebook.ads.redexgen.X.Gh r0 = r4.A01
            com.facebook.ads.redexgen.X.Gg r0 = r0.A00(r2)
            if (r1 == 0) goto L16
            if (r0 == 0) goto L16
            r0.A5U()
        L16:
            int r2 = r2 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C04509s.A02(com.facebook.ads.redexgen.X.Gk):void");
    }

    private void A03(C0605Gk c0605Gk) {
        C0605Gk c0605Gk2 = this.A07;
        this.A07 = c0605Gk;
        if (c0605Gk != null) {
            A02(c0605Gk);
        }
    }

    private void A04(FB[] fbArr) {
        int i = 0;
        while (true) {
            AA[] aaArr = this.A0E;
            int i5 = aaArr.length;
            if (i < i5) {
                if (aaArr[i].A8C() == 5 && this.A04.A00(i)) {
                    fbArr[i] = new WU();
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void A05(FB[] fbArr) {
        int i = 0;
        while (true) {
            AA[] aaArr = this.A0E;
            int i5 = aaArr.length;
            if (i < i5) {
                if (aaArr[i].A8C() == 5) {
                    fbArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final long A06() {
        if (this.A06) {
            return this.A08.A7U();
        }
        return 0L;
    }

    public final long A07() {
        return this.A00;
    }

    public final long A08(long j) {
        return j - A07();
    }

    public final long A09(long j) {
        return A07() + j;
    }

    public final long A0A(long j, boolean z) {
        return A0B(j, z, new boolean[this.A0E.length]);
    }

    public final long A0B(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            int i5 = this.A04.A00;
            boolean z5 = false;
            if (i >= i5) {
                break;
            }
            boolean[] zArr2 = this.A0B;
            if (!z && this.A04.A02(this.A07, i)) {
                z5 = true;
            }
            zArr2[i] = z5;
            i++;
        }
        A05(this.A0A);
        A03(this.A04);
        C0602Gh c0602Gh = this.A04.A01;
        long jAFm = this.A08.AFm(c0602Gh.A01(), this.A0B, this.A0A, zArr, j);
        A04(this.A0A);
        this.A05 = false;
        int i8 = 0;
        while (true) {
            FB[] fbArr = this.A0A;
            if (i8 < fbArr.length) {
                if (fbArr[i8] != null) {
                    AbstractC0620Ha.A04(this.A04.A00(i8));
                    int i10 = this.A0E[i8].A8C();
                    if (i10 != 5) {
                        this.A05 = true;
                    }
                } else {
                    AbstractC0620Ha.A04(c0602Gh.A00(i8) == null);
                }
                i8++;
            } else {
                return jAFm;
            }
        }
    }

    public final long A0C(boolean z) {
        if (!this.A06) {
            return this.A02.A03;
        }
        long jA6D = this.A08.A6D();
        if (jA6D == Long.MIN_VALUE && z) {
            return this.A02.A01;
        }
        return jA6D;
    }

    public final void A0D() {
        A03(null);
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0C.AEa(((CI) this.A08).A05);
            } else {
                this.A0C.AEa(this.A08);
            }
        } catch (RuntimeException e4) {
            Log.e(A00(0, 17, 28), A00(17, 22, 31), e4);
        }
    }

    public final void A0E(float f3) throws C04359c {
        this.A06 = true;
        this.A03 = this.A08.A8B();
        A0I(f3);
        long jA0A = A0A(this.A02.A03, false);
        long j = this.A00;
        long newStartPositionUs = this.A02.A03;
        this.A00 = j + (newStartPositionUs - jA0A);
        this.A02 = this.A02.A01(jA0A);
    }

    public final void A0F(long j) {
        this.A08.A4T(A08(j));
    }

    public final void A0G(long j) {
        if (this.A06) {
            this.A08.AER(A08(j));
        }
    }

    public final boolean A0H() {
        return this.A06 && (!this.A05 || this.A08.A6D() == Long.MIN_VALUE);
    }

    public final boolean A0I(float f3) throws C04359c {
        C0605Gk c0605GkA0T = this.A0D.A0T(this.A0E, this.A03);
        C0605Gk selectorResult = this.A07;
        if (c0605GkA0T.A01(selectorResult)) {
            return false;
        }
        this.A04 = c0605GkA0T;
        for (InterfaceC0601Gg interfaceC0601Gg : c0605GkA0T.A01.A01()) {
            if (interfaceC0601Gg != null) {
                interfaceC0601Gg.ACc(f3);
            }
        }
        return true;
    }
}
