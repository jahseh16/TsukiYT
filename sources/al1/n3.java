package al1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public static final String y(KClass<?> clazz, gl1.y yVar, gl1.y scopeQualifier) {
        String value;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        String str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        if (yVar != null && (value = yVar.getValue()) != null) {
            str = value;
        }
        return ll1.y.y(clazz) + ':' + str + ':' + scopeQualifier;
    }
}
