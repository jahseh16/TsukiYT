package di;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3205a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f3206c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f3207fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public int[] f3208gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public final n3 f3209i9;

    @Nullable
    public byte[] n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3210s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public int[] f3211v;

    @Nullable
    public byte[] y;
    public int zn;

    public static final class n3 {
        public final MediaCodec.CryptoInfo.Pattern n3;
        public final MediaCodec.CryptoInfo y;

        public final void n3(int i, int i5) {
            vh.y.y(this.n3, i, i5);
            vh.n3.y(this.y, this.n3);
        }

        public n3(MediaCodec.CryptoInfo cryptoInfo) {
            this.y = cryptoInfo;
            this.n3 = vh.zn.y(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zn() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f3206c5 = cryptoInfo;
        this.f3209i9 = ut.y >= 24 ? new n3(cryptoInfo) : null;
    }

    public void n3(int i) {
        if (i == 0) {
            return;
        }
        if (this.f3208gv == null) {
            int[] iArr = new int[1];
            this.f3208gv = iArr;
            this.f3206c5.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f3208gv;
        iArr2[0] = iArr2[0] + i;
    }

    public MediaCodec.CryptoInfo y() {
        return this.f3206c5;
    }

    public void zn(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i5, int i8, int i10) {
        this.f3205a = i;
        this.f3208gv = iArr;
        this.f3211v = iArr2;
        this.n3 = bArr;
        this.y = bArr2;
        this.zn = i5;
        this.f3207fb = i8;
        this.f3210s = i10;
        MediaCodec.CryptoInfo cryptoInfo = this.f3206c5;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i5;
        if (ut.y >= 24) {
            ((n3) v0.y.v(this.f3209i9)).n3(i8, i10);
        }
    }
}
