package a4;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import v3.zn;

/* JADX INFO: loaded from: classes.dex */
public class n3 {
    public static final zn y = new zn("SplitInstallHelper");

    public static void y(@NonNull Context context, @NonNull String str) throws UnsatisfiedLinkError {
        synchronized (hw.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e4) {
                String str2 = context.getApplicationInfo().nativeLibraryDir;
                String strMapLibraryName = System.mapLibraryName(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(strMapLibraryName).length());
                sb.append(str2);
                sb.append("/");
                sb.append(strMapLibraryName);
                String string = sb.toString();
                if (!new File(string).exists()) {
                    throw e4;
                }
                System.load(string);
            }
        }
    }
}
