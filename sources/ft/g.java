package ft;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ft.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class g implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4777b;
    public final List<byte[]> c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public final String f4778co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4779d;

    @Nullable
    public final DrmInitData d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final int f4780ej;
    public final int en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4781f;

    @Nullable
    public final String f3;
    public final int f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final String f4782fb;
    public final long fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public final float f4783hw;
    public final int j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    @Nullable
    public final byte[] f4784j5;
    public final int jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4785k;
    public final int n;

    @Nullable
    public final w0.zn o;
    public final int oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4786p;
    public final int q9;
    public final int qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final String f4787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4788s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4789t;
    public final int u;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public final int f4790ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final String f4791v;
    public final int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f4792x;

    @Nullable
    public final String y;
    public int y5;

    @Nullable
    public final Metadata z;
    public static final g xg = new n3().z6();
    public static final String dm = v0.ut.g3(0);
    public static final String ct = v0.ut.g3(1);
    public static final String o4 = v0.ut.g3(2);
    public static final String rs = v0.ut.g3(3);

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public static final String f4761eb = v0.ut.g3(4);

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public static final String f4766lc = v0.ut.g3(5);

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public static final String f4768nf = v0.ut.g3(6);

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public static final String f4772ra = v0.ut.g3(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f4760e = v0.ut.g3(8);
    public static final String s8 = v0.ut.g3(9);

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public static final String f4757ap = v0.ut.g3(10);

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public static final String f4776yg = v0.ut.g3(11);

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public static final String f4775yc = v0.ut.g3(12);

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    public static final String f4764kp = v0.ut.g3(13);

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public static final String f4773rb = v0.ut.g3(14);

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final String f4763g3 = v0.ut.g3(15);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f4767m = v0.ut.g3(16);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f4762g = v0.ut.g3(17);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f4774u0 = v0.ut.g3(18);

    /* JADX INFO: renamed from: bk, reason: collision with root package name */
    public static final String f4758bk = v0.ut.g3(19);
    public static final String y4 = v0.ut.g3(20);
    public static final String tg = v0.ut.g3(21);
    public static final String pz = v0.ut.g3(22);
    public static final String pq = v0.ut.g3(23);

    /* JADX INFO: renamed from: cr, reason: collision with root package name */
    public static final String f4759cr = v0.ut.g3(24);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f4769o0 = v0.ut.g3(25);
    public static final String xb = v0.ut.g3(26);
    public static final String wf = v0.ut.g3(27);

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    public static final String f4756ad = v0.ut.g3(28);
    public static final String cy = v0.ut.g3(29);

    /* JADX INFO: renamed from: qk, reason: collision with root package name */
    public static final String f4771qk = v0.ut.g3(30);

    /* JADX INFO: renamed from: qj, reason: collision with root package name */
    public static final String f4770qj = v0.ut.g3(31);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s.y<g> f4765l = new s.y() { // from class: ft.m
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return g.v(bundle);
        }
    };

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4793a;
        public int c;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @Nullable
        public Metadata f4794c5;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public int f4795co;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4796d;
        public int d0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f4797f;
        public int f3;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f4798fb;
        public int fh;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f4799gv;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        @Nullable
        public w0.zn f4800i4;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        @Nullable
        public String f4801i9;
        public int mg;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public float f4802mt;
        public int n;

        @Nullable
        public String n3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f4803p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        public byte[] f4804r;
        public int rz;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public String f4805s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4806t;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        public int f4807ta;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        @Nullable
        public List<byte[]> f4808tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f4809v;
        public int w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        @Nullable
        public DrmInitData f4810wz;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public int f4811x4;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public long f4812xc;

        @Nullable
        public String y;
        public float z;

        @Nullable
        public String zn;

        public n3 a8(int i) {
            this.f3 = i;
            return this;
        }

        public n3 b(@Nullable w0.zn znVar) {
            this.f4800i4 = znVar;
            return this;
        }

        public n3 ct(int i) {
            this.f4795co = i;
            return this;
        }

        public n3 dm(int i) {
            this.f4809v = i;
            return this;
        }

        public n3 e(int i) {
            this.f4807ta = i;
            return this;
        }

        public n3 eb(int i) {
            this.f4799gv = i;
            return this;
        }

        public n3 ej(int i) {
            this.rz = i;
            return this;
        }

        public n3 en(@Nullable Metadata metadata) {
            this.f4794c5 = metadata;
            return this;
        }

        public n3 f7(int i) {
            this.f4806t = i;
            return this;
        }

        public n3 hw(int i) {
            this.d0 = i;
            return this;
        }

        public n3 j(int i) {
            this.y = Integer.toString(i);
            return this;
        }

        public n3 j5(int i) {
            this.fh = i;
            return this;
        }

        public n3 jz(int i) {
            this.c = i;
            return this;
        }

        public n3 k(@Nullable String str) {
            this.zn = str;
            return this;
        }

        public n3 k5(@Nullable String str) {
            this.f4801i9 = str;
            return this;
        }

        public n3 lc(int i) {
            this.f4811x4 = i;
            return this;
        }

        public n3 nf(long j) {
            this.f4812xc = j;
            return this;
        }

        public n3 o(int i) {
            this.f4803p = i;
            return this;
        }

        public n3 o4(@Nullable String str) {
            this.f4797f = str;
            return this;
        }

        public n3 oz(@Nullable String str) {
            this.y = str;
            return this;
        }

        public n3 q9(@Nullable String str) {
            this.n3 = str;
            return this;
        }

        public n3 qn(float f3) {
            this.f4802mt = f3;
            return this;
        }

        public n3 ra(int i) {
            this.mg = i;
            return this;
        }

        public n3 rs(int i) {
            this.n = i;
            return this;
        }

        public n3 s8(int i) {
            this.w = i;
            return this;
        }

        public n3 u(int i) {
            this.f4798fb = i;
            return this;
        }

        public n3 ud(int i) {
            this.f4793a = i;
            return this;
        }

        public n3 ut(@Nullable List<byte[]> list) {
            this.f4808tl = list;
            return this;
        }

        public n3 vl(@Nullable DrmInitData drmInitData) {
            this.f4810wz = drmInitData;
            return this;
        }

        public n3 x(@Nullable String str) {
            this.f4805s = str;
            return this;
        }

        public n3 xg(@Nullable byte[] bArr) {
            this.f4804r = bArr;
            return this;
        }

        public n3 y5(float f3) {
            this.z = f3;
            return this;
        }

        public n3 yt(int i) {
            this.f4796d = i;
            return this;
        }

        public g z6() {
            return new g(this);
        }

        public n3() {
            this.f4793a = -1;
            this.f4798fb = -1;
            this.f4806t = -1;
            this.f4812xc = Long.MAX_VALUE;
            this.w = -1;
            this.f4803p = -1;
            this.f4802mt = -1.0f;
            this.z = 1.0f;
            this.f4811x4 = -1;
            this.f3 = -1;
            this.n = -1;
            this.c = -1;
            this.rz = -1;
            this.mg = -1;
            this.f4807ta = -1;
            this.f4796d = 0;
        }

        public n3(g gVar) {
            this.y = gVar.y;
            this.n3 = gVar.f4791v;
            this.zn = gVar.f4782fb;
            this.f4799gv = gVar.f4788s;
            this.f4809v = gVar.f4781f;
            this.f4793a = gVar.f4789t;
            this.f4798fb = gVar.w;
            this.f4805s = gVar.f4778co;
            this.f4794c5 = gVar.z;
            this.f4801i9 = gVar.f4787r;
            this.f4797f = gVar.f3;
            this.f4806t = gVar.n;
            this.f4808tl = gVar.c;
            this.f4810wz = gVar.d0;
            this.f4812xc = gVar.fh;
            this.w = gVar.f4779d;
            this.f4803p = gVar.f4780ej;
            this.f4802mt = gVar.f4792x;
            this.f4795co = gVar.f4777b;
            this.z = gVar.f4783hw;
            this.f4804r = gVar.f4784j5;
            this.f4811x4 = gVar.qn;
            this.f4800i4 = gVar.o;
            this.f3 = gVar.j;
            this.n = gVar.oz;
            this.c = gVar.f4790ut;
            this.d0 = gVar.q9;
            this.fh = gVar.f4785k;
            this.rz = gVar.f7;
            this.mg = gVar.en;
            this.f4807ta = gVar.jz;
            this.f4796d = gVar.u;
        }
    }

    @Nullable
    public static <T> T gv(@Nullable T t3, @Nullable T t5) {
        return t3 != null ? t3 : t5;
    }

    public static String i9(@Nullable g gVar) {
        if (gVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(gVar.y);
        sb.append(", mimeType=");
        sb.append(gVar.f3);
        if (gVar.f4786p != -1) {
            sb.append(", bitrate=");
            sb.append(gVar.f4786p);
        }
        if (gVar.f4778co != null) {
            sb.append(", codecs=");
            sb.append(gVar.f4778co);
        }
        if (gVar.d0 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                DrmInitData drmInitData = gVar.d0;
                if (i >= drmInitData.f1511s) {
                    break;
                }
                UUID uuid = drmInitData.v(i).f1516v;
                if (uuid.equals(c5.n3)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(c5.zn)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(c5.f4652v)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(c5.f4651gv)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(c5.y)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i++;
            }
            sb.append(", drm=[");
            g4.s.a(',').n3(sb, linkedHashSet);
            sb.append(']');
        }
        if (gVar.f4779d != -1 && gVar.f4780ej != -1) {
            sb.append(", res=");
            sb.append(gVar.f4779d);
            sb.append("x");
            sb.append(gVar.f4780ej);
        }
        if (gVar.f4792x != -1.0f) {
            sb.append(", fps=");
            sb.append(gVar.f4792x);
        }
        if (gVar.j != -1) {
            sb.append(", channels=");
            sb.append(gVar.j);
        }
        if (gVar.oz != -1) {
            sb.append(", sample_rate=");
            sb.append(gVar.oz);
        }
        if (gVar.f4782fb != null) {
            sb.append(", language=");
            sb.append(gVar.f4782fb);
        }
        if (gVar.f4791v != null) {
            sb.append(", label=");
            sb.append(gVar.f4791v);
        }
        if (gVar.f4788s != 0) {
            ArrayList arrayList = new ArrayList();
            if ((gVar.f4788s & 4) != 0) {
                arrayList.add("auto");
            }
            if ((gVar.f4788s & 1) != 0) {
                arrayList.add("default");
            }
            if ((gVar.f4788s & 2) != 0) {
                arrayList.add("forced");
            }
            sb.append(", selectionFlags=[");
            g4.s.a(',').n3(sb, arrayList);
            sb.append("]");
        }
        if (gVar.f4781f != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((gVar.f4781f & 1) != 0) {
                arrayList2.add("main");
            }
            if ((gVar.f4781f & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((gVar.f4781f & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((gVar.f4781f & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((gVar.f4781f & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((gVar.f4781f & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((gVar.f4781f & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((gVar.f4781f & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((gVar.f4781f & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                arrayList2.add("sign");
            }
            if ((gVar.f4781f & NotificationCompat.FLAG_GROUP_SUMMARY) != 0) {
                arrayList2.add("describes-video");
            }
            if ((gVar.f4781f & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                arrayList2.add("describes-music");
            }
            if ((gVar.f4781f & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((gVar.f4781f & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((gVar.f4781f & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((gVar.f4781f & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sb.append(", roleFlags=[");
            g4.s.a(',').n3(sb, arrayList2);
            sb.append("]");
        }
        return sb.toString();
    }

    public static String s(int i) {
        return f4775yc + "_" + Integer.toString(i, 36);
    }

    public static g v(Bundle bundle) {
        n3 n3Var = new n3();
        v0.gv.y(bundle);
        String string = bundle.getString(dm);
        g gVar = xg;
        n3Var.oz((String) gv(string, gVar.y)).q9((String) gv(bundle.getString(ct), gVar.f4791v)).k((String) gv(bundle.getString(o4), gVar.f4782fb)).eb(bundle.getInt(rs, gVar.f4788s)).dm(bundle.getInt(f4761eb, gVar.f4781f)).ud(bundle.getInt(f4766lc, gVar.f4789t)).u(bundle.getInt(f4768nf, gVar.w)).x((String) gv(bundle.getString(f4772ra), gVar.f4778co)).en((Metadata) gv((Metadata) bundle.getParcelable(f4760e), gVar.z)).k5((String) gv(bundle.getString(s8), gVar.f4787r)).o4((String) gv(bundle.getString(f4757ap), gVar.f3)).f7(bundle.getInt(f4776yg, gVar.n));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(s(i));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i++;
        }
        n3 n3VarVl = n3Var.ut(arrayList).vl((DrmInitData) bundle.getParcelable(f4764kp));
        String str = f4773rb;
        g gVar2 = xg;
        n3VarVl.nf(bundle.getLong(str, gVar2.fh)).s8(bundle.getInt(f4763g3, gVar2.f4779d)).o(bundle.getInt(f4767m, gVar2.f4780ej)).qn(bundle.getFloat(f4762g, gVar2.f4792x)).ct(bundle.getInt(f4774u0, gVar2.f4777b)).y5(bundle.getFloat(f4758bk, gVar2.f4783hw)).xg(bundle.getByteArray(y4)).lc(bundle.getInt(tg, gVar2.qn));
        Bundle bundle2 = bundle.getBundle(pz);
        if (bundle2 != null) {
            n3Var.b((w0.zn) w0.zn.f8950r.fromBundle(bundle2));
        }
        n3Var.a8(bundle.getInt(pq, gVar2.j)).rs(bundle.getInt(f4759cr, gVar2.oz)).jz(bundle.getInt(f4769o0, gVar2.f4790ut)).hw(bundle.getInt(xb, gVar2.q9)).j5(bundle.getInt(wf, gVar2.f4785k)).ej(bundle.getInt(f4756ad, gVar2.f7)).ra(bundle.getInt(f4771qk, gVar2.en)).e(bundle.getInt(f4770qj, gVar2.jz)).yt(bundle.getInt(cy, gVar2.u));
        return n3Var.z6();
    }

    public int a() {
        int i;
        int i5 = this.f4779d;
        if (i5 == -1 || (i = this.f4780ej) == -1) {
            return -1;
        }
        return i5 * i;
    }

    public Bundle c5(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(dm, this.y);
        bundle.putString(ct, this.f4791v);
        bundle.putString(o4, this.f4782fb);
        bundle.putInt(rs, this.f4788s);
        bundle.putInt(f4761eb, this.f4781f);
        bundle.putInt(f4766lc, this.f4789t);
        bundle.putInt(f4768nf, this.w);
        bundle.putString(f4772ra, this.f4778co);
        if (!z) {
            bundle.putParcelable(f4760e, this.z);
        }
        bundle.putString(s8, this.f4787r);
        bundle.putString(f4757ap, this.f3);
        bundle.putInt(f4776yg, this.n);
        for (int i = 0; i < this.c.size(); i++) {
            bundle.putByteArray(s(i), this.c.get(i));
        }
        bundle.putParcelable(f4764kp, this.d0);
        bundle.putLong(f4773rb, this.fh);
        bundle.putInt(f4763g3, this.f4779d);
        bundle.putInt(f4767m, this.f4780ej);
        bundle.putFloat(f4762g, this.f4792x);
        bundle.putInt(f4774u0, this.f4777b);
        bundle.putFloat(f4758bk, this.f4783hw);
        bundle.putByteArray(y4, this.f4784j5);
        bundle.putInt(tg, this.qn);
        w0.zn znVar = this.o;
        if (znVar != null) {
            bundle.putBundle(pz, znVar.toBundle());
        }
        bundle.putInt(pq, this.j);
        bundle.putInt(f4759cr, this.oz);
        bundle.putInt(f4769o0, this.f4790ut);
        bundle.putInt(xb, this.q9);
        bundle.putInt(wf, this.f4785k);
        bundle.putInt(f4756ad, this.f7);
        bundle.putInt(f4771qk, this.en);
        bundle.putInt(f4770qj, this.jz);
        bundle.putInt(cy, this.u);
        return bundle;
    }

    public boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        int i5 = this.y5;
        return (i5 == 0 || (i = gVar.y5) == 0 || i5 == i) && this.f4788s == gVar.f4788s && this.f4781f == gVar.f4781f && this.f4789t == gVar.f4789t && this.w == gVar.w && this.n == gVar.n && this.fh == gVar.fh && this.f4779d == gVar.f4779d && this.f4780ej == gVar.f4780ej && this.f4777b == gVar.f4777b && this.qn == gVar.qn && this.j == gVar.j && this.oz == gVar.oz && this.f4790ut == gVar.f4790ut && this.q9 == gVar.q9 && this.f4785k == gVar.f4785k && this.f7 == gVar.f7 && this.en == gVar.en && this.jz == gVar.jz && this.u == gVar.u && Float.compare(this.f4792x, gVar.f4792x) == 0 && Float.compare(this.f4783hw, gVar.f4783hw) == 0 && v0.ut.zn(this.y, gVar.y) && v0.ut.zn(this.f4791v, gVar.f4791v) && v0.ut.zn(this.f4778co, gVar.f4778co) && v0.ut.zn(this.f4787r, gVar.f4787r) && v0.ut.zn(this.f3, gVar.f3) && v0.ut.zn(this.f4782fb, gVar.f4782fb) && Arrays.equals(this.f4784j5, gVar.f4784j5) && v0.ut.zn(this.z, gVar.z) && v0.ut.zn(this.o, gVar.o) && v0.ut.zn(this.d0, gVar.d0) && fb(gVar);
    }

    public g f(g gVar) {
        String str;
        if (this == gVar) {
            return this;
        }
        int iF = v0.n.f(this.f3);
        String str2 = gVar.y;
        String str3 = gVar.f4791v;
        if (str3 == null) {
            str3 = this.f4791v;
        }
        String str4 = this.f4782fb;
        if ((iF == 3 || iF == 1) && (str = gVar.f4782fb) != null) {
            str4 = str;
        }
        int i = this.f4789t;
        if (i == -1) {
            i = gVar.f4789t;
        }
        int i5 = this.w;
        if (i5 == -1) {
            i5 = gVar.w;
        }
        String str5 = this.f4778co;
        if (str5 == null) {
            String strB = v0.ut.b(gVar.f4778co, iF);
            if (v0.ut.yk(strB).length == 1) {
                str5 = strB;
            }
        }
        Metadata metadata = this.z;
        Metadata metadataN3 = metadata == null ? gVar.z : metadata.n3(gVar.z);
        float f3 = this.f4792x;
        if (f3 == -1.0f && iF == 2) {
            f3 = gVar.f4792x;
        }
        return n3().oz(str2).q9(str3).k(str4).eb(this.f4788s | gVar.f4788s).dm(this.f4781f | gVar.f4781f).ud(i).u(i5).x(str5).en(metadataN3).vl(DrmInitData.gv(gVar.d0, this.d0)).qn(f3).z6();
    }

    public boolean fb(g gVar) {
        if (this.c.size() != gVar.c.size()) {
            return false;
        }
        for (int i = 0; i < this.c.size(); i++) {
            if (!Arrays.equals(this.c.get(i), gVar.c.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.y5 == 0) {
            String str = this.y;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f4791v;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f4782fb;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f4788s) * 31) + this.f4781f) * 31) + this.f4789t) * 31) + this.w) * 31;
            String str4 = this.f4778co;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.z;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f4787r;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f3;
            this.y5 = ((((((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.n) * 31) + ((int) this.fh)) * 31) + this.f4779d) * 31) + this.f4780ej) * 31) + Float.floatToIntBits(this.f4792x)) * 31) + this.f4777b) * 31) + Float.floatToIntBits(this.f4783hw)) * 31) + this.qn) * 31) + this.j) * 31) + this.oz) * 31) + this.f4790ut) * 31) + this.q9) * 31) + this.f4785k) * 31) + this.f7) * 31) + this.en) * 31) + this.jz) * 31) + this.u;
        }
        return this.y5;
    }

    public n3 n3() {
        return new n3();
    }

    @Override // ft.s
    public Bundle toBundle() {
        return c5(false);
    }

    public String toString() {
        return "Format(" + this.y + ", " + this.f4791v + ", " + this.f4787r + ", " + this.f3 + ", " + this.f4778co + ", " + this.f4786p + ", " + this.f4782fb + ", [" + this.f4779d + ", " + this.f4780ej + ", " + this.f4792x + "], [" + this.j + ", " + this.oz + "])";
    }

    public g zn(int i) {
        return n3().yt(i).z6();
    }

    public g(n3 n3Var) {
        this.y = n3Var.y;
        this.f4791v = n3Var.n3;
        this.f4782fb = v0.ut.ad(n3Var.zn);
        this.f4788s = n3Var.f4799gv;
        this.f4781f = n3Var.f4809v;
        int i = n3Var.f4793a;
        this.f4789t = i;
        int i5 = n3Var.f4798fb;
        this.w = i5;
        this.f4786p = i5 != -1 ? i5 : i;
        this.f4778co = n3Var.f4805s;
        this.z = n3Var.f4794c5;
        this.f4787r = n3Var.f4801i9;
        this.f3 = n3Var.f4797f;
        this.n = n3Var.f4806t;
        this.c = n3Var.f4808tl == null ? Collections.emptyList() : n3Var.f4808tl;
        DrmInitData drmInitData = n3Var.f4810wz;
        this.d0 = drmInitData;
        this.fh = n3Var.f4812xc;
        this.f4779d = n3Var.w;
        this.f4780ej = n3Var.f4803p;
        this.f4792x = n3Var.f4802mt;
        this.f4777b = n3Var.f4795co == -1 ? 0 : n3Var.f4795co;
        this.f4783hw = n3Var.z == -1.0f ? 1.0f : n3Var.z;
        this.f4784j5 = n3Var.f4804r;
        this.qn = n3Var.f4811x4;
        this.o = n3Var.f4800i4;
        this.j = n3Var.f3;
        this.oz = n3Var.n;
        this.f4790ut = n3Var.c;
        this.q9 = n3Var.d0 == -1 ? 0 : n3Var.d0;
        this.f4785k = n3Var.fh != -1 ? n3Var.fh : 0;
        this.f7 = n3Var.rz;
        this.en = n3Var.mg;
        this.jz = n3Var.f4807ta;
        if (n3Var.f4796d != 0 || drmInitData == null) {
            this.u = n3Var.f4796d;
        } else {
            this.u = 1;
        }
    }
}
