package sj1;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final Map<String, String> n3;
    public final String y;

    public s(String scheme, Map<String, String> authParams) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.y = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                lowerCase = null;
            } else {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = key.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.n3 = mapUnmodifiableMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (Intrinsics.areEqual(sVar.y, this.y) && Intrinsics.areEqual(sVar.n3, this.n3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.y.hashCode()) * 31) + this.n3.hashCode();
    }

    public final String n3() {
        return this.n3.get("realm");
    }

    public String toString() {
        return this.y + " authParams=" + this.n3;
    }

    public final Charset y() {
        String str = this.n3.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String zn() {
        return this.y;
    }
}
