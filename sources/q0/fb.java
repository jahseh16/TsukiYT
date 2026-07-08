package q0;

import android.graphics.Color;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class fb {
    public static String n3(int i) {
        return ut.rz("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }

    public static String y(String str) {
        return "." + str + ",." + str + " *";
    }
}
