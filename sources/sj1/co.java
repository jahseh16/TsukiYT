package sj1;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class co {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f7905v = new y(null);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Lazy f7906gv;
    public final c5 n3;
    public final d y;
    public final List<Certificate> zn;

    public static final class n3 extends Lambda implements Function0<List<? extends Certificate>> {
        final /* synthetic */ Function0<List<Certificate>> $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n3(Function0<? extends List<? extends Certificate>> function0) {
            super(0);
            this.$peerCertificatesFn = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            try {
                return this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt.emptyList();
            }
        }
    }

    public static final class y {

        public static final class n3 extends Lambda implements Function0<List<? extends Certificate>> {
            final /* synthetic */ List<Certificate> $peerCertificatesCopy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public n3(List<? extends Certificate> list) {
                super(0);
                this.$peerCertificatesCopy = list;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final List<Certificate> invoke() {
                return this.$peerCertificatesCopy;
            }
        }

        /* JADX INFO: renamed from: sj1.co$y$y, reason: collision with other inner class name */
        public static final class C0161y extends Lambda implements Function0<List<? extends Certificate>> {
            final /* synthetic */ List<Certificate> $peerCertificatesCopy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0161y(List<? extends Certificate> list) {
                super(0);
                this.$peerCertificatesCopy = list;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final List<Certificate> invoke() {
                return this.$peerCertificatesCopy;
            }
        }

        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final co n3(d tlsVersion, c5 cipherSuite, List<? extends Certificate> peerCertificates, List<? extends Certificate> localCertificates) {
            Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
            Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
            Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
            Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
            return new co(tlsVersion, cipherSuite, tj1.gv.oz(localCertificates), new C0161y(tj1.gv.oz(peerCertificates)));
        }

        public final co y(SSLSession sSLSession) throws IOException {
            List<Certificate> listEmptyList;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(Intrinsics.stringPlus("cipherSuite == ", cipherSuite));
            }
            c5 c5VarN3 = c5.n3.n3(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            d dVarY = d.y.y(protocol);
            try {
                listEmptyList = zn(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return new co(dVarY, c5VarN3, zn(sSLSession.getLocalCertificates()), new n3(listEmptyList));
        }

        public final List<Certificate> zn(Certificate[] certificateArr) {
            return certificateArr != null ? tj1.gv.i4(Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt.emptyList();
        }

        public y() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public co(d tlsVersion, c5 cipherSuite, List<? extends Certificate> localCertificates, Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.y = tlsVersion;
        this.n3 = cipherSuite;
        this.zn = localCertificates;
        this.f7906gv = LazyKt.lazy(new n3(peerCertificatesFn));
    }

    public final Principal a() {
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) v());
        X509Certificate x509Certificate = objFirstOrNull instanceof X509Certificate ? (X509Certificate) objFirstOrNull : null;
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    public boolean equals(Object obj) {
        if (obj instanceof co) {
            co coVar = (co) obj;
            if (coVar.y == this.y && Intrinsics.areEqual(coVar.n3, this.n3) && Intrinsics.areEqual(coVar.v(), v()) && Intrinsics.areEqual(coVar.zn, this.zn)) {
                return true;
            }
        }
        return false;
    }

    public final d fb() {
        return this.y;
    }

    public final Principal gv() {
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) this.zn);
        X509Certificate x509Certificate = objFirstOrNull instanceof X509Certificate ? (X509Certificate) objFirstOrNull : null;
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    public int hashCode() {
        return ((((((527 + this.y.hashCode()) * 31) + this.n3.hashCode()) * 31) + v().hashCode()) * 31) + this.zn.hashCode();
    }

    public final String n3(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    public String toString() {
        List<Certificate> listV = v();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listV, 10));
        Iterator<T> it = listV.iterator();
        while (it.hasNext()) {
            arrayList.add(n3((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.y);
        sb.append(" cipherSuite=");
        sb.append(this.n3);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.zn;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(n3((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    public final List<Certificate> v() {
        return (List) this.f7906gv.getValue();
    }

    public final c5 y() {
        return this.n3;
    }

    public final List<Certificate> zn() {
        return this.zn;
    }
}
