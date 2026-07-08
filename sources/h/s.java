package h;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public final float n3;
    public final String y;
    public final float zn;

    public s(String str, float f3, float f4) {
        this.y = str;
        this.zn = f4;
        this.n3 = f3;
    }

    public boolean y(String str) {
        if (this.y.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.y.endsWith("\r")) {
            String str2 = this.y;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
