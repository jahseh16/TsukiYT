package fk1;

import hk1.u;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements HostnameVerifier {
    public static final gv y = new gv();

    public final boolean a(String str, String str2) {
        if (str != null && str.length() != 0 && !StringsKt.startsWith$default(str, ".", false, 2, (Object) null) && !StringsKt.endsWith$default(str, "..", false, 2, (Object) null) && str2 != null && str2.length() != 0 && !StringsKt.startsWith$default(str2, ".", false, 2, (Object) null) && !StringsKt.endsWith$default(str2, "..", false, 2, (Object) null)) {
            if (!StringsKt.endsWith$default(str, ".", false, 2, (Object) null)) {
                str = Intrinsics.stringPlus(str, ".");
            }
            String str3 = str;
            if (!StringsKt.endsWith$default(str2, ".", false, 2, (Object) null)) {
                str2 = Intrinsics.stringPlus(str2, ".");
            }
            String strN3 = n3(str2);
            if (!StringsKt.contains$default((CharSequence) strN3, (CharSequence) "*", false, 2, (Object) null)) {
                return Intrinsics.areEqual(str3, strN3);
            }
            if (!StringsKt.startsWith$default(strN3, "*.", false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) strN3, '*', 1, false, 4, (Object) null) != -1 || str3.length() < strN3.length() || Intrinsics.areEqual("*.", strN3)) {
                return false;
            }
            String strSubstring = strN3.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!StringsKt.endsWith$default(str3, strSubstring, false, 2, (Object) null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || StringsKt.lastIndexOf$default((CharSequence) str3, '.', length + (-1), false, 4, (Object) null) == -1;
        }
        return false;
    }

    public final boolean fb(String str, X509Certificate x509Certificate) {
        String strN3 = n3(str);
        List<String> listZn = zn(x509Certificate, 2);
        if ((listZn instanceof Collection) && listZn.isEmpty()) {
            return false;
        }
        Iterator<T> it = listZn.iterator();
        while (it.hasNext()) {
            if (y.a(strN3, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean gv(String str) {
        return str.length() == ((int) u.n3(str, 0, 0, 3, (Object) null));
    }

    public final String n3(String str) {
        if (!gv(str)) {
            return str;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final boolean s(String str, X509Certificate x509Certificate) {
        String strV = tj1.y.v(str);
        List<String> listZn = zn(x509Certificate, 7);
        if ((listZn instanceof Collection) && listZn.isEmpty()) {
            return false;
        }
        Iterator<T> it = listZn.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(strV, tj1.y.v((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final boolean v(String host, X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return tj1.gv.c5(host) ? s(host, certificate) : fb(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!gv(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return v(host, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }

    public final List<String> y(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt.plus((Collection) zn(certificate, 7), (Iterable) zn(certificate, 2));
    }

    public final List<String> zn(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }
}
