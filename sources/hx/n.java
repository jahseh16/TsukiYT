package hx;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.HashMap;
import k4.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5378a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public final String f5379c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f5380f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final Uri f5381fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public final String f5382gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public final String f5383i9;
    public final k4.r<hx.y> n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final String f5384s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final String f5385t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final String f5386v;
    public final k4.i4<String, String> y;

    @Nullable
    public final String zn;

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f5387a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @Nullable
        public String f5388c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f5389f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public Uri f5390fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public String f5391gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        @Nullable
        public String f5392i9;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public String f5393s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public String f5394t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public String f5395v;
        public final HashMap<String, String> y = new HashMap<>();
        public final r.y<hx.y> n3 = new r.y<>();
        public int zn = -1;

        public n3 co(String str) {
            this.f5388c5 = str;
            return this;
        }

        public n3 f3(String str) {
            this.f5387a = str;
            return this;
        }

        public n3 i4(String str) {
            this.f5391gv = str;
            return this;
        }

        public n3 mt(String str) {
            this.f5389f = str;
            return this;
        }

        public n3 n(Uri uri) {
            this.f5390fb = uri;
            return this;
        }

        public n3 p(String str) {
            this.f5393s = str;
            return this;
        }

        public n3 r(String str) {
            this.f5394t = str;
            return this;
        }

        public n3 tl(String str, String str2) {
            this.y.put(str, str2);
            return this;
        }

        public n3 w(int i) {
            this.zn = i;
            return this;
        }

        public n3 wz(hx.y yVar) {
            this.n3.y(yVar);
            return this;
        }

        public n3 x4(String str) {
            this.f5392i9 = str;
            return this;
        }

        public n xc() {
            return new n(this);
        }

        public n3 z(String str) {
            this.f5395v = str;
            return this;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f5378a == nVar.f5378a && this.y.equals(nVar.y) && this.n3.equals(nVar.n3) && ut.zn(this.f5382gv, nVar.f5382gv) && ut.zn(this.zn, nVar.zn) && ut.zn(this.f5386v, nVar.f5386v) && ut.zn(this.f5385t, nVar.f5385t) && ut.zn(this.f5381fb, nVar.f5381fb) && ut.zn(this.f5383i9, nVar.f5383i9) && ut.zn(this.f5380f, nVar.f5380f) && ut.zn(this.f5384s, nVar.f5384s) && ut.zn(this.f5379c5, nVar.f5379c5);
    }

    public int hashCode() {
        int iHashCode = (((217 + this.y.hashCode()) * 31) + this.n3.hashCode()) * 31;
        String str = this.f5382gv;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zn;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5386v;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f5378a) * 31;
        String str4 = this.f5385t;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f5381fb;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f5383i9;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5380f;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5384s;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5379c5;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public n(n3 n3Var) {
        this.y = k4.i4.f(n3Var.y);
        this.n3 = n3Var.n3.f();
        this.zn = (String) ut.i9(n3Var.f5391gv);
        this.f5382gv = (String) ut.i9(n3Var.f5395v);
        this.f5386v = (String) ut.i9(n3Var.f5387a);
        this.f5381fb = n3Var.f5390fb;
        this.f5384s = n3Var.f5393s;
        this.f5378a = n3Var.zn;
        this.f5379c5 = n3Var.f5388c5;
        this.f5383i9 = n3Var.f5389f;
        this.f5380f = n3Var.f5394t;
        this.f5385t = n3Var.f5392i9;
    }
}
