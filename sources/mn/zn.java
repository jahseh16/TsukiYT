package mn;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import ft.g;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static final int[] y = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f6707gv;
        public final int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f6708v;
        public final int y;
        public final int zn;

        public n3(int i, int i5, int i8, int i10, int i11) {
            this.y = i;
            this.zn = i5;
            this.n3 = i8;
            this.f6707gv = i10;
            this.f6708v = i11;
        }
    }

    public static int a(v0.ta taVar, int i) {
        int i5 = 0;
        while (true) {
            int iS = i5 + taVar.s(i);
            if (!taVar.fb()) {
                return iS;
            }
            i5 = (iS + 1) << i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static mn.zn.n3 gv(v0.ta r11) {
        /*
            r0 = 16
            int r1 = r11.s(r0)
            int r0 = r11.s(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.s(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.s(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = a(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.s(r1)
            boolean r4 = r11.fb()
            if (r4 == 0) goto L45
            int r4 = r11.s(r2)
            if (r4 <= 0) goto L45
            r11.mt(r0)
        L45:
            boolean r4 = r11.fb()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L55
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L58
        L55:
            r9 = 44100(0xac44, float:6.1797E-41)
        L58:
            int r11 = r11.s(r3)
            if (r9 != r6) goto L67
            r4 = 13
            if (r11 != r4) goto L67
            int[] r0 = mn.zn.y
            r11 = r0[r11]
            goto L95
        L67:
            if (r9 != r7) goto L94
            int[] r4 = mn.zn.y
            int r6 = r4.length
            if (r11 >= r6) goto L94
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L8f
            r7 = 11
            if (r1 == r0) goto L8a
            if (r1 == r2) goto L8f
            if (r1 == r3) goto L80
            goto L88
        L80:
            if (r11 == r2) goto L86
            if (r11 == r6) goto L86
            if (r11 != r7) goto L88
        L86:
            int r4 = r4 + 1
        L88:
            r11 = r4
            goto L95
        L8a:
            if (r11 == r6) goto L86
            if (r11 != r7) goto L88
            goto L86
        L8f:
            if (r11 == r2) goto L86
            if (r11 != r6) goto L88
            goto L86
        L94:
            r11 = 0
        L95:
            mn.zn$n3 r0 = new mn.zn$n3
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.zn.gv(v0.ta):mn.zn$n3");
    }

    public static g n3(v0.d dVar, String str, String str2, @Nullable DrmInitData drmInitData) {
        dVar.ut(1);
        return new g.n3().oz(str).o4("audio/ac4").a8(2).rs(((dVar.ej() & 32) >> 5) == 1 ? 48000 : 44100).vl(drmInitData).k(str2).z6();
    }

    public static int v(byte[] bArr, int i) {
        int i5 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i8 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i8 == 65535) {
            i8 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i5 = 4;
        }
        if (i == 44097) {
            i5 += 2;
        }
        return i8 + i5;
    }

    public static void y(int i, v0.d dVar) {
        dVar.j5(7);
        byte[] bArrV = dVar.v();
        bArrV[0] = -84;
        bArrV[1] = 64;
        bArrV[2] = -1;
        bArrV[3] = -1;
        bArrV[4] = (byte) ((i >> 16) & 255);
        bArrV[5] = (byte) ((i >> 8) & 255);
        bArrV[6] = (byte) (i & 255);
    }

    public static int zn(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return gv(new v0.ta(bArr)).f6708v;
    }
}
