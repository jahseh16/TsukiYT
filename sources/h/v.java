package h;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class v {
    public static final v zn = new v("COMPOSITION");

    @Nullable
    public a n3;
    public final List<String> y;

    public v(String... strArr) {
        this.y = Arrays.asList(strArr);
    }

    public final boolean a(String str) {
        return "__container".equals(str);
    }

    public v c5(a aVar) {
        v vVar = new v(this);
        vVar.n3 = aVar;
        return vVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.y.equals(vVar.y)) {
            return false;
        }
        a aVar = this.n3;
        a aVar2 = vVar.n3;
        return aVar != null ? aVar.equals(aVar2) : aVar2 == null;
    }

    public boolean fb(String str, int i) {
        if (a(str)) {
            return true;
        }
        if (i >= this.y.size()) {
            return false;
        }
        return this.y.get(i).equals(str) || this.y.get(i).equals("**") || this.y.get(i).equals("*");
    }

    @Nullable
    public a gv() {
        return this.n3;
    }

    public int hashCode() {
        int iHashCode = this.y.hashCode() * 31;
        a aVar = this.n3;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final boolean n3() {
        return this.y.get(r0.size() - 1).equals("**");
    }

    public boolean s(String str, int i) {
        return "__container".equals(str) || i < this.y.size() - 1 || this.y.get(i).equals("**");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.y);
        sb.append(",resolved=");
        sb.append(this.n3 != null);
        sb.append('}');
        return sb.toString();
    }

    public int v(String str, int i) {
        if (a(str)) {
            return 0;
        }
        if (this.y.get(i).equals("**")) {
            return (i != this.y.size() - 1 && this.y.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    @CheckResult
    public v y(String str) {
        v vVar = new v(this);
        vVar.y.add(str);
        return vVar;
    }

    public boolean zn(String str, int i) {
        if (i >= this.y.size()) {
            return false;
        }
        boolean z = i == this.y.size() - 1;
        String str2 = this.y.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.y.size() + (-2) && n3())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.y.get(i + 1).equals(str)) {
            return i == this.y.size() + (-2) || (i == this.y.size() + (-3) && n3());
        }
        if (z) {
            return true;
        }
        int i5 = i + 1;
        if (i5 < this.y.size() - 1) {
            return false;
        }
        return this.y.get(i5).equals(str);
    }

    public v(v vVar) {
        this.y = new ArrayList(vVar.y);
        this.n3 = vVar.n3;
    }
}
