package ur;

/* JADX INFO: loaded from: classes.dex */
public class s implements jz {
    public final jz[] y;

    public s(jz[] jzVarArr) {
        this.y = jzVarArr;
    }

    @Override // ur.jz
    public final long fb() {
        long jMin = Long.MAX_VALUE;
        for (jz jzVar : this.y) {
            long jFb = jzVar.fb();
            if (jFb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jFb);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // ur.jz
    public final void s(long j) {
        for (jz jzVar : this.y) {
            jzVar.s(j);
        }
    }

    @Override // ur.jz
    public boolean v(long j) {
        boolean zV;
        boolean z = false;
        do {
            long jZn = zn();
            if (jZn == Long.MIN_VALUE) {
                break;
            }
            zV = false;
            for (jz jzVar : this.y) {
                long jZn2 = jzVar.zn();
                boolean z5 = jZn2 != Long.MIN_VALUE && jZn2 <= j;
                if (jZn2 == jZn || z5) {
                    zV |= jzVar.v(j);
                }
            }
            z |= zV;
        } while (zV);
        return z;
    }

    @Override // ur.jz
    public boolean y() {
        for (jz jzVar : this.y) {
            if (jzVar.y()) {
                return true;
            }
        }
        return false;
    }

    @Override // ur.jz
    public final long zn() {
        long jMin = Long.MAX_VALUE;
        for (jz jzVar : this.y) {
            long jZn = jzVar.zn();
            if (jZn != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZn);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
