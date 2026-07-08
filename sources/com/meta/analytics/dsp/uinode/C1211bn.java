package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1211bn implements AnonymousClass00 {
    public static byte[] A09;
    public static String[] A0A = {"2hmAfzTadn", "1uDqsMr9wv4o5ZghfCOZg4FuDp7sllqp", "nT1KYDstdBBAZ5nN", "UVqk4rMzzgqbiyaJgpoGMOUy0jQCoEBq", "ewXxsmpHr", "rT44HeCpkJQ", "C3kiv90mrVS0BL1BSM5Dfu9lHf0n3Csl", "grgxNBq6hb"};
    public static final String A0B;
    public final int A00;
    public final int A01;
    public final AnonymousClass08 A02;
    public final C0L A04;
    public final C03927f A05;
    public final boolean A08;
    public final Map<String, File> A06 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Semaphore> A07 = new HashMap();
    public final C0A A03 = new C0A();

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
    
        r8 = r6.A03();
        r6.A06();
        r6 = java.lang.System.currentTimeMillis() - r13;
        r21.A00().A4U(r3, r16.A04);
        r16.A06.put(r10, r3);
        r16.A04.AEP(r10, 2112, null, java.lang.Long.valueOf(r8), java.lang.Long.valueOf(r6), r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f9, code lost:
    
        return r3;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0106: INVOKE 
      (r9v1 ?? I:com.facebook.ads.redexgen.X.0L)
      (r10 I:java.lang.String)
      (r11 I:int)
      (r12 I:java.lang.String)
      (r13 I:java.lang.Long)
      (r14 I:java.lang.Long)
      (r15 I:com.facebook.ads.redexgen.X.06)
     INTERFACE call: com.facebook.ads.redexgen.X.0L.AEP(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void (m)], block:B:40:0x00fb */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0120: INVOKE 
      (r9v0 ?? I:com.facebook.ads.redexgen.X.0L)
      (r10 I:java.lang.String)
      (r11 I:int)
      (r12 I:java.lang.String)
      (r13 I:java.lang.Long)
      (r14 I:java.lang.Long)
      (r15 I:com.facebook.ads.redexgen.X.06)
     INTERFACE call: com.facebook.ads.redexgen.X.0L.AEP(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void (m)], block:B:46:0x0115 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0105: MOVE (r15 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:40:0x00fb */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x011f: MOVE (r15 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:46:0x0115 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.io.File A02(com.meta.analytics.dsp.uinode.AnonymousClass06 r17, java.lang.String r18, java.lang.String r19, int r20, com.meta.analytics.dsp.uinode.AnonymousClass09 r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1211bn.A02(com.facebook.ads.redexgen.X.06, java.lang.String, java.lang.String, int, com.facebook.ads.redexgen.X.09):java.io.File");
    }

    public static String A03(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            int i11 = bArrCopyOfRange[i10] - i8;
            String[] strArr = A0A;
            if (strArr[5].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "m9U6X0moZlc";
            strArr2[7] = "IfCNkNm6kG";
            bArrCopyOfRange[i10] = (byte) (i11 - 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-105, -33, -40, -22, -105, -39, -36, -36, -27, -105, -32, -27, -21, -36, -23, -23, -20, -25, -21, -36, -37, -91, -63, -75, -5, -2, 1, -6, -75, -8, 1, -6, -10, 3, -6, -7, -49, -75, -125, 117, -106, -55, -55, -70, -62, -59, -55, -113, 117, -7, 23, 25, 30, 31, 36, 29, -42, 28, 31, 34, 27, -42, 25, 37, 35, 38, 34, 27, 42, 27, -42, 4, 34, 36, 41, 42, 47, 40, -31, 39, 42, 45, 38, -31, 47, 48, 53, -31, 36, 48, 46, 49, 45, 38, 53, 38, -31, -91, -61, -59, -54, -53, -48, -55, -126, -47, -56, -126, -32, -2, 11, -60, 17, -67, 0, 9, 12, 16, 2, -67, 0, -2, 0, 5, 2, -67, 3, 6, 9, 2, -53, -80, -50, -37, -108, -31, -115, -33, -46, -50, -47, -115, -50, -32, -32, -46, -31, -32, -101, -69, -39, -26, -97, -20, -104, -22, -35, -39, -36, -104, -28, -35, -26, -33, -20, -32, -104, -25, -34, -104, -72, -39, -32, -39, -24, -35, -30, -37, -108, -41, -43, -41, -36, -39, -108, -38, -35, -32, -39, -108, -43, -38, -24, -39, -26, -108, -39, -20, -41, -39, -39, -40, -35, -30, -37, -108, -26, -39, -24, -26, -19, -108, -43, -24, -24, -39, -31, -28, -24, -25, -82, -108, -43, 2, 2, -1, 2, -80, -13, -15, -13, -8, -7, -2, -9, -80, 4, -8, -11, -80, -10, -7, -4, -11, -54, -9, -9, -12, -9, -91, -24, -15, -22, -26, -13, -18, -13, -20, -91, -21, -18, -15, -22, -72, -27, -27, -30, -27, -109, -42, -33, -30, -26, -36, -31, -38, -109, -26, -30, -24, -27, -42, -40, -72, -35, -46, -34, -36, -33, -37, -44, -29, -44, -113, -31, -44, -30, -33, -34, -35, -30, -44, -99, -65, -35, -28, -44, -39, -46, -117, -33, -38, -117, -35, -48, -52, -49, -117, -73, -70, -60, -51, -125, -68, -65, -62, -69, -125, -71, -73, -71, -66, -69, -18, 0, 0, -14, 1, -57, -68, -68, -68, 5, 8, 11, 4, -39, -50, -50, -50, 0, 13, 3, 17, 14, 8, 3, -2, 0, 18, 18, 4, 19, -50};
        String[] strArr = A0A;
        if (strArr[1].charAt(5) == strArr[3].charAt(5)) {
            throw new RuntimeException();
        }
        A0A[6] = "1YrvosXM8zHw8wsMUb3ulJ8Xgx5scBHO";
    }

    static {
        A04();
        A0B = C1211bn.class.getSimpleName();
    }

    public C1211bn(C03927f c03927f, AnonymousClass08 anonymousClass08, C0L c0l) {
        this.A05 = c03927f;
        this.A08 = anonymousClass08.A02();
        this.A00 = anonymousClass08.A00();
        this.A04 = c0l;
        this.A01 = anonymousClass08.A01();
        this.A02 = anonymousClass08;
    }

    public static C1209bl A00(Context context, String str) throws C0H {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
            while (true) {
                int i = inputStreamOpen.read(bArr, 0, bArr.length);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    return new C1209bl(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (IOException e4) {
            throw new C0H(A03(131, 18, 33), e4);
        }
    }

    public static File A01(Context context) {
        return new File(context.getCacheDir(), A03(318, 15, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c A[Catch: all -> 0x0124, 0H -> 0x016b, TRY_ENTER, TRY_LEAVE, TryCatch #14 {0H -> 0x016b, all -> 0x0124, blocks: (B:12:0x007c, B:38:0x0109, B:44:0x011c, B:36:0x0103, B:28:0x00bd, B:30:0x00c5), top: B:115:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ce A[Catch: all -> 0x020b, PHI: r21
      0x01ce: PHI (r21v2 int) = (r21v0 int), (r21v1 int) binds: [B:75:0x01a3, B:76:0x01a5] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x020b, blocks: (B:74:0x01a1, B:83:0x01ce), top: B:110:0x01a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(android.content.Context r24, com.meta.analytics.dsp.uinode.C1207bj r25, java.lang.String r26, int r27, int r28, long r29) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1211bn.A05(android.content.Context, com.facebook.ads.redexgen.X.bj, java.lang.String, int, int, long):void");
    }

    private void A06(C1207bj c1207bj) {
        try {
            File fileA04 = c1207bj.A04();
            if (fileA04.exists()) {
                c1207bj.A06();
                boolean zDelete = fileA04.delete();
                if (this.A08) {
                    Log.i(A0B, A03(170, 52, 40) + zDelete);
                }
            }
        } catch (Exception e4) {
            if (this.A08) {
                Log.e(A0B, A03(108, 23, 81), e4);
            }
        }
    }

    private boolean A07(C1207bj c1207bj) {
        try {
            c1207bj.A05();
            return true;
        } catch (C1205bh e4) {
            boolean z = this.A08;
            if (A0A[6].charAt(7) == 'U') {
                throw new RuntimeException();
            }
            A0A[6] = "AEs2mSbxTVyMZvMH4XlDgcN9VznTkYzp";
            if (z) {
                Log.e(A0B, A03(244, 19, 57), e4);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final <T> AnonymousClass02<T> A08(AnonymousClass06 anonymousClass06, AnonymousClass09<T> anonymousClass09) {
        Semaphore semaphore;
        if (anonymousClass09.A03()) {
            File file = this.A06.get(anonymousClass06.A09);
            if (file != null) {
                this.A04.AEQ(anonymousClass06.A09, true, anonymousClass06);
                return anonymousClass09.A00().A3M(file, this.A04);
            }
            this.A04.AEQ(anonymousClass06.A09, false, anonymousClass06);
            return new AnonymousClass02<>(false, null);
        }
        String str = anonymousClass06.A09;
        String str2 = anonymousClass06.A04;
        StringBuilder sb = new StringBuilder();
        String baseUrl = this.A03.A03(str);
        String extension = sb.append(baseUrl).append(str2).toString();
        synchronized (this.A07) {
            semaphore = this.A07.get(extension);
            if (semaphore == null) {
                semaphore = new Semaphore(1);
                this.A07.put(extension, semaphore);
            }
            try {
            } catch (Throwable th) {
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                    throw th;
                }
            }
        }
        try {
            semaphore.acquire();
            File fileA02 = A02(anonymousClass06, str, extension, this.A01, anonymousClass09);
            if (fileA02 != null) {
                AnonymousClass02<T> anonymousClass02A3M = anonymousClass09.A00().A3M(fileA02, this.A04);
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                }
                return anonymousClass02A3M;
            }
            AnonymousClass02<T> anonymousClass02 = new AnonymousClass02<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
            }
            return anonymousClass02;
        } catch (InterruptedException unused) {
            if (this.A08) {
                StringBuilder sb2 = new StringBuilder();
                String baseUrl2 = A03(97, 11, 22);
                StringBuilder sbAppend = sb2.append(baseUrl2).append(str);
                String baseUrl3 = A03(0, 22, 43);
                sbAppend.append(baseUrl3).toString();
            }
            AnonymousClass02<T> anonymousClass022 = new AnonymousClass02<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
                return anonymousClass022;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass00
    public final AnonymousClass02<Bitmap> AFH(AnonymousClass06 anonymousClass06, boolean z) {
        return A08(anonymousClass06, new AnonymousClass09(new C1214bq(anonymousClass06.A01, anonymousClass06.A00, this.A02.A04(), this.A02.A03(), z)));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.io.File> */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass00
    public final File AFI(AnonymousClass06 anonymousClass06) {
        AnonymousClass09 anonymousClass09 = new AnonymousClass09(new C1213bp());
        anonymousClass09.A01(true);
        anonymousClass09.A02(false);
        return (File) A08(anonymousClass06, anonymousClass09).A00();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass00
    public final String AFJ(AnonymousClass06 anonymousClass06) {
        return (String) A08(anonymousClass06, new AnonymousClass09(new C1212bo())).A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.lang.String> */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass00
    public final String AFK(AnonymousClass06 anonymousClass06) {
        AnonymousClass09 anonymousClass09 = new AnonymousClass09(new C1212bo());
        anonymousClass09.A01(true);
        anonymousClass09.A02(false);
        return (String) A08(anonymousClass06, anonymousClass09).A00();
    }
}
