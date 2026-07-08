package w2;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class mt {
    public View n3;
    public final Map<String, Object> y = new HashMap();
    public final ArrayList<f> zn = new ArrayList<>();

    @Deprecated
    public mt() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mt)) {
            return false;
        }
        mt mtVar = (mt) obj;
        return this.n3 == mtVar.n3 && this.y.equals(mtVar.y);
    }

    public int hashCode() {
        return (this.n3.hashCode() * 31) + this.y.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.n3 + "\n") + "    values:";
        for (String str2 : this.y.keySet()) {
            str = str + "    " + str2 + ": " + this.y.get(str2) + "\n";
        }
        return str;
    }

    public mt(@NonNull View view) {
        this.n3 = view;
    }
}
