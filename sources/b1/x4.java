package b1;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import ft.g;
import java.util.Collections;
import java.util.List;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1284a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final int f1285c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final y f1286f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f1287fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f1288gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final long f1289i9;
    public final int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final Metadata f1291t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f1292v;
    public final int y;
    public final int zn;

    public static class y {
        public final long[] n3;
        public final long[] y;

        public y(long[] jArr, long[] jArr2) {
            this.y = jArr;
            this.n3 = jArr2;
        }
    }

    public x4(byte[] bArr, int i) {
        v0.ta taVar = new v0.ta(bArr);
        taVar.w(i * 8);
        this.y = taVar.s(16);
        this.n3 = taVar.s(16);
        this.zn = taVar.s(24);
        this.f1288gv = taVar.s(24);
        int iS = taVar.s(20);
        this.f1292v = iS;
        this.f1284a = i9(iS);
        this.f1287fb = taVar.s(3) + 1;
        int iS2 = taVar.s(5) + 1;
        this.f1290s = iS2;
        this.f1285c5 = v(iS2);
        this.f1289i9 = taVar.i9(36);
        this.f1286f = null;
        this.f1291t = null;
    }

    public static int i9(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int v(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public long a() {
        long j = this.f1289i9;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f1292v);
    }

    public long c5(long j) {
        return ut.mt((j * ((long) this.f1292v)) / 1000000, 0L, this.f1289i9 - 1);
    }

    public g fb(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = -128;
        int i = this.f1288gv;
        if (i <= 0) {
            i = -1;
        }
        return new g.n3().o4("audio/flac").f7(i).a8(this.f1287fb).rs(this.f1292v).ut(Collections.singletonList(bArr)).en(s(metadata)).z6();
    }

    public long gv() {
        long j;
        long j4;
        int i = this.f1288gv;
        if (i > 0) {
            j = (((long) i) + ((long) this.zn)) / 2;
            j4 = 1;
        } else {
            int i5 = this.y;
            j = ((((i5 != this.n3 || i5 <= 0) ? 4096L : i5) * ((long) this.f1287fb)) * ((long) this.f1290s)) / 8;
            j4 = 64;
        }
        return j + j4;
    }

    public x4 n3(@Nullable y yVar) {
        return new x4(this.y, this.n3, this.zn, this.f1288gv, this.f1292v, this.f1287fb, this.f1290s, this.f1289i9, yVar, this.f1291t);
    }

    @Nullable
    public Metadata s(@Nullable Metadata metadata) {
        Metadata metadata2 = this.f1291t;
        return metadata2 == null ? metadata : metadata2.n3(metadata);
    }

    public x4 y(List<PictureFrame> list) {
        return new x4(this.y, this.n3, this.zn, this.f1288gv, this.f1292v, this.f1287fb, this.f1290s, this.f1289i9, this.f1286f, s(new Metadata(list)));
    }

    public x4 zn(List<String> list) {
        return new x4(this.y, this.n3, this.zn, this.f1288gv, this.f1292v, this.f1287fb, this.f1290s, this.f1289i9, this.f1286f, s(ej.zn(list)));
    }

    public x4(int i, int i5, int i8, int i10, int i11, int i12, int i13, long j, @Nullable y yVar, @Nullable Metadata metadata) {
        this.y = i;
        this.n3 = i5;
        this.zn = i8;
        this.f1288gv = i10;
        this.f1292v = i11;
        this.f1284a = i9(i11);
        this.f1287fb = i12;
        this.f1290s = i13;
        this.f1285c5 = v(i13);
        this.f1289i9 = j;
        this.f1286f = yVar;
        this.f1291t = metadata;
    }
}
