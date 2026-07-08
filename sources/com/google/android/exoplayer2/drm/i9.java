package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public interface i9 {

    public static final class gv {
        public final String n3;
        public final byte[] y;

        public gv(byte[] bArr, String str) {
            this.y = bArr;
            this.n3 = str;
        }

        public String n3() {
            return this.n3;
        }

        public byte[] y() {
            return this.y;
        }
    }

    public interface n3 {
        void y(i9 i9Var, @Nullable byte[] bArr, int i, int i5, @Nullable byte[] bArr2);
    }

    public static final class y {
        public final String n3;
        public final byte[] y;
        public final int zn;

        public y(byte[] bArr, String str, int i) {
            this.y = bArr;
            this.n3 = str;
            this.zn = i;
        }

        public String n3() {
            return this.n3;
        }

        public byte[] y() {
            return this.y;
        }
    }

    public interface zn {
        i9 acquireExoMediaDrm(UUID uuid);
    }

    void a(@Nullable n3 n3Var);

    di.n3 c5(byte[] bArr) throws MediaCryptoException;

    void f(byte[] bArr);

    void fb(byte[] bArr) throws DeniedByServerException;

    void gv(byte[] bArr, byte[] bArr2);

    boolean i9(byte[] bArr, String str);

    gv n3();

    void release();

    int s();

    @Nullable
    byte[] t(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    y tl(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) throws NotProvisionedException;

    void v(byte[] bArr, gn gnVar);

    Map<String, String> y(byte[] bArr);

    byte[] zn() throws MediaDrmException;
}
