package mj1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class rs extends qk<String> {
    public abstract String en(String str, String str2);

    public String jz(kj1.a desc, int i) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return desc.v(i);
    }

    @Override // mj1.qk
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final String ut(kj1.a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return y5(jz(aVar, i));
    }

    public final String y5(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String strOz = oz();
        if (strOz == null) {
            strOz = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        return en(strOz, nestedName);
    }
}
