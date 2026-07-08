package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class ZY extends AbstractC03334r {
    public static byte[] A03;
    public static String[] A04 = {"WP5CpU5dCfM1vj2iCgRczyLeS833jqA7", "f0t6mABNpir4NiI1IJBR", "VMSqLwjWc3fXvu7D9B7JwatTJSWiKmSt", "2kGOlvpEajHcc9JJ5BV7kSrV8Uhb9VDh", "BGGgbgkg4NpzKA2XjpG6Q8iHB2GG9zH0", "ziOTckvigWpUqNYWulExTvMWDfbzI1Sq", "WkLWBkQ13lLgYVln8HDaQ7gYbGPRUWfj", "hZJ2tRP2pGaevCKAXmW2Fr9GhnOGACBf"};
    public C0547Eb A00;
    public Scroller A01;
    public final AbstractC03354t A02 = new ZZ(this);

    public static String A06(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-35, 10, -68, 5, 10, 15, 16, -3, 10, -1, 1, -68, 11, 2, -68, -21, 10, -30, 8, 5, 10, 3, -24, 5, 15, 16, 1, 10, 1, 14, -68, -3, 8, 14, 1, -3, 0, 21, -68, 15, 1, 16, -54};
        if (A04[2].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "Gfsvb5V6ZkZ1EjPhJmDEOg0wCX37AMGK";
        strArr[5] = "BogmwpJuEiSgKohE6B9VLJKkNQC2pxlX";
        A03 = bArr;
    }

    public abstract int A0C(AbstractC03304o abstractC03304o, int i, int i5);

    public abstract View A0D(AbstractC03304o abstractC03304o);

    @Deprecated
    public abstract C1089Zn A0E(AbstractC03304o abstractC03304o);

    public abstract int[] A0H(AbstractC03304o abstractC03304o, View view);

    static {
        A09();
    }

    private final C1089Zn A05(AbstractC03304o abstractC03304o) {
        return A0E(abstractC03304o);
    }

    private void A07() {
        this.A00.A1g(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1f(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 103));
    }

    private boolean A0A(AbstractC03304o abstractC03304o, int i, int i5) {
        C1089Zn c1089ZnA05;
        if (!(abstractC03304o instanceof AnonymousClass50) || (c1089ZnA05 = A05(abstractC03304o)) == null) {
            return false;
        }
        int iA0C = A0C(abstractC03304o, i, i5);
        String[] strArr = A04;
        if (strArr[0].charAt(25) == strArr[7].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "3QNQgzU1MIdfo8xP0zEWa1SfaSPVi8u7";
        strArr2[7] = "BhxrOivCOMjMD1hwED78TbVHZR3oyoMb";
        if (iA0C == -1) {
            return false;
        }
        c1089ZnA05.A0A(iA0C);
        abstractC03304o.A1L(c1089ZnA05);
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03334r
    public final boolean A0B(int i, int i5) {
        AbstractC03304o layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (Math.abs(i5) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && A0A(layoutManager, i, i5);
    }

    public final void A0F() {
        AbstractC03304o layoutManager;
        View viewA0D;
        C0547Eb c0547Eb = this.A00;
        if (c0547Eb == null || (layoutManager = c0547Eb.getLayoutManager()) == null || (viewA0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] iArrA0H = A0H(layoutManager, viewA0D);
        if (iArrA0H[0] != 0 || iArrA0H[1] != 0) {
            this.A00.A1c(iArrA0H[0], iArrA0H[1]);
        }
    }

    public final void A0G(C0547Eb c0547Eb) throws IllegalStateException {
        C0547Eb c0547Eb2 = this.A00;
        if (c0547Eb2 == c0547Eb) {
            return;
        }
        if (c0547Eb2 != null) {
            A07();
        }
        this.A00 = c0547Eb;
        if (c0547Eb != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
