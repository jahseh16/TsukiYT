package sj1;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ta {
    public final Proxy n3;
    public final y y;
    public final InetSocketAddress zn;

    public ta(y address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.y = address;
        this.n3 = proxy;
        this.zn = socketAddress;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ta) {
            ta taVar = (ta) obj;
            if (Intrinsics.areEqual(taVar.y, this.y) && Intrinsics.areEqual(taVar.n3, this.n3) && Intrinsics.areEqual(taVar.zn, this.zn)) {
                return true;
            }
        }
        return false;
    }

    public final InetSocketAddress gv() {
        return this.zn;
    }

    public int hashCode() {
        return ((((527 + this.y.hashCode()) * 31) + this.n3.hashCode()) * 31) + this.zn.hashCode();
    }

    public final Proxy n3() {
        return this.n3;
    }

    public String toString() {
        return "Route{" + this.zn + '}';
    }

    public final y y() {
        return this.y;
    }

    public final boolean zn() {
        return this.y.f() != null && this.n3.type() == Proxy.Type.HTTP;
    }
}
