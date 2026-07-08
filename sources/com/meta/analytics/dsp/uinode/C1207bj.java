package com.meta.analytics.dsp.uinode;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1207bj {
    public static byte[] A03;
    public File A00;
    public RandomAccessFile A01;
    public final C0B A02;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-99, -34, -16, -99, -31, -26, -16, -32, -99, -32, -34, -32, -27, -30, 101, -85, -76, -73, 101, -88, -76, -78, -75, -79, -86, -71, -82, -76, -77, 102, -65, 8, 18, -65, 2, 14, 12, 15, 11, 4, 19, 4, 3, -64, -59, 25, 20, -59, 102, -100, -89, -81, -90, -92, -89, -103, -100, 114, -112, -99, 86, -93, 79, -110, -101, -108, -112, -99, 79, -107, -104, -101, -108, -94, -49, -49, -52, -49, 125, -66, -51, -51, -62, -53, -63, 125, -64, -66, -64, -59, -62, -105, 125, -64, -66, -64, -59, -62, 125, -61, -58, -55, -62, 125, -47, -2, -2, -5, -2, -84, -17, -8, -5, -1, -11, -6, -13, -84, -14, -11, -8, -15, -84, -22, 23, 23, 20, 23, -59, 20, 21, 10, 19, 14, 19, 12, -59, -65, -20, -20, -23, -20, -102, -20, -33, -37, -34, -29, -24, -31, -102, -26, -33, -24, -31, -18, -30, -102, -23, -32, -102, -32, -29, -26, -33, -102, -106, -61, -61, -64, -61, 113, -61, -74, -65, -78, -66, -70, -65, -72, 113, -73, -70, -67, -74, 113, -20, 25, 25, 22, 25, -57, 28, 26, 16, 21, 14, -57, 13, 16, 19, 12, -57, -41, 4, 4, 1, 4, -78, 9, 4, -5, 6, -5, 0, -7, -78, -73, -10, -78, -12, 11, 6, -9, 5, -78, 6, 1, -78, -73, 5, -78, -8, 4, 1, -1, -78, -12, 7, -8, -8, -9, 4, -78, 9, -5, 6, -6, -78, 5, -5, 12, -9, -78, -73, -10, -34, 18, 23};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A07() throws C1205bh {
        if (A09()) {
            return;
        }
        A06();
        File file = new File(this.A00.getParentFile(), this.A00.getName().substring(0, this.A00.getName().length() - A00(48, 9, 15).length()));
        if (!this.A00.renameTo(file)) {
            throw new C1205bh(A00(166, 20, 40) + this.A00 + A00(44, 4, 124) + file + A00(14, 16, 28));
        }
        this.A00 = file;
        try {
            this.A01 = new RandomAccessFile(this.A00, A00(NotificationCompat.FLAG_LOCAL_ONLY, 1, 67));
        } catch (IOException e4) {
            throw new C1205bh(A00(123, 14, 124) + this.A00 + A00(0, 14, 84), e4);
        }
    }

    public C1207bj(File file, C0B c0b) throws C1205bh {
        try {
            if (c0b != null) {
                this.A02 = c0b;
                File directory = file.getParentFile();
                C0E.A06(directory);
                boolean zExists = file.exists();
                this.A00 = zExists ? file : new File(file.getParentFile(), file.getName() + A00(48, 9, 15));
                this.A01 = new RandomAccessFile(this.A00, zExists ? A00(NotificationCompat.FLAG_LOCAL_ONLY, 1, 67) : A00(257, 2, 119));
                return;
            }
            throw new NullPointerException();
        } catch (IOException e4) {
            throw new C1205bh(A00(186, 17, 126) + file + A00(0, 14, 84), e4);
        }
    }

    private boolean A02(File file) {
        return file.getName().endsWith(A00(48, 9, 15));
    }

    public final synchronized int A03() throws C1205bh {
        try {
        } catch (IOException e4) {
            throw new C1205bh(A00(137, 29, 81) + this.A00, e4);
        }
        return (int) this.A01.length();
    }

    public final File A04() {
        return this.A00;
    }

    public final synchronized void A05() throws C1205bh {
        try {
            this.A01.setLength(0L);
        } catch (IOException e4) {
            throw new C1205bh(A00(57, 16, 6), e4);
        }
    }

    public final synchronized void A06() throws C1205bh {
        try {
            this.A01.close();
            this.A02.AGh(this.A00);
        } catch (IOException e4) {
            throw new C1205bh(A00(104, 19, 99) + this.A00, e4);
        }
    }

    public final synchronized void A08(byte[] bArr, int i) throws C1205bh {
        try {
            if (!A09()) {
                this.A01.seek(A03());
                this.A01.write(bArr, 0, i);
            } else {
                throw new C1205bh(A00(73, 31, 52) + this.A00 + A00(30, 14, 118));
            }
        } catch (IOException e4) {
            throw new C1205bh(String.format(Locale.US, A00(203, 53, 105), Integer.valueOf(i), this.A01, Integer.valueOf(bArr.length)), e4);
        }
    }

    public final synchronized boolean A09() {
        return !A02(this.A00);
    }
}
