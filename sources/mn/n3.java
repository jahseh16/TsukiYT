package mn;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.drm.DrmInitData;
import ft.g;
import java.nio.ByteBuffer;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public static final int[] y = {1, 2, 3, 6};
    public static final int[] n3 = {48000, 44100, 32000};
    public static final int[] zn = {24000, 22050, 16000};

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final int[] f6641gv = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f6642v = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, NotificationCompat.FLAG_GROUP_SUMMARY, 576, 640};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f6640a = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: mn.n3$n3, reason: collision with other inner class name */
    public static final class C0131n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6643a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f6644fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f6645gv;
        public final int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f6646v;

        @Nullable
        public final String y;
        public final int zn;

        public C0131n3(@Nullable String str, int i, int i5, int i8, int i10, int i11, int i12) {
            this.y = str;
            this.n3 = i;
            this.f6645gv = i5;
            this.zn = i8;
            this.f6646v = i10;
            this.f6643a = i11;
            this.f6644fb = i12;
        }
    }

    public static C0131n3 a(v0.ta taVar) {
        String str;
        int i;
        int i5;
        int i8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iV = taVar.v();
        taVar.mt(40);
        boolean z = taVar.s(5) > 10;
        taVar.w(iV);
        int i19 = -1;
        if (z) {
            taVar.mt(16);
            int iS = taVar.s(2);
            if (iS == 0) {
                i19 = 0;
            } else if (iS == 1) {
                i19 = 1;
            } else if (iS == 2) {
                i19 = 2;
            }
            taVar.mt(3);
            int iS2 = (taVar.s(11) + 1) * 2;
            int iS3 = taVar.s(2);
            if (iS3 == 3) {
                i14 = zn[taVar.s(2)];
                i13 = 3;
                i15 = 6;
            } else {
                int iS4 = taVar.s(2);
                int i20 = y[iS4];
                i13 = iS4;
                i14 = n3[iS3];
                i15 = i20;
            }
            int i21 = i15 * NotificationCompat.FLAG_LOCAL_ONLY;
            int iY = y(iS2, i14, i15);
            int iS5 = taVar.s(3);
            boolean zFb = taVar.fb();
            int i22 = f6641gv[iS5] + (zFb ? 1 : 0);
            taVar.mt(10);
            if (taVar.fb()) {
                taVar.mt(8);
            }
            if (iS5 == 0) {
                taVar.mt(5);
                if (taVar.fb()) {
                    taVar.mt(8);
                }
            }
            if (i19 == 1 && taVar.fb()) {
                taVar.mt(16);
            }
            if (taVar.fb()) {
                if (iS5 > 2) {
                    taVar.mt(2);
                }
                if ((iS5 & 1) == 0 || iS5 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    taVar.mt(6);
                }
                if ((iS5 & 4) != 0) {
                    taVar.mt(i17);
                }
                if (zFb && taVar.fb()) {
                    taVar.mt(5);
                }
                if (i19 == 0) {
                    if (taVar.fb()) {
                        i18 = 6;
                        taVar.mt(6);
                    } else {
                        i18 = 6;
                    }
                    if (iS5 == 0 && taVar.fb()) {
                        taVar.mt(i18);
                    }
                    if (taVar.fb()) {
                        taVar.mt(i18);
                    }
                    int iS6 = taVar.s(2);
                    if (iS6 == 1) {
                        taVar.mt(5);
                    } else if (iS6 == 2) {
                        taVar.mt(12);
                    } else if (iS6 == 3) {
                        int iS7 = taVar.s(5);
                        if (taVar.fb()) {
                            taVar.mt(5);
                            if (taVar.fb()) {
                                taVar.mt(4);
                            }
                            if (taVar.fb()) {
                                taVar.mt(4);
                            }
                            if (taVar.fb()) {
                                taVar.mt(4);
                            }
                            if (taVar.fb()) {
                                taVar.mt(4);
                            }
                            if (taVar.fb()) {
                                taVar.mt(4);
                            }
                            if (taVar.fb()) {
                                taVar.mt(4);
                            }
                            if (taVar.fb()) {
                                taVar.mt(4);
                            }
                            if (taVar.fb()) {
                                if (taVar.fb()) {
                                    taVar.mt(4);
                                }
                                if (taVar.fb()) {
                                    taVar.mt(4);
                                }
                            }
                        }
                        if (taVar.fb()) {
                            taVar.mt(5);
                            if (taVar.fb()) {
                                taVar.mt(7);
                                if (taVar.fb()) {
                                    taVar.mt(8);
                                }
                            }
                        }
                        taVar.mt((iS7 + 2) * 8);
                        taVar.zn();
                    }
                    if (iS5 < 2) {
                        if (taVar.fb()) {
                            taVar.mt(14);
                        }
                        if (iS5 == 0 && taVar.fb()) {
                            taVar.mt(14);
                        }
                    }
                    if (taVar.fb()) {
                        if (i13 == 0) {
                            taVar.mt(5);
                        } else {
                            for (int i23 = 0; i23 < i15; i23++) {
                                if (taVar.fb()) {
                                    taVar.mt(5);
                                }
                            }
                        }
                    }
                }
            }
            if (taVar.fb()) {
                taVar.mt(5);
                if (iS5 == 2) {
                    taVar.mt(4);
                }
                if (iS5 >= 6) {
                    taVar.mt(2);
                }
                if (taVar.fb()) {
                    taVar.mt(8);
                }
                if (iS5 == 0 && taVar.fb()) {
                    taVar.mt(8);
                }
                if (iS3 < 3) {
                    taVar.p();
                }
            }
            if (i19 == 0 && i13 != 3) {
                taVar.p();
            }
            if (i19 == 2 && (i13 == 3 || taVar.fb())) {
                i16 = 6;
                taVar.mt(6);
            } else {
                i16 = 6;
            }
            str = (taVar.fb() && taVar.s(i16) == 1 && taVar.s(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i19;
            i12 = i21;
            i5 = iS2;
            i8 = i14;
            i = iY;
            i10 = i22;
        } else {
            taVar.mt(32);
            int iS8 = taVar.s(2);
            String str2 = iS8 == 3 ? null : "audio/ac3";
            int iS9 = taVar.s(6);
            int i24 = f6642v[iS9 / 2] * 1000;
            int iZn = zn(iS8, iS9);
            taVar.mt(8);
            int iS10 = taVar.s(3);
            if ((iS10 & 1) != 0 && iS10 != 1) {
                taVar.mt(2);
            }
            if ((iS10 & 4) != 0) {
                taVar.mt(2);
            }
            if (iS10 == 2) {
                taVar.mt(2);
            }
            int[] iArr = n3;
            str = str2;
            i = i24;
            i5 = iZn;
            i8 = iS8 < iArr.length ? iArr[iS8] : -1;
            i10 = f6641gv[iS10] + (taVar.fb() ? 1 : 0);
            i11 = -1;
            i12 = 1536;
        }
        return new C0131n3(str, i11, i10, i8, i5, i12, i);
    }

    public static int c5(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int fb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b4 = bArr[4];
        return zn((b4 & 192) >> 6, b4 & 63);
    }

    public static g gv(v0.d dVar, String str, String str2, @Nullable DrmInitData drmInitData) {
        v0.ta taVar = new v0.ta();
        taVar.tl(dVar);
        int i = n3[taVar.s(2)];
        taVar.mt(8);
        int i5 = f6641gv[taVar.s(3)];
        if (taVar.s(1) != 0) {
            i5++;
        }
        int i8 = f6642v[taVar.s(5)] * 1000;
        taVar.zn();
        dVar.oz(taVar.gv());
        return new g.n3().oz(str).o4("audio/ac3").a8(i5).rs(i).vl(drmInitData).k(str2).ud(i8).u(i8).z6();
    }

    public static int i9(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b4 = bArr[7];
            if ((b4 & 254) == 186) {
                return 40 << ((bArr[(b4 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int n3(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((ut.ud(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ft.g s(v0.d r7, java.lang.String r8, java.lang.String r9, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r10) {
        /*
            v0.ta r0 = new v0.ta
            r0.<init>()
            r0.tl(r7)
            r1 = 13
            int r1 = r0.s(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.mt(r2)
            r3 = 2
            int r3 = r0.s(r3)
            int[] r4 = mn.n3.n3
            r3 = r4[r3]
            r4 = 10
            r0.mt(r4)
            int[] r4 = mn.n3.f6641gv
            int r5 = r0.s(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.s(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.mt(r2)
            r2 = 4
            int r2 = r0.s(r2)
            r0.mt(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.co(r2)
            int r2 = r0.s(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.mt(r5)
        L4f:
            int r2 = r0.n3()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.mt(r6)
            int r2 = r0.s(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.zn()
            int r0 = r0.gv()
            r7.oz(r0)
            ft.g$n3 r7 = new ft.g$n3
            r7.<init>()
            ft.g$n3 r7 = r7.oz(r8)
            ft.g$n3 r7 = r7.o4(r2)
            ft.g$n3 r7 = r7.a8(r4)
            ft.g$n3 r7 = r7.rs(r3)
            ft.g$n3 r7 = r7.vl(r10)
            ft.g$n3 r7 = r7.k(r9)
            ft.g$n3 r7 = r7.u(r1)
            ft.g r7 = r7.z6()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.n3.s(v0.d, java.lang.String, java.lang.String, com.google.android.exoplayer2.drm.DrmInitData):ft.g");
    }

    public static int v(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return y[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return 1536;
    }

    public static int y(int i, int i5, int i8) {
        return (i * i5) / (i8 * 32);
    }

    public static int zn(int i, int i5) {
        int i8 = i5 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = n3;
        if (i >= iArr.length || i5 < 0) {
            return -1;
        }
        int[] iArr2 = f6640a;
        if (i8 >= iArr2.length) {
            return -1;
        }
        int i10 = iArr[i];
        if (i10 == 44100) {
            return (iArr2[i8] + (i5 % 2)) * 2;
        }
        int i11 = f6642v[i8];
        return i10 == 32000 ? i11 * 6 : i11 * 4;
    }
}
