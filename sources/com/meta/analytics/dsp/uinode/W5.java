package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W5 implements InterfaceC0615Gu {
    public static byte[] A06;
    public static String[] A07 = {"LZDHzUEPY8huLib8qPH1v7czaaxlCYVW", "Hfajs1uaSYD8XiY9EEWii1aSJKbCXH1k", "56ilEDtV1sbTjQDLh", "Yd2dmsZ5", "tr3yrs0rtPd5aa0L", "Zl3VJckSqinxve9JbD33GDfHo4YeuNba", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING};
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;
    public final HG<? super W5> A05;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A07[3] = "kcdTjQCUlglhSnU2yukjc";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 41);
            i10++;
        }
    }

    public static void A01() {
        A06 = new byte[]{100, 107, -99, -86, -96, -82, -85, -91, -96, -101, -99, -81, -81, -95, -80, 107};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final long ADl(C0619Gy c0619Gy) throws C0608Gn {
        try {
            Uri uri = c0619Gy.A04;
            this.A01 = uri;
            String path = uri.getPath();
            if (path.startsWith(A00(1, 15, 19))) {
                path = path.substring(15);
            } else if (path.startsWith(A00(0, 1, 12))) {
                path = path.substring(1);
            }
            InputStream inputStreamOpen = this.A04.open(path, 1);
            this.A02 = inputStreamOpen;
            if (inputStreamOpen.skip(c0619Gy.A03) < c0619Gy.A03) {
                throw new EOFException();
            }
            if (c0619Gy.A02 != -1) {
                this.A00 = c0619Gy.A02;
            } else {
                long jAvailable = this.A02.available();
                this.A00 = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.A00 = -1L;
                }
            }
            this.A03 = true;
            HG<? super W5> hg = this.A05;
            if (hg != null) {
                hg.ADP(this, c0619Gy);
            }
            return this.A00;
        } catch (IOException e4) {
            throw new C0608Gn(e4);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.AssetDataSource> */
    public W5(Context context, HG<? super W5> hg) {
        this.A04 = context.getAssets();
        this.A05 = hg;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final Uri A8E() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final void close() throws C0608Gn {
        this.A01 = null;
        try {
            try {
                InputStream inputStream = this.A02;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e4) {
                throw new C0608Gn(e4);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                HG<? super W5> hg = this.A05;
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
        if (j != -1) {
            try {
                i5 = (int) Math.min(j, i5);
            } catch (IOException e4) {
                throw new C0608Gn(e4);
            }
        }
        int i8 = this.A02.read(bArr, i, i5);
        if (i8 == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0608Gn(new EOFException());
        }
        long j4 = this.A00;
        if (j4 != -1) {
            long j7 = i8;
            if (A07[3].length() == 13) {
                throw new RuntimeException();
            }
            A07[4] = "Doxe12teItAf98KBLMhQOs4gzgBHzz";
            this.A00 = j4 - j7;
        }
        HG<? super W5> hg = this.A05;
        if (hg != null) {
            hg.AB1(this, i8);
        }
        return i8;
    }
}
