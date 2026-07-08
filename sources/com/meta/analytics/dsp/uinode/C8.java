package com.meta.analytics.dsp.uinode;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C8 extends AbstractC1040Xp<C5, AbstractC0501Br, C0585Fp> implements WL {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{-68, -43, -52, -33, -41, -52, -54, -37, -52, -53, -121, -53, -52, -54, -42, -53, -52, -121, -52, -39, -39, -42, -39};
    }

    public abstract InterfaceC0584Fo A0b(byte[] bArr, int i, boolean z) throws C0585Fp;

    public C8(String str) {
        super(new C5[2], new AbstractC0501Br[2]);
        this.A00 = str;
        A0Y(UserMetadata.MAX_ATTRIBUTE_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6Q] */
    @Override // com.meta.analytics.dsp.uinode.AbstractC1040Xp
    /* JADX INFO: renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final C6Q A0V() {
        return new AbstractC0501Br(this) { // from class: com.facebook.ads.redexgen.X.6Q
            public final C8 A00;

            {
                this.A00 = this;
            }

            @Override // com.meta.analytics.dsp.uinode.AbstractC0501Br
            public final void A08() {
                this.A00.A0c(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC1040Xp
    /* JADX INFO: renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final C0585Fp A0W(C5 c52, AbstractC0501Br abstractC0501Br, boolean z) {
        try {
            ByteBuffer inputData = c52.A01;
            abstractC0501Br.A09(((C1042Xr) c52).A00, A0b(inputData.array(), inputData.limit(), z), c52.A00);
            abstractC0501Br.A01(Integer.MIN_VALUE);
            return null;
        } catch (C0585Fp e4) {
            return e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC1040Xp
    /* JADX INFO: renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final C0585Fp A0X(Throwable th) {
        return new C0585Fp(A0I(0, 23, 36), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC1040Xp
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C5 A0T() {
        return new C5();
    }

    public final void A0c(AbstractC0501Br abstractC0501Br) {
        super.A0a(abstractC0501Br);
    }

    @Override // com.meta.analytics.dsp.uinode.WL
    public final void AGB(long j) {
    }
}
