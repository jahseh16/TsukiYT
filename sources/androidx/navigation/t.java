package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f982a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final int f983c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f984fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final boolean f985gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public String f986i9;
    public final boolean n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f987s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f988v;
    public final boolean y;
    public final int zn;

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f989a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public String f992gv;
        public boolean n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f995v;
        public boolean y;
        public int zn = -1;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f991fb = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f994s = -1;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f990c5 = -1;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public int f993i9 = -1;

        public static /* synthetic */ y c5(y yVar, int i, boolean z, boolean z5, int i5, Object obj) {
            if ((i5 & 4) != 0) {
                z5 = false;
            }
            return yVar.fb(i, z, z5);
        }

        public final y a(int i) {
            this.f993i9 = i;
            return this;
        }

        public final y fb(int i, boolean z, boolean z5) {
            this.zn = i;
            this.f992gv = null;
            this.f995v = z;
            this.f989a = z5;
            return this;
        }

        public final y gv(boolean z) {
            this.y = z;
            return this;
        }

        public final y i9(boolean z) {
            this.n3 = z;
            return this;
        }

        public final y n3(int i) {
            this.f991fb = i;
            return this;
        }

        public final y s(String str, boolean z, boolean z5) {
            this.f992gv = str;
            this.zn = -1;
            this.f995v = z;
            this.f989a = z5;
            return this;
        }

        public final y v(int i) {
            this.f990c5 = i;
            return this;
        }

        public final t y() {
            String str = this.f992gv;
            return str != null ? new t(this.y, this.n3, str, this.f995v, this.f989a, this.f991fb, this.f994s, this.f990c5, this.f993i9) : new t(this.y, this.n3, this.zn, this.f995v, this.f989a, this.f991fb, this.f994s, this.f990c5, this.f993i9);
        }

        public final y zn(int i) {
            this.f994s = i;
            return this;
        }
    }

    public t(boolean z, boolean z5, int i, boolean z7, boolean z8, int i5, int i8, int i10, int i11) {
        this.y = z;
        this.n3 = z5;
        this.zn = i;
        this.f985gv = z7;
        this.f988v = z8;
        this.f982a = i5;
        this.f984fb = i8;
        this.f987s = i10;
        this.f983c5 = i11;
    }

    public final String a() {
        return this.f986i9;
    }

    public final boolean c5() {
        return this.f988v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.y == tVar.y && this.n3 == tVar.n3 && this.zn == tVar.zn && Intrinsics.areEqual(this.f986i9, tVar.f986i9) && this.f985gv == tVar.f985gv && this.f988v == tVar.f988v && this.f982a == tVar.f982a && this.f984fb == tVar.f984fb && this.f987s == tVar.f987s && this.f983c5 == tVar.f983c5;
    }

    public final boolean fb() {
        return this.f985gv;
    }

    public final int gv() {
        return this.f983c5;
    }

    public int hashCode() {
        int i = (((((s() ? 1 : 0) * 31) + (i9() ? 1 : 0)) * 31) + this.zn) * 31;
        String str = this.f986i9;
        return ((((((((((((i + (str != null ? str.hashCode() : 0)) * 31) + (fb() ? 1 : 0)) * 31) + (c5() ? 1 : 0)) * 31) + this.f982a) * 31) + this.f984fb) * 31) + this.f987s) * 31) + this.f983c5;
    }

    public final boolean i9() {
        return this.n3;
    }

    public final int n3() {
        return this.f984fb;
    }

    public final boolean s() {
        return this.y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(t.class.getSimpleName());
        sb.append("(");
        if (this.y) {
            sb.append("launchSingleTop ");
        }
        if (this.n3) {
            sb.append("restoreState ");
        }
        String str = this.f986i9;
        if ((str != null || this.zn != -1) && str != null) {
            sb.append("popUpTo(");
            String str2 = this.f986i9;
            if (str2 != null) {
                sb.append(str2);
            } else {
                sb.append("0x");
                sb.append(Integer.toHexString(this.zn));
            }
            if (this.f985gv) {
                sb.append(" inclusive");
            }
            if (this.f988v) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        if (this.f982a != -1 || this.f984fb != -1 || this.f987s != -1 || this.f983c5 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(this.f982a));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(this.f984fb));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(this.f987s));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(this.f983c5));
            sb.append(")");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final int v() {
        return this.zn;
    }

    public final int y() {
        return this.f982a;
    }

    public final int zn() {
        return this.f987s;
    }

    public t(boolean z, boolean z5, String str, boolean z7, boolean z8, int i, int i5, int i8, int i10) {
        this(z, z5, s.z.y(str).hashCode(), z7, z8, i, i5, i8, i10);
        this.f986i9 = str;
    }
}
