package v0;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import r0.ta;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static long f8770gv = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static String f8771v = "time.android.com";
    public static boolean zn;
    public static final Object y = new Object();
    public static final Object n3 = new Object();

    public interface n3 {
        void n3(IOException iOException);

        void y();
    }

    public static String c5() {
        String str;
        synchronized (n3) {
            str = f8771v;
        }
        return str;
    }

    public static boolean f() {
        boolean z;
        synchronized (n3) {
            z = zn;
        }
        return z;
    }

    public static void fb(byte b4, byte b6, int i, long j) throws IOException {
        if (b4 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b6 != 4 && b6 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b6));
        }
        if (i != 0 && i <= 15) {
            if (j == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i);
        }
    }

    public static void i9(@Nullable r0.ta taVar, @Nullable n3 n3Var) {
        if (f()) {
            if (n3Var != null) {
                n3Var.y();
            }
        } else {
            if (taVar == null) {
                taVar = new r0.ta("SntpClient");
            }
            taVar.wz(new gv(), new zn(n3Var), 1);
        }
    }

    public static long s() {
        long j;
        synchronized (n3) {
            try {
                j = zn ? f8770gv : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public static long t() throws IOException {
        InetAddress byName = InetAddress.getByName(c5());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            xc(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b4 = bArr[0];
            int i = bArr[1] & 255;
            long jWz = wz(bArr, 24);
            long jWz2 = wz(bArr, 32);
            long jWz3 = wz(bArr, 40);
            fb((byte) ((b4 >> 6) & 3), (byte) (b4 & 7), i, jWz3);
            long j4 = (j + (((jWz2 - jWz) + (jWz3 - j)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j4;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long tl(byte[] bArr, int i) {
        int i5 = bArr[i];
        int i8 = bArr[i + 1];
        int i10 = bArr[i + 2];
        int i11 = bArr[i + 3];
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i8 & 128) == 128) {
            i8 = (i8 & 127) + 128;
        }
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        return (((long) i5) << 24) + (((long) i8) << 16) + (((long) i10) << 8) + ((long) i11);
    }

    public static long wz(byte[] bArr, int i) {
        long jTl = tl(bArr, i);
        long jTl2 = tl(bArr, i + 4);
        if (jTl == 0 && jTl2 == 0) {
            return 0L;
        }
        return ((jTl - 2208988800L) * 1000) + ((jTl2 * 1000) / 4294967296L);
    }

    public static void xc(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j4 = j / 1000;
        long j7 = j - (j4 * 1000);
        bArr[i] = (byte) (r2 >> 24);
        bArr[i + 1] = (byte) (r2 >> 16);
        bArr[i + 2] = (byte) (r2 >> 8);
        bArr[i + 3] = (byte) (j4 + 2208988800L);
        long j8 = (j7 * 4294967296L) / 1000;
        bArr[i + 4] = (byte) (j8 >> 24);
        bArr[i + 5] = (byte) (j8 >> 16);
        bArr[i + 6] = (byte) (j8 >> 8);
        bArr[i + 7] = (byte) (Math.random() * 255.0d);
    }

    public static final class gv implements ta.v {
        public gv() {
        }

        @Override // r0.ta.v
        public void i9() throws IOException {
            synchronized (x.y) {
                synchronized (x.n3) {
                    if (x.zn) {
                        return;
                    }
                    long jT = x.t();
                    synchronized (x.n3) {
                        long unused = x.f8770gv = jT;
                        boolean unused2 = x.zn = true;
                    }
                }
            }
        }

        @Override // r0.ta.v
        public void f() {
        }
    }

    public static final class zn implements ta.n3<ta.v> {

        @Nullable
        public final n3 y;

        public zn(@Nullable n3 n3Var) {
            this.y = n3Var;
        }

        @Override // r0.ta.n3
        public ta.zn fh(ta.v vVar, long j, long j4, IOException iOException, int i) {
            n3 n3Var = this.y;
            if (n3Var != null) {
                n3Var.n3(iOException);
            }
            return r0.ta.f7548a;
        }

        @Override // r0.ta.n3
        public void xc(ta.v vVar, long j, long j4) {
            if (this.y != null) {
                if (x.f()) {
                    this.y.y();
                } else {
                    this.y.n3(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // r0.ta.n3
        public void j5(ta.v vVar, long j, long j4, boolean z) {
        }
    }
}
