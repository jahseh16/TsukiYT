package ua;

import androidx.core.app.NotificationCompat;
import b1.fh;
import b1.rz;
import b1.ta;
import b1.tl;
import java.io.IOException;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8381a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f8382c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long[] f8383f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f8384fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f8385gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f8386i9;
    public final int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f8388t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8389v;
    public final ta y;
    public final int zn;

    public v(int i, int i5, long j, int i8, ta taVar) {
        boolean z = true;
        if (i5 != 1 && i5 != 2) {
            z = false;
        }
        v0.y.y(z);
        this.f8385gv = j;
        this.f8389v = i8;
        this.y = taVar;
        this.n3 = gv(i, i5 == 2 ? 1667497984 : 1651965952);
        this.zn = i5 == 2 ? gv(i, 1650720768) : -1;
        this.f8383f = new long[NotificationCompat.FLAG_GROUP_SUMMARY];
        this.f8388t = new int[NotificationCompat.FLAG_GROUP_SUMMARY];
    }

    public static int gv(int i, int i5) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i5;
    }

    public long a() {
        return v(this.f8387s);
    }

    public fh.y c5(long j) {
        int iFb = (int) (j / fb());
        int iS = ut.s(this.f8388t, iFb, true, true);
        if (this.f8388t[iS] == iFb) {
            return new fh.y(s(iS));
        }
        rz rzVarS = s(iS);
        int i = iS + 1;
        return i < this.f8383f.length ? new fh.y(rzVarS, s(i)) : new fh.y(rzVarS);
    }

    public void f() {
        this.f8382c5++;
    }

    public long fb() {
        return v(1);
    }

    public boolean i9(int i) {
        return this.n3 == i || this.zn == i;
    }

    public void n3(long j) {
        if (this.f8386i9 == this.f8388t.length) {
            long[] jArr = this.f8383f;
            this.f8383f = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f8388t;
            this.f8388t = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f8383f;
        int i = this.f8386i9;
        jArr2[i] = j;
        this.f8388t[i] = this.f8382c5;
        this.f8386i9 = i + 1;
    }

    public final rz s(int i) {
        return new rz(((long) this.f8388t[i]) * fb(), this.f8383f[i]);
    }

    public boolean t() {
        return Arrays.binarySearch(this.f8388t, this.f8387s) >= 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean tl(tl tlVar) throws IOException {
        int i = this.f8384fb;
        int iV = i - this.y.v(tlVar, i, false);
        this.f8384fb = iV;
        boolean z = iV == 0;
        if (z) {
            if (this.f8381a > 0) {
                this.y.a(a(), t() ? 1 : 0, this.f8381a, 0, null);
            }
            y();
        }
        return z;
    }

    public final long v(int i) {
        return (this.f8385gv * ((long) i)) / ((long) this.f8389v);
    }

    public void wz(int i) {
        this.f8381a = i;
        this.f8384fb = i;
    }

    public void xc(long j) {
        if (this.f8386i9 == 0) {
            this.f8387s = 0;
        } else {
            this.f8387s = this.f8388t[ut.c5(this.f8383f, j, true, true)];
        }
    }

    public void y() {
        this.f8387s++;
    }

    public void zn() {
        this.f8383f = Arrays.copyOf(this.f8383f, this.f8386i9);
        this.f8388t = Arrays.copyOf(this.f8388t, this.f8386i9);
    }
}
