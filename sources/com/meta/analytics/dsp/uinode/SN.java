package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SN extends AnonymousClass56 implements MJ {
    public static String[] A0B = {"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};
    public C1U A00;
    public RD A01;
    public RE A02;
    public RE A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C1064Yn A09;
    public final B4 A0A;

    public SN(B4 b4, SparseBooleanArray sparseBooleanArray, RE re, int i, int i5, int i8, int i10, C1064Yn c1064Yn, C1U c1u) {
        super(b4);
        this.A09 = c1064Yn;
        this.A0A = b4;
        this.A08 = sparseBooleanArray;
        this.A02 = re;
        this.A04 = i;
        this.A05 = i5;
        this.A06 = i8;
        this.A07 = i10;
        this.A00 = c1u;
    }

    private void A0A(J2 j22, C0723Lg c0723Lg, String str, C0836Pp c0836Pp) {
        if (this.A08.get(c0836Pp.A02())) {
            return;
        }
        RE re = this.A03;
        if (re != null) {
            re.A0V();
            if (A0B[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            A0B[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A03 = null;
        }
        this.A01 = new SP(this, str, c0836Pp, j22, c0836Pp.A04(), c0723Lg);
        RE re2 = new RE(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03 = re2;
        re2.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new SO(this, c0836Pp));
    }

    public final void A0j(C0836Pp c0836Pp, J2 j22, C03696c c03696c, C0723Lg c0723Lg, String str) {
        int iA02 = c0836Pp.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = iA02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, iA02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c0836Pp.A03().A0D().A07();
        String strA08 = c0836Pp.A03().A0D().A08();
        this.A0A.setIsVideo(!TextUtils.isEmpty(strA08));
        if (this.A0A.A18()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c03696c.A0S(strA08));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c0836Pp.A03().A0E().A06(), c0836Pp.A03().A0E().A01());
        this.A0A.setCTAInfo(c0836Pp.A03().A0F(), c0836Pp.A04());
        this.A0A.A1A(c0836Pp.A04());
        A0A(j22, c0723Lg, str, c0836Pp);
    }

    @Override // com.meta.analytics.dsp.uinode.MJ
    public final void AFr() {
        this.A0A.A13();
    }
}
