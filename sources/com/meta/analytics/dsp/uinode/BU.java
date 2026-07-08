package com.meta.analytics.dsp.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BU extends O7 {
    public static byte[] A01;
    public static String[] A02 = {"AyjpfVMH4abbuU", "C4f54F5689i8nguXYuZVyawidNrV99tP", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "kvcj7JPhLleA0fC5", "qT9ER7mxQyIS", "DVCseFxiIzNfwa", "yADVvB6XdmuuqrvB", "b9AAn0hyeOBCYK5qzyR18"};
    public final /* synthetic */ UA A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[1].charAt(16) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "MNhPeHQbaIIJpJ20hNozP";
            strArr[2] = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 60);
            i10++;
        }
    }

    public static void A01() {
        A01 = new byte[]{35, 22, 17, 18, 28, -10, 27, 33, 18, 31, 32, 33, 22, 33, 14, 25, -14, 35, 18, 27, 33};
    }

    static {
        A01();
    }

    public BU(UA ua2) {
        this.A00 = ua2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(O8 o8) {
        this.A00.A06.A44(A00(0, 21, 113), o8);
    }
}
