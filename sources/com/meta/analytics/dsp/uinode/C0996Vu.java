package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0996Vu implements I1<String> {
    public static byte[] A00;
    public static String[] A01 = {FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "vlIuDSzGbyZPSOo9NvS3Fgy2A3aK70Ro", "3dVIdsQUspyQ", "UTSvinwo0cRMStWYFPA8OYJwOxvnVwXs", "RE5EMThjSVpoLeDJX1cgkycsZ0xzbqtm", "RpzVhDU", "goToTGvZMCWAKhVB", "BfTI1em2yqq329uW9D4CSUzGh8lnadBe"};

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        String[] strArr = A01;
        if (strArr[7].charAt(27) != strArr[3].charAt(27)) {
            throw new RuntimeException();
        }
        A01[6] = "DusCHERYjWvkKwCYEIDEH2";
        A00 = new byte[]{8, 20, 13, 12, 127, 110, 115, 127, 119, 102, 123, 119, 44, 117, 119, 119, 105, 124, 125};
    }

    static {
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.I1
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final boolean A5b(String str) {
        String strA0M = IF.A0M(str);
        return (TextUtils.isEmpty(strA0M) || (strA0M.contains(A00(4, 4, 69)) && !strA0M.contains(A00(8, 8, 77))) || strA0M.contains(A00(0, 4, 46)) || strA0M.contains(A00(16, 3, 95))) ? false : true;
    }
}
