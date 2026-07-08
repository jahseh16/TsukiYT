package z3;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class zn extends z {
    public final String n3;
    public final File y;

    public zn(File file, String str) {
        if (file == null) {
            throw new NullPointerException("Null splitFile");
        }
        this.y = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.n3 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.y.equals(zVar.y()) && this.n3.equals(zVar.n3())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.y.hashCode() ^ 1000003) * 1000003) ^ this.n3.hashCode();
    }

    @Override // z3.z
    @NonNull
    public final String n3() {
        return this.n3;
    }

    public final String toString() {
        String string = this.y.toString();
        String str = this.n3;
        StringBuilder sb = new StringBuilder(string.length() + 35 + str.length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(string);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // z3.z
    @NonNull
    public final File y() {
        return this.y;
    }
}
