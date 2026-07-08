package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface Dns {
    public static final y y = y.y;
    public static final Dns SYSTEM = new y.C0141y();

    public static final class y {
        public static final /* synthetic */ y y = new y();

        /* JADX INFO: renamed from: okhttp3.Dns$y$y, reason: collision with other inner class name */
        public static final class C0141y implements Dns {
            @Override // okhttp3.Dns
            public List<InetAddress> lookup(String hostname) throws UnknownHostException {
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
                    return ArraysKt.toList(allByName);
                } catch (NullPointerException e4) {
                    UnknownHostException unknownHostException = new UnknownHostException(Intrinsics.stringPlus("Broken system behaviour for dns lookup of ", hostname));
                    unknownHostException.initCause(e4);
                    throw unknownHostException;
                }
            }
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
