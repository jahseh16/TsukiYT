package uj1;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Dns;
import sj1.d0;
import sj1.n3;
import sj1.r;
import sj1.rz;
import sj1.s;
import sj1.ta;
import sj1.xc;

/* JADX INFO: loaded from: classes.dex */
public final class y implements n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Dns f8393gv;

    /* JADX INFO: renamed from: uj1.y$y, reason: collision with other inner class name */
    public /* synthetic */ class C0183y {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            y = iArr;
        }
    }

    public y(Dns defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f8393gv = defaultDns;
    }

    public final InetAddress n3(Proxy proxy, r rVar, Dns dns) throws IOException {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0183y.y[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.first((List) dns.lookup(rVar.f()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // sj1.n3
    public d0 y(ta taVar, rz response) throws IOException {
        sj1.y yVarY;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        Intrinsics.checkNotNullParameter(response, "response");
        List<s> listW = response.w();
        d0 d0VarF7 = response.f7();
        r rVarT = d0VarF7.t();
        boolean z = response.p() == 407;
        Proxy proxy = taVar == null ? null : taVar.n3();
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (s sVar : listW) {
            if (StringsKt.equals("Basic", sVar.zn(), true)) {
                Dns dnsZn = (taVar == null || (yVarY = taVar.y()) == null) ? null : yVarY.zn();
                if (dnsZn == null) {
                    dnsZn = this.f8393gv;
                }
                if (z) {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (socketAddressAddress == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, n3(proxy, rVarT, dnsZn), inetSocketAddress.getPort(), rVarT.x4(), sVar.n3(), sVar.zn(), rVarT.f3(), Authenticator.RequestorType.PROXY);
                } else {
                    String strF = rVarT.f();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strF, n3(proxy, rVarT, dnsZn), rVarT.mt(), rVarT.x4(), sVar.n3(), sVar.zn(), rVarT.f3(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return d0VarF7.c5().c5(str, xc.y(userName, new String(password), sVar.y())).n3();
                }
            }
        }
        return null;
    }

    public /* synthetic */ y(Dns dns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dns.SYSTEM : dns);
    }
}
