package e0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import b0.n3;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v0.r;
import v0.ta;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f3228a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Bitmap f3229fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final C0080n3 f3230gv;
    public final Paint n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y f3231v;
    public final Paint y;
    public final Canvas zn;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f3227s = {0, 7, 8, 15};

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final byte[] f3225c5 = {0, 119, -120, -1};

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final byte[] f3226i9 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3232a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final int f3233c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<fb> f3234f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f3235fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f3236gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final int f3237i9;
        public final boolean n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f3238s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f3239v;
        public final int y;
        public final int zn;

        public a(int i, boolean z, int i5, int i8, int i10, int i11, int i12, int i13, int i14, int i15, SparseArray<fb> sparseArray) {
            this.y = i;
            this.n3 = z;
            this.zn = i5;
            this.f3236gv = i8;
            this.f3239v = i10;
            this.f3232a = i11;
            this.f3235fb = i12;
            this.f3238s = i13;
            this.f3233c5 = i14;
            this.f3237i9 = i15;
            this.f3234f = sparseArray;
        }

        public void y(a aVar) {
            SparseArray<fb> sparseArray = aVar.f3234f;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f3234f.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    public static final class fb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3240a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f3241gv;
        public final int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f3242v;
        public final int y;
        public final int zn;

        public fb(int i, int i5, int i8, int i10, int i11, int i12) {
            this.y = i;
            this.n3 = i5;
            this.zn = i8;
            this.f3241gv = i10;
            this.f3242v = i11;
            this.f3240a = i12;
        }
    }

    public static final class gv {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final SparseArray<v> f3243gv;
        public final int n3;
        public final int y;
        public final int zn;

        public gv(int i, int i5, int i8, SparseArray<v> sparseArray) {
            this.y = i;
            this.n3 = i5;
            this.zn = i8;
            this.f3243gv = sparseArray;
        }
    }

    /* JADX INFO: renamed from: e0.n3$n3, reason: collision with other inner class name */
    public static final class C0080n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3244a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f3245gv;
        public final int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f3246v;
        public final int y;
        public final int zn;

        public C0080n3(int i, int i5, int i8, int i10, int i11, int i12) {
            this.y = i;
            this.n3 = i5;
            this.zn = i8;
            this.f3245gv = i10;
            this.f3246v = i11;
            this.f3244a = i12;
        }
    }

    public static final class s {

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @Nullable
        public gv f3248c5;
        public final int n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public C0080n3 f3251s;
        public final int y;
        public final SparseArray<a> zn = new SparseArray<>();

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final SparseArray<y> f3250gv = new SparseArray<>();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final SparseArray<zn> f3252v = new SparseArray<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<y> f3247a = new SparseArray<>();

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final SparseArray<zn> f3249fb = new SparseArray<>();

        public s(int i, int i5) {
            this.y = i;
            this.n3 = i5;
        }

        public void y() {
            this.zn.clear();
            this.f3250gv.clear();
            this.f3252v.clear();
            this.f3247a.clear();
            this.f3249fb.clear();
            this.f3251s = null;
            this.f3248c5 = null;
        }
    }

    public static final class v {
        public final int n3;
        public final int y;

        public v(int i, int i5) {
            this.y = i;
            this.n3 = i5;
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int[] f3253gv;
        public final int[] n3;
        public final int y;
        public final int[] zn;

        public y(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.y = i;
            this.n3 = iArr;
            this.zn = iArr2;
            this.f3253gv = iArr3;
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final byte[] f3254gv;
        public final boolean n3;
        public final int y;
        public final byte[] zn;

        public zn(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.y = i;
            this.n3 = z;
            this.zn = bArr;
            this.f3254gv = bArr2;
        }
    }

    public n3(int i, int i5) {
        Paint paint = new Paint();
        this.y = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.n3 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zn = new Canvas();
        this.f3230gv = new C0080n3(719, 575, 0, 719, 0, 575);
        this.f3231v = new y(0, zn(), gv(), v());
        this.f3228a = new s(i, i5);
    }

    public static int a(int i, int i5, int i8, int i10) {
        return (i << 24) | (i5 << 16) | (i8 << 8) | i10;
    }

    public static int c5(ta taVar, int[] iArr, @Nullable byte[] bArr, int i, int i5, @Nullable Paint paint, Canvas canvas) {
        boolean z;
        int iS;
        int i8 = i;
        boolean z5 = false;
        while (true) {
            int iS2 = taVar.s(8);
            if (iS2 != 0) {
                z = z5;
                iS = 1;
            } else if (taVar.fb()) {
                z = z5;
                iS = taVar.s(7);
                iS2 = taVar.s(8);
            } else {
                int iS3 = taVar.s(7);
                if (iS3 != 0) {
                    z = z5;
                    iS = iS3;
                    iS2 = 0;
                } else {
                    iS2 = 0;
                    z = true;
                    iS = 0;
                }
            }
            if (iS != 0 && paint != null) {
                if (bArr != null) {
                    iS2 = bArr[iS2];
                }
                paint.setColor(iArr[iS2]);
                canvas.drawRect(i8, i5, i8 + iS, i5 + 1, paint);
            }
            i8 += iS;
            if (z) {
                return i8;
            }
            z5 = z;
        }
    }

    public static void f(zn znVar, y yVar, int i, int i5, int i8, @Nullable Paint paint, Canvas canvas) {
        int[] iArr = i == 3 ? yVar.f3253gv : i == 2 ? yVar.zn : yVar.n3;
        i9(znVar.zn, iArr, i, i5, i8, paint, canvas);
        i9(znVar.f3254gv, iArr, i, i5, i8 + 1, paint, canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[LOOP:0: B:3:0x0009->B:33:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int fb(v0.ta r13, int[] r14, @androidx.annotation.Nullable byte[] r15, int r16, int r17, @androidx.annotation.Nullable android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 2
            int r4 = r13.s(r3)
            r5 = 1
            if (r4 == 0) goto L14
            r11 = r2
        L12:
            r12 = 1
            goto L61
        L14:
            boolean r4 = r13.fb()
            r6 = 3
            if (r4 == 0) goto L28
            int r4 = r13.s(r6)
            int r4 = r4 + r6
            int r3 = r13.s(r3)
        L24:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L61
        L28:
            boolean r4 = r13.fb()
            if (r4 == 0) goto L31
            r11 = r2
            r4 = 0
            goto L12
        L31:
            int r4 = r13.s(r3)
            if (r4 == 0) goto L5e
            if (r4 == r5) goto L5a
            if (r4 == r3) goto L4e
            if (r4 == r6) goto L41
            r11 = r2
            r4 = 0
        L3f:
            r12 = 0
            goto L61
        L41:
            r4 = 8
            int r4 = r13.s(r4)
            int r4 = r4 + 29
            int r3 = r13.s(r3)
            goto L24
        L4e:
            r4 = 4
            int r4 = r13.s(r4)
            int r4 = r4 + 12
            int r3 = r13.s(r3)
            goto L24
        L5a:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L61
        L5e:
            r4 = 0
            r11 = 1
            goto L3f
        L61:
            if (r12 == 0) goto L7f
            if (r8 == 0) goto L7f
            if (r15 == 0) goto L69
            r4 = r15[r4]
        L69:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L7f:
            int r10 = r10 + r12
            if (r11 == 0) goto L83
            return r10
        L83:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.n3.fb(v0.ta, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static int[] gv() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = a(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = a(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static void i9(byte[] bArr, int[] iArr, int i, int i5, int i8, @Nullable Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        ta taVar = new ta(bArr);
        int iFb = i5;
        int i10 = i8;
        byte[] bArrY = null;
        byte[] bArrY2 = null;
        byte[] bArrY3 = null;
        while (taVar.n3() != 0) {
            int iS = taVar.s(8);
            if (iS != 240) {
                switch (iS) {
                    case 16:
                        if (i == 3) {
                            bArr3 = bArrY == null ? f3225c5 : bArrY;
                        } else if (i != 2) {
                            bArr2 = null;
                            iFb = fb(taVar, iArr, bArr2, iFb, i10, paint, canvas);
                            taVar.zn();
                        } else {
                            bArr3 = bArrY3 == null ? f3227s : bArrY3;
                        }
                        bArr2 = bArr3;
                        iFb = fb(taVar, iArr, bArr2, iFb, i10, paint, canvas);
                        taVar.zn();
                        break;
                    case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                        iFb = s(taVar, iArr, i == 3 ? bArrY2 == null ? f3226i9 : bArrY2 : null, iFb, i10, paint, canvas);
                        taVar.zn();
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        iFb = c5(taVar, iArr, null, iFb, i10, paint, canvas);
                        break;
                    default:
                        switch (iS) {
                            case 32:
                                bArrY3 = y(4, 4, taVar);
                                break;
                            case 33:
                                bArrY = y(4, 8, taVar);
                                break;
                            case 34:
                                bArrY2 = y(16, 8, taVar);
                                break;
                        }
                        break;
                }
            } else {
                i10 += 2;
                iFb = i5;
            }
        }
    }

    public static void p(ta taVar, s sVar) {
        a aVar;
        int iS = taVar.s(8);
        int iS2 = taVar.s(16);
        int iS3 = taVar.s(16);
        int iGv = taVar.gv() + iS3;
        if (iS3 * 8 > taVar.n3()) {
            r.c5("DvbParser", "Data field length exceeds limit");
            taVar.mt(taVar.n3());
            return;
        }
        switch (iS) {
            case 16:
                if (iS2 == sVar.y) {
                    gv gvVar = sVar.f3248c5;
                    gv gvVarXc = xc(taVar, iS3);
                    if (gvVarXc.zn != 0) {
                        sVar.f3248c5 = gvVarXc;
                        sVar.zn.clear();
                        sVar.f3250gv.clear();
                        sVar.f3252v.clear();
                    } else if (gvVar != null && gvVar.n3 != gvVarXc.n3) {
                        sVar.f3248c5 = gvVarXc;
                    }
                }
                break;
            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                gv gvVar2 = sVar.f3248c5;
                if (iS2 == sVar.y && gvVar2 != null) {
                    a aVarW = w(taVar, iS3);
                    if (gvVar2.zn == 0 && (aVar = sVar.zn.get(aVarW.y)) != null) {
                        aVarW.y(aVar);
                    }
                    sVar.zn.put(aVarW.y, aVarW);
                }
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                if (iS2 == sVar.y) {
                    y yVarT = t(taVar, iS3);
                    sVar.f3250gv.put(yVarT.y, yVarT);
                } else if (iS2 == sVar.n3) {
                    y yVarT2 = t(taVar, iS3);
                    sVar.f3247a.put(yVarT2.y, yVarT2);
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (iS2 == sVar.y) {
                    zn znVarWz = wz(taVar);
                    sVar.f3252v.put(znVarWz.y, znVarWz);
                } else if (iS2 == sVar.n3) {
                    zn znVarWz2 = wz(taVar);
                    sVar.f3249fb.put(znVarWz2.y, znVarWz2);
                }
                break;
            case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                if (iS2 == sVar.y) {
                    sVar.f3251s = tl(taVar);
                }
                break;
        }
        taVar.co(iGv - taVar.gv());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[LOOP:0: B:3:0x0009->B:36:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int s(v0.ta r13, int[] r14, @androidx.annotation.Nullable byte[] r15, int r16, int r17, @androidx.annotation.Nullable android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 4
            int r4 = r13.s(r3)
            r5 = 1
            if (r4 == 0) goto L15
            r11 = r2
        L12:
            r12 = 1
            goto L6e
        L15:
            boolean r4 = r13.fb()
            r6 = 3
            if (r4 != 0) goto L2c
            int r3 = r13.s(r6)
            if (r3 == 0) goto L28
            int r3 = r3 + 2
            r11 = r2
            r12 = r3
            r4 = 0
            goto L6e
        L28:
            r4 = 0
            r11 = 1
        L2a:
            r12 = 0
            goto L6e
        L2c:
            boolean r4 = r13.fb()
            r7 = 2
            if (r4 != 0) goto L40
            int r4 = r13.s(r7)
            int r4 = r4 + r3
            int r3 = r13.s(r3)
        L3c:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L6e
        L40:
            int r4 = r13.s(r7)
            if (r4 == 0) goto L6b
            if (r4 == r5) goto L67
            if (r4 == r7) goto L5c
            if (r4 == r6) goto L4f
            r11 = r2
            r4 = 0
            goto L2a
        L4f:
            r4 = 8
            int r4 = r13.s(r4)
            int r4 = r4 + 25
            int r3 = r13.s(r3)
            goto L3c
        L5c:
            int r4 = r13.s(r3)
            int r4 = r4 + 9
            int r3 = r13.s(r3)
            goto L3c
        L67:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L6e
        L6b:
            r11 = r2
            r4 = 0
            goto L12
        L6e:
            if (r12 == 0) goto L8c
            if (r8 == 0) goto L8c
            if (r15 == 0) goto L76
            r4 = r15[r4]
        L76:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L8c:
            int r10 = r10 + r12
            if (r11 == 0) goto L90
            return r10
        L90:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.n3.s(v0.ta, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static y t(ta taVar, int i) {
        int iS;
        int i5;
        int iS2;
        int iS3;
        int iS4;
        int i8 = 8;
        int iS5 = taVar.s(8);
        taVar.mt(8);
        int i10 = 2;
        int i11 = i - 2;
        int[] iArrZn = zn();
        int[] iArrGv = gv();
        int[] iArrV = v();
        while (i11 > 0) {
            int iS6 = taVar.s(i8);
            int iS7 = taVar.s(i8);
            int[] iArr = (iS7 & 128) != 0 ? iArrZn : (iS7 & 64) != 0 ? iArrGv : iArrV;
            if ((iS7 & 1) != 0) {
                iS3 = taVar.s(i8);
                iS4 = taVar.s(i8);
                iS = taVar.s(i8);
                iS2 = taVar.s(i8);
                i5 = i11 - 6;
            } else {
                int iS8 = taVar.s(6) << i10;
                int iS9 = taVar.s(4) << 4;
                iS = taVar.s(4) << 4;
                i5 = i11 - 4;
                iS2 = taVar.s(i10) << 6;
                iS3 = iS8;
                iS4 = iS9;
            }
            if (iS3 == 0) {
                iS4 = 0;
                iS = 0;
                iS2 = 255;
            }
            double d4 = iS3;
            double d5 = iS4 - 128;
            double d6 = iS - 128;
            iArr[iS6] = a((byte) (255 - (iS2 & 255)), ut.p((int) (d4 + (1.402d * d5)), 0, 255), ut.p((int) ((d4 - (0.34414d * d6)) - (d5 * 0.71414d)), 0, 255), ut.p((int) (d4 + (d6 * 1.772d)), 0, 255));
            i11 = i5;
            iS5 = iS5;
            i8 = 8;
            i10 = 2;
        }
        return new y(iS5, iArrZn, iArrGv, iArrV);
    }

    public static C0080n3 tl(ta taVar) {
        int i;
        int iS;
        int i5;
        int i8;
        taVar.mt(4);
        boolean zFb = taVar.fb();
        taVar.mt(3);
        int iS2 = taVar.s(16);
        int iS3 = taVar.s(16);
        if (zFb) {
            int iS4 = taVar.s(16);
            int iS5 = taVar.s(16);
            int iS6 = taVar.s(16);
            iS = taVar.s(16);
            i = iS5;
            i8 = iS6;
            i5 = iS4;
        } else {
            i = iS2;
            iS = iS3;
            i5 = 0;
            i8 = 0;
        }
        return new C0080n3(iS2, iS3, i5, i, i8, iS);
    }

    public static int[] v() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = a(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i5 = i & 136;
                if (i5 == 0) {
                    iArr[i] = a(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i5 == 8) {
                    iArr[i] = a(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i5 == 128) {
                    iArr[i] = a(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i5 == 136) {
                    iArr[i] = a(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static a w(ta taVar, int i) {
        int iS;
        int iS2;
        int iS3 = taVar.s(8);
        taVar.mt(4);
        boolean zFb = taVar.fb();
        taVar.mt(3);
        int i5 = 16;
        int iS4 = taVar.s(16);
        int iS5 = taVar.s(16);
        int iS6 = taVar.s(3);
        int iS7 = taVar.s(3);
        int i8 = 2;
        taVar.mt(2);
        int iS8 = taVar.s(8);
        int iS9 = taVar.s(8);
        int iS10 = taVar.s(4);
        int iS11 = taVar.s(2);
        taVar.mt(2);
        int i10 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i10 > 0) {
            int iS12 = taVar.s(i5);
            int iS13 = taVar.s(i8);
            int iS14 = taVar.s(i8);
            int iS15 = taVar.s(12);
            int i11 = iS11;
            taVar.mt(4);
            int iS16 = taVar.s(12);
            int i12 = i10 - 6;
            if (iS13 == 1 || iS13 == 2) {
                i10 -= 8;
                iS2 = taVar.s(8);
                iS = taVar.s(8);
            } else {
                i10 = i12;
                iS2 = 0;
                iS = 0;
            }
            sparseArray.put(iS12, new fb(iS13, iS14, iS15, iS16, iS2, iS));
            iS11 = i11;
            i8 = 2;
            i5 = 16;
        }
        return new a(iS3, zFb, iS4, iS5, iS6, iS7, iS8, iS9, iS10, iS11, sparseArray);
    }

    public static zn wz(ta taVar) {
        byte[] bArr;
        int iS = taVar.s(16);
        taVar.mt(4);
        int iS2 = taVar.s(2);
        boolean zFb = taVar.fb();
        taVar.mt(1);
        byte[] bArr2 = ut.f8757a;
        if (iS2 != 1) {
            if (iS2 == 0) {
                int iS3 = taVar.s(16);
                int iS4 = taVar.s(16);
                if (iS3 > 0) {
                    bArr2 = new byte[iS3];
                    taVar.f(bArr2, 0, iS3);
                }
                if (iS4 > 0) {
                    bArr = new byte[iS4];
                    taVar.f(bArr, 0, iS4);
                }
            }
            return new zn(iS, zFb, bArr2, bArr);
        }
        taVar.mt(taVar.s(8) * 16);
        bArr = bArr2;
        return new zn(iS, zFb, bArr2, bArr);
    }

    public static gv xc(ta taVar, int i) {
        int iS = taVar.s(8);
        int iS2 = taVar.s(4);
        int iS3 = taVar.s(2);
        taVar.mt(2);
        int i5 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i5 > 0) {
            int iS4 = taVar.s(8);
            taVar.mt(8);
            i5 -= 6;
            sparseArray.put(iS4, new v(taVar.s(16), taVar.s(16)));
        }
        return new gv(iS, iS2, iS3, sparseArray);
    }

    public static byte[] y(int i, int i5, ta taVar) {
        byte[] bArr = new byte[i];
        for (int i8 = 0; i8 < i; i8++) {
            bArr[i8] = (byte) taVar.s(i5);
        }
        return bArr;
    }

    public static int[] zn() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public void mt() {
        this.f3228a.y();
    }

    public List<b0.n3> n3(byte[] bArr, int i) {
        int i5;
        SparseArray<fb> sparseArray;
        ta taVar = new ta(bArr, i);
        while (taVar.n3() >= 48 && taVar.s(8) == 15) {
            p(taVar, this.f3228a);
        }
        s sVar = this.f3228a;
        gv gvVar = sVar.f3248c5;
        if (gvVar == null) {
            return Collections.emptyList();
        }
        C0080n3 c0080n3 = sVar.f3251s;
        if (c0080n3 == null) {
            c0080n3 = this.f3230gv;
        }
        Bitmap bitmap = this.f3229fb;
        if (bitmap == null || c0080n3.y + 1 != bitmap.getWidth() || c0080n3.n3 + 1 != this.f3229fb.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0080n3.y + 1, c0080n3.n3 + 1, Bitmap.Config.ARGB_8888);
            this.f3229fb = bitmapCreateBitmap;
            this.zn.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<v> sparseArray2 = gvVar.f3243gv;
        for (int i8 = 0; i8 < sparseArray2.size(); i8++) {
            this.zn.save();
            v vVarValueAt = sparseArray2.valueAt(i8);
            a aVar = this.f3228a.zn.get(sparseArray2.keyAt(i8));
            int i10 = vVarValueAt.y + c0080n3.zn;
            int i11 = vVarValueAt.n3 + c0080n3.f3246v;
            this.zn.clipRect(i10, i11, Math.min(aVar.zn + i10, c0080n3.f3245gv), Math.min(aVar.f3236gv + i11, c0080n3.f3244a));
            y yVar = this.f3228a.f3250gv.get(aVar.f3235fb);
            if (yVar == null && (yVar = this.f3228a.f3247a.get(aVar.f3235fb)) == null) {
                yVar = this.f3231v;
            }
            SparseArray<fb> sparseArray3 = aVar.f3234f;
            int i12 = 0;
            while (i12 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i12);
                fb fbVarValueAt = sparseArray3.valueAt(i12);
                zn znVar = this.f3228a.f3252v.get(iKeyAt);
                zn znVar2 = znVar == null ? this.f3228a.f3249fb.get(iKeyAt) : znVar;
                if (znVar2 != null) {
                    i5 = i12;
                    sparseArray = sparseArray3;
                    f(znVar2, yVar, aVar.f3232a, fbVarValueAt.zn + i10, i11 + fbVarValueAt.f3241gv, znVar2.n3 ? null : this.y, this.zn);
                } else {
                    i5 = i12;
                    sparseArray = sparseArray3;
                }
                i12 = i5 + 1;
                sparseArray3 = sparseArray;
            }
            if (aVar.n3) {
                int i13 = aVar.f3232a;
                this.n3.setColor(i13 == 3 ? yVar.f3253gv[aVar.f3238s] : i13 == 2 ? yVar.zn[aVar.f3233c5] : yVar.n3[aVar.f3237i9]);
                this.zn.drawRect(i10, i11, aVar.zn + i10, aVar.f3236gv + i11, this.n3);
            }
            arrayList.add(new n3.C0034n3().a(Bitmap.createBitmap(this.f3229fb, i10, i11, aVar.zn, aVar.f3236gv)).f(i10 / c0080n3.y).t(0).s(i11 / c0080n3.n3, 0).c5(0).wz(aVar.zn / c0080n3.y).fb(aVar.f3236gv / c0080n3.n3).y());
            this.zn.drawColor(0, PorterDuff.Mode.CLEAR);
            this.zn.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }
}
