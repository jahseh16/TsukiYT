package xj1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import sj1.t;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f9207gv;
    public int n3;
    public final List<t> y;
    public boolean zn;

    public n3(List<t> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.y = connectionSpecs;
    }

    public final boolean n3(IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.f9207gv = true;
        return (!this.zn || (e4 instanceof ProtocolException) || (e4 instanceof InterruptedIOException) || ((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) || (e4 instanceof SSLPeerUnverifiedException) || !(e4 instanceof SSLException)) ? false : true;
    }

    public final t y(SSLSocket sslSocket) throws IOException {
        t tVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i = this.n3;
        int size = this.y.size();
        while (true) {
            if (i >= size) {
                tVar = null;
                break;
            }
            int i5 = i + 1;
            tVar = this.y.get(i);
            if (tVar.v(sslSocket)) {
                this.n3 = i5;
                break;
            }
            i = i5;
        }
        if (tVar != null) {
            this.zn = zn(sslSocket);
            tVar.zn(sslSocket, this.f9207gv);
            return tVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f9207gv);
        sb.append(", modes=");
        sb.append(this.y);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean zn(SSLSocket sSLSocket) {
        int i = this.n3;
        int size = this.y.size();
        while (i < size) {
            int i5 = i + 1;
            if (this.y.get(i).v(sSLSocket)) {
                return true;
            }
            i = i5;
        }
        return false;
    }
}
