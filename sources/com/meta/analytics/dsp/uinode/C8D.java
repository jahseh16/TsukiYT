package com.meta.analytics.dsp.uinode;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C8D extends O7 {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass86 A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-7, 13, -4, 1, 7};
    }

    public C8D(AnonymousClass86 anonymousClass86) {
        this.A00 = anonymousClass86;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(O8 o8) {
        if (this.A00.A00 == null || this.A00.A00.get() == null) {
            this.A00.A00 = new WeakReference(new QW(this));
        }
        ((AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 34))).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) this.A00.A00.get(), 3, 1);
    }
}
