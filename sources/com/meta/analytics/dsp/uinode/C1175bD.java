package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1175bD implements InterfaceC02240k {
    public static byte[] A08;
    public static String[] A09 = {"a8CS69kVNecuN9Nm4E1lChlBM", "ag8ss2YsLKCBvL1N8ZsAQ7i2G", "9IBuBVemd2S2dbE3BWmY83r4APvNrK7d", "ZoqrROBX", "uf7sNUy4ZjnbrmNcJuZuOOSXLwo6bRiZ", "LuNKGusWtlIWkNNSsxJCgMD8UDEcDleP", "s1ncMgVhGbgxvH35X0QQBiYqSsxlrK3j", "2ghFrXKxVbUZFk6auJt6qCgV8pKBUCZ9"};
    public final EnumC02230j A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Collection<String> A06;
    public final Map<String, String> A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1175bD A00(EQ eq, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(A01(33, 6, 95));
        String strOptString2 = jSONObject.optString(A01(0, 18, 13));
        String strOptString3 = jSONObject.optString(A01(47, 10, 34));
        String strA02 = LJ.A02(jSONObject, A01(18, 2, 2));
        EnumC02230j enumC02230jA00 = AbstractC02250l.A00(jSONObject);
        Collection<String> collectionA03 = AbstractC02250l.A03(eq, jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(39, 8, 57));
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (true) {
                boolean zHasNext = itKeys.hasNext();
                if (A09[7].charAt(3) == 'o') {
                    throw new RuntimeException();
                }
                String[] strArr = A09;
                strArr[3] = "3pk8Rtt7";
                strArr[1] = "M9VcdiL4tfZ71WotJMHbX4yrU";
                if (!zHasNext) {
                    break;
                }
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.optString(next));
            }
        }
        return new C1175bD(strOptString, strOptString2, enumC02230jA00, collectionA03, map, strOptString3, strA02, LJ.A02(jSONObject, A01(20, 13, 58)));
    }

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{9, 11, 28, 1, 30, 9, 28, 1, 7, 6, 55, 11, 7, 5, 5, 9, 6, 12, 4, 19, 58, 49, 60, 45, 38, 47, 43, 58, 59, 0, 60, 47, 50, 87, 91, 72, 81, 79, 74, 49, 57, 40, 61, 56, 61, 40, 61, 53, 34, 54, 50, 34, 52, 51, 24, 46, 35};
    }

    static {
        A02();
    }

    public C1175bD(String str, String str2, EnumC02230j enumC02230j, Collection<String> detectionStrings, Map<String, String> metadata, String str3, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = enumC02230j;
        this.A06 = detectionStrings;
        this.A07 = metadata;
        this.A05 = str3;
        this.A02 = str4;
        this.A03 = str5;
    }

    public final String A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A04;
    }

    public final String A05() {
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02240k
    public final String A6T() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02240k
    public final Collection<String> A6n() {
        return this.A06;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02240k
    public final EnumC02230j A7E() {
        return this.A00;
    }
}
