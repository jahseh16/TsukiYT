package z3;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import v3.oz;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public final a y;

    public n3(a aVar) {
        this.y = aVar;
    }

    public static final int zn(AssetManager assetManager, File file) {
        int iIntValue = ((Integer) oz.gv(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        StringBuilder sb = new StringBuilder(39);
        sb.append("addAssetPath completed with ");
        sb.append(iIntValue);
        Log.d("SplitCompat", sb.toString());
        return iIntValue;
    }

    public final synchronized boolean n3(Context context, Set set) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
        } catch (Exception e4) {
            e = e4;
            threadPolicy = null;
        }
        try {
            StrictMode.allowThreadDiskReads();
            StrictMode.allowThreadDiskWrites();
        } catch (Exception e5) {
            e = e5;
            Log.i("SplitCompat", "Unable to set up strict mode.", e);
        }
        try {
            try {
                HashSet hashSet = new HashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    hashSet.add(this.y.fb((String) it.next()));
                }
                y(context, hashSet);
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception e6) {
                Log.e("SplitCompat", "Error installing additional splits", e6);
                if (threadPolicy == null) {
                    return false;
                }
                StrictMode.setThreadPolicy(threadPolicy);
                return false;
            }
        } catch (Throwable th) {
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
            throw th;
        }
        return true;
    }

    public final synchronized void y(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zn(assets, (File) it.next());
        }
    }
}
