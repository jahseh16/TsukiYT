package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FO extends AbstractC1148am {
    public static byte[] A00;
    public static String[] A01 = {"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, 12, 69, 95, 12, 66, 67, 88, 12, 94, 73, 77, 72, 85, 12, 67, 94, 12, 77, 64, 94, 73, 77, 72, 85, 12, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, 61, 37};
    }

    static {
        A03();
    }

    public FO(C1064Yn c1064Yn, C02591u c02591u) {
        super(c1064Yn, c02591u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j) {
        HashMap map = new HashMap();
        map.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls == null || trackingUrls.isEmpty()) {
            return;
        }
        Iterator<String> it = trackingUrls.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (zHasNext) {
                new AsyncTaskC0877Re(this.A0B, extraData).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1148am
    public final void A0M() {
        C1182bK c1182bK = (C1182bK) this.A01;
        if (c1182bK.A0R()) {
            if (this.A06 != null) {
                this.A06.A0B(c1182bK);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1148am
    public final void A0O(InterfaceC02280p interfaceC02280p, C8S c8s, C8Q c8q, C02601v c02601v) {
        C1182bK c1182bK = (C1182bK) interfaceC02280p;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1145aj c1145aj = new C1145aj(this, c02601v, c1182bK, jCurrentTimeMillis, c8q);
        A0F().postDelayed(c1145aj, c8s.A05().A05());
        c1182bK.A0L(this.A0B, new C1144ai(this, c1145aj, jCurrentTimeMillis, c8q), this.A08, c02601v, V2.A0K());
    }
}
