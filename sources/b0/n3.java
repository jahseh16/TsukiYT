package b0;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.s;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements ft.s {
    public final int c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final int f1200co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1201d;
    public final float d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1202f;
    public final boolean f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f1203fb;
    public final int fh;
    public final int n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f1204p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f1205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final Bitmap f1206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1207t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f1208v;
    public final int w;

    @Nullable
    public final CharSequence y;
    public final float z;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public static final n3 f1194ej = new C0034n3().xc(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING).y();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f1199x = ut.g3(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f1193b = ut.g3(1);

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public static final String f1195hw = ut.g3(2);

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final String f1196j5 = ut.g3(3);
    public static final String qn = ut.g3(4);
    public static final String o = ut.g3(5);
    public static final String j = ut.g3(6);
    public static final String oz = ut.g3(7);

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public static final String f1198ut = ut.g3(8);
    public static final String q9 = ut.g3(9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1197k = ut.g3(10);
    public static final String f7 = ut.g3(11);
    public static final String en = ut.g3(12);
    public static final String jz = ut.g3(13);
    public static final String u = ut.g3(14);
    public static final String y5 = ut.g3(15);
    public static final String xg = ut.g3(16);
    public static final s.y<n3> dm = new s.y() { // from class: b0.y
        @Override // ft.s.y
        public final ft.s fromBundle(Bundle bundle) {
            return n3.zn(bundle);
        }
    };

    /* JADX INFO: renamed from: b0.n3$n3, reason: collision with other inner class name */
    public static final class C0034n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1209a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f1210c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f1211f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f1212fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f1213gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public int f1214i9;

        @Nullable
        public Bitmap n3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f1215p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f1216s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f1217t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public float f1218tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f1219v;
        public int w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public boolean f1220wz;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public int f1221xc;

        @Nullable
        public CharSequence y;

        @Nullable
        public Layout.Alignment zn;

        public C0034n3 a(Bitmap bitmap) {
            this.n3 = bitmap;
            return this;
        }

        public C0034n3 c5(int i) {
            this.f1212fb = i;
            return this;
        }

        public C0034n3 co(int i) {
            this.f1221xc = i;
            this.f1220wz = true;
            return this;
        }

        public C0034n3 f(float f3) {
            this.f1216s = f3;
            return this;
        }

        public C0034n3 fb(float f3) {
            this.f1218tl = f3;
            return this;
        }

        public int gv() {
            return this.f1210c5;
        }

        public C0034n3 i9(@Nullable Layout.Alignment alignment) {
            this.f1213gv = alignment;
            return this;
        }

        public C0034n3 mt(int i) {
            this.w = i;
            return this;
        }

        public C0034n3 n3() {
            this.f1220wz = false;
            return this;
        }

        public C0034n3 p(float f3, int i) {
            this.f1211f = f3;
            this.f1214i9 = i;
            return this;
        }

        public C0034n3 s(float f3, int i) {
            this.f1219v = f3;
            this.f1209a = i;
            return this;
        }

        public C0034n3 t(int i) {
            this.f1210c5 = i;
            return this;
        }

        public C0034n3 tl(float f3) {
            this.f1215p = f3;
            return this;
        }

        @Nullable
        public CharSequence v() {
            return this.y;
        }

        public C0034n3 w(@Nullable Layout.Alignment alignment) {
            this.zn = alignment;
            return this;
        }

        public C0034n3 wz(float f3) {
            this.f1217t = f3;
            return this;
        }

        public C0034n3 xc(CharSequence charSequence) {
            this.y = charSequence;
            return this;
        }

        public n3 y() {
            return new n3(this.y, this.zn, this.f1213gv, this.n3, this.f1219v, this.f1209a, this.f1212fb, this.f1216s, this.f1210c5, this.f1214i9, this.f1211f, this.f1217t, this.f1218tl, this.f1220wz, this.f1221xc, this.w, this.f1215p);
        }

        public int zn() {
            return this.f1212fb;
        }

        public C0034n3() {
            this.y = null;
            this.n3 = null;
            this.zn = null;
            this.f1213gv = null;
            this.f1219v = -3.4028235E38f;
            this.f1209a = Integer.MIN_VALUE;
            this.f1212fb = Integer.MIN_VALUE;
            this.f1216s = -3.4028235E38f;
            this.f1210c5 = Integer.MIN_VALUE;
            this.f1214i9 = Integer.MIN_VALUE;
            this.f1211f = -3.4028235E38f;
            this.f1217t = -3.4028235E38f;
            this.f1218tl = -3.4028235E38f;
            this.f1220wz = false;
            this.f1221xc = -16777216;
            this.w = Integer.MIN_VALUE;
        }

        public C0034n3(n3 n3Var) {
            this.y = n3Var.y;
            this.n3 = n3Var.f1206s;
            this.zn = n3Var.f1208v;
            this.f1213gv = n3Var.f1203fb;
            this.f1219v = n3Var.f1202f;
            this.f1209a = n3Var.f1207t;
            this.f1212fb = n3Var.w;
            this.f1216s = n3Var.f1204p;
            this.f1210c5 = n3Var.f1200co;
            this.f1214i9 = n3Var.c;
            this.f1211f = n3Var.d0;
            this.f1217t = n3Var.z;
            this.f1218tl = n3Var.f1205r;
            this.f1220wz = n3Var.f3;
            this.f1221xc = n3Var.n;
            this.w = n3Var.fh;
            this.f1215p = n3Var.f1201d;
        }
    }

    public static final n3 zn(Bundle bundle) {
        C0034n3 c0034n3 = new C0034n3();
        CharSequence charSequence = bundle.getCharSequence(f1199x);
        if (charSequence != null) {
            c0034n3.xc(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f1193b);
        if (alignment != null) {
            c0034n3.w(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f1195hw);
        if (alignment2 != null) {
            c0034n3.i9(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f1196j5);
        if (bitmap != null) {
            c0034n3.a(bitmap);
        }
        String str = qn;
        if (bundle.containsKey(str)) {
            String str2 = o;
            if (bundle.containsKey(str2)) {
                c0034n3.s(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = j;
        if (bundle.containsKey(str3)) {
            c0034n3.c5(bundle.getInt(str3));
        }
        String str4 = oz;
        if (bundle.containsKey(str4)) {
            c0034n3.f(bundle.getFloat(str4));
        }
        String str5 = f1198ut;
        if (bundle.containsKey(str5)) {
            c0034n3.t(bundle.getInt(str5));
        }
        String str6 = f1197k;
        if (bundle.containsKey(str6)) {
            String str7 = q9;
            if (bundle.containsKey(str7)) {
                c0034n3.p(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f7;
        if (bundle.containsKey(str8)) {
            c0034n3.wz(bundle.getFloat(str8));
        }
        String str9 = en;
        if (bundle.containsKey(str9)) {
            c0034n3.fb(bundle.getFloat(str9));
        }
        String str10 = jz;
        if (bundle.containsKey(str10)) {
            c0034n3.co(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(u, false)) {
            c0034n3.n3();
        }
        String str11 = y5;
        if (bundle.containsKey(str11)) {
            c0034n3.mt(bundle.getInt(str11));
        }
        String str12 = xg;
        if (bundle.containsKey(str12)) {
            c0034n3.tl(bundle.getFloat(str12));
        }
        return c0034n3.y();
    }

    public boolean equals(@Nullable Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || n3.class != obj.getClass()) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return TextUtils.equals(this.y, n3Var.y) && this.f1208v == n3Var.f1208v && this.f1203fb == n3Var.f1203fb && ((bitmap = this.f1206s) != null ? !((bitmap2 = n3Var.f1206s) == null || !bitmap.sameAs(bitmap2)) : n3Var.f1206s == null) && this.f1202f == n3Var.f1202f && this.f1207t == n3Var.f1207t && this.w == n3Var.w && this.f1204p == n3Var.f1204p && this.f1200co == n3Var.f1200co && this.z == n3Var.z && this.f1205r == n3Var.f1205r && this.f3 == n3Var.f3 && this.n == n3Var.n && this.c == n3Var.c && this.d0 == n3Var.d0 && this.fh == n3Var.fh && this.f1201d == n3Var.f1201d;
    }

    public int hashCode() {
        return g4.f.n3(this.y, this.f1208v, this.f1203fb, this.f1206s, Float.valueOf(this.f1202f), Integer.valueOf(this.f1207t), Integer.valueOf(this.w), Float.valueOf(this.f1204p), Integer.valueOf(this.f1200co), Float.valueOf(this.z), Float.valueOf(this.f1205r), Boolean.valueOf(this.f3), Integer.valueOf(this.n), Integer.valueOf(this.c), Float.valueOf(this.d0), Integer.valueOf(this.fh), Float.valueOf(this.f1201d));
    }

    public C0034n3 n3() {
        return new C0034n3();
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(f1199x, this.y);
        bundle.putSerializable(f1193b, this.f1208v);
        bundle.putSerializable(f1195hw, this.f1203fb);
        bundle.putParcelable(f1196j5, this.f1206s);
        bundle.putFloat(qn, this.f1202f);
        bundle.putInt(o, this.f1207t);
        bundle.putInt(j, this.w);
        bundle.putFloat(oz, this.f1204p);
        bundle.putInt(f1198ut, this.f1200co);
        bundle.putInt(q9, this.c);
        bundle.putFloat(f1197k, this.d0);
        bundle.putFloat(f7, this.z);
        bundle.putFloat(en, this.f1205r);
        bundle.putBoolean(u, this.f3);
        bundle.putInt(jz, this.n);
        bundle.putInt(y5, this.fh);
        bundle.putFloat(xg, this.f1201d);
        return bundle;
    }

    public n3(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Layout.Alignment alignment2, @Nullable Bitmap bitmap, float f3, int i, int i5, float f4, int i8, int i10, float f5, float f8, float f9, boolean z, int i11, int i12, float f10) {
        if (charSequence == null) {
            v0.y.v(bitmap);
        } else {
            v0.y.y(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.y = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.y = charSequence.toString();
        } else {
            this.y = null;
        }
        this.f1208v = alignment;
        this.f1203fb = alignment2;
        this.f1206s = bitmap;
        this.f1202f = f3;
        this.f1207t = i;
        this.w = i5;
        this.f1204p = f4;
        this.f1200co = i8;
        this.z = f8;
        this.f1205r = f9;
        this.f3 = z;
        this.n = i11;
        this.c = i10;
        this.d0 = f5;
        this.fh = i12;
        this.f1201d = f10;
    }
}
