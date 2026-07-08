package mj1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class eb extends qj<String> {
    public abstract String jz(String str, String str2);

    public String u(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.v(i);
    }

    public final String xg(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String strQ9 = q9();
        if (strQ9 == null) {
            strQ9 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        return jz(strQ9, nestedName);
    }

    @Override // mj1.qj
    /* JADX INFO: renamed from: y5, reason: merged with bridge method [inline-methods] */
    public final String k(kj1.a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return xg(u(aVar, i));
    }
}
