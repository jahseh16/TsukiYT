package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1014Wp implements D6 {
    public static String[] A05 = {"ZoOhGYHP8SNfCMTpI8hB8esJvCxQNk4a", "iCY0vtQk2BMTn8YKksXnllwhxYcEMWPa", "FRJmrfeKqiG8dvU06WzW6", "wyGcQq4l", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "l2", "ODNaIWitniiqKmZchEPotBtPtmPon6SS", "r1S7VBlY5d2QYAsiLWImTDUS2fBhu4wR"};
    public final int A00;
    public final /* synthetic */ C1013Wo A04;
    public final C0644Hy A03 = new C0644Hy(new byte[5]);
    public final SparseArray<DD> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A4R(C0645Hz c0645Hz) {
        IB ib;
        DD ddA4j;
        if (c0645Hz.A0E() != 2) {
            return;
        }
        if (this.A04.A05 == 1 || this.A04.A05 == 2 || this.A04.A01 == 1) {
            ib = (IB) this.A04.A0B.get(0);
        } else {
            ib = new IB(((IB) this.A04.A0B.get(0)).A03());
            this.A04.A0B.add(ib);
        }
        c0645Hz.A0Z(2);
        int iA0I = c0645Hz.A0I();
        int i = 5;
        c0645Hz.A0Z(5);
        c0645Hz.A0a(this.A03, 2);
        int i5 = 4;
        this.A03.A08(4);
        int i8 = 12;
        c0645Hz.A0Z(this.A03.A04(12));
        int i10 = 21;
        if (this.A04.A05 == 2 && this.A04.A03 == null) {
            DA da = new DA(21, null, null, new byte[0]);
            C1013Wo c1013Wo = this.A04;
            c1013Wo.A03 = c1013Wo.A09.A4j(21, da);
            this.A04.A03.A8q(ib, this.A04.A02, new DC(iA0I, 21, 8192));
        }
        this.A01.clear();
        this.A02.clear();
        int iA04 = c0645Hz.A04();
        while (true) {
            if (iA04 <= 0) {
                int size = this.A02.size();
                for (int i11 = 0; i11 < size; i11++) {
                    int iKeyAt = this.A02.keyAt(i11);
                    this.A04.A07.put(iKeyAt, true);
                    DD ddValueAt = this.A01.valueAt(i11);
                    if (ddValueAt != null) {
                        C1013Wo c1013Wo2 = this.A04;
                        String[] strArr = A05;
                        if (strArr[5].length() != strArr[4].length()) {
                            A05[0] = "prZScD3eoAfWT6wNb9RUJeZXyBQ1ma5M";
                            if (ddValueAt != c1013Wo2.A03) {
                                ddValueAt.A8q(ib, this.A04.A02, new DC(iA0I, iKeyAt, 8192));
                            }
                            this.A04.A06.put(this.A02.valueAt(i11), ddValueAt);
                        }
                    }
                }
                if (this.A04.A05 == 2) {
                    if (this.A04.A04) {
                        return;
                    }
                    this.A04.A02.A5Y();
                    this.A04.A01 = 0;
                    this.A04.A04 = true;
                    return;
                }
                this.A04.A06.remove(this.A00);
                C1013Wo c1013Wo3 = this.A04;
                c1013Wo3.A01 = c1013Wo3.A05 != 1 ? this.A04.A01 - 1 : 0;
                if (this.A04.A01 == 0) {
                    this.A04.A02.A5Y();
                    this.A04.A04 = true;
                    return;
                }
                return;
            }
            c0645Hz.A0a(this.A03, i);
            int iA042 = this.A03.A04(8);
            this.A03.A08(3);
            int iA043 = this.A03.A04(13);
            this.A03.A08(i5);
            int iA044 = this.A03.A04(i8);
            DA daA00 = A00(c0645Hz, iA044);
            if (iA042 == 6) {
                iA042 = daA00.A00;
            }
            iA04 -= iA044 + 5;
            int i12 = this.A04.A05 == 2 ? iA042 : iA043;
            if (!this.A04.A07.get(i12)) {
                if (this.A04.A05 == 2 && iA042 == i10) {
                    C1013Wo c1013Wo4 = this.A04;
                    String[] strArr2 = A05;
                    if (strArr2[2].length() == strArr2[3].length()) {
                        break;
                    }
                    A05[0] = "McoDKrxcl9g055s4tJZatQwjzcY0TxoH";
                    ddA4j = c1013Wo4.A03;
                } else {
                    ddA4j = this.A04.A09.A4j(iA042, daA00);
                }
                if (this.A04.A05 != 2 || iA043 < this.A02.get(i12, 8192)) {
                    this.A02.put(i12, iA043);
                    this.A01.put(i12, ddA4j);
                }
            }
            i = 5;
            i5 = 4;
            i8 = 12;
            i10 = 21;
        }
        throw new RuntimeException();
    }

    public C1014Wp(C1013Wo c1013Wo, int i) {
        this.A04 = c1013Wo;
        this.A00 = i;
    }

    private DA A00(C0645Hz c0645Hz, int i) {
        int iA06 = c0645Hz.A06();
        int i5 = iA06 + i;
        int i8 = -1;
        String language = null;
        ArrayList arrayList = null;
        while (c0645Hz.A06() < i5) {
            int descriptorsStartPosition = c0645Hz.A0E();
            int positionOfNextDescriptor = c0645Hz.A06() + c0645Hz.A0E();
            if (descriptorsStartPosition == 5) {
                long jA0M = c0645Hz.A0M();
                if (jA0M != C1013Wo.A0F) {
                    long formatIdentifier = C1013Wo.A0G;
                    if (A05[0].charAt(13) == 108) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "OX";
                    strArr[4] = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
                    if (jA0M == formatIdentifier) {
                        i8 = 135;
                    } else if (jA0M == C1013Wo.A0H) {
                        i8 = 36;
                    }
                } else {
                    i8 = 129;
                }
            } else if (descriptorsStartPosition == 106) {
                i8 = 129;
            } else if (descriptorsStartPosition == 122) {
                i8 = 135;
            } else if (descriptorsStartPosition == 123) {
                i8 = 138;
            } else if (descriptorsStartPosition == 10) {
                language = c0645Hz.A0S(3).trim();
            } else if (descriptorsStartPosition == 89) {
                i8 = 89;
                arrayList = new ArrayList();
                while (c0645Hz.A06() < positionOfNextDescriptor) {
                    String strTrim = c0645Hz.A0S(3).trim();
                    int iA0E = c0645Hz.A0E();
                    byte[] bArr = new byte[4];
                    c0645Hz.A0c(bArr, 0, 4);
                    arrayList.add(new D9(strTrim, iA0E, bArr));
                }
            }
            c0645Hz.A0Z(positionOfNextDescriptor - c0645Hz.A06());
        }
        c0645Hz.A0Y(i5);
        return new DA(i8, language, arrayList, Arrays.copyOfRange(c0645Hz.A00, iA06, i5));
    }

    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A8q(IB ib, InterfaceC0504Bu interfaceC0504Bu, DC dc) {
    }
}
