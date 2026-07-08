package com.meta.analytics.dsp.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1044Xt implements InterfaceC0459Ab {
    public static String[] A0D = {"pWxjFsNDaGkCJOJIXf3nBpXapJRDFAns", "UkLwcPvzhTn0p2HYHg4j6N15VQJC2l4J", "YJRY7F74jhCJ9GxMtbKfeDIDzZlQRHvd", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "sMHZoQnzt9jO1PxekMXjLs1IjEAfMk8v", "KagcOA94TBJJAh6RgnCdHwb09FdTTp2T", "s5OQD0o5JvIPNjQnPDHHdNmWUeQWTVLd"};
    public int A04;
    public long A06;
    public long A07;
    public B6 A08;
    public ByteBuffer A09;
    public ByteBuffer A0A;
    public ShortBuffer A0B;
    public boolean A0C;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public int A02 = -1;
    public int A05 = -1;
    public int A03 = -1;

    public C1044Xt() {
        ByteBuffer byteBuffer = InterfaceC0459Ab.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = InterfaceC0459Ab.A00;
        this.A04 = -1;
    }

    public final float A00(float f3) {
        float fA00 = IF.A00(f3, 0.1f, 8.0f);
        if (this.A00 != fA00) {
            this.A00 = fA00;
            this.A08 = null;
        }
        flush();
        return fA00;
    }

    public final float A01(float f3) {
        float fA00 = IF.A00(f3, 0.1f, 8.0f);
        if (this.A01 != fA00) {
            this.A01 = fA00;
            this.A08 = null;
        }
        flush();
        return fA00;
    }

    public final long A02(long j) {
        long j4 = this.A07;
        if (j4 >= 1024) {
            int i = this.A03;
            int i5 = this.A05;
            if (A0D[5].charAt(5) != 'Q') {
                throw new RuntimeException();
            }
            A0D[1] = "wo8T89BmhgCv6RPfRPDSoWflpmmFSmBw";
            if (i == i5) {
                return IF.A0F(j, this.A06, j4);
            }
            return IF.A0F(j, this.A06 * ((long) i), j4 * ((long) i5));
        }
        return (long) (((double) this.A01) * j);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final boolean A4Q(int i, int i5, int i8) throws C0458Aa {
        if (i8 == 2) {
            int i10 = this.A04;
            if (i10 == -1) {
                i10 = i;
            }
            int outputSampleRateHz = this.A05;
            if (outputSampleRateHz == i) {
                int outputSampleRateHz2 = this.A02;
                if (outputSampleRateHz2 == i5) {
                    int outputSampleRateHz3 = this.A03;
                    if (outputSampleRateHz3 == i10) {
                        return false;
                    }
                }
            }
            this.A05 = i;
            this.A02 = i5;
            this.A03 = i10;
            this.A08 = null;
            return true;
        }
        throw new C0458Aa(i, i5, i8);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final ByteBuffer A7W() {
        ByteBuffer byteBuffer = this.A0A;
        ByteBuffer outputBuffer = InterfaceC0459Ab.A00;
        this.A0A = outputBuffer;
        return byteBuffer;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final int A7X() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final int A7Y() {
        return 2;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final int A7Z() {
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final boolean A8w() {
        return this.A05 != -1 && (Math.abs(this.A01 - 1.0f) >= 0.01f || Math.abs(this.A00 - 1.0f) >= 0.01f || this.A03 != this.A05);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final boolean A91() {
        B6 b6;
        return this.A0C && ((b6 = this.A08) == null || b6.A0H() == 0);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final void AEE() {
        AbstractC0620Ha.A04(this.A08 != null);
        this.A08.A0J();
        this.A0C = true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final void AEF(ByteBuffer byteBuffer) {
        AbstractC0620Ha.A04(this.A08 != null);
        boolean zHasRemaining = byteBuffer.hasRemaining();
        if (A0D[1].charAt(8) != 'h') {
            throw new RuntimeException();
        }
        A0D[0] = "CgSP7s2gOF1CWMy2qVo8ASfS0wZJy2y3";
        if (zHasRemaining) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.A06 += (long) iRemaining;
            this.A08.A0L(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iA0H = this.A08.A0H() * this.A02 * 2;
        if (iA0H > 0) {
            int outputSize = this.A09.capacity();
            if (outputSize < iA0H) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iA0H).order(ByteOrder.nativeOrder());
                this.A09 = byteBufferOrder;
                this.A0B = byteBufferOrder.asShortBuffer();
            } else {
                this.A09.clear();
                this.A0B.clear();
            }
            this.A08.A0K(this.A0B);
            this.A07 += (long) iA0H;
            this.A09.limit(iA0H);
            this.A0A = this.A09;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final void flush() {
        if (A8w()) {
            B6 b6 = this.A08;
            if (b6 == null) {
                this.A08 = new B6(this.A05, this.A02, this.A01, this.A00, this.A03);
            } else {
                b6.A0I();
            }
        }
        this.A0A = InterfaceC0459Ab.A00;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = -1;
        ByteBuffer byteBuffer = InterfaceC0459Ab.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = InterfaceC0459Ab.A00;
        this.A04 = -1;
        this.A08 = null;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }
}
