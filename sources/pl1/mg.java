package pl1;

import android.os.Build;
import java.util.concurrent.Executor;
import pl1.d;
import pl1.zn;

/* JADX INFO: loaded from: classes.dex */
public final class mg {
    public static final d n3;
    public static final Executor y;
    public static final zn zn;

    static {
        String property = System.getProperty("java.vm.name");
        property.hashCode();
        if (property.equals("RoboVM")) {
            y = null;
            n3 = new d();
            zn = new zn();
        } else {
            if (!property.equals("Dalvik")) {
                y = null;
                n3 = new d.n3();
                zn = new zn.y();
                return;
            }
            y = new y();
            if (Build.VERSION.SDK_INT >= 24) {
                n3 = new d.y();
                zn = new zn.y();
            } else {
                n3 = new d();
                zn = new zn();
            }
        }
    }
}
