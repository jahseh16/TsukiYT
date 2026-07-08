package m0;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6474a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6481s;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public float f6486xc;
    public String y = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
    public String n3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
    public Set<String> zn = Collections.emptySet();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public String f6478gv = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public String f6484v = null;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f6477fb = false;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f6475c5 = false;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f6479i9 = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6476f = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6482t = -1;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f6483tl = -1;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int f6485wz = -1;
    public int w = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6480p = false;

    public static int fh(int i, String str, @Nullable String str2, int i5) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i5;
        }
        return -1;
    }

    public int a() {
        return this.f6485wz;
    }

    public void c(String str) {
        this.f6478gv = str;
    }

    public int c5() {
        int i = this.f6482t;
        if (i == -1 && this.f6483tl == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f6483tl == 1 ? 2 : 0);
    }

    public gv co(float f3) {
        this.f6486xc = f3;
        return this;
    }

    public gv d0(boolean z) {
        this.f6476f = z ? 1 : 0;
        return this;
    }

    public boolean f() {
        return this.f6477fb;
    }

    public void f3(String str) {
        this.y = str;
    }

    public int fb() {
        return this.w;
    }

    @Nullable
    public String gv() {
        return this.f6484v;
    }

    public void i4(String[] strArr) {
        this.zn = new HashSet(Arrays.asList(strArr));
    }

    public boolean i9() {
        return this.f6475c5;
    }

    public gv mt(@Nullable String str) {
        this.f6484v = str == null ? null : g4.zn.v(str);
        return this;
    }

    public void n(String str) {
        this.n3 = str;
    }

    public boolean n3() {
        return this.f6480p;
    }

    public gv p(int i) {
        this.f6474a = i;
        this.f6477fb = true;
        return this;
    }

    public gv r(boolean z) {
        this.f6483tl = z ? 1 : 0;
        return this;
    }

    public int s(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        if (this.y.isEmpty() && this.n3.isEmpty() && this.zn.isEmpty() && this.f6478gv.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iFh = fh(fh(fh(0, this.y, str, 1073741824), this.n3, str2, 2), this.f6478gv, str3, 4);
        if (iFh == -1 || !set.containsAll(this.zn)) {
            return 0;
        }
        return iFh + (this.zn.size() * 4);
    }

    public boolean t() {
        return this.f6479i9 == 1;
    }

    public boolean tl() {
        return this.f6476f == 1;
    }

    public float v() {
        return this.f6486xc;
    }

    public gv w(boolean z) {
        this.f6480p = z;
        return this;
    }

    public gv wz(int i) {
        this.f6481s = i;
        this.f6475c5 = true;
        return this;
    }

    public gv x4(int i) {
        this.w = i;
        return this;
    }

    public gv xc(boolean z) {
        this.f6482t = z ? 1 : 0;
        return this;
    }

    public int y() {
        if (this.f6475c5) {
            return this.f6481s;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public gv z(int i) {
        this.f6485wz = i;
        return this;
    }

    public int zn() {
        if (this.f6477fb) {
            return this.f6474a;
        }
        throw new IllegalStateException("Font color not defined");
    }
}
