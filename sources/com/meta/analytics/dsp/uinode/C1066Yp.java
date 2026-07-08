package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1066Yp implements InterfaceC0872Qz {
    public static byte[] A04;
    public static String[] A05 = {"YemVV2CAzinSYko79pvdFyiaYh6Ax0NW", "FtFCRkuseyQck6qipAKyAgz81MNc63Vq", "zQJLp3VKHBLQ3ByylDAuuS44tkTO3MMG", "42Yp5AyXW20j54q75pN0MZ83oMgNP5AR", "H6ih9Bh2z", "6YmusGfII7QcqEjcRVkg771Wm5bkMvFZ", "MrQdRQonl4dLBaJwcA8", "V6zsFfxQuHmo6VBO3CkkHMQL74uZQLm4"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C6X A02;
    public final /* synthetic */ C6Y A03;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 94);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{24, 3, 6, 3, 2, 26, 3, 62, 33, 44, 45, 39};
    }

    static {
        A01();
    }

    public C1066Yp(C6X c6x, C6Y c6y, long j, long j4) {
        this.A02 = c6x;
        this.A03 = c6y;
        this.A00 = j;
        this.A01 = j4;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0872Qz
    public final void ABL(boolean z) {
        if (C03726f.A06(this.A02.A01.A04)) {
            C03716e c03716e = new C03716e(this.A03.A06, this.A03.A07, A00(7, 5, 22), this.A03.A02, this.A03.A08);
            C03726f.A04(this.A02.A01.A04, c03716e, z);
            if (!z) {
                C03726f.A05(this.A02.A01.A04, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 22), this.A03.A02, 2112, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            Map map = C03696c.A0G;
            if (A05[1].charAt(13) == 'O') {
                throw new RuntimeException();
            }
            A05[1] = "tpujksKgYg5a3fdXCIDkrfoMaur1s0eW";
            map.put(c03716e.A04, c03716e);
        }
        try {
            this.A02.A00.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0872Qz
    public final void ABT(Throwable th) {
        if (C03726f.A06(this.A02.A01.A04)) {
            C03927f c03927f = this.A02.A01.A04;
            String str = this.A03.A06;
            String str2 = this.A03.A07;
            String str3 = this.A03.A08;
            String strA00 = A00(7, 5, 22);
            String str4 = this.A03.A02;
            String string = th != null ? th.toString() : A00(0, 7, 51);
            Long lValueOf = Long.valueOf(System.currentTimeMillis() - this.A01);
            String[] strArr = A05;
            if (strArr[3].charAt(20) == strArr[0].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "AayJnSlXKOYoed0ZHJ3UlPrg44Go7inE";
            strArr2[7] = "t2uUu9WqhkybHrBNVhVVT1YnAGopOKs6";
            C03726f.A05(c03927f, str, str2, str3, strA00, str4, 2119, string, null, lValueOf, null);
        }
        try {
            this.A02.A00.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
