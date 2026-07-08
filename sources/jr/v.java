package jr;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import hk.i9;
import ia.f;
import ia.t;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5926a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final t f5927c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public final ia.n3 f5928co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5929f;

    @Nullable
    public final i9 f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final String f5930fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f5931gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    @Nullable
    public final r6.y f5932i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final int f5933i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    @Nullable
    public final f f5934mt;
    public final uo.s n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final ia.i9 f5935p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n3 f5936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<r6.s> f5937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f5938t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final float f5939tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y f5940v;
    public final float w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final float f5941wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public final boolean f5942x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final float f5943xc;
    public final List<r6.zn> y;
    public final List<gn.y<Float>> z;
    public final String zn;

    public enum n3 {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public enum y {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public v(List<r6.zn> list, uo.s sVar, String str, long j, y yVar, long j4, @Nullable String str2, List<r6.s> list2, t tVar, int i, int i5, int i8, float f3, float f4, float f5, float f7, @Nullable ia.i9 i9Var, @Nullable f fVar, List<gn.y<Float>> list3, n3 n3Var, @Nullable ia.n3 n3Var2, boolean z, @Nullable r6.y yVar2, @Nullable i9 i9Var2) {
        this.y = list;
        this.n3 = sVar;
        this.zn = str;
        this.f5931gv = j;
        this.f5940v = yVar;
        this.f5926a = j4;
        this.f5930fb = str2;
        this.f5937s = list2;
        this.f5927c5 = tVar;
        this.f5933i9 = i;
        this.f5929f = i5;
        this.f5938t = i8;
        this.f5939tl = f3;
        this.f5941wz = f4;
        this.f5943xc = f5;
        this.w = f7;
        this.f5935p = i9Var;
        this.f5934mt = fVar;
        this.z = list3;
        this.f5936r = n3Var;
        this.f5928co = n3Var2;
        this.f5942x4 = z;
        this.f5932i4 = yVar2;
        this.f3 = i9Var2;
    }

    public y a() {
        return this.f5940v;
    }

    public String c5() {
        return this.zn;
    }

    @Nullable
    public ia.i9 co() {
        return this.f5935p;
    }

    public float f() {
        return this.w;
    }

    public boolean f3() {
        return this.f5942x4;
    }

    public List<r6.s> fb() {
        return this.f5937s;
    }

    public long gv() {
        return this.f5931gv;
    }

    public t i4() {
        return this.f5927c5;
    }

    public long i9() {
        return this.f5926a;
    }

    public float mt() {
        return this.f5941wz / this.n3.v();
    }

    public String n(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(c5());
        sb.append("\n");
        v vVarZ = this.n3.z(i9());
        if (vVarZ != null) {
            sb.append("\t\tParents: ");
            sb.append(vVarZ.c5());
            v vVarZ2 = this.n3.z(vVarZ.i9());
            while (vVarZ2 != null) {
                sb.append("->");
                sb.append(vVarZ2.c5());
                vVarZ2 = this.n3.z(vVarZ2.i9());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!fb().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(fb().size());
            sb.append("\n");
        }
        if (p() != 0 && w() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(p()), Integer.valueOf(w()), Integer.valueOf(xc())));
        }
        if (!this.y.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (r6.zn znVar : this.y) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(znVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public uo.s n3() {
        return this.n3;
    }

    public int p() {
        return this.f5933i9;
    }

    @Nullable
    public ia.n3 r() {
        return this.f5928co;
    }

    public n3 s() {
        return this.f5936r;
    }

    public float t() {
        return this.f5943xc;
    }

    @Nullable
    public String tl() {
        return this.f5930fb;
    }

    public String toString() {
        return n(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
    }

    public List<gn.y<Float>> v() {
        return this.z;
    }

    public int w() {
        return this.f5929f;
    }

    public List<r6.zn> wz() {
        return this.y;
    }

    public float x4() {
        return this.f5939tl;
    }

    public int xc() {
        return this.f5938t;
    }

    @Nullable
    public r6.y y() {
        return this.f5932i4;
    }

    @Nullable
    public f z() {
        return this.f5934mt;
    }

    @Nullable
    public i9 zn() {
        return this.f3;
    }
}
