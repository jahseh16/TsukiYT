package ao;

import android.util.Pair;
import b1.fh;
import b1.rz;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements fb {
    public final long[] n3;
    public final long[] y;
    public final long zn;

    public zn(long[] jArr, long[] jArr2, long j) {
        this.y = jArr;
        this.n3 = jArr2;
        this.zn = j == -9223372036854775807L ? ut.xb(jArr2[jArr2.length - 1]) : j;
    }

    public static zn y(long j, MlltFrame mlltFrame, long j4) {
        int length = mlltFrame.f1622f.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j7 = 0;
        jArr2[0] = 0;
        for (int i5 = 1; i5 <= length; i5++) {
            int i8 = i5 - 1;
            j += (long) (mlltFrame.f1623fb + mlltFrame.f1622f[i8]);
            j7 += (long) (mlltFrame.f1624s + mlltFrame.f1625t[i8]);
            jArr[i5] = j;
            jArr2[i5] = j7;
        }
        return new zn(jArr, jArr2, j4);
    }

    public static Pair<Long, Long> zn(long j, long[] jArr, long[] jArr2) {
        int iC5 = ut.c5(jArr, j, true, true);
        long j4 = jArr[iC5];
        long j7 = jArr2[iC5];
        int i = iC5 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j4), Long.valueOf(j7));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j4 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j - j4) / (r6 - j4)) * (jArr2[i] - j7))) + j7));
    }

    @Override // ao.fb
    public long a() {
        return -1L;
    }

    @Override // b1.fh
    public long c5() {
        return this.zn;
    }

    @Override // ao.fb
    public long n3(long j) {
        return ut.xb(((Long) zn(j, this.y, this.n3).second).longValue());
    }

    @Override // b1.fh
    public boolean s() {
        return true;
    }

    @Override // b1.fh
    public fh.y v(long j) {
        Pair<Long, Long> pairZn = zn(ut.gf(ut.mt(j, 0L, this.zn)), this.n3, this.y);
        return new fh.y(new rz(ut.xb(((Long) pairZn.first).longValue()), ((Long) pairZn.second).longValue()));
    }
}
