package wn;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.net.CronetProviderInstaller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: wn.y$y, reason: collision with other inner class name */
    public static class C0192y implements Comparator<CronetProvider> {
        public final boolean y;

        public C0192y(boolean z) {
            this.y = z;
        }

        public static int n3(@Nullable String str, @Nullable String str2) {
            if (str != null && str2 != null) {
                String[] strArrRo = ut.ro(str, "\\.");
                String[] strArrRo2 = ut.ro(str2, "\\.");
                int iMin = Math.min(strArrRo.length, strArrRo2.length);
                for (int i = 0; i < iMin; i++) {
                    if (!strArrRo[i].equals(strArrRo2[i])) {
                        try {
                            return Integer.parseInt(strArrRo[i]) - Integer.parseInt(strArrRo2[i]);
                        } catch (NumberFormatException unused) {
                            return 0;
                        }
                    }
                }
            }
            return 0;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
            int iZn = zn(cronetProvider) - zn(cronetProvider2);
            return iZn != 0 ? iZn : -n3(cronetProvider.getVersion(), cronetProvider2.getVersion());
        }

        public final int zn(CronetProvider cronetProvider) {
            String name = cronetProvider.getName();
            if (CronetProvider.PROVIDER_NAME_APP_PACKAGED.equals(name)) {
                return 1;
            }
            if (CronetProviderInstaller.PROVIDER_NAME.equals(name)) {
                return this.y ? 0 : 2;
            }
            return 3;
        }
    }

    @Nullable
    public static CronetEngine y(Context context, @Nullable String str, boolean z) {
        ArrayList arrayList = new ArrayList(CronetProvider.getAllProviders(context));
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((CronetProvider) arrayList.get(size)).isEnabled() || CronetProvider.PROVIDER_NAME_FALLBACK.equals(((CronetProvider) arrayList.get(size)).getName())) {
                arrayList.remove(size);
            }
        }
        Collections.sort(arrayList, new C0192y(z));
        for (int i = 0; i < arrayList.size(); i++) {
            String name = ((CronetProvider) arrayList.get(i)).getName();
            try {
                CronetEngine.Builder builderCreateBuilder = ((CronetProvider) arrayList.get(i)).createBuilder();
                if (str != null) {
                    builderCreateBuilder.setUserAgent(str);
                }
                CronetEngine cronetEngineBuild = builderCreateBuilder.build();
                r.n3("CronetUtil", "CronetEngine built using " + name);
                return cronetEngineBuild;
            } catch (SecurityException unused) {
                r.c5("CronetUtil", "Failed to build CronetEngine. Please check that the process has android.permission.ACCESS_NETWORK_STATE.");
            } catch (UnsatisfiedLinkError unused2) {
                r.c5("CronetUtil", "Failed to link Cronet binaries. Please check that native Cronet binaries arebundled into your app.");
            }
        }
        r.c5("CronetUtil", "CronetEngine could not be built.");
        return null;
    }
}
