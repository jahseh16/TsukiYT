package a4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fh {
    public final Context y;

    public fh(@NonNull Context context) {
        this.y = context;
    }

    public final SharedPreferences gv() {
        return this.y.getSharedPreferences("playcore_split_install_internal", 0);
    }

    public final void n3() {
        synchronized (fh.class) {
            gv().edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    public final Set y() {
        Set<String> hashSet;
        synchronized (fh.class) {
            try {
                hashSet = gv().getStringSet("modules_to_uninstall_if_emulated", new HashSet());
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
            if (hashSet == null) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }

    public final void zn(Collection collection) {
        synchronized (fh.class) {
            Set<String> setY = y();
            HashSet hashSet = new HashSet();
            boolean z = false;
            for (String str : setY) {
                if (collection.contains(str)) {
                    z = true;
                } else {
                    hashSet.add(str);
                }
            }
            if (z) {
                try {
                    gv().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }
}
