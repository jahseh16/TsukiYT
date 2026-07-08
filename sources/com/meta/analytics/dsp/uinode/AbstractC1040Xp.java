package com.meta.analytics.dsp.uinode;

import com.meta.analytics.dsp.uinode.AbstractC1041Xq;
import com.meta.analytics.dsp.uinode.C1042Xr;
import java.lang.Exception;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1040Xp<I extends C1042Xr, O extends AbstractC1041Xq, E extends Exception> implements BB<I, O, E> {
    public int A00;
    public int A01;
    public int A02;
    public I A03;
    public E A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque<I> A09 = new ArrayDeque<>();
    public final ArrayDeque<O> A0A = new ArrayDeque<>();

    public abstract I A0T();

    public abstract O A0V();

    public abstract E A0W(I i, O o, boolean z);

    public abstract E A0X(Throwable th);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    public AbstractC1040Xp(I[] iArr, O[] oArr) {
        this.A0B = iArr;
        this.A00 = iArr.length;
        for (int i = 0; i < this.A00; i++) {
            ((I[]) this.A0B)[i] = A0T();
        }
        this.A0C = oArr;
        this.A01 = oArr.length;
        for (int i5 = 0; i5 < this.A01; i5++) {
            ((O[]) this.A0C)[i5] = A0V();
        }
        BE be = new BE(this);
        this.A08 = be;
        be.start();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    private void A0K() {
        if (A0Q()) {
            this.A07.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    private void A0L() throws Exception {
        E e4 = this.A04;
        if (e4 == null) {
        } else {
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    public void A0M() {
        do {
            try {
            } catch (InterruptedException e4) {
                throw new IllegalStateException(e4);
            }
        } while (A0R());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    private void A0N(I inputBuffer) {
        inputBuffer.A07();
        I[] iArr = this.A0B;
        int i = this.A00;
        this.A00 = i + 1;
        iArr[i] = inputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    private void A0O(O outputBuffer) {
        outputBuffer.A07();
        O[] oArr = this.A0C;
        int i = this.A01;
        this.A01 = i + 1;
        oArr[i] = outputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    private boolean A0Q() {
        return !this.A09.isEmpty() && this.A01 > 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    private boolean A0R() throws InterruptedException {
        synchronized (this.A07) {
            while (!this.A06 && !A0Q()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I iRemoveFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i = this.A01 - 1;
            this.A01 = i;
            O o = oArr[i];
            boolean z = this.A05;
            this.A05 = false;
            if (iRemoveFirst.A04()) {
                o.A00(4);
            } else {
                if (iRemoveFirst.A03()) {
                    o.A00(Integer.MIN_VALUE);
                }
                try {
                    this.A04 = A0W(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e4) {
                    this.A04 = (E) A0X(e4);
                } catch (RuntimeException e5) {
                    this.A04 = (E) A0X(e5);
                }
                if (this.A04 != null) {
                    synchronized (this.A07) {
                    }
                    return false;
                }
            }
            synchronized (this.A07) {
                if (this.A05) {
                    A0O(o);
                } else if (o.A03()) {
                    this.A02++;
                    A0O(o);
                } else {
                    o.A00 = this.A02;
                    this.A02 = 0;
                    this.A0A.addLast(o);
                }
                A0N(iRemoveFirst);
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    @Override // com.meta.analytics.dsp.uinode.BB
    /* JADX INFO: renamed from: A0S, reason: merged with bridge method [inline-methods] */
    public final I A54() throws Exception {
        I i;
        synchronized (this.A07) {
            A0L();
            AbstractC0620Ha.A04(this.A03 == null);
            int i5 = this.A00;
            if (i5 == 0) {
                i = null;
            } else {
                I[] iArr = this.A0B;
                int i8 = i5 - 1;
                this.A00 = i8;
                i = iArr[i8];
            }
            this.A03 = i;
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    @Override // com.meta.analytics.dsp.uinode.BB
    /* JADX INFO: renamed from: A0U, reason: merged with bridge method [inline-methods] */
    public final O A55() throws Exception {
        synchronized (this.A07) {
            A0L();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    public final void A0Y(int i) {
        AbstractC0620Ha.A04(this.A00 == this.A0B.length);
        for (I i5 : this.A0B) {
            i5.A09(i);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    @Override // com.meta.analytics.dsp.uinode.BB
    /* JADX INFO: renamed from: A0Z, reason: merged with bridge method [inline-methods] */
    public final void AEG(I inputBuffer) throws Exception {
        synchronized (this.A07) {
            A0L();
            AbstractC0620Ha.A03(inputBuffer == this.A03);
            this.A09.addLast(inputBuffer);
            A0K();
            this.A03 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    public void A0a(O outputBuffer) {
        synchronized (this.A07) {
            A0O(outputBuffer);
            A0K();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    @Override // com.meta.analytics.dsp.uinode.BB
    public final void AEV() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    @Override // com.meta.analytics.dsp.uinode.BB
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            I i = this.A03;
            if (i != null) {
                A0N(i);
                this.A03 = null;
            }
            while (!this.A09.isEmpty()) {
                A0N(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                A0O(this.A0A.removeFirst());
            }
        }
    }
}
