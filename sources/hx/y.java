package hx;

import androidx.annotation.Nullable;
import ft.q;
import java.util.HashMap;
import k4.i4;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f5415a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final k4.i4<String, String> f5416c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final String f5417fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f5418gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final zn f5419i9;
    public final int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final String f5420s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5421v;
    public final String y;
    public final String zn;

    public static final class n3 {

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @Nullable
        public String f5423c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public String f5424fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f5425gv;
        public final int n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public String f5426s;
        public final String y;
        public final String zn;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final HashMap<String, String> f5427v = new HashMap<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5422a = -1;

        public n3(String str, int i, String str2, int i5) {
            this.y = str;
            this.n3 = i;
            this.zn = str2;
            this.f5425gv = i5;
        }

        public static String f(int i, String str, int i5, int i8) {
            return ut.rz("%d %s/%d/%d", Integer.valueOf(i), str, Integer.valueOf(i5), Integer.valueOf(i8));
        }

        public static String t(int i) {
            v0.y.y(i < 96);
            if (i == 0) {
                return f(0, "PCMU", 8000, 1);
            }
            if (i == 8) {
                return f(8, "PCMA", 8000, 1);
            }
            if (i == 10) {
                return f(10, "L16", 44100, 2);
            }
            if (i == 11) {
                return f(11, "L16", 44100, 1);
            }
            throw new IllegalStateException("Unsupported static paylod type " + i);
        }

        public n3 c5(String str, String str2) {
            this.f5427v.put(str, str2);
            return this;
        }

        public y i9() {
            try {
                return new y(this, k4.i4.f(this.f5427v), this.f5427v.containsKey("rtpmap") ? zn.y((String) ut.i9(this.f5427v.get("rtpmap"))) : zn.y(t(this.f5425gv)));
            } catch (q e4) {
                throw new IllegalStateException(e4);
            }
        }

        public n3 tl(int i) {
            this.f5422a = i;
            return this;
        }

        public n3 w(String str) {
            this.f5424fb = str;
            return this;
        }

        public n3 wz(String str) {
            this.f5426s = str;
            return this;
        }

        public n3 xc(String str) {
            this.f5423c5 = str;
            return this;
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f5428gv;
        public final String n3;
        public final int y;
        public final int zn;

        public zn(int i, String str, int i5, int i8) {
            this.y = i;
            this.n3 = str;
            this.zn = i5;
            this.f5428gv = i8;
        }

        public static zn y(String str) throws q {
            String[] strArrIx = ut.ix(str, " ");
            v0.y.y(strArrIx.length == 2);
            int iS = com.google.android.exoplayer2.source.rtsp.s.s(strArrIx[0]);
            String[] strArrRo = ut.ro(strArrIx[1].trim(), "/");
            v0.y.y(strArrRo.length >= 2);
            return new zn(iS, strArrRo[0], com.google.android.exoplayer2.source.rtsp.s.s(strArrRo[1]), strArrRo.length == 3 ? com.google.android.exoplayer2.source.rtsp.s.s(strArrRo[2]) : -1);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || zn.class != obj.getClass()) {
                return false;
            }
            zn znVar = (zn) obj;
            return this.y == znVar.y && this.n3.equals(znVar.n3) && this.zn == znVar.zn && this.f5428gv == znVar.f5428gv;
        }

        public int hashCode() {
            return ((((((217 + this.y) * 31) + this.n3.hashCode()) * 31) + this.zn) * 31) + this.f5428gv;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.y.equals(yVar.y) && this.n3 == yVar.n3 && this.zn.equals(yVar.zn) && this.f5418gv == yVar.f5418gv && this.f5421v == yVar.f5421v && this.f5416c5.equals(yVar.f5416c5) && this.f5419i9.equals(yVar.f5419i9) && ut.zn(this.f5415a, yVar.f5415a) && ut.zn(this.f5417fb, yVar.f5417fb) && ut.zn(this.f5420s, yVar.f5420s);
    }

    public int hashCode() {
        int iHashCode = (((((((((((((217 + this.y.hashCode()) * 31) + this.n3) * 31) + this.zn.hashCode()) * 31) + this.f5418gv) * 31) + this.f5421v) * 31) + this.f5416c5.hashCode()) * 31) + this.f5419i9.hashCode()) * 31;
        String str = this.f5415a;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5417fb;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5420s;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public k4.i4<String, String> y() {
        String str = this.f5416c5.get("fmtp");
        if (str == null) {
            return k4.i4.f3();
        }
        String[] strArrIx = ut.ix(str, " ");
        v0.y.n3(strArrIx.length == 2, str);
        String[] strArrSplit = strArrIx[1].split(";\\s?", 0);
        i4.y yVar = new i4.y();
        for (String str2 : strArrSplit) {
            String[] strArrIx2 = ut.ix(str2, "=");
            yVar.gv(strArrIx2[0], strArrIx2[1]);
        }
        return yVar.n3();
    }

    public y(n3 n3Var, k4.i4<String, String> i4Var, zn znVar) {
        this.y = n3Var.y;
        this.n3 = n3Var.n3;
        this.zn = n3Var.zn;
        this.f5418gv = n3Var.f5425gv;
        this.f5415a = n3Var.f5424fb;
        this.f5417fb = n3Var.f5426s;
        this.f5421v = n3Var.f5422a;
        this.f5420s = n3Var.f5423c5;
        this.f5416c5 = i4Var;
        this.f5419i9 = znVar;
    }
}
