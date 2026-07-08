package com.meta.analytics.dsp.uinode;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0500Bq implements WL {
    public static String[] A06 = {"KcRMvDVLZNgc0ooVkhN4ahdKcengok4t", "7pRgSHJJ", "GNHbGuKbKosn0JAz4xkib8iBcGb5WNz5", "hJNyShuwv1tZ2cTKHVoLW9isLSOVhBhj", "H7WHQ", "6cZmXLfi2DPGYj7ZmxIdQ5A", "b2Hmg2LD", "cSsJl4a3bVOvbO76ENMD9MAL1lcw3B"};
    public long A00;
    public long A01;
    public C03324q A02;
    public final ArrayDeque<C03324q> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC0501Br> A04;
    public final PriorityQueue<C03324q> A05;

    public abstract WI A0N();

    public abstract void A0P(C5 c52);

    public abstract boolean A0R();

    public AbstractC0500Bq() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new C03324q());
        }
        this.A04 = new ArrayDeque<>();
        for (int i5 = 0; i5 < 2; i5++) {
            this.A04.add(new C03294n(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C03324q c03324q) {
        c03324q.A07();
        this.A03.add(c03324q);
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    /* JADX INFO: renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public C5 A54() throws C0585Fp {
        AbstractC0620Ha.A04(this.A02 == null);
        boolean zIsEmpty = this.A03.isEmpty();
        if (A06[4].length() != 5) {
            throw new RuntimeException();
        }
        A06[4] = "MSCQz";
        if (zIsEmpty) {
            return null;
        }
        C03324q c03324qPollFirst = this.A03.pollFirst();
        this.A02 = c03324qPollFirst;
        return c03324qPollFirst;
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public AbstractC0501Br A55() throws C0585Fp {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C1042Xr) this.A05.peek()).A00 <= this.A00) {
            C03324q c03324qPoll = this.A05.poll();
            if (c03324qPoll.A04()) {
                AbstractC0501Br abstractC0501BrPollFirst = this.A04.pollFirst();
                abstractC0501BrPollFirst.A00(4);
                A0K(c03324qPoll);
                String[] strArr = A06;
                if (strArr[1].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "Z7l20gfPvvtRCAhrDUNIN8ivECfXDju3";
                strArr2[3] = "MHWMj6Fd4O5yELPFkyyjrniha9DdnabU";
                return abstractC0501BrPollFirst;
            }
            A0P(c03324qPoll);
            if (A0R()) {
                WI wiA0N = A0N();
                if (!c03324qPoll.A03()) {
                    AbstractC0501Br abstractC0501BrPollFirst2 = this.A04.pollFirst();
                    abstractC0501BrPollFirst2.A09(((C1042Xr) c03324qPoll).A00, wiA0N, Long.MAX_VALUE);
                    A0K(c03324qPoll);
                    return abstractC0501BrPollFirst2;
                }
            }
            A0K(c03324qPoll);
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void AEG(C5 c52) throws C0585Fp {
        AbstractC0620Ha.A03(c52 == this.A02);
        if (A06[0].charAt(9) != 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "h6rCbn8hi0Qg5CvGAi8vHFDPjl0uqV";
        strArr[5] = "6Me2Lvii1P8K0tFjrCRJacm";
        if (c52.A03()) {
            A0K(this.A02);
        } else {
            C03324q c03324q = this.A02;
            long j = this.A01;
            this.A01 = 1 + j;
            c03324q.A00 = j;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC0501Br abstractC0501Br) {
        abstractC0501Br.A07();
        this.A04.add(abstractC0501Br);
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    public void AEV() {
    }

    @Override // com.meta.analytics.dsp.uinode.WL
    public void AGB(long j) {
        this.A00 = j;
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        C03324q c03324q = this.A02;
        if (c03324q != null) {
            A0K(c03324q);
            this.A02 = null;
        }
    }
}
