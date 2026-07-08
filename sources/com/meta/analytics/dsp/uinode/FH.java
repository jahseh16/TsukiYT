package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FH extends AbstractC0952Ub<C1142ag> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public FH(C1142ag c1142ag) {
        super(c1142ag);
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C1142ag c1142agA07 = A07();
        if (c1142agA07 == null) {
            return;
        }
        C1064Yn c1064Yn = c1142agA07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (M5.A02(c1064Yn)) {
            c1142agA07.A07();
        } else {
            c1142agA07.A05.postDelayed(c1142agA07.A0C, 5000L);
        }
    }
}
