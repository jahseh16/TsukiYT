package hx;

import android.net.Uri;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import ft.g;
import ft.q;
import mn.y;
import v0.c;
import v0.ta;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class xc {
    public final Uri n3;
    public final s y;

    public xc(y yVar, Uri uri) {
        v0.y.n3(yVar.f5416c5.containsKey("control"), "missing attribute control");
        this.y = n3(yVar);
        this.n3 = y(uri, (String) ut.i9(yVar.f5416c5.get("control")));
    }

    public static void a(g.n3 n3Var, k4.i4<String, String> i4Var, int i, int i5) {
        v0.y.n3(i4Var.containsKey("profile-level-id"), "missing profile-level-id param");
        n3Var.x("mp4a.40." + ((String) v0.y.v(i4Var.get("profile-level-id"))));
        n3Var.ut(k4.r.j(mn.y.y(i5, i)));
    }

    public static void c5(g.n3 n3Var, k4.i4<String, String> i4Var) {
        String str = i4Var.get("config");
        if (str != null) {
            byte[] bArrA8 = ut.a8(str);
            n3Var.ut(k4.r.j(bArrA8));
            Pair<Integer, Integer> pairA = v0.a.a(bArrA8);
            n3Var.s8(((Integer) pairA.first).intValue()).o(((Integer) pairA.second).intValue());
        } else {
            n3Var.s8(352).o(288);
        }
        String str2 = i4Var.get("profile-level-id");
        StringBuilder sb = new StringBuilder();
        sb.append("mp4v.");
        if (str2 == null) {
            str2 = "1";
        }
        sb.append(str2);
        n3Var.x(sb.toString());
    }

    public static void fb(g.n3 n3Var, k4.i4<String, String> i4Var) {
        v0.y.n3(i4Var.containsKey("sprop-parameter-sets"), "missing sprop parameter");
        String[] strArrRo = ut.ro((String) v0.y.v(i4Var.get("sprop-parameter-sets")), ",");
        v0.y.n3(strArrRo.length == 2, "empty sprop value");
        k4.r rVarOz = k4.r.oz(zn(strArrRo[0]), zn(strArrRo[1]));
        n3Var.ut(rVarOz);
        byte[] bArr = rVarOz.get(0);
        c.zn znVarT = v0.c.t(bArr, v0.c.y.length, bArr.length);
        n3Var.y5(znVarT.f8733s);
        n3Var.o(znVarT.f8730fb);
        n3Var.s8(znVarT.f8727a);
        String str = i4Var.get("profile-level-id");
        if (str == null) {
            n3Var.x(v0.a.y(znVarT.y, znVarT.n3, znVarT.zn));
            return;
        }
        n3Var.x("avc1." + str);
    }

    public static int gv(int i, String str) {
        return i != -1 ? i : str.equals("audio/ac3") ? 6 : 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static hx.s n3(hx.y r13) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hx.xc.n3(hx.y):hx.s");
    }

    public static void s(g.n3 n3Var, k4.i4<String, String> i4Var) {
        if (i4Var.containsKey("sprop-max-don-diff")) {
            int i = Integer.parseInt((String) v0.y.v(i4Var.get("sprop-max-don-diff")));
            v0.y.n3(i == 0, "non-zero sprop-max-don-diff " + i + " is not supported");
        }
        v0.y.n3(i4Var.containsKey("sprop-vps"), "missing sprop-vps parameter");
        String str = (String) v0.y.v(i4Var.get("sprop-vps"));
        v0.y.n3(i4Var.containsKey("sprop-sps"), "missing sprop-sps parameter");
        String str2 = (String) v0.y.v(i4Var.get("sprop-sps"));
        v0.y.n3(i4Var.containsKey("sprop-pps"), "missing sprop-pps parameter");
        k4.r rVarK = k4.r.k(zn(str), zn(str2), zn((String) v0.y.v(i4Var.get("sprop-pps"))));
        n3Var.ut(rVarK);
        byte[] bArr = rVarK.get(1);
        c.y yVarS = v0.c.s(bArr, v0.c.y.length, bArr.length);
        n3Var.y5(yVarS.f8722i9);
        n3Var.o(yVarS.f8718c5).s8(yVarS.f8723s);
        n3Var.x(v0.a.zn(yVarS.y, yVarS.n3, yVarS.zn, yVarS.f8721gv, yVarS.f8726v, yVarS.f8717a));
    }

    public static y.n3 v(String str) {
        ta taVar = new ta(ut.a8(str));
        v0.y.n3(taVar.s(1) == 0, "Only supports audio mux version 0.");
        v0.y.n3(taVar.s(1) == 1, "Only supports allStreamsSameTimeFraming.");
        taVar.mt(6);
        v0.y.n3(taVar.s(4) == 0, "Only supports one program.");
        v0.y.n3(taVar.s(3) == 0, "Only supports one numLayer.");
        try {
            return mn.y.v(taVar, false);
        } catch (q e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static Uri y(Uri uri, String str) {
        Uri uri2 = Uri.parse(str);
        return uri2.isAbsolute() ? uri2 : str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    public static byte[] zn(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length;
        byte[] bArr = v0.c.y;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        return bArr2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xc.class != obj.getClass()) {
            return false;
        }
        xc xcVar = (xc) obj;
        return this.y.equals(xcVar.y) && this.n3.equals(xcVar.n3);
    }

    public int hashCode() {
        return ((217 + this.y.hashCode()) * 31) + this.n3.hashCode();
    }
}
