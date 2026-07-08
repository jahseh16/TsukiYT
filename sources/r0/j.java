package r0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7502a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public DatagramSocket f7503c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public InetAddress f7504f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final DatagramPacket f7505fb;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public MulticastSocket f7506i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Uri f7507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7508t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f7509tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f7510v;

    public static final class y extends wz {
        public y(Throwable th, int i) {
            super(th, i);
        }
    }

    public j() {
        this(2000);
    }

    @Override // r0.tl
    public void close() {
        this.f7507s = null;
        MulticastSocket multicastSocket = this.f7506i9;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) v0.y.v(this.f7504f));
            } catch (IOException unused) {
            }
            this.f7506i9 = null;
        }
        DatagramSocket datagramSocket = this.f7503c5;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f7503c5 = null;
        }
        this.f7504f = null;
        this.f7509tl = 0;
        if (this.f7508t) {
            this.f7508t = false;
            r();
        }
    }

    public int gv() {
        DatagramSocket datagramSocket = this.f7503c5;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        return this.f7507s;
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) throws y {
        if (i5 == 0) {
            return 0;
        }
        if (this.f7509tl == 0) {
            try {
                ((DatagramSocket) v0.y.v(this.f7503c5)).receive(this.f7505fb);
                int length = this.f7505fb.getLength();
                this.f7509tl = length;
                p(length);
            } catch (SocketTimeoutException e4) {
                throw new y(e4, 2002);
            } catch (IOException e5) {
                throw new y(e5, 2001);
            }
        }
        int length2 = this.f7505fb.getLength();
        int i8 = this.f7509tl;
        int iMin = Math.min(i8, i5);
        System.arraycopy(this.f7502a, length2 - i8, bArr, i, iMin);
        this.f7509tl -= iMin;
        return iMin;
    }

    @Override // r0.tl
    public long y(p pVar) throws y {
        Uri uri = pVar.y;
        this.f7507s = uri;
        String str = (String) v0.y.v(uri.getHost());
        int port = this.f7507s.getPort();
        x4(pVar);
        try {
            this.f7504f = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f7504f, port);
            if (this.f7504f.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f7506i9 = multicastSocket;
                multicastSocket.joinGroup(this.f7504f);
                this.f7503c5 = this.f7506i9;
            } else {
                this.f7503c5 = new DatagramSocket(inetSocketAddress);
            }
            this.f7503c5.setSoTimeout(this.f7510v);
            this.f7508t = true;
            i4(pVar);
            return -1L;
        } catch (IOException e4) {
            throw new y(e4, 2001);
        } catch (SecurityException e5) {
            throw new y(e5, 2006);
        }
    }

    public j(int i) {
        this(i, 8000);
    }

    public j(int i, int i5) {
        super(true);
        this.f7510v = i5;
        byte[] bArr = new byte[i];
        this.f7502a = bArr;
        this.f7505fb = new DatagramPacket(bArr, 0, i);
    }
}
