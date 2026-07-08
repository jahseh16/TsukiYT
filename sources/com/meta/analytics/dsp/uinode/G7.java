package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G7 {
    public static byte[] A07;
    public static String[] A08 = {"qcU5l5rVDanZ0IBZnB67EILhI18GgdFe", "32XpuNghlFeF4zyqPL948gmCUNCGk", "bftD5DkqR73p2Uf2yBhEF5T9UOvyv9s", "0", "qryxRa4yOsFNWhLtu25s3YxhDLRy", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "tLr9RBWs5E21", "UeFN6nMF8sjHvHxScJIKm37Ehl9oCVg2"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02;
    public final Paint A03;
    public final C0595Fz A04;
    public final G0 A05;
    public final G6 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0595Fz A04(C0644Hy c0644Hy, int i) {
        int iA04;
        int iA042;
        int iA043;
        int iA044;
        int i5 = 8;
        int iA045 = c0644Hy.A04(8);
        c0644Hy.A08(8);
        int i8 = i - 2;
        int[] iArrA0F = A0F();
        int[] iArrA0G = A0G();
        int[] iArrA0H = A0H();
        while (i8 > 0) {
            int iA046 = c0644Hy.A04(i5);
            int iA047 = c0644Hy.A04(i5);
            int i10 = i8 - 2;
            int[] iArr = (iA047 & 128) != 0 ? iArrA0F : (iA047 & 64) != 0 ? iArrA0G : iArrA0H;
            if ((iA047 & 1) != 0) {
                iA04 = c0644Hy.A04(i5);
                iA042 = c0644Hy.A04(i5);
                iA043 = c0644Hy.A04(i5);
                iA044 = c0644Hy.A04(i5);
                i8 = i10 - 4;
            } else {
                iA04 = c0644Hy.A04(6) << 2;
                iA042 = c0644Hy.A04(4) << 4;
                iA043 = c0644Hy.A04(4) << 4;
                iA044 = c0644Hy.A04(2) << 6;
                i8 = i10 - 2;
            }
            if (iA04 == 0) {
                iA042 = 0;
                iA043 = 0;
                iA044 = 255;
            }
            iArr[iA046] = A00((byte) (255 - (iA044 & 255)), IF.A06((int) (((double) iA04) + (((double) (iA042 - 128)) * 1.402d)), 0, 255), IF.A06((int) ((((double) iA04) - (((double) (iA043 - 128)) * 0.34414d)) - (((double) (iA042 - 128)) * 0.71414d)), 0, 255), IF.A06((int) (((double) iA04) + (((double) (iA043 - 128)) * 1.772d)), 0, 255));
            i5 = 8;
        }
        return new C0595Fz(iA045, iArrA0F, iArrA0G, iArrA0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static G0 A05(C0644Hy c0644Hy) {
        int iA04;
        int iA042;
        int iA043;
        int iA044;
        c0644Hy.A08(4);
        boolean zA0F = c0644Hy.A0F();
        c0644Hy.A08(3);
        int iA045 = c0644Hy.A04(16);
        int iA046 = c0644Hy.A04(16);
        if (zA0F) {
            iA04 = c0644Hy.A04(16);
            iA044 = c0644Hy.A04(16);
            iA042 = c0644Hy.A04(16);
            iA043 = c0644Hy.A04(16);
        } else {
            iA04 = 0;
            iA042 = 0;
            iA043 = iA046;
            iA044 = iA045;
        }
        return new G0(iA045, iA046, iA04, iA044, iA042, iA043);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static G4 A08(C0644Hy c0644Hy, int i) {
        int i5 = 8;
        int iA04 = c0644Hy.A04(8);
        c0644Hy.A08(4);
        boolean zA0F = c0644Hy.A0F();
        c0644Hy.A08(3);
        int iA042 = c0644Hy.A04(16);
        int iA043 = c0644Hy.A04(16);
        int iA044 = c0644Hy.A04(3);
        int iA045 = c0644Hy.A04(3);
        c0644Hy.A08(2);
        int iA046 = c0644Hy.A04(8);
        int iA047 = c0644Hy.A04(8);
        int iA048 = c0644Hy.A04(4);
        int iA049 = c0644Hy.A04(2);
        c0644Hy.A08(2);
        int i8 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i8 > 0) {
            int iA0410 = c0644Hy.A04(16);
            int iA0411 = c0644Hy.A04(2);
            int iA0412 = c0644Hy.A04(2);
            int iA0413 = c0644Hy.A04(12);
            c0644Hy.A08(4);
            int iA0414 = c0644Hy.A04(12);
            i8 -= 6;
            int iA0415 = 0;
            int iA0416 = 0;
            if (iA0411 == 1 || iA0411 == 2) {
                iA0415 = c0644Hy.A04(i5);
                iA0416 = c0644Hy.A04(i5);
                i8 -= 2;
            }
            sparseArray.put(iA0410, new G5(iA0411, iA0412, iA0413, iA0414, iA0415, iA0416));
            i5 = 8;
        }
        return new G4(iA04, zA0F, iA042, iA043, iA044, iA045, iA046, iA047, iA048, iA049, sparseArray);
    }

    public static String A09(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{18, 55, 34, 55, 118, 48, 63, 51, 58, 50, 118, 58, 51, 56, 49, 34, 62, 118, 51, 46, 53, 51, 51, 50, 37, 118, 58, 63, 59, 63, 34, 106, 88, 76, 126, 79, 92, 93, 75, 92};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final List<C0583Fn> A0I(byte[] bArr, int i) {
        C0644Hy c0644Hy = new C0644Hy(bArr, i);
        while (c0644Hy.A01() >= 48 && c0644Hy.A04(8) == 15) {
            A0C(c0644Hy, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        G0 g02 = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || g02.A05 + 1 != this.A00.getWidth() || g02.A00 + 1 != this.A00.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(g02.A05 + 1, g02.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A00 = bitmapCreateBitmap;
            this.A01.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<G3> sparseArray = this.A06.A01.A03;
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            G3 g3ValueAt = sparseArray.valueAt(i5);
            G4 g42 = this.A06.A08.get(sparseArray.keyAt(i5));
            int i8 = g3ValueAt.A00 + g02.A02;
            int i10 = g3ValueAt.A01 + g02.A04;
            this.A01.clipRect(i8, i10, Math.min(g42.A08 + i8, g02.A01), Math.min(g42.A02 + i10, g02.A03), Region.Op.REPLACE);
            C0595Fz c0595Fz = this.A06.A06.get(g42.A00);
            if (c0595Fz == null && (c0595Fz = this.A06.A04.get(g42.A00)) == null) {
                c0595Fz = this.A04;
            }
            SparseArray<G5> sparseArray2 = g42.A09;
            for (int i11 = 0; i11 < sparseArray2.size(); i11++) {
                int iKeyAt = sparseArray2.keyAt(i11);
                G5 g5ValueAt = sparseArray2.valueAt(i11);
                G1 g1 = this.A06.A07.get(iKeyAt);
                String[] strArr = A08;
                if (strArr[0].charAt(24) == strArr[7].charAt(24)) {
                    throw new RuntimeException();
                }
                A08[1] = "0wDldquZfVkccfOmGfzJ1HL0d6oT0";
                if (g1 == null) {
                    g1 = this.A06.A05.get(iKeyAt);
                }
                if (g1 != null) {
                    A0B(g1, c0595Fz, g42.A01, i8 + g5ValueAt.A02, i10 + g5ValueAt.A05, g1.A01 ? null : this.A02, this.A01);
                }
            }
            if (g42.A0A) {
                this.A03.setColor(g42.A01 == 3 ? c0595Fz.A03[g42.A07] : g42.A01 == 2 ? c0595Fz.A02[g42.A06] : c0595Fz.A01[g42.A05]);
                this.A01.drawRect(i8, i10, g42.A08 + i8, g42.A02 + i10, this.A03);
            }
            arrayList.add(new C0583Fn(Bitmap.createBitmap(this.A00, i8, i10, g42.A08, g42.A02), i8 / g02.A05, 0, i10 / g02.A00, 0, g42.A08 / g02.A05, g42.A02 / g02.A00));
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public G7(int i, int i5) {
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new G0(719, 575, 0, 719, 0, 575);
        this.A04 = new C0595Fz(0, A0F(), A0G(), A0H());
        this.A06 = new G6(i, i5);
    }

    public static int A00(int i, int i5, int i8, int i10) {
        return (i << 24) | (i5 << 16) | (i8 << 8) | i10;
    }

    public static int A01(C0644Hy c0644Hy, int[] iArr, byte[] bArr, int i, int i5, Paint paint, Canvas canvas) {
        int i8 = i;
        boolean z = false;
        do {
            int iA04 = 0;
            int iA042 = 0;
            iA042 = 0;
            iA042 = 0;
            iA042 = 0;
            int iA043 = c0644Hy.A04(2);
            if (iA043 != 0) {
                iA04 = 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "cKDkKJCaTP5Z";
                iA042 = iA043;
            } else if (c0644Hy.A0F()) {
                iA04 = c0644Hy.A04(3) + 3;
                iA042 = c0644Hy.A04(2);
                if (A08[1].length() == 29) {
                    A08[1] = "Xe5wyvwrL1rxQiCfD8ENREY9AaRUH";
                }
            } else if (c0644Hy.A0F()) {
                iA04 = 1;
            } else {
                switch (c0644Hy.A04(2)) {
                    case 0:
                        z = true;
                        break;
                    case 1:
                        iA04 = 2;
                        break;
                    case 2:
                        iA04 = c0644Hy.A04(4) + 12;
                        iA042 = c0644Hy.A04(2);
                        break;
                    case 3:
                        iA04 = c0644Hy.A04(8) + 29;
                        if (A08[1].length() != 29) {
                            throw new RuntimeException();
                        }
                        A08[5] = "eZC8v48u";
                        iA042 = c0644Hy.A04(2);
                        break;
                }
            }
            if (iA04 != 0 && paint != null) {
                if (bArr != null) {
                    iA042 = bArr[iA042];
                }
                paint.setColor(iArr[iA042]);
                canvas.drawRect(i8, i5, i8 + iA04, i5 + 1, paint);
            }
            i8 += iA04;
        } while (!z);
        return i8;
    }

    public static int A02(C0644Hy c0644Hy, int[] iArr, byte[] bArr, int i, int i5, Paint paint, Canvas canvas) {
        int i8 = i;
        boolean z = false;
        do {
            int peek = 0;
            int iA04 = c0644Hy.A04(4);
            if (iA04 != 0) {
                peek = 1;
            } else if (!c0644Hy.A0F()) {
                int iA042 = c0644Hy.A04(3);
                if (iA042 != 0) {
                    peek = iA042 + 2;
                    iA04 = 0;
                } else {
                    z = true;
                    iA04 = 0;
                }
            } else if (!c0644Hy.A0F()) {
                peek = c0644Hy.A04(2) + 4;
                iA04 = c0644Hy.A04(4);
            } else {
                switch (c0644Hy.A04(2)) {
                    case 0:
                        peek = 1;
                        if (A08[1].length() == 29) {
                            String[] strArr = A08;
                            strArr[3] = "b";
                            strArr[4] = "RKCQrML1KI9i2rbeBXbE06C32ORX";
                            iA04 = 0;
                        } else {
                            iA04 = 0;
                        }
                        break;
                    case 1:
                        peek = 2;
                        iA04 = 0;
                        break;
                    case 2:
                        peek = c0644Hy.A04(4) + 9;
                        iA04 = c0644Hy.A04(4);
                        break;
                    case 3:
                        peek = c0644Hy.A04(8) + 25;
                        String[] strArr2 = A08;
                        if (strArr2[3].length() != strArr2[4].length()) {
                            A08[6] = "tDVEwF5JbpPt";
                            iA04 = c0644Hy.A04(4);
                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    default:
                        iA04 = 0;
                        break;
                }
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    iA04 = bArr[iA04];
                }
                paint.setColor(iArr[iA04]);
                float f3 = i8;
                float f4 = i5;
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "PxagUxU0Gd3Wd2jZQY5J7se2mW8fT";
                canvas.drawRect(f3, f4, i8 + peek, i5 + 1, paint);
            }
            i8 += peek;
        } while (!z);
        return i8;
    }

    public static int A03(C0644Hy c0644Hy, int[] iArr, byte[] bArr, int i, int i5, Paint paint, Canvas canvas) {
        int clutIndex;
        int i8 = i;
        boolean z = false;
        do {
            int iA04 = c0644Hy.A04(8);
            if (iA04 != 0) {
                clutIndex = 1;
            } else if (!c0644Hy.A0F()) {
                clutIndex = c0644Hy.A04(7);
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "SuejjuLnG0h9t9VMaryqiTg33Oi2Z";
                if (clutIndex != 0) {
                    iA04 = 0;
                } else {
                    z = true;
                    clutIndex = 0;
                    iA04 = 0;
                }
            } else {
                clutIndex = c0644Hy.A04(7);
                iA04 = c0644Hy.A04(8);
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    iA04 = bArr[iA04];
                }
                paint.setColor(iArr[iA04]);
                canvas.drawRect(i8, i5, i8 + clutIndex, i5 + 1, paint);
            }
            i8 += clutIndex;
        } while (!z);
        return i8;
    }

    public static G1 A06(C0644Hy c0644Hy) {
        int iA04 = c0644Hy.A04(16);
        c0644Hy.A08(4);
        int objectId = c0644Hy.A04(2);
        boolean zA0F = c0644Hy.A0F();
        c0644Hy.A08(1);
        byte[] bArr = null;
        byte[] bArr2 = null;
        if (objectId == 1) {
            int numberOfCodes = c0644Hy.A04(8);
            c0644Hy.A08(numberOfCodes * 16);
        } else if (objectId == 0) {
            int objectCodingMethod = c0644Hy.A04(16);
            int objectId2 = c0644Hy.A04(16);
            if (objectCodingMethod > 0) {
                bArr = new byte[objectCodingMethod];
                c0644Hy.A0E(bArr, 0, objectCodingMethod);
            }
            if (objectId2 > 0) {
                bArr2 = new byte[objectId2];
                c0644Hy.A0E(bArr2, 0, objectId2);
            } else {
                bArr2 = bArr;
            }
        }
        return new G1(iA04, zA0F, bArr, bArr2);
    }

    public static G2 A07(C0644Hy c0644Hy, int i) {
        int iA04 = c0644Hy.A04(8);
        int iA042 = c0644Hy.A04(4);
        int iA043 = c0644Hy.A04(2);
        c0644Hy.A08(2);
        int i5 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i5 > 0) {
            int remainingLength = c0644Hy.A04(8);
            c0644Hy.A08(8);
            int version = c0644Hy.A04(16);
            int timeoutSecs = c0644Hy.A04(16);
            i5 -= 6;
            sparseArray.put(remainingLength, new G3(version, timeoutSecs));
        }
        return new G2(iA04, iA042, iA043, sparseArray);
    }

    public static void A0B(G1 g1, C0595Fz c0595Fz, int i, int i5, int i8, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c0595Fz.A03;
        } else {
            if (A08[2].length() == 20) {
                throw new RuntimeException();
            }
            A08[1] = "74G7JuTvJBV0INH1XI3DUfK6d2EWZ";
            if (i == 2) {
                iArr = c0595Fz.A02;
            } else {
                iArr = c0595Fz.A01;
            }
        }
        A0D(g1.A03, iArr, i, i5, i8, paint, canvas);
        A0D(g1.A02, iArr, i, i5, i8 + 1, paint, canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0C(com.meta.analytics.dsp.uinode.C0644Hy r6, com.meta.analytics.dsp.uinode.G6 r7) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.G7.A0C(com.facebook.ads.redexgen.X.Hy, com.facebook.ads.redexgen.X.G6):void");
    }

    public static void A0D(byte[] bArr, int[] iArr, int i, int i5, int i8, Paint paint, Canvas canvas) {
        byte[] clutMapTable4To8;
        byte[] clutMapTable4To82;
        int line = i8;
        C0644Hy c0644Hy = new C0644Hy(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        int column = i5;
        while (c0644Hy.A01() != 0) {
            switch (c0644Hy.A04(8)) {
                case 16:
                    if (i == 3) {
                        clutMapTable4To8 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i == 2) {
                        clutMapTable4To8 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        clutMapTable4To8 = null;
                        if (A08[5].length() == 5) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A08;
                        strArr[0] = "aCQdDxqS2bkmSWw219FL9FrVQLNlGxjh";
                        strArr[7] = "CXVqOrR1KNECyNPiemwICdwFVxmD3XsB";
                    }
                    if (A08[5].length() != 5) {
                        A08[1] = "sxwfPuAvCy0meNXm9qprXKFgJpDmZ";
                        column = A01(c0644Hy, iArr, clutMapTable4To8, column, line, paint, canvas);
                        c0644Hy.A05();
                    } else {
                        throw new RuntimeException();
                    }
                    break;
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    if (i == 3) {
                        clutMapTable4To82 = 0 == 0 ? A0B : null;
                    } else {
                        clutMapTable4To82 = null;
                    }
                    column = A02(c0644Hy, iArr, clutMapTable4To82, column, line, paint, canvas);
                    c0644Hy.A05();
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    column = A03(c0644Hy, iArr, null, column, line, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, c0644Hy);
                    break;
                case 33:
                    clutMapTable2To4 = A0E(4, 8, c0644Hy);
                    break;
                case 34:
                    clutMapTable2To4 = A0E(16, 8, c0644Hy);
                    break;
                case 240:
                    line += 2;
                    column = i5;
                    break;
            }
        }
    }

    public static byte[] A0E(int i, int i5, C0644Hy c0644Hy) {
        byte[] bArr = new byte[i];
        for (int i8 = 0; i8 < i; i8++) {
            bArr[i8] = (byte) c0644Hy.A04(i5);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                int i5 = i & 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "OBOqbcJ5TVgi";
                int i8 = i5 != 0 ? 255 : 0;
                iArr[i] = A00(255, i8, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i10 = (i & 1) != 0 ? 127 : 0;
                iArr[i] = A00(255, i10, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x003c, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] A0H() {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.G7.A0H():int[]");
    }

    public final void A0J() {
        this.A06.A00();
    }
}
