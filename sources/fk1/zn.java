package fk1;

import ck1.i9;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn {
    public static final y y = new y(null);

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zn y(X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return i9.y.fb().zn(trustManager);
        }

        public y() {
        }
    }

    public abstract List<Certificate> y(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException;
}
