package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.i9;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import v0.d;
import v0.r;
import v0.ut;
import v5.d0;
import v5.i4;
import v5.ta;
import xq.co;
import xq.w;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public final class f implements i9 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final i9.zn f1517gv = new i9.zn() { // from class: v5.f3
        @Override // com.google.android.exoplayer2.drm.i9.zn
        public final com.google.android.exoplayer2.drm.i9 acquireExoMediaDrm(UUID uuid) {
            return com.google.android.exoplayer2.drm.f.d0(uuid);
        }
    };
    public final MediaDrm n3;
    public final UUID y;
    public int zn;

    public static class y {
        public static void n3(MediaDrm mediaDrm, byte[] bArr, gn gnVar) {
            LogSessionId logSessionIdY = gnVar.y();
            if (logSessionIdY.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            d0.y(v0.y.v(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdY);
        }

        public static boolean y(MediaDrm mediaDrm, String str) {
            return co.y(mediaDrm, str);
        }
    }

    public f(UUID uuid) throws UnsupportedSchemeException {
        v0.y.v(uuid);
        v0.y.n3(!ft.c5.n3.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.y = uuid;
        MediaDrm mediaDrm = new MediaDrm(r(uuid));
        this.n3 = mediaDrm;
        this.zn = 1;
        if (ft.c5.f4651gv.equals(uuid) && fh()) {
            i4(mediaDrm);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] co(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = ft.c5.f4652v
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = tn.t.v(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = w(r4)
            byte[] r4 = tn.t.y(r0, r4)
        L18:
            int r1 = v0.ut.y
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = ft.c5.f4651gv
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = v0.ut.zn
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            java.lang.String r0 = v0.ut.f8761gv
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = tn.t.v(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.f.co(java.util.UUID, byte[]):byte[]");
    }

    public static /* synthetic */ i9 d0(UUID uuid) {
        try {
            return rz(uuid);
        } catch (ta unused) {
            r.zn("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new s();
        }
    }

    public static boolean fh() {
        return "ASUS_Z00AD".equals(ut.f8761gv);
    }

    public static void i4(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static byte[] mt(UUID uuid, byte[] bArr) {
        return ft.c5.zn.equals(uuid) ? v5.y.y(bArr) : bArr;
    }

    public static DrmInitData.SchemeData n(UUID uuid, List<DrmInitData.SchemeData> list) {
        if (!ft.c5.f4651gv.equals(uuid)) {
            return list.get(0);
        }
        if (ut.y >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int length = 0;
            for (int i = 0; i < list.size(); i++) {
                DrmInitData.SchemeData schemeData2 = list.get(i);
                byte[] bArr = (byte[]) v0.y.v(schemeData2.f1513f);
                if (ut.zn(schemeData2.f1515s, schemeData.f1515s) && ut.zn(schemeData2.f1514fb, schemeData.f1514fb) && tn.t.zn(bArr)) {
                    length += bArr.length;
                }
            }
            byte[] bArr2 = new byte[length];
            int i5 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                byte[] bArr3 = (byte[]) v0.y.v(list.get(i8).f1513f);
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i5, length2);
                i5 += length2;
            }
            return schemeData.n3(bArr2);
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            DrmInitData.SchemeData schemeData3 = list.get(i10);
            int iFb = tn.t.fb((byte[]) v0.y.v(schemeData3.f1513f));
            int i11 = ut.y;
            if (i11 < 23 && iFb == 0) {
                return schemeData3;
            }
            if (i11 >= 23 && iFb == 1) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    public static String p(String str) {
        return "<LA_URL>https://x</LA_URL>".equals(str) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : (ut.y == 33 && "https://default.url".equals(str)) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : str;
    }

    public static UUID r(UUID uuid) {
        return (ut.y >= 27 || !ft.c5.zn.equals(uuid)) ? uuid : ft.c5.n3;
    }

    public static f rz(UUID uuid) throws ta {
        try {
            return new f(uuid);
        } catch (UnsupportedSchemeException e4) {
            throw new ta(1, e4);
        } catch (Exception e5) {
            throw new ta(2, e5);
        }
    }

    public static byte[] w(byte[] bArr) {
        d dVar = new d(bArr);
        int iR = dVar.r();
        short sI4 = dVar.i4();
        short sI42 = dVar.i4();
        if (sI4 != 1 || sI42 != 1) {
            r.a("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sI43 = dVar.i4();
        Charset charset = g4.v.f5205v;
        String strD = dVar.d(sI43, charset);
        if (strD.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strD.indexOf("</DATA>");
        if (iIndexOf == -1) {
            r.c5("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strD.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strD.substring(iIndexOf);
        int i = iR + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(sI4);
        byteBufferAllocate.putShort(sI42);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    public static String z(UUID uuid, String str) {
        return (ut.y < 26 && ft.c5.zn.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public void a(@Nullable final i9.n3 n3Var) {
        this.n3.setOnEventListener(n3Var == null ? null : new MediaDrm.OnEventListener() { // from class: v5.n
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i5, byte[] bArr2) {
                this.y.c(n3Var, mediaDrm, bArr, i, i5, bArr2);
            }
        });
    }

    public final /* synthetic */ void c(i9.n3 n3Var, MediaDrm mediaDrm, byte[] bArr, int i, int i5, byte[] bArr2) {
        n3Var.y(this, bArr, i, i5, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public void f(byte[] bArr) {
        this.n3.closeSession(bArr);
    }

    public String f3(String str) {
        return this.n3.getPropertyString(str);
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public void fb(byte[] bArr) throws DeniedByServerException {
        this.n3.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public void gv(byte[] bArr, byte[] bArr2) {
        this.n3.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public boolean i9(byte[] bArr, String str) {
        if (ut.y >= 31) {
            return y.y(this.n3, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.y, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public i9.gv n3() {
        MediaDrm.ProvisionRequest provisionRequest = this.n3.getProvisionRequest();
        return new i9.gv(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public synchronized void release() {
        int i = this.zn - 1;
        this.zn = i;
        if (i == 0) {
            this.n3.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public int s() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.i9
    @Nullable
    public byte[] t(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (ft.c5.zn.equals(this.y)) {
            bArr2 = v5.y.n3(bArr2);
        }
        return this.n3.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.i9
    @SuppressLint({"WrongConstant"})
    public i9.y tl(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeDataN;
        byte[] bArrCo;
        String strZ;
        if (list != null) {
            schemeDataN = n(this.y, list);
            bArrCo = co(this.y, (byte[]) v0.y.v(schemeDataN.f1513f));
            strZ = z(this.y, schemeDataN.f1515s);
        } else {
            schemeDataN = null;
            bArrCo = null;
            strZ = null;
        }
        MediaDrm.KeyRequest keyRequest = this.n3.getKeyRequest(bArr, bArrCo, strZ, i, map);
        byte[] bArrMt = mt(this.y, keyRequest.getData());
        String strP = p(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strP) && schemeDataN != null && !TextUtils.isEmpty(schemeDataN.f1514fb)) {
            strP = schemeDataN.f1514fb;
        }
        return new i9.y(bArrMt, strP, ut.y >= 23 ? w.y(keyRequest) : Integer.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public void v(byte[] bArr, gn gnVar) {
        if (ut.y >= 31) {
            try {
                y.n3(this.n3, bArr, gnVar);
            } catch (UnsupportedOperationException unused) {
                r.c5("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.i9
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public i4 c5(byte[] bArr) throws MediaCryptoException {
        return new i4(r(this.y), bArr, ut.y < 21 && ft.c5.f4651gv.equals(this.y) && "L3".equals(f3("securityLevel")));
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public Map<String, String> y(byte[] bArr) {
        return this.n3.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public byte[] zn() throws MediaDrmException {
        return this.n3.openSession();
    }
}
