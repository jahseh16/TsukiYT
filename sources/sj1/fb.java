package sj1;

import hk1.s;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class fb {
    public final fk1.zn n3;
    public final Set<zn> y;
    public static final n3 zn = new n3(null);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final fb f7928gv = new y().y();

    public static final class gv extends Lambda implements Function0<List<? extends X509Certificate>> {
        final /* synthetic */ String $hostname;
        final /* synthetic */ List<Certificate> $peerCertificates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public gv(List<? extends Certificate> list, String str) {
            super(0);
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            fk1.zn znVarGv = fb.this.gv();
            List<Certificate> listY = znVarGv == null ? null : znVarGv.y(this.$peerCertificates, this.$hostname);
            if (listY == null) {
                listY = this.$peerCertificates;
            }
            List<Certificate> list = listY;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hk1.s n3(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            s.y yVar = hk1.s.fb;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return s.y.a(yVar, encoded, 0, 0, 3, (Object) null).jz();
        }

        public final String y(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return Intrinsics.stringPlus("sha256/", zn((X509Certificate) certificate).y());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }

        public final hk1.s zn(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            s.y yVar = hk1.s.fb;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return s.y.a(yVar, encoded, 0, 0, 3, (Object) null).u();
        }

        public n3() {
        }
    }

    public static final class y {
        public final List<zn> y = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final fb y() {
            return new fb(CollectionsKt.toSet(this.y), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class zn {
        public final String n3;
        public final String y;
        public final hk1.s zn;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zn)) {
                return false;
            }
            zn znVar = (zn) obj;
            return Intrinsics.areEqual(this.y, znVar.y) && Intrinsics.areEqual(this.n3, znVar.n3) && Intrinsics.areEqual(this.zn, znVar.zn);
        }

        public int hashCode() {
            return (((this.y.hashCode() * 31) + this.n3.hashCode()) * 31) + this.zn.hashCode();
        }

        public final String n3() {
            return this.n3;
        }

        public String toString() {
            return this.n3 + '/' + this.zn.y();
        }

        public final hk1.s y() {
            return this.zn;
        }

        public final boolean zn(String hostname) {
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            if (StringsKt.startsWith$default(this.y, "**.", false, 2, (Object) null)) {
                int length = this.y.length() - 3;
                int length2 = hostname.length() - length;
                if (!StringsKt.regionMatches(hostname, hostname.length() - length, this.y, 3, length, (16 & 16) != 0 ? false : false)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!StringsKt.startsWith$default(this.y, "*.", false, 2, (Object) null)) {
                    return Intrinsics.areEqual(hostname, this.y);
                }
                int length3 = this.y.length() - 1;
                int length4 = hostname.length() - length3;
                if (!StringsKt.regionMatches(hostname, hostname.length() - length3, this.y, 1, length3, (16 & 16) != 0 ? false : false) || StringsKt.lastIndexOf$default((CharSequence) hostname, '.', length4 - 1, false, 4, (Object) null) != -1) {
                    return false;
                }
            }
            return true;
        }
    }

    public fb(Set<zn> pins, fk1.zn znVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.y = pins;
        this.n3 = znVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof fb) {
            fb fbVar = (fb) obj;
            if (Intrinsics.areEqual(fbVar.y, this.y) && Intrinsics.areEqual(fbVar.n3, this.n3)) {
                return true;
            }
        }
        return false;
    }

    public final fk1.zn gv() {
        return this.n3;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.y.hashCode()) * 41;
        fk1.zn znVar = this.n3;
        return iHashCode + (znVar != null ? znVar.hashCode() : 0);
    }

    public final void n3(String hostname, Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<zn> listZn = zn(hostname);
        if (listZn.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            hk1.s sVarZn = null;
            hk1.s sVarN3 = null;
            for (zn znVar : listZn) {
                String strN3 = znVar.n3();
                if (Intrinsics.areEqual(strN3, "sha256")) {
                    if (sVarZn == null) {
                        sVarZn = zn.zn(x509Certificate);
                    }
                    if (Intrinsics.areEqual(znVar.y(), sVarZn)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.areEqual(strN3, "sha1")) {
                        throw new AssertionError(Intrinsics.stringPlus("unsupported hashAlgorithm: ", znVar.n3()));
                    }
                    if (sVarN3 == null) {
                        sVarN3 = zn.n3(x509Certificate);
                    }
                    if (Intrinsics.areEqual(znVar.y(), sVarN3)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb.append("\n    ");
            sb.append(zn.y(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        for (zn znVar2 : listZn) {
            sb.append("\n    ");
            sb.append(znVar2);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final fb v(fk1.zn certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.n3, certificateChainCleaner) ? this : new fb(this.y, certificateChainCleaner);
    }

    public final void y(String hostname, List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        n3(hostname, new gv(peerCertificates, hostname));
    }

    public final List<zn> zn(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set<zn> set = this.y;
        List<zn> listEmptyList = CollectionsKt.emptyList();
        for (Object obj : set) {
            if (((zn) obj).zn(hostname)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                TypeIntrinsics.asMutableList(listEmptyList).add(obj);
            }
        }
        return listEmptyList;
    }

    public /* synthetic */ fb(Set set, fk1.zn znVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : znVar);
    }
}
