package n0;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.Reader;
import cx.vl;
import ft.g;
import ft.gn;
import ft.k3;
import ft.s;
import ft.xq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import k4.k5;
import k4.r;
import n0.c;
import n0.fh;
import n0.tl;
import n0.y;
import n0.z6;
import ur.lc;
import ur.mg;
import ur.rs;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class tl extends fh {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k5<Integer> f6758f = k5.y(new Comparator() { // from class: n0.gv
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tl.oz((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k5<Integer> f6759t = k5.y(new Comparator() { // from class: n0.v
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tl.ut((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.n3 f6760a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public a f6761c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f6762fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Object f6763gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public mn.v f6764i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public gv f6765s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final Context f6766v;

    public static class a {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public Spatializer.OnSpatializerStateChangedListener f6767gv;
        public final boolean n3;
        public final Spatializer y;

        @Nullable
        public Handler zn;

        public class y implements Spatializer.OnSpatializerStateChangedListener {
            public final /* synthetic */ tl y;

            public y(a aVar, tl tlVar) {
                this.y = tlVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                this.y.k();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                this.y.k();
            }
        }

        public a(Spatializer spatializer) {
            this.y = spatializer;
            this.n3 = spatializer.getImmersiveAudioLevel() != 0;
        }

        @Nullable
        public static a fb(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new a(audioManager.getSpatializer());
        }

        public void a() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f6767gv;
            if (onSpatializerStateChangedListener == null || this.zn == null) {
                return;
            }
            this.y.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) ut.i9(this.zn)).removeCallbacksAndMessages(null);
            this.zn = null;
            this.f6767gv = null;
        }

        public boolean gv() {
            return this.y.isEnabled();
        }

        public void n3(tl tlVar, Looper looper) {
            if (this.f6767gv == null && this.zn == null) {
                this.f6767gv = new y(this, tlVar);
                Handler handler = new Handler(looper);
                this.zn = handler;
                Spatializer spatializer = this.y;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new vl(handler), this.f6767gv);
            }
        }

        public boolean v() {
            return this.n3;
        }

        public boolean y(mn.v vVar, g gVar) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(ut.z6(("audio/eac3-joc".equals(gVar.f3) && gVar.j == 16) ? 12 : gVar.j));
            int i = gVar.oz;
            if (i != -1) {
                channelMask.setSampleRate(i);
            }
            return this.y.canBeSpatialized(vVar.n3().y, channelMask.build());
        }

        public boolean zn() {
            return this.y.isAvailable();
        }
    }

    public static final class c5 extends s<c5> {
        public final boolean c;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public final int f6768co;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f6769d;
        public final int d0;

        /* JADX INFO: renamed from: ej, reason: collision with root package name */
        public final int f6770ej;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f6771f;
        public final int f3;
        public final boolean fh;
        public final boolean n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f6772p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f6773r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final gv f6774t;
        public final boolean w;
        public final int z;

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c5(int r5, ur.rs r6, int r7, n0.tl.gv r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instruction units count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n0.tl.c5.<init>(int, ur.rs, int, n0.tl$gv, int, int, boolean):void");
        }

        public static int a(c5 c5Var, c5 c5Var2) {
            k5 k5VarP = (c5Var.f6771f && c5Var.f6772p) ? tl.f6758f : tl.f6758f.p();
            return k4.wz.i9().a(Integer.valueOf(c5Var.f6768co), Integer.valueOf(c5Var2.f6768co), c5Var.f6774t.qn ? tl.f6758f.p() : tl.f6759t).a(Integer.valueOf(c5Var.z), Integer.valueOf(c5Var2.z), k5VarP).a(Integer.valueOf(c5Var.f6768co), Integer.valueOf(c5Var2.f6768co), k5VarP).c5();
        }

        public static int fb(List<c5> list, List<c5> list2) {
            return k4.wz.i9().a((c5) Collections.max(list, new Comparator() { // from class: n0.i4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return tl.c5.v((tl.c5) obj, (tl.c5) obj2);
                }
            }), (c5) Collections.max(list2, new Comparator() { // from class: n0.i4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return tl.c5.v((tl.c5) obj, (tl.c5) obj2);
                }
            }), new Comparator() { // from class: n0.i4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return tl.c5.v((tl.c5) obj, (tl.c5) obj2);
                }
            }).gv(list.size(), list2.size()).a((c5) Collections.max(list, new Comparator() { // from class: n0.f3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return tl.c5.a((tl.c5) obj, (tl.c5) obj2);
                }
            }), (c5) Collections.max(list2, new Comparator() { // from class: n0.f3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return tl.c5.a((tl.c5) obj, (tl.c5) obj2);
                }
            }), new Comparator() { // from class: n0.f3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return tl.c5.a((tl.c5) obj, (tl.c5) obj2);
                }
            }).c5();
        }

        public static k4.r<c5> s(int i, rs rsVar, gv gvVar, int[] iArr, int i5) {
            int iA8 = tl.a8(rsVar, gvVar.f6872co, gvVar.z, gvVar.f6880r);
            r.y yVarN = k4.r.n();
            for (int i8 = 0; i8 < rsVar.y; i8++) {
                int iA = rsVar.zn(i8).a();
                yVarN.y(new c5(i, rsVar, i8, gvVar, iArr[i8], i5, iA8 == Integer.MAX_VALUE || (iA != -1 && iA <= iA8)));
            }
            return yVarN.f();
        }

        public static int v(c5 c5Var, c5 c5Var2) {
            k4.wz wzVarFb = k4.wz.i9().fb(c5Var.f6772p, c5Var2.f6772p).gv(c5Var.f3, c5Var2.f3).fb(c5Var.n, c5Var2.n).fb(c5Var.f6771f, c5Var2.f6771f).fb(c5Var.w, c5Var2.w).a(Integer.valueOf(c5Var.f6773r), Integer.valueOf(c5Var2.f6773r), k5.gv().p()).fb(c5Var.fh, c5Var2.fh).fb(c5Var.f6769d, c5Var2.f6769d);
            if (c5Var.fh && c5Var.f6769d) {
                wzVarFb = wzVarFb.gv(c5Var.f6770ej, c5Var2.f6770ej);
            }
            return wzVarFb.c5();
        }

        public final int c5(int i, int i5) {
            if ((this.f6827s.f4781f & 16384) != 0 || !tl.j5(i, this.f6774t.f6804qk)) {
                return 0;
            }
            if (!this.f6771f && !this.f6774t.y4) {
                return 0;
            }
            if (tl.j5(i, false) && this.w && this.f6771f && this.f6827s.f4786p != -1) {
                gv gvVar = this.f6774t;
                if (!gvVar.o && !gvVar.qn && (i & i5) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // n0.tl.s
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public boolean n3(c5 c5Var) {
            return (this.c || ut.zn(this.f6827s.f3, c5Var.f6827s.f3)) && (this.f6774t.pq || (this.fh == c5Var.fh && this.f6769d == c5Var.f6769d));
        }

        @Override // n0.tl.s
        public int y() {
            return this.d0;
        }
    }

    public static final class fb extends s<fb> implements Comparable<fb> {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public final int f6775co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6776f;
        public final int f3;
        public final boolean n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f6777p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f6778r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f6779t;
        public final boolean w;
        public final int z;

        public fb(int i, rs rsVar, int i5, gv gvVar, int i8, @Nullable String str) {
            int iUd;
            super(i, rsVar, i5);
            int i10 = 0;
            this.f6779t = tl.j5(i8, false);
            int i11 = this.f6827s.f4788s & (~gvVar.f6877hw);
            this.w = (i11 & 1) != 0;
            this.f6777p = (i11 & 2) != 0;
            k4.r<String> rVarJ = gvVar.f6884x.isEmpty() ? k4.r.j(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING) : gvVar.f6884x;
            int i12 = 0;
            while (true) {
                if (i12 >= rVarJ.size()) {
                    i12 = Reader.READ_DONE;
                    iUd = 0;
                    break;
                } else {
                    iUd = tl.ud(this.f6827s, rVarJ.get(i12), gvVar.f6878j5);
                    if (iUd > 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f6775co = i12;
            this.z = iUd;
            int iK5 = tl.k5(this.f6827s.f4781f, gvVar.f6871b);
            this.f6778r = iK5;
            this.n = (this.f6827s.f4781f & 1088) != 0;
            int iUd2 = tl.ud(this.f6827s, str, tl.f7(str) == null);
            this.f3 = iUd2;
            boolean z = iUd > 0 || (gvVar.f6884x.isEmpty() && iK5 > 0) || this.w || (this.f6777p && iUd2 > 0);
            if (tl.j5(i8, gvVar.f6804qk) && z) {
                i10 = 1;
            }
            this.f6776f = i10;
        }

        public static k4.r<fb> v(int i, rs rsVar, gv gvVar, int[] iArr, @Nullable String str) {
            r.y yVarN = k4.r.n();
            for (int i5 = 0; i5 < rsVar.y; i5++) {
                yVarN.y(new fb(i, rsVar, i5, gvVar, iArr[i5], str));
            }
            return yVarN.f();
        }

        public static int zn(List<fb> list, List<fb> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        @Override // n0.tl.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean n3(fb fbVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public int compareTo(fb fbVar) {
            k4.wz wzVarGv = k4.wz.i9().fb(this.f6779t, fbVar.f6779t).a(Integer.valueOf(this.f6775co), Integer.valueOf(fbVar.f6775co), k5.gv().p()).gv(this.z, fbVar.z).gv(this.f6778r, fbVar.f6778r).fb(this.w, fbVar.w).a(Boolean.valueOf(this.f6777p), Boolean.valueOf(fbVar.f6777p), this.z == 0 ? k5.gv() : k5.gv().p()).gv(this.f3, fbVar.f3);
            if (this.f6778r == 0) {
                wzVarGv = wzVarGv.s(this.n, fbVar.n);
            }
            return wzVarGv.c5();
        }

        @Override // n0.tl.s
        public int y() {
            return this.f6776f;
        }
    }

    public static final class gv extends z6 implements ft.s {

        /* JADX INFO: renamed from: cs, reason: collision with root package name */
        public static final String f6780cs;

        /* JADX INFO: renamed from: gf, reason: collision with root package name */
        public static final s.y<gv> f6781gf;

        /* JADX INFO: renamed from: i2, reason: collision with root package name */
        public static final String f6782i2;

        /* JADX INFO: renamed from: i3, reason: collision with root package name */
        public static final String f6783i3;

        /* JADX INFO: renamed from: ix, reason: collision with root package name */
        public static final String f6784ix;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        public static final String f6785j3;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public static final String f6786le;

        /* JADX INFO: renamed from: mp, reason: collision with root package name */
        public static final String f6787mp;

        /* JADX INFO: renamed from: nd, reason: collision with root package name */
        public static final String f6788nd;

        /* JADX INFO: renamed from: ne, reason: collision with root package name */
        public static final String f6789ne;
        public static final gv oa;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f6790q;

        /* JADX INFO: renamed from: q5, reason: collision with root package name */
        public static final String f6791q5;

        /* JADX INFO: renamed from: ro, reason: collision with root package name */
        public static final String f6792ro;

        /* JADX INFO: renamed from: vn, reason: collision with root package name */
        public static final String f6793vn;

        /* JADX INFO: renamed from: w2, reason: collision with root package name */
        public static final String f6794w2;

        /* JADX INFO: renamed from: w9, reason: collision with root package name */
        @Deprecated
        public static final gv f6795w9;

        /* JADX INFO: renamed from: wm, reason: collision with root package name */
        public static final String f6796wm;
        public static final String x5;

        /* JADX INFO: renamed from: yk, reason: collision with root package name */
        public static final String f6797yk;

        /* JADX INFO: renamed from: ad, reason: collision with root package name */
        public final boolean f6798ad;

        /* JADX INFO: renamed from: cr, reason: collision with root package name */
        public final boolean f6799cr;
        public final boolean cy;

        /* JADX INFO: renamed from: gq, reason: collision with root package name */
        public final SparseArray<Map<lc, v>> f6800gq;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f6801l;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public final boolean f6802o0;
        public final boolean pq;
        public final boolean pz;

        /* JADX INFO: renamed from: qj, reason: collision with root package name */
        public final boolean f6803qj;

        /* JADX INFO: renamed from: qk, reason: collision with root package name */
        public final boolean f6804qk;
        public final boolean tg;
        public final SparseBooleanArray vp;
        public final boolean wf;
        public final boolean xb;
        public final boolean y4;

        static {
            gv gvVarD0 = new y().d0();
            oa = gvVarD0;
            f6795w9 = gvVarD0;
            f6794w2 = ut.g3(1000);
            x5 = ut.g3(1001);
            f6791q5 = ut.g3(1002);
            f6787mp = ut.g3(1003);
            f6786le = ut.g3(1004);
            f6780cs = ut.g3(1005);
            f6792ro = ut.g3(1006);
            f6784ix = ut.g3(1007);
            f6797yk = ut.g3(1008);
            f6782i2 = ut.g3(1009);
            f6783i3 = ut.g3(1010);
            f6793vn = ut.g3(1011);
            f6785j3 = ut.g3(1012);
            f6789ne = ut.g3(1013);
            f6790q = ut.g3(1014);
            f6796wm = ut.g3(1015);
            f6788nd = ut.g3(1016);
            f6781gf = new s.y() { // from class: n0.wz
                @Override // ft.s.y
                public final ft.s fromBundle(Bundle bundle) {
                    return tl.gv.vl(bundle);
                }
            };
        }

        public static gv a8(Context context) {
            return new y(context).d0();
        }

        public static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean ej(Map<lc, v> map, Map<lc, v> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<lc, v> entry : map.entrySet()) {
                lc key = entry.getKey();
                if (!map2.containsKey(key) || !ut.zn(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static void hw(Bundle bundle, SparseArray<Map<lc, v>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                for (Map.Entry<lc, v> entry : sparseArray.valueAt(i).entrySet()) {
                    v value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(f6783i3, n4.a.wz(arrayList));
                bundle.putParcelableArrayList(f6793vn, v0.gv.gv(arrayList2));
                bundle.putSparseParcelableArray(f6785j3, v0.gv.v(sparseArray2));
            }
        }

        public static /* synthetic */ gv vl(Bundle bundle) {
            return new y(bundle).d0();
        }

        public static int[] x(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        public static boolean z6(SparseArray<Map<lc, v>> sparseArray, SparseArray<Map<lc, v>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !ej(sparseArray.valueAt(i), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public boolean b(int i) {
            return this.vp.get(i);
        }

        @Override // n0.z6
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || gv.class != obj.getClass()) {
                return false;
            }
            gv gvVar = (gv) obj;
            return super.equals(gvVar) && this.y4 == gvVar.y4 && this.tg == gvVar.tg && this.pz == gvVar.pz && this.pq == gvVar.pq && this.f6799cr == gvVar.f6799cr && this.f6802o0 == gvVar.f6802o0 && this.xb == gvVar.xb && this.wf == gvVar.wf && this.f6798ad == gvVar.f6798ad && this.cy == gvVar.cy && this.f6804qk == gvVar.f6804qk && this.f6803qj == gvVar.f6803qj && this.f6801l == gvVar.f6801l && d(this.vp, gvVar.vp) && z6(this.f6800gq, gvVar.f6800gq);
        }

        @Override // n0.z6
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.y4 ? 1 : 0)) * 31) + (this.tg ? 1 : 0)) * 31) + (this.pz ? 1 : 0)) * 31) + (this.pq ? 1 : 0)) * 31) + (this.f6799cr ? 1 : 0)) * 31) + (this.f6802o0 ? 1 : 0)) * 31) + (this.xb ? 1 : 0)) * 31) + (this.wf ? 1 : 0)) * 31) + (this.f6798ad ? 1 : 0)) * 31) + (this.cy ? 1 : 0)) * 31) + (this.f6804qk ? 1 : 0)) * 31) + (this.f6803qj ? 1 : 0)) * 31) + (this.f6801l ? 1 : 0);
        }

        @Nullable
        @Deprecated
        public v k5(int i, lc lcVar) {
            Map<lc, v> map = this.f6800gq.get(i);
            if (map != null) {
                return map.get(lcVar);
            }
            return null;
        }

        @Override // n0.z6, ft.s
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(f6794w2, this.y4);
            bundle.putBoolean(x5, this.tg);
            bundle.putBoolean(f6791q5, this.pz);
            bundle.putBoolean(f6790q, this.pq);
            bundle.putBoolean(f6787mp, this.f6799cr);
            bundle.putBoolean(f6786le, this.f6802o0);
            bundle.putBoolean(f6780cs, this.xb);
            bundle.putBoolean(f6792ro, this.wf);
            bundle.putBoolean(f6796wm, this.f6798ad);
            bundle.putBoolean(f6788nd, this.cy);
            bundle.putBoolean(f6784ix, this.f6804qk);
            bundle.putBoolean(f6797yk, this.f6803qj);
            bundle.putBoolean(f6782i2, this.f6801l);
            hw(bundle, this.f6800gq);
            bundle.putIntArray(f6789ne, x(this.vp));
            return bundle;
        }

        @Override // n0.z6
        /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
        public y d0() {
            return new y();
        }

        @Deprecated
        public boolean yt(int i, lc lcVar) {
            Map<lc, v> map = this.f6800gq.get(i);
            return map != null && map.containsKey(lcVar);
        }

        public static final class y extends z6.y {

            /* JADX INFO: renamed from: a8, reason: collision with root package name */
            public boolean f6805a8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f6806b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f6807d;
            public boolean d0;

            /* JADX INFO: renamed from: ej, reason: collision with root package name */
            public boolean f6808ej;
            public boolean fh;

            /* JADX INFO: renamed from: k5, reason: collision with root package name */
            public boolean f6809k5;
            public boolean mg;
            public boolean rz;

            /* JADX INFO: renamed from: ta, reason: collision with root package name */
            public boolean f6810ta;

            /* JADX INFO: renamed from: ud, reason: collision with root package name */
            public boolean f6811ud;
            public final SparseBooleanArray vl;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public boolean f6812x;

            /* JADX INFO: renamed from: yt, reason: collision with root package name */
            public final SparseArray<Map<lc, v>> f6813yt;

            /* JADX INFO: renamed from: z6, reason: collision with root package name */
            public boolean f6814z6;

            public static SparseArray<Map<lc, v>> rs(SparseArray<Map<lc, v>> sparseArray) {
                SparseArray<Map<lc, v>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            @Override // n0.z6.y
            /* JADX INFO: renamed from: ad, reason: merged with bridge method [inline-methods] */
            public y vl(String... strArr) {
                super.vl(strArr);
                return this;
            }

            public y ap(boolean z) {
                this.f6814z6 = z;
                return this;
            }

            public y bk(boolean z) {
                this.d0 = z;
                return this;
            }

            public y cr(@Nullable String str) {
                super.a8(str);
                return this;
            }

            public y cy(int i, boolean z) {
                if (this.vl.get(i) == z) {
                    return this;
                }
                if (z) {
                    this.vl.put(i, true);
                } else {
                    this.vl.delete(i);
                }
                return this;
            }

            public y e(boolean z) {
                this.f6811ud = z;
                return this;
            }

            public final void eb() {
                this.d0 = true;
                this.fh = false;
                this.rz = true;
                this.mg = false;
                this.f6810ta = true;
                this.f6807d = false;
                this.f6814z6 = false;
                this.f6808ej = false;
                this.f6811ud = false;
                this.f6805a8 = true;
                this.f6812x = true;
                this.f6806b = false;
                this.f6809k5 = true;
            }

            public y g(boolean z) {
                this.f6810ta = z;
                return this;
            }

            public y g3(boolean z) {
                this.f6805a8 = z;
                return this;
            }

            @Override // n0.z6.y
            /* JADX INFO: renamed from: gq, reason: merged with bridge method [inline-methods] */
            public y hw(int i, int i5, boolean z) {
                super.hw(i, i5, z);
                return this;
            }

            public y kp(boolean z) {
                this.fh = z;
                return this;
            }

            public y l(boolean z) {
                this.f6806b = z;
                return this;
            }

            public final SparseBooleanArray lc(@Nullable int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }

            @Deprecated
            public y m(Set<Integer> set) {
                super.ta(set);
                return this;
            }

            public y nf(z6 z6Var) {
                super.mg(z6Var);
                return this;
            }

            @Override // n0.z6.y
            /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
            public y x(String... strArr) {
                super.x(strArr);
                return this;
            }

            @Override // n0.z6.y
            /* JADX INFO: renamed from: o4, reason: merged with bridge method [inline-methods] */
            public gv d0() {
                return new gv(this);
            }

            public y pq(int i, int i5) {
                super.ud(i, i5);
                return this;
            }

            public y pz(int i) {
                super.ej(i);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void qj(Bundle bundle) {
                int[] intArray = bundle.getIntArray(gv.f6783i3);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(gv.f6793vn);
                k4.r rVarYt = parcelableArrayList == null ? k4.r.yt() : v0.gv.n3(lc.f8605t, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(gv.f6785j3);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : v0.gv.zn(v.f6830p, sparseParcelableArray);
                if (intArray == null || intArray.length != rVarYt.size()) {
                    return;
                }
                for (int i = 0; i < intArray.length; i++) {
                    qk(intArray[i], (lc) rVarYt.get(i), (v) sparseArray.get(i));
                }
            }

            @Deprecated
            public y qk(int i, lc lcVar, @Nullable v vVar) {
                Map<lc, v> map = this.f6813yt.get(i);
                if (map == null) {
                    map = new HashMap<>();
                    this.f6813yt.put(i, map);
                }
                if (map.containsKey(lcVar) && ut.zn(map.get(lcVar), vVar)) {
                    return this;
                }
                map.put(lcVar, vVar);
                return this;
            }

            public y ra(boolean z) {
                this.f6808ej = z;
                return this;
            }

            public y rb(boolean z) {
                this.rz = z;
                return this;
            }

            public y s8(boolean z) {
                this.f6807d = z;
                return this;
            }

            public y tg(int i) {
                super.z6(i);
                return this;
            }

            public y u0(boolean z) {
                this.f6812x = z;
                return this;
            }

            @Override // n0.z6.y
            /* JADX INFO: renamed from: vp, reason: merged with bridge method [inline-methods] */
            public y j5(Context context, boolean z) {
                super.j5(context, z);
                return this;
            }

            public y wf(@Nullable String str) {
                super.yt(str);
                return this;
            }

            @Override // n0.z6.y
            /* JADX INFO: renamed from: xb, reason: merged with bridge method [inline-methods] */
            public y b(Context context) {
                super.b(context);
                return this;
            }

            public y y4(int i) {
                super.d(i);
                return this;
            }

            public y yc(boolean z) {
                this.mg = z;
                return this;
            }

            public y yg(boolean z) {
                this.f6809k5 = z;
                return this;
            }

            @Deprecated
            public y() {
                this.f6813yt = new SparseArray<>();
                this.vl = new SparseBooleanArray();
                eb();
            }

            public y(Context context) {
                super(context);
                this.f6813yt = new SparseArray<>();
                this.vl = new SparseBooleanArray();
                eb();
            }

            public y(gv gvVar) {
                super(gvVar);
                this.d0 = gvVar.y4;
                this.fh = gvVar.tg;
                this.rz = gvVar.pz;
                this.mg = gvVar.pq;
                this.f6810ta = gvVar.f6799cr;
                this.f6807d = gvVar.f6802o0;
                this.f6814z6 = gvVar.xb;
                this.f6808ej = gvVar.wf;
                this.f6811ud = gvVar.f6798ad;
                this.f6805a8 = gvVar.cy;
                this.f6812x = gvVar.f6804qk;
                this.f6806b = gvVar.f6803qj;
                this.f6809k5 = gvVar.f6801l;
                this.f6813yt = rs(gvVar.f6800gq);
                this.vl = gvVar.vp.clone();
            }

            public y(Bundle bundle) {
                super(bundle);
                eb();
                gv gvVar = gv.oa;
                bk(bundle.getBoolean(gv.f6794w2, gvVar.y4));
                kp(bundle.getBoolean(gv.x5, gvVar.tg));
                rb(bundle.getBoolean(gv.f6791q5, gvVar.pz));
                yc(bundle.getBoolean(gv.f6790q, gvVar.pq));
                g(bundle.getBoolean(gv.f6787mp, gvVar.f6799cr));
                s8(bundle.getBoolean(gv.f6786le, gvVar.f6802o0));
                ap(bundle.getBoolean(gv.f6780cs, gvVar.xb));
                ra(bundle.getBoolean(gv.f6792ro, gvVar.wf));
                e(bundle.getBoolean(gv.f6796wm, gvVar.f6798ad));
                g3(bundle.getBoolean(gv.f6788nd, gvVar.cy));
                u0(bundle.getBoolean(gv.f6784ix, gvVar.f6804qk));
                l(bundle.getBoolean(gv.f6797yk, gvVar.f6803qj));
                yg(bundle.getBoolean(gv.f6782i2, gvVar.f6801l));
                this.f6813yt = new SparseArray<>();
                qj(bundle);
                this.vl = lc(bundle.getIntArray(gv.f6789ne));
            }
        }

        public gv(y yVar) {
            super(yVar);
            this.y4 = yVar.d0;
            this.tg = yVar.fh;
            this.pz = yVar.rz;
            this.pq = yVar.mg;
            this.f6799cr = yVar.f6810ta;
            this.f6802o0 = yVar.f6807d;
            this.xb = yVar.f6814z6;
            this.wf = yVar.f6808ej;
            this.f6798ad = yVar.f6811ud;
            this.cy = yVar.f6805a8;
            this.f6804qk = yVar.f6812x;
            this.f6803qj = yVar.f6806b;
            this.f6801l = yVar.f6809k5;
            this.f6800gq = yVar.f6813yt;
            this.vp = yVar.vl;
        }
    }

    public static final class n3 extends s<n3> implements Comparable<n3> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6815b;
        public final int c;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public final boolean f6816co;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6817d;
        public final int d0;

        /* JADX INFO: renamed from: ej, reason: collision with root package name */
        public final int f6818ej;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6819f;
        public final int f3;
        public final boolean fh;

        /* JADX INFO: renamed from: hw, reason: collision with root package name */
        public final boolean f6820hw;

        /* JADX INFO: renamed from: j5, reason: collision with root package name */
        public final boolean f6821j5;
        public final boolean n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final gv f6822p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f6823r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f6824t;

        @Nullable
        public final String w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final int f6825x;
        public final int z;

        public n3(int i, rs rsVar, int i5, gv gvVar, int i8, boolean z, g4.w<g> wVar) {
            int i10;
            int iUd;
            int iUd2;
            super(i, rsVar, i5);
            this.f6822p = gvVar;
            this.w = tl.f7(this.f6827s.f4782fb);
            this.f6816co = tl.j5(i8, false);
            int i11 = 0;
            while (true) {
                int size = gvVar.c.size();
                i10 = Reader.READ_DONE;
                if (i11 >= size) {
                    i11 = Reader.READ_DONE;
                    iUd = 0;
                    break;
                } else {
                    iUd = tl.ud(this.f6827s, gvVar.c.get(i11), false);
                    if (iUd > 0) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f6823r = i11;
            this.z = iUd;
            this.f3 = tl.k5(this.f6827s.f4781f, gvVar.d0);
            g gVar = this.f6827s;
            int i12 = gVar.f4781f;
            this.n = i12 == 0 || (i12 & 1) != 0;
            this.fh = (gVar.f4788s & 1) != 0;
            int i13 = gVar.j;
            this.f6817d = i13;
            this.f6818ej = gVar.oz;
            int i14 = gVar.f4786p;
            this.f6825x = i14;
            this.f6824t = (i14 == -1 || i14 <= gvVar.f6873d) && (i13 == -1 || i13 <= gvVar.fh) && wVar.apply(gVar);
            String[] strArrLc = ut.lc();
            int i15 = 0;
            while (true) {
                if (i15 >= strArrLc.length) {
                    i15 = Reader.READ_DONE;
                    iUd2 = 0;
                    break;
                } else {
                    iUd2 = tl.ud(this.f6827s, strArrLc[i15], false);
                    if (iUd2 > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.c = i15;
            this.d0 = iUd2;
            int i16 = 0;
            while (true) {
                if (i16 < gvVar.f6874ej.size()) {
                    String str = this.f6827s.f3;
                    if (str != null && str.equals(gvVar.f6874ej.get(i16))) {
                        i10 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            this.f6815b = i10;
            this.f6820hw = k3.v(i8) == 128;
            this.f6821j5 = k3.fb(i8) == 64;
            this.f6819f = a(i8, z);
        }

        public static k4.r<n3> v(int i, rs rsVar, gv gvVar, int[] iArr, boolean z, g4.w<g> wVar) {
            r.y yVarN = k4.r.n();
            for (int i5 = 0; i5 < rsVar.y; i5++) {
                yVarN.y(new n3(i, rsVar, i5, gvVar, iArr[i5], z, wVar));
            }
            return yVarN.f();
        }

        public static int zn(List<n3> list, List<n3> list2) {
            return ((n3) Collections.max(list)).compareTo((n3) Collections.max(list2));
        }

        public final int a(int i, boolean z) {
            if (!tl.j5(i, this.f6822p.f6804qk)) {
                return 0;
            }
            if (!this.f6824t && !this.f6822p.f6799cr) {
                return 0;
            }
            if (tl.j5(i, false) && this.f6824t && this.f6827s.f4786p != -1) {
                gv gvVar = this.f6822p;
                if (!gvVar.o && !gvVar.qn && (gvVar.f6801l || !z)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // n0.tl.s
        /* JADX INFO: renamed from: fb, reason: merged with bridge method [inline-methods] */
        public boolean n3(n3 n3Var) {
            int i;
            String str;
            int i5;
            gv gvVar = this.f6822p;
            if ((gvVar.wf || ((i5 = this.f6827s.j) != -1 && i5 == n3Var.f6827s.j)) && (gvVar.f6802o0 || ((str = this.f6827s.f3) != null && TextUtils.equals(str, n3Var.f6827s.f3)))) {
                gv gvVar2 = this.f6822p;
                if ((gvVar2.xb || ((i = this.f6827s.oz) != -1 && i == n3Var.f6827s.oz)) && (gvVar2.f6798ad || (this.f6820hw == n3Var.f6820hw && this.f6821j5 == n3Var.f6821j5))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public int compareTo(n3 n3Var) {
            k5 k5VarP = (this.f6824t && this.f6816co) ? tl.f6758f : tl.f6758f.p();
            k4.wz wzVarA = k4.wz.i9().fb(this.f6816co, n3Var.f6816co).a(Integer.valueOf(this.f6823r), Integer.valueOf(n3Var.f6823r), k5.gv().p()).gv(this.z, n3Var.z).gv(this.f3, n3Var.f3).fb(this.fh, n3Var.fh).fb(this.n, n3Var.n).a(Integer.valueOf(this.c), Integer.valueOf(n3Var.c), k5.gv().p()).gv(this.d0, n3Var.d0).fb(this.f6824t, n3Var.f6824t).a(Integer.valueOf(this.f6815b), Integer.valueOf(n3Var.f6815b), k5.gv().p()).a(Integer.valueOf(this.f6825x), Integer.valueOf(n3Var.f6825x), this.f6822p.qn ? tl.f6758f.p() : tl.f6759t).fb(this.f6820hw, n3Var.f6820hw).fb(this.f6821j5, n3Var.f6821j5).a(Integer.valueOf(this.f6817d), Integer.valueOf(n3Var.f6817d), k5VarP).a(Integer.valueOf(this.f6818ej), Integer.valueOf(n3Var.f6818ej), k5VarP);
            Integer numValueOf = Integer.valueOf(this.f6825x);
            Integer numValueOf2 = Integer.valueOf(n3Var.f6825x);
            if (!ut.zn(this.w, n3Var.w)) {
                k5VarP = tl.f6759t;
            }
            return wzVarA.a(numValueOf, numValueOf2, k5VarP).c5();
        }

        @Override // n0.tl.s
        public int y() {
            return this.f6819f;
        }
    }

    public static abstract class s<T extends s<T>> {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f6826fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final g f6827s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final rs f6828v;
        public final int y;

        public interface y<T extends s<T>> {
            List<T> y(int i, rs rsVar, int[] iArr);
        }

        public s(int i, rs rsVar, int i5) {
            this.y = i;
            this.f6828v = rsVar;
            this.f6826fb = i5;
            this.f6827s = rsVar.zn(i5);
        }

        public abstract boolean n3(T t3);

        public abstract int y();
    }

    public static final class v implements ft.s {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f6832fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f6833s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int[] f6834v;
        public final int y;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f6829f = ut.g3(0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f6831t = ut.g3(1);
        public static final String w = ut.g3(2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final s.y<v> f6830p = new s.y() { // from class: n0.xc
            @Override // ft.s.y
            public final ft.s fromBundle(Bundle bundle) {
                return tl.v.n3(bundle);
            }
        };

        public v(int i, int... iArr) {
            this(i, iArr, 0);
        }

        public static /* synthetic */ v n3(Bundle bundle) {
            int i = bundle.getInt(f6829f, -1);
            int[] intArray = bundle.getIntArray(f6831t);
            int i5 = bundle.getInt(w, -1);
            v0.y.y(i >= 0 && i5 >= 0);
            v0.y.v(intArray);
            return new v(i, intArray, i5);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || v.class != obj.getClass()) {
                return false;
            }
            v vVar = (v) obj;
            return this.y == vVar.y && Arrays.equals(this.f6834v, vVar.f6834v) && this.f6833s == vVar.f6833s;
        }

        public int hashCode() {
            return (((this.y * 31) + Arrays.hashCode(this.f6834v)) * 31) + this.f6833s;
        }

        @Override // ft.s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f6829f, this.y);
            bundle.putIntArray(f6831t, this.f6834v);
            bundle.putInt(w, this.f6833s);
            return bundle;
        }

        public v(int i, int[] iArr, int i5) {
            this.y = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f6834v = iArrCopyOf;
            this.f6832fb = iArr.length;
            this.f6833s = i5;
            Arrays.sort(iArrCopyOf);
        }
    }

    public static final class zn implements Comparable<zn> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f6835v;
        public final boolean y;

        public zn(g gVar, int i) {
            this.y = (gVar.f4788s & 1) != 0;
            this.f6835v = tl.j5(i, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int compareTo(zn znVar) {
            return k4.wz.i9().fb(this.f6835v, znVar.f6835v).fb(this.y, znVar.y).c5();
        }
    }

    public tl(Context context) {
        this(context, new y.n3());
    }

    public static int a8(rs rsVar, int i, int i5, boolean z) {
        int i8;
        int i10 = Reader.READ_DONE;
        if (i != Integer.MAX_VALUE && i5 != Integer.MAX_VALUE) {
            for (int i11 = 0; i11 < rsVar.y; i11++) {
                g gVarZn = rsVar.zn(i11);
                int i12 = gVarZn.f4779d;
                if (i12 > 0 && (i8 = gVarZn.f4780ej) > 0) {
                    Point pointX = x(z, i, i5, i12, i8);
                    int i13 = gVarZn.f4779d;
                    int i14 = gVarZn.f4780ej;
                    int i15 = i13 * i14;
                    if (i13 >= ((int) (pointX.x * 0.98f)) && i14 >= ((int) (pointX.y * 0.98f)) && i15 < i10) {
                        i10 = i15;
                    }
                }
            }
        }
        return i10;
    }

    public static void d(fh.y yVar, z6 z6Var, c.y[] yVarArr) {
        int iGv = yVar.gv();
        HashMap map = new HashMap();
        for (int i = 0; i < iGv; i++) {
            ej(yVar.a(i), z6Var, map);
        }
        ej(yVar.s(), z6Var, map);
        for (int i5 = 0; i5 < iGv; i5++) {
            ta taVar = (ta) map.get(Integer.valueOf(yVar.v(i5)));
            if (taVar != null) {
                yVarArr[i5] = (taVar.f6757v.isEmpty() || yVar.a(i5).zn(taVar.y) == -1) ? null : new c.y(taVar.y, n4.a.wz(taVar.f6757v));
            }
        }
    }

    public static void ej(lc lcVar, z6 z6Var, Map<Integer, ta> map) {
        ta taVar;
        for (int i = 0; i < lcVar.y; i++) {
            ta taVar2 = z6Var.j.get(lcVar.n3(i));
            if (taVar2 != null && ((taVar = map.get(Integer.valueOf(taVar2.n3()))) == null || (taVar.f6757v.isEmpty() && !taVar2.f6757v.isEmpty()))) {
                map.put(Integer.valueOf(taVar2.n3()), taVar2);
            }
        }
    }

    public static boolean en(int[][] iArr, lc lcVar, c cVar) {
        if (cVar == null) {
            return false;
        }
        int iZn = lcVar.zn(cVar.tl());
        for (int i = 0; i < cVar.length(); i++) {
            if (k3.s(iArr[iZn][cVar.a(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static String f7(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean hw(g gVar) {
        String str = gVar.f3;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    public static /* synthetic */ List j(gv gvVar, int[] iArr, int i, rs rsVar, int[] iArr2) {
        return c5.s(i, rsVar, gvVar, iArr2, iArr[i]);
    }

    public static boolean j5(int i, boolean z) {
        int iA = k3.a(i);
        return iA == 4 || (z && iA == 3);
    }

    public static int k5(int i, int i5) {
        return (i == 0 || i != i5) ? Integer.bitCount(i & i5) : Reader.READ_DONE;
    }

    public static /* synthetic */ List o(gv gvVar, String str, int i, rs rsVar, int[] iArr) {
        return fb.v(i, rsVar, gvVar, iArr, str);
    }

    public static /* synthetic */ int oz(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static void q9(fh.y yVar, int[][][] iArr, gn[] gnVarArr, c[] cVarArr) {
        boolean z;
        boolean z5 = false;
        int i = -1;
        int i5 = -1;
        for (int i8 = 0; i8 < yVar.gv(); i8++) {
            int iV = yVar.v(i8);
            c cVar = cVarArr[i8];
            if ((iV == 1 || iV == 2) && cVar != null && en(iArr[i8], yVar.a(i8), cVar)) {
                if (iV == 1) {
                    if (i5 != -1) {
                        z = false;
                        break;
                    }
                    i5 = i8;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i8;
                }
            }
        }
        z = true;
        if (i5 != -1 && i != -1) {
            z5 = true;
        }
        if (z && z5) {
            gn gnVar = new gn(true);
            gnVarArr[i5] = gnVar;
            gnVarArr[i] = gnVar;
        }
    }

    public static void ta(fh.y yVar, gv gvVar, c.y[] yVarArr) {
        int iGv = yVar.gv();
        for (int i = 0; i < iGv; i++) {
            lc lcVarA = yVar.a(i);
            if (gvVar.yt(i, lcVarA)) {
                v vVarK5 = gvVar.k5(i, lcVarA);
                yVarArr[i] = (vVarK5 == null || vVarK5.f6834v.length == 0) ? null : new c.y(lcVarA.n3(vVarK5.y), vVarK5.f6834v, vVarK5.f6833s);
            }
        }
    }

    public static int ud(g gVar, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(gVar.f4782fb)) {
            return 4;
        }
        String strF7 = f7(str);
        String strF72 = f7(gVar.f4782fb);
        if (strF72 == null || strF7 == null) {
            return (z && strF72 == null) ? 1 : 0;
        }
        if (strF72.startsWith(strF7) || strF7.startsWith(strF72)) {
            return 3;
        }
        return ut.ix(strF72, "-")[0].equals(ut.ix(strF7, "-")[0]) ? 2 : 0;
    }

    public static /* synthetic */ int ut(Integer num, Integer num2) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point x(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            r3 = 1
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = v0.ut.t(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = v0.ut.t(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.tl.x(boolean, int, int, int, int):android.graphics.Point");
    }

    public static int yt(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    @Override // n0.ud
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public gv v() {
        gv gvVar;
        synchronized (this.f6763gv) {
            gvVar = this.f6765s;
        }
        return gvVar;
    }

    @Nullable
    public Pair<c.y, Integer> ct(fh.y yVar, int[][][] iArr, final int[] iArr2, final gv gvVar) throws ft.p {
        return dm(2, yVar, iArr, new s.y() { // from class: n0.a
            @Override // n0.tl.s.y
            public final List y(int i, rs rsVar, int[] iArr3) {
                return tl.j(gvVar, iArr2, i, rsVar, iArr3);
            }
        }, new Comparator() { // from class: n0.fb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return tl.c5.fb((List) obj, (List) obj2);
            }
        });
    }

    @Nullable
    public final <T extends s<T>> Pair<c.y, Integer> dm(int i, fh.y yVar, int[][][] iArr, s.y<T> yVar2, Comparator<List<T>> comparator) {
        int i5;
        RandomAccess randomAccessJ;
        fh.y yVar3 = yVar;
        ArrayList arrayList = new ArrayList();
        int iGv = yVar.gv();
        int i8 = 0;
        while (i8 < iGv) {
            if (i == yVar3.v(i8)) {
                lc lcVarA = yVar3.a(i8);
                for (int i10 = 0; i10 < lcVarA.y; i10++) {
                    rs rsVarN3 = lcVarA.n3(i10);
                    List<T> listY = yVar2.y(i8, rsVarN3, iArr[i8][i10]);
                    boolean[] zArr = new boolean[rsVarN3.y];
                    int i11 = 0;
                    while (i11 < rsVarN3.y) {
                        T t3 = listY.get(i11);
                        int iY = t3.y();
                        if (zArr[i11] || iY == 0) {
                            i5 = iGv;
                        } else {
                            if (iY == 1) {
                                randomAccessJ = k4.r.j(t3);
                                i5 = iGv;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t3);
                                int i12 = i11 + 1;
                                while (i12 < rsVarN3.y) {
                                    T t5 = listY.get(i12);
                                    int i13 = iGv;
                                    if (t5.y() == 2 && t3.n3(t5)) {
                                        arrayList2.add(t5);
                                        zArr[i12] = true;
                                    }
                                    i12++;
                                    iGv = i13;
                                }
                                i5 = iGv;
                                randomAccessJ = arrayList2;
                            }
                            arrayList.add(randomAccessJ);
                        }
                        i11++;
                        iGv = i5;
                    }
                }
            }
            i8++;
            yVar3 = yVar;
            iGv = iGv;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            iArr2[i14] = ((s) list.get(i14)).f6826fb;
        }
        s sVar = (s) list.get(0);
        return Pair.create(new c.y(sVar.f6828v, iArr2), Integer.valueOf(sVar.y));
    }

    @Override // n0.ud
    public void i9() {
        a aVar;
        synchronized (this.f6763gv) {
            try {
                if (ut.y >= 32 && (aVar = this.f6761c5) != null) {
                    aVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.i9();
    }

    public c.y[] jz(fh.y yVar, int[][][] iArr, int[] iArr2, gv gvVar) throws ft.p {
        String str;
        int iGv = yVar.gv();
        c.y[] yVarArr = new c.y[iGv];
        Pair<c.y, Integer> pairCt = ct(yVar, iArr, iArr2, gvVar);
        if (pairCt != null) {
            yVarArr[((Integer) pairCt.second).intValue()] = (c.y) pairCt.first;
        }
        Pair<c.y, Integer> pairU = u(yVar, iArr, iArr2, gvVar);
        if (pairU != null) {
            yVarArr[((Integer) pairU.second).intValue()] = (c.y) pairU.first;
        }
        if (pairU == null) {
            str = null;
        } else {
            Object obj = pairU.first;
            str = ((c.y) obj).y.zn(((c.y) obj).n3[0]).f4782fb;
        }
        Pair<c.y, Integer> pairXg = xg(yVar, iArr, gvVar, str);
        if (pairXg != null) {
            yVarArr[((Integer) pairXg.second).intValue()] = (c.y) pairXg.first;
        }
        for (int i = 0; i < iGv; i++) {
            int iV = yVar.v(i);
            if (iV != 2 && iV != 1 && iV != 3) {
                yVarArr[i] = y5(iV, yVar.a(i), iArr[i], gvVar);
            }
        }
        return yVarArr;
    }

    public final void k() {
        boolean z;
        a aVar;
        synchronized (this.f6763gv) {
            try {
                z = this.f6765s.cy && !this.f6762fb && ut.y >= 32 && (aVar = this.f6761c5) != null && aVar.v();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            fb();
        }
    }

    @Override // n0.fh
    public final Pair<gn[], c[]> mt(fh.y yVar, int[][][] iArr, int[] iArr2, mg.n3 n3Var, xq xqVar) throws ft.p {
        gv gvVar;
        a aVar;
        synchronized (this.f6763gv) {
            try {
                gvVar = this.f6765s;
                if (gvVar.cy && ut.y >= 32 && (aVar = this.f6761c5) != null) {
                    aVar.n3(this, (Looper) v0.y.c5(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int iGv = yVar.gv();
        c.y[] yVarArrJz = jz(yVar, iArr, iArr2, gvVar);
        d(yVar, gvVar, yVarArrJz);
        ta(yVar, gvVar, yVarArrJz);
        for (int i = 0; i < iGv; i++) {
            int iV = yVar.v(i);
            if (gvVar.b(i) || gvVar.oz.contains(Integer.valueOf(iV))) {
                yVarArrJz[i] = null;
            }
        }
        c[] cVarArrY = this.f6760a.y(yVarArrJz, gv(), n3Var, xqVar);
        gn[] gnVarArr = new gn[iGv];
        for (int i5 = 0; i5 < iGv; i5++) {
            gnVarArr[i5] = (gvVar.b(i5) || gvVar.oz.contains(Integer.valueOf(yVar.v(i5))) || (yVar.v(i5) != -2 && cVarArrY[i5] == null)) ? null : gn.n3;
        }
        if (gvVar.f6803qj) {
            q9(yVar, iArr, gnVarArr, cVarArrY);
        }
        return Pair.create(gnVarArr, cVarArrY);
    }

    public void o4(gv.y yVar) {
        rs(yVar.d0());
    }

    public final /* synthetic */ List qn(gv gvVar, boolean z, int i, rs rsVar, int[] iArr) {
        return n3.v(i, rsVar, gvVar, iArr, z, new g4.w() { // from class: n0.t
            @Override // g4.w
            public final boolean apply(Object obj) {
                return this.y.vl((g) obj);
            }
        });
    }

    public final void rs(gv gvVar) {
        boolean zEquals;
        v0.y.v(gvVar);
        synchronized (this.f6763gv) {
            zEquals = this.f6765s.equals(gvVar);
            this.f6765s = gvVar;
        }
        if (zEquals) {
            return;
        }
        if (gvVar.cy && this.f6766v == null) {
            v0.r.c5("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        fb();
    }

    @Override // n0.ud
    public boolean s() {
        return true;
    }

    @Override // n0.ud
    public void t(mn.v vVar) {
        boolean zEquals;
        synchronized (this.f6763gv) {
            zEquals = this.f6764i9.equals(vVar);
            this.f6764i9 = vVar;
        }
        if (zEquals) {
            return;
        }
        k();
    }

    @Override // n0.ud
    public void tl(z6 z6Var) {
        if (z6Var instanceof gv) {
            rs((gv) z6Var);
        }
        rs(new gv.y().nf(z6Var).d0());
    }

    @Nullable
    public Pair<c.y, Integer> u(fh.y yVar, int[][][] iArr, int[] iArr2, final gv gvVar) throws ft.p {
        final boolean z = false;
        int i = 0;
        while (true) {
            if (i < yVar.gv()) {
                if (2 == yVar.v(i) && yVar.a(i).y > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return dm(1, yVar, iArr, new s.y() { // from class: n0.s
            @Override // n0.tl.s.y
            public final List y(int i5, rs rsVar, int[] iArr3) {
                return this.y.qn(gvVar, z, i5, rsVar, iArr3);
            }
        }, new Comparator() { // from class: n0.c5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return tl.n3.zn((List) obj, (List) obj2);
            }
        });
    }

    public final boolean vl(g gVar) {
        boolean z;
        a aVar;
        a aVar2;
        synchronized (this.f6763gv) {
            try {
                if (this.f6765s.cy && !this.f6762fb && gVar.j > 2 && (!hw(gVar) || (ut.y >= 32 && (aVar2 = this.f6761c5) != null && aVar2.v()))) {
                    z = ut.y >= 32 && (aVar = this.f6761c5) != null && aVar.v() && this.f6761c5.zn() && this.f6761c5.gv() && this.f6761c5.y(this.f6764i9, gVar);
                }
            } finally {
            }
        }
        return z;
    }

    @Nullable
    public Pair<c.y, Integer> xg(fh.y yVar, int[][][] iArr, final gv gvVar, @Nullable final String str) throws ft.p {
        return dm(3, yVar, iArr, new s.y() { // from class: n0.i9
            @Override // n0.tl.s.y
            public final List y(int i, rs rsVar, int[] iArr2) {
                return tl.o(gvVar, str, i, rsVar, iArr2);
            }
        }, new Comparator() { // from class: n0.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return tl.fb.zn((List) obj, (List) obj2);
            }
        });
    }

    @Nullable
    public c.y y5(int i, lc lcVar, int[][] iArr, gv gvVar) throws ft.p {
        rs rsVar = null;
        zn znVar = null;
        int i5 = 0;
        for (int i8 = 0; i8 < lcVar.y; i8++) {
            rs rsVarN3 = lcVar.n3(i8);
            int[] iArr2 = iArr[i8];
            for (int i10 = 0; i10 < rsVarN3.y; i10++) {
                if (j5(iArr2[i10], gvVar.f6804qk)) {
                    zn znVar2 = new zn(rsVarN3.zn(i10), iArr2[i10]);
                    if (znVar == null || znVar2.compareTo(znVar) > 0) {
                        rsVar = rsVarN3;
                        i5 = i10;
                        znVar = znVar2;
                    }
                }
            }
        }
        if (rsVar == null) {
            return null;
        }
        return new c.y(rsVar, i5);
    }

    public gv.y z6() {
        return v().d0();
    }

    public tl(Context context, c.n3 n3Var) {
        this(context, gv.a8(context), n3Var);
    }

    public tl(Context context, z6 z6Var) {
        this(context, z6Var, new y.n3());
    }

    @Deprecated
    public tl(z6 z6Var, c.n3 n3Var) {
        this(z6Var, n3Var, (Context) null);
    }

    public tl(Context context, z6 z6Var, c.n3 n3Var) {
        this(z6Var, n3Var, context);
    }

    public tl(z6 z6Var, c.n3 n3Var, @Nullable Context context) {
        this.f6763gv = new Object();
        this.f6766v = context != null ? context.getApplicationContext() : null;
        this.f6760a = n3Var;
        if (z6Var instanceof gv) {
            this.f6765s = (gv) z6Var;
        } else {
            this.f6765s = (context == null ? gv.oa : gv.a8(context)).d0().nf(z6Var).d0();
        }
        this.f6764i9 = mn.v.w;
        boolean z = context != null && ut.tg(context);
        this.f6762fb = z;
        if (!z && context != null && ut.y >= 32) {
            this.f6761c5 = a.fb(context);
        }
        if (this.f6765s.cy && context == null) {
            v0.r.c5("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
