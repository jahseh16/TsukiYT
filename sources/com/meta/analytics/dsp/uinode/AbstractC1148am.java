package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1148am implements K3 {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C02330u A0G = null;
    public static final K4 A0H = null;
    public static final String A0I;
    public InterfaceC02280p A00;
    public InterfaceC02280p A01;
    public C8S A04;
    public K1 A05;
    public AbstractC02290q A06;
    public final C02591u A07;
    public final J2 A08;
    public final C02330u A09;
    public final K4 A0A;
    public final C1064Yn A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A07(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, 127, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 39, 108, 103, 110, 102, 97, 47, 97, 96, 123, 47, 99, 96, 110, 107, 106, 107, 38, 57, 28, 25, 8, 12, 29, 10, 88, 17, 11, 88, 22, 13, 20, 20, 88, 80, 27, 16, 25, 17, 22, 29, 28, 81, 45, 8, 13, 28, 24, 9, 30, 76, 5, 31, 76, 2, 25, 0, 0, 76, 68, 2, 3, 76, 15, 4, 13, 5, 2, 69, 78, 107, 110, 127, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 5, 36, 107, 38, 36, 57, 46, 107, 42, 47, 107, 40, 42, 37, 47, 34, 47, 42, 63, 46, 56, 101, 122, 95, 66, 67, 74, 13, 76, 73, 76, 93, 89, 72, 95, 13, 89, 84, 93, 72, 3, 46, 43, 111, 46, 35, 61, 42, 46, 43, 54, 111, 60, 59, 46, 61, 59, 42, 43, 94, 91, 76, 52, 37, 60, 26, 17, 24, 16, 23, 38, 9, 24, 11, 24, 20, 10, 76, 91, 74, 79, 90, 79, 97, 76, 68, 75, 77, 90, 14, 71, 93, 14, 64, 91, 66, 66, 38, 45, 32, 49, 58, 51, 55, 38, 39, 28, 42, 39, 122, 113, 105, 118, 109, 112, 113, 114, 122, 113, 107, 63, 118, 108, 63, 122, 114, 111, 107, 102, 38, 50, 37, 49, 53, 37, 46, 35, 57, 31, 35, 33, 48, 48, 41, 46, 39, 28, 27, 3, 20, 25, 28, 17, 85, 5, 25, 20, 22, 16, 24, 16, 27, 1, 85, 28, 27, 85, 7, 16, 6, 5, 26, 27, 6, 16, 10, 9, 7, 2, 57, 18, 15, 11, 3, 57, 11, 21, 44, 59, 47, 43, 59, 45, 42, 1, 55, 58};
    }

    public abstract void A0M();

    public abstract void A0O(InterfaceC02280p interfaceC02280p, C8S c8s, C8Q c8q, C02601v c02601v);

    static {
        A08();
        AbstractC0733Lq.A02();
        A0I = AbstractC1148am.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC1148am(C1064Yn c1064Yn, C02591u c02591u) {
        this.A0B = c1064Yn;
        this.A07 = c02591u;
        K4 k42 = A0H;
        if (k42 != null) {
            this.A0A = k42;
        } else {
            this.A0A = new K4(c1064Yn);
        }
        this.A0A.A0P(this);
        C02330u c02330u = A0G;
        if (c02330u != null) {
            this.A09 = c02330u;
        } else {
            this.A09 = new C02330u();
        }
        DynamicLoaderFactory.makeLoader(c1064Yn).getInitApi().onAdLoadInvoked(c1064Yn);
        this.A08 = c1064Yn.A09();
        c1064Yn.A0E().A4r();
    }

    private void A09(C0966Up c0966Up) {
        C8S placement = c0966Up.A00();
        if (placement == null || placement.A05() == null) {
            String strA07 = A07(279, 29, 125);
            C0670Jb error = new C0670Jb(AdErrorType.NO_AD_PLACEMENT, strA07);
            this.A0B.A0E().A4t(error.A03().getErrorCode(), strA07);
            AbstractC02290q abstractC02290q = this.A06;
            if (abstractC02290q != null) {
                abstractC02290q.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C8S c8s = this.A04;
        JSONObject jSONObjectA09 = c8s.A09();
        String strA072 = A07(195, 3, 93);
        if (jSONObjectA09 == null) {
            C8Q c8qA04 = c8s.A04();
            if (!A0D(c8s, c8qA04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A07().A9a(strA072, C8A.A0a, new C8B(A07(81, 26, 100), c8qA04.A02()));
                ABR(C0670Jb.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C02601v loadConfig = new C02601v(c8qA04.A04(), c8s.A05(), this.A07.A0A, c8s.A05().A0C());
            A0O(this.A00, c8s, c8qA04, loadConfig);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C8Q c8qA042 = c8s.A04();
        do {
            if (arrayList.isEmpty()) {
                if (A0D(c8s, c8qA042)) {
                    arrayList.add(c8qA042);
                } else {
                    return;
                }
            } else if (A0C(c8qA042)) {
                arrayList.add(c8qA042);
            }
            c8qA042 = c8s.A04();
        } while (c8qA042 != null);
        if (this.A00 == null) {
            this.A0B.A07().A9a(strA072, C8A.A0a, new C8B(A07(56, 25, 112), ((C8Q) arrayList.get(0)).A02()));
            ABR(C0670Jb.A00(AdErrorType.INTERNAL_ERROR));
            return;
        }
        boolean loaded = false;
        try {
            if (arrayList.size() > 1 && this.A00.AGd()) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C8Q) it.next()).A04());
                }
                jSONObject.put(A07(192, 3, 55), jSONArray);
                jSONObject.put(A07(198, 12, 113), c8s.A09());
                C02601v loadConfig2 = new C02601v(jSONObject, c8s.A05(), this.A07.A0A, c8s.A05().A0C());
                A0O(this.A00, c8s, c8qA042, loadConfig2);
                loaded = true;
            }
        } catch (Exception unused) {
            loaded = false;
        }
        if (!loaded) {
            if (arrayList.isEmpty()) {
                C0670Jb c0670JbA01 = C0670Jb.A01(AdErrorType.NO_FILL, A07(0, 0, 73));
                this.A0B.A0E().A4t(c0670JbA01.A03().getErrorCode(), A07(133, 22, 67));
                AbstractC02290q abstractC02290q2 = this.A06;
                if (abstractC02290q2 != null) {
                    abstractC02290q2.A0G(c0670JbA01);
                    return;
                }
                return;
            }
            InterfaceC02280p interfaceC02280p = this.A00;
            String[] strArr = A0E;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[0] = "F2ixlBYVHNYJB4bAHADqJrSynawwg1yM";
            strArr2[5] = "djkwyiiWLTaQwWMcVWQWfq0o8Ww2Jgo9";
            if (interfaceC02280p == null) {
                this.A0B.A07().A9a(strA072, C8A.A0a, new C8B(A07(22, 34, 7), ((C8Q) arrayList.get(0)).A02()));
                ABR(C0670Jb.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C8Q c8q = (C8Q) arrayList.get(0);
            C02601v loadConfig3 = new C02601v(c8q.A04(), c8s.A05(), this.A07.A0A, c8s.A05().A0C());
            A0O(this.A00, c8s, c8q, loadConfig3);
        }
    }

    private final void A0A(String str, AdExperienceType adExperienceType) {
        this.A0B.A0E().A4u(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            ABR(new C0670Jb(AdErrorType.API_NOT_SUPPORTED, A07(0, 0, 73)));
            return;
        }
        try {
            C0679Jl bidPayload = new C0679Jl(this.A0B, str, this.A07.A0A, this.A07.A09);
            K1 k1A01 = this.A07.A01(this.A0B, bidPayload, adExperienceType);
            this.A05 = k1A01;
            this.A0A.A0O(k1A01);
        } catch (C0671Jc e4) {
            C0670Jb c0670JbA02 = C0670Jb.A02(e4);
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            ABR(c0670JbA02);
        }
    }

    private void A0B(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 75));
            C02350w.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0C(C8Q c8q) {
        return (c8q == null || c8q.A04() == null) ? false : true;
    }

    private boolean A0D(C8S c8s, C8Q c8q) {
        String strA07 = A07(0, 0, 73);
        if (c8q == null) {
            C0670Jb c0670JbA01 = C0670Jb.A01(AdErrorType.NO_FILL, strA07);
            this.A0B.A0E().A4t(c0670JbA01.A03().getErrorCode(), A07(133, 22, 67));
            AbstractC02290q abstractC02290q = this.A06;
            if (abstractC02290q != null) {
                abstractC02290q.A0G(c0670JbA01);
            }
            return false;
        }
        String strA02 = c8q.A02();
        InterfaceC02280p interfaceC02280pA00 = this.A09.A00(this.A0B, c8s.A05().A0D());
        if (interfaceC02280pA00 == null) {
            this.A0B.A07().A9a(A07(195, 3, 93), C8A.A0a, new C8B(A07(0, 22, 2), strA02));
            ABR(C0670Jb.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (this.A07.A00() != interfaceC02280pA00.A7e()) {
            C0670Jb c0670JbA012 = C0670Jb.A01(AdErrorType.INTERNAL_ERROR, strA07);
            this.A0B.A0E().A4t(c0670JbA012.A03().getErrorCode(), A07(155, 19, 37));
            AbstractC02290q abstractC02290q2 = this.A06;
            if (abstractC02290q2 != null) {
                abstractC02290q2.A0G(c0670JbA012);
            }
            return false;
        }
        this.A00 = interfaceC02280pA00;
        String[] strArr = A0E;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[0] = "MKxF4EMWgzzLH5X7HNcHVA2i4zdAiZz9";
        strArr2[5] = "4tfdEW2uI31voJBW941pIR5b1aNGKiQe";
        JSONObject dataObject = c8q.A04();
        if (dataObject != null) {
            String adapterName = dataObject.optString(A07(320, 10, 86));
            this.A0B.A0E().AGD(adapterName);
            this.A0B.A0C(adapterName);
            C1063Ym c1063YmA00 = AbstractC03917e.A00();
            if (c1063YmA00 != null) {
                c1063YmA00.A0C(adapterName);
            }
            A0B(dataObject.optJSONObject(A07(262, 17, 72)));
            if (this.A05 == null) {
                String strA072 = A07(242, 20, 23);
                C0670Jb c0670JbA013 = C0670Jb.A01(AdErrorType.UNKNOWN_ERROR, strA072);
                this.A0B.A0E().A4t(c0670JbA013.A03().getErrorCode(), strA072);
                AbstractC02290q abstractC02290q3 = this.A06;
                if (abstractC02290q3 != null) {
                    abstractC02290q3.A0G(c0670JbA013);
                }
                return false;
            }
            return true;
        }
        String strA073 = A07(212, 18, 38);
        C0670Jb c0670JbA014 = C0670Jb.A01(AdErrorType.UNKNOWN_ERROR, strA073);
        this.A0B.A0E().A4t(c0670JbA014.A03().getErrorCode(), strA073);
        AbstractC02290q abstractC02290q4 = this.A06;
        if (abstractC02290q4 != null) {
            abstractC02290q4.A0G(c0670JbA014);
        }
        return false;
    }

    public final long A0E() {
        C8S c8s = this.A04;
        if (c8s != null) {
            return c8s.A03();
        }
        return -1L;
    }

    public final Handler A0F() {
        return A0F;
    }

    public C1F A0G() {
        return ((AbstractC1171b9) this.A01).A0H();
    }

    public final C8T A0H() {
        C8S c8s = this.A04;
        if (c8s == null) {
            return null;
        }
        return c8s.A05();
    }

    public final void A0I() {
        String strA6T;
        this.A0B.A0E().A2q(C0722Lf.A01(this.A03));
        InterfaceC02280p interfaceC02280p = this.A01;
        if (interfaceC02280p == null || (strA6T = interfaceC02280p.A6T()) == null) {
            return;
        }
        HashMap map = new HashMap();
        String strA04 = C0722Lf.A04(this.A03);
        String clientToken = A07(308, 12, 110);
        map.put(clientToken, strA04);
        new JA(strA6T, this.A08).A04(J9.A08, map);
    }

    public final void A0J() {
        InterfaceC02280p interfaceC02280p = this.A01;
        String strA07 = A07(195, 3, 93);
        if (interfaceC02280p == null) {
            String strA072 = A07(107, 26, 7);
            this.A0B.A07().A9a(strA07, C8A.A0Q, new C8B(strA072));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0E().A4t(adErrorType.getErrorCode(), strA072);
            AbstractC02290q abstractC02290q = this.A06;
            if (abstractC02290q != null) {
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC02290q.A0G(C0670Jb.A01(adErrorType, errorMessage));
            }
            this.A0B.A0E().A4w();
            return;
        }
        if (this.A0C) {
            String strA073 = A07(174, 18, 71);
            this.A0B.A07().A9a(strA07, C8A.A0M, new C8B(strA073));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0E().A4t(adErrorType2.getErrorCode(), strA073);
            AbstractC02290q abstractC02290q2 = this.A06;
            if (abstractC02290q2 != null) {
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC02290q2.A0G(C0670Jb.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0E().A4v();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A6T())) {
            this.A08.AA3(this.A01.A6T());
        }
        this.A0B.A0E().A4x();
        this.A0C = true;
        A0M();
    }

    public final void A0K() {
        A0V(false);
    }

    public final void A0L() {
        if (this.A02 != null) {
            C02350w.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0N(InterfaceC02280p interfaceC02280p) {
        if (interfaceC02280p != null) {
            interfaceC02280p.onDestroy();
        }
    }

    public final void A0P(AbstractC02290q abstractC02290q) {
        this.A06 = abstractC02290q;
    }

    public final void A0Q(C02601v c02601v) {
        A0S(c02601v.A03().optString(A07(210, 2, 39)));
    }

    public void A0R(String str) {
        A0A(str, null);
    }

    public final void A0S(String str) {
        this.A0B.A0E().A4q();
        if (!TextUtils.isEmpty(str)) {
            new JA(str, this.A08).A04(J9.A04, null);
        }
    }

    public final void A0T(String str) {
        A0R(str);
    }

    public final void A0U(String str, AdExperienceType adExperienceType) {
        A0A(str, adExperienceType);
    }

    public void A0V(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0E().A4y();
        A0N(this.A01);
        this.A0C = false;
    }

    public final boolean A0W() {
        C8S c8s = this.A04;
        return c8s == null || c8s.A0C();
    }

    @Override // com.meta.analytics.dsp.uinode.K3
    public final synchronized void ABR(C0670Jb c0670Jb) {
        A0F().post(new C1149an(this, c0670Jb));
    }

    @Override // com.meta.analytics.dsp.uinode.K3
    public final synchronized void ADG(C0966Up c0966Up) {
        try {
            A09(c0966Up);
        } catch (Exception e4) {
            this.A0B.A07().A9a(A07(195, 3, 93), C8A.A0T, new C8B(e4));
        }
    }
}
