package ft;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ia extends y {
    public final Object[] c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final int f4873co;
    public final HashMap<Object, Integer> d0;
    public final int[] f3;
    public final xq[] n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f4874r;
    public final int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(Collection<? extends w9> collection, ur.u uVar) {
        super(false, uVar);
        int iZ = 0;
        int size = collection.size();
        this.f4874r = new int[size];
        this.f3 = new int[size];
        this.n = new xq[size];
        this.c = new Object[size];
        this.d0 = new HashMap<>();
        int iTl = 0;
        int i = 0;
        for (w9 w9Var : collection) {
            this.n[i] = w9Var.n3();
            this.f3[i] = iZ;
            this.f4874r[i] = iTl;
            iZ += this.n[i].z();
            iTl += this.n[i].tl();
            this.c[i] = w9Var.y();
            this.d0.put(this.c[i], Integer.valueOf(i));
            i++;
        }
        this.f4873co = iZ;
        this.z = iTl;
    }

    @Override // ft.y
    public xq ej(int i) {
        return this.n[i];
    }

    @Override // ft.y
    public int f3(int i) {
        return v0.ut.s(this.f4874r, i + 1, false, false);
    }

    @Override // ft.y
    public Object fh(int i) {
        return this.c[i];
    }

    @Override // ft.y
    public int i4(Object obj) {
        Integer num = this.d0.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // ft.y
    public int mg(int i) {
        return this.f4874r[i];
    }

    @Override // ft.y
    public int n(int i) {
        return v0.ut.s(this.f3, i + 1, false, false);
    }

    @Override // ft.y
    public int ta(int i) {
        return this.f3[i];
    }

    @Override // ft.xq
    public int tl() {
        return this.z;
    }

    public List<xq> ud() {
        return Arrays.asList(this.n);
    }

    @Override // ft.xq
    public int z() {
        return this.f4873co;
    }
}
