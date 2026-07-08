package mn;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class yt {
    public static final String[] y = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] n3 = {44100, 48000, 32000};
    public static final int[] zn = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final int[] f6700gv = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f6701v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f6698a = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final int[] f6699fb = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6702a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f6703fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f6704gv;

        @Nullable
        public String n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f6705v;
        public int y;
        public int zn;

        public boolean y(int i) {
            int i5;
            int i8;
            int i10;
            int i11;
            if (!yt.t(i) || (i5 = (i >>> 19) & 3) == 1 || (i8 = (i >>> 17) & 3) == 0 || (i10 = (i >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.y = i5;
            this.n3 = yt.y[3 - i8];
            int i12 = yt.n3[i11];
            this.f6704gv = i12;
            if (i5 == 2) {
                this.f6704gv = i12 / 2;
            } else if (i5 == 0) {
                this.f6704gv = i12 / 4;
            }
            int i13 = (i >>> 9) & 1;
            this.f6703fb = yt.f(i5, i8);
            if (i8 == 3) {
                int i14 = i5 == 3 ? yt.zn[i10 - 1] : yt.f6700gv[i10 - 1];
                this.f6702a = i14;
                this.zn = (((i14 * 12) / this.f6704gv) + i13) * 4;
            } else {
                if (i5 == 3) {
                    int i15 = i8 == 2 ? yt.f6701v[i10 - 1] : yt.f6698a[i10 - 1];
                    this.f6702a = i15;
                    this.zn = ((i15 * 144) / this.f6704gv) + i13;
                } else {
                    int i16 = yt.f6699fb[i10 - 1];
                    this.f6702a = i16;
                    this.zn = (((i8 == 1 ? 72 : 144) * i16) / this.f6704gv) + i13;
                }
            }
            this.f6705v = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int f(int i, int i5) {
        if (i5 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i5 == 2) {
            return 1152;
        }
        if (i5 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static int i9(int i) {
        int i5;
        int i8;
        int i10;
        int i11;
        if (!t(i) || (i5 = (i >>> 19) & 3) == 1 || (i8 = (i >>> 17) & 3) == 0 || (i10 = (i >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = n3[i11];
        if (i5 == 2) {
            i12 /= 2;
        } else if (i5 == 0) {
            i12 /= 4;
        }
        int i13 = (i >>> 9) & 1;
        if (i8 == 3) {
            return ((((i5 == 3 ? zn[i10 - 1] : f6700gv[i10 - 1]) * 12) / i12) + i13) * 4;
        }
        int i14 = i5 == 3 ? i8 == 2 ? f6701v[i10 - 1] : f6698a[i10 - 1] : f6699fb[i10 - 1];
        if (i5 == 3) {
            return ((i14 * 144) / i12) + i13;
        }
        return (((i8 == 1 ? 72 : 144) * i14) / i12) + i13;
    }

    public static boolean t(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static int tl(int i) {
        int i5;
        int i8;
        if (!t(i) || (i5 = (i >>> 19) & 3) == 1 || (i8 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i10 = (i >>> 12) & 15;
        int i11 = (i >>> 10) & 3;
        if (i10 == 0 || i10 == 15 || i11 == 3) {
            return -1;
        }
        return f(i5, i8);
    }
}
