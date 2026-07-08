package qb;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class gv {
    public static boolean y(File file) {
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!y(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }
}
