package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.facebook.ads.RewardData;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HandlerC0667Ix extends Handler {
    public static byte[] A02;
    public static final String A03;
    public final Context A00;
    public final VW A01;

    public static String A03(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{101, 93, 96, 102, 93, 95, -105, -92, -92, -95, -76, -98, -88, -76, -101, -86, -93, -93, -102, -95, -76, -95, -92, -100, -100, -102, -103, -11, -10, -12, 1, -29, -26, 1, -21, -26, 1, -19, -25, -5, -118, -117, -119, -106, -118, 124, -119, -115, -128, 122, 124, -106, 124, -113, -117, -119, 120, -118, -59, -58, -60, -47, -59, -73, -60, -56, -69, -75, -73, -47, -59, -74, -67, -47, -56, -73, -60, -59, -69, -63, -64};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        PackageManager packageManager;
        if (KL.A02(this)) {
        }
        try {
            Messenger messenger = message.replyTo;
            if (message.what == 1) {
                if (messenger != null) {
                    VW.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            String string = message.getData().getString(A03(27, 13, 121));
            if (string == null) {
                return;
            }
            C1064Yn c1064YnA05 = C03435c.A05(this.A00, string);
            c1064YnA05.A0E().AG1(message.getData().getBoolean(A03(6, 21, 44), false));
            String nameForUid = null;
            if (Build.VERSION.SDK_INT >= 21 && (packageManager = this.A00.getPackageManager()) != null) {
                nameForUid = packageManager.getNameForUid(message.sendingUid);
            }
            if (nameForUid == null) {
                if (messenger != null) {
                    VW.A00().A07(20, string, null, messenger);
                }
                c1064YnA05.A0E().AEk();
                return;
            }
            switch (message.what) {
                case 1010:
                    if (messenger != null) {
                        C0664Iu c0664IuA04 = VW.A00().A04(string);
                        if (c0664IuA04 == null) {
                            c0664IuA04 = VW.A00().A05(string, messenger, nameForUid);
                        }
                        AnonymousClass26 anonymousClass26A04 = C2L.A04(c1064YnA05, message.getData(), nameForUid);
                        if (c0664IuA04.A00 == null) {
                            c0664IuA04.A00 = A01(anonymousClass26A04, string);
                        } else if (c0664IuA04.A00 instanceof C1129aT) {
                            ((C1129aT) c0664IuA04.A00).A0G(anonymousClass26A04.A0B(), anonymousClass26A04.A07());
                        }
                        VW.A00().A07(1011, string, A00(), messenger);
                        break;
                    }
                    break;
                case 1012:
                case 2002:
                    VW.A00().A08(string);
                    break;
                case 2000:
                    if (messenger != null) {
                        C0664Iu c0664IuA042 = VW.A00().A04(string);
                        if (c0664IuA042 == null) {
                            c0664IuA042 = VW.A00().A05(string, messenger, nameForUid);
                        }
                        C2F c2fA05 = C2L.A05(c1064YnA05, message.getData(), nameForUid);
                        if (c0664IuA042.A00 == null) {
                            c0664IuA042.A00 = A02(c2fA05, string);
                        } else if (c0664IuA042.A00 instanceof C1126aQ) {
                            ((C1126aQ) c0664IuA042.A00).A0J(c2fA05.A05, c2fA05.A02, c2fA05.A08);
                        }
                        VW.A00().A07(2001, string, A00(), messenger);
                        break;
                    }
                    break;
                case 2003:
                    AnonymousClass23 anonymousClass23A03 = VW.A00().A03(string);
                    if (anonymousClass23A03 instanceof C1126aQ) {
                        RewardData rewardDataA01 = C2M.A01(message.getData());
                        C1126aQ c1126aQ = (C1126aQ) anonymousClass23A03;
                        if (rewardDataA01 != null) {
                            c1126aQ.A0I(rewardDataA01);
                        }
                    }
                    break;
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    static {
        A04();
        A03 = HandlerC0667Ix.class.getSimpleName();
    }

    public HandlerC0667Ix(Context context) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A01 = VW.A00();
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(58, 23, 73), A03(0, 6, 6));
        bundle.putString(A03(40, 18, 14), new JSONObject().toString());
        return bundle;
    }

    private C1129aT A01(AnonymousClass26 anonymousClass26, String str) {
        C1129aT c1129aT = new C1129aT(anonymousClass26, this.A01, str);
        c1129aT.A0G(anonymousClass26.A0B(), anonymousClass26.A07());
        return c1129aT;
    }

    private C1126aQ A02(C2F c2f, String str) {
        C1126aQ c1126aQ = new C1126aQ(c2f, this.A01, str);
        c1126aQ.A0J(c2f.A05, c2f.A02, c2f.A08);
        return c1126aQ;
    }
}
