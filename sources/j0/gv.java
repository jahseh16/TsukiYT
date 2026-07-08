package j0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import b0.n3;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final fb f5770a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public final String f5771c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, Integer> f5772f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final String[] f5773fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f5774gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public final gv f5775i9;

    @Nullable
    public final String n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap<String, Integer> f5777t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public List<gv> f5778tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f5779v;

    @Nullable
    public final String y;
    public final boolean zn;

    public gv(@Nullable String str, @Nullable String str2, long j, long j4, @Nullable fb fbVar, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable gv gvVar) {
        this.y = str;
        this.n3 = str2;
        this.f5771c5 = str4;
        this.f5770a = fbVar;
        this.f5773fb = strArr;
        this.zn = str2 != null;
        this.f5774gv = j;
        this.f5779v = j4;
        this.f5776s = (String) v0.y.v(str3);
        this.f5775i9 = gvVar;
        this.f5772f = new HashMap<>();
        this.f5777t = new HashMap<>();
    }

    public static SpannableStringBuilder f(String str, Map<String, n3.C0034n3> map) {
        if (!map.containsKey(str)) {
            n3.C0034n3 c0034n3 = new n3.C0034n3();
            c0034n3.xc(new SpannableStringBuilder());
            map.put(str, c0034n3);
        }
        return (SpannableStringBuilder) v0.y.v(map.get(str).v());
    }

    public static gv gv(String str) {
        return new gv(null, a.n3(str), -9223372036854775807L, -9223372036854775807L, null, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, null, null);
    }

    public static void v(SpannableStringBuilder spannableStringBuilder) {
        for (y yVar : (y[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(yVar), spannableStringBuilder.getSpanEnd(yVar), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i5 = i + 1;
                int i8 = i5;
                while (i8 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i8) == ' ') {
                    i8++;
                }
                int i10 = i8 - i5;
                if (i10 > 0) {
                    spannableStringBuilder.delete(i, i10 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
            if (spannableStringBuilder.charAt(i11) == '\n') {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i12) == ' ') {
                    spannableStringBuilder.delete(i12, i11 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
            if (spannableStringBuilder.charAt(i13) == ' ') {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    spannableStringBuilder.delete(i13, i14);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public static gv zn(@Nullable String str, long j, long j4, @Nullable fb fbVar, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable gv gvVar) {
        return new gv(str, null, j, j4, fbVar, strArr, str2, str3, gvVar);
    }

    public gv a(int i) {
        List<gv> list = this.f5778tl;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void c5(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = "p".equals(this.y);
        boolean zEquals2 = "div".equals(this.y);
        if (z || zEquals || (zEquals2 && this.f5771c5 != null)) {
            long j = this.f5774gv;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j4 = this.f5779v;
            if (j4 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j4));
            }
        }
        if (this.f5778tl == null) {
            return;
        }
        for (int i = 0; i < this.f5778tl.size(); i++) {
            this.f5778tl.get(i).c5(treeSet, z || zEquals);
        }
    }

    public int fb() {
        List<gv> list = this.f5778tl;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long[] i9() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        c5(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public final void n3(Map<String, fb> map, n3.C0034n3 c0034n3, int i, int i5, int i8) {
        fb fbVarA = a.a(this.f5770a, this.f5773fb, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0034n3.v();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c0034n3.xc(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (fbVarA != null) {
            a.y(spannableStringBuilder2, i, i5, fbVarA, this.f5775i9, map, i8);
            if ("p".equals(this.y)) {
                if (fbVarA.f() != Float.MAX_VALUE) {
                    c0034n3.tl((fbVarA.f() * (-90.0f)) / 100.0f);
                }
                if (fbVarA.tl() != null) {
                    c0034n3.w(fbVarA.tl());
                }
                if (fbVarA.s() != null) {
                    c0034n3.i9(fbVarA.s());
                }
            }
        }
    }

    public List<b0.n3> s(long j, Map<String, fb> map, Map<String, v> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        wz(j, this.f5776s, arrayList);
        TreeMap treeMap = new TreeMap();
        w(j, false, this.f5776s, treeMap);
        xc(j, map, map2, this.f5776s, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                v vVar = (v) v0.y.v(map2.get(pair.first));
                arrayList2.add(new n3.C0034n3().a(bitmapDecodeByteArray).f(vVar.n3).t(0).s(vVar.zn, 0).c5(vVar.f5795v).wz(vVar.f5789a).fb(vVar.f5791fb).mt(vVar.f5793i9).y());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            v vVar2 = (v) v0.y.v(map2.get(entry.getKey()));
            n3.C0034n3 c0034n3 = (n3.C0034n3) entry.getValue();
            v((SpannableStringBuilder) v0.y.v(c0034n3.v()));
            c0034n3.s(vVar2.zn, vVar2.f5792gv);
            c0034n3.c5(vVar2.f5795v);
            c0034n3.f(vVar2.n3);
            c0034n3.wz(vVar2.f5789a);
            c0034n3.p(vVar2.f5790c5, vVar2.f5794s);
            c0034n3.mt(vVar2.f5793i9);
            arrayList2.add(c0034n3.y());
        }
        return arrayList2;
    }

    @Nullable
    public String[] t() {
        return this.f5773fb;
    }

    public boolean tl(long j) {
        long j4 = this.f5774gv;
        return (j4 == -9223372036854775807L && this.f5779v == -9223372036854775807L) || (j4 <= j && this.f5779v == -9223372036854775807L) || ((j4 == -9223372036854775807L && j < this.f5779v) || (j4 <= j && j < this.f5779v));
    }

    public final void w(long j, boolean z, String str, Map<String, n3.C0034n3> map) {
        this.f5772f.clear();
        this.f5777t.clear();
        if ("metadata".equals(this.y)) {
            return;
        }
        if (!FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(this.f5776s)) {
            str = this.f5776s;
        }
        if (this.zn && z) {
            f(str, map).append((CharSequence) v0.y.v(this.n3));
            return;
        }
        if ("br".equals(this.y) && z) {
            f(str, map).append('\n');
            return;
        }
        if (tl(j)) {
            for (Map.Entry<String, n3.C0034n3> entry : map.entrySet()) {
                this.f5772f.put(entry.getKey(), Integer.valueOf(((CharSequence) v0.y.v(entry.getValue().v())).length()));
            }
            boolean zEquals = "p".equals(this.y);
            for (int i = 0; i < fb(); i++) {
                a(i).w(j, z || zEquals, str, map);
            }
            if (zEquals) {
                a.zn(f(str, map));
            }
            for (Map.Entry<String, n3.C0034n3> entry2 : map.entrySet()) {
                this.f5777t.put(entry2.getKey(), Integer.valueOf(((CharSequence) v0.y.v(entry2.getValue().v())).length()));
            }
        }
    }

    public final void wz(long j, String str, List<Pair<String, String>> list) {
        if (!FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(this.f5776s)) {
            str = this.f5776s;
        }
        if (tl(j) && "div".equals(this.y) && this.f5771c5 != null) {
            list.add(new Pair<>(str, this.f5771c5));
            return;
        }
        for (int i = 0; i < fb(); i++) {
            a(i).wz(j, str, list);
        }
    }

    public final void xc(long j, Map<String, fb> map, Map<String, v> map2, String str, Map<String, n3.C0034n3> map3) {
        int i;
        if (tl(j)) {
            String str2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(this.f5776s) ? str : this.f5776s;
            Iterator<Map.Entry<String, Integer>> it = this.f5777t.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f5772f.containsKey(key) ? this.f5772f.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    n3(map, (n3.C0034n3) v0.y.v(map3.get(key)), iIntValue, iIntValue2, ((v) v0.y.v(map2.get(str2))).f5793i9);
                }
            }
            for (i = 0; i < fb(); i++) {
                a(i).xc(j, map, map2, str2, map3);
            }
        }
    }

    public void y(gv gvVar) {
        if (this.f5778tl == null) {
            this.f5778tl = new ArrayList();
        }
        this.f5778tl.add(gvVar);
    }
}
