package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.google.firebase.remoteconfig.internal.Code;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EI implements Handler.Callback, WQ, InterfaceC0603Gi, InterfaceC0561Ep, C9Z, A6 {
    public static byte[] A0V;
    public static String[] A0W = {"TSIQGmaqgvrUxo0yYDewkVNDuuioOpPV", "LhstooR1wZsH8RVMZSyyF7FJZ5wrHutR", "WZmkRBn8iXpnqDBIN644YOqcruHieEQJ", "OBm1ApV8rqkCiyt7FxArHXpNA0", "RSLtmQKc5IgtmDXEpea3qKBmF", "cT5hSyxhu4oYAFMn61C1ja3cHbuAf9wl", "QQz6Qig88n9IGtqyO", "pBG4ezF2k8D44jdvacVEPM0q7VNUtk0G"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C04449l A04;
    public C04549w A05;
    public InterfaceC0562Eq A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public Y5[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final Y8 A0G;
    public final Y6 A0H;
    public final InterfaceC04499r A0J;
    public final AF A0L;
    public final AG A0M;
    public final AbstractC0604Gj A0N;
    public final C0605Gk A0O;
    public final InterfaceC0623Hd A0P;
    public final InterfaceC0633Hn A0Q;
    public final ArrayList<C04429j> A0R;
    public final boolean A0S;
    public final Y5[] A0T;
    public final AA[] A0U;
    public final C04529u A0K = new C04529u();
    public AD A06 = AD.A03;
    public final C04439k A0I = new C04439k();

    public static String A06(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0V, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A07() throws IOException, C04359c {
        long jAGs = this.A0P.AGs();
        A0I();
        if (!this.A0K.A0P()) {
            A0B();
            A0R(jAGs, 10L);
            return;
        }
        C04509s c04509sA0G = this.A0K.A0G();
        IC.A02(A06(150, 10, 20));
        A0J();
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        c04509sA0G.A08.A5A(this.A05.A0A - this.A0D, this.A0S);
        boolean z = true;
        boolean z5 = true;
        for (Y5 y5 : this.A0C) {
            y5.AFB(this.A03, jElapsedRealtime);
            boolean z7 = true;
            z = z && y5.A91();
            boolean z8 = y5.A9C() || y5.A91() || A0s(y5);
            if (!z8) {
                y5.AAP();
            }
            if (!z5 || !z8) {
                z7 = false;
            }
            z5 = z7;
        }
        if (!z5) {
            A0B();
        }
        long j = c04509sA0G.A02.A01;
        if (z && ((j == -9223372036854775807L || j <= this.A05.A0A) && c04509sA0G.A02.A05)) {
            A0N(4);
            A0H();
        } else if (this.A05.A00 == 2 && A0u(z5)) {
            A0N(3);
            if (this.A08) {
                A0G();
            }
        } else if (this.A05.A00 == 3) {
            int length = this.A0C.length;
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "Eggx5Ft4Lgnx6HVrotcHBkscR";
            strArr2[3] = "Urp4oA4mdP1paz0o5Y10JqXrCe";
            if (length != 0 ? !z5 : !A0q()) {
                this.A09 = this.A08;
                A0N(2);
                A0H();
            }
        }
        if (this.A05.A00 == 2) {
            for (Y5 y52 : this.A0C) {
                y52.AAP();
            }
        }
        boolean z9 = this.A08;
        if (A0W[7].charAt(9) != '8') {
            throw new RuntimeException();
        }
        A0W[5] = "rTELFOhgZqImPwKgVJI0nXuoysvpkaxO";
        if ((z9 && this.A05.A00 == 3) || this.A05.A00 == 2) {
            A0R(jAGs, 10L);
        } else if (this.A0C.length == 0 || this.A05.A00 == 4) {
            this.A0Q.AF8(2);
        } else {
            A0R(jAGs, 1000L);
        }
        IC.A00();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0E() throws com.meta.analytics.dsp.uinode.C04359c {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.EI.A0E():void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0I() throws java.io.IOException, com.meta.analytics.dsp.uinode.C04359c {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.EI.A0I():void");
    }

    public static void A0K() {
        byte[] bArr = {68, 121, 110, 81, 109, 96, 120, 100, 115, 72, 108, 113, 109, 72, 111, 117, 100, 115, 111, 96, 109, 111, 82, 69, 122, 70, 75, 83, 79, 88, 99, 71, 90, 70, 99, 68, 94, 79, 88, 68, 75, 70, 16, 98, 75, 68, 78, 70, 79, 88, 66, 108, 101, 100, 121, 98, 101, 108, 43, 102, 110, 120, 120, 106, 108, 110, 120, 43, 120, 110, 101, 127, 43, 106, 109, 127, 110, 121, 43, 121, 110, 103, 110, 106, 120, 110, 37, 69, 98, 120, 105, 126, 98, 109, 96, 44, 126, 121, 98, 120, 101, 97, 105, 44, 105, 126, 126, 99, 126, 34, 24, 36, 41, 49, 42, 41, 43, 35, 104, 45, 58, 58, 39, 58, 102, 74, 118, 108, 107, 122, 124, 57, 124, 107, 107, 118, 107, 55, 72, 111, 116, 107, 59, 125, 122, 114, 119, 126, 127, 53, 90, 81, 109, 81, 83, 91, 105, 81, 76, 85};
        String[] strArr = A0W;
        if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
            throw new RuntimeException();
        }
        A0W[7] = "OuUcfGxYs8HKuxzYIQS3N8YCcqwYwO9D";
        A0V = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0S(C04419i c04419i) throws C04359c {
        if (c04419i.A01 != this.A07) {
            return;
        }
        AH ah = this.A05.A03;
        AH ah2 = c04419i.A00;
        Object obj = c04419i.A02;
        this.A0K.A0N(ah2);
        this.A05 = this.A05.A03(ah2, obj);
        A0F();
        int i = this.A01;
        if (i > 0) {
            this.A0I.A03(i);
            this.A01 = 0;
            C04449l c04449l = this.A04;
            if (c04449l != null) {
                Pair<Integer, Long> pairA04 = A04(c04449l, true);
                this.A04 = null;
                if (pairA04 == null) {
                    A08();
                    return;
                }
                int iIntValue = ((Integer) pairA04.first).intValue();
                long jLongValue = ((Long) pairA04.second).longValue();
                C0560Eo c0560EoA0L = this.A0K.A0L(iIntValue, jLongValue);
                this.A05 = this.A05.A04(c0560EoA0L, c0560EoA0L.A01() ? 0L : jLongValue, jLongValue);
                return;
            }
            if (this.A05.A02 == -9223372036854775807L) {
                if (ah2.A0E()) {
                    A08();
                    return;
                }
                Pair<Integer, Long> pairA05 = A05(ah2, ah2.A05(this.A0B), -9223372036854775807L);
                int iIntValue2 = ((Integer) pairA05.first).intValue();
                long jLongValue2 = ((Long) pairA05.second).longValue();
                C0560Eo c0560EoA0L2 = this.A0K.A0L(iIntValue2, jLongValue2);
                this.A05 = this.A05.A04(c0560EoA0L2, c0560EoA0L2.A01() ? 0L : jLongValue2, jLongValue2);
                return;
            }
            return;
        }
        int i5 = this.A05.A04.A02;
        long j = this.A05.A01;
        if (ah.A0E()) {
            if (ah2.A0E()) {
                return;
            }
            C0560Eo c0560EoA0L3 = this.A0K.A0L(i5, j);
            this.A05 = this.A05.A04(c0560EoA0L3, c0560EoA0L3.A01() ? 0L : j, j);
            return;
        }
        C04509s c04509sA0E = this.A0K.A0E();
        int iA04 = ah2.A04(c04509sA0E == null ? ah.A0A(i5, this.A0L, true).A03 : c04509sA0E.A09);
        if (iA04 != -1) {
            if (iA04 != i5) {
                this.A05 = this.A05.A01(iA04);
            }
            C0560Eo c0560Eo = this.A05.A04;
            if (c0560Eo.A01()) {
                C0560Eo c0560EoA0L4 = this.A0K.A0L(iA04, j);
                if (!c0560EoA0L4.equals(c0560Eo)) {
                    this.A05 = this.A05.A04(c0560EoA0L4, A02(c0560EoA0L4, c0560EoA0L4.A01() ? 0L : j), j);
                    return;
                }
            }
            if (this.A0K.A0U(c0560Eo, this.A03)) {
                return;
            }
            A0j(false);
            return;
        }
        int iA01 = A01(i5, ah, ah2);
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[4] = "W6zkXP9eIZkyJx4uPbHf9NTX6";
        strArr[3] = "m3yrwIeXeqUIkhQgLJp1WNCsrl";
        if (iA01 == -1) {
            A08();
            return;
        }
        Pair<Integer, Long> pairA052 = A05(ah2, ah2.A09(iA01, this.A0L).A00, -9223372036854775807L);
        int iIntValue3 = ((Integer) pairA052.first).intValue();
        long jLongValue3 = ((Long) pairA052.second).longValue();
        C0560Eo c0560EoA0L5 = this.A0K.A0L(iIntValue3, jLongValue3);
        ah2.A0A(iIntValue3, this.A0L, true);
        if (c04509sA0E != null) {
            Object obj2 = this.A0L.A03;
            c04509sA0E.A02 = c04509sA0E.A02.A00(-1);
            while (c04509sA0E.A01 != null) {
                c04509sA0E = c04509sA0E.A01;
                if (c04509sA0E.A09.equals(obj2)) {
                    C04529u c04529u = this.A0K;
                    C04519t c04519t = c04509sA0E.A02;
                    if (A0W[2].charAt(12) == 'N') {
                        throw new RuntimeException();
                    }
                    A0W[5] = "ODoCru5Men7rnsumvsVlRJsOWyiHNrdt";
                    c04509sA0E.A02 = c04529u.A0J(c04519t, iIntValue3);
                } else {
                    c04509sA0E.A02 = c04509sA0E.A02.A00(-1);
                }
            }
        }
        boolean zA01 = c0560EoA0L5.A01();
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "hRbRvIJE18IQkSZp4h0fxN12mLMfZDhd";
        this.A05 = this.A05.A04(c0560EoA0L5, A02(c0560EoA0L5, zA01 ? 0L : jLongValue3), jLongValue3);
    }

    static {
        A0K();
    }

    public EI(Y5[] y5Arr, AbstractC0604Gj abstractC0604Gj, C0605Gk c0605Gk, InterfaceC04499r interfaceC04499r, boolean z, int i, boolean z5, Handler handler, Y6 y62, InterfaceC0623Hd interfaceC0623Hd) {
        this.A0T = y5Arr;
        this.A0N = abstractC0604Gj;
        this.A0O = c0605Gk;
        this.A0J = interfaceC04499r;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z5;
        this.A0E = handler;
        this.A0H = y62;
        this.A0P = interfaceC0623Hd;
        this.A0D = interfaceC04499r.A65();
        this.A0S = interfaceC04499r.AFO();
        this.A05 = new C04549w(AH.A01, -9223372036854775807L, TrackGroupArray.A04, c0605Gk);
        this.A0U = new AA[y5Arr.length];
        for (int i5 = 0; i5 < y5Arr.length; i5++) {
            y5Arr[i5].AG2(i5);
            this.A0U[i5] = y5Arr[i5].A6I();
        }
        this.A0G = new Y8(this, interfaceC0623Hd);
        this.A0R = new ArrayList<>();
        this.A0C = new Y5[0];
        this.A0M = new AG();
        this.A0L = new AF();
        abstractC0604Gj.A00(this);
        HandlerThread handlerThread = new HandlerThread(A06(21, 29, 0), -16);
        this.A0F = handlerThread;
        handlerThread.start();
        this.A0Q = interfaceC0623Hd.A4c(handlerThread.getLooper(), this);
    }

    private int A00() {
        AH ah = this.A05.A03;
        if (ah.A0E()) {
            return 0;
        }
        return ah.A0B(ah.A05(this.A0B), this.A0M).A00;
    }

    private int A01(int i, AH ah, AH ah2) {
        int iA03 = i;
        int maxIterations = -1;
        int iA00 = ah.A00();
        for (int i5 = 0; i5 < iA00 && maxIterations == -1; i5++) {
            iA03 = ah.A03(iA03, this.A0L, this.A0M, this.A02, this.A0B);
            if (iA03 == -1) {
                break;
            }
            maxIterations = ah2.A04(ah.A0A(iA03, this.A0L, true).A03);
        }
        return maxIterations;
    }

    private long A02(C0560Eo c0560Eo, long j) throws C04359c {
        return A03(c0560Eo, j, this.A0K.A0G() != this.A0K.A0H());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A03(com.meta.analytics.dsp.uinode.C0560Eo r9, long r10, boolean r12) throws com.meta.analytics.dsp.uinode.C04359c {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.EI.A03(com.facebook.ads.redexgen.X.Eo, long, boolean):long");
    }

    private Pair<Integer, Long> A04(C04449l c04449l, boolean z) {
        int iA01;
        AH ah = this.A05.A03;
        AH ah2 = c04449l.A02;
        if (ah.A0E()) {
            return null;
        }
        if (ah2.A0E()) {
            ah2 = ah;
        }
        try {
            Pair<Integer, Long> pairA07 = ah2.A07(this.A0M, this.A0L, c04449l.A00, c04449l.A01);
            if (ah == ah2) {
                return pairA07;
            }
            int iA04 = ah.A04(ah2.A0A(((Integer) pairA07.first).intValue(), this.A0L, true).A03);
            if (iA04 != -1) {
                return Pair.create(Integer.valueOf(iA04), (Long) pairA07.second);
            }
            if (!z || (iA01 = A01(((Integer) pairA07.first).intValue(), ah2, ah)) == -1) {
                return null;
            }
            Pair<Integer, Long> pairA05 = A05(ah, ah.A09(iA01, this.A0L).A00, -9223372036854775807L);
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[1] = "LZRu6qU1d7MAJxELkyp6D6bqJ9pCtQWv";
            strArr2[0] = "5OOlDtGsHYXmvjCA2lYHypc4I8JTMes9";
            return pairA05;
        } catch (IndexOutOfBoundsException unused) {
            throw new C04489q(ah, c04449l.A00, c04449l.A01);
        }
    }

    private Pair<Integer, Long> A05(AH ah, int i, long j) {
        return ah.A07(this.A0M, this.A0L, i, j);
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C04509s c04509sA0F = this.A0K.A0F();
        long nextLoadPositionUs = c04509sA0F.A06();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        boolean zAGI = this.A0J.AGI(nextLoadPositionUs - c04509sA0F.A08(this.A03), this.A0G.A7h().A01);
        A0k(zAGI);
        if (zAGI) {
            c04509sA0F.A0F(this.A03);
        }
    }

    private void A0A() {
        int i;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            int i5 = this.A0I.A01;
            if (this.A0I.A03) {
                i = this.A0I.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i5, i, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C04509s c04509sA0F = this.A0K.A0F();
        C04509s readingPeriodHolder = this.A0K.A0H();
        if (c04509sA0F != null && !c04509sA0F.A06) {
            if (readingPeriodHolder != null) {
                C04509s loadingPeriodHolder = readingPeriodHolder.A01;
                if (loadingPeriodHolder != c04509sA0F) {
                    return;
                }
            }
            Y5[] y5Arr = this.A0C;
            if (A0W[2].charAt(12) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[4] = "M2PhxJTgTMxoek0nGdRGZ8ED7";
            strArr[3] = "JhH24KrsERDOvzAX41swXn1Uhz";
            for (Y5 y5 : y5Arr) {
                if (!y5.A8a()) {
                    return;
                }
            }
            c04509sA0F.A08.AAN();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C04519t c04519tA0I = this.A0K.A0I(this.A03, this.A05);
            if (c04519tA0I == null) {
                this.A07.AAO();
                return;
            }
            WP mediaPeriod = this.A0K.A0K(this.A0U, this.A0N, this.A0J.A60(), this.A07, this.A05.A03.A0A(c04519tA0I.A04.A02, this.A0L, true).A03, c04519tA0I);
            mediaPeriod.AE4(this, c04519tA0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.ACr();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws C04359c {
        this.A09 = false;
        this.A0G.A05();
        for (Y5 y5 : this.A0C) {
            y5.start();
        }
    }

    private void A0H() throws C04359c {
        this.A0G.A06();
        for (Y5 y5 : this.A0C) {
            A0c(y5);
        }
    }

    private void A0J() throws C04359c {
        long jA0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C04509s c04509sA0G = this.A0K.A0G();
        WP wp = c04509sA0G.A08;
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "e9etinPRA8BQH2CZknXr4yAbSJ3blA39";
        long jAEL = wp.AEL();
        if (jAEL != -9223372036854775807L) {
            A0P(jAEL);
            if (jAEL != this.A05.A0A) {
                C04549w c04549w = this.A05;
                C0560Eo c0560Eo = c04549w.A04;
                long periodPositionUs = this.A05.A01;
                this.A05 = c04549w.A04(c0560Eo, jAEL, periodPositionUs);
                this.A0I.A04(4);
            }
        } else {
            long jA04 = this.A0G.A04();
            this.A03 = jA04;
            long jA08 = c04509sA0G.A08(jA04);
            A0Q(this.A05.A0A, jA08);
            this.A05.A0A = jA08;
        }
        C04549w c04549w2 = this.A05;
        if (this.A0C.length == 0) {
            jA0C = c04509sA0G.A02.A01;
        } else {
            jA0C = c04509sA0G.A0C(true);
        }
        c04549w2.A09 = jA0C;
    }

    private void A0L(float f3) {
        for (C04509s c04509sA0E = this.A0K.A0E(); c04509sA0E != null; c04509sA0E = c04509sA0E.A01) {
            C0605Gk c0605Gk = c04509sA0E.A04;
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[5] = "TmHCYSIZuHNmxK6kBnR58JopztOBcNrn";
            if (c0605Gk != null) {
                for (InterfaceC0601Gg interfaceC0601Gg : c04509sA0E.A04.A01.A01()) {
                    if (interfaceC0601Gg != null) {
                        interfaceC0601Gg.ACc(f3);
                    }
                }
            }
        }
    }

    private void A0M(int i) throws C04359c {
        this.A02 = i;
        if (!this.A0K.A0R(i)) {
            A0j(true);
        }
    }

    private void A0N(int i) {
        if (this.A05.A00 != i) {
            C04549w c04549wA02 = this.A05.A02(i);
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[2] = "kM2qExU4ybhQ7HWfawBquzR2zjX0F4jA";
            this.A05 = c04549wA02;
        }
    }

    private void A0O(int i, boolean playing, int i5) throws C04359c {
        C04509s playingPeriodHolder = this.A0K.A0G();
        Y5 y5 = this.A0T[i];
        this.A0C[i5] = y5;
        if (y5.A81() == 0) {
            AB ab = playingPeriodHolder.A04.A03[i];
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0W[2] = "NYdCxyfB4qBB5fQElsuicf6C6huVudSr";
            Format[] formatArrA0v = A0v(playingPeriodHolder.A04.A01.A00(i));
            boolean z = this.A08 && this.A05.A00 == 3;
            y5.A5V(ab, formatArrA0v, playingPeriodHolder.A0A[i], this.A03, !playing && z, playingPeriodHolder.A07());
            this.A0G.A09(y5);
            if (z) {
                y5.start();
            }
        }
    }

    private void A0P(long j) throws C04359c {
        if (this.A0K.A0P()) {
            j = this.A0K.A0G().A09(j);
        }
        this.A03 = j;
        this.A0G.A07(j);
        for (Y5 y5 : this.A0C) {
            y5.AFN(this.A03);
        }
    }

    private void A0Q(long j, long j4) throws C04359c {
        C04429j c04429j;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j) {
            j--;
        }
        C04549w c04549w = this.A05;
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        A0W[2] = "iI9novLuZIFAEfCO4qiE3Y1J9OFTcxg5";
        int i = c04549w.A04.A02;
        int currentPeriodIndex = this.A00;
        C04429j c04429j2 = currentPeriodIndex > 0 ? this.A0R.get(currentPeriodIndex - 1) : null;
        while (c04429j2 != null) {
            if (c04429j2.A00 <= i) {
                int i5 = c04429j2.A00;
                if (A0W[7].charAt(9) == '8') {
                    A0W[2] = "hDlIvL5rLgyE5VG4VUIth4YrdDyvlxxs";
                    if (i5 != i || c04429j2.A01 <= j) {
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            int currentPeriodIndex2 = this.A00 - 1;
            this.A00 = currentPeriodIndex2;
            c04429j2 = currentPeriodIndex2 > 0 ? this.A0R.get(currentPeriodIndex2 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            c04429j = this.A0R.get(this.A00);
        } else {
            c04429j = null;
        }
        while (c04429j != null && c04429j.A02 != null && (c04429j.A00 < i || (c04429j.A00 == i && c04429j.A01 <= j))) {
            int i8 = this.A00 + 1;
            this.A00 = i8;
            if (i8 < this.A0R.size()) {
                c04429j = this.A0R.get(this.A00);
            } else {
                c04429j = null;
            }
        }
        while (c04429j != null && c04429j.A02 != null && c04429j.A00 == i && c04429j.A01 > j && c04429j.A01 <= j4) {
            A0Z(c04429j.A03);
            if (c04429j.A03.A0B() || c04429j.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            if (this.A00 < this.A0R.size()) {
                ArrayList<C04429j> arrayList = this.A0R;
                int i10 = this.A00;
                if (A0W[5].charAt(1) == 'w') {
                    throw new RuntimeException();
                }
                A0W[6] = "2inRqgHKNmW90mXz8";
                c04429j = arrayList.get(i10);
            } else {
                c04429j = null;
            }
        }
    }

    private void A0R(long j, long j4) {
        this.A0Q.AF8(2);
        this.A0Q.AFo(2, j + j4);
    }

    private void A0T(C04449l c04449l) throws Throwable {
        long jLongValue;
        C0560Eo c0560EoA0L;
        long jLongValue2;
        boolean seekPositionAdjusted;
        this.A0I.A03(1);
        Pair<Integer, Long> resolvedSeekPosition = A04(c04449l, true);
        if (resolvedSeekPosition == null) {
            c0560EoA0L = new C0560Eo(A00());
            jLongValue2 = -9223372036854775807L;
            jLongValue = -9223372036854775807L;
            seekPositionAdjusted = true;
        } else {
            int iIntValue = ((Integer) resolvedSeekPosition.first).intValue();
            jLongValue = ((Long) resolvedSeekPosition.second).longValue();
            c0560EoA0L = this.A0K.A0L(iIntValue, jLongValue);
            if (c0560EoA0L.A01()) {
                jLongValue2 = 0;
                seekPositionAdjusted = true;
            } else {
                jLongValue2 = ((Long) resolvedSeekPosition.second).longValue();
                seekPositionAdjusted = c04449l.A01 == -9223372036854775807L;
            }
        }
        try {
            try {
                if (this.A07 != null && this.A01 <= 0) {
                    if (A0W[5].charAt(1) != 'w') {
                        A0W[5] = "YfoxJXVxtggAgJ3C0qUN5WGXkfVCteCk";
                        try {
                            if (jLongValue2 == -9223372036854775807L) {
                                A0N(4);
                                A0o(false, true, false);
                            } else {
                                long jA5x = jLongValue2;
                                if (c0560EoA0L.equals(this.A05.A04)) {
                                    C04509s c04509sA0G = this.A0K.A0G();
                                    if (c04509sA0G != null && jA5x != 0) {
                                        jA5x = c04509sA0G.A08.A5x(jA5x, this.A06);
                                    }
                                    long contentPositionUs = C9W.A01(jA5x);
                                    long newPeriodPositionUs = this.A05.A0A;
                                    if (contentPositionUs == C9W.A01(newPeriodPositionUs)) {
                                        this.A05 = this.A05.A04(c0560EoA0L, this.A05.A0A, jLongValue);
                                        if (seekPositionAdjusted) {
                                            this.A0I.A04(2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                long jA02 = A02(c0560EoA0L, jA5x);
                                seekPositionAdjusted |= jLongValue2 != jA02;
                                if (A0W[6].length() == 17) {
                                    A0W[7] = "LtwUHLpv08wEzos7LWvR75PA6MqqEvuh";
                                    jLongValue2 = jA02;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            this.A05 = this.A05.A04(c0560EoA0L, jLongValue2, jLongValue);
                            if (seekPositionAdjusted) {
                                this.A0I.A04(2);
                            }
                            throw th;
                        }
                    }
                    throw new RuntimeException();
                }
                this.A04 = c04449l;
                this.A05 = this.A05.A04(c0560EoA0L, jLongValue2, jLongValue);
                if (seekPositionAdjusted) {
                    C04439k c04439k = this.A0I;
                    String[] strArr = A0W;
                    if (strArr[4].length() != strArr[3].length()) {
                        A0W[6] = "NnvGpWmx2ly54VvtA";
                        c04439k.A04(2);
                    } else {
                        c04439k.A04(2);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void A0V(C04509s c04509s) throws C04359c {
        C04509s c04509sA0G = this.A0K.A0G();
        if (c04509sA0G == null || c04509s == c04509sA0G) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i5 = 0;
        while (true) {
            Y5[] y5Arr = this.A0T;
            if (i5 < y5Arr.length) {
                Y5 y5 = y5Arr[i5];
                zArr[i5] = y5.A81() != 0;
                if (c04509sA0G.A04.A00(i5)) {
                    i++;
                }
                if (zArr[i5] && (!c04509sA0G.A04.A00(i5) || (y5.A8y() && y5.A84() == c04509s.A0A[i5]))) {
                    A0b(y5);
                }
                i5++;
            } else {
                this.A05 = this.A05.A05(c04509sA0G.A03, c04509sA0G.A04);
                A0p(zArr, i);
                return;
            }
        }
    }

    private void A0W(C04559x c04559x) {
        this.A0G.AGA(c04559x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(A8 a82) throws C04359c {
        if (a82.A0D()) {
            return;
        }
        try {
            a82.A04().A8V(a82.A00(), a82.A09());
            a82.A0A(true);
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "j7cBoz179DrNpy3qD7RptXNd9";
            strArr2[3] = "0iwSWX3dM4PAnuiRq1LulMUFPW";
        } catch (Throwable th) {
            a82.A0A(true);
            throw th;
        }
    }

    private void A0Y(A8 a82) throws C04359c {
        if (a82.A02() == -9223372036854775807L) {
            A0Z(a82);
            return;
        }
        if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new C04429j(a82));
            return;
        }
        C04429j c04429j = new C04429j(a82);
        if (A0r(c04429j)) {
            this.A0R.add(c04429j);
            Collections.sort(this.A0R);
        } else {
            a82.A0A(false);
        }
    }

    private void A0Z(A8 a82) throws C04359c {
        if (a82.A03().getLooper() == this.A0Q.A7L()) {
            A0X(a82);
            C04549w c04549w = this.A05;
            if (A0W[6].length() != 17) {
                throw new RuntimeException();
            }
            A0W[5] = "cBEQE15IFXZqMCE104UHZMDgeC8qTiqN";
            if (c04549w.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AFn(2);
                return;
            }
            return;
        }
        this.A0Q.AAb(15, a82).sendToTarget();
    }

    private void A0a(final A8 a82) {
        a82.A03().post(new Runnable() { // from class: com.facebook.ads.redexgen.X.9h
            public static byte[] A02;

            static {
                A01();
            }

            public static String A00(int i, int i5, int i8) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
                for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
                    bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 14);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{-60, -9, -18, -49, -21, -32, -8, -28, -15, -56, -20, -17, -21, -56, -19, -13, -28, -15, -19, -32, -21, -52, -27, -36, -17, -25, -36, -38, -21, -36, -37, -105, -36, -23, -23, -26, -23, -105, -37, -36, -29, -32, -19, -36, -23, -32, -27, -34, -105, -28, -36, -22, -22, -40, -34, -36, -105, -26, -27, -105, -36, -17, -21, -36, -23, -27, -40, -29, -105, -21, -33, -23, -36, -40, -37, -91};
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (KL.A02(this)) {
                    return;
                }
                try {
                    try {
                        this.A00.A0X(a82);
                    } catch (C04359c e4) {
                        Log.e(A00(0, 21, 113), A00(21, 55, 105), e4);
                        throw new RuntimeException(e4);
                    }
                } catch (Throwable th) {
                    KL.A00(th, this);
                }
            }
        });
    }

    private void A0b(Y5 y5) throws C04359c {
        this.A0G.A08(y5);
        A0c(y5);
        y5.A58();
    }

    private void A0c(Y5 y5) throws C04359c {
        if (y5.A81() == 2) {
            y5.stop();
        }
    }

    private void A0d(AD ad2) {
        this.A06 = ad2;
    }

    private void A0e(WP wp) {
        if (!this.A0K.A0T(wp)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(WP wp) throws C04359c {
        if (!this.A0K.A0T(wp)) {
            return;
        }
        C04509s c04509sA0F = this.A0K.A0F();
        c04509sA0F.A0E(this.A0G.A7h().A01);
        A0i(c04509sA0F.A03, c04509sA0F.A04);
        if (!this.A0K.A0P()) {
            C04509s loadingPeriodHolder = this.A0K.A0C();
            A0P(loadingPeriodHolder.A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.FC
    /* JADX INFO: renamed from: A0g, reason: merged with bridge method [inline-methods] */
    public final void ABC(WP wp) {
        this.A0Q.AAb(10, wp).sendToTarget();
    }

    private void A0h(InterfaceC0562Eq interfaceC0562Eq, boolean z, boolean z5) {
        this.A01++;
        A0o(true, z, z5);
        this.A0J.onPrepared();
        this.A07 = interfaceC0562Eq;
        A0N(2);
        interfaceC0562Eq.AE7(this.A0H, true, this);
        this.A0Q.AFn(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, C0605Gk c0605Gk) {
        this.A0J.ADN(this.A0T, trackGroupArray, c0605Gk.A01);
    }

    private void A0j(boolean z) throws C04359c {
        C0560Eo c0560Eo = this.A0K.A0G().A02.A04;
        long jA03 = A03(c0560Eo, this.A05.A0A, true);
        if (jA03 != this.A05.A0A) {
            C04549w c04549w = this.A05;
            this.A05 = c04549w.A04(c0560Eo, jA03, c04549w.A01);
            if (z) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0k(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0l(boolean z) throws C04359c {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            this.A0Q.AFn(2);
        } else {
            if (this.A05.A00 != 2) {
                return;
            }
            this.A0Q.AFn(2);
        }
    }

    private void A0m(boolean z) throws C04359c {
        this.A0B = z;
        if (!this.A0K.A0V(z)) {
            A0j(true);
        }
    }

    private void A0n(boolean z, boolean z5) {
        A0o(true, z, z);
        this.A0I.A03(this.A01 + (z5 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ADF();
        A0N(1);
    }

    private void A0o(boolean z, boolean z5, boolean z7) {
        Object obj;
        long j;
        C0605Gk c0605Gk;
        InterfaceC0562Eq interfaceC0562Eq;
        this.A0Q.AF8(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (Y5 y5 : this.A0C) {
            try {
                A0b(y5);
            } catch (C04359c | RuntimeException e4) {
                Log.e(A06(0, 21, 43), A06(138, 12, 49), e4);
            }
        }
        this.A0C = new Y5[0];
        this.A0K.A0O(!z5);
        A0k(false);
        if (z5) {
            this.A04 = null;
        }
        if (z7) {
            this.A0K.A0N(AH.A01);
            Iterator<C04429j> it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AH ah = z7 ? AH.A01 : this.A05.A03;
        if (z7) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        C0560Eo c0560Eo = z5 ? new C0560Eo(A00()) : this.A05.A04;
        long j4 = -9223372036854775807L;
        if (z5) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0A;
        }
        if (!z5) {
            j4 = this.A05.A01;
        }
        int i = this.A05.A00;
        TrackGroupArray trackGroupArray = z7 ? TrackGroupArray.A04 : this.A05.A05;
        if (z7) {
            c0605Gk = this.A0O;
        } else {
            c0605Gk = this.A05.A06;
        }
        this.A05 = new C04549w(ah, obj, c0560Eo, j, j4, i, false, trackGroupArray, c0605Gk);
        if (z && (interfaceC0562Eq = this.A07) != null) {
            interfaceC0562Eq.AEb(this);
            this.A07 = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0p(boolean[] r6, int r7) throws com.meta.analytics.dsp.uinode.C04359c {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Y5[] r0 = new com.meta.analytics.dsp.uinode.Y5[r7]
            r5.A0C = r0
            r4 = 0
            com.facebook.ads.redexgen.X.9u r0 = r5.A0K
            com.facebook.ads.redexgen.X.9s r3 = r0.A0G()
            r2 = 0
        Lc:
            com.facebook.ads.redexgen.X.Y5[] r0 = r5.A0T
            int r0 = r0.length
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.Gk r0 = r3.A04
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L21
            boolean r1 = r6[r2]
            int r0 = r4 + 1
            r5.A0O(r2, r1, r4)
            r4 = r0
        L21:
            int r2 = r2 + 1
            goto Lc
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.EI.A0p(boolean[], int):void");
    }

    private boolean A0q() {
        C04509s c04509sA0G = this.A0K.A0G();
        long j = c04509sA0G.A02.A01;
        if (j != -9223372036854775807L) {
            long playingPeriodDurationUs = this.A05.A0A;
            if (playingPeriodDurationUs >= j) {
                C04509s c04509s = c04509sA0G.A01;
                if (A0W[7].charAt(9) != '8') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[1] = "YaIhV2LltIG4HuclCS5WOO9hjwkCXeMt";
                strArr[0] = "X0pypN8zwLPsNLuJVHuHfetSc0yM8k9B";
                if (c04509s != null) {
                    C04509s playingPeriodHolder = c04509sA0G.A01;
                    if (!playingPeriodHolder.A06) {
                        C04509s playingPeriodHolder2 = c04509sA0G.A01;
                        if (playingPeriodHolder2.A02.A04.A01()) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A0r(C04429j c04429j) {
        if (c04429j.A02 == null) {
            Pair<Integer, Long> pairA04 = A04(new C04449l(c04429j.A03.A08(), c04429j.A03.A01(), C9W.A00(c04429j.A03.A02())), false);
            if (pairA04 == null) {
                return false;
            }
            int iIntValue = ((Integer) pairA04.first).intValue();
            long jLongValue = ((Long) pairA04.second).longValue();
            AH ah = this.A05.A03;
            Integer num = (Integer) pairA04.first;
            String[] strArr = A0W;
            if (strArr[1].charAt(10) != strArr[0].charAt(10)) {
                A0W[6] = "Qe4SjxIsSBa3x6HAW";
                c04429j.A01(iIntValue, jLongValue, ah.A0A(num.intValue(), this.A0L, true).A03);
            } else {
                throw new RuntimeException();
            }
        } else {
            int iA04 = this.A05.A03.A04(c04429j.A02);
            if (iA04 == -1) {
                return false;
            }
            c04429j.A00 = iA04;
        }
        return true;
    }

    private boolean A0s(Y5 y5) {
        C04509s c04509sA0H = this.A0K.A0H();
        C04509s readingPeriodHolder = c04509sA0H.A01;
        if (readingPeriodHolder != null) {
            C04509s readingPeriodHolder2 = c04509sA0H.A01;
            if (readingPeriodHolder2.A06 && y5.A8a()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0t(C0560Eo c0560Eo, long j, C04509s c04509s) {
        if (c0560Eo.equals(c04509s.A02.A04) && c04509s.A06) {
            this.A05.A03.A09(c04509s.A02.A04.A02, this.A0L);
            int iA04 = this.A0L.A04(j);
            if (iA04 == -1 || this.A0L.A09(iA04) == c04509s.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean A0u(boolean z) {
        if (this.A0C.length == 0) {
            return A0q();
        }
        if (!z) {
            return false;
        }
        if (!this.A05.A08) {
            return true;
        }
        C04509s c04509sA0F = this.A0K.A0F();
        long jA0C = c04509sA0F.A0C(!c04509sA0F.A02.A05);
        return jA0C == Long.MIN_VALUE || this.A0J.AGL(jA0C - c04509sA0F.A08(this.A03), this.A0G.A7h().A01, this.A09);
    }

    public static Format[] A0v(InterfaceC0601Gg interfaceC0601Gg) {
        int length = interfaceC0601Gg != null ? interfaceC0601Gg.length() : 0;
        Format[] formatArr = new Format[length];
        String[] strArr = A0W;
        String str = strArr[1];
        String str2 = strArr[0];
        int iCharAt = str.charAt(10);
        int length2 = str2.charAt(10);
        if (iCharAt == length2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[4] = "X04sVE4WijYjotgv6w3bASzS6";
        strArr2[3] = "U1jCIvxI6fY8JZE6Ili1DHAvIg";
        for (int length3 = 0; length3 < length; length3++) {
            formatArr[length3] = interfaceC0601Gg.A76(length3);
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0x() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.facebook.ads.redexgen.X.Hn r1 = r2.A0Q     // Catch: java.lang.Throwable -> L23
            r0 = 7
            r1.AFn(r0)     // Catch: java.lang.Throwable -> L23
            r1 = 0
        Le:
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L18
            r2.wait()     // Catch: java.lang.InterruptedException -> L16 java.lang.Throwable -> L23
            goto Le
        L16:
            r1 = 1
            goto Le
        L18:
            if (r1 == 0) goto L21
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L23
            r0.interrupt()     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r2)
            return
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.EI.A0x():void");
    }

    public final void A0y(AH ah, int i, long j) {
        this.A0Q.AAb(3, new C04449l(ah, i, j)).sendToTarget();
    }

    public final void A0z(InterfaceC0562Eq interfaceC0562Eq, boolean z, boolean z5) {
        this.A0Q.AAa(0, z ? 1 : 0, z5 ? 1 : 0, interfaceC0562Eq).sendToTarget();
    }

    public final void A10(boolean z) {
        this.A0Q.AAZ(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.AAZ(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.meta.analytics.dsp.uinode.C9Z
    public final void ACb(C04559x c04559x) {
        this.A0E.obtainMessage(1, c04559x).sendToTarget();
        A0L(c04559x.A01);
    }

    @Override // com.meta.analytics.dsp.uinode.WQ
    public final void ACj(WP wp) {
        this.A0Q.AAb(9, wp).sendToTarget();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0561Ep
    public final void ADA(InterfaceC0562Eq interfaceC0562Eq, AH ah, Object obj) {
        this.A0Q.AAb(8, new C04419i(interfaceC0562Eq, ah, obj)).sendToTarget();
    }

    @Override // com.meta.analytics.dsp.uinode.A6
    public final synchronized void AFp(A8 a82) {
        if (this.A0A) {
            Log.w(A06(0, 21, 43), A06(50, 37, 33));
            a82.A0A(false);
        } else {
            this.A0Q.AAb(14, a82).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String strA06 = A06(0, 21, 43);
        try {
            switch (message.what) {
                case 0:
                    A0h((InterfaceC0562Eq) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((C04449l) message.obj);
                    break;
                case 4:
                    A0W((C04559x) message.obj);
                    break;
                case 5:
                    A0d((AD) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((C04419i) message.obj);
                    break;
                case 9:
                    A0f((WP) message.obj);
                    break;
                case 10:
                    A0e((WP) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case Code.UNIMPLEMENTED /* 12 */:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((A8) message.obj);
                    break;
                case 15:
                    A0a((A8) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (C04359c e4) {
            Log.e(strA06, A06(110, 15, 98), e4);
            A0n(false, false);
            this.A0E.obtainMessage(2, e4).sendToTarget();
            A0A();
        } catch (IOException e5) {
            Log.e(strA06, A06(125, 13, 51), e5);
            A0n(false, false);
            this.A0E.obtainMessage(2, C04359c.A00(e5)).sendToTarget();
            A0A();
        } catch (RuntimeException e6) {
            Log.e(strA06, A06(87, 23, 38), e6);
            A0n(false, false);
            this.A0E.obtainMessage(2, C04359c.A02(e6)).sendToTarget();
            A0A();
        }
        return true;
    }
}
