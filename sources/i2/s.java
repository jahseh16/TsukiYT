package i2;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public static final String y = yk.f.a("WrkDbPathHelper");
    public static final String[] n3 = {"-journal", "-shm", "-wal"};

    @NonNull
    public static Map<File, File> a(@NonNull Context context) {
        HashMap map = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File fileN3 = n3(context);
            File fileY = y(context);
            map.put(fileN3, fileY);
            for (String str : n3) {
                map.put(new File(fileN3.getPath() + str), new File(fileY.getPath() + str));
            }
        }
        return map;
    }

    @NonNull
    public static String gv() {
        return "androidx.work.workdb";
    }

    @NonNull
    public static File n3(@NonNull Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    public static void v(@NonNull Context context) {
        File fileN3 = n3(context);
        if (Build.VERSION.SDK_INT < 23 || !fileN3.exists()) {
            return;
        }
        yk.f.zn().y(y, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        Map<File, File> mapA = a(context);
        for (File file : mapA.keySet()) {
            File file2 = mapA.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    yk.f.zn().s(y, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                yk.f.zn().y(y, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }

    @NonNull
    public static File y(@NonNull Context context) {
        return Build.VERSION.SDK_INT < 23 ? n3(context) : zn(context, "androidx.work.workdb");
    }

    public static File zn(@NonNull Context context, @NonNull String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }
}
