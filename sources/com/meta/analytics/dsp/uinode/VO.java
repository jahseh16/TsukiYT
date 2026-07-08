package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VO extends KT {
    public static byte[] A01;
    public final /* synthetic */ C03927f A00;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{111, 99, 97, 34, 106, 109, 111, 105, 110, 99, 99, 103, 34, 109, 104, 127, 34, 64, 67, 79, 77, 64, 83, 79, 67, 89, 66, 88, 73, 94, 95, 88, 91, 87, 85, 88, 107, 87, 91, 65, 90, 64, 81, 70, 71, 84, 92, 88, 74, 76, 75, 92, 93, 102, 74, 92, 74, 74, 80, 86, 87, 102, 80, 93, 108, 100, 96, 114, 116, 115, 100, 101, 94, 114, 100, 114, 114, 104, 110, 111, 94, 117, 104, 108, 100};
    }

    public VO(C03927f c03927f) {
        this.A00 = c03927f;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        SharedPreferences sharedPreferences = null;
        try {
            sharedPreferences = this.A00.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(0, 31, 63), this.A00), 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all.size() > 1) {
                C03927f c03927f = this.A00;
                JD.A06(c03927f, C0875Rc.A00(c03927f), all);
            }
            sharedPreferences.edit().clear().apply();
            sharedPreferences.edit().putString(A00(45, 19, 10), this.A00.A08().A02()).putString(A00(64, 21, 50), C0722Lf.A02(this.A00.A08().A01())).apply();
        } catch (JSONException e4) {
            this.A00.A07().A9a(A00(31, 14, 7), 3502, new C8B(e4));
            sharedPreferences.edit().clear().apply();
        }
        synchronized (JD.class) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (Map.Entry entry : JD.A02().entrySet()) {
                editorEdit.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            editorEdit.apply();
            JD.A04.set(2);
        }
    }
}
