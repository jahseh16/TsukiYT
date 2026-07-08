package i2;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import yk.co;
import yk.wz;
import yk.x4;

/* JADX INFO: loaded from: classes.dex */
public class fb extends co {

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final String f5453i9 = yk.f.a("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f5454a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public wz f5455c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final List<fb> f5456fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final List<? extends x4> f5457gv;
    public final String n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5458s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<String> f5459v;
    public final i9 y;
    public final yk.v zn;

    public fb(@NonNull i9 i9Var, @NonNull List<? extends x4> list) {
        this(i9Var, null, yk.v.KEEP, list, null);
    }

    public static boolean c5(@NonNull fb fbVar, @NonNull Set<String> set) {
        set.addAll(fbVar.zn());
        Set<String> setT = t(fbVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setT.contains(it.next())) {
                return true;
            }
        }
        List<fb> listV = fbVar.v();
        if (listV != null && !listV.isEmpty()) {
            Iterator<fb> it2 = listV.iterator();
            while (it2.hasNext()) {
                if (c5(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(fbVar.zn());
        return false;
    }

    @NonNull
    public static Set<String> t(fb fbVar) {
        HashSet hashSet = new HashSet();
        List<fb> listV = fbVar.v();
        if (listV != null && !listV.isEmpty()) {
            Iterator<fb> it = listV.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().zn());
            }
        }
        return hashSet;
    }

    @NonNull
    public List<? extends x4> a() {
        return this.f5457gv;
    }

    public void f() {
        this.f5458s = true;
    }

    @NonNull
    public i9 fb() {
        return this.y;
    }

    @Nullable
    public String gv() {
        return this.n3;
    }

    public boolean i9() {
        return this.f5458s;
    }

    public yk.v n3() {
        return this.zn;
    }

    public boolean s() {
        return c5(this, new HashSet());
    }

    public List<fb> v() {
        return this.f5456fb;
    }

    @NonNull
    public wz y() {
        if (this.f5458s) {
            yk.f.zn().s(f5453i9, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f5459v)), new Throwable[0]);
        } else {
            bv.n3 n3Var = new bv.n3(this);
            this.y.z().n3(n3Var);
            this.f5455c5 = n3Var.gv();
        }
        return this.f5455c5;
    }

    @NonNull
    public List<String> zn() {
        return this.f5459v;
    }

    public fb(@NonNull i9 i9Var, @Nullable String str, @NonNull yk.v vVar, @NonNull List<? extends x4> list) {
        this(i9Var, str, vVar, list, null);
    }

    public fb(@NonNull i9 i9Var, @Nullable String str, @NonNull yk.v vVar, @NonNull List<? extends x4> list, @Nullable List<fb> list2) {
        this.y = i9Var;
        this.n3 = str;
        this.zn = vVar;
        this.f5457gv = list;
        this.f5456fb = list2;
        this.f5459v = new ArrayList(list.size());
        this.f5454a = new ArrayList();
        if (list2 != null) {
            Iterator<fb> it = list2.iterator();
            while (it.hasNext()) {
                this.f5454a.addAll(it.next().f5454a);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String strY = list.get(i).y();
            this.f5459v.add(strY);
            this.f5454a.add(strY);
        }
    }
}
