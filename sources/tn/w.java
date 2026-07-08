package tn;

import androidx.annotation.Nullable;
import b1.ta;
import v0.r;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f8305gv;

    @Nullable
    public final String n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final byte[] f8306v;
    public final boolean y;
    public final ta.y zn;

    public w(boolean z, @Nullable String str, int i, byte[] bArr, int i5, int i8, @Nullable byte[] bArr2) {
        v0.y.y((bArr2 == null) ^ (i == 0));
        this.y = z;
        this.n3 = str;
        this.f8305gv = i;
        this.f8306v = bArr2;
        this.zn = new ta.y(y(str), bArr, i5, i8);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int y(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        byte b4 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b4 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b4 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b4 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b4 = 3;
                }
                break;
        }
        switch (b4) {
            case 0:
            case 1:
                return 2;
            default:
                r.c5("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
