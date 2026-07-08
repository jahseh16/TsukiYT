package v0;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class wz {
    public final SparseBooleanArray y;

    public static final class n3 {
        public boolean n3;
        public final SparseBooleanArray y = new SparseBooleanArray();

        public n3 gv(int i, boolean z) {
            return z ? y(i) : this;
        }

        public n3 n3(wz wzVar) {
            for (int i = 0; i < wzVar.gv(); i++) {
                y(wzVar.zn(i));
            }
            return this;
        }

        public wz v() {
            v0.y.fb(!this.n3);
            this.n3 = true;
            return new wz(this.y);
        }

        public n3 y(int i) {
            v0.y.fb(!this.n3);
            this.y.append(i, true);
            return this;
        }

        public n3 zn(int... iArr) {
            for (int i : iArr) {
                y(i);
            }
            return this;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz)) {
            return false;
        }
        wz wzVar = (wz) obj;
        if (ut.y >= 24) {
            return this.y.equals(wzVar.y);
        }
        if (gv() != wzVar.gv()) {
            return false;
        }
        for (int i = 0; i < gv(); i++) {
            if (zn(i) != wzVar.zn(i)) {
                return false;
            }
        }
        return true;
    }

    public int gv() {
        return this.y.size();
    }

    public int hashCode() {
        if (ut.y >= 24) {
            return this.y.hashCode();
        }
        int iGv = gv();
        for (int i = 0; i < gv(); i++) {
            iGv = (iGv * 31) + zn(i);
        }
        return iGv;
    }

    public boolean n3(int... iArr) {
        for (int i : iArr) {
            if (y(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean y(int i) {
        return this.y.get(i);
    }

    public int zn(int i) {
        v0.y.zn(i, 0, gv());
        return this.y.keyAt(i);
    }

    public wz(SparseBooleanArray sparseBooleanArray) {
        this.y = sparseBooleanArray;
    }
}
