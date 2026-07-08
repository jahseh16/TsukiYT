package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZA implements InterfaceC02631y {
    public static byte[] A03;
    public C03535m A00;
    public C1064Yn A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, 127, 122, 127, 126, 102, 127};
    }

    public ZA(C03535m c03535m, C1064Yn c1064Yn, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c03535m;
        this.A01 = c1064Yn;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02631y
    public final void ABR(C0670Jb c0670Jb) {
        KK.A00(new ZD(this, c0670Jb));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02631y
    public final void ACP(List<C1182bK> list) {
        C03696c manager = new C03696c(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (C1182bK c1182bK : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = c1182bK.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1182bK.A0E().A0G() != null) {
                    manager.A0b(new C03676a(c1182bK.A0E().A0G().getUrl(), c1182bK.A0E().A0G().getHeight(), c1182bK.A0E().A0G().getWidth(), c1182bK.A0G(), A02(0, 6, 2)));
                }
                if (c1182bK.A0E().A0F() != null) {
                    manager.A0b(new C03676a(c1182bK.A0E().A0F().getUrl(), c1182bK.A0E().A0F().getHeight(), c1182bK.A0E().A0F().getWidth(), c1182bK.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c1182bK.A0E().A0d())) {
                    manager.A0a(new C6Y(c1182bK.A0E().A0d(), c1182bK.A0G(), A02(0, 6, 2), c1182bK.A0E().A0A()));
                }
            }
        }
        manager.A0W(new ZB(this, list), new C6V(firstRequestId, A02(0, 6, 2)));
    }
}
