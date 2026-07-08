package yk;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9352a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @NonNull
    public Set<String> f9353gv;

    @NonNull
    public y n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public androidx.work.n3 f9354v;

    @NonNull
    public UUID y;

    @NonNull
    public androidx.work.n3 zn;

    public enum y {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean y() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public z(@NonNull UUID uuid, @NonNull y yVar, @NonNull androidx.work.n3 n3Var, @NonNull List<String> list, @NonNull androidx.work.n3 n3Var2, int i) {
        this.y = uuid;
        this.n3 = yVar;
        this.zn = n3Var;
        this.f9353gv = new HashSet(list);
        this.f9354v = n3Var2;
        this.f9352a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f9352a == zVar.f9352a && this.y.equals(zVar.y) && this.n3 == zVar.n3 && this.zn.equals(zVar.zn) && this.f9353gv.equals(zVar.f9353gv)) {
            return this.f9354v.equals(zVar.f9354v);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.y.hashCode() * 31) + this.n3.hashCode()) * 31) + this.zn.hashCode()) * 31) + this.f9353gv.hashCode()) * 31) + this.f9354v.hashCode()) * 31) + this.f9352a;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.y + "', mState=" + this.n3 + ", mOutputData=" + this.zn + ", mTags=" + this.f9353gv + ", mProgress=" + this.f9354v + '}';
    }
}
