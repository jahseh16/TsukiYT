package j0;

import android.text.Layout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class fb {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5758f;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f5760gv;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    @Nullable
    public n3 f5762mt;
    public int n3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public String f5765t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5767v;

    @Nullable
    public Layout.Alignment w;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f5769xc;

    @Nullable
    public String y;
    public boolean zn;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5755a = -1;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f5759fb = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5764s = -1;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f5756c5 = -1;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f5761i9 = -1;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f5766tl = -1;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int f5768wz = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5763p = -1;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public float f5757co = Float.MAX_VALUE;

    public int a() {
        return this.f5761i9;
    }

    public fb a8(@Nullable n3 n3Var) {
        this.f5762mt = n3Var;
        return this;
    }

    public fb c(int i) {
        this.f5761i9 = i;
        return this;
    }

    public int c5() {
        return this.f5768wz;
    }

    public boolean co() {
        return this.f5755a == 1;
    }

    public fb d(int i) {
        this.f5766tl = i;
        return this;
    }

    public fb d0(@Nullable String str) {
        this.f5765t = str;
        return this;
    }

    public fb ej(@Nullable Layout.Alignment alignment) {
        this.f5769xc = alignment;
        return this;
    }

    public float f() {
        return this.f5757co;
    }

    public fb f3(@Nullable String str) {
        this.y = str;
        return this;
    }

    @Nullable
    public String fb() {
        return this.f5765t;
    }

    public fb fh(boolean z) {
        this.f5756c5 = z ? 1 : 0;
        return this;
    }

    @Nullable
    public String gv() {
        return this.y;
    }

    public fb i4(int i) {
        this.n3 = i;
        this.zn = true;
        return this;
    }

    public int i9() {
        return this.f5766tl;
    }

    public fb mg(@Nullable Layout.Alignment alignment) {
        this.w = alignment;
        return this;
    }

    public final fb mt(@Nullable fb fbVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fbVar != null) {
            if (!this.zn && fbVar.zn) {
                i4(fbVar.n3);
            }
            if (this.f5764s == -1) {
                this.f5764s = fbVar.f5764s;
            }
            if (this.f5756c5 == -1) {
                this.f5756c5 = fbVar.f5756c5;
            }
            if (this.y == null && (str = fbVar.y) != null) {
                this.y = str;
            }
            if (this.f5755a == -1) {
                this.f5755a = fbVar.f5755a;
            }
            if (this.f5759fb == -1) {
                this.f5759fb = fbVar.f5759fb;
            }
            if (this.f5768wz == -1) {
                this.f5768wz = fbVar.f5768wz;
            }
            if (this.f5769xc == null && (alignment2 = fbVar.f5769xc) != null) {
                this.f5769xc = alignment2;
            }
            if (this.w == null && (alignment = fbVar.w) != null) {
                this.w = alignment;
            }
            if (this.f5763p == -1) {
                this.f5763p = fbVar.f5763p;
            }
            if (this.f5761i9 == -1) {
                this.f5761i9 = fbVar.f5761i9;
                this.f5758f = fbVar.f5758f;
            }
            if (this.f5762mt == null) {
                this.f5762mt = fbVar.f5762mt;
            }
            if (this.f5757co == Float.MAX_VALUE) {
                this.f5757co = fbVar.f5757co;
            }
            if (z && !this.f5767v && fbVar.f5767v) {
                r(fbVar.f5760gv);
            }
            if (z && this.f5766tl == -1 && (i = fbVar.f5766tl) != -1) {
                this.f5766tl = i;
            }
        }
        return this;
    }

    public fb n(float f3) {
        this.f5758f = f3;
        return this;
    }

    public int n3() {
        if (this.f5767v) {
            return this.f5760gv;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public boolean p() {
        return this.zn;
    }

    public fb r(int i) {
        this.f5760gv = i;
        this.f5767v = true;
        return this;
    }

    public fb rz(boolean z) {
        this.f5755a = z ? 1 : 0;
        return this;
    }

    @Nullable
    public Layout.Alignment s() {
        return this.w;
    }

    public int t() {
        int i = this.f5764s;
        if (i == -1 && this.f5756c5 == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f5756c5 == 1 ? 2 : 0);
    }

    public fb ta(int i) {
        this.f5768wz = i;
        return this;
    }

    @Nullable
    public Layout.Alignment tl() {
        return this.f5769xc;
    }

    public fb ud(boolean z) {
        this.f5763p = z ? 1 : 0;
        return this;
    }

    public float v() {
        return this.f5758f;
    }

    public boolean w() {
        return this.f5767v;
    }

    public boolean wz() {
        return this.f5763p == 1;
    }

    public fb x(boolean z) {
        this.f5759fb = z ? 1 : 0;
        return this;
    }

    public fb x4(boolean z) {
        this.f5764s = z ? 1 : 0;
        return this;
    }

    @Nullable
    public n3 xc() {
        return this.f5762mt;
    }

    public fb y(@Nullable fb fbVar) {
        return mt(fbVar, true);
    }

    public boolean z() {
        return this.f5759fb == 1;
    }

    public fb z6(float f3) {
        this.f5757co = f3;
        return this;
    }

    public int zn() {
        if (this.zn) {
            return this.n3;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }
}
