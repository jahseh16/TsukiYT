package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0989Vn implements InterfaceC0615Gu {
    public static String[] A04 = {"X6WlBdbGeBIUy9RcgyD1kPyvMH5gl65h", "mWixtdhRvEEOtO49Z6LrUITCnd", "19dVuEeyHaOsnSLi", "Fh0FDziHvuuc46M8RjDn", "TMNOdV", "BntQd7XboiQ5Pp5LCDj1cbVKSXS32D1x", "NrlP0Z8V9f9J6rKzzcCufZh8yiDjfbRh", "BOidXQkRBMfwkg7VYmAkrOpgeHcKVKv0"};
    public long A00;
    public boolean A01;
    public final InterfaceC0613Gs A02;
    public final InterfaceC0615Gu A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final long ADl(C0619Gy c0619Gy) throws IOException {
        long jADl = this.A03.ADl(c0619Gy);
        this.A00 = jADl;
        if (jADl == 0) {
            return 0L;
        }
        if (c0619Gy.A02 == -1 && this.A00 != -1) {
            c0619Gy = new C0619Gy(c0619Gy.A04, c0619Gy.A01, c0619Gy.A03, this.A00, c0619Gy.A05, c0619Gy.A00);
        }
        this.A01 = true;
        this.A02.ADn(c0619Gy);
        return this.A00;
    }

    public C0989Vn(InterfaceC0615Gu interfaceC0615Gu, InterfaceC0613Gs interfaceC0613Gs) {
        this.A03 = (InterfaceC0615Gu) AbstractC0620Ha.A01(interfaceC0615Gu);
        this.A02 = (InterfaceC0613Gs) AbstractC0620Ha.A01(interfaceC0613Gs);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final Uri A8E() {
        return this.A03.A8E();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final void close() throws IOException {
        try {
            this.A03.close();
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        } catch (Throwable th) {
            boolean z = this.A01;
            if (A04[5].charAt(29) != 'a') {
                A04[1] = "CXpRjqYaQVmivrsYVOmY1oz";
                if (z) {
                    this.A01 = false;
                    InterfaceC0613Gs interfaceC0613Gs = this.A02;
                    if (A04[1].length() != 2) {
                        A04[5] = "FmRI3fMemMJaQGBcEYhbAky7hUfnuUR1";
                        interfaceC0613Gs.close();
                    }
                }
                throw th;
            }
            throw new RuntimeException();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final int read(byte[] bArr, int i, int i5) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int i8 = this.A03.read(bArr, i, i5);
        if (i8 > 0) {
            this.A02.write(bArr, i, i8);
            long j = this.A00;
            if (j != -1) {
                this.A00 = j - ((long) i8);
            }
        }
        return i8;
    }
}
