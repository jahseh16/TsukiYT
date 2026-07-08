package fk1;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y extends zn {
    public static final C0089y zn = new C0089y(null);
    public final v n3;

    /* JADX INFO: renamed from: fk1.y$y, reason: collision with other inner class name */
    public static final class C0089y {
        public /* synthetic */ C0089y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0089y() {
        }
    }

    public y(v trustRootIndex) {
        Intrinsics.checkNotNullParameter(trustRootIndex, "trustRootIndex");
        this.n3 = trustRootIndex;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.areEqual(((y) obj).n3, this.n3);
    }

    public int hashCode() {
        return this.n3.hashCode();
    }

    public final boolean n3(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!Intrinsics.areEqual(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // fk1.zn
    public List<Certificate> y(List<? extends Certificate> chain, String hostname) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            i++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateY = this.n3.y(x509Certificate);
            if (x509CertificateY == null) {
                Iterator it = arrayDeque.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (n3(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(Intrinsics.stringPlus("Failed to find a trusted cert that signed ", x509Certificate));
            }
            if (arrayList.size() > 1 || !Intrinsics.areEqual(x509Certificate, x509CertificateY)) {
                arrayList.add(x509CertificateY);
            }
            if (n3(x509CertificateY, x509CertificateY)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException(Intrinsics.stringPlus("Certificate chain too long: ", arrayList));
    }
}
