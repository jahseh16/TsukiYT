package yj1;

import hk1.s;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sj1.r;
import sj1.rz;
import sj1.tl;
import sj1.wz;
import sj1.z;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final hk1.s n3;
    public static final hk1.s y;

    static {
        s.y yVar = hk1.s.fb;
        y = yVar.gv("\"\\");
        n3 = yVar.gv("\t ,=");
    }

    public static final String a(hk1.v vVar) {
        long jX = vVar.x(n3);
        if (jX == -1) {
            jX = vVar.lc();
        }
        if (jX != 0) {
            return vVar.ut(jX);
        }
        return null;
    }

    public static final boolean c5(hk1.v vVar, byte b4) {
        return !vVar.dm() && vVar.rz(0L) == b4;
    }

    public static final void fb(wz wzVar, r url, z headers) {
        Intrinsics.checkNotNullParameter(wzVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (wzVar == wz.n3) {
            return;
        }
        List<tl> listV = tl.f8034i9.v(url, headers);
        if (listV.isEmpty()) {
            return;
        }
        wzVar.saveFromResponse(url, listV);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0079, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0079, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void gv(hk1.v r7, java.util.List<sj1.s> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            s(r7)
            java.lang.String r1 = a(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = s(r7)
            java.lang.String r3 = a(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.dm()
            if (r7 != 0) goto L1f
            return
        L1f:
            sj1.s r7 = new sj1.s
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = tj1.gv.k5(r7, r4)
            boolean r6 = s(r7)
            if (r2 != 0) goto L5c
            if (r6 != 0) goto L40
            boolean r2 = r7.dm()
            if (r2 == 0) goto L5c
        L40:
            sj1.s r2 = new sj1.s
            java.lang.String r4 = "="
            java.lang.String r4 = kotlin.text.StringsKt.repeat(r4, r5)
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r4)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L5c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = tj1.gv.k5(r7, r4)
            int r5 = r5 + r6
        L66:
            if (r3 != 0) goto L77
            java.lang.String r3 = a(r7)
            boolean r5 = s(r7)
            if (r5 == 0) goto L73
            goto L79
        L73:
            int r5 = tj1.gv.k5(r7, r4)
        L77:
            if (r5 != 0) goto L84
        L79:
            sj1.s r4 = new sj1.s
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L84:
            r6 = 1
            if (r5 <= r6) goto L88
            return
        L88:
            boolean r6 = s(r7)
            if (r6 == 0) goto L8f
            return
        L8f:
            r6 = 34
            boolean r6 = c5(r7, r6)
            if (r6 == 0) goto L9c
            java.lang.String r6 = v(r7)
            goto La0
        L9c:
            java.lang.String r6 = a(r7)
        La0:
            if (r6 != 0) goto La3
            return
        La3:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lac
            return
        Lac:
            boolean r3 = s(r7)
            if (r3 != 0) goto Lb9
            boolean r3 = r7.dm()
            if (r3 != 0) goto Lb9
            return
        Lb9:
            r3 = r0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: yj1.v.gv(hk1.v, java.util.List):void");
    }

    public static final List<sj1.s> n3(z zVar, String headerName) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = zVar.size();
        int i = 0;
        while (i < size) {
            int i5 = i + 1;
            if (StringsKt.equals(headerName, zVar.zn(i), true)) {
                try {
                    gv(new hk1.v().vp(zVar.s(i)), arrayList);
                } catch (EOFException e4) {
                    ck1.i9.y.fb().f("Unable to parse challenge", 5, e4);
                }
            }
            i = i5;
        }
        return arrayList;
    }

    public static final boolean s(hk1.v vVar) {
        boolean z = false;
        while (!vVar.dm()) {
            byte bRz = vVar.rz(0L);
            if (bRz == 44) {
                vVar.readByte();
                z = true;
            } else {
                if (bRz != 32 && bRz != 9) {
                    break;
                }
                vVar.readByte();
            }
        }
        return z;
    }

    public static final String v(hk1.v vVar) throws EOFException {
        if (vVar.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        hk1.v vVar2 = new hk1.v();
        while (true) {
            long jX = vVar.x(y);
            if (jX == -1) {
                return null;
            }
            if (vVar.rz(jX) == 34) {
                vVar2.write(vVar, jX);
                vVar.readByte();
                return vVar2.yc();
            }
            if (vVar.lc() == jX + 1) {
                return null;
            }
            vVar2.write(vVar, jX);
            vVar.readByte();
            vVar2.write(vVar, 1L);
        }
    }

    public static final boolean y(rz response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return zn(response);
    }

    public static final boolean zn(rz rzVar) {
        Intrinsics.checkNotNullParameter(rzVar, "<this>");
        if (Intrinsics.areEqual(rzVar.f7().s(), "HEAD")) {
            return false;
        }
        int iP = rzVar.p();
        return (((iP >= 100 && iP < 200) || iP == 204 || iP == 304) && tj1.gv.x4(rzVar) == -1 && !StringsKt.equals("chunked", rz.c(rzVar, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }
}
