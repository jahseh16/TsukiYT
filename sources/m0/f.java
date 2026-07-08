package m0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class f implements b0.c5 {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final long[] f6472fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long[] f6473v;
    public final List<v> y;

    public f(List<v> list) {
        this.y = Collections.unmodifiableList(new ArrayList(list));
        this.f6473v = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            v vVar = list.get(i);
            int i5 = i * 2;
            long[] jArr = this.f6473v;
            jArr[i5] = vVar.n3;
            jArr[i5 + 1] = vVar.zn;
        }
        long[] jArr2 = this.f6473v;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f6472fb = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public static /* synthetic */ int a(v vVar, v vVar2) {
        return Long.compare(vVar.n3, vVar2.n3);
    }

    @Override // b0.c5
    public int gv() {
        return this.f6472fb.length;
    }

    @Override // b0.c5
    public List<b0.n3> n3(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.y.size(); i++) {
            long[] jArr = this.f6473v;
            int i5 = i * 2;
            if (jArr[i5] <= j && j < jArr[i5 + 1]) {
                v vVar = this.y.get(i);
                b0.n3 n3Var = vVar.y;
                if (n3Var.f1202f == -3.4028235E38f) {
                    arrayList2.add(vVar);
                } else {
                    arrayList.add(n3Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: m0.i9
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f.a((v) obj, (v) obj2);
            }
        });
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            arrayList.add(((v) arrayList2.get(i8)).y.n3().s((-1) - i8, 1).y());
        }
        return arrayList;
    }

    @Override // b0.c5
    public int y(long j) {
        int iV = ut.v(this.f6472fb, j, false, false);
        if (iV < this.f6472fb.length) {
            return iV;
        }
        return -1;
    }

    @Override // b0.c5
    public long zn(int i) {
        v0.y.y(i >= 0);
        v0.y.y(i < this.f6472fb.length);
        return this.f6472fb[i];
    }
}
