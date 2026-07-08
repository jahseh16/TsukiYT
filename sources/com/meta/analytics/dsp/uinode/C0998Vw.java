package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0998Vw implements InterfaceC0615Gu {
    public static byte[] A05;
    public static String[] A06 = {"2AQ", "PKEE8tvP1F9G5CS2asOfHv5i9NmL9OD8", "nghUlW0EKiCso94RSH6SGDaiGhOOZ9vR", "y3nJ4vSOM9HwnTFSw", "dDA", "lgpDjnw", "z3SCjqWwobuDiPiZI", "K1NyJtZzbkl5fIhEU"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    public final HG<? super C0998Vw> A04;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-23};
        if (A06[3].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[2] = "0CNdTW9yzTlkWk7IYlaLkwwChYLMq6mo";
        strArr[1] = "0Hm8psTbLgTGmvvfzx0WFuRjr22Bb9pe";
        A05 = bArr;
    }

    static {
        A01();
    }

    public C0998Vw() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C0998Vw(HG<? super C0998Vw> hg) {
        this.A04 = hg;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final Uri A8E() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final long ADl(C0619Gy c0619Gy) throws IOException {
        try {
            this.A01 = c0619Gy.A04;
            RandomAccessFile randomAccessFile = new RandomAccessFile(c0619Gy.A04.getPath(), A00(0, 1, 20));
            this.A02 = randomAccessFile;
            randomAccessFile.seek(c0619Gy.A03);
            long length = c0619Gy.A02 == -1 ? this.A02.length() - c0619Gy.A03 : c0619Gy.A02;
            this.A00 = length;
            if (length >= 0) {
                this.A03 = true;
                HG<? super C0998Vw> hg = this.A04;
                if (hg != null) {
                    hg.ADP(this, c0619Gy);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e4) {
            throw new H1(e4);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final void close() throws H1 {
        this.A01 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.A02;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e4) {
                throw new H1(e4);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                HG<? super C0998Vw> hg = this.A04;
                if (hg != null) {
                    hg.ADO(this);
                }
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final int read(byte[] bArr, int i, int i5) throws IOException {
        if (i5 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        try {
            int i8 = this.A02.read(bArr, i, (int) Math.min(j, i5));
            if (i8 > 0) {
                this.A00 -= (long) i8;
                HG<? super C0998Vw> hg = this.A04;
                if (hg != null) {
                    hg.AB1(this, i8);
                }
            }
            return i8;
        } catch (IOException e4) {
            throw new H1(e4);
        }
    }
}
