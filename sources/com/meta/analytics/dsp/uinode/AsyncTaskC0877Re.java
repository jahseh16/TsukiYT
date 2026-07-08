package com.meta.analytics.dsp.uinode;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AsyncTaskC0877Re extends AsyncTask<String, Void, C0878Rf> {
    public static byte[] A05;
    public static String[] A06 = {"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    public static final String A07;
    public static final Set<String> A08;
    public C03927f A00;
    public RJ A01;
    public InterfaceC0876Rd A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C0878Rf A00(String... strArr) throws Throwable {
        if (KL.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String strA02 = A02(str);
                Map<String, String> map = this.A03;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        strA02 = A03(strA02, entry.getKey(), entry.getValue());
                    }
                }
                int i = 1;
                while (true) {
                    int i5 = i + 1;
                    if (i > 2) {
                        return null;
                    }
                    if (A06(strA02)) {
                        return new C0878Rf(this.A01);
                    }
                    i = i5;
                }
            }
            return null;
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{48, 0, 3, 57, 33, 22, 22, 11, 22, 68, 11, 20, 1, 10, 13, 10, 3, 68, 17, 22, 8, 94, 68, 122, 117, 122, 119, 116, 124, 44, 55, 46, 46};
    }

    static {
        A04();
        A07 = AsyncTaskC0877Re.class.getSimpleName();
        HashSet hashSet = new HashSet();
        A08 = hashSet;
        hashSet.add(A01(0, 1, 73));
        hashSet.add(A01(29, 4, 24));
    }

    public AsyncTaskC0877Re(C03927f c03927f) {
        this(c03927f, null, null);
    }

    public AsyncTaskC0877Re(C03927f c03927f, Map<String, String> extraData) {
        this(c03927f, extraData, null);
    }

    public AsyncTaskC0877Re(C03927f c03927f, Map<String, String> extraData, Map<String, String> postData) {
        this.A00 = c03927f;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), LJ.A01(this.A00.A03().A61()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String strA01 = A01(3, 1, 92);
        if (str.contains(strA01)) {
            strA01 = A01(1, 1, 124);
        }
        StringBuilder sbAppend = new StringBuilder().append(str).append(strA01).append(str2);
        String prepend = A01(2, 1, 100);
        StringBuilder sbAppend2 = sbAppend.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return sbAppend2.append(prepend2).toString();
    }

    private final void A05(C0878Rf response) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            InterfaceC0876Rd interfaceC0876Rd = this.A02;
            if (interfaceC0876Rd != null) {
                interfaceC0876Rd.AEC(response);
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    private boolean A06(String str) {
        RJ rjADy;
        RK rkA00 = C0875Rc.A00(this.A00);
        try {
            Map<String, String> map = this.A04;
            if (map == null || map.size() == 0) {
                rjADy = rkA00.ADy(str, new RY());
            } else {
                RY params = new RY();
                params.A05(this.A04);
                rjADy = rkA00.ADz(str, params.A08());
            }
            this.A01 = rjADy;
        } catch (Exception e4) {
            Log.e(A07, A01(4, 19, 62) + str, e4);
        }
        RJ rj = this.A01;
        String[] strArr = A06;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A06[2] = "iiLT70HajwBiOF9fGWlLisdNhF1wiwwV";
        return rj != null && rj.A83() == 200;
    }

    public final void A07(InterfaceC0876Rd interfaceC0876Rd) {
        this.A02 = interfaceC0876Rd;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C0878Rf doInBackground(String[] strArr) throws Throwable {
        if (KL.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        InterfaceC0876Rd interfaceC0876Rd = this.A02;
        if (interfaceC0876Rd != null) {
            interfaceC0876Rd.AEA();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C0878Rf c0878Rf) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            A05(c0878Rf);
        } catch (Throwable th) {
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            KL.A00(th, this);
        }
    }
}
