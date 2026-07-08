package v3;

import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class k5 implements fh {
    @Override // v3.fh
    public final boolean y(Object obj, File file, File file2) {
        try {
            return !((Boolean) oz.a(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
