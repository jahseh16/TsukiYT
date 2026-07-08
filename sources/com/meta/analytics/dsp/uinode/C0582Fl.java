package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0582Fl extends AbstractC1200bc<EnumC02180e> {
    public static byte[] A00;
    public static String[] A01 = {"nfOmdPRKy6dJXhDeozy3bec4eprLIoSQ", "SpNSu", "KnwtHm0RppTzgOMyhwsp1PpmZykcOlps", "rm2Q4", "VxhbZsLUCIIY3eK9iwu", "VDpaDUxovSHskE3K7Rzj9CiAPD6OjiUH", "VHZOT7bXdVoDaPP", "SrW2lLCi4fFkH4TY8LZz6iOiSZQwKo1F"};

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[5] = "VLAsB6FpgF6HHUeMgZV0uCFNDiYuOANh";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 46);
            i10++;
        }
    }

    public static void A01() {
        A00 = new byte[]{19, 26, 17, 17};
    }

    static {
        A01();
    }

    public C0582Fl(String str) {
        super(str);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1200bc
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C0Y A04(EnumC02180e enumC02180e) {
        String strA02;
        if (enumC02180e != null) {
            strA02 = enumC02180e.A02();
        } else {
            if (A01[0].charAt(24) == 'c') {
                throw new RuntimeException();
            }
            A01[2] = "FtIMifYPiEAUkOQozBm9Vw11LGuuRK56";
            strA02 = A00(0, 4, 119);
        }
        return new C0Y(this, strA02);
    }
}
