package uo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class yt {
    public boolean y = false;
    public final Set<n3> n3 = new x4.n3();
    public final Map<String, ic.s> zn = new HashMap();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Comparator<j5.gv<String, Float>> f8463gv = new y();

    public interface n3 {
        void y(float f3);
    }

    public class y implements Comparator<j5.gv<String, Float>> {
        public y() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int compare(j5.gv<String, Float> gvVar, j5.gv<String, Float> gvVar2) {
            float fFloatValue = gvVar.n3.floatValue();
            float fFloatValue2 = gvVar2.n3.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public void n3(boolean z) {
        this.y = z;
    }

    public void y(String str, float f3) {
        if (this.y) {
            ic.s sVar = this.zn.get(str);
            if (sVar == null) {
                sVar = new ic.s();
                this.zn.put(str, sVar);
            }
            sVar.y(f3);
            if (str.equals("__container")) {
                Iterator<n3> it = this.n3.iterator();
                while (it.hasNext()) {
                    it.next().y(f3);
                }
            }
        }
    }
}
