package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1005Wf implements DW {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.DW
    public final Metadata A51(E3 e32) {
        ByteBuffer byteBuffer = e32.A01;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C0645Hz c0645Hz = new C0645Hz(bArrArray, iLimit);
        String strA0Q = c0645Hz.A0Q();
        String strA0Q2 = c0645Hz.A0Q();
        long jA0M = c0645Hz.A0M();
        return new Metadata(new EventMessage(strA0Q, strA0Q2, IF.A0F(c0645Hz.A0M(), 1000L, jA0M), c0645Hz.A0M(), Arrays.copyOfRange(bArrArray, c0645Hz.A06(), iLimit), IF.A0F(c0645Hz.A0M(), 1000000L, jA0M)));
    }
}
