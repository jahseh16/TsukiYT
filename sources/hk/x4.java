package hk;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.internal.Code;
import ia.f;
import ia.n3;
import ia.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import jr.v;
import k3.zn;
import r6.y;
import uo.s;

/* JADX INFO: loaded from: classes.dex */
public class x4 {
    public static final zn.y y = zn.y.y(new String[]{"nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd"});
    public static final zn.y n3 = zn.y.y(new String[]{"d", "a"});
    public static final zn.y zn = zn.y.y(new String[]{"ty", "nm"});

    public static v n3(s sVar) {
        Rect rectN3 = sVar.n3();
        return new v(Collections.emptyList(), sVar, "__container", -1L, v.y.PRE_COMP, -1L, null, Collections.emptyList(), new t(), 0, 0, 0, 0.0f, 0.0f, rectN3.width(), rectN3.height(), null, null, Collections.emptyList(), v.n3.NONE, null, false, null, null);
    }

    public static v y(zn znVar, s sVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        v.n3 n3Var = v.n3.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        znVar.t();
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        v.n3 n3Var2 = n3Var;
        v.y yVar = null;
        String strRz = null;
        t tVarFb = null;
        ia.i9 i9VarGv = null;
        f fVarY = null;
        n3 n3VarA = null;
        y yVarN3 = null;
        i9 i9VarN3 = null;
        long jN = 0;
        long jN2 = -1;
        float fF3 = 0.0f;
        int iN = 0;
        int iN2 = 0;
        int color = 0;
        float fF32 = 1.0f;
        float fF33 = 0.0f;
        float fF34 = 0.0f;
        float fF35 = 0.0f;
        boolean zR = false;
        float fA = 0.0f;
        String strRz2 = "UNSET";
        String strRz3 = null;
        while (znVar.co()) {
            switch (znVar.ej(y)) {
                case 0:
                    strRz2 = znVar.rz();
                    break;
                case 1:
                    jN = znVar.n();
                    break;
                case 2:
                    strRz = znVar.rz();
                    break;
                case 3:
                    int iN3 = znVar.n();
                    yVar = v.y.UNKNOWN;
                    if (iN3 < yVar.ordinal()) {
                        yVar = v.y.values()[iN3];
                    }
                    break;
                case 4:
                    jN2 = znVar.n();
                    break;
                case 5:
                    iN = (int) (znVar.n() * ic.i9.v());
                    break;
                case 6:
                    iN2 = (int) (znVar.n() * ic.i9.v());
                    break;
                case 7:
                    color = Color.parseColor(znVar.rz());
                    break;
                case 8:
                    tVarFb = zn.fb(znVar, sVar);
                    break;
                case 9:
                    int iN4 = znVar.n();
                    if (iN4 < v.n3.values().length) {
                        n3Var2 = v.n3.values()[iN4];
                        int i = y.y[n3Var2.ordinal()];
                        if (i == 1) {
                            sVar.y("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            sVar.y("Unsupported matte type: Luma Inverted");
                        }
                        sVar.mt(1);
                    } else {
                        sVar.y("Unsupported matte type: " + iN4);
                    }
                    break;
                case 10:
                    znVar.a();
                    while (znVar.co()) {
                        arrayList3.add(f3.y(znVar, sVar));
                    }
                    sVar.mt(arrayList3.size());
                    znVar.w();
                    break;
                case 11:
                    znVar.a();
                    while (znVar.co()) {
                        r6.zn znVarY = s.y(znVar, sVar);
                        if (znVarY != null) {
                            arrayList4.add(znVarY);
                        }
                    }
                    znVar.w();
                    break;
                case Code.UNIMPLEMENTED /* 12 */:
                    znVar.t();
                    while (znVar.co()) {
                        int iEj = znVar.ej(n3);
                        if (iEj == 0) {
                            i9VarGv = gv.gv(znVar, sVar);
                        } else if (iEj != 1) {
                            znVar.yt();
                            znVar.j();
                        } else {
                            znVar.a();
                            if (znVar.co()) {
                                fVarY = n3.y(znVar, sVar);
                            }
                            while (znVar.co()) {
                                znVar.j();
                            }
                            znVar.w();
                        }
                    }
                    znVar.p();
                    break;
                case 13:
                    znVar.a();
                    ArrayList arrayList5 = new ArrayList();
                    while (znVar.co()) {
                        znVar.t();
                        while (znVar.co()) {
                            int iEj2 = znVar.ej(zn);
                            if (iEj2 == 0) {
                                int iN5 = znVar.n();
                                if (iN5 == 29) {
                                    yVarN3 = v.n3(znVar, sVar);
                                } else if (iN5 == 25) {
                                    i9VarN3 = new f().n3(znVar, sVar);
                                }
                            } else if (iEj2 != 1) {
                                znVar.yt();
                                znVar.j();
                            } else {
                                arrayList5.add(znVar.rz());
                            }
                        }
                        znVar.p();
                    }
                    znVar.w();
                    sVar.y("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    fF32 = (float) znVar.f3();
                    break;
                case 15:
                    fF33 = (float) znVar.f3();
                    break;
                case 16:
                    fF34 = (float) (znVar.f3() * ((double) ic.i9.v()));
                    break;
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    fF35 = (float) (znVar.f3() * ((double) ic.i9.v()));
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    fF3 = (float) znVar.f3();
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    fA = (float) znVar.f3();
                    break;
                case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                    n3VarA = gv.a(znVar, sVar, false);
                    break;
                case 21:
                    strRz3 = znVar.rz();
                    break;
                case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                    zR = znVar.r();
                    break;
                default:
                    znVar.yt();
                    znVar.j();
                    break;
            }
        }
        znVar.p();
        ArrayList arrayList6 = new ArrayList();
        if (fF3 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new gn.y(sVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(fF3)));
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (fA <= 0.0f) {
            fA = sVar.a();
        }
        arrayList2.add(new gn.y(sVar, fValueOf2, fValueOf2, (Interpolator) null, fF3, Float.valueOf(fA)));
        arrayList2.add(new gn.y(sVar, fValueOf, fValueOf, (Interpolator) null, fA, Float.valueOf(Float.MAX_VALUE)));
        if (strRz2.endsWith(".ai") || "ai".equals(strRz3)) {
            sVar.y("Convert your Illustrator layers to shape layers.");
        }
        return new v(arrayList4, sVar, strRz2, jN, yVar, jN2, strRz, arrayList, tVarFb, iN, iN2, color, fF32, fF33, fF34, fF35, i9VarGv, fVarY, arrayList2, n3Var2, n3VarA, zR, yVarN3, i9VarN3);
    }
}
