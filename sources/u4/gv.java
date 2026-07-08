package u4;

import androidx.annotation.Nullable;
import b1.f;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class gv extends v {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long[] f8351gv;
    public long n3;
    public long[] zn;

    public gv() {
        super(new f());
        this.n3 = -9223372036854775807L;
        this.zn = new long[0];
        this.f8351gv = new long[0];
    }

    public static Date c5(d dVar) {
        Date date = new Date((long) i9(dVar).doubleValue());
        dVar.ut(2);
        return date;
    }

    public static HashMap<String, Object> f(d dVar) {
        int iB = dVar.b();
        HashMap<String, Object> map = new HashMap<>(iB);
        for (int i = 0; i < iB; i++) {
            String strWz = wz(dVar);
            Object objS = s(dVar, xc(dVar));
            if (objS != null) {
                map.put(strWz, objS);
            }
        }
        return map;
    }

    public static Boolean fb(d dVar) {
        return Boolean.valueOf(dVar.ej() == 1);
    }

    public static Double i9(d dVar) {
        return Double.valueOf(Double.longBitsToDouble(dVar.d0()));
    }

    @Nullable
    public static Object s(d dVar, int i) {
        if (i == 0) {
            return i9(dVar);
        }
        if (i == 1) {
            return fb(dVar);
        }
        if (i == 2) {
            return wz(dVar);
        }
        if (i == 3) {
            return t(dVar);
        }
        if (i == 8) {
            return f(dVar);
        }
        if (i == 10) {
            return tl(dVar);
        }
        if (i != 11) {
            return null;
        }
        return c5(dVar);
    }

    public static HashMap<String, Object> t(d dVar) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strWz = wz(dVar);
            int iXc = xc(dVar);
            if (iXc == 9) {
                return map;
            }
            Object objS = s(dVar, iXc);
            if (objS != null) {
                map.put(strWz, objS);
            }
        }
    }

    public static ArrayList<Object> tl(d dVar) {
        int iB = dVar.b();
        ArrayList<Object> arrayList = new ArrayList<>(iB);
        for (int i = 0; i < iB; i++) {
            Object objS = s(dVar, xc(dVar));
            if (objS != null) {
                arrayList.add(objS);
            }
        }
        return arrayList;
    }

    public static String wz(d dVar) {
        int iYt = dVar.yt();
        int iA = dVar.a();
        dVar.ut(iYt);
        return new String(dVar.v(), iA, iYt);
    }

    public static int xc(d dVar) {
        return dVar.ej();
    }

    public long[] a() {
        return this.zn;
    }

    public long gv() {
        return this.n3;
    }

    @Override // u4.v
    public boolean n3(d dVar) {
        return true;
    }

    public long[] v() {
        return this.f8351gv;
    }

    @Override // u4.v
    public boolean zn(d dVar, long j) {
        if (xc(dVar) != 2 || !"onMetaData".equals(wz(dVar)) || dVar.y() == 0 || xc(dVar) != 8) {
            return false;
        }
        HashMap<String, Object> mapF = f(dVar);
        Object obj = mapF.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.n3 = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapF.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.zn = new long[size];
                this.f8351gv = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.zn = new long[0];
                        this.f8351gv = new long[0];
                        break;
                    }
                    this.zn[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f8351gv[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
