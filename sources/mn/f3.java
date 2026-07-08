package mn;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6549a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f6550gv;
    public int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f6551v;

    @Nullable
    public final y y;
    public long zn;

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public long f6552gv;
        public final AudioTimestamp n3 = new AudioTimestamp();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f6553v;
        public final AudioTrack y;
        public long zn;

        public y(AudioTrack audioTrack) {
            this.y = audioTrack;
        }

        public long n3() {
            return this.n3.nanoTime / 1000;
        }

        public long y() {
            return this.f6553v;
        }

        public boolean zn() {
            boolean timestamp = this.y.getTimestamp(this.n3);
            if (timestamp) {
                long j = this.n3.framePosition;
                if (this.f6552gv > j) {
                    this.zn++;
                }
                this.f6552gv = j;
                this.f6553v = j + (this.zn << 32);
            }
            return timestamp;
        }
    }

    public f3(AudioTrack audioTrack) {
        if (ut.y >= 19) {
            this.y = new y(audioTrack);
            fb();
        } else {
            this.y = null;
            s(3);
        }
    }

    public void a() {
        s(4);
    }

    public void fb() {
        if (this.y != null) {
            s(0);
        }
    }

    public boolean gv() {
        return this.n3 == 2;
    }

    @TargetApi(ConnectionResult.SERVICE_MISSING_PERMISSION)
    public long n3() {
        y yVar = this.y;
        if (yVar != null) {
            return yVar.y();
        }
        return -1L;
    }

    public final void s(int i) {
        this.n3 = i;
        if (i == 0) {
            this.f6551v = 0L;
            this.f6549a = -1L;
            this.zn = System.nanoTime() / 1000;
            this.f6550gv = 10000L;
            return;
        }
        if (i == 1) {
            this.f6550gv = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f6550gv = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f6550gv = 500000L;
        }
    }

    @TargetApi(ConnectionResult.SERVICE_MISSING_PERMISSION)
    public boolean v(long j) {
        y yVar = this.y;
        if (yVar == null || j - this.f6551v < this.f6550gv) {
            return false;
        }
        this.f6551v = j;
        boolean zZn = yVar.zn();
        int i = this.n3;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zZn) {
                        fb();
                    }
                } else if (!zZn) {
                    fb();
                }
            } else if (!zZn) {
                fb();
            } else if (this.y.y() > this.f6549a) {
                s(2);
            }
        } else if (zZn) {
            if (this.y.n3() < this.zn) {
                return false;
            }
            this.f6549a = this.y.y();
            s(1);
        } else if (j - this.zn > 500000) {
            s(3);
        }
        return zZn;
    }

    public void y() {
        if (this.n3 == 4) {
            fb();
        }
    }

    @TargetApi(ConnectionResult.SERVICE_MISSING_PERMISSION)
    public long zn() {
        y yVar = this.y;
        if (yVar != null) {
            return yVar.n3();
        }
        return -9223372036854775807L;
    }
}
