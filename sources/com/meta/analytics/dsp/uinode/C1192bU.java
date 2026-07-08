package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1192bU extends KT {
    public static byte[] A02;
    public static String[] A03 = {"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    public final /* synthetic */ C02350w A00;
    public final /* synthetic */ String A01;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            int i11 = (bArrCopyOfRange[i10] - i8) - 47;
            if (A03[6].charAt(27) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "CuQnTMvQt2iEBPylhK7T15";
            strArr[1] = "FSZFy24WJ9CShZHmahty6u";
            bArrCopyOfRange[i10] = (byte) i11;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        if (A03[6].charAt(27) != 'c') {
            throw new RuntimeException();
        }
        A03[3] = "LuOw";
        A02 = new byte[]{-99, -87, -100, -88, -84, -100, -91, -102, -80, -106, -102, -104, -89, -89, -96, -91, -98};
    }

    static {
        A02();
    }

    public C1192bU(C02350w c02350w, String str) {
        this.A00 = c02350w;
        this.A01 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        try {
            this.A00.A06.await();
            synchronized (this.A00.A02) {
                Iterator<String> itKeys = this.A00.A02.A05().keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (this.A00.A0J(this.A01)) {
                        C02350w c02350w = this.A00;
                        c02350w.A0E((C1T) c02350w.A02.A05().get(next), next, next.equals(this.A01));
                    }
                }
                this.A00.A02.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e4) {
            AnonymousClass89 anonymousClass89A07 = this.A00.A03.A07();
            String encryptedId = A00(0, 17, 8);
            anonymousClass89A07.A9a(encryptedId, C8A.A1B, new C8B(e4));
        } catch (JSONException e5) {
            this.A00.A0M();
            AnonymousClass89 anonymousClass89A072 = this.A00.A03.A07();
            String encryptedId2 = A00(0, 17, 8);
            anonymousClass89A072.A9a(encryptedId2, C8A.A1A, new C8B(e5));
        }
    }
}
