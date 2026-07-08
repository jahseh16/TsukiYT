package sj1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c5[] f8024a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final t f8025c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f8026f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final c5[] f8027fb;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final t f8028i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t f8029s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n3 f8030v = new n3(null);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final String[] f8031gv;
    public final boolean n3;
    public final boolean y;
    public final String[] zn;

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public n3() {
        }
    }

    static {
        c5 c5Var = c5.f7830c8;
        c5 c5Var2 = c5.f7846h;
        c5 c5Var3 = c5.f7852ia;
        c5 c5Var4 = c5.f7892vn;
        c5 c5Var5 = c5.f7895wm;
        c5 c5Var6 = c5.f7855j3;
        c5 c5Var7 = c5.f7869nd;
        c5 c5Var8 = c5.f7853im;
        c5 c5Var9 = c5.f7889uo;
        c5[] c5VarArr = {c5Var, c5Var2, c5Var3, c5Var4, c5Var5, c5Var6, c5Var7, c5Var8, c5Var9};
        f8024a = c5VarArr;
        c5[] c5VarArr2 = {c5Var, c5Var2, c5Var3, c5Var4, c5Var5, c5Var6, c5Var7, c5Var8, c5Var9, c5.f7844gq, c5.vp, c5.f7862lc, c5.f7871nf, c5.f7837ej, c5.f7825b, c5.f7884t};
        f8027fb = c5VarArr2;
        y yVarZn = new y(true).zn((c5[]) Arrays.copyOf(c5VarArr, c5VarArr.length));
        d dVar = d.TLS_1_3;
        d dVar2 = d.TLS_1_2;
        f8029s = yVarZn.i9(dVar, dVar2).s(true).y();
        f8025c5 = new y(true).zn((c5[]) Arrays.copyOf(c5VarArr2, c5VarArr2.length)).i9(dVar, dVar2).s(true).y();
        f8028i9 = new y(true).zn((c5[]) Arrays.copyOf(c5VarArr2, c5VarArr2.length)).i9(dVar, dVar2, d.TLS_1_1, d.TLS_1_0).s(true).y();
        f8026f = new y(false).y();
    }

    public t(boolean z, boolean z5, String[] strArr, String[] strArr2) {
        this.y = z;
        this.n3 = z5;
        this.zn = strArr;
        this.f8031gv = strArr2;
    }

    public final boolean a() {
        return this.y;
    }

    public final List<d> c5() {
        String[] strArr = this.f8031gv;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(d.y.y(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.y;
        t tVar = (t) obj;
        if (z != tVar.y) {
            return false;
        }
        return !z || (Arrays.equals(this.zn, tVar.zn) && Arrays.equals(this.f8031gv, tVar.f8031gv) && this.n3 == tVar.n3);
    }

    public final t fb(SSLSocket sSLSocket, boolean z) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.zn != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = tj1.gv.ta(enabledCipherSuites, this.zn, c5.n3.zn());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f8031gv != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = tj1.gv.ta(enabledProtocols, this.f8031gv, ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iF3 = tj1.gv.f3(supportedCipherSuites, "TLS_FALLBACK_SCSV", c5.n3.zn());
        if (z && iF3 != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iF3];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = tj1.gv.xc(cipherSuitesIntersection, str);
        }
        y yVar = new y(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        y yVarN3 = yVar.n3((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return yVarN3.c5((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).y();
    }

    public final List<c5> gv() {
        String[] strArr = this.zn;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(c5.n3.n3(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public int hashCode() {
        if (!this.y) {
            return 17;
        }
        String[] strArr = this.zn;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f8031gv;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.n3 ? 1 : 0);
    }

    public final boolean s() {
        return this.n3;
    }

    public String toString() {
        if (!this.y) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(gv(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(c5(), "[all enabled]")) + ", supportsTlsExtensions=" + this.n3 + ')';
    }

    public final boolean v(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.y) {
            return false;
        }
        String[] strArr = this.f8031gv;
        if (strArr != null && !tj1.gv.r(strArr, socket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.zn;
        return strArr2 == null || tj1.gv.r(strArr2, socket.getEnabledCipherSuites(), c5.n3.zn());
    }

    public final void zn(SSLSocket sslSocket, boolean z) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        t tVarFb = fb(sslSocket, z);
        if (tVarFb.c5() != null) {
            sslSocket.setEnabledProtocols(tVarFb.f8031gv);
        }
        if (tVarFb.gv() != null) {
            sslSocket.setEnabledCipherSuites(tVarFb.zn);
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f8032gv;
        public String[] n3;
        public boolean y;
        public String[] zn;

        public y(boolean z) {
            this.y = z;
        }

        public final void a(boolean z) {
            this.f8032gv = z;
        }

        public final y c5(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!gv()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            fb((String[]) tlsVersions.clone());
            return this;
        }

        public final void fb(String[] strArr) {
            this.zn = strArr;
        }

        public final boolean gv() {
            return this.y;
        }

        public final y i9(d... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!gv()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (d dVar : tlsVersions) {
                arrayList.add(dVar.n3());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return c5((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final y n3(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!gv()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            v((String[]) cipherSuites.clone());
            return this;
        }

        public final y s(boolean z) {
            if (!gv()) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            a(z);
            return this;
        }

        public final void v(String[] strArr) {
            this.n3 = strArr;
        }

        public final t y() {
            return new t(this.y, this.f8032gv, this.n3, this.zn);
        }

        public final y zn(c5... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!gv()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (c5 c5Var : cipherSuites) {
                arrayList.add(c5Var.zn());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return n3((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public y(t connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.y = connectionSpec.a();
            this.n3 = connectionSpec.zn;
            this.zn = connectionSpec.f8031gv;
            this.f8032gv = connectionSpec.s();
        }
    }
}
