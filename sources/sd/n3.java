package sd;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import k4.c;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Random f7802gv;
    public final Map<Integer, Long> n3;
    public final Map<String, Long> y;
    public final Map<List<Pair<String, Integer>>, pv.n3> zn;

    public n3() {
        this(new Random());
    }

    public static int a(List<pv.n3> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(list.get(i).zn));
        }
        return hashSet.size();
    }

    public static int gv(pv.n3 n3Var, pv.n3 n3Var2) {
        int iCompare = Integer.compare(n3Var.zn, n3Var2.zn);
        return iCompare != 0 ? iCompare : n3Var.n3.compareTo(n3Var2.n3);
    }

    public static <T> void n3(T t3, long j, Map<T, Long> map) {
        if (map.containsKey(t3)) {
            j = Math.max(j, ((Long) ut.i9(map.get(t3))).longValue());
        }
        map.put(t3, Long.valueOf(j));
    }

    public static <T> void s(long j, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public void c5() {
        this.y.clear();
        this.n3.clear();
        this.zn.clear();
    }

    public final pv.n3 f(List<pv.n3> list) {
        int i = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i += list.get(i5).f7392gv;
        }
        int iNextInt = this.f7802gv.nextInt(i);
        int i8 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            pv.n3 n3Var = list.get(i10);
            i8 += n3Var.f7392gv;
            if (iNextInt < i8) {
                return n3Var;
            }
        }
        return (pv.n3) c.gv(list);
    }

    public int fb(List<pv.n3> list) {
        HashSet hashSet = new HashSet();
        List<pv.n3> listZn = zn(list);
        for (int i = 0; i < listZn.size(); i++) {
            hashSet.add(Integer.valueOf(listZn.get(i).zn));
        }
        return hashSet.size();
    }

    @Nullable
    public pv.n3 i9(List<pv.n3> list) {
        List<pv.n3> listZn = zn(list);
        if (listZn.size() < 2) {
            return (pv.n3) c.zn(listZn, null);
        }
        Collections.sort(listZn, new Comparator() { // from class: sd.y
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n3.gv((pv.n3) obj, (pv.n3) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = listZn.get(0).zn;
        int i5 = 0;
        while (true) {
            if (i5 >= listZn.size()) {
                break;
            }
            pv.n3 n3Var = listZn.get(i5);
            if (i == n3Var.zn) {
                arrayList.add(new Pair(n3Var.n3, Integer.valueOf(n3Var.f7392gv)));
                i5++;
            } else if (arrayList.size() == 1) {
                return listZn.get(0);
            }
        }
        pv.n3 n3Var2 = this.zn.get(arrayList);
        if (n3Var2 != null) {
            return n3Var2;
        }
        pv.n3 n3VarF = f(listZn.subList(0, arrayList.size()));
        this.zn.put(arrayList, n3VarF);
        return n3VarF;
    }

    public void v(pv.n3 n3Var, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        n3(n3Var.n3, jElapsedRealtime, this.y);
        int i = n3Var.zn;
        if (i != Integer.MIN_VALUE) {
            n3(Integer.valueOf(i), jElapsedRealtime, this.n3);
        }
    }

    public final List<pv.n3> zn(List<pv.n3> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        s(jElapsedRealtime, this.y);
        s(jElapsedRealtime, this.n3);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            pv.n3 n3Var = list.get(i);
            if (!this.y.containsKey(n3Var.n3) && !this.n3.containsKey(Integer.valueOf(n3Var.zn))) {
                arrayList.add(n3Var);
            }
        }
        return arrayList;
    }

    public n3(Random random) {
        this.zn = new HashMap();
        this.f7802gv = random;
        this.y = new HashMap();
        this.n3 = new HashMap();
    }
}
