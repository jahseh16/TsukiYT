package ne;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public class n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f6937gv;
    public boolean n3;
    public boolean y;
    public boolean zn;

    public n3(boolean z, boolean z5, boolean z7, boolean z8) {
        this.y = z;
        this.n3 = z5;
        this.zn = z7;
        this.f6937gv = z8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.y == n3Var.y && this.n3 == n3Var.n3 && this.zn == n3Var.zn && this.f6937gv == n3Var.f6937gv;
    }

    public boolean gv() {
        return this.n3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.y;
        int i = r02;
        if (this.n3) {
            i = r02 + 16;
        }
        int i5 = i;
        if (this.zn) {
            i5 = i + NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return this.f6937gv ? i5 + 4096 : i5;
    }

    public boolean n3() {
        return this.zn;
    }

    @NonNull
    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.y), Boolean.valueOf(this.n3), Boolean.valueOf(this.zn), Boolean.valueOf(this.f6937gv));
    }

    public boolean y() {
        return this.y;
    }

    public boolean zn() {
        return this.f6937gv;
    }
}
