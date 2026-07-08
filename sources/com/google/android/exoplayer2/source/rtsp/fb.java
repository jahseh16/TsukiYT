package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import ft.q;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k4.r;
import r0.ta;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements Closeable {
    public static final Charset w = g4.v.zn;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Socket f1815f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0055fb f1817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f1818t;
    public final gv y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ta f1819v = new ta("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Map<Integer, n3> f1816fb = Collections.synchronizedMap(new HashMap());

    public final class a implements ta.v {
        public final v n3 = new v();
        public final DataInputStream y;
        public volatile boolean zn;

        public a(InputStream inputStream) {
            this.y = new DataInputStream(inputStream);
        }

        @Override // r0.ta.v
        public void f() {
            this.zn = true;
        }

        @Override // r0.ta.v
        public void i9() throws IOException {
            while (!this.zn) {
                byte b4 = this.y.readByte();
                if (b4 == 36) {
                    y();
                } else {
                    n3(b4);
                }
            }
        }

        public final void n3(byte b4) throws IOException {
            if (fb.this.f1818t) {
                return;
            }
            fb.this.y.zn(this.n3.zn(b4, this.y));
        }

        public final void y() throws IOException {
            int unsignedByte = this.y.readUnsignedByte();
            int unsignedShort = this.y.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            this.y.readFully(bArr, 0, unsignedShort);
            n3 n3Var = (n3) fb.this.f1816fb.get(Integer.valueOf(unsignedByte));
            if (n3Var == null || fb.this.f1818t) {
                return;
            }
            n3Var.c5(bArr);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.fb$fb, reason: collision with other inner class name */
    public final class C0055fb implements Closeable {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final Handler f1821fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final HandlerThread f1823v;
        public final OutputStream y;

        public C0055fb(OutputStream outputStream) {
            this.y = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f1823v = handlerThread;
            handlerThread.start();
            this.f1821fb = new Handler(handlerThread.getLooper());
        }

        public final /* synthetic */ void a(byte[] bArr, List list) {
            try {
                this.y.write(bArr);
            } catch (Exception e4) {
                if (fb.this.f1818t) {
                    return;
                }
                fb.this.y.n3(list, e4);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f1821fb;
            final HandlerThread handlerThread = this.f1823v;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: hx.mt
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f1823v.join();
            } catch (InterruptedException unused) {
                this.f1823v.interrupt();
            }
        }

        public void t(final List<String> list) {
            final byte[] bArrN3 = s.n3(list);
            this.f1821fb.post(new Runnable() { // from class: hx.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.y.a(bArrN3, list);
                }
            });
        }
    }

    public interface gv {
        void n3(List<String> list, Exception exc);

        void y(Exception exc);

        void zn(List<String> list);
    }

    public interface n3 {
        void c5(byte[] bArr);
    }

    public static final class v {
        public long zn;
        public final List<String> y = new ArrayList();
        public int n3 = 1;

        public static byte[] gv(byte b4, DataInputStream dataInputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b4, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte b6 = dataInputStream.readByte();
                bArr[1] = b6;
                byteArrayOutputStream.write(b6);
            }
        }

        @Nullable
        public final r<String> n3(byte[] bArr) throws q {
            v0.y.y(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, fb.w);
            this.y.add(str);
            int i = this.n3;
            if (i == 1) {
                if (!s.a(str)) {
                    return null;
                }
                this.n3 = 2;
                return null;
            }
            if (i != 2) {
                throw new IllegalStateException();
            }
            long jFb = s.fb(str);
            if (jFb != -1) {
                this.zn = jFb;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.zn > 0) {
                this.n3 = 3;
                return null;
            }
            r<String> rVarRz = r.rz(this.y);
            v();
            return rVarRz;
        }

        public final void v() {
            this.y.clear();
            this.n3 = 1;
            this.zn = 0L;
        }

        public final r<String> y(byte[] bArr) {
            v0.y.fb(this.n3 == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.y.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, fb.w) : new String(bArr, 0, bArr.length - 2, fb.w));
            r<String> rVarRz = r.rz(this.y);
            v();
            return rVarRz;
        }

        public r<String> zn(byte b4, DataInputStream dataInputStream) throws IOException {
            r<String> rVarN3 = n3(gv(b4, dataInputStream));
            while (rVarN3 == null) {
                if (this.n3 == 3) {
                    long j = this.zn;
                    if (j <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int iGv = n4.a.gv(j);
                    v0.y.fb(iGv != -1);
                    byte[] bArr = new byte[iGv];
                    dataInputStream.readFully(bArr, 0, iGv);
                    rVarN3 = y(bArr);
                } else {
                    rVarN3 = n3(gv(dataInputStream.readByte(), dataInputStream));
                }
            }
            return rVarN3;
        }
    }

    public final class zn implements ta.n3<a> {
        public zn() {
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void xc(a aVar, long j, long j4) {
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void j5(a aVar, long j, long j4, boolean z) {
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public ta.zn fh(a aVar, long j, long j4, IOException iOException, int i) {
            if (!fb.this.f1818t) {
                fb.this.y.y(iOException);
            }
            return ta.f7548a;
        }
    }

    public fb(gv gvVar) {
        this.y = gvVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f1818t) {
            return;
        }
        try {
            C0055fb c0055fb = this.f1817s;
            if (c0055fb != null) {
                c0055fb.close();
            }
            this.f1819v.t();
            Socket socket = this.f1815f;
            if (socket != null) {
                socket.close();
            }
            this.f1818t = true;
        } catch (Throwable th) {
            this.f1818t = true;
            throw th;
        }
    }

    public void co(List<String> list) {
        v0.y.c5(this.f1817s);
        this.f1817s.t(list);
    }

    public void p(int i, n3 n3Var) {
        this.f1816fb.put(Integer.valueOf(i), n3Var);
    }

    public void w(Socket socket) throws IOException {
        this.f1815f = socket;
        this.f1817s = new C0055fb(socket.getOutputStream());
        this.f1819v.wz(new a(socket.getInputStream()), new zn(), 0);
    }
}
