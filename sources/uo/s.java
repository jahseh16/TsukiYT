package uo;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x4.c5;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<h.s> f8417a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public List<jr.v> f8418c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8419f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public c5<h.gv> f8420fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public Map<String, ta> f8421gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public Rect f8422i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public x4.v<jr.v> f8423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f8424t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public float f8425tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Map<String, h.zn> f8426v;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f8427wz;
    public Map<String, List<jr.v>> zn;
    public final yt y = new yt();
    public final HashSet<String> n3 = new HashSet<>();

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public int f8428xc = 0;

    public float a() {
        return this.f8424t;
    }

    public float c5() {
        return this.f8425tl;
    }

    public void co(Rect rect, float f3, float f4, float f5, List<jr.v> list, x4.v<jr.v> vVar, Map<String, List<jr.v>> map, Map<String, ta> map2, c5<h.gv> c5Var, Map<String, h.zn> map3, List<h.s> list2) {
        this.f8422i9 = rect;
        this.f8419f = f3;
        this.f8424t = f4;
        this.f8425tl = f5;
        this.f8418c5 = list;
        this.f8423s = vVar;
        this.zn = map;
        this.f8421gv = map2;
        this.f8420fb = c5Var;
        this.f8426v = map3;
        this.f8417a = list2;
    }

    public List<jr.v> f() {
        return this.f8418c5;
    }

    public Map<String, h.zn> fb() {
        return this.f8426v;
    }

    public float gv() {
        return (long) ((v() / this.f8425tl) * 1000.0f);
    }

    public Map<String, ta> i9() {
        return this.f8421gv;
    }

    public void mt(int i) {
        this.f8428xc += i;
    }

    public Rect n3() {
        return this.f8422i9;
    }

    public boolean p() {
        return this.f8427wz;
    }

    public void r(boolean z) {
        this.f8427wz = z;
    }

    public float s(float f3) {
        return ic.c5.c5(this.f8419f, this.f8424t, f3);
    }

    @Nullable
    public h.s t(String str) {
        int size = this.f8417a.size();
        for (int i = 0; i < size; i++) {
            h.s sVar = this.f8417a.get(i);
            if (sVar.y(str)) {
                return sVar;
            }
        }
        return null;
    }

    public int tl() {
        return this.f8428xc;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<jr.v> it = this.f8418c5.iterator();
        while (it.hasNext()) {
            sb.append(it.next().n("\t"));
        }
        return sb.toString();
    }

    public float v() {
        return this.f8424t - this.f8419f;
    }

    public float w() {
        return this.f8419f;
    }

    public yt wz() {
        return this.y;
    }

    public void x4(boolean z) {
        this.y.n3(z);
    }

    @Nullable
    public List<jr.v> xc(String str) {
        return this.zn.get(str);
    }

    public void y(String str) {
        ic.a.zn(str);
        this.n3.add(str);
    }

    public jr.v z(long j) {
        return this.f8423s.s(j);
    }

    public c5<h.gv> zn() {
        return this.f8420fb;
    }
}
